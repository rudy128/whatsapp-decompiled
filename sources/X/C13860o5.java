package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.0o5  reason: invalid class name and case insensitive filesystem */
public final class C13860o5 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $beyondBoundsItemCount;
    public final /* synthetic */ C22821Di $content;
    public final /* synthetic */ AnonymousClass0tB $contentPadding;
    public final /* synthetic */ C16080rg $flingBehavior;
    public final /* synthetic */ C16330s5 $horizontalAlignment;
    public final /* synthetic */ C16120rk $horizontalArrangement;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ boolean $userScrollEnabled;
    public final /* synthetic */ C16340s6 $verticalAlignment;
    public final /* synthetic */ C16130rl $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13860o5(C16080rg r2, C16120rk r3, C16130rl r4, AnonymousClass0tB r5, LazyListState lazyListState, C16330s5 r7, C16340s6 r8, C17090tj r9, C22821Di r10, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        super(2);
        this.$modifier = r9;
        this.$state = lazyListState;
        this.$contentPadding = r5;
        this.$reverseLayout = z;
        this.$isVertical = z2;
        this.$flingBehavior = r2;
        this.$userScrollEnabled = z3;
        this.$beyondBoundsItemCount = i;
        this.$horizontalAlignment = r7;
        this.$verticalArrangement = r4;
        this.$verticalAlignment = r8;
        this.$horizontalArrangement = r3;
        this.$content = r10;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public final void A00(C17130tn r23) {
        C17090tj r13 = this.$modifier;
        LazyListState lazyListState = this.$state;
        AnonymousClass0tB r8 = this.$contentPadding;
        boolean z = this.$reverseLayout;
        boolean z2 = this.$isVertical;
        C16080rg r5 = this.$flingBehavior;
        boolean z3 = this.$userScrollEnabled;
        int i = this.$beyondBoundsItemCount;
        C16330s5 r11 = this.$horizontalAlignment;
        C16130rl r7 = this.$verticalArrangement;
        C16340s6 r12 = this.$verticalAlignment;
        AnonymousClass0L4.A01(r5, this.$horizontalArrangement, r7, r8, lazyListState, r23, r11, r12, r13, this.$content, i, AnonymousClass0L8.A00(this.$$changed), AnonymousClass0L8.A01(this.$$changed1), this.$$default, z, z2, z3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
