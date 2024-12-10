package X;

/* renamed from: X.Awd  reason: case insensitive filesystem */
public final class C22037Awd extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BAU $listener;
    public final /* synthetic */ String $purpose = "XFAM_WFS";
    public final /* synthetic */ int $purposePolicyId;
    public final /* synthetic */ C193599qM $userEntityForNativeAuth;
    public final /* synthetic */ C198779yt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22037Awd(BAU bau, C198779yt r4, C193599qM r5) {
        super(0);
        this.this$0 = r4;
        this.$userEntityForNativeAuth = r5;
        this.$listener = bau;
        this.$purposePolicyId = 3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C187899gY r0 = (C187899gY) this.$userEntityForNativeAuth.A01.A00(this.$purpose);
        String str = null;
        if (r0 != null) {
            str = r0.A06;
        }
        C42771yi A00 = C42771yi.A00();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('+');
        if (str == null) {
            str = "";
        }
        C42811ym A0H = A00.A0H(AnonymousClass000.A0y(str, A10), (String) null);
        AnonymousClass1D6 A01 = AnonymousClass1D6.A01(String.valueOf(A0H.countryCode_), String.valueOf(A0H.nationalNumber_));
        if (!AnonymousClass8BV.A1S(this.this$0.A0A) || C17880vN.A0I(this.this$0.A0A).A05((String) A01.first, (String) A01.second) == null) {
            Object A0w = AnonymousClass000.A0w(this.this$0.A0F, 551495536);
            if (A0w != null) {
                C30101dO r4 = (C30101dO) A0w;
                r4.A04("PRECHAT_START");
                C198499yR A0M = this.this$0.A07.A0M((String) A01.first, (String) A01.second);
                if (A0M != null) {
                    String str2 = A0M.A03;
                    String str3 = A0M.A04;
                    if (str2 != null) {
                        if (str3 != null) {
                            C17880vN.A1E(AnonymousClass8BV.A06(this.this$0.A03.A00), "pref_pre_chatd_ab_hash", str2);
                            this.this$0.A05.A07(str3);
                        }
                    }
                    this.this$0.A00.CGP(new C98824rm(this.$listener, this.$userEntityForNativeAuth, A01, this.$purpose, this.$purposePolicyId, 3));
                }
                r4.A04("PRECHAT_ERROR");
                C198779yt.A00(this.$listener, this.this$0, AnonymousClass000.A0n("Could not retrieve prechatd abprops"));
            } else {
                throw C17880vN.A0g();
            }
        } else {
            C198779yt.A00(this.$listener, this.this$0, AnonymousClass000.A0n("Phone number already registered"));
        }
        return C27621Wu.A00;
    }
}
