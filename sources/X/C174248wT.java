package X;

/* renamed from: X.8wT  reason: invalid class name and case insensitive filesystem */
public final class C174248wT extends C174358we {
    public final AnonymousClass9X4 A00;
    public final String A01;

    public C174248wT(AnonymousClass9X4 r2, String str) {
        super(49);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C174248wT) {
            C174248wT r3 = (C174248wT) obj;
            if (this.A00 != r3.A00 || !C18070vi.A18(this.A01, r3.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17880vN.A03(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SearchContextChipViewListItemData(category=");
        A10.append(this.A01);
        A10.append(", searchContextChipItemClickListener=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
