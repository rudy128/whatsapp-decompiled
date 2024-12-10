package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.0nt  reason: invalid class name and case insensitive filesystem */
public final class C13740nt extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C22821Di $content;
    public final /* synthetic */ AnonymousClass0tB $contentPadding;
    public final /* synthetic */ C16080rg $flingBehavior;
    public final /* synthetic */ C16330s5 $horizontalAlignment;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ boolean $userScrollEnabled;
    public final /* synthetic */ C16130rl $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13740nt(C16080rg r2, C16130rl r3, AnonymousClass0tB r4, LazyListState lazyListState, C16330s5 r6, C17090tj r7, C22821Di r8, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.$modifier = r7;
        this.$state = lazyListState;
        this.$contentPadding = r4;
        this.$reverseLayout = z;
        this.$verticalArrangement = r3;
        this.$horizontalAlignment = r6;
        this.$flingBehavior = r2;
        this.$userScrollEnabled = z2;
        this.$content = r8;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void A00(C17130tn r14) {
        C17090tj r7 = this.$modifier;
        LazyListState lazyListState = this.$state;
        AnonymousClass0tB r3 = this.$contentPadding;
        boolean z = this.$reverseLayout;
        C16130rl r2 = this.$verticalArrangement;
        C16330s5 r6 = this.$horizontalAlignment;
        C17130tn r5 = r14;
        C02290Dl.A00(this.$flingBehavior, r2, r3, lazyListState, r5, r6, r7, this.$content, AnonymousClass0L8.A00(this.$$changed), this.$$default, z, this.$userScrollEnabled);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
