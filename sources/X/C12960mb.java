package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.0mb  reason: invalid class name and case insensitive filesystem */
public final class C12960mb extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Alignment $alignment;
    public final /* synthetic */ float $alpha;
    public final /* synthetic */ AnonymousClass0HD $colorFilter;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ C17050tf $contentScale;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C04640Oe $painter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12960mb(Alignment alignment, C17090tj r3, AnonymousClass0HD r4, C04640Oe r5, C17050tf r6, String str, float f, int i, int i2) {
        super(2);
        this.$painter = r5;
        this.$contentDescription = str;
        this.$modifier = r3;
        this.$alignment = alignment;
        this.$contentScale = r6;
        this.$alpha = f;
        this.$colorFilter = r4;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C17130tn A0b = AnonymousClass000.A0b(obj, obj2);
        C04640Oe r5 = this.$painter;
        String str = this.$contentDescription;
        C17090tj r3 = this.$modifier;
        C02230Df.A00(A0b, this.$alignment, r3, this.$colorFilter, r5, this.$contentScale, str, this.$alpha, AnonymousClass0L8.A00(this.$$changed), this.$$default);
        return C27621Wu.A00;
    }
}
