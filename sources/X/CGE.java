package X;

public abstract class CGE {
    public static final AnonymousClass1LB A00;

    static {
        AnonymousClass1LB r2 = new AnonymousClass1LB(0);
        A00 = r2;
        r2.A03("BJ", new String[]{"fr-BJ", "ha-NG"});
        String[] A1b = BE6.A1b(r2, new String[]{"en-CM", "fr-CM", "ha-NG"}, "CM", 3);
        A1b[0] = "fr-TD";
        A1b[1] = "ar-TD";
        A1b[2] = "ha-NG";
        String[] A1b2 = BE6.A1b(r2, A1b, "TD", 3);
        A1b2[0] = "am-ET";
        A1b2[1] = "en-GB";
        A1b2[2] = "om-ET";
        String[] A1b3 = BE6.A1b(r2, A1b2, "ET", 2);
        A1b3[0] = "en-GH";
        A1b3[1] = "ha-GH";
        r2.A03("GH", A1b3);
        String[] A1b4 = BE6.A1b(r2, new String[]{"iw-IL", "ar-IL", "en-IL", "ru-RU", "am-ET"}, "IL", 3);
        A1b4[0] = "en-KE";
        A1b4[1] = "om-KE";
        A1b4[2] = "sw-KE";
        String[] A1b5 = BE6.A1b(r2, A1b4, "KE", 3);
        A1b5[0] = "ar-TD";
        A1b5[1] = "fr-NE";
        A1b5[2] = "ha-NE";
        String[] A1b6 = BE6.A1b(r2, A1b5, "NE", 2);
        A1b6[0] = "en-NG";
        A1b6[1] = "ha-NG";
        String[] A1b7 = BE6.A1b(r2, A1b6, "NG", 3);
        A1b7[0] = "en-GB";
        A1b7[1] = "ar-SO";
        A1b7[2] = "om-ET";
        r2.A03("SO", A1b7);
    }
}
