package X;

public final class B09 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C20937Abr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B09(C20937Abr abr) {
        super(1);
        this.this$0 = abr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("description", this.this$0.A02);
        A0a.A01("offer_type", this.this$0.A04);
        A0a.A01("offer_amount_type", this.this$0.A03);
        C22565BDa bDa = this.this$0.A00;
        if (bDa != null) {
            A0a.A01("offer_amount", bDa.CPM());
        }
        C22565BDa bDa2 = this.this$0.A01;
        if (bDa2 != null) {
            A0a.A01("offer_percentage", bDa2.CPM());
        }
        return C27621Wu.A00;
    }
}
