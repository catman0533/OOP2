

import java.io.*;

public class FileHandler {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree(); // Ваш класс, который вы хотите сериализовать

        // Сериализация объекта
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("familytree.out"))) {
            objectOutputStream.writeObject(familyTree);
            System.out.println("Объект успешно сериализован и записан в файл.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при сериализации объекта.");
        }

        // Десериализация объекта
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("familytree.out"))) {
            FamilyTree familyTreeRestored = (FamilyTree) objectInputStream.readObject();
            System.out.println("Объект успешно десериализован:");
            System.out.println("familyTreeRestored: " + familyTreeRestored);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Ошибка при десериализации объекта.");
        }
    }     
}    
    
   