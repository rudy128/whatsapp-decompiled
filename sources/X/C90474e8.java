package X;

import android.view.ViewTreeObserver;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;

/* renamed from: X.4e8  reason: invalid class name and case insensitive filesystem */
public class C90474e8 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TextEmojiLabel A00;
    public final /* synthetic */ TemplateRowContentLayout A01;
    public final /* synthetic */ C82924Cr A02;
    public final /* synthetic */ String A03;

    public C90474e8(TextEmojiLabel textEmojiLabel, TemplateRowContentLayout templateRowContentLayout, C82924Cr r3, String str) {
        this.A01 = templateRowContentLayout;
        this.A03 = str;
        this.A00 = textEmojiLabel;
        this.A02 = r3;
    }

    public void onGlobalLayout() {
        TemplateRowContentLayout templateRowContentLayout = this.A01;
        AnonymousClass3MY.A1D(templateRowContentLayout, this);
        AnonymousClass3uP r1 = templateRowContentLayout.A02;
        String str = this.A03;
        TextEmojiLabel textEmojiLabel = this.A00;
        r1.A2F(textEmojiLabel, this.A02, r1.getFMessage(), str, (templateRowContentLayout.getWidth() - textEmojiLabel.getPaddingRight()) - textEmojiLabel.getPaddingLeft(), true, true, true);
    }
}
