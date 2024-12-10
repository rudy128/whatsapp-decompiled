package X;

/* renamed from: X.9SX  reason: invalid class name */
public abstract class AnonymousClass9SX {
    public static final Integer A00(String str) {
        if (str == null) {
            try {
                return AnonymousClass00R.A0N;
            } catch (IllegalArgumentException unused) {
                return AnonymousClass00R.A0N;
            }
        } else {
            String A0j = AnonymousClass8BW.A0j(str);
            if (A0j.equals("AND")) {
                return AnonymousClass00R.A00;
            }
            if (A0j.equals("OR")) {
                return AnonymousClass00R.A01;
            }
            if (A0j.equals("NOR")) {
                return AnonymousClass00R.A0C;
            }
            if (A0j.equals("UNKNOWN")) {
                return AnonymousClass00R.A0N;
            }
            throw AnonymousClass000.A0k(A0j);
        }
    }
}
