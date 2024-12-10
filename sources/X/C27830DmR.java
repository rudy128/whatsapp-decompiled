package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.whatsapp.conversation.conversationrow.audio.TranscriptionStatusView;

/* renamed from: X.DmR  reason: case insensitive filesystem */
public final class C27830DmR extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ TranscriptionStatusView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27830DmR(Context context, TranscriptionStatusView transcriptionStatusView) {
        super(0);
        this.this$0 = transcriptionStatusView;
        this.$context = context;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int indexOfChild = this.this$0.getContainer().indexOfChild(this.this$0.getTextView());
        int dimensionPixelSize = this.this$0.getResources().getDimensionPixelSize(2131169076);
        CircularProgressIndicator circularProgressIndicator = new CircularProgressIndicator(this.$context, (AttributeSet) null);
        Context context = this.$context;
        circularProgressIndicator.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        circularProgressIndicator.setPaddingRelative(0, 0, circularProgressIndicator.getResources().getDimensionPixelSize(2131169077), 0);
        circularProgressIndicator.setIndicatorSize(circularProgressIndicator.getResources().getDimensionPixelSize(2131169079));
        circularProgressIndicator.setIndeterminate(true);
        circularProgressIndicator.setTrackThickness$BaseProgressIndicator(circularProgressIndicator.getResources().getDimensionPixelSize(2131169080));
        circularProgressIndicator.setIndicatorColor(C19740yt.A00(context, 2131102733));
        this.this$0.getContainer().addView(circularProgressIndicator, indexOfChild);
        return circularProgressIndicator;
    }
}
