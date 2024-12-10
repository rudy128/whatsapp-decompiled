package X;

/* renamed from: X.0o9  reason: invalid class name and case insensitive filesystem */
public final class C13900o9 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C16200rs $bringIntoViewRequester;
    public final /* synthetic */ C17090tj $cursorModifier;
    public final /* synthetic */ C36001nB $decorationBox;
    public final /* synthetic */ C28644ECa $density;
    public final /* synthetic */ C17090tj $drawModifier;
    public final /* synthetic */ C17090tj $magnifierModifier;
    public final /* synthetic */ C05120Qm $manager;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ EBT $offsetMapping;
    public final /* synthetic */ C17090tj $onPositionedModifier;
    public final /* synthetic */ C22821Di $onTextLayout;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ AnonymousClass0OP $scrollerPosition;
    public final /* synthetic */ boolean $showHandleAndMagnifier;
    public final /* synthetic */ C04940Pp $state;
    public final /* synthetic */ C26251Cvq $textStyle;
    public final /* synthetic */ C26224CvE $value;
    public final /* synthetic */ EBO $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13900o9(C16200rs r2, AnonymousClass0OP r3, C04940Pp r4, C05120Qm r5, C17090tj r6, C17090tj r7, C17090tj r8, C17090tj r9, C26251Cvq cvq, EBT ebt, C26224CvE cvE, EBO ebo, C28644ECa eCa, C22821Di r15, C36001nB r16, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.$decorationBox = r16;
        this.$state = r4;
        this.$textStyle = cvq;
        this.$minLines = i;
        this.$maxLines = i2;
        this.$scrollerPosition = r3;
        this.$value = cvE;
        this.$visualTransformation = ebo;
        this.$cursorModifier = r6;
        this.$drawModifier = r7;
        this.$onPositionedModifier = r8;
        this.$magnifierModifier = r9;
        this.$bringIntoViewRequester = r2;
        this.$manager = r5;
        this.$showHandleAndMagnifier = z;
        this.$readOnly = z2;
        this.$onTextLayout = r15;
        this.$offsetMapping = ebt;
        this.$density = eCa;
    }

    public final void A00(C17130tn r32, int i) {
        C17130tn r6 = r32;
        if ((i & 11) != 2 || !r6.BZO()) {
            C36001nB r5 = this.$decorationBox;
            C04940Pp r30 = this.$state;
            C26251Cvq cvq = this.$textStyle;
            int i2 = this.$minLines;
            int i3 = this.$maxLines;
            AnonymousClass0OP r29 = this.$scrollerPosition;
            C26224CvE cvE = this.$value;
            EBO ebo = this.$visualTransformation;
            C17090tj r12 = this.$cursorModifier;
            C17090tj r11 = this.$drawModifier;
            C17090tj r10 = this.$onPositionedModifier;
            C17090tj r9 = this.$magnifierModifier;
            C16200rs r8 = this.$bringIntoViewRequester;
            C05120Qm r7 = this.$manager;
            boolean z = this.$showHandleAndMagnifier;
            boolean z2 = this.$readOnly;
            C22821Di r2 = this.$onTextLayout;
            C04940Pp r13 = r30;
            C05120Qm r14 = r7;
            C17090tj r15 = r12;
            C17090tj r16 = r11;
            C17090tj r17 = r10;
            C16200rs r112 = r8;
            AnonymousClass0OP r122 = r29;
            r5.invoke(AnonymousClass0LC.A00(r6, new C14710pS(r112, r122, r13, r14, r15, r16, r17, r9, cvq, this.$offsetMapping, cvE, ebo, this.$density, r2, i2, i3, z, z2), 2032502107), r6, 6);
            return;
        }
        r6.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
