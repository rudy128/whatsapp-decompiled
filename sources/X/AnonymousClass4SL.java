package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.4SL  reason: invalid class name */
public class AnonymousClass4SL {
    public AnonymousClass1E7 A00;
    public final View A01;
    public final ImageView A02;
    public final TextEmojiLabel A03;
    public final C42141xh A04;
    public final SelectionCheckView A05;
    public final int A06;
    public final C108375bb A07;

    public void A00(String str, boolean z, int i) {
        this.A01.setEnabled(z);
        TextEmojiLabel textEmojiLabel = this.A03;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setText(str);
        textEmojiLabel.setTextColor(textEmojiLabel.getResources().getColor(2131101096));
        textEmojiLabel.A0K();
        if (i > 1) {
            textEmojiLabel.setSingleLine(false);
        } else {
            textEmojiLabel.setSingleLine(true);
        }
        textEmojiLabel.setMaxLines(i);
        C42141xh r2 = this.A04;
        r2.A01.setTextColor(textEmojiLabel.getResources().getColor(2131101096));
        this.A02.setAlpha(0.5f);
        this.A05.A04(false, false);
        this.A07.C4C(this);
    }

    public void A01(boolean z) {
        this.A01.setEnabled(true);
        this.A02.setAlpha(1.0f);
        TextEmojiLabel textEmojiLabel = this.A03;
        textEmojiLabel.A0L();
        textEmojiLabel.setSingleLine(true);
        textEmojiLabel.setMaxLines(1);
        textEmojiLabel.setTextColor(AnonymousClass3Ma.A01(textEmojiLabel.getContext(), textEmojiLabel.getResources(), 2130970340, 2131101312));
        C42141xh r4 = this.A04;
        r4.A01.setTextColor(AnonymousClass3Ma.A01(textEmojiLabel.getContext(), textEmojiLabel.getResources(), 2130970343, 2131101314));
        this.A05.A04(z, false);
        this.A07.C4D(this, this.A06, z);
    }

    public AnonymousClass4SL(View view, C72043Kk r4, C108375bb r5, int i) {
        this.A01 = AnonymousClass1HF.A06(view, 2131434754);
        this.A06 = i;
        this.A07 = r5;
        this.A02 = AnonymousClass3MW.A0G(view, 2131429433);
        C42141xh A012 = C42141xh.A01(view, r4, 2131429021);
        this.A04 = A012;
        TextEmojiLabel textEmojiLabel = A012.A01;
        textEmojiLabel.setImportantForAccessibility(2);
        C43421zm.A04(textEmojiLabel);
        this.A03 = AnonymousClass3MX.A0V(view, 2131429022);
        this.A05 = (SelectionCheckView) AnonymousClass1HF.A06(view, 2131435130);
    }
}
