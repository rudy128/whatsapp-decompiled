package X;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;

/* renamed from: X.1t2  reason: invalid class name and case insensitive filesystem */
public class C39411t2 extends C39401t1 {
    public final Rect A00 = new Rect();
    public final TextView A01;
    public final AnonymousClass11C A02;

    public static void A03(Rect rect, C39411t2 r7, C39371sy r8) {
        Layout layout;
        TextView textView = r7.A01;
        CharSequence text = textView.getText();
        rect.setEmpty();
        if ((text instanceof Spanned) && (layout = textView.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(r8);
            int spanEnd = spanned.getSpanEnd(r8);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            if (lineForOffset2 != lineForOffset) {
                Rect rect2 = new Rect();
                while (true) {
                    lineForOffset++;
                    if (lineForOffset > lineForOffset2) {
                        break;
                    }
                    layout.getLineBounds(lineForOffset, rect2);
                    rect.union(rect2);
                }
            } else {
                rect.left = (int) layout.getPrimaryHorizontal(spanStart);
                rect.right = (int) layout.getPrimaryHorizontal(spanEnd);
            }
            rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
        }
    }

    public C39411t2(TextView textView, AnonymousClass11C r3) {
        super(textView);
        this.A02 = r3;
        this.A01 = textView;
    }
}
