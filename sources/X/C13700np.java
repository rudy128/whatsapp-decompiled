package X;

/* renamed from: X.0np  reason: invalid class name and case insensitive filesystem */
public final class C13700np extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C36001nB $content;
    public final /* synthetic */ AnonymousClass0KK $enter;
    public final /* synthetic */ AnonymousClass0KL $exit;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C15630qw $onLookaheadMeasured = null;
    public final /* synthetic */ AnonymousClass1OS $shouldDisposeBlock;
    public final /* synthetic */ AnonymousClass0Q5 $transition;
    public final /* synthetic */ C22821Di $visible;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13700np(AnonymousClass0KK r2, AnonymousClass0KL r3, AnonymousClass0Q5 r4, C17090tj r5, C22821Di r6, AnonymousClass1OS r7, C36001nB r8, int i, int i2) {
        super(2);
        this.$transition = r4;
        this.$visible = r6;
        this.$modifier = r5;
        this.$enter = r2;
        this.$exit = r3;
        this.$shouldDisposeBlock = r7;
        this.$content = r8;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void A00(C17130tn r12) {
        AnonymousClass0Q5 r3 = this.$transition;
        C22821Di r6 = this.$visible;
        C17130tn r4 = r12;
        C03850Kw.A01(this.$enter, this.$exit, r3, r4, this.$modifier, r6, this.$shouldDisposeBlock, this.$content, AnonymousClass0L8.A00(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
