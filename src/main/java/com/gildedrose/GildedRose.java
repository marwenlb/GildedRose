package com.gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (Item item : items) {
      // Appel de la méthode updateItemQuality pour gérer la qualité de chaque élément.
      updateItemQuality(item);
    }
  }

  // Méthode pour mettre à jour la qualité d'un élément spécifique.
  private void updateItemQuality(Item item) {
    switch (item.name) {
      case "Aged Brie":
        // Pour "Aged Brie", la qualité augmente.
        increaseQuality(item);
        break;

      case "Backstage passes to a TAFKAL80ETC concert":
        // Pour les passes de concert, la qualité augmente avec des règles spécifiques.
        increaseQuality(item);
        if (item.sellIn < 11) {
          increaseQuality(item);
        }
        if (item.sellIn < 6) {
          increaseQuality(item);
        }
        if (item.sellIn < 0) {
          item.quality = 0;
        }
        break;

      case "Sulfuras, Hand of Ragnaros":
        // Pour "Sulfuras", la qualité et le sellIn ne changent pas, donc on ne fait rien.
        break;
      case "Conjured":
      // Pour "Conjured", la qualité diminue deux fois plus vite.
      decreaseQuality(item);
      decreaseQuality(item);
      if (item.sellIn < 0) {
        decreaseQuality(item);
        decreaseQuality(item);
      }
      break;

      default:
        // Pour tous les autres éléments, la qualité diminue.
        decreaseQuality(item);
        if (item.sellIn < 0) {
          decreaseQuality(item);
        }
        break;
    }

    // La valeur sellIn est décrémentée pour tous les éléments (sauf "Sulfuras").
    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
      item.sellIn--;
    }
  }

  // Méthode pour augmenter la qualité d'un élément s'il est en dessous de 50.
  private void increaseQuality(Item item) {
    if (item.quality < 50) {
      item.quality++;
    }
  }

  // Méthode pour diminuer la qualité d'un élément si elle est supérieure à 0.
  private void decreaseQuality(Item item) {
    if (item.quality > 0) {
      item.quality--;
    }
  }
}
