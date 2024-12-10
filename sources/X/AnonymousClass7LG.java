package X;

import java.util.Arrays;

/* renamed from: X.7LG  reason: invalid class name */
public final class AnonymousClass7LG implements AnonymousClass229 {
    public final int A00;
    public final int A01;
    public final C25550Cho A02;
    public final C25550Cho A03;
    public final CM2 A04;
    public final String A05;
    public final C18100vl A06;
    public final boolean A07;
    public final byte[] A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7LG) {
                AnonymousClass7LG r5 = (AnonymousClass7LG) obj;
                if (!C18070vi.A18(this.A08, r5.A08) || this.A00 != r5.A00 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || this.A01 != r5.A01 || this.A07 != r5.A07 || !C18070vi.A18(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        byte[] bArr = this.A08;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        return AnonymousClass0DV.A00((AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A04, ((hashCode * 31) + this.A00) * 31))) + this.A01) * 31, this.A07) + C108955ca.A06(this.A05);
    }

    public AnonymousClass7LG(C25550Cho cho, C25550Cho cho2, CM2 cm2, String str, byte[] bArr, int i, int i2, boolean z) {
        this.A08 = bArr;
        this.A00 = i;
        this.A04 = cm2;
        this.A02 = cho;
        this.A03 = cho2;
        this.A01 = i2;
        this.A07 = z;
        this.A05 = str;
        this.A06 = AnonymousClass1DF.A01(new C153217pA(this));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AudioData(waveform=");
        C17890vO.A1C(A10, this.A08);
        A10.append(", backgroundColor=");
        A10.append(this.A00);
        A10.append(", transcriptionStatus=");
        A10.append(this.A04);
        A10.append(", transcriptionRequestLocale=");
        A10.append(this.A02);
        A10.append(", transcriptionResultLocale=");
        A10.append(this.A03);
        A10.append(", transcriptionMinSegmentConfidence=");
        A10.append(this.A01);
        A10.append(", transcriptionFeedbackSubmitted=");
        A10.append(this.A07);
        A10.append(", transcriptionId=");
        return C17900vP.A0B(this.A05, A10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7LG() {
        /*
            r9 = this;
            r4 = 0
            r6 = 0
            X.Bvt r3 = X.C24127Bvt.A00
            X.BvS r1 = X.C24100BvS.A00
            r0 = r9
            r2 = r1
            r5 = r4
            r7 = r6
            r8 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7LG.<init>():void");
    }
}
