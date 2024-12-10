package X;

public final class B05 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C20926Abg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B05(C20926Abg abg) {
        super(1);
        this.this$0 = abg;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("enabled", Boolean.valueOf(this.this$0.A01));
        String str = this.this$0.A00;
        if (!(str == null || str.length() == 0)) {
            A0a.A01("configuration_name", str);
        }
        A0a.A01("payment_gateway_checkout_enabled", Boolean.valueOf(this.this$0.A02));
        return C27621Wu.A00;
    }
}
