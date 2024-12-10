package X;

/* renamed from: X.4YW  reason: invalid class name */
public final class AnonymousClass4YW {
    public final C108915cV A00;
    public final C108915cV A01;
    public final AnonymousClass5Z8 A02;
    public final AnonymousClass5Z8 A03;
    public final Object A04;

    public AnonymousClass4YW() {
        this((C108915cV) null, (C108915cV) null, new C94404kZ(1), new C94404kZ(2), (Object) null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YW) {
                AnonymousClass4YW r5 = (AnonymousClass4YW) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A02, ((((AnonymousClass001.A0k(this.A00) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A04)) * 31)) + 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BannerState(bannerToHide=");
        A10.append(this.A00);
        A10.append(", bannerToShow=");
        A10.append(this.A01);
        A10.append(", bannerData=");
        A10.append(this.A04);
        A10.append(", bannerHiddenListener=");
        A10.append(this.A02);
        A10.append(", binderHiddenListener=");
        A10.append(this.A03);
        A10.append(", animate=");
        return C17900vP.A0F(A10, false);
    }

    public AnonymousClass4YW(C108915cV r1, C108915cV r2, AnonymousClass5Z8 r3, AnonymousClass5Z8 r4, Object obj) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = obj;
        this.A02 = r3;
        this.A03 = r4;
    }
}
