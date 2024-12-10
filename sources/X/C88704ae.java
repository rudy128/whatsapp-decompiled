package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4ae  reason: invalid class name and case insensitive filesystem */
public class C88704ae implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C88704ae(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A00) {
            case 0:
                ((View) ((AnonymousClass0Y1) ((AnonymousClass5WU) this.A01)).A00.A07.getParent()).invalidate();
                return;
            case 1:
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A01;
                C18070vi.A0d(valueAnimator, 2);
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, C72473Md.A02(valueAnimator));
                ((AnonymousClass741) this.A02).A0H.setLayoutParams(marginLayoutParams);
                return;
            case 2:
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A01;
                C18070vi.A0d(valueAnimator, 2);
                marginLayoutParams2.topMargin = C72473Md.A02(valueAnimator);
                ((View) this.A02).setLayoutParams(marginLayoutParams2);
                return;
            case 3:
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.A02;
                marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, AnonymousClass000.A0M(valueAnimator.getAnimatedValue()), marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ((View) this.A01).setLayoutParams(marginLayoutParams3);
                return;
            case 4:
                int A0M = AnonymousClass000.A0M(((ValueAnimator) this.A02).getAnimatedValue());
                ViewGroup viewGroup = ((C79053uH) this.A01).A0M;
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                layoutParams.width = A0M;
                layoutParams.height = A0M;
                viewGroup.setLayoutParams(layoutParams);
                return;
            default:
                C98474rD r4 = (C98474rD) this.A02;
                C18070vi.A0j(r4, valueAnimator);
                int A022 = C72473Md.A02(valueAnimator);
                RecyclerView recyclerView = ((C80053wT) this.A01).A03;
                if (recyclerView == null) {
                    C18070vi.A11("emojiRecyclerView");
                    throw null;
                }
                recyclerView.scrollBy(A022 - r4.element, 0);
                r4.element = A022;
                return;
        }
    }
}
