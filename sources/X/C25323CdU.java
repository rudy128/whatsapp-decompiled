package X;

/* renamed from: X.CdU  reason: case insensitive filesystem */
public abstract class C25323CdU {
    public static Integer A00(String str) {
        if (str.equals("LOW_END")) {
            return AnonymousClass00R.A00;
        }
        if (str.equals("MID_END")) {
            return AnonymousClass00R.A01;
        }
        if (str.equals("HIGH_END")) {
            return AnonymousClass00R.A0C;
        }
        throw AnonymousClass000.A0k(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "LOW_END";
            case 1:
                return "MID_END";
            default:
                return "HIGH_END";
        }
    }
}
