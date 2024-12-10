package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.6zL  reason: invalid class name and case insensitive filesystem */
public final class C139726zL {
    public final String A00;

    public C139726zL(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C139726zL) && C18070vi.A18(this.A00, ((C139726zL) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(new C139726zL((String) it.next()));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarStickerStableId(stableId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
