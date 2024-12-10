package X;

/* renamed from: X.4hD  reason: invalid class name and case insensitive filesystem */
public final class C92384hD implements C107865ak {
    public final AnonymousClass4DE A00;
    public final AnonymousClass4D9 A01;
    public final C19971A1g A02;
    public final Float A03;
    public final String A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C92384hD) {
                C92384hD r5 = (C92384hD) obj;
                if (this.A01 != r5.A01 || this.A00 != r5.A00 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || this.A05 != r5.A05 || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass4DE BOO() {
        return this.A00;
    }

    public AnonymousClass4D9 BZx() {
        return this.A01;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00((C17890vO.A02(this.A04, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01))) + AnonymousClass001.A0k(this.A03)) * 31, this.A05) + C17880vN.A02(this.A02);
    }

    public C92384hD(AnonymousClass4DE r1, AnonymousClass4D9 r2, C19971A1g a1g, Float f, String str, boolean z) {
        C72473Md.A1I(r2, str);
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = str;
        this.A03 = f;
        this.A05 = z;
        this.A02 = a1g;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EnableArEffectParams(surface=");
        A10.append(this.A01);
        A10.append(", category=");
        A10.append(this.A00);
        A10.append(", productSessionId=");
        A10.append(this.A04);
        A10.append(", initialStrength=");
        A10.append(this.A03);
        A10.append(", isUserStarted=");
        A10.append(this.A05);
        A10.append(", serviceHostConfigParams=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
