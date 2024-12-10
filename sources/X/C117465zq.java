package X;

import java.util.List;

/* renamed from: X.5zq  reason: invalid class name and case insensitive filesystem */
public final class C117465zq extends AnonymousClass6TA {
    public final Integer A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C117465zq) {
                C117465zq r5 = (C117465zq) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02)) + 1231) * 31) + AnonymousClass001.A0k(this.A00);
    }

    public C117465zq(Integer num, List list, List list2) {
        this.A02 = list;
        this.A01 = list2;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmojiData(sections=");
        A10.append(this.A02);
        A10.append(", items=");
        A10.append(this.A01);
        C108975cc.A16(A10, ", isFinalData=");
        A10.append(", qplInstanceKey=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
