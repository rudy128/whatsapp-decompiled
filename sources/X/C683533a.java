package X;

/* renamed from: X.33a  reason: invalid class name and case insensitive filesystem */
public final class C683533a implements AnonymousClass3L5 {
    public final AnonymousClass00H A00;

    public C683533a(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BCD(AnonymousClass206 r3, C61402pc r4) {
        String str;
        if (r3.A0u == 103 && ((C24641Lc) this.A00.get()).A03()) {
            if (C22971Dz.A0f(r3)) {
                str = "is_group_status_mention";
            } else {
                str = "is_status_mention";
            }
            C61402pc.A00(r4, str, "true");
        }
    }
}
