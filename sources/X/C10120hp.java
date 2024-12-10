package X;

/* renamed from: X.0hp  reason: invalid class name and case insensitive filesystem */
public final class C10120hp extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0KK $enter;
    public final /* synthetic */ AnonymousClass0KL $exit;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10120hp(AnonymousClass0KK r2, AnonymousClass0KL r3) {
        super(1);
        this.$enter = r2;
        this.$exit = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass0OX r0;
        C16580sf r3 = (C16580sf) obj;
        AnonymousClass0CL r02 = AnonymousClass0CL.PreEnter;
        AnonymousClass0CL r1 = AnonymousClass0CL.Visible;
        if (C02180Da.A00(r3, r02, r1)) {
            r0 = ((AnonymousClass072) this.$enter).A00;
        } else {
            if (C02180Da.A00(r3, r1, AnonymousClass0CL.PostExit)) {
                r0 = ((AnonymousClass073) this.$exit).A00;
            }
            return C04880Ph.A00;
        }
        AnonymousClass0JC r03 = r0.A00;
        if (r03 != null) {
            return r03.A00;
        }
        return C04880Ph.A00;
    }
}
