package X;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class D71 implements C72343Lo {
    public final /* synthetic */ BM5 A00;

    public D71(BM5 bm5) {
        this.A00 = bm5;
    }

    public boolean Bw2(MotionEvent motionEvent, RecyclerView recyclerView) {
        int findPointerIndex;
        BM5 bm5 = this.A00;
        bm5.A0E.A00.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            bm5.A07 = motionEvent.getPointerId(0);
            bm5.A02 = motionEvent.getX();
            bm5.A03 = motionEvent.getY();
            VelocityTracker velocityTracker = bm5.A0C;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            bm5.A0C = VelocityTracker.obtain();
            if (bm5.A0H == null) {
                List list = bm5.A0K;
                if (!list.isEmpty()) {
                    View A06 = bm5.A06(motionEvent);
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        C26309CxS cxS = (C26309CxS) list.get(size);
                        C42011xT r6 = cxS.A0C;
                        View view = r6.A0H;
                        if (view == A06) {
                            bm5.A02 -= cxS.A01;
                            bm5.A03 -= cxS.A02;
                            bm5.A0C(r6, true);
                            if (bm5.A0Q.remove(view)) {
                                bm5.A0F.A04(r6, bm5.A0I);
                            }
                            bm5.A0B(r6, cxS.A0A);
                            bm5.A08(motionEvent, bm5.A08, 0);
                        }
                    }
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            bm5.A07 = -1;
            bm5.A0B((C42011xT) null, 0);
        } else {
            int i = bm5.A07;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                bm5.A07(motionEvent, actionMasked, findPointerIndex);
            }
        }
        VelocityTracker velocityTracker2 = bm5.A0C;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (bm5.A0H == null) {
            return false;
        }
        return true;
    }

    public void C3K(boolean z) {
        if (z) {
            this.A00.A0B((C42011xT) null, 0);
        }
    }

    public void C8t(MotionEvent motionEvent, RecyclerView recyclerView) {
        BM5 bm5 = this.A00;
        bm5.A0E.A00.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = bm5.A0C;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (bm5.A07 != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(bm5.A07);
            if (findPointerIndex >= 0) {
                bm5.A07(motionEvent, actionMasked, findPointerIndex);
            }
            C42011xT r1 = bm5.A0H;
            if (r1 != null) {
                int i = 0;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            VelocityTracker velocityTracker2 = bm5.A0C;
                            if (velocityTracker2 != null) {
                                velocityTracker2.clear();
                            }
                        } else if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == bm5.A07) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                bm5.A07 = motionEvent.getPointerId(i);
                                bm5.A08(motionEvent, bm5.A08, actionIndex);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (findPointerIndex >= 0) {
                        bm5.A08(motionEvent, bm5.A08, findPointerIndex);
                        bm5.A09(r1);
                        RecyclerView recyclerView2 = bm5.A0I;
                        Runnable runnable = bm5.A0P;
                        recyclerView2.removeCallbacks(runnable);
                        runnable.run();
                        bm5.A0I.invalidate();
                        return;
                    } else {
                        return;
                    }
                }
                bm5.A0B((C42011xT) null, 0);
                bm5.A07 = -1;
            }
        }
    }
}
