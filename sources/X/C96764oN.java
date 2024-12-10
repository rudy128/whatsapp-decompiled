package X;

/* renamed from: X.4oN  reason: invalid class name and case insensitive filesystem */
public final class C96764oN implements AnonymousClass5Y4 {
    public final C41761x1 A00;
    public final C22821Di A01;
    public final C22821Di A02;
    public final C22821Di A03;
    public final boolean A04;

    public C96764oN(C41761x1 r2, C22821Di r3, C22821Di r4, C22821Di r5, boolean z) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A04 = z;
        this.A03 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C96764oN) {
                C96764oN r5 = (C96764oN) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A04 != r5.A04 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A03, AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A04))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ListItem(labelInfo=");
        A10.append(this.A00);
        A10.append(", isEdit=");
        A10.append(this.A04);
        A10.append(", onItemClick=");
        A10.append(this.A03);
        A10.append(", entities=");
        A10.append(this.A01);
        A10.append(", onDelete=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
