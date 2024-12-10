package androidx.car.app;

import X.AnonymousClass000;
import android.view.Surface;

public final class SurfaceContainer {
    public final int mDpi = 0;
    public final int mHeight = 0;
    public final Surface mSurface = null;
    public final int mWidth = 0;

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[");
        A10.append(this.mSurface);
        A10.append(", ");
        A10.append(this.mWidth);
        A10.append("x");
        A10.append(this.mHeight);
        A10.append(", dpi: ");
        A10.append(this.mDpi);
        return AnonymousClass000.A0z(A10);
    }
}
