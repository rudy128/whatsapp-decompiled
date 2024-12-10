package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1rG  reason: invalid class name and case insensitive filesystem */
public abstract class C38421rG extends C38391rD {
    public final C38391rD A00;
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();

    public void Bmc(C42011xT r5, int i) {
        ViewGroup viewGroup;
        List list;
        ViewGroup viewGroup2;
        C18070vi.A0d(r5, 0);
        int itemViewType = getItemViewType(i);
        if (itemViewType == -2) {
            View view = r5.A0H;
            C18070vi.A0z(view, "null cannot be cast to non-null type android.widget.FrameLayout");
            viewGroup = (ViewGroup) view;
            viewGroup.removeAllViews();
            list = this.A01;
            i = (i - this.A02.size()) - this.A00.A0Q();
        } else if (itemViewType != -1) {
            this.A00.Bmc(r5, i - this.A02.size());
            return;
        } else {
            View view2 = r5.A0H;
            C18070vi.A0z(view2, "null cannot be cast to non-null type android.widget.FrameLayout");
            viewGroup = (ViewGroup) view2;
            viewGroup.removeAllViews();
            list = this.A02;
        }
        View view3 = (View) list.get(i);
        ViewParent parent = view3.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            viewGroup2.removeView(view3);
        }
        viewGroup.addView(view3);
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == -2 || i == -1) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new C42011xT(frameLayout);
        }
        C42011xT BqY = this.A00.BqY(viewGroup, i);
        C18070vi.A0b(BqY);
        return BqY;
    }

    public int A0Q() {
        return this.A02.size() + this.A00.A0Q() + this.A01.size();
    }

    public C38421rG(C38391rD r2) {
        this.A00 = r2;
    }
}
