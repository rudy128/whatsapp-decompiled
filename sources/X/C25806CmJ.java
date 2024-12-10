package X;

import java.util.Arrays;

/* renamed from: X.CmJ  reason: case insensitive filesystem */
public final class C25806CmJ {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean[] A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25806CmJ) {
                C25806CmJ cmJ = (C25806CmJ) obj;
                if (!(this.A00 == cmJ.A00 && this.A04 == cmJ.A04 && this.A03 == cmJ.A03 && this.A05 == cmJ.A05 && this.A02 == cmJ.A02 && this.A01 == cmJ.A01 && this.A06 == cmJ.A06 && C18070vi.A18(this.A07, cmJ.A07))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int A002 = AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A00), this.A04), this.A03), this.A05), this.A02), this.A01), this.A06);
        boolean[] zArr = this.A07;
        if (zArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(zArr);
        }
        return A002 + hashCode;
    }

    public C25806CmJ(boolean[] zArr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A00 = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A05 = z4;
        this.A02 = z5;
        this.A01 = z6;
        this.A06 = z7;
        this.A07 = zArr;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoHeader(inlineEverything=");
        A10.append(this.A00);
        A10.append(", selfDescribing=");
        A10.append(this.A04);
        A10.append(", outOfBandFieldErrors=");
        A10.append(this.A03);
        A10.append(", selfDescribingErrors=");
        A10.append(this.A05);
        A10.append(", nullTerminatedStrings=");
        A10.append(this.A02);
        A10.append(", noDeduplication=");
        A10.append(this.A01);
        A10.append(", hasUserFlags=");
        A10.append(this.A06);
        A10.append(", userFlags=");
        return C17900vP.A0B(Arrays.toString(this.A07), A10);
    }

    public C25806CmJ() {
        this((boolean[]) null, false, false, true, true, false, false, false);
    }
}
