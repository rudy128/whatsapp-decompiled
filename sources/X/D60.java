package X;

import java.util.List;

public final class D60 implements E3W {
    public final int A00;
    public final C27069DRu A01;

    public D60(String str, int i) {
        this(new C27069DRu((List) null, 6, str), i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof D60) {
                D60 d60 = (D60) obj;
                if (!C18070vi.A18(this.A01.A00, d60.A01.A00) || this.A00 != d60.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void BCW(C25844Cn0 cn0) {
        int i;
        int length;
        int i2 = cn0.A01;
        if (i2 != -1) {
            i = cn0.A00;
        } else {
            i2 = cn0.A03;
            i = cn0.A02;
        }
        String str = this.A01.A00;
        cn0.A05(i2, i, str);
        int i3 = cn0.A03;
        int i4 = cn0.A02;
        if (i3 != i4) {
            i4 = -1;
        }
        int i5 = this.A00;
        int i6 = i4 + i5;
        if (i5 > 0) {
            length = i6 - 1;
        } else {
            length = i6 - str.length();
        }
        int A03 = C28851b7.A03(length, 0, cn0.A04.A00());
        cn0.A04(A03, A03);
    }

    public int hashCode() {
        return C17880vN.A03(this.A01.A00) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CommitTextCommand(text='");
        A10.append(this.A01.A00);
        A10.append("', newCursorPosition=");
        return AnonymousClass001.A1L(A10, this.A00);
    }

    public D60(C27069DRu dRu, int i) {
        this.A01 = dRu;
        this.A00 = i;
    }
}
