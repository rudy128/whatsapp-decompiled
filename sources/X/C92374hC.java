package X;

/* renamed from: X.4hC  reason: invalid class name and case insensitive filesystem */
public final class C92374hC implements C107865ak {
    public final float A00;
    public final AnonymousClass4DE A01;
    public final AnonymousClass4D9 A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C92374hC) {
                C92374hC r5 = (C92374hC) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && Float.compare(this.A00, r5.A00) == 0)) {
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

    public AnonymousClass4D9 BZx() {
        return this.A02;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02)) + Float.floatToIntBits(this.A00);
    }

    public C92374hC(AnonymousClass4DE r1, AnonymousClass4D9 r2, float f) {
        C18070vi.A0j(r2, r1);
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEffectStrengthParams(surface=");
        A10.append(this.A02);
        A10.append(", category=");
        A10.append(this.A01);
        A10.append(", strength=");
        return AnonymousClass001.A1K(A10, this.A00);
    }
}
