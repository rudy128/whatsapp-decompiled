package X;

/* renamed from: X.8wP  reason: invalid class name and case insensitive filesystem */
public final class C174208wP extends C174358we {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C174208wP) && this.A00 == ((C174208wP) obj).A00);
    }

    public C174208wP(boolean z) {
        super(44);
        this.A00 = z;
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NearbyBusinessWidgetShimmerListItemData(showHeaderShimmer=");
        return C17900vP.A0F(A10, this.A00);
    }
}
