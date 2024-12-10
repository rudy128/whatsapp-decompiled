package X;

import androidx.compose.material3.AppBarKt;

/* renamed from: X.0nw  reason: invalid class name and case insensitive filesystem */
public final class C13770nw extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C36001nB $actions;
    public final /* synthetic */ boolean $centeredTitle;
    public final /* synthetic */ C03580Iv $colors;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ AnonymousClass1OS $navigationIcon;
    public final /* synthetic */ C15730r6 $scrollBehavior = null;
    public final /* synthetic */ AnonymousClass1OS $title;
    public final /* synthetic */ C26251Cvq $titleTextStyle;
    public final /* synthetic */ C17100tk $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13770nw(C17100tk r2, C03580Iv r3, C17090tj r4, C26251Cvq cvq, AnonymousClass1OS r6, AnonymousClass1OS r7, C36001nB r8, int i, int i2, boolean z) {
        super(2);
        this.$modifier = r4;
        this.$title = r6;
        this.$titleTextStyle = cvq;
        this.$centeredTitle = z;
        this.$navigationIcon = r7;
        this.$actions = r8;
        this.$windowInsets = r2;
        this.$colors = r3;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void A00(C17130tn r13) {
        C17090tj r4 = this.$modifier;
        AnonymousClass1OS r6 = this.$title;
        C26251Cvq cvq = this.$titleTextStyle;
        boolean z = this.$centeredTitle;
        C17130tn r3 = r13;
        AppBarKt.A02(this.$windowInsets, this.$colors, r3, r4, cvq, r6, this.$navigationIcon, this.$actions, AnonymousClass0L8.A00(this.$$changed), this.$$default, z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
