package X;

/* renamed from: X.C7t  reason: case insensitive filesystem */
public abstract class C24524C7t {
    public static Integer A00(String str) {
        if (str.equals("px")) {
            return AnonymousClass00R.A00;
        }
        if (str.equals("em")) {
            return AnonymousClass00R.A01;
        }
        if (str.equals("ex")) {
            return AnonymousClass00R.A0C;
        }
        if (str.equals("in")) {
            return AnonymousClass00R.A0N;
        }
        if (str.equals("cm")) {
            return AnonymousClass00R.A0Y;
        }
        if (str.equals("mm")) {
            return AnonymousClass00R.A0j;
        }
        if (str.equals("pt")) {
            return AnonymousClass00R.A0u;
        }
        if (str.equals("pc")) {
            return AnonymousClass00R.A15;
        }
        if (str.equals("percent")) {
            return AnonymousClass00R.A18;
        }
        throw AnonymousClass000.A0k(str);
    }
}
