package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* renamed from: X.1XZ  reason: invalid class name */
public class AnonymousClass1XZ implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap A00 = new WeakHashMap();

    public void onViewDetachedFromWindow(View view) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r3.getWindowVisibility() != 0) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r6 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L_0x004d
            java.util.WeakHashMap r0 = r6.A00
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x0010:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r4 = r5.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r3 = r4.getKey()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r0 = r4.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            boolean r0 = r3.isShown()
            if (r0 == 0) goto L_0x0039
            int r0 = r3.getWindowVisibility()
            r1 = 1
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            if (r2 == r1) goto L_0x0010
            r0 = 32
            if (r1 == 0) goto L_0x0042
            r0 = 16
        L_0x0042:
            X.AnonymousClass1HF.A0Y(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r4.setValue(r0)
            goto L_0x0010
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XZ.onGlobalLayout():void");
    }

    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
