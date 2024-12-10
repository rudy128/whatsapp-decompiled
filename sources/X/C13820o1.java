package X;

/* renamed from: X.0o1  reason: invalid class name and case insensitive filesystem */
public final class C13820o1 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass1OS $bottomBar;
    public final /* synthetic */ long $containerColor;
    public final /* synthetic */ C36001nB $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ C17100tk $contentWindowInsets;
    public final /* synthetic */ AnonymousClass1OS $floatingActionButton;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ AnonymousClass1OS $snackbarHost;
    public final /* synthetic */ AnonymousClass1OS $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13820o1(C17100tk r2, C17090tj r3, AnonymousClass1OS r4, AnonymousClass1OS r5, AnonymousClass1OS r6, AnonymousClass1OS r7, C36001nB r8, int i, int i2, int i3, long j, long j2) {
        super(2);
        this.$modifier = r3;
        this.$topBar = r4;
        this.$bottomBar = r5;
        this.$snackbarHost = r6;
        this.$floatingActionButton = r7;
        this.$floatingActionButtonPosition = i;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$contentWindowInsets = r2;
        this.$content = r8;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public final void A00(C17130tn r18) {
        C17130tn r3 = r18;
        AnonymousClass0P9.A00(this.$contentWindowInsets, r3, this.$modifier, this.$topBar, this.$bottomBar, this.$snackbarHost, this.$floatingActionButton, this.$content, this.$floatingActionButtonPosition, AnonymousClass0L8.A00(this.$$changed), this.$$default, this.$containerColor, this.$contentColor);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
