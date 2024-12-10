package X;

import java.util.List;

/* renamed from: X.5zZ  reason: invalid class name and case insensitive filesystem */
public final class C117315zZ extends AnonymousClass6T6 {
    public final AnonymousClass6UV A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C117315zZ) {
                C117315zZ r5 = (C117315zZ) obj;
                if (!(C18070vi.A18(this.A01, r5.A01) && C18070vi.A18(this.A00, r5.A00) && this.A03 == r5.A03 && this.A04 == r5.A04 && this.A05 == r5.A05 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01)), this.A03), this.A04), this.A05), this.A02);
    }

    public C117315zZ(AnonymousClass6UV r1, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = list;
        this.A00 = r1;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A02 = z4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShowItems(items=");
        A10.append(this.A01);
        A10.append(", selectedCategory=");
        A10.append(this.A00);
        A10.append(", recentEnabled=");
        A10.append(this.A03);
        A10.append(", starredEnabled=");
        A10.append(this.A04);
        A10.append(", togetherEnabled=");
        A10.append(this.A05);
        A10.append(", moveToSelectedCategory=");
        return C17900vP.A0F(A10, this.A02);
    }
}
