package X;

/* renamed from: X.6XB  reason: invalid class name */
public abstract class AnonymousClass6XB {
    public static Integer A00(String str) {
        if (str.equals("LARGE")) {
            return AnonymousClass00R.A00;
        }
        if (str.equals("MEDIUM")) {
            return AnonymousClass00R.A01;
        }
        if (str.equals("FIT_CONTENT")) {
            return AnonymousClass00R.A0C;
        }
        if (str.equals("FULL_SCREEN")) {
            return AnonymousClass00R.A0N;
        }
        throw AnonymousClass000.A0k(str);
    }
}
