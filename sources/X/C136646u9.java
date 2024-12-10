package X;

/* renamed from: X.6u9  reason: invalid class name and case insensitive filesystem */
public final class C136646u9 {
    public Boolean A00 = null;
    public Integer A01 = null;
    public Integer A02 = null;
    public Integer A03 = null;
    public Integer A04 = null;
    public Integer A05 = null;
    public Integer A06 = null;
    public Integer A07 = null;
    public Integer A08 = null;
    public Integer A09 = null;
    public Long A0A = null;
    public Long A0B = null;
    public Long A0C = null;
    public String A0D = null;
    public String A0E = null;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136646u9) {
                C136646u9 r5 = (C136646u9) obj;
                if (!C18070vi.A18(this.A0D, r5.A0D) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A0E, r5.A0E) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A0B, r5.A0B) || !C18070vi.A18(this.A0C, r5.A0C) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((C17900vP.A00(this.A0D) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17900vP.A00(this.A0E)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A09)) * 31) + AnonymousClass001.A0k(this.A08)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A0A)) * 31) + AnonymousClass001.A0k(this.A0B)) * 31) + AnonymousClass001.A0k(this.A0C)) * 31) + AnonymousClass001.A0k(this.A07)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + C17880vN.A02(this.A01);
    }

    public String toString() {
        Object[] objArr = new Object[14];
        objArr[0] = this.A00;
        objArr[1] = this.A0E;
        objArr[2] = this.A04;
        objArr[3] = this.A09;
        objArr[4] = this.A08;
        objArr[5] = this.A03;
        objArr[6] = this.A06;
        objArr[7] = this.A0A;
        objArr[8] = this.A0B;
        objArr[9] = this.A0C;
        objArr[10] = this.A07;
        objArr[11] = this.A02;
        objArr[12] = this.A05;
        return C108995ce.A0X(",", C18070vi.A0O(this.A01, objArr, 13));
    }
}
