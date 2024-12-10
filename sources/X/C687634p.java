package X;

/* renamed from: X.34p  reason: invalid class name and case insensitive filesystem */
public final class C687634p implements B5K {
    public final C49502Qs A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C687634p) && this.A00 == ((C687634p) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C687634p(C49502Qs r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ChatOriginParsedValues(chatOrigin=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
