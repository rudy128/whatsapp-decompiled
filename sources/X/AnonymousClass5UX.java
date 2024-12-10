package X;

/* renamed from: X.5UX  reason: invalid class name */
public final class AnonymousClass5UX extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Integer $indexOfUri;
    public final /* synthetic */ C88204Ys this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UX(C88204Ys r2, Integer num) {
        super(1);
        this.this$0 = r2;
        this.$indexOfUri = num;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C77873rd r1 = this.this$0.A00;
        if (r1 != null) {
            int intValue = this.$indexOfUri.intValue();
            C73543Wj r12 = r1.A05;
            if (intValue >= 0 && intValue < r12.A04.size()) {
                r12.A0G(intValue);
            }
        }
        return C27621Wu.A00;
    }
}
