package X;

import androidx.compose.material3.AppBarKt;

/* renamed from: X.0nn  reason: invalid class name and case insensitive filesystem */
public final class C13680nn extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C36001nB $actions;
    public final /* synthetic */ C03580Iv $colors;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ AnonymousClass1OS $navigationIcon;
    public final /* synthetic */ C15730r6 $scrollBehavior = null;
    public final /* synthetic */ AnonymousClass1OS $title;
    public final /* synthetic */ C17100tk $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13680nn(C17100tk r2, C03580Iv r3, C17090tj r4, AnonymousClass1OS r5, AnonymousClass1OS r6, C36001nB r7, int i, int i2) {
        super(2);
        this.$title = r5;
        this.$modifier = r4;
        this.$navigationIcon = r6;
        this.$actions = r7;
        this.$windowInsets = r2;
        this.$colors = r3;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void A00(C17130tn r11) {
        AnonymousClass1OS r5 = this.$title;
        C17130tn r3 = r11;
        AppBarKt.A04(this.$windowInsets, this.$colors, r3, this.$modifier, r5, this.$navigationIcon, this.$actions, AnonymousClass0L8.A00(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
