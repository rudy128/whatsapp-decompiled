package X;

import java.util.List;

/* renamed from: X.7HL  reason: invalid class name */
public final class AnonymousClass7HL implements AnonymousClass857 {
    public final AnonymousClass8B2 A00;
    public final String A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7HL) {
                AnonymousClass7HL r5 = (AnonymousClass7HL) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, C17890vO.A02(this.A01, AnonymousClass000.A0L(this.A00)));
    }

    public AnonymousClass7HL(AnonymousClass8B2 r1, String str, List list) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShowMedia(media=");
        A10.append(this.A00);
        A10.append(", caption=");
        A10.append(this.A01);
        A10.append(", mentions=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
