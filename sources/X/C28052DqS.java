package X;

/* renamed from: X.DqS  reason: case insensitive filesystem */
public final class C28052DqS extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ E6H $observer;
    public final /* synthetic */ C26958DNg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28052DqS(C26958DNg dNg, E6H e6h) {
        super(1);
        this.$observer = e6h;
        this.this$0 = dNg;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C25166CaH caH;
        CO8 co8 = (CO8) obj;
        C18070vi.A0d(co8, 0);
        E6H e6h = this.$observer;
        C26012CqT cqT = this.this$0.A00;
        synchronized (cqT.A08) {
            caH = cqT.A00;
        }
        C25137CZn cZn = new C25137CZn(caH);
        C26958DNg dNg = this.this$0;
        e6h.BKK(cZn, C26958DNg.A00(co8, dNg, AnonymousClass00R.A01), "acq", dNg.A01);
        return C27621Wu.A00;
    }
}
