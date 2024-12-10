package X;

import android.content.Context;
import android.content.res.ColorStateList;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.7hI  reason: invalid class name and case insensitive filesystem */
public final class C148347hI extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass7CW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C148347hI(AnonymousClass7CW r2) {
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
        int[][] iArr = new int[3][];
        int[] A1Y = C108945cZ.A1Y(C108945cZ.A1X(new int[1], iArr, -16843518, 1), iArr, 16842913, 1);
        A1Y[0] = -16842913;
        iArr[2] = A1Y;
        return new ColorStateList(iArr, new int[]{AnonymousClass3Ma.A00(A04, 2130968986, 2131100045), AnonymousClass3Ma.A00(A04, 2130968988, 2131100047), AnonymousClass3Ma.A00(A04, 2130968987, 2131100046)});
    }
}
