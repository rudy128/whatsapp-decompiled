package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4Wy  reason: invalid class name and case insensitive filesystem */
public final class C87784Wy {
    public int A00;
    public int A01;
    public Handler A02;
    public CharSequence A03;
    public final TextEmojiLabel A04;
    public final C78883tq A05;

    public static final void A00(C87784Wy r10, int i) {
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(r10.A03);
        C72723Ng[] r2 = (C72723Ng[]) A09.getSpans(0, A09.length(), C72723Ng.class);
        C18070vi.A0b(r2);
        for (C72723Ng removeSpan : r2) {
            A09.removeSpan(removeSpan);
        }
        if (i < A09.length()) {
            int length = A09.length();
            TextEmojiLabel textEmojiLabel = r10.A04;
            if (textEmojiLabel != null) {
                A09.setSpan(new ForegroundColorSpan(textEmojiLabel.getCurrentTextColor() & 16777215), i, length, 33);
                textEmojiLabel.setText(A09);
            }
        }
        ImageSpan[] imageSpanArr = (ImageSpan[]) A09.getSpans(0, A09.length(), ImageSpan.class);
        C18070vi.A0b(imageSpanArr);
        for (ImageSpan imageSpan : imageSpanArr) {
            int i2 = 0;
            if (A09.getSpanEnd(imageSpan) <= i) {
                i2 = 255;
            }
            C18070vi.A0b(imageSpan);
            Drawable drawable = imageSpan.getDrawable();
            if (drawable.getAlpha() != i2) {
                int spanStart = A09.getSpanStart(imageSpan);
                int spanEnd = A09.getSpanEnd(imageSpan);
                drawable.setAlpha(i2);
                ImageSpan imageSpan2 = new ImageSpan(drawable);
                A09.removeSpan(imageSpan);
                A09.setSpan(imageSpan2, spanStart, spanEnd, 33);
            }
        }
        TextEmojiLabel textEmojiLabel2 = r10.A04;
        if (textEmojiLabel2 != null) {
            textEmojiLabel2.setText(A09);
            textEmojiLabel2.setText(A09);
        }
    }

    public C87784Wy(C78883tq r4) {
        CharSequence charSequence;
        this.A05 = r4;
        TextEmojiLabel textEmojiLabel = r4.A06;
        this.A04 = textEmojiLabel;
        if (textEmojiLabel != null) {
            charSequence = textEmojiLabel.getText();
        } else {
            charSequence = null;
        }
        this.A03 = charSequence;
        this.A02 = new AnonymousClass3NU(Looper.getMainLooper(), this, 4);
    }
}
