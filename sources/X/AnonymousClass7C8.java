package X;

import android.content.Intent;
import com.whatsapp.inappsupportbloks.components.BloksSupportVideoView;

/* renamed from: X.7C8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7C8 implements C107045Ye {
    public final /* synthetic */ BloksSupportVideoView A00;

    public final boolean Bky(Intent intent, int i, int i2) {
        BloksSupportVideoView bloksSupportVideoView = this.A00;
        int i3 = 0;
        if (i != 0 || i2 != -1) {
            return false;
        }
        if (intent != null) {
            i3 = intent.getIntExtra("video_start_position", 0);
        }
        bloksSupportVideoView.A00 = i3;
        return true;
    }

    public /* synthetic */ AnonymousClass7C8(BloksSupportVideoView bloksSupportVideoView) {
        this.A00 = bloksSupportVideoView;
    }
}
