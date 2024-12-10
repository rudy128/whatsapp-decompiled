package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;

public class D55 implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public D55(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00() {
        NumberEntryKeyboard numberEntryKeyboard = (NumberEntryKeyboard) this.A01;
        int i = NumberEntryKeyboard.A0J;
        numberEntryKeyboard.A03 = null;
        if (numberEntryKeyboard.A0B) {
            CT2 ct2 = (CT2) C108965cb.A0o(numberEntryKeyboard.A0A, numberEntryKeyboard.A02);
            ct2.getClass();
            if (ct2.A03.isRunning()) {
                ct2.A02 = true;
                return;
            }
            ValueAnimator valueAnimator = ct2.A04;
            if (!valueAnimator.isRunning()) {
                valueAnimator.start();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r0.onTouchEvent(r4) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r0.onTouchEvent(r4) == false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r22, android.view.MotionEvent r23) {
        /*
            r21 = this;
            r3 = r21
            int r0 = r3.A00
            r7 = r22
            r4 = r23
            switch(r0) {
                case 0: goto L_0x0028;
                case 1: goto L_0x001d;
                case 2: goto L_0x0059;
                case 3: goto L_0x001a;
                case 4: goto L_0x001a;
                case 5: goto L_0x000b;
                case 6: goto L_0x000b;
                case 7: goto L_0x0091;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r3.A01
            X.00H r0 = (X.AnonymousClass00H) r0
            java.lang.Object r0 = r0.get()
        L_0x0013:
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
        L_0x0015:
            boolean r5 = r0.onTouchEvent(r4)
        L_0x0019:
            return r5
        L_0x001a:
            java.lang.Object r0 = r3.A01
            goto L_0x0013
        L_0x001d:
            java.lang.Object r1 = r3.A01
            X.CIZ r1 = (X.CIZ) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.view.GestureDetector r0 = r1.A00
            goto L_0x0015
        L_0x0028:
            java.lang.Object r3 = r3.A01
            X.BPu r3 = (X.C22806BPu) r3
            android.view.View$OnTouchListener r0 = r3.A02
            r5 = 1
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.onTouch(r7, r4)
            if (r0 == 0) goto L_0x0038
            return r5
        L_0x0038:
            android.view.GestureDetector r0 = r3.A00
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.onTouchEvent(r4)
            r2 = 1
            if (r0 != 0) goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            android.view.ScaleGestureDetector r0 = r3.A01
            if (r0 == 0) goto L_0x004f
            boolean r0 = r0.onTouchEvent(r4)
            r1 = 1
            if (r0 != 0) goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x008f
            if (r2 != 0) goto L_0x0019
            if (r1 == 0) goto L_0x008f
            return r5
        L_0x0059:
            java.lang.Object r7 = r3.A01
            X.Bio r7 = (X.Bio) r7
            int r0 = r4.getAction()
            r6 = 1
            r5 = 0
            if (r0 != r6) goto L_0x008f
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r7.A00
            long r3 = r3 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0078
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x007a
        L_0x0078:
            r7.A05 = r5
        L_0x007a:
            X.Bio.A00(r7)
            r7.A05 = r6
            long r0 = java.lang.System.currentTimeMillis()
            r7.A00 = r0
            goto L_0x008f
        L_0x0086:
            android.view.View r0 = r2.A03
            if (r0 == 0) goto L_0x00e4
            if (r0 == r5) goto L_0x00e4
            r3.A00()
        L_0x008f:
            r5 = 0
            return r5
        L_0x0091:
            java.lang.Object r2 = r3.A01
            com.whatsapp.numberkeyboard.NumberEntryKeyboard r2 = (com.whatsapp.numberkeyboard.NumberEntryKeyboard) r2
            int r0 = com.whatsapp.numberkeyboard.NumberEntryKeyboard.A0J
            android.widget.EditText r0 = r2.A04
            if (r0 == 0) goto L_0x0208
            float r9 = r4.getX()
            float r8 = r4.getY()
            r11 = 0
            r6 = 0
        L_0x00a5:
            X.C5J[][] r0 = r2.A0E
            int r0 = r0.length
            r5 = 0
            if (r6 >= r0) goto L_0x00d5
            r1 = 0
        L_0x00ac:
            X.C5J[][] r10 = r2.A0E
            r0 = r10[r11]
            int r0 = r0.length
            if (r1 >= r0) goto L_0x0204
            r0 = r10[r6]
            r0 = r0[r1]
            if (r0 == 0) goto L_0x0200
            android.graphics.RectF r0 = r0.A01
            boolean r0 = r0.contains(r9, r8)
            if (r0 == 0) goto L_0x0200
            android.view.View[][] r0 = r2.A0D
            r0 = r0[r6]
            r6 = r0[r1]
            int r1 = r6.getId()
            r0 = 2131429752(0x7f0b0978, float:1.8481186E38)
            if (r1 != r0) goto L_0x00d4
            X.E8G r0 = r2.A08
            if (r0 == 0) goto L_0x00d5
        L_0x00d4:
            r5 = r6
        L_0x00d5:
            int r1 = r4.getAction()
            r4 = 1
            if (r1 == 0) goto L_0x01a0
            if (r1 == r4) goto L_0x00e6
            r0 = 2
            if (r1 == r0) goto L_0x0086
            r0 = 3
            if (r1 == r0) goto L_0x00e6
        L_0x00e4:
            r5 = 1
            return r5
        L_0x00e6:
            android.view.View r0 = r2.A03
            if (r0 == 0) goto L_0x00e4
            if (r1 != r4) goto L_0x0123
            int r1 = r0.getId()
            r0 = 2131429752(0x7f0b0978, float:1.8481186E38)
            if (r1 == r0) goto L_0x0196
            android.view.View r5 = r2.A03
            int r1 = r5.getId()
            r0 = 2131433283(0x7f0b1743, float:1.8488347E38)
            if (r1 != r0) goto L_0x0127
            r12 = 8
        L_0x0102:
            android.widget.EditText r0 = r2.A04
            r7 = 0
            android.view.KeyEvent r6 = new android.view.KeyEvent
            r9 = r7
            r13 = r11
            r6.<init>(r7, r9, r11, r12, r13)
            r0.dispatchKeyEvent(r6)
            android.widget.EditText r0 = r2.A04
            android.view.KeyEvent r13 = new android.view.KeyEvent
            r16 = r7
            r14 = r7
            r18 = r4
            r19 = r12
            r20 = r11
            r13.<init>(r14, r16, r18, r19, r20)
            r0.dispatchKeyEvent(r13)
        L_0x0123:
            r3.A00()
            goto L_0x00e4
        L_0x0127:
            int r1 = r5.getId()
            r0 = 2131436472(0x7f0b23b8, float:1.8494815E38)
            if (r1 != r0) goto L_0x0133
            r12 = 9
            goto L_0x0102
        L_0x0133:
            int r1 = r5.getId()
            r0 = 2131436122(0x7f0b225a, float:1.8494105E38)
            if (r1 != r0) goto L_0x013f
            r12 = 10
            goto L_0x0102
        L_0x013f:
            int r1 = r5.getId()
            r0 = 2131430994(0x7f0b0e52, float:1.8483705E38)
            if (r1 != r0) goto L_0x014b
            r12 = 11
            goto L_0x0102
        L_0x014b:
            int r1 = r5.getId()
            r0 = 2131430892(0x7f0b0dec, float:1.8483498E38)
            if (r1 != r0) goto L_0x0157
            r12 = 12
            goto L_0x0102
        L_0x0157:
            int r1 = r5.getId()
            r0 = 2131435468(0x7f0b1fcc, float:1.849278E38)
            if (r1 != r0) goto L_0x0163
            r12 = 13
            goto L_0x0102
        L_0x0163:
            int r1 = r5.getId()
            r0 = 2131435337(0x7f0b1f49, float:1.8492513E38)
            if (r1 != r0) goto L_0x016f
            r12 = 14
            goto L_0x0102
        L_0x016f:
            int r1 = r5.getId()
            r0 = 2131430278(0x7f0b0b86, float:1.8482252E38)
            if (r1 != r0) goto L_0x017b
            r12 = 15
            goto L_0x0102
        L_0x017b:
            int r1 = r5.getId()
            r0 = 2131433128(0x7f0b16a8, float:1.8488033E38)
            if (r1 != r0) goto L_0x0188
            r12 = 16
            goto L_0x0102
        L_0x0188:
            int r1 = r5.getId()
            r0 = 2131437101(0x7f0b262d, float:1.8496091E38)
            r12 = 67
            if (r1 != r0) goto L_0x0102
            r12 = 7
            goto L_0x0102
        L_0x0196:
            X.E8G r1 = r2.A08
            if (r1 == 0) goto L_0x0123
            android.widget.EditText r0 = r2.A04
            r1.C1d(r0)
            goto L_0x0123
        L_0x01a0:
            android.view.View r0 = r2.A03
            if (r0 != 0) goto L_0x0208
            if (r5 == 0) goto L_0x0208
            r2.A03 = r5
            long r0 = java.lang.System.currentTimeMillis()
            r2.A02 = r0
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x01f9
            java.util.Map r0 = r2.A0I
            java.lang.Object r0 = r0.get(r5)
            X.C5J r0 = (X.C5J) r0
            r0.getClass()
            android.graphics.PointF r0 = r0.A00
            float r3 = r0.x
            float r1 = r0.y
            long r9 = r2.A02
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x01f9
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r3, r1)
            int r8 = com.whatsapp.numberkeyboard.NumberEntryKeyboard.A0J
            int r0 = r2.A01
            float r6 = (float) r0
            int r0 = r2.A00
            float r7 = (float) r0
            X.CQe r5 = r2.A07
            r5.getClass()
            X.CT2 r3 = new X.CT2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.util.Map r1 = r2.A0A
            r1.getClass()
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r1.put(r0, r3)
            r3.A02 = r11
            android.animation.ValueAnimator r1 = r3.A03
            boolean r0 = r1.isRunning()
            if (r0 != 0) goto L_0x01f9
            r1.start()
        L_0x01f9:
            X.11C r0 = r2.A05
            X.AnonymousClass4a5.A04(r0)
            goto L_0x00e4
        L_0x0200:
            int r1 = r1 + 1
            goto L_0x00ac
        L_0x0204:
            int r6 = r6 + 1
            goto L_0x00a5
        L_0x0208:
            boolean r5 = r7.performClick()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D55.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
