package Klassen;

import java.util.Random;

public class Inventar {
    private Item[] items;

    public Inventar() {
        items = new Item[20];
    }


    public Item sucheItem() {
        return null;
    }

    public void ausgeben(){
        System.out.print("[ ");
        for (int i = 0; i < items.length ; i++) {
            System.out.print(items[i].getBezeichnung()+" ,");
        }
        System.out.print(" ]");
    }
    public void fuelleItems() {
        Random random = new Random();
        for (int i = 0; items.length > i; i++) {
            switch (random.nextInt(10)) {
                case 0:
                    items[i] = new Item("Feuerzeug");
                    break;
                case 1:
                    items[i]= new Item("USB-Stick");
                    break;
                case 2:
                    items[i]= new Item("Karte");
                    break;
                case 3:
                    items[i]= new Item("Tastatur");
                    break;
                case 4:
                    items[i]= new Item("Fackel");
                    break;
                case 5:
                    items[i]= new Item("Flinte");
                    break;
                case 6:
                    items[i]= new Item("Munition");
                    break;
                case 7:
                    items[i]= new Item("Kabel");
                    break;
                case 8:
                    items[i]= new Item("Zange");
                    break;
                case 9:
                    items[i]= new Item("Reifen");
                    break;
                case 10:
                    items[i]= new Item("Schluessel");
                    break;
                default:
                    items[i]= new Item("Bandage");
            }
            items[i].setId(i);
            items[i].setPreis(random.nextDouble(100));
        }
    }
}
