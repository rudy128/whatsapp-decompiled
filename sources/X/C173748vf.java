package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.8vf  reason: invalid class name and case insensitive filesystem */
public final class C173748vf extends C111735kL {
    public final C51172Xg A00;
    public final C18030ve A01;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        C51172Xg r3 = this.A00;
        View A0G = C108955ca.A0G(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626498, false);
        C18070vi.A0d(A0G, 1);
        Resources resources = viewGroup.getResources();
        if (resources.getConfiguration().orientation == 1) {
            int A012 = C22339B3q.A01(((float) (resources.getDisplayMetrics().widthPixels - (viewGroup.getPaddingStart() + viewGroup.getPaddingEnd()))) / 4.4f);
            if (resources.getDimensionPixelSize(2131169137) > A012) {
                int floor = (int) Math.floor(((double) A012) / 1.5d);
                int dimensionPixelSize = floor - (resources.getDimensionPixelSize(2131166489) * 2);
                View A06 = AnonymousClass1HF.A06(A0G, 2131434134);
                A06.getLayoutParams().width = floor;
                AnonymousClass3MX.A1F(A06, floor);
                View A062 = AnonymousClass1HF.A06(A0G, 2131434132);
                A062.getLayoutParams().width = dimensionPixelSize;
                AnonymousClass3MX.A1F(A062, dimensionPixelSize);
            }
            A0G.getLayoutParams().width = A012;
        }
        AnonymousClass3MW.A0G(A0G, 2131434133).setImageResource(C196929vs.A01(this.A01));
        List list = C42011xT.A0I;
        return new C174778xK(A0G, (C183269Xp) r3.A00.A01.A00.A2d.get());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C173748vf(C51172Xg r3, C18030ve r4) {
        super(new C40471ul(new AnonymousClass8HK(4)).A00());
        C18070vi.A0j(r4, r3);
        this.A01 = r4;
        this.A00 = r3;
    }

    public /* bridge */ /* synthetic */ void A0X(C175028xj r3, int i) {
        Object A0U = A0U(i);
        C18070vi.A0X(A0U);
        r3.A0C(new C183289Xr((AF0) A0U));
    }
}
