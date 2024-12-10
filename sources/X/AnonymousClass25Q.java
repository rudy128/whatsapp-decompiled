package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.25Q  reason: invalid class name */
public final class AnonymousClass25Q implements Runnable {
    public final Bitmap A00;
    public final ImageView A01;
    public final C42971z2 A02;
    public final Object A03;
    public final WeakReference A04;
    public final boolean A05;

    public AnonymousClass25Q(Bitmap bitmap, ImageView imageView, C42971z2 r4, Object obj, WeakReference weakReference, boolean z) {
        C18070vi.A0d(obj, 4);
        this.A04 = weakReference;
        this.A00 = bitmap;
        this.A01 = imageView;
        this.A03 = obj;
        this.A02 = r4;
        this.A05 = z;
    }

    public void run() {
        C43051zA r0 = (C43051zA) this.A04.get();
        if (r0 != null && !r0.A0D) {
            ImageView imageView = this.A01;
            if (imageView.getTag() != null && C18070vi.A18(imageView.getTag(), this.A03)) {
                boolean z = this.A05;
                C42971z2 r2 = this.A02;
                Bitmap bitmap = this.A00;
                boolean z2 = false;
                if (z) {
                    z2 = true;
                }
                r2.CMZ(bitmap, imageView, z2);
            }
        }
    }
}
