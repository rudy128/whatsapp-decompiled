package X;

import android.view.View;
import com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer;
import java.util.List;

/* renamed from: X.77y  reason: invalid class name and case insensitive filesystem */
public class C1420477y implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C1420477y(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r1 = (X.C1406672l) r4.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewAttachedToWindow(android.view.View r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0050;
                case 1: goto L_0x0029;
                case 2: goto L_0x002a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            r0.removeOnAttachStateChangeListener(r4)
            X.1F9 r3 = X.AnonymousClass1ZG.A00(r5)
            if (r3 == 0) goto L_0x0029
            java.lang.Object r1 = r4.A02
            X.72l r1 = (X.C1406672l) r1
            X.5jJ r0 = r1.A0L
            if (r0 == 0) goto L_0x0029
            X.1DT r2 = r0.A04
            if (r2 == 0) goto L_0x0029
            r0 = 31
            X.7gh r1 = X.C108945cZ.A1K(r1, r0)
            r0 = 19
            X.AnonymousClass7AS.A00(r3, r2, r1, r0)
        L_0x0029:
            return
        L_0x002a:
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            r0.removeOnAttachStateChangeListener(r4)
            java.lang.Object r2 = r4.A02
            com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer r2 = (com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer) r2
            com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer.A05(r2)
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L_0x0046
            X.73r r0 = r2.getFloatingViewManager()
            r0.A0A(r2)
            return
        L_0x0046:
            r1 = 1
            X.77y r0 = new X.77y
            r0.<init>(r2, r2, r1)
            r2.addOnAttachStateChangeListener(r0)
            return
        L_0x0050:
            java.lang.Object r2 = r4.A01
            X.5wX r2 = (X.C116185wX) r2
            X.70A r0 = r2.A05
            if (r0 == 0) goto L_0x0070
            boolean r0 = r0.A0P
            if (r0 == 0) goto L_0x0070
            android.graphics.Rect r1 = r2.A0E
            r0 = 0
            r1.set(r0, r0, r0, r0)
            java.lang.Object r0 = r4.A02
            android.view.View r0 = (android.view.View) r0
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r2.A0I
            r1.addOnGlobalLayoutListener(r0)
            return
        L_0x0070:
            java.lang.Object r2 = r4.A02
            android.view.View r2 = (android.view.View) r2
            r1 = 8
            X.7Pb r0 = new X.7Pb
            r0.<init>(r4, r1)
            r2.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1420477y.onViewAttachedToWindow(android.view.View):void");
    }

    public void onViewDetachedFromWindow(View view) {
        switch (this.A00) {
            case 0:
                C116185wX r2 = (C116185wX) this.A01;
                List list = C42011xT.A0I;
                r2.A0G.setVisibility(8);
                ((View) this.A02).getViewTreeObserver().removeOnGlobalLayoutListener(r2.A0I);
                return;
            case 1:
                ((View) this.A01).removeOnAttachStateChangeListener(this);
                FloatingViewDraggableContainer floatingViewDraggableContainer = (FloatingViewDraggableContainer) this.A02;
                floatingViewDraggableContainer.getFloatingViewManager().A0A(floatingViewDraggableContainer);
                return;
            default:
                return;
        }
    }
}
