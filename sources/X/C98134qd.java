package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer;

/* renamed from: X.4qd  reason: invalid class name and case insensitive filesystem */
public final class C98134qd implements AnonymousClass3M2 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PushToVideoInlineVideoPlayer A01;

    public C98134qd(Context context, PushToVideoInlineVideoPlayer pushToVideoInlineVideoPlayer) {
        this.A01 = pushToVideoInlineVideoPlayer;
        this.A00 = context;
    }

    public int BZK() {
        return C88264Yz.A01(this.A00, 65);
    }

    public void BuW() {
        Runnable runnable = this.A01.getUiState().A06;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r7) {
        if (bitmap == null) {
            this.A01.A08.setImageDrawable(new ColorDrawable(AnonymousClass3Ma.A00(this.A00, 2130969324, 2131100309)));
            return;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        this.A01.A08.setImageBitmap(bitmap);
    }

    public void CN4(View view) {
        this.A01.A08.setImageDrawable(new ColorDrawable(-7829368));
    }
}
