package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;

/* renamed from: X.6Fp  reason: invalid class name and case insensitive filesystem */
public class C120846Fp extends AnonymousClass6FV {
    public boolean A00;
    public AnimatorSet A01;
    public final MessageGifVideoPlayer A02;
    public final WaTextView A03 = AnonymousClass3MW.A0T(this, 2131432435);
    public final MessageThumbView A04;
    public final C1596685k A05;

    public C120846Fp(Context context) {
        super(context, (AttributeSet) null);
        this.A02 = true;
        this.A01 = true;
        AnonymousClass6FV.A00(context, this);
        A02();
        C145617Ly r3 = new C145617Ly(this);
        this.A05 = r3;
        MessageThumbView messageThumbView = (MessageThumbView) AnonymousClass1HF.A06(this, 2131436134);
        this.A04 = messageThumbView;
        MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) AnonymousClass1HF.A06(this, 2131436762);
        this.A02 = messageGifVideoPlayer;
        AnonymousClass3MY.A0w(context, messageThumbView, 2131890772);
        messageGifVideoPlayer.A04 = r3;
    }

    public float getRatio() {
        return 1.5f;
    }

    public static void A01(C120846Fp r9, boolean z) {
        AnimatorSet animatorSet = r9.A01;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        float A012 = C108975cc.A01(z ? 1 : 0);
        r9.A01 = C108945cZ.A0B();
        View view = r9.A02;
        r9.A01.playTogether(C108945cZ.A1Z(ObjectAnimator.ofFloat(view, "alpha", new float[]{view.getAlpha(), A012}), ObjectAnimator.ofFloat(r9.A03, "alpha", new float[]{r9.A02.getAlpha(), A012}), 2, 0));
        C108955ca.A1A(r9.A01);
        r9.A01.setDuration(100);
        r9.A01.start();
    }

    public void setScrolling(boolean z) {
        this.A02.setScrolling(z);
    }

    public void setShouldPlay(boolean z) {
        this.A02.setShouldPlay(z);
    }

    public int getMark() {
        return 2131232594;
    }

    public void setMessage(C440021t r4) {
        super.setMessage(r4);
        this.A00 = 0;
        setId(2131434936);
        MessageThumbView messageThumbView = this.A04;
        messageThumbView.setVisibility(0);
        messageThumbView.A06(r4, true);
        this.A02.setMessage(r4);
        WaTextView waTextView = this.A03;
        AnonymousClass3MW.A1S(waTextView);
        waTextView.setVisibility(8);
    }
}
