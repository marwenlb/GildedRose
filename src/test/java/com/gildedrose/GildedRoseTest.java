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


    

}
