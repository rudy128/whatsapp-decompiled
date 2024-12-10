package X;

import androidx.compose.material3.AppBarKt;

/* renamed from: X.0o6  reason: invalid class name and case insensitive filesystem */
public final class C13870o6 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ long $actionIconContentColor;
    public final /* synthetic */ AnonymousClass1OS $actions;
    public final /* synthetic */ float $heightPx;
    public final /* synthetic */ boolean $hideTitleSemantics;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ AnonymousClass1OS $navigationIcon;
    public final /* synthetic */ long $navigationIconContentColor;
    public final /* synthetic */ AnonymousClass1OS $title;
    public final /* synthetic */ float $titleAlpha;
    public final /* synthetic */ int $titleBottomPadding;
    public final /* synthetic */ long $titleContentColor;
    public final /* synthetic */ C16120rk $titleHorizontalArrangement;
    public final /* synthetic */ C26251Cvq $titleTextStyle;
    public final /* synthetic */ C16130rl $titleVerticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13870o6(C16120rk r3, C16130rl r4, C17090tj r5, C26251Cvq cvq, AnonymousClass1OS r7, AnonymousClass1OS r8, AnonymousClass1OS r9, float f, float f2, int i, int i2, int i3, long j, long j2, long j3, boolean z) {
        super(2);
        this.$modifier = r5;
        this.$heightPx = f;
        this.$navigationIconContentColor = j;
        this.$titleContentColor = j2;
        this.$actionIconContentColor = j3;
        this.$title = r7;
        this.$titleTextStyle = cvq;
        this.$titleAlpha = f2;
        this.$titleVerticalArrangement = r4;
        this.$titleHorizontalArrangement = r3;
        this.$titleBottomPadding = i;
        this.$hideTitleSemantics = z;
        this.$navigationIcon = r8;
        this.$actions = r9;
        this.$$changed = i2;
        this.$$changed1 = i3;
    }

    public final void A00(C17130tn r35) {
        C17090tj r33 = this.$modifier;
        float f = this.$heightPx;
        long j = this.$navigationIconContentColor;
        long j2 = this.$titleContentColor;
        long j3 = this.$actionIconContentColor;
        AnonymousClass1OS r16 = this.$title;
        C26251Cvq cvq = this.$titleTextStyle;
        float f2 = this.$titleAlpha;
        C16130rl r11 = this.$titleVerticalArrangement;
        C16120rk r10 = this.$titleHorizontalArrangement;
        int i = this.$titleBottomPadding;
        boolean z = this.$hideTitleSemantics;
        AnonymousClass1OS r7 = this.$navigationIcon;
        AnonymousClass1OS r18 = r16;
        AnonymousClass1OS r19 = r7;
        AnonymousClass1OS r20 = this.$actions;
        float f3 = f;
        C16130rl r14 = r11;
        C17090tj r162 = r33;
        C26251Cvq cvq2 = cvq;
        C16120rk r13 = r10;
        AppBarKt.A00(r13, r14, r35, r162, cvq2, r18, r19, r20, f3, f2, i, AnonymousClass0L8.A00(this.$$changed), AnonymousClass0L8.A01(this.$$changed1), j, j2, j3, z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
