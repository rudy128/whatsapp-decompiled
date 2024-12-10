package X;

/* renamed from: X.DtH  reason: case insensitive filesystem */
public final class C28199DtH extends AnonymousClass11G implements AnonymousClass1OS {
    public static final C28199DtH A00 = new C28199DtH();

    public C28199DtH() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C24283Byg byg;
        C16680sp r0;
        C15760rA r10 = (C15760rA) obj;
        C26047CrE crE = (C26047CrE) obj2;
        Object obj3 = crE.A02;
        if (obj3 instanceof C26038Cqy) {
            byg = C24283Byg.Paragraph;
        } else if (obj3 instanceof C26053CrN) {
            byg = C24283Byg.Span;
        } else if (obj3 instanceof BJE) {
            byg = C24283Byg.VerbatimTts;
        } else if (obj3 instanceof C25127CZa) {
            byg = C24283Byg.Url;
        } else {
            byg = C24283Byg.String;
        }
        int ordinal = byg.ordinal();
        if (ordinal == 0) {
            C18070vi.A0z(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
            r0 = C25471CgQ.A07;
        } else if (ordinal == 1) {
            C18070vi.A0z(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
            r0 = C25471CgQ.A09;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                C18070vi.A0z(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                r0 = C25471CgQ.A0E;
            }
            Object[] A1a = C108945cZ.A1a(byg, obj3, 5, 1);
            C17880vN.A1T(A1a, crE.A01, 2);
            C17880vN.A1T(A1a, crE.A00, 3);
            A1a[4] = crE.A03;
            return AnonymousClass1ZU.A05(A1a);
        } else {
            C18070vi.A0z(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
            r0 = C25471CgQ.A0F;
        }
        obj3 = C25471CgQ.A00(r0, r10, obj3);
        Object[] A1a2 = C108945cZ.A1a(byg, obj3, 5, 1);
        C17880vN.A1T(A1a2, crE.A01, 2);
        C17880vN.A1T(A1a2, crE.A00, 3);
        A1a2[4] = crE.A03;
        return AnonymousClass1ZU.A05(A1a2);
    }
}
