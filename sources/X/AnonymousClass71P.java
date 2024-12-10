package X;

import android.view.ViewGroup;
import java.util.List;
import java.util.Set;

/* renamed from: X.71P  reason: invalid class name */
public abstract class AnonymousClass71P {
    public static final int[] A0B = C108945cZ.A1W();
    public final AnonymousClass71P A00;
    public final C137896wC A01;
    public final Integer A02;
    public final Object A03;
    public final List A04 = AnonymousClass000.A13();
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final ViewGroup A08;
    public final Set A09;
    public final C18100vl A0A;

    public AnonymousClass71P(ViewGroup viewGroup, AnonymousClass71P r8, C137896wC r9, Integer num, Object obj) {
        this.A01 = r9;
        this.A00 = r8;
        this.A08 = viewGroup;
        this.A03 = obj;
        this.A02 = num;
        Integer num2 = AnonymousClass00R.A0C;
        this.A06 = AnonymousClass7S4.A01(num2, this, 46);
        this.A05 = AnonymousClass7S4.A01(num2, this, 47);
        this.A0A = AnonymousClass7S4.A01(num2, this, 48);
        this.A07 = AnonymousClass7S4.A01(num2, this, 49);
        this.A09 = C200410p.A0S(new String[]{"DecorView", "LinearLayout", "FrameLayout", "GenericDraweeView", "RecyclerView", "Row", "Column", "Image", "Text", "LithoView", "LithoRecyclerView", "WrapComponent", "DebugComponent", "FbLinearLayout", "FbMeasureBlockingFrameLayout", "FbSwipeRefreshLayout", "TouchInterceptorFrameLayout", "BetterRecyclerView"});
    }

    public static final AnonymousClass71P A00(AnonymousClass6RM r1, AnonymousClass71P r2) {
        AnonymousClass71P r0;
        if (r1 == r2.A06.getValue()) {
            return r2;
        }
        if (r2 instanceof AnonymousClass6Pr) {
            r0 = ((AnonymousClass6Pr) r2).A00;
        } else {
            r0 = r2.A00;
        }
        if (r0 != null) {
            return A00(r1, r0);
        }
        return null;
    }
}
