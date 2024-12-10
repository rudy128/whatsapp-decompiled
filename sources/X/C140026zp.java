package X;

import java.util.List;

/* renamed from: X.6zp  reason: invalid class name and case insensitive filesystem */
public final class C140026zp {
    public final C115475u4 A00;
    public final C115445u1 A01;
    public final List A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C140026zp) {
                C140026zp r5 = (C140026zp) obj;
                if (this.A06 != r5.A06 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || this.A05 != r5.A05 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00((((AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A03, AnonymousClass3MX.A03(this.A06))) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A01)) * 31, this.A05), this.A04);
    }

    public C140026zp(C115475u4 r1, C115445u1 r2, List list, List list2, boolean z, boolean z2, boolean z3) {
        this.A06 = z;
        this.A03 = list;
        this.A02 = list2;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewState(isSaving=");
        A10.append(this.A06);
        A10.append(", avatarPoses=");
        A10.append(this.A03);
        A10.append(", avatarBackgrounds=");
        A10.append(this.A02);
        A10.append(", selectedBackground=");
        A10.append(this.A00);
        A10.append(", selectedPose=");
        C108965cb.A1T(this.A01, A10);
        A10.append(this.A05);
        A10.append(", isError=");
        return C17900vP.A0F(A10, this.A04);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C140026zp() {
        /*
            r8 = this;
            r1 = 0
            r5 = 0
            X.0wS r3 = X.C18460wS.A00
            r0 = r8
            r2 = r1
            r4 = r3
            r6 = r5
            r7 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140026zp.<init>():void");
    }
}
