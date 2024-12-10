package X;

/* renamed from: X.Dtu  reason: case insensitive filesystem */
public final class C28234Dtu extends AnonymousClass11G implements AnonymousClass20G {
    public final /* synthetic */ C26596D5k this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28234Dtu(C26596D5k d5k) {
        super(4);
        this.this$0 = d5k;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object value;
        int i = ((C25823Cma) obj3).A00;
        int i2 = ((C25824Cmb) obj4).A00;
        ECY CFu = this.this$0.A04.CFu((C24693CGf) obj, (DSF) obj2, i, i2);
        if (!(CFu instanceof C26602D5s)) {
            CW4 cw4 = new CW4(CFu, this.this$0.A00);
            this.this$0.A00 = cw4;
            value = cw4.A00;
        } else {
            value = CFu.getValue();
        }
        C18070vi.A0z(value, "null cannot be cast to non-null type android.graphics.Typeface");
        return value;
    }
}
