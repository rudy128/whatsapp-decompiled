package X;

import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.0UX  reason: invalid class name */
public final class AnonymousClass0UX implements C16100ri {
    public final /* synthetic */ ScrollingLogic A00;
    public final /* synthetic */ C22821Di A01;

    public AnonymousClass0UX(ScrollingLogic scrollingLogic, C22821Di r2) {
        this.A00 = scrollingLogic;
        this.A01 = r2;
    }

    public float CH1(float f) {
        ScrollingLogic scrollingLogic = this.A00;
        long j = ((AnonymousClass0QY) this.A01.invoke(AnonymousClass000.A0e(scrollingLogic.A01(f)))).A00;
        if (scrollingLogic.A02 == AnonymousClass0CI.Horizontal) {
            return AnonymousClass0QY.A01(j);
        }
        return AnonymousClass0QY.A02(j);
    }
}
