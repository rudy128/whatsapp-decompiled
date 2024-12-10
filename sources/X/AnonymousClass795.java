package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.WaImageView;
import com.whatsapp.mediacomposer.PtvComposerFragment;

/* renamed from: X.795  reason: invalid class name */
public class AnonymousClass795 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass795(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, Object obj2, int i) {
        viewTreeObserver.addOnGlobalLayoutListener(new AnonymousClass795(obj, obj2, i));
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        switch (this.A00) {
            case 2:
                C133266oT r3 = (C133266oT) this.A01;
                FrameLayout frameLayout = r3.A07;
                int height = frameLayout.getHeight();
                if (height > 0) {
                    AnonymousClass3MY.A1D(frameLayout, this);
                    WaImageView waImageView = r3.A0D;
                    C108955ca.A1I(waImageView, height, waImageView.getLayoutParams());
                    AnonymousClass3MX.A1J(r3.A0H, ((View) this.A02).getHeight());
                    return;
                }
                return;
            case 3:
                C130026il r5 = (C130026il) this.A02;
                View view = (View) this.A01;
                int[] A1W = C108945cZ.A1W();
                view.getLocationInWindow(A1W);
                int i = A1W[0] - r5.A00;
                AnonymousClass1D6 A002 = AnonymousClass1D6.A00(Integer.valueOf(i), (A1W[1] - view.getHeight()) - r5.A01.getResources().getDimensionPixelOffset(2131166079));
                r5.A02.showAtLocation(view, 8388659, AnonymousClass3MZ.A04(A002), C108955ca.A09(A002));
                view.postDelayed(new C70563Bp(r5, 28), 5000);
                viewTreeObserver = view.getViewTreeObserver();
                break;
            case 4:
                PtvComposerFragment ptvComposerFragment = (PtvComposerFragment) this.A02;
                FrameLayout frameLayout2 = (FrameLayout) this.A01;
                if (frameLayout2.getMeasuredWidth() > 0 && frameLayout2.getMeasuredHeight() > 0) {
                    AnonymousClass3MY.A1D(frameLayout2, this);
                    PtvComposerFragment.A00(frameLayout2, ptvComposerFragment);
                    return;
                }
                return;
            case 5:
                NestedScrollView nestedScrollView = (NestedScrollView) this.A01;
                nestedScrollView.getScrollX();
                int scrollY = nestedScrollView.getScrollY();
                nestedScrollView.getScrollX();
                nestedScrollView.getScrollY();
                ((E3d) this.A02).C4a(nestedScrollView, scrollY);
                viewTreeObserver = nestedScrollView.getViewTreeObserver();
                break;
            case 6:
                View view2 = (View) this.A01;
                AnonymousClass3MY.A1D(view2, this);
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(2131434559);
                View findViewById = view2.findViewById(2131434562);
                if (((double) (findViewById.getMeasuredWidth() + view2.findViewById(2131434560).getMeasuredWidth())) >= ((double) view2.getMeasuredWidth()) * 0.7d) {
                    linearLayout.setOrientation(1);
                    C27641Ww.A03(findViewById, 0, 0);
                    return;
                }
                return;
            case 7:
                AnonymousClass3MY.A1D((View) this.A02, this);
                C108945cZ.A1P(this.A01);
                return;
            default:
                AnonymousClass3MY.A1D((View) this.A02, this);
                C108945cZ.A1Q(this.A01);
                return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
