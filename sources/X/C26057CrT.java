package X;

/* renamed from: X.CrT  reason: case insensitive filesystem */
public abstract class C26057CrT {
    public static Integer A01(int i) {
        if (i == 0) {
            return AnonymousClass00R.A00;
        }
        if (i == 1) {
            return AnonymousClass00R.A01;
        }
        if (i == 2) {
            return AnonymousClass00R.A0C;
        }
        if (i == 3) {
            return AnonymousClass00R.A0N;
        }
        throw AnonymousClass001.A13("Unknown enum value: ", AnonymousClass000.A10(), i);
    }

    public static void A03(String str, StringBuilder sb, float[] fArr, int i) {
        Integer A01 = A01((int) fArr[i + 1]);
        float f = fArr[i + 2];
        sb.append(str);
        sb.append(A02(A01));
        sb.append(": ");
        sb.append(f);
    }

    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 3;
        }
    }

    public static String A02(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "LEFT";
            case 1:
                return "TOP";
            case 2:
                return "RIGHT";
            default:
                return "BOTTOM";
        }
    }
}
