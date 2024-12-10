package X;

import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.D6k  reason: case insensitive filesystem */
public final class C26616D6k implements C218317o {
    public static final String[] A01 = {"image/bmp", "image/gif", "image/heic", "image/png", "image/tiff", "image/webp", "application/pdf", "image/jpeg"};
    public AnonymousClass02n A00;

    @OnLifecycleEvent(C27581Wq.ON_DESTROY)
    public final void onDestroy() {
        AnonymousClass02n r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        this.A00 = null;
    }
}
