package X;

import android.view.ViewTreeObserver;
import com.whatsapp.FAQTextView;

/* renamed from: X.78y  reason: invalid class name and case insensitive filesystem */
public final class C1423078y implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FAQTextView A00;

    public void onGlobalLayout() {
        FAQTextView fAQTextView = this.A00;
        CharSequence text = fAQTextView.getText();
        fAQTextView.setMaxLines(3);
        if (fAQTextView.getLineCount() > 3) {
            fAQTextView.setText(AnonymousClass6WL.A00(text.toString(), fAQTextView.getLayout().getLineEnd(2)));
        }
        AnonymousClass3MY.A1D(fAQTextView, this);
    }

    public C1423078y(FAQTextView fAQTextView) {
        this.A00 = fAQTextView;
    }
}
