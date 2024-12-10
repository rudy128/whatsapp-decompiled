package X;

/* renamed from: X.9QL  reason: invalid class name */
public abstract class AnonymousClass9QL {
    public static final int A00(String str) {
        boolean equals;
        int i;
        C18070vi.A0d(str, 0);
        int hashCode = str.hashCode();
        if (hashCode == -1422950650) {
            equals = str.equals("active");
            i = 3;
        } else if (hashCode != -309833220) {
            if (hashCode == 100743639) {
                equals = str.equals("eligible");
                i = 2;
            }
            return 0;
        } else {
            equals = str.equals("ineligible");
            i = 1;
        }
        if (!equals) {
            return 0;
        }
        return i;
    }
}
