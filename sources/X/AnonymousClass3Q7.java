package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.3Q7  reason: invalid class name */
public final class AnonymousClass3Q7 extends LinearLayout {
    public final TextEmojiLabel A00;
    public final WaImageView A01;

    public final void setIcon(int i) {
        WaImageView waImageView = this.A01;
        Drawable A0B = AnonymousClass3MZ.A0B(this, i);
        C17960vV.A07(A0B);
        waImageView.setImageDrawable(A0B);
    }

    public final void setText(int i) {
        C72453Mb.A1L(this.A00, getResources().getString(i));
    }

    public AnonymousClass3Q7(Context context) {
        super(context);
        TextEmojiLabel textEmojiLabel = new TextEmojiLabel(context);
        C72463Mc.A0y(context, textEmojiLabel, 2130971978, 2131103153);
        textEmojiLabel.setTextSize(0, AnonymousClass3MW.A00(textEmojiLabel.getResources(), 2131169440));
        this.A00 = textEmojiLabel;
        WaImageView waImageView = new WaImageView(context);
        waImageView.setPadding(0, 0, waImageView.getResources().getDimensionPixelSize(2131168780), 0);
        this.A01 = waImageView;
        setId(2131435952);
        setPadding(0, C72463Mc.A05(this), 0, 0);
        addView(waImageView);
        addView(textEmojiLabel);
    }
}
