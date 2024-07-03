package org.example;
import java.util.ArrayList;
import java.util.List;

// Базов клас Pet
class Pet {
    private String name;
    private int age;
    private Address address;
    private String owner;
    private List<String> diseases;
    private String veterinarian;

    // Конструктор с параметри
    public Pet(String name, int age, Address address, String owner, String veterinarian) {
        setName(name);
        setAge(age);
        setAddress(address);
        setOwner(owner);
        this.diseases = new ArrayList<>(); // Инициализиране на списъка с болести
        setVeterinarian(veterinarian);
    }

    // Getter за name
    public String getName() {
        return name;
    }

    // Setter за name с валидация
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "Unknown"; // Стойност по подразбиране
        } else {
            this.name = name;
        }
    }

    // Getter за age
    public int getAge() {
        return age;
    }

    // Setter за age с валидация
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0; // Стойност по подразбиране
        } else {
            this.age = age;
        }
    }

    // Getter за address
    public Address getAddress() {
        return address;
    }

    // Setter за address с валидация
    public void setAddress(Address address) {
        if (address == null) {
            this.address = new Address("Unknown", "Unknown", "Unknown", "Unknown", "Unknown"); // Адрес по подразбиране
        } else {
            this.address = address;
        }
    }

    // Getter за owner
    public String getOwner() {
        return owner;
    }

    // Setter за owner с валидация
    public void setOwner(String owner) {
        if (owner == null || owner.isEmpty()) {
            this.owner = "Unknown"; // Стойност по подразбиране
        } else {
            this.owner = owner;
        }
    }

    // Getter за diseases
    public List<String> getDiseases() {
        return diseases;
    }

    // Добавяне на болест към списъка
    public void addDisease(String disease) {
        if (disease == null || disease.isEmpty()) {
            diseases.add("Unknown Disease"); // Стойност по подразбиране
        } else {
            diseases.add(disease);
        }
    }

    // Getter за veterinarian
    public String getVeterinarian() {
        return veterinarian;
    }

    // Setter за veterinarian с валидация
    public void setVeterinarian(String veterinarian) {
        if (veterinarian == null || veterinarian.isEmpty()) {
            this.veterinarian = "Unknown"; // Стойност по подразбиране
        } else {
            this.veterinarian = veterinarian;
        }
    }

    // Вътрешен клас за Address
    static class Address {
        private String country;
        private String region;
        private String city;
        private String street;
        private String number;

        // Конструктор с параметри
        public Address(String country, String region, String city, String street, String number) {
            setCountry(country);
            setRegion(region);
            setCity(city);
            setStreet(street);
            setNumber(number);
        }

        // Getter за country
        public String getCountry() {
            return country;
        }

        // Setter за country с валидация
        public void setCountry(String country) {
            if (country == null || country.isEmpty()) {
                this.country = "Unknown"; // Стойност по подразбиране
            } else {
                this.country = country;
            }
        }

        // Getter за region
        public String getRegion() {
            return region;
        }

        // Setter за region с валидация
        public void setRegion(String region) {
            if (region == null || region.isEmpty()) {
                this.region = "Unknown"; // Стойност по подразбиране
            } else {
                this.region = region;
            }
        }

        // Getter за city
        public String getCity() {
            return city;
        }

        // Setter за city с валидация
        public void setCity(String city) {
            if (city == null || city.isEmpty()) {
                this.city = "Unknown"; // Стойност по подразбиране
            } else {
                this.city = city;
            }
        }

        // Getter за street
        public String getStreet() {
            return street;
        }

        // Setter за street с валидация
        public void setStreet(String street) {
            if (street == null || street.isEmpty()) {
                this.street = "Unknown"; // Стойност по подразбиране
            } else {
                this.street = street;
            }
        }

        // Getter за number
        public String getNumber() {
            return number;
        }

        // Setter за number с валидация
        public void setNumber(String number) {
            if (number == null || number.isEmpty()) {
                this.number = "Unknown"; // Стойност по подразбиране
            } else {
                this.number = number;
            }
        }

        // Преобразуване на адреса в низ
        @Override
        public String toString() {
            return String.format("%s, %s, %s, %s %s", country, region, city, street, number);
        }
    }
}

// Клас Dog, който наследява Pet
class Dog extends Pet {
    private String breed;

    // Конструктор с параметри
    public Dog(String name, int age, Address address, String owner, String veterinarian, String breed) {
        super(name, age, address, owner, veterinarian);
        setBreed(breed);
    }

    // Getter за breed
    public String getBreed() {
        return breed;
    }

    // Setter за breed с валидация
    public void setBreed(String breed) {
        if (breed == null || breed.isEmpty()) {
            this.breed = "Unknown Breed"; // Стойност по подразбиране
        } else {
            this.breed = breed;
        }
    }

    // Метод за лаене
    public void bark() {
        System.out.println(getName() + " says: Woof!");
    }
}

// Клас Parrot, който наследява Pet
class Parrot extends Pet {
    private String color;

    // Конструктор с параметри
    public Parrot(String name, int age, Address address, String owner, String veterinarian, String color) {
        super(name, age, address, owner, veterinarian);
        setColor(color);
    }

    // Getter за color
    public String getColor() {
        return color;
    }

    // Setter за color с валидация
    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "Unknown Color"; // Стойност по подразбиране
        } else {
            this.color = color;
        }
    }

    // Метод за говорене
    public void speak() {
        System.out.println(getName() + " says: Hello!");
    }
}

// Тестов клас с метод main
public class PetTest {
    public static void main(String[] args) {
        // Създаване на адрес
        Pet.Address dogAddress = new Pet.Address("Bulgaria", "Sofia", "Sofia", "Vitosha Blvd", "10");
        Pet.Address parrotAddress = new Pet.Address("Bulgaria", "Sofia", "Sofia", "Dondukov Bulvd", "5");

        // Създаване на куче
        Dog myDog = new Dog("Buddy", 3, dogAddress, "Ivan Petrov", "Dr. Dimitrov", "Golden Retriever");
        myDog.addDisease("Arthritis");

        // Създаване на папагал
        Parrot myParrot = new Parrot("Polly", 2, parrotAddress, "Maria Ivanova", "Dr. Stoyanov", "Green");
        myParrot.addDisease("Feather loss");

        // Принтиране на информация за кучето
        System.out.println("Dog name: " + myDog.getName());
        System.out.println("Dog age: " + myDog.getAge());
        System.out.println("Dog address: " + myDog.getAddress());
        System.out.println("Dog owner: " + myDog.getOwner());
        System.out.println("Dog veterinarian: " + myDog.getVeterinarian());
        System.out.println("Dog breed: " + myDog.getBreed());
        System.out.println("Dog diseases: " + myDog.getDiseases());
        myDog.bark();

        System.out.println("\n");

        // Принтиране на информация за папагала
        System.out.println("Parrot name: " + myParrot.getName());
        System.out.println("Parrot age: " + myParrot.getAge());
        System.out.println("Parrot address: " + myParrot.getAddress());
        System.out.println("Parrot owner: " + myParrot.getOwner());
        System.out.println("Parrot veterinarian: " + myParrot.getVeterinarian());
        System.out.println("Parrot color: " + myParrot.getColor());
        System.out.println("Parrot diseases: " + myParrot.getDiseases());
        myParrot.speak();
    }
}
