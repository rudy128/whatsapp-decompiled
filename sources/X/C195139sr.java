package X;

import java.util.List;

/* renamed from: X.9sr  reason: invalid class name and case insensitive filesystem */
public final class C195139sr {
    public final AEI A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195139sr) {
                C195139sr r5 = (C195139sr) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A04 != r5.A04 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, AnonymousClass000.A0N(this.A00, AnonymousClass0DV.A00(C17890vO.A02(this.A02, C17880vN.A03(this.A01)), this.A04)));
    }

    public C195139sr(AEI aei, String str, String str2, List list, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A00 = aei;
        this.A03 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Category(categoryId=");
        AnonymousClass8BT.A1W(A10, this.A01);
        A10.append(this.A02);
        A10.append(", isLastLevel=");
        A10.append(this.A04);
        A10.append(", image=");
        A10.append(this.A00);
        A10.append(", subCategoryIds=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
