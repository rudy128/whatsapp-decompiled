package X;

import java.util.List;

/* renamed from: X.9rz  reason: invalid class name and case insensitive filesystem */
public final class C194599rz {
    public final String A00;
    public final String A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194599rz) {
                C194599rz r5 = (C194599rz) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, ((C17900vP.A00(this.A00) * 31) + C17900vP.A00(this.A01)) * 31);
    }

    public C194599rz(String str, String str2, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageButtonsDecoration(content=");
        A10.append(this.A00);
        A10.append(", footer=");
        A10.append(this.A01);
        A10.append(", buttons=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
