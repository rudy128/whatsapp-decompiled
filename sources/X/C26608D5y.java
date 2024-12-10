package X;

import java.util.List;

/* renamed from: X.D5y  reason: case insensitive filesystem */
public final class C26608D5y implements E3W {
    public final int A00;
    public final C27069DRu A01;

    public C26608D5y(String str, int i) {
        this.A01 = new C27069DRu((List) null, 6, str);
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26608D5y) {
                C26608D5y d5y = (C26608D5y) obj;
                if (!C18070vi.A18(this.A01.A00, d5y.A01.A00) || this.A00 != d5y.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void BCW(C25844Cn0 cn0) {
        int i;
        int i2;
        int i3 = cn0.A01;
        if (i3 != -1) {
            i = cn0.A00;
        } else {
            i3 = cn0.A03;
            i = cn0.A02;
        }
        String str = this.A01.A00;
        cn0.A05(i3, i, str);
        int length = str.length();
        if (length > 0) {
            cn0.A03(i3, length + i3);
        }
        int i4 = cn0.A03;
        int i5 = cn0.A02;
        if (i4 != i5) {
            i5 = -1;
        }
        int i6 = this.A00;
        int i7 = i5 + i6;
        if (i6 > 0) {
            i2 = i7 - 1;
        } else {
            i2 = i7 - length;
        }
        int A03 = C28851b7.A03(i2, 0, cn0.A04.A00());
        cn0.A04(A03, A03);
    }

    public int hashCode() {
        return C17880vN.A03(this.A01.A00) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SetComposingTextCommand(text='");
        A10.append(this.A01.A00);
        A10.append("', newCursorPosition=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
