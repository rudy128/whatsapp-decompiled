package X;

import java.util.List;

/* renamed from: X.Dra  reason: case insensitive filesystem */
public final class C28116Dra extends AnonymousClass11G implements C22821Di {
    public static final C28116Dra A00 = new C28116Dra();

    public C28116Dra() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C27069DRu dRu;
        List A13 = BE6.A13(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object obj2 = A13.get(0);
        C16680sp r2 = C25471CgQ.A00;
        C26260Cw5 cw5 = null;
        if (C18070vi.A18(obj2, false) || obj2 == null) {
            dRu = null;
        } else {
            dRu = (C27069DRu) r2.CFy(obj2);
        }
        C18070vi.A0b(dRu);
        Object obj3 = A13.get(1);
        C16680sp r3 = C25471CgQ.A0D;
        if (!C18070vi.A18(obj3, false) && obj3 != null) {
            cw5 = (C26260Cw5) r3.CFy(obj3);
        }
        C18070vi.A0b(cw5);
        return new C26224CvE(dRu, (C26260Cw5) null, cw5.A00);
    }
}
