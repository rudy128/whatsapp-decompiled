package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.78o  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1422078o implements View.OnTouchListener {
    public final /* synthetic */ PointF A00;
    public final /* synthetic */ AnonymousClass6Gp A01;
    public final /* synthetic */ AtomicLong A02;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float y;
        float y2;
        AnonymousClass6Gp r4 = this.A01;
        PointF pointF = this.A00;
        AtomicLong atomicLong = this.A02;
        C18070vi.A0e(pointF, 1, atomicLong);
        if (r4.A01.A0J != 4) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                if (r4.A0K() instanceof AnonymousClass6GW) {
                    AnonymousClass70O A0K = r4.A0K();
                    C18070vi.A0z(A0K, "null cannot be cast to non-null type com.whatsapp.status.playback.content.StatusPlaybackText");
                    AnonymousClass6GW r8 = (AnonymousClass6GW) A0K;
                    boolean z = r4.A0V;
                    float[] A1V = C108945cZ.A1V();
                    if (z) {
                        A1V[0] = motionEvent.getRawX();
                        y = motionEvent.getRawY();
                    } else {
                        A1V[0] = motionEvent.getX();
                        y = motionEvent.getY();
                    }
                    A1V[1] = y;
                    boolean A0J = r8.A0J(A1V[0], y, false);
                    float x = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    Rect A07 = AnonymousClass3MW.A07();
                    View view2 = r8.A01;
                    if (view2 != null) {
                        view2.getGlobalVisibleRect(A07);
                    }
                    if (A07.contains((int) x, (int) y3)) {
                        return false;
                    }
                    if (A0J) {
                        return true;
                    }
                }
                C108985cd.A0x(pointF, motionEvent);
                atomicLong.set(SystemClock.elapsedRealtime());
                r4.A0P();
                Handler handler = r4.A0D;
                Runnable runnable = r4.A0U;
                handler.removeCallbacks(runnable);
                Boolean bool = C17970vW.A03;
                handler.postDelayed(runnable, 500);
            } else if (action == 1) {
                if (r4.A0K() instanceof AnonymousClass6GW) {
                    AnonymousClass70O A0K2 = r4.A0K();
                    C18070vi.A0z(A0K2, "null cannot be cast to non-null type com.whatsapp.status.playback.content.StatusPlaybackText");
                    AnonymousClass6GW r7 = (AnonymousClass6GW) A0K2;
                    boolean z2 = r4.A0V;
                    float[] A1V2 = C108945cZ.A1V();
                    if (z2) {
                        A1V2[0] = motionEvent.getRawX();
                        y2 = motionEvent.getRawY();
                    } else {
                        A1V2[0] = motionEvent.getX();
                        y2 = motionEvent.getY();
                    }
                    A1V2[1] = y2;
                    boolean A0J2 = r7.A0J(A1V2[0], y2, true);
                    float x2 = motionEvent.getX();
                    float y4 = motionEvent.getY();
                    Rect A072 = AnonymousClass3MW.A07();
                    View view3 = r7.A01;
                    if (view3 != null) {
                        view3.getGlobalVisibleRect(A072);
                    }
                    boolean contains = A072.contains((int) x2, (int) y4);
                    if (A0J2 || contains) {
                        return true;
                    }
                }
                C108985cd.A0x(pointF, motionEvent);
                r4.A0N();
                view.performClick();
            }
        }
        if (motionEvent.getAction() != 3) {
            return false;
        }
        r4.A0N();
        AnonymousClass6Gp.A07(r4);
        return false;
    }

    public /* synthetic */ C1422078o(PointF pointF, AnonymousClass6Gp r2, AtomicLong atomicLong) {
        this.A01 = r2;
        this.A00 = pointF;
        this.A02 = atomicLong;
    }
}
