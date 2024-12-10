package X;

/* renamed from: X.6N5  reason: invalid class name */
public final class AnonymousClass6N5 extends AnonymousClass6U4 {
    public final C187029f9 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6N5) && C18070vi.A18(this.A00, ((AnonymousClass6N5) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6N5(C187029f9 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BloksLayoutDataError(layoutData=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
