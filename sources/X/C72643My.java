package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;

/* renamed from: X.3My  reason: invalid class name and case insensitive filesystem */
public class C72643My extends BitmapDrawable {
    public final /* synthetic */ ConversationRowImage$RowImageView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72643My(Resources resources, Bitmap bitmap, ConversationRowImage$RowImageView conversationRowImage$RowImageView) {
        super(resources, bitmap);
        this.A00 = conversationRowImage$RowImageView;
    }

    public int getIntrinsicHeight() {
        return this.A00.A06.A06;
    }

    public int getIntrinsicWidth() {
        return this.A00.A06.A08;
    }
}
