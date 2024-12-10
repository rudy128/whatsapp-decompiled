package X;

import java.util.Map;

/* renamed from: X.0nx  reason: invalid class name and case insensitive filesystem */
public final class C13780nx extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C15780rC $color = null;
    public final /* synthetic */ Map $inlineContent;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C22821Di $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ C26251Cvq $style;
    public final /* synthetic */ C27069DRu $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13780nx(C17090tj r2, C27069DRu dRu, C26251Cvq cvq, Map map, C22821Di r6, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(2);
        this.$text = dRu;
        this.$modifier = r2;
        this.$style = cvq;
        this.$onTextLayout = r6;
        this.$overflow = i;
        this.$softWrap = z;
        this.$maxLines = i2;
        this.$minLines = i3;
        this.$inlineContent = map;
        this.$$changed = i4;
        this.$$default = i5;
    }

    public final void A00(C17130tn r13) {
        C27069DRu dRu = this.$text;
        C17090tj r1 = this.$modifier;
        C26251Cvq cvq = this.$style;
        C22821Di r5 = this.$onTextLayout;
        int i = this.$overflow;
        boolean z = this.$softWrap;
        C17130tn r0 = r13;
        AnonymousClass0PY.A01(r0, r1, dRu, cvq, this.$inlineContent, r5, i, this.$maxLines, this.$minLines, AnonymousClass0L8.A00(this.$$changed), this.$$default, z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
