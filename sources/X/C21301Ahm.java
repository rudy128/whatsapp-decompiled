package X;

/* renamed from: X.Ahm  reason: case insensitive filesystem */
public final class C21301Ahm implements C22528BBl {
    public C188299hC BCN(C188729ht r11, AnonymousClass5YR r12) {
        boolean z;
        C21312Ahx ahx;
        C18070vi.A0h(r12, r11);
        C21319Ai4 ai4 = (C21319Ai4) r12;
        r11.A04.A00(ai4.A0F);
        long j = ai4.A05 * 1000;
        long j2 = ai4.A03 * 1000;
        long j3 = r11.A00;
        if ((j == 0 || j3 > j) && (j2 == 0 || j3 < j2)) {
            z = true;
        } else {
            z = false;
        }
        if (r11.A0A == AnonymousClass00R.A00) {
            ahx = new C21312Ahx(j, j2, j3);
        } else {
            ahx = null;
        }
        if (z) {
            return C196959vv.A01(ahx);
        }
        return new C188299hC((C186309dz) null, (C198249y2) null, ahx, (String) null, (Throwable) null, false, false, false);
    }

    public String CS6() {
        return "client_enabled_time";
    }
}
