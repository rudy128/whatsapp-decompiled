package X;

public final class B00 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AE0 $flowConfiguration;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B00(AE0 ae0) {
        super(1);
        this.$flowConfiguration = ae0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("flow_id", this.$flowConfiguration.A00);
        A0a.A01("flow_message_version", this.$flowConfiguration.A01);
        A0a.A01("flow_token", this.$flowConfiguration.A02);
        return C27621Wu.A00;
    }
}
