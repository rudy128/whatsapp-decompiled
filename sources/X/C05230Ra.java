package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0Ra  reason: invalid class name and case insensitive filesystem */
public class C05230Ra implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;

    public static final boolean A00(View view) {
        Boolean bool;
        for (ViewParent viewParent : AnonymousClass1JO.A03(view.getParent(), C100965Ak.A00)) {
            if (viewParent instanceof View) {
                View view2 = (View) viewParent;
                C18070vi.A0d(view2, 0);
                Object tag = view2.getTag(2131431827);
                if ((tag instanceof Boolean) && (bool = (Boolean) tag) != null && bool.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public C05230Ra(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        r2.removeGlobalOnLayoutListener(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewDetachedFromWindow(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0037;
                case 1: goto L_0x001e;
                case 2: goto L_0x0010;
                default: goto L_0x0005;
            }
        L_0x0005:
            r4.removeOnAttachStateChangeListener(r3)
            java.lang.Object r0 = r3.A01
            X.1OB r0 = (X.AnonymousClass1OB) r0
            r0.BEM((java.util.concurrent.CancellationException) null)
        L_0x000f:
            return
        L_0x0010:
            java.lang.Object r1 = r3.A01
            X.05G r1 = (X.AnonymousClass05G) r1
            boolean r0 = A00(r1)
            if (r0 != 0) goto L_0x000f
            r1.A03()
            return
        L_0x001e:
            java.lang.Object r1 = r3.A01
            X.06B r1 = (X.AnonymousClass06B) r1
            android.view.ViewTreeObserver r0 = r1.A04
            if (r0 == 0) goto L_0x0052
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L_0x0032
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r1.A04 = r0
        L_0x0032:
            android.view.ViewTreeObserver r2 = r1.A04
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r1.A0D
            goto L_0x004f
        L_0x0037:
            java.lang.Object r1 = r3.A01
            X.06A r1 = (X.AnonymousClass06A) r1
            android.view.ViewTreeObserver r0 = r1.A04
            if (r0 == 0) goto L_0x0052
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L_0x004b
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r1.A04 = r0
        L_0x004b:
            android.view.ViewTreeObserver r2 = r1.A04
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r1.A0J
        L_0x004f:
            r2.removeGlobalOnLayoutListener(r0)
        L_0x0052:
            r4.removeOnAttachStateChangeListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05230Ra.onViewDetachedFromWindow(android.view.View):void");
    }

    public void onViewAttachedToWindow(View view) {
    }
}
