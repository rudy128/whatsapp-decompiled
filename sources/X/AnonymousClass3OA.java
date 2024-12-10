package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.3OA  reason: invalid class name */
public class AnonymousClass3OA extends View implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;
    public final /* synthetic */ AnonymousClass3uP A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3OA(Context context, AnonymousClass3uP r3) {
        super(context);
        this.A04 = r3;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass3MW.A07();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public boolean isSelected() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r2.isPressed() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRowSelected(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.A02
            if (r0 == r4) goto L_0x001b
            r3.A02 = r4
            r3.setSelected(r4)
            X.3uP r2 = r3.A04
            if (r4 != 0) goto L_0x0014
            boolean r1 = r2.isPressed()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.dispatchSetPressed(r0)
            r3.invalidate()
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OA.setRowSelected(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = r6.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            super.onDraw(r7)
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0099
            X.3uP r3 = r6.A04
            X.5cR r0 = r3.A0k
            if (r0 == 0) goto L_0x0099
            boolean r0 = r0.Bjq()
            if (r0 == 0) goto L_0x0099
        L_0x0013:
            android.graphics.Rect r4 = r6.A03
            r6.getDrawingRect(r4)
            boolean r0 = r3.A0V
            if (r0 == 0) goto L_0x0038
            int r1 = r4.top
            int r0 = r3.getPaddingTop()
            int r1 = r1 + r0
            r4.top = r1
            int r2 = r4.bottom
            int r0 = r3.getPaddingBottom()
            int r2 = r2 - r0
        L_0x002c:
            r4.bottom = r2
        L_0x002e:
            X.5c7 r0 = r3.A0l
            android.graphics.Paint r0 = r0.BRs()
            r7.drawRect(r4, r0)
            return
        L_0x0038:
            X.5c7 r5 = r3.A0l
            boolean r0 = r5.Beq()
            if (r0 == 0) goto L_0x008d
            boolean r0 = r3.A2c
            if (r0 == 0) goto L_0x004f
            int r1 = r4.top
            android.view.View r0 = r3.A0j
            int r0 = r0.getTop()
            int r1 = r1 + r0
            r4.top = r1
        L_0x004f:
            boolean r0 = r3.A1U()
            if (r0 == 0) goto L_0x0080
            android.graphics.Rect r2 = r3.A0i
            int r1 = r2.top
            android.content.Context r0 = r6.getContext()
            int r0 = r5.BYv(r0)
            int r1 = r1 - r0
            r4.top = r1
            int r2 = r2.bottom
            android.content.Context r0 = r6.getContext()
            int r0 = r5.BYu(r0)
            int r2 = r2 + r0
            r4.bottom = r2
            android.widget.LinearLayout r0 = r3.A06
            if (r0 == 0) goto L_0x002e
            int r1 = r0.getHeight()
            int r0 = r3.getReactionsViewVerticalOverlap()
            int r1 = r1 - r0
            int r2 = r2 + r1
            goto L_0x002c
        L_0x0080:
            int r1 = r4.top
            android.content.Context r0 = r6.getContext()
            int r0 = r5.BYv(r0)
            int r1 = r1 - r0
            r4.top = r1
        L_0x008d:
            int r2 = r4.bottom
            android.content.Context r0 = r6.getContext()
            int r0 = r5.BYu(r0)
            int r2 = r2 + r0
            goto L_0x002c
        L_0x0099:
            X.3uP r3 = r6.A04
            boolean r0 = r3.A2h
            if (r0 != 0) goto L_0x0013
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OA.onDraw(android.graphics.Canvas):void");
    }
}
