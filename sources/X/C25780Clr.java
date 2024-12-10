package X;

/* renamed from: X.Clr  reason: case insensitive filesystem */
public final class C25780Clr {
    public static final C25780Clr A02 = new C25780Clr("ALWAYS_ALLOW", 0.0f);
    public final float A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25780Clr)) {
            return false;
        }
        C25780Clr clr = (C25780Clr) obj;
        return this.A00 == clr.A00 && C18070vi.A18(this.A01, clr.A01);
    }

    public int hashCode() {
        return this.A01.hashCode() + AnonymousClass000.A05(this.A00);
    }

    public C25780Clr(String str, float f) {
        this.A01 = str;
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmbeddingAspectRatio(");
        return C17900vP.A0B(this.A01, A10);
    }
}
