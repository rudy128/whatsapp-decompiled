package X;

/* renamed from: X.8wN  reason: invalid class name and case insensitive filesystem */
public final class C174188wN extends C174358we {
    public final AnonymousClass9X2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174188wN(AnonymousClass9X2 r2) {
        super(48);
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C174188wN) && C18070vi.A18(this.A00, ((C174188wN) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NearbyBusinessLocationRequestListItemData(nearbyLocationRequestClickListener=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
