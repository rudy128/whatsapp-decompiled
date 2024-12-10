package X;

/* renamed from: X.CbL  reason: case insensitive filesystem */
public final class C25224CbL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25224CbL) {
                C25224CbL cbL = (C25224CbL) obj;
                if (!(this.A05 == cbL.A05 && this.A01 == cbL.A01 && this.A00 == cbL.A00 && this.A02 == cbL.A02 && C18070vi.A18(this.A04, cbL.A04) && C18070vi.A18(this.A03, cbL.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AnonymousClass3MX.A03(this.A05) + this.A01) * 31) + this.A00) * 31) + this.A02) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + C17880vN.A02(this.A03);
    }

    public C25224CbL(Integer num, Integer num2, int i, int i2, int i3, boolean z) {
        this.A05 = z;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A04 = num;
        this.A03 = num2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DynamicMemoryHandlingInfo(isDynamicMemoryHandlingEnabled=");
        A10.append(this.A05);
        A10.append(", normalModeMemoryThreshold=");
        A10.append(this.A01);
        A10.append(", lowMemoryModeMemoryThreshold=");
        A10.append(this.A00);
        A10.append(", preRenderingOffset=");
        A10.append(this.A02);
        A10.append(", criticalMemoryThreshold=");
        A10.append(this.A04);
        A10.append(", avatarUpdateMemoryThreshold=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
