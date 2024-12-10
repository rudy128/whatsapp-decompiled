package X;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.Map;

public class BH5 extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
    public PointF A00;
    public View A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final DOZ A05;
    public final DFL A06;
    public final DFL A07;
    public final Map A08 = new AnonymousClass00O(2);

    public static C20046A4p A01(BH5 bh5) {
        C20046A4p a4p = new C20046A4p();
        a4p.A03(bh5.A06, 0);
        return a4p;
    }

    public static void A05(MotionEvent motionEvent, BH5 bh5, C20046A4p a4p, Object obj) {
        a4p.A03(obj, 3);
        a4p.A03(Float.valueOf(motionEvent.getX() - bh5.A01.getX()), 4);
        a4p.A03(Float.valueOf(motionEvent.getY() - bh5.A01.getY()), 5);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(y) > Math.abs(x)) {
            i = 42;
            if (y > 0.0f) {
                i = 38;
            }
        } else {
            i = 40;
            if (x > 0.0f) {
                i = 41;
            }
        }
        E8A A072 = A07(i);
        if (A072 == null) {
            return false;
        }
        C26209Cul.A04(this.A05, this.A07, A01(this), A072, 1);
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        this.A02 = true;
        E8A A072 = A07(35);
        E8A A073 = A07(61);
        if (A072 != null) {
            C26209Cul.A04(this.A05, this.A07, A01(this), A072, 1);
        }
        if (this.A01 != null && A073 != null) {
            DFL dfl = this.A07;
            C20046A4p A012 = A01(this);
            DOZ doz = this.A05;
            A012.A03(doz, 1);
            A012.A03(dfl, 2);
            A05(motionEvent, this, A012, "detected");
            C26209Cul.A03(doz, dfl, A012, A073);
        }
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A00 = null;
    }

    public static Float A03(BH5 bh5, float f) {
        return Float.valueOf((f * 100.0f) / ((float) bh5.A01.getHeight()));
    }

    public static Float A04(BH5 bh5, float f) {
        return Float.valueOf((f * 100.0f) / ((float) bh5.A01.getWidth()));
    }

    private boolean A06(MotionEvent motionEvent) {
        boolean z;
        if (this.A01 == null) {
            return false;
        }
        E8A A072 = A07(43);
        E8A A073 = A07(54);
        E8A A074 = A07(62);
        if (A072 != null) {
            C26209Cul.A04(this.A05, this.A07, A01(this), A072, 1);
            z = true;
        } else {
            z = false;
        }
        if (A073 != null) {
            DFL dfl = this.A07;
            C20046A4p A012 = A01(this);
            DOZ doz = this.A05;
            A012.A03(doz, 1);
            A012.A03(A02(motionEvent, this, A012, 2), 3);
            C26209Cul.A03(doz, dfl, A012, A073);
            z = true;
        }
        if (A074 == null) {
            return z;
        }
        DFL dfl2 = this.A07;
        C20046A4p A013 = A01(this);
        DOZ doz2 = this.A05;
        A013.A03(doz2, 1);
        A013.A03(dfl2, 2);
        A013.A03(A02(motionEvent, this, A013, 3), 4);
        C26209Cul.A03(doz2, dfl2, A013, A074);
        return true;
    }

    public E8A A07(int i) {
        Map map = this.A08;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (E8A) map.get(valueOf);
        }
        E8A A0A = this.A07.A0A(i);
        map.put(valueOf, A0A);
        return A0A;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z;
        if (this.A01 == null) {
            return false;
        }
        E8A A072 = A07(36);
        E8A A073 = A07(45);
        E8A A074 = A07(65);
        PointF A002 = A00(motionEvent, this);
        if (A072 != null) {
            C26209Cul.A04(this.A05, this.A07, A01(this), A072, 1);
            z = true;
        } else {
            z = false;
        }
        if (A073 != null) {
            DFL dfl = this.A07;
            C20046A4p A012 = A01(this);
            DOZ doz = this.A05;
            A012.A03(doz, 1);
            A012.A03(A04(this, A002.x), 2);
            A012.A03(A03(this, A002.y), 3);
            C26209Cul.A03(doz, dfl, A012, A073);
            z = true;
        }
        if (A074 == null) {
            return z;
        }
        DFL dfl2 = this.A07;
        C20046A4p A013 = A01(this);
        DOZ doz2 = this.A05;
        A013.A03(doz2, 1);
        A013.A03(dfl2, 2);
        A013.A03(Float.valueOf(A002.x), 3);
        A013.A03(Float.valueOf(A002.y), 4);
        C26209Cul.A03(doz2, dfl2, A013, A074);
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (this.A01 == null) {
            return false;
        }
        E8A A072 = A07(49);
        if (A072 != null) {
            PointF A002 = A00(motionEvent, this);
            DFL dfl = this.A07;
            C20046A4p A012 = A01(this);
            DOZ doz = this.A05;
            A012.A03(doz, 1);
            A012.A03(A04(this, A002.x), 2);
            A012.A03(A03(this, A002.y), 3);
            C26209Cul.A03(doz, dfl, A012, A072);
        }
        return true;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        E8A A072;
        if (this.A00 == null || this.A01 == null || (A072 = A07(44)) == null) {
            return false;
        }
        DFL dfl = this.A07;
        C20046A4p A012 = A01(this);
        DOZ doz = this.A05;
        A012.A03(doz, 1);
        A012.A03(Float.valueOf(scaleGestureDetector.getScaleFactor()), 2);
        A012.A03(A04(this, this.A00.x), 3);
        A012.A03(A03(this, this.A00.y), 4);
        C26209Cul.A03(doz, dfl, A012, A072);
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        E8A A072;
        if (!(this.A01 == null || (A072 = A07(48)) == null)) {
            DFL dfl = this.A07;
            C20046A4p A012 = A01(this);
            DOZ doz = this.A05;
            A012.A03(doz, 1);
            A012.A03(A04(this, f), 2);
            Object A032 = C25681CkC.A03(doz, dfl, BE7.A0R(A012, A03(this, f2), 3), A072);
            if (!(A032 instanceof Boolean)) {
                C25913CoX.A01("BloksFoaExtensionsGestureListener", "onScroll return value should return boolean (true if handled)");
            } else {
                boolean A1Y = AnonymousClass000.A1Y(A032);
                if (A1Y) {
                    this.A04 = true;
                }
                this.A03 = true;
                return A1Y;
            }
        }
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if ((A07(36) != null || A07(45) != null || A07(65) != null) && A06(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        if (A07(36) == null && A07(45) == null && A07(65) == null && A06(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.00O, java.util.Map] */
    public BH5(DOZ doz, DFL dfl, DFL dfl2) {
        this.A05 = doz;
        this.A07 = dfl;
        this.A06 = dfl2;
    }

    public static PointF A00(MotionEvent motionEvent, BH5 bh5) {
        return C25433Cff.A00(new PointF(motionEvent.getX(), motionEvent.getY()), bh5.A01);
    }

    public static Float A02(MotionEvent motionEvent, BH5 bh5, C20046A4p a4p, int i) {
        a4p.A03(Float.valueOf(motionEvent.getX() - bh5.A01.getX()), i);
        return Float.valueOf(motionEvent.getY() - bh5.A01.getY());
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        if (this.A01 == null) {
            return true;
        }
        this.A00 = C25433Cff.A00(new PointF(focusX, focusY), this.A01);
        return true;
    }
}
