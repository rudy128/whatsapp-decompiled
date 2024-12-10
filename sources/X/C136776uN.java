package X;

import android.media.AudioManager;

/* renamed from: X.6uN  reason: invalid class name and case insensitive filesystem */
public class C136776uN {
    public AudioManager.OnAudioFocusChangeListener A00;
    public long A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass1KB A03;

    public void A00() {
        AudioManager A0D = this.A02.A0D();
        if (A0D != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A00;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new AnonymousClass75N(2);
                this.A00 = onAudioFocusChangeListener;
            }
            A0D.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    public void A02() {
        AudioManager A0D = this.A02.A0D();
        if (A0D != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A00;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new AnonymousClass75N(2);
                this.A00 = onAudioFocusChangeListener;
            }
            A0D.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
        }
    }

    public C136776uN(AnonymousClass1KB r1, AnonymousClass11C r2) {
        this.A03 = r1;
        this.A02 = r2;
    }

    public void A01() {
        AudioManager A0D = this.A02.A0D();
        if (A0D != null && A0D.getStreamVolume(3) == 0) {
            A03(2131894631);
        }
    }

    public void A03(int i) {
        if (System.currentTimeMillis() - this.A01 > 2000) {
            this.A01 = System.currentTimeMillis();
            this.A03.A08(i, 0);
        }
    }
}
