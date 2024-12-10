package X;

import java.util.List;

/* renamed from: X.7Cr  reason: invalid class name and case insensitive filesystem */
public final class C143257Cr implements C1594084k {
    public AnonymousClass6RQ A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public C143257Cr(AnonymousClass6RQ r2, String str, String str2, List list, boolean z, boolean z2) {
        C18070vi.A0d(r2, 4);
        this.A02 = str;
        this.A03 = list;
        this.A00 = r2;
        this.A05 = z;
        this.A04 = z2;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C143257Cr) {
                C143257Cr r5 = (C143257Cr) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00 || this.A05 != r5.A05 || this.A04 != r5.A04 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A032 = C17880vN.A03(this.A02);
        return C108945cZ.A09(this.A01, AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A00, (AnonymousClass000.A0N(this.A03, A032) + 1237) * 31), this.A05), this.A04));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Section(section=");
        A10.append(this.A02);
        A10.append(", bots=");
        A10.append(this.A03);
        C108975cc.A15(A10, ", large=");
        A10.append(", renderType=");
        A10.append(this.A00);
        A10.append(", showSeeAllEntryPoint=");
        A10.append(this.A05);
        A10.append(", shimmer=");
        A10.append(this.A04);
        A10.append(", id=");
        return C17900vP.A0B(this.A01, A10);
    }
}
