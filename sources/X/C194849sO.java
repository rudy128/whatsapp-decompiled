package X;

import java.util.List;

/* renamed from: X.9sO  reason: invalid class name and case insensitive filesystem */
public final class C194849sO {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public C194849sO(String str, String str2, List list, List list2) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194849sO) {
                C194849sO r5 = (C194849sO) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A03, C17880vN.A03(this.A00))) + C17900vP.A00(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AdditionalBusinessData(jid=");
        A10.append(this.A00);
        A10.append(", fbIgPostImageUrls=");
        A10.append(this.A03);
        A10.append(", catalogProductImageUrls=");
        A10.append(this.A02);
        A10.append(", productDescription=");
        return C17900vP.A0B(this.A01, A10);
    }
}
