package com.designpattern.singleton_design_pattern;

public enum SingletonUsingEnumAndCustomBuilder {

    INSTANCE; // The single instance

    // Add any fields or methods you need
    private String name;
    private int age;

    // Private constructor (optional)
    private SingletonUsingEnumAndCustomBuilder() {
        // Initialize fields or perform other setup
    }

    // Public methods (optional)
    public void print() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // You can also have a builder class (optional)
    public static class SingletonBuilder {
        private final String name;
        private int age;

        private SingletonBuilder(String name) {
            this.name = name;
        }

        public SingletonBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public SingletonUsingEnumAndCustomBuilder build() {
            SingletonUsingEnumAndCustomBuilder.INSTANCE.name = name;
            SingletonUsingEnumAndCustomBuilder.INSTANCE.age = age;
            return SingletonUsingEnumAndCustomBuilder.INSTANCE;
        }
    }

    // Example usage:
    public static void main(String[] args) {
        SingletonUsingEnumAndCustomBuilder singleton = new SingletonBuilder("Spring Boot JPA")
                .withAge(30)
                .build();

        singleton.print();
    }


}
