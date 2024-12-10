package X;

import androidx.compose.material3.AppBarKt;

/* renamed from: X.0nm  reason: invalid class name and case insensitive filesystem */
public final class C13670nm extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ AnonymousClass1OS $actionsRow;
    public final /* synthetic */ boolean $centeredTitle;
    public final /* synthetic */ C03580Iv $colors;
    public final /* synthetic */ AnonymousClass1OS $navigationIcon;
    public final /* synthetic */ C15730r6 $scrollBehavior = null;
    public final /* synthetic */ AnonymousClass1OS $title;
    public final /* synthetic */ C26251Cvq $titleTextStyle;
    public final /* synthetic */ C17100tk $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13670nm(C17100tk r2, C03580Iv r3, C26251Cvq cvq, AnonymousClass1OS r5, AnonymousClass1OS r6, AnonymousClass1OS r7, int i, boolean z) {
        super(2);
        this.$windowInsets = r2;
        this.$colors = r3;
        this.$title = r5;
        this.$titleTextStyle = cvq;
        this.$centeredTitle = z;
        this.$navigationIcon = r6;
        this.$actionsRow = r7;
        this.$$dirty = i;
    }

    public final void A00(C17130tn r34, int i) {
        C17130tn r15 = r34;
        if ((i & 11) != 2 || !r15.BZO()) {
            float CPQ = 0.0f + ((C28644ECa) r15.BFh(AnonymousClass0OD.A01)).CPQ(64.0f);
            C17090tj A00 = AnonymousClass0LF.A00(C03960Lh.A00(this.$windowInsets, C17090tj.A00));
            C03580Iv r0 = this.$colors;
            long j = r0.A02;
            long j2 = r0.A04;
            long j3 = r0.A00;
            AnonymousClass1OS r10 = this.$title;
            C26251Cvq cvq = this.$titleTextStyle;
            C16120rk r13 = AnonymousClass0OB.A02;
            C17220uJ r14 = r13;
            C16120rk r132 = r13;
            if (!this.$centeredTitle) {
                r132 = AnonymousClass0OB.A01;
            }
            AnonymousClass1OS r8 = this.$navigationIcon;
            AnonymousClass1OS r7 = this.$actionsRow;
            int i2 = this.$$dirty;
            int i3 = i2 << 12;
            AnonymousClass1OS r19 = r8;
            AnonymousClass1OS r18 = r10;
            C26251Cvq cvq2 = cvq;
            AppBarKt.A00(r132, r14, r15, A00, cvq2, r18, r19, r7, CPQ, 1.0f, 0, (i3 & 458752) | 113246208 | (i3 & 3670016), ((i2 >> 6) & 896) | 3126, j, j2, j3, false);
            return;
        }
        r15.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
