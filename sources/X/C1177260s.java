package X;

import java.util.AbstractCollection;

/* renamed from: X.60s  reason: invalid class name and case insensitive filesystem */
public final class C1177260s extends C138756xd {
    public final AnonymousClass6UU A00;
    public final C1418377d A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1177260s) {
                C1177260s r5 = (C1177260s) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(AnonymousClass6UU r1, C1418377d r2, String str, AbstractCollection abstractCollection, boolean z) {
        abstractCollection.add(new C1177260s(r1, r2, str, z));
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A01, C17880vN.A03(this.A02))), this.A03);
    }

    public C1177260s(AnonymousClass6UU r1, C1418377d r2, String str, boolean z) {
        C18070vi.A0o(str, r2, r1);
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerLocal(id=");
        A10.append(this.A02);
        A10.append(", sticker=");
        C108965cb.A1S(this.A01, A10);
        A10.append(this.A00);
        A10.append(", shouldDownloadInTemporalStorage=");
        return C17900vP.A0F(A10, this.A03);
    }
}
