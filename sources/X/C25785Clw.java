package X;

/* renamed from: X.Clw  reason: case insensitive filesystem */
public final class C25785Clw {
    public static final C25785Clw A02 = C24508C7c.A00(0.5f);
    public static final C25785Clw A03 = new C25785Clw("expandContainers", 0.0f);
    public static final C25785Clw A04 = new C25785Clw("hinge", -1.0f);
    public final float A00;
    public final String A01;

    public C25785Clw(String str, float f) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25785Clw)) {
            return false;
        }
        C25785Clw clw = (C25785Clw) obj;
        return this.A00 == clw.A00 && C18070vi.A18(this.A01, clw.A01);
    }

    public int hashCode() {
        return this.A01.hashCode() + AnonymousClass000.A05(this.A00);
    }

    public String toString() {
        return this.A01;
    }
}
