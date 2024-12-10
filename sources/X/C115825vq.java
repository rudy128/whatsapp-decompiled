package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.5vq  reason: invalid class name and case insensitive filesystem */
public final class C115825vq extends C115885vz {
    public final FrameLayout A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115825vq(View view) {
        super(view);
        C18070vi.A0d(view, 1);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(2131431531);
        this.A00 = frameLayout;
        int A02 = AnonymousClass3MZ.A02(view.getContext(), view.getContext(), 2130968822, 2131099906);
        TextEmojiLabel textEmojiLabel = this.A03;
        if (textEmojiLabel != null) {
            textEmojiLabel.setTextColor(A02);
        }
        TextView textView = this.A01;
        if (textView != null) {
            textView.setTextColor(A02);
        }
        TextEmojiLabel textEmojiLabel2 = this.A02;
        if (textEmojiLabel2 != null) {
            textEmojiLabel2.setTextColor(A02);
        }
        TextView textView2 = this.A00;
        if (textView2 != null) {
            textView2.setTextColor(A02);
        }
        WaImageView waImageView = this.A04;
        if (waImageView != null) {
            waImageView.setImageResource(2131231114);
        }
        if (frameLayout != null) {
            frameLayout.setForeground((Drawable) null);
        }
    }

    public void A0C(C143327Cy r3) {
        C18070vi.A0d(r3, 0);
        TextEmojiLabel textEmojiLabel = this.A03;
        if (textEmojiLabel != null) {
            textEmojiLabel.setText(r3.A01);
        }
        TextView textView = this.A01;
        if (textView != null) {
            textView.setText(r3.A00);
        }
        TextEmojiLabel textEmojiLabel2 = this.A02;
        if (textEmojiLabel2 != null) {
            textEmojiLabel2.setText(r3.A01);
        }
        TextView textView2 = this.A00;
        if (textView2 != null) {
            textView2.setText(r3.A01);
        }
        A0B(true);
    }
}
