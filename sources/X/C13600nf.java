package X;

/* renamed from: X.0nf  reason: invalid class name and case insensitive filesystem */
public final class C13600nf extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ AnonymousClass1OS $bottomBar;
    public final /* synthetic */ C36001nB $content;
    public final /* synthetic */ C17100tk $contentWindowInsets;
    public final /* synthetic */ AnonymousClass1OS $floatingActionButton;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ AnonymousClass1OS $snackbarHost;
    public final /* synthetic */ AnonymousClass1OS $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13600nf(C17100tk r2, AnonymousClass1OS r3, AnonymousClass1OS r4, AnonymousClass1OS r5, AnonymousClass1OS r6, C36001nB r7, int i, int i2) {
        super(2);
        this.$floatingActionButtonPosition = i;
        this.$topBar = r3;
        this.$content = r7;
        this.$snackbarHost = r4;
        this.$floatingActionButton = r5;
        this.$contentWindowInsets = r2;
        this.$bottomBar = r6;
        this.$$dirty = i2;
    }

    public final void A00(C17130tn r13, int i) {
        C17130tn r4 = r13;
        if ((i & 11) != 2 || !r13.BZO()) {
            int i2 = this.$floatingActionButtonPosition;
            AnonymousClass1OS r5 = this.$topBar;
            C36001nB r9 = this.$content;
            AnonymousClass1OS r6 = this.$snackbarHost;
            AnonymousClass1OS r7 = this.$floatingActionButton;
            C17100tk r3 = this.$contentWindowInsets;
            AnonymousClass1OS r8 = this.$bottomBar;
            int i3 = this.$$dirty;
            AnonymousClass0P9.A01(r3, r4, r5, r6, r7, r8, r9, i2, ((i3 >> 15) & 14) | (i3 & 112) | ((i3 >> 21) & 896) | (i3 & 7168) | (57344 & i3) | ((i3 >> 9) & 458752) | ((i3 << 12) & 3670016));
            return;
        }
        r13.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
