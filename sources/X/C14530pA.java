package X;

import java.util.List;

/* renamed from: X.0pA  reason: invalid class name and case insensitive filesystem */
public final class C14530pA extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Integer $bottomBarHeight;
    public final /* synthetic */ List $bottomBarPlaceables;
    public final /* synthetic */ C36001nB $content;
    public final /* synthetic */ C17100tk $contentWindowInsets;
    public final /* synthetic */ C17520un $this_SubcomposeLayout;
    public final /* synthetic */ int $topBarHeight;
    public final /* synthetic */ List $topBarPlaceables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14530pA(C17100tk r2, C17520un r3, Integer num, List list, List list2, C36001nB r7, int i, int i2) {
        super(2);
        this.$contentWindowInsets = r2;
        this.$this_SubcomposeLayout = r3;
        this.$topBarPlaceables = list;
        this.$topBarHeight = i;
        this.$bottomBarPlaceables = list2;
        this.$bottomBarHeight = num;
        this.$content = r7;
        this.$$dirty = i2;
    }

    public static final C05550Ur A00(C17100tk r1, C28644ECa eCa) {
        return new C05550Ur(r1, eCa);
    }

    public final void A01(C17130tn r6, int i) {
        float CPG;
        float BDk;
        Integer num;
        if ((i & 11) != 2 || !r6.BZO()) {
            C05550Ur A00 = A00(this.$contentWindowInsets, this.$this_SubcomposeLayout);
            if (this.$topBarPlaceables.isEmpty()) {
                CPG = A00.BE0();
            } else {
                CPG = this.$this_SubcomposeLayout.CPG(this.$topBarHeight);
            }
            if (this.$bottomBarPlaceables.isEmpty() || (num = this.$bottomBarHeight) == null) {
                BDk = A00.BDk();
            } else {
                BDk = this.$this_SubcomposeLayout.CPG(num.intValue());
            }
            this.$content.invoke(new C05560Us(AnonymousClass0Q7.A01(A00, this.$this_SubcomposeLayout.getLayoutDirection()), CPG, AnonymousClass0Q7.A00(A00, this.$this_SubcomposeLayout.getLayoutDirection()), BDk), r6, AnonymousClass000.A0q(this.$$dirty));
            return;
        }
        r6.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A01((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
