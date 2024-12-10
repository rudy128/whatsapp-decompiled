package X;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.HomeActivity;

/* renamed from: X.2vC  reason: invalid class name and case insensitive filesystem */
public class C64702vC implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;

    public C64702vC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C29341c3 r2;
        switch (this.A00) {
            case 0:
                C29221bq r1 = (C29221bq) this.A01;
                ImageView imageView = r1.A0O;
                if (imageView.getVisibility() == 0 && (r2 = r1.A06) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    r2.setBounds(rect);
                    r2.A08(imageView, (FrameLayout) null);
                    return;
                }
                return;
            case 1:
                HomeActivity homeActivity = (HomeActivity) this.A01;
                if (((C38581rX) homeActivity.A1b.get()).A01() || ((C38581rX) homeActivity.A1b.get()).A03()) {
                    if (homeActivity.A04 == null && homeActivity.A0C.findViewById(2131430389) != null) {
                        HomeActivity.A1E(homeActivity, i4, i2, i, i3);
                        return;
                    }
                    return;
                } else if (homeActivity.A04 == null) {
                    HomeActivity.A1E(homeActivity, i4, i2, i3, i);
                    return;
                } else {
                    return;
                }
            default:
                view.removeOnLayoutChangeListener(this);
                Toolbar toolbar = (Toolbar) this.A01;
                toolbar.setOverflowIcon(toolbar.getOverflowIcon());
                return;
        }
    }
}
