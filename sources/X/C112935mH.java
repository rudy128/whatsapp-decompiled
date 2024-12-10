package X;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.5mH  reason: invalid class name and case insensitive filesystem */
public abstract class C112935mH extends C42011xT {
    public final void A0B(boolean z) {
        ShimmerFrameLayout shimmerFrameLayout;
        View view = this.A0H;
        if ((view instanceof ShimmerFrameLayout) && (shimmerFrameLayout = (ShimmerFrameLayout) view) != null) {
            if (z) {
                shimmerFrameLayout.A02();
            } else {
                shimmerFrameLayout.A01();
            }
        }
    }
}
