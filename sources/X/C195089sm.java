package X;

import java.util.List;

/* renamed from: X.9sm  reason: invalid class name and case insensitive filesystem */
public final class C195089sm {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public C195089sm(String str, String str2, String str3, List list, List list2) {
        C18070vi.A0g(list, 4, list2);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = list;
        this.A04 = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C195089sm)) {
            return false;
        }
        C195089sm r4 = (C195089sm) obj;
        if (!C18070vi.A18(this.A02, r4.A02) || !C18070vi.A18(this.A00, r4.A00) || !C18070vi.A18(this.A01, r4.A01) || !C18070vi.A18(this.A03, r4.A03)) {
            return false;
        }
        return C18070vi.A18(this.A04, r4.A04);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A04, AnonymousClass000.A0N(this.A03, C17890vO.A02(this.A01, C17890vO.A02(this.A00, C17880vN.A03(this.A02)))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ForeignKey{referenceTable='");
        A10.append(this.A02);
        A10.append("', onDelete='");
        A10.append(this.A00);
        A10.append(" +', onUpdate='");
        A10.append(this.A01);
        A10.append("', columnNames=");
        A10.append(this.A03);
        A10.append(", referenceColumnNames=");
        return AnonymousClass8BX.A0c(this.A04, A10);
    }
}
