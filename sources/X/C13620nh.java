package X;

/* renamed from: X.0nh  reason: invalid class name and case insensitive filesystem */
public final class C13620nh extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ AnonymousClass1OS $bottomBar;
    public final /* synthetic */ C36001nB $content;
    public final /* synthetic */ C17100tk $contentWindowInsets;
    public final /* synthetic */ AnonymousClass1OS $fab;
    public final /* synthetic */ int $fabPosition;
    public final /* synthetic */ AnonymousClass1OS $snackbar;
    public final /* synthetic */ AnonymousClass1OS $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13620nh(C17100tk r2, AnonymousClass1OS r3, AnonymousClass1OS r4, AnonymousClass1OS r5, AnonymousClass1OS r6, C36001nB r7, int i, int i2) {
        super(2);
        this.$fabPosition = i;
        this.$topBar = r3;
        this.$content = r7;
        this.$snackbar = r4;
        this.$fab = r5;
        this.$contentWindowInsets = r2;
        this.$bottomBar = r6;
        this.$$changed = i2;
    }

    public final void A00(C17130tn r11) {
        int i = this.$fabPosition;
        AnonymousClass1OS r3 = this.$topBar;
        C36001nB r7 = this.$content;
        C17130tn r2 = r11;
        AnonymousClass0P9.A01(this.$contentWindowInsets, r2, r3, this.$snackbar, this.$fab, this.$bottomBar, r7, i, AnonymousClass0L8.A00(this.$$changed));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
