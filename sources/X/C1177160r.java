package X;

import java.util.AbstractCollection;

/* renamed from: X.60r  reason: invalid class name and case insensitive filesystem */
public final class C1177160r extends C138756xd {
    public final AnonymousClass6UU A00;
    public final String A01;

    public C1177160r(AnonymousClass6UU r2, String str) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1177160r) {
                C1177160r r5 = (C1177160r) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(AnonymousClass6UU r1, String str, AbstractCollection abstractCollection) {
        abstractCollection.add(new C1177160r(r1, str));
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17880vN.A03(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerLoading(id=");
        C138756xd.A02(A10, this.A01);
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
