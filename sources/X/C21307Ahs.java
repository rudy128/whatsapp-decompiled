package X;

/* renamed from: X.Ahs  reason: case insensitive filesystem */
public final class C21307Ahs implements C22528BBl {
    public final C196969vw A00 = new Object();

    public C188299hC BCN(C188729ht r10, AnonymousClass5YR r11) {
        C187039fA r2;
        C21308Aht aht;
        C18070vi.A0h(r11, r10);
        C198249y2 r4 = ((C21319Ai4) r11).A08.A00;
        if (r4.A00 != AnonymousClass00R.A0N) {
            boolean A1Z = AnonymousClass000.A1Z(r10.A0A, AnonymousClass00R.A00);
            try {
                r2 = C196969vw.A00(r4, r10, this.A00, r11, A1Z);
            } catch (C180059Ky | IllegalArgumentException | NullPointerException unused) {
                r2 = new C187039fA((AnonymousClass1IX) null, r4, false, A1Z);
            }
            if (!r2.A03) {
                if (r2.A02) {
                    aht = new C21308Aht(r2.A00);
                } else {
                    aht = null;
                }
                AnonymousClass1IX r1 = r2.A00;
                if (r1 == null || r1.isEmpty()) {
                    C198249y2 r22 = r2.A01;
                    if (r22 != null) {
                        return new C188299hC((C186309dz) null, r22, aht, "Failed filter clause", (Throwable) null, false, false, false);
                    }
                    return new C188299hC((C186309dz) null, (C198249y2) null, aht, (String) null, (Throwable) null, false, false, false);
                }
                C186309dz r12 = (C186309dz) C108955ca.A0p(r1);
                C72453Mb.A1S(r12);
                return new C188299hC(r12, (C198249y2) null, aht, "Failed context filter", (Throwable) null, false, false, false);
            }
        }
        return C196959vv.A00();
    }

    public String CS6() {
        return "client_filters";
    }
}
