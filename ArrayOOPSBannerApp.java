class ArrayOOPSBannerApp {

    public static void main(String[] args) {

        // 2D array representing the banner pattern
        String[][] banner = {
            {"   ***   ", "   ***   ", " ******  ", "  *****  "},
            {"  **  ** ", "  **  ** ", " **   ** ", " **     "},
            {" **    **", " **    **", " **   ** ", "  **     "},
            {" **    **", " **    **", " ******  ", "    ***    "},
            {" **    **", " **    **", " **      ", "      **    "},
            {" **    **", " **    **", " **      ", "       **    "},
            {"  **  ** ", "  **  ** ", " **       ", "     **    "},
            {"   ***   ", "   ***   ", " **       ", " *****  "}
        };

        // Print banner row by row
        for (int i = 0; i < banner.length; i++) {
            for (int j = 0; j < banner[i].length; j++) {
                System.out.print(banner[i][j] + "   ");
            }
            System.out.println();
        }
    }
}