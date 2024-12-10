package X;

import java.util.List;

/* renamed from: X.9sq  reason: invalid class name and case insensitive filesystem */
public final class C195129sq {
    public AnonymousClass9O2 A00;
    public Integer A01;
    public String A02;
    public final String A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195129sq) {
                C195129sq r5 = (C195129sq) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A02, C17880vN.A03(this.A03));
        return AnonymousClass000.A0O(this.A04, (AnonymousClass000.A0N(this.A00, A022) + AnonymousClass001.A0k(this.A01)) * 31);
    }

    public C195129sq(AnonymousClass9O2 r1, Integer num, String str, String str2, List list) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r1;
        this.A01 = num;
        this.A04 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Collection(id=");
        AnonymousClass8BT.A1W(A10, this.A03);
        A10.append(this.A02);
        A10.append(", collectionStatus=");
        A10.append(this.A00);
        A10.append(", itemCount=");
        A10.append(this.A01);
        A10.append(", products=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
