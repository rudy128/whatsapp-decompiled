package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.0fZ  reason: invalid class name and case insensitive filesystem */
public final class C08730fZ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C16300s2 $intervalContentState;
    public final /* synthetic */ C05630Uz $scope;
    public final /* synthetic */ LazyListState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08730fZ(C05630Uz r2, LazyListState lazyListState, C16300s2 r4) {
        super(0);
        this.$intervalContentState = r4;
        this.$state = lazyListState;
        this.$scope = r2;
    }

    /* renamed from: A00 */
    public final AnonymousClass0V1 invoke() {
        AnonymousClass0V2 r4 = (AnonymousClass0V2) this.$intervalContentState.getValue();
        AnonymousClass0V5 r3 = new AnonymousClass0V5(r4, this.$state.A0A());
        return new AnonymousClass0V1(this.$scope, r4, this.$state, r3);
    }
}
