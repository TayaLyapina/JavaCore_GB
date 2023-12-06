package ru.geekbrains.core.hw5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    /**
     * Функция, создающая резервную копию всех файлов в директории во вновь созданную папку ./backup
     */
    public static void main(String[] args) {
        try {
            backupDirectory("C:/Users/user/Desktop/GB/JavaCore/hw_java5",
                    "C:/Users/user/Desktop/backup");
        } catch (IOException e) {
            System.err.printf("Произошла ошибка при создании резервной копии: %s\n", e.getMessage());
        }
    }

    /**
     * Метод, осуществляющий копирование указанной папки
     * @param sourceDirPath путь к исходной директории, которую необходимо скопировать
     * @param backupDirPath путь к директории, куда необходимо скопировать данные
     * @throws IOException проверка что исходная директория существует и является директорией
     */
    public static void backupDirectory(String sourceDirPath, String backupDirPath) throws IOException {
        File sourceDir = new File(sourceDirPath);
        File backupDir = new File(backupDirPath);

        if (!sourceDir.exists() || !sourceDir.isDirectory()) {
            throw new IOException("Исходная директория не существует или не является директорией");
        }

        if (!backupDir.exists()) {
            Files.createDirectory(Paths.get(backupDirPath));
            System.out.printf("Папка резервной копии создана: %s\n", backupDirPath);
        }

        File[] files = sourceDir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    backupDirectory(file.getAbsolutePath(), backupDirPath + File.separator + file.getName());
                } else {
                    Path sourceFilePath = file.toPath();
                    Path destFilePath = new File(backupDir, file.getName()).toPath();
                    Files.copy(sourceFilePath, destFilePath, StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }

        System.out.printf("Резервная копия файлов из %s в %s завершена\n", sourceDirPath, backupDirPath);
    }
}