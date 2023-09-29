package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

  @Test
  @DisplayName("Test that the name is unchanged")
  void testName() {
    Item element = new Item("FIXME", 0, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals("FIXME", element.name, "the name changed");
  }
  
      @Test
      @DisplayName("Test the updateQuality method for a normal item")
    public void testUpdateQualityNormalItem() {
    Item element = new Item("Normal item", 9, 15);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(14, element.quality);
        assertEquals(8, element.sellIn);
    }
          @Test
      @DisplayName("Test the updateQuality method for a Sulfuras item")
    public void testUpdateQualitySulfuras() {
    Item element = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(80, element.quality);
        assertEquals(0, element.sellIn);
    }
    @DisplayName("Test the updateQuality method for Backstage Passes with 15 days left")
    @Test
    public void testBackstagePassesUpdateQuality15Days() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(14, element.sellIn);
        assertEquals(21, element.quality);
    }
    
        @DisplayName("Test the updateQuality method for Backstage Passes with 10 days left")
        @Test
    public void testBackstagePassesUpdateQuality10Days() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(9, element.sellIn);
        assertEquals(50, element.quality);
    }
    
        @DisplayName("Test the updateQuality method for Conjured Mana Cake")
        @Test
    public void testConjuredItemUpdateQuality() {
        Item element = new Item("Conjured Mana Cake", 3, 5) ;
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(2, element.sellIn);
        assertEquals(4, element.quality);
    }
    
        @DisplayName("Test the updateQuality method for Backstage Passes with 5 days left")
        @Test
    public void testBackstagePassesUpdateQuality5Days() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49) ;
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(4, element.sellIn);
        assertEquals(50, element.quality);
    }

    
}
