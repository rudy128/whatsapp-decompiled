package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.CeW  reason: case insensitive filesystem */
public abstract class C25371CeW {
    public static final Handler A00 = C17890vO.A0D();

    public static void A00(View view, DOZ doz, DFL dfl, DFL dfl2) {
        Object A04 = C26272CwJ.A04(doz, dfl);
        C28111Yx.A02(A04);
        D8L d8l = (D8L) A04;
        A00.removeCallbacks(d8l.A03);
        boolean A0I = dfl.A0I(67, false);
        if (!d8l.A02) {
            BH5 bh5 = new BH5(doz, dfl, dfl2);
            Context context = doz.A00;
            GestureDetector gestureDetector = new GestureDetector(context, bh5);
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, bh5);
            int i = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i >= 23) {
                scaleGestureDetector.setStylusScaleEnabled(false);
            }
            d8l.A01 = bh5;
            d8l.A00 = new D54(gestureDetector, scaleGestureDetector, bh5, A0I);
            d8l.A02 = true;
        }
        BH5 bh52 = d8l.A01;
        if (bh52 != null) {
            bh52.A01 = view;
        }
        if (A0I && (view instanceof C01930Bz)) {
            ((C01930Bz) view).A00 = new DFH(d8l);
        }
        view.setOnTouchListener(d8l.A00);
        view.setOnKeyListener(new C26577D4r(d8l));
    }
}
