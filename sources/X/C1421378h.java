package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.whatsapp.emoji.EmojiContainerView;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.78h  reason: invalid class name and case insensitive filesystem */
public class C1421378h implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C1421378h(Resources resources, ImageView imageView, AnonymousClass737 r3, EmojiContainerView emojiContainerView, MessageReplyActivity messageReplyActivity, int i) {
        this.A00 = i;
        this.A01 = messageReplyActivity;
        this.A02 = r3;
        this.A03 = emojiContainerView;
        this.A04 = imageView;
        this.A05 = resources;
    }

    public final boolean onLongClick(View view) {
        PopupWindow r6;
        int i = this.A00;
        MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A01;
        AnonymousClass737 r0 = (AnonymousClass737) this.A02;
        View view2 = (View) this.A03;
        ImageView imageView = (ImageView) this.A04;
        Resources resources = (Resources) this.A05;
        GridLayout gridLayout = messageReplyActivity.A0A;
        if (i != 0) {
            AnonymousClass7GA r3 = new AnonymousClass7GA(resources, view2, gridLayout, imageView, messageReplyActivity, false);
            AnonymousClass1KW r9 = messageReplyActivity.A0D;
            int[] iArr = r0.A00;
            C18030ve r2 = messageReplyActivity.A0E;
            r6 = new AnonymousClass3RO(imageView, r3, r9, iArr, C18020vd.A05(C18040vf.A02, r2, 3792));
        } else {
            AnonymousClass7GA r32 = new AnonymousClass7GA(resources, view2, gridLayout, imageView, messageReplyActivity, true);
            AnonymousClass1KW r92 = messageReplyActivity.A0D;
            int[] iArr2 = r0.A00;
            C18030ve r22 = messageReplyActivity.A0E;
            r6 = new C110655gg(imageView, r32, r92, iArr2, C18020vd.A05(C18040vf.A02, r22, 3792));
        }
        AnonymousClass72X.A01(imageView, view2.getRootView(), r6);
        return true;
    }
}
