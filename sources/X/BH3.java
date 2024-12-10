package X;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class BH3 extends GestureDetector.SimpleOnGestureListener {
    public final int A00;
    public final Object A01;

    public BH3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                CJQ cjq = ((C22806BPu) this.A01).A05;
                if (cjq == null) {
                    return false;
                }
                motionEvent.getX();
                motionEvent.getY();
                cjq.A00.COw();
                return true;
            case 2:
                return false;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (1 - this.A00 != 0) {
            return super.onDown(motionEvent);
        }
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                CJR cjr = ((C22806BPu) this.A01).A06;
                if (cjr == null) {
                    return false;
                }
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                C22808BPw bPw = cjr.A00;
                C25632CjI A0F = bPw.A0F();
                if (A0F == null) {
                    return false;
                }
                float[] A1V = C108945cZ.A1V();
                A1V[0] = (float) x;
                A1V[1] = (float) y;
                C28614EAk eAk = bPw.A0i;
                eAk.Bil(A1V);
                if (!BE9.A1T(C25632CjI.A0U, A0F) && !BE9.A1T(C25632CjI.A0V, A0F)) {
                    return true;
                }
                eAk.BLR((int) A1V[0], (int) A1V[1]);
                return true;
            case 1:
                return true;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        if (1 - this.A00 != 0) {
            return super.onSingleTapUp(motionEvent);
        }
        C18070vi.A0d(motionEvent, 0);
        BHG bhg = (BHG) this.A01;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (!bhg.A0D) {
            return true;
        }
        C28614EAk eAk = bhg.A0Q;
        if (!eAk.isConnected()) {
            return true;
        }
        float[] A1V = C108945cZ.A1V();
        A1V[0] = x;
        A1V[1] = y;
        if (!eAk.Bil(A1V)) {
            Log.e(bhg.A0R, "mapViewPointToDriverPoint called before initialiseViewToDriverMatrix");
            return true;
        }
        int i = (int) A1V[0];
        int i2 = (int) A1V[1];
        if (bhg.A0G) {
            eAk.CNa(new C22901BUm(bhg, 15), i, i2);
        }
        if (!bhg.A0F) {
            return true;
        }
        eAk.BLR(i, i2);
        return true;
    }
}
