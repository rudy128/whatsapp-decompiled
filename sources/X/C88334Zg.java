package X;

import java.util.List;

/* renamed from: X.4Zg  reason: invalid class name and case insensitive filesystem */
public final class C88334Zg {
    public final String A00;
    public final List A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88334Zg() {
        /*
            r8 = this;
            r6 = 0
            java.lang.String r3 = ""
            r0 = 3
            X.5Y3[] r2 = new X.AnonymousClass5Y3[r0]
            r1 = 1
            X.4oH r0 = new X.4oH
            r0.<init>(r6)
            r2[r6] = r0
            X.4oB r0 = new X.4oB
            r0.<init>()
            r2[r1] = r0
            X.4oF r1 = X.C96684oF.A00
            r0 = 2
            java.util.List r4 = X.C18070vi.A0O(r1, r2, r0)
            X.0wS r5 = X.C18460wS.A00
            r2 = r8
            r7 = r6
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88334Zg.<init>():void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88334Zg) {
                C88334Zg r5 = (C88334Zg) obj;
                if (this.A03 != r5.A03 || this.A04 != r5.A04 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, C17890vO.A02(this.A00, AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A03), this.A04))));
    }

    public static String A00(AnonymousClass1G4 r0) {
        return ((C88334Zg) r0.getValue()).A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewState(isEdit=");
        A10.append(this.A03);
        A10.append(", isManage=");
        A10.append(this.A04);
        A10.append(", listName=");
        A10.append(this.A00);
        A10.append(", uiConfig=");
        A10.append(this.A02);
        A10.append(", conversations=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    public C88334Zg(String str, List list, List list2, boolean z, boolean z2) {
        this.A03 = z;
        this.A04 = z2;
        this.A00 = str;
        this.A02 = list;
        this.A01 = list2;
    }
}
