package X;

import java.util.concurrent.atomic.AtomicBoolean;

public class CZH {
    public C24275ByY A00;
    public final C24259ByI A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final AtomicBoolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CZH czh = (CZH) obj;
            if (!AnonymousClass026.A00(this.A04, czh.A04) || !AnonymousClass026.A00(this.A02, czh.A02) || !AnonymousClass026.A00(this.A03, czh.A03) || !AnonymousClass026.A00(this.A05, czh.A05) || this.A01 != czh.A01 || this.A00 != czh.A00 || this.A06 != czh.A06) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = this.A04;
        objArr[1] = this.A02;
        objArr[2] = this.A03;
        objArr[3] = this.A05;
        objArr[4] = this.A00;
        objArr[5] = this.A01;
        objArr[6] = Boolean.valueOf(this.A06);
        return AnonymousClass000.A0P(AnonymousClass000.A0h(), objArr, 7);
    }

    public CZH(C24275ByY byY, C24259ByI byI, String str, String str2, String str3, AtomicBoolean atomicBoolean, boolean z) {
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = atomicBoolean;
        this.A00 = byY;
        this.A01 = byI;
        this.A06 = z;
    }
}
