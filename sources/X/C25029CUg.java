package X;

/* renamed from: X.CUg  reason: case insensitive filesystem */
public final class C25029CUg {
    public final int A00(String str) {
        int i;
        boolean z;
        if (str != null) {
            String A0d = C108975cc.A0d(str);
            switch (A0d.hashCode()) {
                case -1953166733:
                    z = A0d.equals("src_out");
                    i = 7;
                    break;
                case -1338968417:
                    z = A0d.equals("darken");
                    i = 16;
                    break;
                case -1322296865:
                    z = A0d.equals("dst_in");
                    i = 6;
                    break;
                case -1091287984:
                    z = A0d.equals("overlay");
                    i = 15;
                    break;
                case -907689876:
                    z = A0d.equals("screen");
                    i = 14;
                    break;
                case -894289568:
                    z = A0d.equals("src_in");
                    i = 5;
                    break;
                case -419044657:
                    z = A0d.equals("src_atop");
                    i = 9;
                    break;
                case 114148:
                    z = A0d.equals("src");
                    i = 1;
                    break;
                case 118875:
                    z = A0d.equals("xor");
                    i = 11;
                    break;
                case 94746189:
                    z = A0d.equals("clear");
                    i = 0;
                    break;
                case 170546239:
                    z = A0d.equals("lighten");
                    i = 17;
                    break;
                case 582803342:
                    z = A0d.equals("dst_atop");
                    i = 10;
                    break;
                case 583222030:
                    z = A0d.equals("dst_over");
                    i = 4;
                    break;
                case 653829668:
                    z = A0d.equals("multiply");
                    i = 13;
                    break;
                case 1958476244:
                    z = A0d.equals("dst_out");
                    i = 8;
                    break;
            }
            if (!z) {
                return 3;
            }
            return i;
        }
        return 3;
    }
}
