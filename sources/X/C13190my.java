package X;

/* renamed from: X.0my  reason: invalid class name and case insensitive filesystem */
public final class C13190my extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $content;
    public final /* synthetic */ AnonymousClass0N6 $nodeState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13190my(AnonymousClass0N6 r2, AnonymousClass1OS r3) {
        super(2);
        this.$nodeState = r2;
        this.$content = r3;
    }

    public final void A00(C17130tn r4, int i) {
        if ((i & 11) != 2 || !r4.BZO()) {
            Boolean bool = (Boolean) this.$nodeState.A00.getValue();
            boolean booleanValue = bool.booleanValue();
            AnonymousClass1OS r1 = this.$content;
            r4.COD(bool);
            boolean BEg = r4.BEg(booleanValue);
            if (booleanValue) {
                r1.invoke(r4, 0);
            } else {
                r4.BI3(BEg);
            }
            r4.BKG();
            return;
        }
        r4.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
