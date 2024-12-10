package X;

import java.util.List;

/* renamed from: X.605  reason: invalid class name */
public final class AnonymousClass605 extends AnonymousClass6TC {
    public final AnonymousClass6TI A00;
    public final AnonymousClass6TJ A01;
    public final AnonymousClass6TJ A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass605) {
                AnonymousClass605 r5 = (AnonymousClass605) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A06, ((AnonymousClass001.A0k(this.A04) * 31) + AnonymousClass001.A0k(this.A05)) * 31)))));
    }

    public AnonymousClass605(AnonymousClass6TI r1, AnonymousClass6TJ r2, AnonymousClass6TJ r3, List list, List list2, List list3, List list4) {
        this.A04 = list;
        this.A05 = list2;
        this.A06 = list3;
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = list4;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Data(recentStickers=");
        A10.append(this.A04);
        A10.append(", starredStickers=");
        A10.append(this.A05);
        A10.append(", stickerPacks=");
        A10.append(this.A06);
        A10.append(", contentStickers=");
        A10.append(this.A00);
        A10.append(", shapeStickers=");
        A10.append(this.A02);
        A10.append(", receivedStickers=");
        A10.append(this.A03);
        A10.append(", recentShapes=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
