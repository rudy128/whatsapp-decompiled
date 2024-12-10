package X;

import android.os.Handler;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: X.5dq  reason: invalid class name and case insensitive filesystem */
public final class C109685dq extends LinkMovementMethod {
    public boolean A00;
    public final Handler A01 = C17890vO.A0D();

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        TextView textView2 = textView;
        C18070vi.A0d(textView, 0);
        MotionEvent motionEvent2 = motionEvent;
        C18070vi.A0e(spannable, 1, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3) {
            this.A01.removeCallbacksAndMessages((Object) null);
        } else if (action == 0 || action == 1) {
            float x = (motionEvent.getX() - ((float) textView.getTotalPaddingLeft())) + ((float) textView.getScrollX());
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((motionEvent.getY() - ((float) textView.getTotalPaddingTop())) + ((float) textView.getScrollY()))), x);
            C1604588o[] r9 = (C1604588o[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C1604588o.class);
            if (!(r9 == null || r9.length == 0)) {
                if (action == 1) {
                    this.A01.removeCallbacksAndMessages((Object) null);
                    if (!this.A00) {
                        r9[0].Bos();
                    }
                    this.A00 = false;
                    return true;
                }
                this.A01.postDelayed(new C21368Aix(this, textView2, r9, motionEvent2, 14), 500);
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
