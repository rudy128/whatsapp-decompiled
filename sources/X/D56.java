package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.function.Consumer;

public final class D56 implements View.OnTouchListener, View.OnHoverListener {
    public final C27271Vk A00;
    public final Consumer A01;
    public final /* synthetic */ C26216Cuy A02;

    public boolean onHover(View view, MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 1);
        A00(motionEvent);
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 1);
        A00(motionEvent);
        return false;
    }

    public D56(C27271Vk r1, C26216Cuy cuy, Consumer consumer) {
        this.A02 = cuy;
        this.A00 = r1;
        this.A01 = consumer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r0 != false) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.view.MotionEvent r5) {
        /*
            r4 = this;
            X.1Vk r3 = r4.A00
            java.lang.Object r2 = r3.get()
            int r1 = r5.getAction()
            r0 = 7
            if (r1 == r0) goto L_0x005a
            int r1 = r5.getAction()
            r0 = 9
            if (r1 == r0) goto L_0x005a
            int r0 = r5.getAction()
            if (r0 == 0) goto L_0x005a
            int r1 = r5.getAction()
            r0 = 10
            if (r1 != r0) goto L_0x002d
            java.util.function.Consumer r1 = r4.A01
            r0 = 0
        L_0x0026:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.accept(r0)
        L_0x002d:
            java.lang.Object r0 = r3.get()
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 != 0) goto L_0x0059
            X.Cuy r1 = r4.A02
            android.view.View r3 = r1.A03
            java.lang.Runnable r2 = r1.A04
            r3.removeCallbacks(r2)
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0049
            boolean r0 = r1.A01
            r1 = 0
            if (r0 == 0) goto L_0x004a
        L_0x0049:
            r1 = 1
        L_0x004a:
            int r0 = r3.getVisibility()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r1 == r0) goto L_0x0059
            r0 = 20
            r3.postDelayed(r2, r0)
        L_0x0059:
            return
        L_0x005a:
            java.util.function.Consumer r1 = r4.A01
            r0 = 1
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D56.A00(android.view.MotionEvent):void");
    }
}
