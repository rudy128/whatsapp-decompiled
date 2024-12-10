package X;

/* renamed from: X.4UR  reason: invalid class name */
public final class AnonymousClass4UR {
    public final int A00;
    public final int A01;
    public final AnonymousClass4DE A02;
    public final C107855aj A03;

    public AnonymousClass4UR(AnonymousClass4DE r2, C107855aj r3, int i, int i2) {
        C18070vi.A0d(r3, 2);
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UR) {
                AnonymousClass4UR r5 = (AnonymousClass4UR) obj;
                if (!(this.A02 == r5.A02 && C18070vi.A18(this.A03, r5.A03) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A02)) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EffectBannerConfiguration(category=");
        A10.append(this.A02);
        A10.append(", effect=");
        A10.append(this.A03);
        A10.append(", enableStringRes=");
        A10.append(this.A01);
        A10.append(", disableStringRes=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
