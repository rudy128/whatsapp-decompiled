package X;

/* renamed from: X.4ha  reason: invalid class name and case insensitive filesystem */
public final class C92594ha implements C108335bX, C106575Wj {
    public final C88544a4 A00;
    public final C107855aj A01;
    public final C92384hD A02;
    public final C92584hZ A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C92594ha) {
                C92594ha r5 = (C92594ha) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || this.A04 != r5.A04 || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C107855aj BR7() {
        return this.A01;
    }

    public C88544a4 BUA() {
        return this.A00;
    }

    public C92384hD BW8() {
        return this.A02;
    }

    public boolean Bet() {
        return this.A04;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A01))), this.A04) + AnonymousClass001.A0k(this.A03);
    }

    public C92594ha(C88544a4 r1, C107855aj r2, C92384hD r3, C92584hZ r4, boolean z) {
        C18070vi.A0j(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = z;
        this.A03 = r4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Enabling(effect=");
        A10.append(this.A01);
        A10.append(", params=");
        A10.append(this.A02);
        A10.append(", logger=");
        A10.append(this.A00);
        A10.append(", isFromButton=");
        A10.append(this.A04);
        A10.append(", previousEnabledState=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
