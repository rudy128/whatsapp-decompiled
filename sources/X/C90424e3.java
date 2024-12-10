package X;

import android.view.ViewTreeObserver;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4e3  reason: invalid class name and case insensitive filesystem */
public final class C90424e3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00;
    public final /* synthetic */ C108885cS A01;
    public final /* synthetic */ AnonymousClass4MN A02;

    public C90424e3(C108885cS r2, AnonymousClass4MN r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r3.A00.getHeight();
    }

    public void onGlobalLayout() {
        int i;
        C108885cS r6 = this.A01;
        C78883tq r7 = this.A02.A00;
        int height = r7.getHeight();
        TextEmojiLabel textEmojiLabel = r7.A06;
        if (textEmojiLabel != null && height > (i = this.A00)) {
            int i2 = height - i;
            boolean z = false;
            if (r7.getTop() + this.A00 <= r6.getListView().getHeight()) {
                z = true;
            }
            if (textEmojiLabel.getLineCount() > 4) {
                i2 = ((textEmojiLabel.getHeight() / textEmojiLabel.getLineCount()) * 4) - this.A00;
            }
            int top = r7.getTop() - r6.getListView().getTop();
            if (top < i2) {
                i2 = top;
            }
            if (z && i2 > 0) {
                r6.scrollBy(i2, 0);
            }
            this.A00 = height;
        }
    }
}
