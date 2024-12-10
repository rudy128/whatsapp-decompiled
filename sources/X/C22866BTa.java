package X;

/* renamed from: X.BTa  reason: case insensitive filesystem */
public final class C22866BTa extends C3J {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Integer A05;
    public final C25411Oc A06;

    public C22866BTa(Integer num, C25411Oc r3, int i, int i2, int i3, int i4, int i5) {
        C18070vi.A0d(num, 1);
        this.A05 = num;
        this.A04 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A06 = r3;
        this.A00 = i4;
        this.A03 = i5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22866BTa) {
                C22866BTa bTa = (C22866BTa) obj;
                if (!(this.A05 == bTa.A05 && this.A04 == bTa.A04 && this.A02 == bTa.A02 && this.A01 == bTa.A01 && C18070vi.A18(this.A06, bTa.A06) && this.A00 == bTa.A00 && this.A03 == bTa.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A05;
        return ((AnonymousClass000.A0N(this.A06, ((((((C72453Mb.A0E(num, C24594CAp.A00(num)) * 31) + this.A04) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31) + this.A03;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BitrateLadderRung(quality=");
        A10.append(C24594CAp.A00(this.A05));
        A10.append(", width=");
        A10.append(this.A04);
        A10.append(", height=");
        A10.append(this.A02);
        A10.append(", frameRate=");
        A10.append(this.A01);
        A10.append(", bitRateRange=");
        A10.append(this.A06);
        A10.append(", captureFrameRate=");
        A10.append(this.A00);
        A10.append(", iFrameInterval=");
        return AnonymousClass001.A1L(A10, this.A03);
    }
}
