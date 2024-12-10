package X;

import androidx.window.extensions.WindowExtensionsProvider;

/* renamed from: X.CnX  reason: case insensitive filesystem */
public final class C25864CnX {
    public static final int A00() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }

    static {
        AnonymousClass3MW.A15(C25864CnX.class).BZJ();
    }
}
