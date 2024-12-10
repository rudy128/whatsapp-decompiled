package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.search.views.itemviews.SearchMessageVideoThumbView;

/* renamed from: X.7EU  reason: invalid class name */
public class AnonymousClass7EU implements AnonymousClass5ZJ {
    public final int A00;
    public final Object A01;

    public AnonymousClass7EU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BlI() {
        if (this.A00 != 0) {
            SearchMessageVideoThumbView searchMessageVideoThumbView = (SearchMessageVideoThumbView) this.A01;
            searchMessageVideoThumbView.A02.setVisibility(0);
            int textSize = ((int) searchMessageVideoThumbView.A02.getTextSize()) + (searchMessageVideoThumbView.getResources().getDimensionPixelSize(2131168541) * 2);
            ViewGroup.LayoutParams layoutParams = searchMessageVideoThumbView.A00.getLayoutParams();
            int i = layoutParams.height;
            int i2 = layoutParams.width;
            if (i < textSize) {
                int i3 = 3;
                if (AnonymousClass3MW.A1Z(searchMessageVideoThumbView.A03)) {
                    i3 = 5;
                }
                searchMessageVideoThumbView.A00.setLayoutParams(new FrameLayout.LayoutParams(i2, textSize, i3 | 80));
                return;
            }
            return;
        }
        AnonymousClass3uK.A0B((AnonymousClass3uK) this.A01);
    }
}
