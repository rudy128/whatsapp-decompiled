package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;

/* renamed from: X.3gn  reason: invalid class name */
public final class AnonymousClass3gn extends WaFrameLayout {
    public final TextEmojiLabel A00 = C72453Mb.A0c(this, 2131435885);
    public final TextEmojiLabel A01 = C72453Mb.A0c(this, 2131431388);

    public AnonymousClass3gn(Context context) {
        super(context, (AttributeSet) null, 0);
        AnonymousClass3MZ.A0D(this).inflate(2131624846, this, true);
    }

    public final TextEmojiLabel getSubTitle() {
        return this.A00;
    }

    public final TextEmojiLabel getTitle() {
        return this.A01;
    }
}
