package X;

import android.text.Layout;

/* renamed from: X.C6v  reason: case insensitive filesystem */
public abstract class C24501C6v {
    public static final int A00(Layout layout, int i) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if ((lineStart == i || lineEnd == i) && lineStart == i) {
            return lineForOffset - 1;
        }
        return lineForOffset;
    }
}
