package X;

/* renamed from: X.0nj  reason: invalid class name and case insensitive filesystem */
public final class C13640nj extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ AnonymousClass20J $content;
    public final /* synthetic */ C36001nB $contentColor;
    public final /* synthetic */ long $focusedTextStyleColor;
    public final /* synthetic */ AnonymousClass0CP $inputState;
    public final /* synthetic */ boolean $showLabel;
    public final /* synthetic */ AnonymousClass0PN $tmp0_rcvr;
    public final /* synthetic */ long $unfocusedTextStyleColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13640nj(AnonymousClass0CP r2, AnonymousClass0PN r3, C36001nB r4, AnonymousClass20J r5, int i, long j, long j2, boolean z) {
        super(2);
        this.$tmp0_rcvr = r3;
        this.$inputState = r2;
        this.$focusedTextStyleColor = j;
        this.$unfocusedTextStyleColor = j2;
        this.$contentColor = r4;
        this.$showLabel = z;
        this.$content = r5;
        this.$$changed = i;
    }

    public final void A00(C17130tn r13) {
        AnonymousClass0PN r1 = this.$tmp0_rcvr;
        AnonymousClass0CP r2 = this.$inputState;
        long j = this.$focusedTextStyleColor;
        long j2 = this.$unfocusedTextStyleColor;
        C17130tn r3 = r13;
        r1.A02(r2, r3, this.$contentColor, this.$content, AnonymousClass0L8.A00(this.$$changed), j, j2, this.$showLabel);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
