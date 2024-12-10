package X;

public final class B07 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C20934Abo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B07(C20934Abo abo) {
        super(1);
        this.this$0 = abo;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        String str = this.this$0.A00;
        if (!(str == null || str.length() == 0)) {
            A0a.A01("code", str);
        }
        A0a.A01("merchant_name", this.this$0.A01);
        A0a.A01("key", this.this$0.A02);
        A0a.A01("key_type", this.this$0.A03);
        return C27621Wu.A00;
    }
}
