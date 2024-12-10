package X;

import org.json.JSONObject;

/* renamed from: X.7vt  reason: invalid class name and case insensitive filesystem */
public final class C157157vt extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C134466qd $fbUserEntity;
    public final /* synthetic */ C129506hu this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157157vt(C134466qd r2, C129506hu r3) {
        super(0);
        this.this$0 = r3;
        this.$fbUserEntity = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object A00 = this.$fbUserEntity.A00.A00("XFAM_CROSSPOSTING_FB_ACCOUNT_CACHE");
        JSONObject A15 = C17880vN.A15();
        A15.put("access_token", A00);
        String A01 = ((C58612ky) this.this$0.A02.get()).A01(C18070vi.A0H(A15));
        this.this$0.A00.set(this.$fbUserEntity);
        C17880vN.A1E(C61422pf.A00((C61422pf) this.this$0.A03.get()).edit(), "pref_xfamily_fb_account_info", A01);
        C17880vN.A1D(C61422pf.A00((C61422pf) this.this$0.A03.get()).edit(), "pref_xfamily_fb_account_update_time", AnonymousClass11P.A01(this.this$0.A01));
        return C27621Wu.A00;
    }
}
