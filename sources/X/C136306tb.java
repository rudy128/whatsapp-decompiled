package X;

import java.util.List;

/* renamed from: X.6tb  reason: invalid class name and case insensitive filesystem */
public final class C136306tb {
    public final C133746pQ A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136306tb) {
                C136306tb r5 = (C136306tb) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || this.A04 != r5.A04 || !C18070vi.A18(this.A01, r5.A01) || this.A05 != r5.A05 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A03, AnonymousClass0DV.A00((AnonymousClass0DV.A00(C17900vP.A00(this.A02) * 31, this.A04) + C17900vP.A00(this.A01)) * 31, this.A05)) + C17880vN.A02(this.A00);
    }

    public C136306tb(C133746pQ r1, String str, String str2, List list, boolean z, boolean z2) {
        this.A02 = str;
        this.A04 = z;
        this.A01 = str2;
        this.A05 = z2;
        this.A03 = list;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WaBloksNavbarData(title=");
        A10.append(this.A02);
        A10.append(", hidden=");
        A10.append(this.A04);
        A10.append(", subtitle=");
        A10.append(this.A01);
        A10.append(", hideDivider=");
        A10.append(this.A05);
        A10.append(", rightButtons=");
        A10.append(this.A03);
        A10.append(", leftButton=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
