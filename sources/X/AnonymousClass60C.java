package X;

import java.util.List;

/* renamed from: X.60C  reason: invalid class name */
public final class AnonymousClass60C extends AnonymousClass6TE {
    public final String A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60C) {
                AnonymousClass60C r5 = (AnonymousClass60C) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02)) + C17900vP.A00(this.A00);
    }

    public AnonymousClass60C(String str, List list, List list2) {
        C18070vi.A0j(list, list2);
        this.A02 = list;
        this.A01 = list2;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerPacks(stickerPacks=");
        A10.append(this.A02);
        A10.append(", stickerGridItems=");
        A10.append(this.A01);
        A10.append(", moveToSelectedSectionId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
