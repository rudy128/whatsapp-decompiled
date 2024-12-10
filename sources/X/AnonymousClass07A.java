package X;

import androidx.compose.foundation.ClickablePointerInputNode$pointerInput$2;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;

/* renamed from: X.07A  reason: invalid class name */
public final class AnonymousClass07A extends AnonymousClass0AX {
    public AnonymousClass07A(C03200Ha r7, C17210uI r8, C18090vk r9, boolean z) {
        super(r7, r8, r9, (AnonymousClass1Y1) null, z);
    }

    public Object A0P(C17730v8 r6, C30391dr r7) {
        C03200Ha r4 = this.A03;
        long A00 = A00(r6.BZM());
        long A0p = AnonymousClass001.A0p(AnonymousClass000.A02(A00), (float) AnonymousClass000.A0H(A00));
        long j = AnonymousClass0QY.A03;
        r4.A00 = A0p;
        Object A09 = TapGestureDetectorKt.A09(r6, r7, new C10560iX(this), new ClickablePointerInputNode$pointerInput$2(this, (C30391dr) null));
        if (A09 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A09;
    }

    public final void A0S(C17210uI r1, C18090vk r2, boolean z) {
        this.A01 = z;
        A0R(r2);
        this.A00 = r1;
    }

    public static final long A00(long j) {
        return C7A.A00(AnonymousClass000.A0G(j) / 2, AnonymousClass000.A0H(j) / 2);
    }
}
