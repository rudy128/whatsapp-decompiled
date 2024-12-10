package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1z4  reason: invalid class name and case insensitive filesystem */
public final class C42991z4 extends C42981z3 {
    public final C42961z1 A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C42991z4(X.C42961z1 r10, X.AnonymousClass1VW r11, X.AnonymousClass1E7 r12, X.AnonymousClass1VU r13, X.AnonymousClass1PU r14) {
        /*
            r9 = this;
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            r0 = 2
            r4 = r11
            X.C18070vi.A0d(r11, r0)
            r0 = 3
            r7 = r14
            X.C18070vi.A0d(r14, r0)
            r0 = 4
            r6 = r13
            X.C18070vi.A0d(r13, r0)
            r3 = 0
            r2 = r9
            r5 = r12
            r8 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.A00 = r10
            r1 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r9.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42991z4.<init>(X.1z1, X.1VW, X.1E7, X.1VU, X.1PU):void");
    }

    public void CMZ(Bitmap bitmap, ImageView imageView, boolean z) {
        C18070vi.A0d(imageView, 0);
        if (bitmap == null || !this.A01.get()) {
            super.CMZ(bitmap, imageView, z);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }
}
