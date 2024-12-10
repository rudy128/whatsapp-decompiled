package X;

/* renamed from: X.4hZ  reason: invalid class name and case insensitive filesystem */
public final class C92584hZ implements C108335bX, C108345bY, C106575Wj {
    public final C88544a4 A00;
    public final AnonymousClass4DE A01;
    public final C107855aj A02;
    public final C92384hD A03;
    public final Float A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C92584hZ) {
                C92584hZ r5 = (C92584hZ) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00) || this.A05 != r5.A05 || !C18070vi.A18(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass4DE BOO() {
        return this.A01;
    }

    public C107855aj BR7() {
        return this.A02;
    }

    public C88544a4 BUA() {
        return this.A00;
    }

    public C92384hD BW8() {
        return this.A03;
    }

    public Float BZk() {
        return this.A04;
    }

    public boolean Bet() {
        return this.A05;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A02))), this.A05) + AnonymousClass001.A0k(this.A04);
    }

    public C92584hZ(C88544a4 r2, C107855aj r3, C92384hD r4, Float f, boolean z) {
        C72473Md.A1I(r3, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r2;
        this.A05 = z;
        this.A04 = f;
        this.A01 = r4.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Enabled(effect=");
        A10.append(this.A02);
        A10.append(", params=");
        A10.append(this.A03);
        A10.append(", logger=");
        A10.append(this.A00);
        A10.append(", isFromButton=");
        A10.append(this.A05);
        A10.append(", strength=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
