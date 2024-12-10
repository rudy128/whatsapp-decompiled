package X;

import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;

/* renamed from: X.AFo  reason: case insensitive filesystem */
public class C20306AFo implements Animation.AnimationListener {
    public final int A00;
    public final Object A01;

    public C20306AFo(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity, int i) {
        this.A00 = i;
        this.A01 = businessDirectorySERPMapViewActivity;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.A00 != 0) {
            BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = (BusinessDirectorySERPMapViewActivity) this.A01;
            int dimensionPixelSize = businessDirectorySERPMapViewActivity.getResources().getDimensionPixelSize(2131168345);
            ImageView imageView = businessDirectorySERPMapViewActivity.A00;
            if (imageView != null) {
                C43531zx.A03(imageView, new C39351sv(0, 0, dimensionPixelSize, dimensionPixelSize));
                RecyclerView recyclerView = businessDirectorySERPMapViewActivity.A02;
                if (recyclerView == null) {
                    C18070vi.A11("horizontalBusinessListView");
                    throw null;
                } else {
                    recyclerView.setVisibility(8);
                    return;
                }
            }
        } else {
            BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity2 = (BusinessDirectorySERPMapViewActivity) this.A01;
            int dimensionPixelSize2 = businessDirectorySERPMapViewActivity2.getResources().getDimensionPixelSize(2131168345);
            int dimensionPixelSize3 = businessDirectorySERPMapViewActivity2.getResources().getDimensionPixelSize(2131168354);
            ImageView imageView2 = businessDirectorySERPMapViewActivity2.A00;
            if (imageView2 != null) {
                C43531zx.A03(imageView2, new C39351sv(0, 0, dimensionPixelSize2, dimensionPixelSize3));
                return;
            }
        }
        C18070vi.A11("myLocationBtn");
        throw null;
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
