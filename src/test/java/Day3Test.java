import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day3Test {
    private static final String ID1 = "123";

    @Test
    public void should_return_matrix_1000x1000_fill_with_point_when_init() {
        Day3 day3 = new Day3();
        String[][] piece = day3.init();
        assertEquals(Day3.INCHES, piece.length);
        for (int i = 0; i < Day3.INCHES; i++)
            for (int j = 0; j < Day3.INCHES; j++)
                assertEquals(".", piece[i][j]);
    }

    @Test
    public void the_claim_of_a_piece_should_fill_with_id() {
        Day3 day3 = new Day3();
        String[][] piece = day3.drawClaim(Collections.singletonList("#" + ID1 + " @ 3,2: 5x4"));
        assertEquals(Day3.INCHES, piece.length);
        for (int i = 0; i < Day3.INCHES; i++)
            for (int j = 0; j < Day3.INCHES; j++)
                if (i == 2 || i == 3 || i == 4 || i == 5) {
                    if (j == 3 || j == 4 || j == 5 || j == 6 || j == 7) {
                        assertEquals(ID1, piece[i][j]);
                    }
                } else {
                    assertEquals(".", piece[i][j]);
                }
    }

    @Test
    public void the_claim_of_a_piece_should_fill_with_id_but_it_is_already_claim_should_fill_with_x() {
        Day3 day3 = new Day3();
        List<String> claims = Arrays.asList("#1 @ 1,3: 4x4", "#2 @ 3,1: 4x4", "#3 @ 5,5: 2x2");
        String[][] piece = day3.drawClaim(claims);
        for (int i = 0; i < Day3.INCHES; i++)
            for (int j = 0; j < Day3.INCHES; j++)
                if (i == 1 || i == 2) {
                    if (j == 3 || j == 4 || j == 5 || j == 6) {
                        assertEquals("2", piece[i][j]);
                    }
                } else if (i == 3 || i == 4) {
                    if (j == 1 || j == 2) {
                        assertEquals("1", piece[i][j]);
                    } else if (j == 3 || j == 4) {
                        assertEquals("x", piece[i][j]);
                    } else if (j == 5 || j == 6) {
                        assertEquals("2", piece[i][j]);
                    }
                } else if (i == 5 || i == 6) {
                    if (j == 1 || j == 2 || j == 3 || j == 4) {
                        assertEquals("1", piece[i][j]);
                    } else if (j == 5 || j == 6) {
                        assertEquals("3", piece[i][j]);
                    }
                } else {
                    assertEquals(".", piece[i][j]);
                }
    }
}
