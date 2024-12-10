package X;

import androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2;
import androidx.compose.foundation.gestures.ScrollableKt;

/* renamed from: X.0US  reason: invalid class name */
public final class AnonymousClass0US implements C16080rg {
    public int A00;
    public C15640qx A01;
    public final C17870vM A02;

    public Object CBc(C16100ri r4, C30391dr r5, float f) {
        this.A00 = 0;
        return AnonymousClass4Z4.A00(r5, this.A02, new DefaultFlingBehavior$performFling$2(this, r4, (C30391dr) null, f));
    }

    public /* synthetic */ AnonymousClass0US(C15640qx r2) {
        C17870vM A012 = ScrollableKt.A01();
        this.A01 = r2;
        this.A02 = A012;
    }
}
