package X;

import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.0i0  reason: invalid class name and case insensitive filesystem */
public final class C10230i0 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C16100ri $$this$scroll;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10230i0(C16100ri r2, ScrollingLogic scrollingLogic) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$$this$scroll = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j = ((AnonymousClass0QY) obj).A00;
        ScrollingLogic scrollingLogic = this.this$0;
        C16100ri r3 = this.$$this$scroll;
        if (scrollingLogic.A05) {
            j = AnonymousClass0QY.A03(-1.0f, j);
        }
        long A04 = scrollingLogic.A04(r3, 2, j);
        if (scrollingLogic.A05) {
            A04 = AnonymousClass0QY.A03(-1.0f, A04);
        }
        return AnonymousClass000.A0e(A04);
    }
}
