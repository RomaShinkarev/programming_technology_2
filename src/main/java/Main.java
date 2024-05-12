package com.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> readNumbersFromFile(String filename) throws IOException {
        List<Integer> numbers = new ArrayList<>();

        File file = new File(filename);
        
        if (!file.exists() || !file.isFile()) {
            throw new IOException("File does not exist");
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");

                for (String part : parts) {
                    if (!part.trim().isEmpty()) {
                        try {
                            numbers.add(Integer.parseInt(part.trim()));
                        }

                        catch (NumberFormatException e) {
                            System.out.println("Incorrect number form: " + part);
                        }
                    }
                }
            }
        }

        catch (IOException e) {
            throw e;
        }
        
        return numbers;
    }

    public static int sum(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int mult(List<Integer> numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }

    public static int max(List<Integer> numbers) {
        int maximum = numbers.get(0);
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }

    public static int min(List<Integer> numbers) {
        int minimum = numbers.get(0);
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java NumOperations <function> <file with numbers>");
            System.exit(1);
        }

        String operation = args[0];
        String filename = args[1];

        try {
            List<Integer> numbers = readNumbersFromFile(filename);

            if (numbers.size() > 0) {
                switch (operation) {
                    case "sum":
                        System.out.println("Sum: " + sum(numbers));
                        break;
                    case "mult":
                        System.out.println("Product: " + mult(numbers));
                        break;
                    case "max":
                        System.out.println("Max: " + max(numbers));
                        break;
                    case "min":
                        System.out.println("Min: " + min(numbers));
                        break;
                    default:
                        System.out.println("Unknown operation: " + operation);
                        System.out.println("Available functions: sum, mult, max, min");
                        System.exit(1);
                }
            }

            else {
                System.out.println("There are no numbers in the file");
            }
        }

        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }
    }
}
