package X;

import com.whatsapp.WaImageButton;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;

/* renamed from: X.4lR  reason: invalid class name and case insensitive filesystem */
public final class C94944lR implements C160838Ad {
    public final WaImageButton A00;
    public final C441822l A01;
    public final VoiceNoteSeekBar A02;

    public C94944lR(WaImageButton waImageButton, C441822l r3, VoiceNoteSeekBar voiceNoteSeekBar) {
        C18070vi.A0d(waImageButton, 3);
        this.A01 = r3;
        this.A02 = voiceNoteSeekBar;
        this.A00 = waImageButton;
    }

    public void BsS(boolean z) {
    }

    public C441822l BRX() {
        return this.A01;
    }

    public void C0A(int i) {
        AnonymousClass4aV.A05(this.A00);
    }

    public void C20(int i) {
        this.A02.setProgress(i);
    }

    public void C3y() {
        AnonymousClass4aV.A04(this.A00);
    }

    public void C6B(int i) {
        AnonymousClass4aV.A04(this.A00);
        this.A02.setMax(i);
    }

    public void C70(int i, boolean z) {
        AnonymousClass4aV.A05(this.A00);
        if (z) {
            this.A02.setProgress(0);
        }
    }
}
