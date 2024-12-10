package X;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3PV  reason: invalid class name */
public class AnonymousClass3PV extends FrameLayout implements AnonymousClass009 {
    public double A00;
    public int A01;
    public FrameLayout A02;
    public BDF A03;
    public ThumbnailButton A04;
    public UserJid A05;
    public C28931bI A06;
    public C28931bI A07;
    public AnonymousClass00H A08;
    public AnonymousClass031 A09;
    public boolean A0A;

    public static void A00(AnonymousClass3PV r5, VoiceChatMiniPillWave voiceChatMiniPillWave, int i) {
        if (voiceChatMiniPillWave == null) {
            C28931bI r1 = r5.A06;
            if (r1.A00 != null) {
                voiceChatMiniPillWave = (VoiceChatMiniPillWave) r1.A02();
            } else {
                return;
            }
        }
        int i2 = (int) (((double) i) * 0.4d);
        voiceChatMiniPillWave.A00 = (float) i2;
        ViewGroup.LayoutParams layoutParams = voiceChatMiniPillWave.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = (i + i2) - (((int) r5.A04.A00) * 2);
        voiceChatMiniPillWave.setLayoutParams(layoutParams);
    }

    public int A01(int i) {
        Resources resources;
        int i2;
        if (this.A01 != 0) {
            resources = getResources();
            i2 = this.A01;
        } else {
            resources = getResources();
            if (i == 1) {
                i2 = 2131165579;
            } else {
                int dimensionPixelSize = resources.getDimensionPixelSize(2131165583);
                if (i >= 2) {
                    return dimensionPixelSize - ((i - 2) * getResources().getDimensionPixelSize(2131165581));
                }
                return 0;
            }
        }
        return resources.getDimensionPixelSize(i2);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A09;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public ThumbnailButton getContactPhoto() {
        return this.A04;
    }

    public FrameLayout getContactPhotoLayout() {
        return this.A02;
    }

    public void onDetachedFromWindow() {
        if (this.A03 != null) {
            ((C175258yP) this.A08.get()).unregisterObserver(this.A03);
        }
        super.onDetachedFromWindow();
    }

    public void setFixedContactPhotoSizeRes(int i) {
        this.A01 = i;
    }
}
