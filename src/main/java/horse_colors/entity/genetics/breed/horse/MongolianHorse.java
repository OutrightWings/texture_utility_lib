package sekelsta.horse_colors.entity.genetics.breed.horse;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;

import sekelsta.horse_colors.entity.genetics.breed.*;

public class MongolianHorse {
    public static Breed breed;

    static {
        Tarpan.init();
        breed = new Breed(Tarpan.breed);
        breed.name = "mongolian";
        breed.population = 3000000;
        Map<String, List<Float>> GENES = breed.genes;

        GENES.put("extension", ImmutableList.of(
            0.2f,   // Red
            1f      // Black
        ));
        GENES.put("agouti", ImmutableList.of(
            0.375f,     // Black
            0.5f,       // Seal
            0.5f,       // Seal unused
            0.5f,       // Bay unused
            1f          // Bay
        ));
        GENES.put("dun", ImmutableList.of(
            0.4f,   // Non-dun 2
            0.8f,  // Non-dun 1
            1f,     // Dun
            0f      // Dun unused
        ));
        GENES.put("KIT", ImmutableList.of(
            0.65f,  // Wildtype
            0.66f,  // White boost
            0.67f,  // Markings1
            0.68f,  // Markings2
            0.69f,  // Markings3
            0.70f,  // Markings4
            0.71f,  // Markings5
            0.71f,  // W20
            0f,     // Rabicano / Unused
            0.73f,  // Flashy white
            0f,     // Unused
            1.0f,   // Tobiano
            1.0f,   // Sabino1
            1.0f,   // Tobiano + W20
            1.0f,   // Roan
            1.0f    // Dominant white
        ));
        GENES.put("white_star", ImmutableList.of(
            0.85f,  // Less white
            1f      // More white
        ));
        GENES.put("white_forelegs", ImmutableList.of(
            0.9f,   // Less white
            1f      // More white
        ));

        GENES.put("size0", ImmutableList.of(
            0.8f,   // Normal
            1f      // Larger
        ));
        GENES.put("size1", ImmutableList.of(
            0.8f,   // Normal
            1f      // Larger
        ));
        GENES.put("size2", ImmutableList.of(
            0.8f,   // Normal
            1f      // Larger
        ));
        GENES.put("size3", ImmutableList.of(
            0.5f,   // Normal
            0.8f,   // Slightly larger
            0.9f,   // Larger
            1f      // Largest
        ));
        GENES.put("size4", ImmutableList.of(
            0.5f,   // Normal
            0.8f,   // Slightly smaller
            0.9f,   // Small
            0.95f,  // Smaller
            1f      // Smallest
        ));
        GENES.put("size5", ImmutableList.of(
            0.9f,   // Normal
            1f      // Smaller
        ));
        GENES.put("size6", ImmutableList.of(
            0.5f,   // Normal
            0.8f,   // Slightly smaller
            0.9f,   // Small
            0.95f,  // Smaller
            1f      // Smallest
        ));
        GENES.put("size7", ImmutableList.of(
            0.6f,   // Normal
            0.8f,   // Larger
            1f      // Smaller
        ));
    }

    public static void init() {}
}