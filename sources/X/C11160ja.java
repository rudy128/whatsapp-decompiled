package X;

/* renamed from: X.0ja  reason: invalid class name and case insensitive filesystem */
public final class C11160ja extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0XJ $placeable;
    public final /* synthetic */ C17530uo $this_measure;
    public final /* synthetic */ AnonymousClass097 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11160ja(AnonymousClass097 r2, C17530uo r3, AnonymousClass0XJ r4) {
        super(1);
        this.this$0 = r2;
        this.$placeable = r4;
        this.$this_measure = r3;
    }

    public final void A00(AnonymousClass0QZ r6) {
        AnonymousClass097 r4 = this.this$0;
        boolean z = r4.A04;
        AnonymousClass0XJ r3 = this.$placeable;
        if (z) {
            C17530uo r2 = this.$this_measure;
            r6.A0B(r3, r2.CG9(r4.A02), r2.CG9(r4.A03));
            return;
        }
        C17530uo r1 = this.$this_measure;
        AnonymousClass0QZ.A03(r3, 0.0f, r1.CG9(r4.A02), r1.CG9(r4.A03));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((AnonymousClass0QZ) obj);
        return C27621Wu.A00;
    }
}
