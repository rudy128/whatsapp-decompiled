package X;

import java.util.List;

/* renamed from: X.6H8  reason: invalid class name */
public final class AnonymousClass6H8 extends C123206Tn {
    public final AnonymousClass725 A00;
    public final List A01;

    public AnonymousClass6H8(AnonymousClass725 r2, List list) {
        C18070vi.A0d(list, 2);
        this.A00 = r2;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6H8) {
                AnonymousClass6H8 r5 = (AnonymousClass6H8) obj;
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(pack=");
        A10.append(this.A00);
        A10.append(", stickers=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
