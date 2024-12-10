package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.WaImageView;

/* renamed from: X.8f0  reason: invalid class name */
public final class AnonymousClass8f0 extends WaFrameLayout {
    public final TextEmojiLabel A00 = C72453Mb.A0c(this, 2131435885);
    public final TextEmojiLabel A01 = C72453Mb.A0c(this, 2131431388);
    public final WaImageView A02 = C108965cb.A0I(this, 2131436135);

    public AnonymousClass8f0(Context context) {
        super(context, (AttributeSet) null);
        LayoutInflater.from(context).inflate(2131624844, this, true);
    }

    public final TextEmojiLabel getSubTitle() {
        return this.A00;
    }

    public final WaImageView getThumbnail() {
        return this.A02;
    }

    public final TextEmojiLabel getTitle() {
        return this.A01;
    }
}
