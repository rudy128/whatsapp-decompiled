package X;

import java.util.List;

/* renamed from: X.Ai8  reason: case insensitive filesystem */
public final class C21323Ai8 implements B6R {
    public final String A00;
    public final String A01;
    public final List A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new C21937Av1(this));

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C21323Ai8) {
                C21323Ai8 ai8 = (C21323Ai8) obj;
                if (!C18070vi.A18(this.A01, ai8.A01) || !C18070vi.A18(this.A00, ai8.A00) || !C18070vi.A18(this.A02, ai8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, C17890vO.A02(this.A00, C17880vN.A03(this.A01)));
    }

    public C21323Ai8(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BatchGetGroupInfoRequest(iqId=");
        A10.append(this.A01);
        A10.append(", context=");
        A10.append(this.A00);
        A10.append(", groupJids=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
