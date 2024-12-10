package X;

import java.util.List;

/* renamed from: X.60B  reason: invalid class name */
public final class AnonymousClass60B extends AnonymousClass6TE {
    public final int A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60B) {
                AnonymousClass60B r5 = (AnonymousClass60B) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02)) + this.A00;
    }

    public AnonymousClass60B(List list, List list2, int i) {
        this.A02 = list;
        this.A01 = list2;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnPackSelected(stickerPacks=");
        A10.append(this.A02);
        A10.append(", stickerGridItems=");
        A10.append(this.A01);
        A10.append(", selectedIndex=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
