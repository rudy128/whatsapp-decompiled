package X;

import java.util.List;

/* renamed from: X.2mj  reason: invalid class name and case insensitive filesystem */
public final class C59692mj {
    public final int A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59692mj) {
                C59692mj r5 = (C59692mj) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || this.A05 != r5.A05 || this.A04 != r5.A04 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A03)) + C17900vP.A00(this.A01)) * 31, this.A05), this.A04) + this.A00;
    }

    public C59692mj(String str, List list, List list2, int i, boolean z, boolean z2) {
        this.A03 = list;
        this.A02 = list2;
        this.A01 = str;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingData(inactiveAccounts=");
        A10.append(this.A03);
        A10.append(", allAccounts=");
        A10.append(this.A02);
        A10.append(", paymentsOnboardedLid=");
        A10.append(this.A01);
        A10.append(", shownMeTabMenuItemToolTip=");
        A10.append(this.A05);
        A10.append(", isCompanionModeEnabled=");
        A10.append(this.A04);
        A10.append(", currentMaxMultiAccUniqueDirId=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
