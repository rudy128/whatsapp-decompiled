package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.0eD  reason: invalid class name and case insensitive filesystem */
public final class C07890eD extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C16620sj $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07890eD(C16620sj r2) {
        super(0);
        this.$state = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LazyListState lazyListState = ((AnonymousClass0V9) this.$state).A00;
        boolean A1b = AnonymousClass001.A1b(lazyListState.A0K);
        AnonymousClass0OG r2 = lazyListState.A0F;
        float BT8 = (float) (r2.A04.BT8() + (r2.A03.BT8() * 500));
        if (A1b) {
            BT8 += 100.0f;
        }
        return Float.valueOf(BT8);
    }
}
