package X;

/* renamed from: X.82m  reason: invalid class name and case insensitive filesystem */
public final class C1589082m extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $defaultBotLoadedCallback;
    public final /* synthetic */ AnonymousClass1FU $dialogActivity;
    public final /* synthetic */ C25721Pj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1589082m(AnonymousClass1FU r2, C25721Pj r3, C22821Di r4) {
        super(1);
        this.$defaultBotLoadedCallback = r4;
        this.$dialogActivity = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (obj != null) {
            this.$defaultBotLoadedCallback.invoke(obj);
        } else {
            AnonymousClass1FU r1 = this.$dialogActivity;
            r1.A44(r1.getString(2131891797));
            C42961z1 r3 = (C42961z1) this.this$0.A07.get();
            AnonymousClass1DT A0S = C108945cZ.A0S();
            AnonymousClass1E7 r0 = r3.A08;
            if (r0 != null) {
                A0S.A0F(r0);
            } else {
                r3.A02.CGN(new C21451AkI(r3, A0S, 19));
            }
            AnonymousClass1FU r32 = this.$dialogActivity;
            AnonymousClass7AT.A01(r32, A0S, new C1588982l(r32, this.this$0, this.$defaultBotLoadedCallback), 16);
        }
        return C27621Wu.A00;
    }
}
