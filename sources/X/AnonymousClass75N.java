package X;

import android.media.AudioManager;

/* renamed from: X.75N  reason: invalid class name */
public class AnonymousClass75N implements AudioManager.OnAudioFocusChangeListener {
    public final int A00;

    public AnonymousClass75N(int i) {
        this.A00 = i;
    }

    public final void onAudioFocusChange(int i) {
        if (this.A00 == 0) {
            C17900vP.A0j("voip audio focus changed: ", AnonymousClass000.A10(), i);
        }
    }
}
