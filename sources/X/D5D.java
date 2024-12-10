package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Collections;
import java.util.List;

public class D5D implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final int A01;
    public final View A02;
    public final List A03 = Collections.synchronizedList(AnonymousClass8BR.A14());

    public D5D(View view, boolean z) {
        float f;
        this.A02 = view;
        this.A00 = z;
        float A002 = 100.0f * C72463Mc.A00(view.getContext());
        if (A002 >= 0.0f) {
            f = A002 + 0.5f;
        } else {
            f = A002 - 0.5f;
        }
        this.A01 = (int) f;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public static int A00(View view) {
        Object systemService = view.getContext().getSystemService("window");
        C199610h.A04(systemService);
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        if (view.getRootWindowInsets() != null) {
            defaultDisplay.getRealSize(point);
            return point.y - view.getRootWindowInsets().getStableInsetBottom();
        }
        defaultDisplay.getSize(point);
        return point.y;
    }

    public void onGlobalLayout() {
        int i;
        Rect A07 = AnonymousClass3MW.A07();
        View view = this.A02;
        view.getWindowVisibleDisplayFrame(A07);
        if (Build.VERSION.SDK_INT >= 23) {
            i = A00(view);
        } else {
            Object systemService = view.getContext().getSystemService("window");
            C199610h.A04(systemService);
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.y;
        }
        int i2 = i - A07.bottom;
        boolean z = this.A00;
        int i3 = this.A01;
        if (!z) {
            if (i2 > i3) {
                this.A00 = true;
                List<E8T> list = this.A03;
                synchronized (list) {
                    for (E8T e8t : list) {
                        if (e8t != null) {
                            e8t.C5x(i2);
                        }
                    }
                }
            }
        } else if (i2 > i3) {
            List<E8T> list2 = this.A03;
            synchronized (list2) {
                for (E8T e8t2 : list2) {
                    if (e8t2 != null) {
                        e8t2.C5w(i2);
                    }
                }
            }
        } else if (i2 < i3) {
            this.A00 = false;
            List<E8T> list3 = this.A03;
            synchronized (list3) {
                for (E8T e8t3 : list3) {
                    if (e8t3 != null) {
                        e8t3.C5v();
                    }
                }
            }
        }
    }
}
