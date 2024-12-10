package X;

/* renamed from: X.0Us  reason: invalid class name and case insensitive filesystem */
public final class C05560Us implements AnonymousClass0tB {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public float BDp(C24246By4 by4) {
        if (by4 == C24246By4.Ltr) {
            return this.A03;
        }
        return this.A02;
    }

    public float BDx(C24246By4 by4) {
        if (by4 == C24246By4.Ltr) {
            return this.A02;
        }
        return this.A03;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C05560Us)) {
            return false;
        }
        C05560Us r4 = (C05560Us) obj;
        if (!AnonymousClass000.A1P(Float.compare(this.A03, r4.A03)) || !AnonymousClass000.A1P(Float.compare(this.A01, r4.A01)) || !AnonymousClass000.A1P(Float.compare(this.A02, r4.A02)) || !AnonymousClass000.A1P(Float.compare(this.A00, r4.A00))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A03), this.A01), this.A02), this.A00);
    }

    public C05560Us(float f, float f2, float f3, float f4) {
        this.A03 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A00 = f4;
    }

    public float BDk() {
        return this.A00;
    }

    public float BE0() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaddingValues(start=");
        A10.append(DSH.A01(this.A03));
        A10.append(", top=");
        A10.append(DSH.A01(this.A01));
        A10.append(", end=");
        A10.append(DSH.A01(this.A02));
        A10.append(", bottom=");
        return AnonymousClass001.A1F(DSH.A01(this.A00), A10);
    }
}
