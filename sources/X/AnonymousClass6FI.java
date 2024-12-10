package X;

/* renamed from: X.6FI  reason: invalid class name */
public final class AnonymousClass6FI extends C39611tM {
    public final C20079A6f A00;
    public final C18090vk A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6FI) {
                AnonymousClass6FI r5 = (AnonymousClass6FI) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02 || this.A03 != r5.A03 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass6FI(C20079A6f a6f, C18090vk r3, boolean z, boolean z2) {
        super(a6f, 31);
        this.A00 = a6f;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = r3;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A02), this.A03));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessSearchLocationHeaderItem(data=");
        A10.append(this.A00);
        A10.append(", isInternalOnly=");
        A10.append(this.A02);
        A10.append(", showMyLocationButton=");
        A10.append(this.A03);
        A10.append(", myLocationButtonClick=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
