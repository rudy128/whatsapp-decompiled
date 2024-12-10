package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.6u5  reason: invalid class name and case insensitive filesystem */
public final class C136606u5 {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final ImageView A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextEmojiLabel A07;
    public final TextEmojiLabel A08;
    public final TextEmojiLabel A09;
    public final TextEmojiLabel A0A;
    public final StickerView A0B;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136606u5) {
                C136606u5 r5 = (C136606u5) obj;
                if (!C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A0B, r5.A0B) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A04, AnonymousClass000.A0N(this.A08, AnonymousClass000.A0N(this.A05, AnonymousClass000.A0N(this.A0B, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A06, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A07, AnonymousClass000.A0N(this.A09, AnonymousClass000.A0L(this.A0A))))))))))));
    }

    public C136606u5(View view, View view2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextEmojiLabel textEmojiLabel, TextEmojiLabel textEmojiLabel2, TextEmojiLabel textEmojiLabel3, TextEmojiLabel textEmojiLabel4, StickerView stickerView) {
        C18070vi.A0s(textEmojiLabel, textEmojiLabel2, textEmojiLabel3, imageView);
        C72483Me.A16(textView, imageView2, stickerView, textView2, 7);
        C72473Md.A1L(textEmojiLabel4, imageView3);
        this.A0A = textEmojiLabel;
        this.A09 = textEmojiLabel2;
        this.A07 = textEmojiLabel3;
        this.A02 = imageView;
        this.A00 = view;
        this.A01 = view2;
        this.A06 = textView;
        this.A03 = imageView2;
        this.A0B = stickerView;
        this.A05 = textView2;
        this.A08 = textEmojiLabel4;
        this.A04 = imageView3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ReplyRenderViews(titleView=");
        A10.append(this.A0A);
        A10.append(", textView=");
        A10.append(this.A09);
        A10.append(", subTextView=");
        A10.append(this.A07);
        A10.append(", imageView=");
        A10.append(this.A02);
        A10.append(", colorView=");
        A10.append(this.A00);
        A10.append(", paymentAmountContainer=");
        A10.append(this.A01);
        A10.append(", paymentAmountText=");
        A10.append(this.A06);
        A10.append(", paymentAmountExpressiveBackground=");
        A10.append(this.A03);
        A10.append(", stickerView=");
        A10.append(this.A0B);
        A10.append(", bulletDividerView=");
        A10.append(this.A05);
        A10.append(", subtitleView=");
        A10.append(this.A08);
        A10.append(", photoView=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
