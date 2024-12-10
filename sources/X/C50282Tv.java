package X;

/* renamed from: X.2Tv  reason: invalid class name and case insensitive filesystem */
public abstract class C50282Tv {
    public static boolean A00(AnonymousClass11P r10, C19830z4 r11, C18030ve r12, AnonymousClass206 r13) {
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r12, 249) && (((r13 instanceof C438421d) || (r13 instanceof AnonymousClass21X)) && C22971Dz.A0g(r13) && !C18020vd.A05(r1, r12, 1116) && (!r13.A16() || C18020vd.A05(r1, r12, 8122)))) {
            AnonymousClass00H r8 = r11.A00;
            if (C17880vN.A0B(r8).getLong("status_tab_last_opened_time", 0) != 0 && AnonymousClass11P.A01(r10) - C17880vN.A0B(r8).getLong("status_tab_last_opened_time", 0) <= 1209600000) {
                return true;
            }
            if (r11.A0R() <= 0 || System.currentTimeMillis() - r11.A0R() > 1209600000) {
                return false;
            }
            return true;
        }
        return false;
    }
}
