package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.0ng  reason: invalid class name and case insensitive filesystem */
public final class C13610ng extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ AnonymousClass1OS $bottomBar;
    public final /* synthetic */ C36001nB $content;
    public final /* synthetic */ C17100tk $contentWindowInsets;
    public final /* synthetic */ AnonymousClass1OS $fab;
    public final /* synthetic */ int $fabPosition;
    public final /* synthetic */ AnonymousClass1OS $snackbar;
    public final /* synthetic */ AnonymousClass1OS $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13610ng(C17100tk r2, AnonymousClass1OS r3, AnonymousClass1OS r4, AnonymousClass1OS r5, AnonymousClass1OS r6, C36001nB r7, int i, int i2) {
        super(2);
        this.$topBar = r3;
        this.$snackbar = r4;
        this.$fab = r5;
        this.$fabPosition = i;
        this.$contentWindowInsets = r2;
        this.$bottomBar = r6;
        this.$$dirty = i2;
        this.$content = r7;
    }

    public final C16820tH A00(C17520un r20, long j) {
        C17520un r2 = r20;
        C18070vi.A0d(r2, 0);
        long j2 = j;
        int A01 = Constraints.A01(j2);
        int A00 = Constraints.A00(j2);
        long A04 = Constraints.A04(0, 0, 0, 0, 10, j2);
        AnonymousClass1OS r3 = this.$topBar;
        AnonymousClass1OS r4 = this.$snackbar;
        AnonymousClass1OS r5 = this.$fab;
        int i = this.$fabPosition;
        return r2.BhL(AnonymousClass1D7.A0I(), new C11530kF(this.$contentWindowInsets, r2, r3, r4, r5, this.$bottomBar, this.$content, i, A01, this.$$dirty, A00, A04), A01, A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return A00((C17520un) obj, ((Constraints) obj2).A0B());
    }
}
