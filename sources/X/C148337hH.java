package X;

import android.content.Context;
import android.content.res.ColorStateList;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.7hH  reason: invalid class name and case insensitive filesystem */
public final class C148337hH extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass7CW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C148337hH(AnonymousClass7CW r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ShimmerFrameLayout shimmerFrameLayout = this.this$0.A04;
        if (shimmerFrameLayout == null) {
            C18070vi.A11("shimmerView");
            throw null;
        }
        Context A04 = AnonymousClass3MY.A04(shimmerFrameLayout);
        int[][] iArr = new int[2][];
        int[] A1X = C108945cZ.A1X(new int[1], iArr, 16842913, 1);
        A1X[0] = -16842913;
        iArr[1] = A1X;
        return new ColorStateList(iArr, new int[]{AnonymousClass3Ma.A00(A04, 2130968985, 2131100044), AnonymousClass3Ma.A00(A04, 2130968984, 2131100043)});
    }
}
