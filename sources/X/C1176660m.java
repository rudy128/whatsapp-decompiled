package X;

import java.util.List;

/* renamed from: X.60m  reason: invalid class name and case insensitive filesystem */
public final class C1176660m extends C138756xd {
    public final AnonymousClass6UU A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1176660m) {
                C1176660m r5 = (C1176660m) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C1176660m(AnonymousClass6UU r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, 115761974));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContentStickersSection(id=");
        C138756xd.A02(A10, "content_stickers_remake_section");
        A10.append(this.A00);
        A10.append(", stickers=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
