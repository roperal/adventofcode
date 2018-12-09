import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day3Test {
    @Test
    public void should_return_matrix_1000x1000_fill_with_point_when_init() {
        Day3 day3 = new Day3();
        String[][] piece = day3.init();
        assertEquals(1000, piece.length);
        for (int i = 0; i < Day3.INCHES; i++)
            for (int j = 0; j < Day3.INCHES; j++)
                assertEquals(".", piece[i][j]);
    }

    @Test
    public void the_claim_of_a_piece_should_fill_with_id() {
        Day3 day3 = new Day3();
        String[][] piece = day3.drawClaim("#123 @ 3,2: 5x4");
        assertEquals(1000, piece.length);
        for (int i = 0; i < Day3.INCHES; i++)
            for (int j = 0; j < Day3.INCHES; j++)
                if (i == 2) {
                    if (j == 3 || j == 4 || j == 5 || j == 6 || j == 7) {
                        assertEquals("123", piece[i][j]);
                    }

                } else if (i == 3) {
                    if (j == 3 || j == 4 || j == 5 || j == 6 || j == 7) {
                        assertEquals("123", piece[i][j]);
                    }
                } else if (i == 4) {
                    if (j == 3 || j == 4 || j == 5 || j == 6 || j == 7) {
                        assertEquals("123", piece[i][j]);
                    }
                } else if (i == 5) {
                    if (j == 3 || j == 4 || j == 5 || j == 6 || j == 7) {
                        assertEquals("123", piece[i][j]);
                    }
                } else {
                    assertEquals(".", piece[i][j]);
                }
    }

    @Test
    public void the_claim_of_a_piece_should_fill_with_id_but_is_already_claim_should_fill_with_x() {
        Day3 day3 = new Day3();
        List<String> claims = Arrays.asList("#1 @ 1,3: 4x4", "#2 @ 3,1: 4x4", "#3 @ 5,5: 2x2");

    }
}