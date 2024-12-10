package X;

import java.util.List;

/* renamed from: X.6tS  reason: invalid class name and case insensitive filesystem */
public final class C136216tS {
    public final int A00;
    public final AnonymousClass206 A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136216tS) {
                C136216tS r5 = (C136216tS) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00 || this.A05 != r5.A05 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, AnonymousClass0DV.A00((C17890vO.A02(this.A03, C17880vN.A03(this.A02)) + this.A00) * 31, this.A05)) + AnonymousClass001.A0k(this.A04);
    }

    public C136216tS(AnonymousClass206 r2, String str, String str2, List list, int i, boolean z) {
        C18070vi.A0j(str, str2);
        C18070vi.A0d(r2, 5);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A05 = z;
        this.A01 = r2;
        this.A04 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ReactionItem(key=");
        A10.append(this.A02);
        A10.append(", reaction=");
        A10.append(this.A03);
        A10.append(", count=");
        A10.append(this.A00);
        A10.append(", hasMyReaction=");
        A10.append(this.A05);
        A10.append(", message=");
        A10.append(this.A01);
        A10.append(", reactionSenders=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
