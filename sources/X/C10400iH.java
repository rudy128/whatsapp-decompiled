package X;

import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;

/* renamed from: X.0iH  reason: invalid class name and case insensitive filesystem */
public final class C10400iH extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $source;
    public final /* synthetic */ C16100ri $this_dispatchScroll;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10400iH(C16100ri r2, ScrollingLogic scrollingLogic, int i) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$source = i;
        this.$this_dispatchScroll = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        long A0p;
        float A02;
        long j2;
        NestedScrollNode nestedScrollNode;
        NestedScrollNode nestedScrollNode2;
        long j3 = ((AnonymousClass0QY) obj).A00;
        NestedScrollDispatcher nestedScrollDispatcher = this.this$0.A04;
        int i = this.$source;
        C17540up r1 = nestedScrollDispatcher.A00;
        if (r1 == null || (nestedScrollNode2 = (NestedScrollNode) r1.BPr(AnonymousClass0GE.A00)) == null) {
            j = AnonymousClass0QY.A03;
        } else {
            j = nestedScrollNode2.C1Q(j3, i);
        }
        long A04 = AnonymousClass0QY.A04(j3, j);
        ScrollingLogic scrollingLogic = this.this$0;
        AnonymousClass0CI r9 = scrollingLogic.A02;
        AnonymousClass0CI r8 = AnonymousClass0CI.Horizontal;
        if (r9 == r8) {
            A0p = AnonymousClass001.A0p(AnonymousClass0QY.A01(A04), 0.0f);
        } else {
            A0p = AnonymousClass001.A0p(0.0f, AnonymousClass0QY.A02(A04));
        }
        if (scrollingLogic.A05) {
            A0p = AnonymousClass0QY.A03(-1.0f, A0p);
        }
        if (r9 == r8) {
            A02 = AnonymousClass0QY.A01(A0p);
        } else {
            A02 = AnonymousClass0QY.A02(A0p);
        }
        long A01 = scrollingLogic.A01(this.$this_dispatchScroll.CH1(A02));
        if (scrollingLogic.A05) {
            A01 = AnonymousClass0QY.A03(-1.0f, A01);
        }
        long A042 = AnonymousClass0QY.A04(A04, A01);
        NestedScrollDispatcher nestedScrollDispatcher2 = this.this$0.A04;
        int i2 = this.$source;
        C17540up r3 = nestedScrollDispatcher2.A00;
        if (r3 == null || (nestedScrollNode = (NestedScrollNode) r3.BPr(AnonymousClass0GE.A00)) == null) {
            j2 = AnonymousClass0QY.A03;
        } else {
            j2 = nestedScrollNode.C1C(A01, A042, i2);
        }
        return AnonymousClass000.A0e(AnonymousClass0QY.A05(AnonymousClass0QY.A05(j, A01), j2));
    }
}
