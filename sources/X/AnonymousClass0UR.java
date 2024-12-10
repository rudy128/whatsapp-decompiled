package X;

import androidx.compose.foundation.gestures.ScrollDraggableState$drag$2;
import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.0UR  reason: invalid class name */
public final class AnonymousClass0UR implements C16060re, C16070rf {
    public C16100ri A00;
    public ScrollingLogic A01;

    public Object BJG(AnonymousClass0CH r4, C30391dr r5, AnonymousClass1OS r6) {
        Object CH0 = this.A01.A03.CH0(r4, r5, new ScrollDraggableState$drag$2(this, (C30391dr) null, r6));
        if (CH0 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return CH0;
    }

    public void BJH(float f) {
        ScrollingLogic scrollingLogic = this.A01;
        scrollingLogic.A04(this.A00, 1, scrollingLogic.A01(f));
    }
}
