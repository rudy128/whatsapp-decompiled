package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.0nb  reason: invalid class name and case insensitive filesystem */
public final class C13560nb extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass20G $content;
    public final /* synthetic */ Alignment $contentAlignment;
    public final /* synthetic */ C22821Di $contentKey;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ AnonymousClass0Q5 $this_AnimatedContent;
    public final /* synthetic */ C22821Di $transitionSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13560nb(AnonymousClass0Q5 r2, Alignment alignment, C17090tj r4, C22821Di r5, C22821Di r6, AnonymousClass20G r7, int i, int i2) {
        super(2);
        this.$this_AnimatedContent = r2;
        this.$modifier = r4;
        this.$transitionSpec = r5;
        this.$contentAlignment = alignment;
        this.$contentKey = r6;
        this.$content = r7;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void A00(C17130tn r11) {
        C17130tn r2 = r11;
        AnonymousClass0Ne.A01(this.$this_AnimatedContent, r2, this.$contentAlignment, this.$modifier, this.$transitionSpec, this.$contentKey, this.$content, AnonymousClass0L8.A00(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
