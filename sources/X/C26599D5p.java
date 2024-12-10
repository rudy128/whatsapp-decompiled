package X;

/* renamed from: X.D5p  reason: case insensitive filesystem */
public final class C26599D5p implements C28615EAm {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26599D5p) && this.A00 == ((C26599D5p) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C26599D5p(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AndroidFontResolveInterceptor(fontWeightAdjustment=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
