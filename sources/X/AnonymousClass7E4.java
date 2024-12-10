package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.status.playback.widget.VoiceStatusContentView;
import java.lang.ref.WeakReference;

/* renamed from: X.7E4  reason: invalid class name */
public final class AnonymousClass7E4 implements C42971z2 {
    public final WeakReference A00;
    public final C42971z2 A01;

    public /* synthetic */ void CBg() {
    }

    public /* synthetic */ void CIg(AnonymousClass1BI r1) {
    }

    public void CMZ(Bitmap bitmap, ImageView imageView, boolean z) {
        C18070vi.A0d(imageView, 0);
        this.A01.CMZ(bitmap, imageView, z);
        VoiceStatusContentView voiceStatusContentView = (VoiceStatusContentView) this.A00.get();
        if (voiceStatusContentView != null) {
            VoiceStatusContentView.A02(voiceStatusContentView);
        }
    }

    public void CN5(ImageView imageView) {
        C18070vi.A0d(imageView, 0);
        this.A01.CN5(imageView);
        VoiceStatusContentView voiceStatusContentView = (VoiceStatusContentView) this.A00.get();
        if (voiceStatusContentView != null) {
            VoiceStatusContentView.A02(voiceStatusContentView);
        }
    }

    public AnonymousClass7E4(C42981z3 r2, VoiceStatusContentView voiceStatusContentView) {
        this.A00 = AnonymousClass3MW.A0z(voiceStatusContentView);
        this.A01 = r2;
    }
}
