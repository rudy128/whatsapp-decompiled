package X;

/* renamed from: X.6Dy  reason: invalid class name and case insensitive filesystem */
public final class C120506Dy extends C123106Td {
    public final C1418377d A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C120506Dy) && C18070vi.A18(this.A00, ((C120506Dy) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C120506Dy(C1418377d r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnDevice(sticker=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
