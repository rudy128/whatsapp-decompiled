package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar;

/* renamed from: X.D4b  reason: case insensitive filesystem */
public class C26561D4b implements GestureDetector.OnGestureListener {
    public final int A00;
    public final Object A01;

    public C26561D4b(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer num;
        boolean z;
        boolean z2;
        if (this.A00 == 0) {
            return false;
        }
        if (f > f2) {
            if (f > 0.0f) {
                num = AnonymousClass00R.A0N;
            } else {
                num = AnonymousClass00R.A0C;
            }
        } else if (f2 > 0.0f) {
            num = AnonymousClass00R.A01;
        } else {
            num = AnonymousClass00R.A00;
        }
        CZQ czq = (CZQ) this.A01;
        int i = czq.A05;
        if ((!AnonymousClass000.A1T(i & 4, 4) || num != AnonymousClass00R.A0C) && !((i & 8) == 8 && num == AnonymousClass00R.A0N)) {
            z = false;
        } else {
            z = true;
        }
        if (((i & 2) == 2 && num == AnonymousClass00R.A01) || ((i & 1) == 1 && num == AnonymousClass00R.A00)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        E6W e6w = czq.A0D;
        motionEvent2.getX();
        motionEvent2.getY();
        Integer num2 = AnonymousClass00R.A00;
        WaRangeSeekBar waRangeSeekBar = (WaRangeSeekBar) e6w;
        waRangeSeekBar.A06 = null;
        WaRangeSeekBar.A01(waRangeSeekBar);
        czq.A0G = num2;
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }
}
