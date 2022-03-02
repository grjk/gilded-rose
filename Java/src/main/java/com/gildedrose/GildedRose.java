package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert") && items[i].quality > 0) {
                        if (items[i].name.contains("Conjured")) {
                            items[i].quality = items[i].quality - 2;
                        }
                        else if (items[i].name.contains("Sulfuras")) {
                            items[i].quality = 80;
                        }
                        else if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                            items[i].quality--;
                        }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality++;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality < 50) {
                            if (items[i].sellIn < 11) {
                                items[i].quality++;
                            }
                            if (items[i].sellIn < 6) {
                                items[i].quality++;
                            }
                        }
                        else if (items[i].sellIn == 0) {
                            items[i].quality = 0;
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn--;
            }
            else {
                items[i].sellIn = 0;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality--;
                            }
                        }
                    } else {
                        items[i].quality = 0;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality++;
                    }
                }
            }
        }
    }
}