package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.6Vv  reason: invalid class name and case insensitive filesystem */
public abstract class C123786Vv {
    public static final ShimmerFrameLayout A00(ViewGroup viewGroup, int i) {
        View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131624171, viewGroup, false);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        AnonymousClass3MZ.A0D(viewGroup).inflate(i, shimmerFrameLayout);
        return shimmerFrameLayout;
    }
}
