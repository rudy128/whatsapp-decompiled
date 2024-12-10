package X;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

public final class BI1 extends InputConnectionWrapper {
    public final TextView A00;

    public BI1(InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        this.A00 = textView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r5 != -1) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        if (r2 != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
        if (java.lang.Character.isLowSurrogate(r1) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0075, code lost:
        if (r2 != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0082, code lost:
        if (java.lang.Character.isHighSurrogate(r1) == false) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.text.Editable r8, android.view.inputmethod.InputConnection r9, int r10, int r11, boolean r12) {
        /*
            r7 = 0
            if (r8 == 0) goto L_0x003b
            if (r10 < 0) goto L_0x003b
            if (r11 < 0) goto L_0x003b
            int r6 = android.text.Selection.getSelectionStart(r8)
            int r5 = android.text.Selection.getSelectionEnd(r8)
            r0 = -1
            if (r6 == r0) goto L_0x003b
            if (r5 == r0) goto L_0x003b
            if (r6 != r5) goto L_0x003b
            if (r12 == 0) goto L_0x0098
            int r3 = java.lang.Math.max(r10, r7)
            int r0 = r8.length()
            if (r6 < 0) goto L_0x0026
            if (r0 < r6) goto L_0x0026
            if (r3 >= 0) goto L_0x006c
        L_0x0026:
            r6 = -1
        L_0x0027:
            int r4 = java.lang.Math.max(r11, r7)
            int r3 = r8.length()
            if (r5 < 0) goto L_0x0035
            if (r3 < r5) goto L_0x0035
            if (r4 >= 0) goto L_0x003c
        L_0x0035:
            r5 = -1
        L_0x0036:
            r0 = -1
            if (r6 == r0) goto L_0x003b
            if (r5 != r0) goto L_0x00a6
        L_0x003b:
            return r7
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r4 != 0) goto L_0x0040
            goto L_0x0036
        L_0x0040:
            if (r5 < r3) goto L_0x0046
            r5 = r3
            if (r2 == 0) goto L_0x0036
            goto L_0x0035
        L_0x0046:
            char r1 = r8.charAt(r5)
            if (r2 == 0) goto L_0x0057
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            if (r0 == 0) goto L_0x0035
            int r4 = r4 + -1
            int r5 = r5 + 1
            goto L_0x003c
        L_0x0057:
            boolean r0 = java.lang.Character.isSurrogate(r1)
            if (r0 != 0) goto L_0x0062
            int r4 = r4 + -1
            int r5 = r5 + 1
            goto L_0x003d
        L_0x0062:
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            if (r0 != 0) goto L_0x0035
            int r5 = r5 + 1
            r2 = 1
            goto L_0x0040
        L_0x006c:
            r2 = 0
        L_0x006d:
            if (r3 != 0) goto L_0x0070
            goto L_0x0027
        L_0x0070:
            int r6 = r6 + -1
            if (r6 >= 0) goto L_0x0078
            r6 = 0
            if (r2 == 0) goto L_0x0027
            goto L_0x0026
        L_0x0078:
            char r1 = r8.charAt(r6)
            if (r2 == 0) goto L_0x0087
            boolean r0 = java.lang.Character.isHighSurrogate(r1)
            if (r0 == 0) goto L_0x0026
            int r3 = r3 + -1
            goto L_0x006c
        L_0x0087:
            boolean r0 = java.lang.Character.isSurrogate(r1)
            if (r0 != 0) goto L_0x0090
            int r3 = r3 + -1
            goto L_0x006d
        L_0x0090:
            boolean r0 = java.lang.Character.isHighSurrogate(r1)
            if (r0 != 0) goto L_0x0026
            r2 = 1
            goto L_0x0070
        L_0x0098:
            int r6 = r6 - r10
            int r6 = java.lang.Math.max(r6, r7)
            int r5 = r5 + r11
            int r0 = r8.length()
            int r5 = java.lang.Math.min(r5, r0)
        L_0x00a6:
            java.lang.Class<X.BGk> r0 = X.C22624BGk.class
            java.lang.Object[] r4 = r8.getSpans(r6, r5, r0)
            X.BGk[] r4 = (X.C22624BGk[]) r4
            if (r4 == 0) goto L_0x003b
            int r3 = r4.length
            if (r3 <= 0) goto L_0x003b
            r2 = 0
        L_0x00b4:
            r0 = r4[r2]
            int r1 = r8.getSpanStart(r0)
            int r0 = r8.getSpanEnd(r0)
            int r6 = java.lang.Math.min(r1, r6)
            int r5 = java.lang.Math.max(r0, r5)
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x00b4
            int r1 = java.lang.Math.max(r6, r7)
            int r0 = r8.length()
            int r0 = java.lang.Math.min(r5, r0)
            r9.beginBatchEdit()
            r8.delete(r1, r0)
            r9.endBatchEdit()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BI1.A00(android.text.Editable, android.view.inputmethod.InputConnection, int, int, boolean):boolean");
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (A00(this.A00.getEditableText(), this, i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (A00(this.A00.getEditableText(), this, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
