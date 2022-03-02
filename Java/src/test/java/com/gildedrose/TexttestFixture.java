package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 10, 45), //
                new Item("Aged Brie", 7, 30), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 5, 70), //
                new Item("Sulfuras, Hand of Ragnaros", 13, 233), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 35),
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 45),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6),
                new Item("Conjured Sword of Nine Realms", 10, 37) };

        GildedRose app = new GildedRose(items);

        int days = 17;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
