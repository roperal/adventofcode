import java.util.List;

public class Day3 {

    public static final int INCHES = 1000;
    private static final String AT = " @";
    private static final String COMMA = ",";
    private static final String COLON = ": ";
    private static final String X = "x";
    private static final String POINT = ".";

    public String[][] init() {
        String[][] piece = new String[INCHES][INCHES];
        for (int i = 0; i < Day3.INCHES; i++) {
            for (int j = 0; j < Day3.INCHES; j++) {
                piece[i][j] = POINT;
            }
        }
        return piece;
    }

    public String[][] drawClaim(List<String> claims) {
        String[][] piece = init();

        for (String claim : claims) {
            String id = getId(claim).replace("#", "");
            String claimPiece = getClaimPiece(claim);
            Integer inchesFromTheLeft = getInchesFromTheLeft(claimPiece);
            String restOfClaim = getRestOfClaim(claimPiece);
            Integer inchesFromTheTop = getInchesFromTheTop(restOfClaim);
            String rectangle = getRectangle(restOfClaim);
            Integer wide = getWide(rectangle);
            Integer tall = getTall(rectangle);

            for (int i = 0; i < Day3.INCHES; i++) {
                for (int j = 0; j < Day3.INCHES; j++) {
                    if (getRowValueWithClaim(inchesFromTheTop, tall, i)
                        && getColumnValueWithClaim(inchesFromTheLeft, wide, j)) {
                        if (!piece[i][j].equals(POINT)) {
                            piece[i][j] = X;
                        } else {
                            piece[i][j] = id;
                        }
                    }
                }
            }
        }

        return piece;
    }

    private boolean getRowValueWithClaim(Integer inchesFromTheTop, Integer tall, int i) {
        return (i == inchesFromTheTop) || (i > inchesFromTheTop && i < (inchesFromTheTop + tall));
    }

    private boolean getColumnValueWithClaim(Integer inchesFromTheLeft, Integer wide, int j) {
        return (j == inchesFromTheLeft) || (j > inchesFromTheLeft && j < (inchesFromTheLeft + wide));
    }

    private String getId(String claim) {
        return claim.split(AT)[0];
    }

    private String getClaimPiece(String claim) {
        return claim.split(AT)[1];
    }

    private Integer getInchesFromTheLeft(String claimPiece) {
        return Integer.valueOf(claimPiece.split(COMMA)[0].trim());
    }

    private String getRestOfClaim(String rectangle) {
        return rectangle.split(COMMA)[1];
    }

    private Integer getInchesFromTheTop(String rest) {
        return Integer.valueOf(rest.split(COLON)[0]);
    }

    private String getRectangle(String rest) {
        return rest.split(COLON)[1];
    }

    private Integer getWide(String rectangle) {
        return Integer.valueOf(rectangle.split(X)[0]);
    }

    private Integer getTall(String rectangle) {
        return Integer.valueOf(rectangle.split(X)[1]);
    }
}
