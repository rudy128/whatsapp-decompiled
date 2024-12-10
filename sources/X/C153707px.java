package X;

import android.content.res.Resources;
import com.whatsapp.status.playback.StatusPlaybackActivity;

/* renamed from: X.7px  reason: invalid class name and case insensitive filesystem */
public final class C153707px extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ StatusPlaybackActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153707px(StatusPlaybackActivity statusPlaybackActivity) {
        super(0);
        this.this$0 = statusPlaybackActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int A01;
        StatusPlaybackActivity statusPlaybackActivity = this.this$0;
        C18070vi.A0d(statusPlaybackActivity, 0);
        Resources resources = statusPlaybackActivity.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        int identifier2 = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            A01 = resources.getDimensionPixelOffset(identifier);
        } else {
            A01 = C87344Vf.A01(statusPlaybackActivity, AnonymousClass11C.A01(statusPlaybackActivity));
        }
        boolean z = true;
        if (identifier2 > 0) {
            int dimensionPixelOffset = resources.getDimensionPixelOffset(identifier2);
            int dimensionPixelOffset2 = statusPlaybackActivity.getResources().getDimensionPixelOffset(2131168827);
            if (AnonymousClass1ZO.A01(statusPlaybackActivity) / (((AnonymousClass1ZO.A00(statusPlaybackActivity) - ((float) dimensionPixelOffset2)) - ((float) A01)) - ((float) dimensionPixelOffset)) <= 0.5625f) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
