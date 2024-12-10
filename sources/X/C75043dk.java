package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.ui.media.MediaCaptionTextView;

/* renamed from: X.3dk  reason: invalid class name and case insensitive filesystem */
public abstract class C75043dk extends TextEmojiLabel {
    public boolean A00;

    public void A0I() {
        if (this instanceof MediaCaptionTextView) {
            MediaCaptionTextView mediaCaptionTextView = (MediaCaptionTextView) this;
            if (!mediaCaptionTextView.A01) {
                mediaCaptionTextView.A01 = true;
                AnonymousClass10E A0X = C72463Mc.A0X(mediaCaptionTextView);
                C72483Me.A0s(A0X, mediaCaptionTextView);
                C72483Me.A0r(A0X, mediaCaptionTextView);
                mediaCaptionTextView.A00 = AnonymousClass3MY.A0d(A0X);
            }
        } else if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0X2 = C72463Mc.A0X(this);
            C72483Me.A0s(A0X2, this);
            C72483Me.A0r(A0X2, this);
        }
    }

    public C75043dk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0I();
    }
}
