package X;

import androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;

/* renamed from: X.0AS  reason: invalid class name */
public final class AnonymousClass0AS extends C014308l {
    public final ScrollingLogic A00;
    public final NestedScrollDispatcher A01;
    public final AnonymousClass07C A02;
    public final AnonymousClass0UR A03;
    public final C17210uI A04;
    public final C18090vk A05;
    public final C36001nB A06;

    public final void A0O(AnonymousClass0CI r10, C17210uI r11, boolean z) {
        AnonymousClass0CI r2 = r10;
        C17210uI r3 = r11;
        this.A02.A0W(this.A03, r2, r3, this.A05, ScrollableKt.A04, ScrollableKt.A05, this.A06, z);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0rf, java.lang.Object, X.0UR] */
    public AnonymousClass0AS(AnonymousClass0CI r10, ScrollingLogic scrollingLogic, C17210uI r12, NestedScrollDispatcher nestedScrollDispatcher, boolean z) {
        this.A00 = scrollingLogic;
        this.A01 = nestedScrollDispatcher;
        this.A04 = r12;
        A0N(new AnonymousClass0AV(scrollingLogic));
        ? obj = new Object();
        obj.A01 = scrollingLogic;
        obj.A00 = ScrollableKt.A00;
        this.A03 = obj;
        C07840e8 r4 = new C07840e8(this);
        this.A05 = r4;
        ScrollableGesturesNode$onDragStopped$1 scrollableGesturesNode$onDragStopped$1 = new ScrollableGesturesNode$onDragStopped$1(this, (C30391dr) null);
        this.A06 = scrollableGesturesNode$onDragStopped$1;
        AnonymousClass07C r0 = new AnonymousClass07C(obj, r10, r12, r4, ScrollableKt.A04, ScrollableKt.A05, scrollableGesturesNode$onDragStopped$1, z);
        A0N(r0);
        this.A02 = r0;
    }
}
