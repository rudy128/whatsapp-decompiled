package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.ListFragment;
import com.whatsapp.status.StatusesFragment;

/* renamed from: X.79A  reason: invalid class name */
public class AnonymousClass79A implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass79A(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, int i) {
        viewTreeObserver.addOnPreDrawListener(new AnonymousClass79A(obj, i));
    }

    public boolean onPreDraw() {
        float f;
        switch (this.A00) {
            case 0:
                C143087By r1 = (C143087By) this.A01;
                if (r1.A09.getHeight() <= 0 || !r1.A1C.isEmpty()) {
                    return true;
                }
                AnonymousClass3MX.A1G(r1.A09, this);
                View view = r1.A09;
                view.setTranslationY(C108945cZ.A04(view));
                return true;
            case 1:
                AnonymousClass75M r4 = (AnonymousClass75M) this.A01;
                AnonymousClass3MX.A1G(r4.A07, this);
                r4.A0T.A00(C108945cZ.A04(r4.A07));
                AnonymousClass75M.A04(r4.A0H(), r4, (String) null, r4.A0G(), false);
                r4.A0Y((Float) null, true);
                return true;
            case 2:
                AnonymousClass75M r2 = (AnonymousClass75M) this.A01;
                AnonymousClass3MX.A1G(r2.A0D, this);
                AnonymousClass75M.A0C(r2, r2.A0D.getHeight());
                r2.A0b(false);
                r2.A0X((Float) null, false);
                return true;
            case 3:
                View view2 = (View) this.A01;
                AnonymousClass3MX.A1G(view2, this);
                View findViewById = view2.findViewById(16908335);
                if (findViewById != null) {
                    AnonymousClass1Xr.A04(findViewById, "statusBar");
                }
                View findViewById2 = view2.findViewById(16908336);
                if (findViewById2 == null) {
                    return true;
                }
                AnonymousClass1Xr.A04(findViewById2, "navigationBar");
                return true;
            case 4:
                C134176qA r5 = (C134176qA) this.A01;
                AnonymousClass3MX.A1G(r5.A07, this);
                View view3 = r5.A0C;
                View findViewById3 = view3.findViewById(2131434969);
                if (findViewById3 == null) {
                    return true;
                }
                int[] iArr = r5.A0I;
                findViewById3.getLocationOnScreen(iArr);
                int[] iArr2 = r5.A0H;
                view3.getLocationOnScreen(iArr2);
                TextView textView = r5.A05;
                float x = textView.getX();
                int i = iArr[0] - iArr2[0];
                float f2 = (float) i;
                if (x == f2) {
                    return true;
                }
                r5.A00 = i;
                textView.setX(f2);
                r5.A06.setX((float) r5.A00);
                return true;
            case 5:
                StatusesFragment statusesFragment = (StatusesFragment) this.A01;
                ListFragment.A00(statusesFragment);
                AnonymousClass3MX.A1G(statusesFragment.A04, this);
                StatusesFragment.A05(new C109195cy(this, 31), statusesFragment, true);
                return false;
            default:
                C1403871f r22 = (C1403871f) this.A01;
                View view4 = r22.A02;
                AnonymousClass3MX.A1G(view4, this);
                boolean canScrollVertically = view4.canScrollVertically(1);
                View view5 = r22.A01;
                if (canScrollVertically) {
                    f = (float) r22.A00;
                } else {
                    f = 0.0f;
                }
                view5.setElevation(f);
                return false;
        }
    }
}
