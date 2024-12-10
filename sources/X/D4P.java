package X;

import android.text.Editable;
import android.text.Selection;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

public final class D4P implements KeyListener {
    public final KeyListener A00;

    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.A00.clearMetaKeyState(view, editable, i);
    }

    public int getInputType() {
        return this.A00.getInputType();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(android.view.View r4, android.text.Editable r5, int r6, android.view.KeyEvent r7) {
        /*
            r3 = this;
            r2 = 67
            r1 = 1
            r0 = 0
            if (r6 == r2) goto L_0x001f
            r0 = 112(0x70, float:1.57E-43)
            if (r6 != r0) goto L_0x0015
            boolean r0 = A00(r5, r7, r1)
        L_0x000e:
            if (r0 == 0) goto L_0x0015
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r5)
        L_0x0013:
            r0 = 1
        L_0x0014:
            return r0
        L_0x0015:
            android.text.method.KeyListener r0 = r3.A00
            boolean r1 = r0.onKeyDown(r4, r5, r6, r7)
            r0 = 0
            if (r1 == 0) goto L_0x0014
            goto L_0x0013
        L_0x001f:
            boolean r0 = A00(r5, r7, r0)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D4P.onKeyDown(android.view.View, android.text.Editable, int, android.view.KeyEvent):boolean");
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.A00.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.A00.onKeyUp(view, editable, i, keyEvent);
    }

    public D4P(KeyListener keyListener) {
        this.A00 = keyListener;
    }

    public static boolean A00(Editable editable, KeyEvent keyEvent, boolean z) {
        C22624BGk[] bGkArr;
        int length;
        if (!(!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()))) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd || (bGkArr = (C22624BGk[]) editable.getSpans(selectionStart, selectionEnd, C22624BGk.class)) == null || (length = bGkArr.length) <= 0)) {
                int i = 0;
                do {
                    C22624BGk bGk = bGkArr[i];
                    int spanStart = editable.getSpanStart(bGk);
                    int spanEnd = editable.getSpanEnd(bGk);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    } else if (spanEnd == selectionStart) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                    if (selectionStart <= spanStart || selectionStart >= spanEnd) {
                        i++;
                    } else {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                } while (i < length);
            }
        }
        return false;
    }
}
