package X;

import java.util.List;

/* renamed from: X.5zl  reason: invalid class name and case insensitive filesystem */
public final class C117425zl extends AnonymousClass6T9 {
    public final List A00;
    public final List A01;
    public final Integer A02;

    public C117425zl(Integer num, List list, List list2) {
        C18070vi.A0d(list2, 2);
        this.A01 = list;
        this.A00 = list2;
        this.A02 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C117425zl) {
                C117425zl r5 = (C117425zl) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01)) + AnonymousClass001.A0k(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmojiGrid(sections=");
        A10.append(this.A01);
        A10.append(", items=");
        A10.append(this.A00);
        A10.append(", qplInstanceKey=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
