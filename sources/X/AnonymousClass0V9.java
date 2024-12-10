package X;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.0V9  reason: invalid class name */
public final class AnonymousClass0V9 implements C16620sj {
    public final /* synthetic */ LazyListState A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass0V9(LazyListState lazyListState, boolean z) {
        this.A00 = lazyListState;
        this.A01 = z;
    }

    public Object BC5(C30391dr r3, float f) {
        Object A012 = ScrollExtensionsKt.A00(AnonymousClass0U0.A01((Object) null), this.A00, r3, f);
        if (A012 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A012;
    }

    public Object CH2(C30391dr r3, int i) {
        Object A02 = this.A00.A09(r3, i);
        if (A02 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A02;
    }
}
