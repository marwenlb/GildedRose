package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {
   
      // Teste si le nom de l'élément reste inchangé après la mise à jour

  @Test
  @DisplayName("Test that the name is unchanged")
  void testName() {
    Item element = new Item("FIXME", 0, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals("FIXME", element.name, "the name changed");
  }
  
    // Teste la méthode updateQuality pour un objet normal

      @Test
      @DisplayName("Test the updateQuality method for a normal item")
    public void testUpdateQualityNormalItem() {
    Item element = new Item("Normal item", 9, 15);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(14, element.quality);
        assertEquals(8, element.sellIn);
    }
    
    
    
    
        // Teste la méthode updateQuality pour un objet normal

      @Test
    @DisplayName("Teste la mise à jour de la qualité pour un objet normal (qualité = 0)")
    public void testMiseAJourQualiteObjetNormalQualiteZero() {
    Item element = new Item("Normal item", 1, 15);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(14, element.quality);
        assertEquals(0, element.sellIn);
    }
    
    
    
    
    // Teste la méthode updateQuality pour un objet normal avec une qualité égale à zéro

      @Test
      @DisplayName("Test the updateQuality method for a normal item")
    public void testUpdateQualityNormalItemegale0() {
    Item element = new Item("Normal item", 9, 0);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(0, element.quality);
        assertEquals(8, element.sellIn);
    }
    
    
    
    
        
// Teste la méthode updateQuality pour un objet normal avec une qualité négative
    @Test
    @DisplayName("Teste la mise à jour de la qualité pour un objet normal (qualité négative)")
    public void testMiseAJourQualiteObjetNormalQualiteNegative() {
    Item element = new Item("Normal item", 0, -2);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(-1, element.sellIn);
    }


    // Teste la méthode updateQuality pour un objet normal avec une qualité négative
    @Test
    @DisplayName("Teste la mise à jour de la qualité pour un objet normal (qualité négative)")
    public void testMiseAJourQualiteObjetNormalSellinNegative() {
    Item element = new Item("Normal item", -1, 1);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(0, element.quality);
        assertEquals(-2, element.sellIn);
    }


    // Teste la méthode updateQuality pour un objet normal avec une qualité maximale (50)
    @Test
    @DisplayName("Teste la mise à jour de la qualité pour un objet normal (qualité maximale)")
    public void testMiseAJourQualiteObjetNormalQualiteMaximale() {
    Item element = new Item("Normal item", 3, 50);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(2, element.sellIn);
    }
    
    
    
    
// Teste la méthode updateQuality pour un objet normal avec une qualité négative et sellin egale 0
    @Test
    @DisplayName("Teste la mise à jour de la qualité pour un objet normal (qualité négative et sellin égale zero)")
    public void testMiseAJourQualiteObjetNormalQualiteNegativeAndSellinEgaleZero() {
    Item element = new Item("Normal item", 0, -5);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(-1, element.sellIn);
        assertEquals(-5, element.quality);

    }
    
    
         @Test
      @DisplayName("Test the updateQuality method for a normal item egale 50")
    public void testUpdateQualityNormalItemegale03() {
    Item element = new Item("Aged Brie", -1, 50);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(50, element.quality);
        assertEquals(-2, element.sellIn);
    }
    
    
    
    
      // Teste la méthode updateQuality pour l'objet Sulfuras

          @Test
      @DisplayName("Test the updateQuality method for a Sulfuras item")
    public void testUpdateQualitySulfuras() {
    Item element = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(80, element.quality);
        assertEquals(0, element.sellIn);
    }
    
      // Teste la méthode updateQuality pour les "Backstage passes" avec une qualité négative
    
              @Test
      @DisplayName("Test the updateQuality method for a Backstage passes to a TAFKAL80ETC concert negative quality")
    public void testUpdateQualityBackstagePassesNegativeQuality() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", -1, 20);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(0, element.quality);
        assertEquals(-2, element.sellIn);
    }
    
    
    
        
      // Teste la méthode updateQuality pour les "Backstage passes" with 
    
              @Test
      @DisplayName("Test the updateQuality method for a Backstage passes to a TAFKAL80ETC with sellin =5")
    public void testUpdateQualityBackstagePassesNegativeQuality2222222222222222() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 40);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(43, element.quality);
        assertEquals(4, element.sellIn);
    }
    
    
      // Teste la méthode updateQuality pour Sulfuras avec une qualité négative

                  @Test
      @DisplayName("Test the updateQuality method for a Sulfuras, Hand of Ragnaros negative quality")
    public void testUpdateQualitySulfurasNegativeQuality() {
    Item element = new Item("Sulfuras, Hand of Ragnaros", 11, -5);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(-5, element.quality);
        assertEquals(11, element.sellIn);
    }
    
    
    
    
    
          // Teste la méthode updateQuality pour Sulfuras avec une qualité négative

                  @Test
      @DisplayName("Test the updateQuality method for a Sulfuras, Hand of Ragnaros negative quality")
    public void testUpdateQualitySulfurasNegativeQuality2() {
    Item element = new Item("Aged Brie", 3, -2);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(-1, element.quality);
        assertEquals(2, element.sellIn);
    }
    
  // Teste la méthode updateQuality pour Aged Brie avec un sellIn négatif et une qualité inférieure à 50
    
                  @Test
      @DisplayName("Test the updateQuality method for a Aged Brie negative sellin quality <50")
    public void testUpdateQualityAgedBrieNegativeSellInQualityBelow50() {
    Item element = new Item("Aged Brie", -1, 24);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(26, element.quality);
        assertEquals(-2, element.sellIn);
    }
    
      // Teste la méthode updateQuality pour Aged Brie avec un sellIn négatif et une qualité supérieure à 50

    
                      @Test
      @DisplayName("Test the updateQuality method for a Aged Brie negative sellin quality >50 ")
    public void testUpdateQualityAgedBrieNegativeSellInQualityAbove50() {
    Item element = new Item("Aged Brie", -1, 55);
    GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(55, element.quality);
        assertEquals(-2, element.sellIn);
    }
    
    
    
    
      // Teste la méthode updateQuality pour les "Backstage Passes" avec 15 jours restants

    @DisplayName("Test the updateQuality method for Backstage Passes with 15 days left")
    @Test
    public void testBackstagePassesUpdateQuality15Days() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(14, element.sellIn);
        assertEquals(21, element.quality);
    }
    
    
    
          // Teste la méthode updateQuality pour les "Backstage Passes" avec 11 jours restants (pitest)

        @DisplayName("Test the updateQuality method for Backstage Passes with 11 days left")
    @Test
    public void testBackstagePassesUpdateQuality11Days2() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(10, element.sellIn);
        assertEquals(21, element.quality);
    }
    
    
    
    
    
             // Teste la méthode updateQuality pour les "Backstage Passes" avec 6 jours restants (pitest)

        @DisplayName("Test the updateQuality method for Backstage Passes with 11 days left")
    @Test
    public void testBackstagePassesUpdateQuality6Days() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 6, 20);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(5, element.sellIn);
        assertEquals(22, element.quality);
    }
    
    
    
    
    
    
    
    
  // Teste la méthode updateQuality pour les "Backstage Passes" avec 5 jours restants
    
        @DisplayName("Test the updateQuality method for Backstage Passes with 5 days left")
        @Test
    public void testBackstagePassesUpdateQuality5Days() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49) ;
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(4, element.sellIn);
        assertEquals(50, element.quality);
    }
    
  
        
  // Teste la méthode updateQuality pour Conjured Mana Cake avec un sellIn négatif

    
    @DisplayName("Test the updateQuality method for Conjured Mana Cake with negative sellIn")
    @Test
    public void testConjuredItemUpdateQualityNegativeSellIn() {
        Item element = new Item("Conjured Mana Cake", -1, 4) ;
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(-2, element.sellIn);
        assertEquals(2, element.quality);
    }
    
    
  // Teste la méthode updateQuality pour Aged Brie avec une qualité maximale (50)

    
    @DisplayName("Test the updateQuality method for Aged Brie with quality at its maximum (50)")
    @Test
    public void testAgedBrieQualityAtMaximum() {
        Item element = new Item("Aged Brie", 2, 50) ;
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(1, element.sellIn);
        assertEquals(50, element.quality);
    }
   
      // Teste la méthode updateQuality pour Aged Brie avec une qualité minimale (0)

        @DisplayName("Test the updateQuality method for Aged Brie with quality at its minimu 0 ")
    @Test
    public void testAgedBrieQualityAtMaximum000() {
        Item element = new Item("Aged Brie", 2, -1) ;
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertEquals(1, element.sellIn);
        assertEquals(0, element.quality);
    }
    
      // Teste la méthode toString pour l'objet Item

    
        @Test
    public void testToString() {
        // Arrange
        Item item = new Item("Example Item", 10, 20);

        // Act
        String result = item.toString();

        // Assert
        String expected = "Example Item, 10, 20";
        assertEquals(expected, result);
    }
    
    
    
    

}


