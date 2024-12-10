package X;

import java.util.List;

/* renamed from: X.7HK  reason: invalid class name */
public final class AnonymousClass7HK implements AnonymousClass857 {
    public final String A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7HK) {
                AnonymousClass7HK r5 = (AnonymousClass7HK) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, C17890vO.A02(this.A00, AnonymousClass000.A0L(this.A01)));
    }

    public AnonymousClass7HK(String str, List list, List list2) {
        this.A01 = list;
        this.A00 = str;
        this.A02 = list2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendMedia(media=");
        A10.append(this.A01);
        A10.append(", caption=");
        A10.append(this.A00);
        A10.append(", mentions=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
