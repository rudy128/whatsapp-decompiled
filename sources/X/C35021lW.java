package X;

/* renamed from: X.1lW  reason: invalid class name and case insensitive filesystem */
public class C35021lW {
    public static final C35021lW A02 = new C35021lW("pita", true);
    public static final C35021lW A03 = new C35021lW("avatar", true);
    public static final C35021lW A04 = new C35021lW("COMMON", true);
    public static final C35021lW A05 = new C35021lW("GEN_AI", true);
    public static final C35021lW A06 = new C35021lW("PAYMENTS", true);
    public static final C35021lW A07 = new C35021lW("shops", true);
    public static final C35021lW A08 = new C35021lW("support", true);
    public static final C35021lW A09 = new C35021lW("waffle_companion", true);
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35021lW)) {
            return false;
        }
        return C18070vi.A18(this.A00, ((C35021lW) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C35021lW(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public String toString() {
        return this.A00;
    }
}
