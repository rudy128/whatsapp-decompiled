package X;

import androidx.compose.foundation.relocation.BringIntoViewRequesterElement;

/* renamed from: X.0pS  reason: invalid class name and case insensitive filesystem */
public final class C14710pS extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C16200rs $bringIntoViewRequester;
    public final /* synthetic */ C17090tj $cursorModifier;
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
    public C14710pS(C16200rs r2, AnonymousClass0OP r3, C04940Pp r4, C05120Qm r5, C17090tj r6, C17090tj r7, C17090tj r8, C17090tj r9, C26251Cvq cvq, EBT ebt, C26224CvE cvE, EBO ebo, C28644ECa eCa, C22821Di r15, int i, int i2, boolean z, boolean z2) {
        super(2);
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

    public static final C17090tj A00(AnonymousClass0OP r5, C17090tj r6, C26224CvE cvE, EBO ebo, C18090vk r9) {
        C17090tj r1;
        long A01 = cvE.A01();
        int A00 = r5.A00(A01);
        r5.A00 = A01;
        C25262Cc3 A012 = C04560Nw.A01(cvE.A02(), ebo);
        int ordinal = ((AnonymousClass0CI) r5.A04.getValue()).ordinal();
        if (ordinal == 0) {
            r1 = new C06010Wp(r5, A012, r9, A00);
        } else if (ordinal == 1) {
            r1 = new C06000Wo(r5, A012, r9, A00);
        } else {
            throw new AnonymousClass3EW();
        }
        return AnonymousClass0LF.A00(r6).CP5(r1);
    }

    public static final C17090tj A01(C17090tj r1, C26251Cvq cvq) {
        return C04470Nn.A01(r1, AnonymousClass0O1.A01(), new C14780pZ(cvq));
    }

    public final void A03(C17130tn r15, int i) {
        if ((i & 11) != 2 || !r15.BZO()) {
            C17090tj CP5 = A01(A00(this.$scrollerPosition, A02(C05130Qo.A0A(C17090tj.A00, this.$state.A04(), Float.NaN), this.$textStyle, this.$minLines, this.$maxLines), this.$value, this.$visualTransformation, new C07940eI(this.$state)).CP5(this.$cursorModifier).CP5(this.$drawModifier), this.$textStyle).CP5(this.$onPositionedModifier).CP5(this.$magnifierModifier).CP5(new BringIntoViewRequesterElement(this.$bringIntoViewRequester));
            C05120Qm r6 = this.$manager;
            C04940Pp r5 = this.$state;
            boolean z = this.$showHandleAndMagnifier;
            boolean z2 = this.$readOnly;
            C22821Di r10 = this.$onTextLayout;
            AnonymousClass0E7.A00(r15, CP5, AnonymousClass0LC.A00(r15, new C13660nl(r5, r6, this.$offsetMapping, this.$value, this.$density, r10, this.$maxLines, z, z2), -363167407), 48, 0);
            return;
        }
        r15.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A03((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }

    public static final C17090tj A02(C17090tj r2, C26251Cvq cvq, int i, int i2) {
        return C04470Nn.A01(r2, AnonymousClass0O1.A01(), new C14840pf(cvq, i, i2));
    }
}
