package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.3ZS  reason: invalid class name */
public class AnonymousClass3ZS extends C42011xT {
    public final View A00;
    public final FrameLayout A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final C42141xh A04;
    public final ThumbnailButton A05;
    public final C28931bI A06;
    public final /* synthetic */ AnonymousClass3XO A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3ZS(FrameLayout frameLayout, AnonymousClass3XO r7) {
        super(frameLayout);
        this.A07 = r7;
        this.A01 = frameLayout;
        this.A03 = AnonymousClass3MX.A0W(frameLayout, 2131436081);
        ThumbnailButton thumbnailButton = (ThumbnailButton) frameLayout.findViewById(2131429433);
        this.A05 = thumbnailButton;
        thumbnailButton.setEnabled(false);
        this.A06 = C72453Mb.A0s(frameLayout, 2131435869);
        C42141xh A012 = C42141xh.A01(frameLayout, r7.A0D, 2131434061);
        this.A04 = A012;
        A012.A01.setTextColor(r7.A00);
        TextEmojiLabel A0W = AnonymousClass3MX.A0W(frameLayout, 2131435002);
        this.A02 = A0W;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(419430400));
        frameLayout.setForeground(stateListDrawable);
        this.A00 = frameLayout.findViewById(2131435209);
        A0W.setTextColor(r7.A02);
    }
}
