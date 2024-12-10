package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.0nk  reason: invalid class name and case insensitive filesystem */
public final class C13650nk extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass20G $content;
    public final /* synthetic */ Alignment $contentAlignment;
    public final /* synthetic */ C22821Di $contentKey;
    public final /* synthetic */ String $label;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ Object $targetState;
    public final /* synthetic */ C22821Di $transitionSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13650nk(Alignment alignment, C17090tj r3, Object obj, String str, C22821Di r6, C22821Di r7, AnonymousClass20G r8, int i, int i2) {
        super(2);
        this.$targetState = obj;
        this.$modifier = r3;
        this.$transitionSpec = r6;
        this.$contentAlignment = alignment;
        this.$label = str;
        this.$contentKey = r7;
        this.$content = r8;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void A00(C17130tn r11) {
        Object obj = this.$targetState;
        C17130tn r0 = r11;
        AnonymousClass0Ne.A02(r0, this.$contentAlignment, this.$modifier, obj, this.$label, this.$transitionSpec, this.$contentKey, this.$content, AnonymousClass0L8.A00(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
