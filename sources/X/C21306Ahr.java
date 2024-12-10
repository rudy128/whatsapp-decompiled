package X;

/* renamed from: X.Ahr  reason: case insensitive filesystem */
public final class C21306Ahr implements C22528BBl {
    public String CS6() {
        return null;
    }

    public C188299hC BCN(C188729ht r10, AnonymousClass5YR r11) {
        String str;
        boolean A16 = C18070vi.A16(r11, r10);
        C199410f r2 = r10.A02;
        if (r2.isEmpty()) {
            str = "No triggers";
        } else {
            str = "Unsupported trigger";
            if (r2.size() == A16) {
                Object A0Y = C29431cG.A0Y(r2);
                if (A0Y == null) {
                    throw C17880vN.A0g();
                } else if (((C21319Ai4) r11).A0H.contains(A0Y)) {
                }
            } else {
                for (Object contains : ((C21319Ai4) r11).A0H) {
                    if (r2.contains(contains)) {
                    }
                }
            }
            return C196959vv.A00();
        }
        return new C188299hC((C186309dz) null, (C198249y2) null, (C22485B9r) null, str, (Throwable) null, false, false, false);
    }
}
