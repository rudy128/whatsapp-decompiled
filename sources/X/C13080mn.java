package X;

/* renamed from: X.0mn  reason: invalid class name and case insensitive filesystem */
public final class C13080mn extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $index;
    public final /* synthetic */ AnonymousClass0V1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13080mn(AnonymousClass0V1 r2, int i) {
        super(2);
        this.this$0 = r2;
        this.$index = i;
    }

    public final void A00(C17130tn r6, int i) {
        if ((i & 11) != 2 || !r6.BZO()) {
            AnonymousClass0V1 r2 = this.this$0;
            AnonymousClass0V2 r0 = r2.A01;
            int i2 = this.$index;
            C03210Hb A02 = r0.A00.A02(i2);
            ((AnonymousClass0V4) A02.A02).A00().invoke(r2.A00, Integer.valueOf(i2 - A02.A01), r6, 0);
            return;
        }
        r6.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
