package X;

import java.util.List;

/* renamed from: X.6Dw  reason: invalid class name and case insensitive filesystem */
public final class C120486Dw extends C126206cM {
    public final C123096Tc A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C120486Dw) {
                C120486Dw r5 = (C120486Dw) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120486Dw(C123096Tc r1, List list) {
        super(r1);
        C18070vi.A0j(r1, list);
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(searchType=");
        A10.append(this.A00);
        A10.append(", stickers=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
