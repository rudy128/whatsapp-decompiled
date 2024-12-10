package X;

import android.media.MediaPlayer;
import com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel;

/* renamed from: X.4bK  reason: invalid class name */
public class AnonymousClass4bK implements MediaPlayer.OnCompletionListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass4bK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.A00 != 0) {
            mediaPlayer.getClass();
            AnonymousClass3MZ.A1U((AnonymousClass10I) this.A01, mediaPlayer, 26);
            return;
        }
        RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel = (RegistrationAudioGuidanceViewModel) this.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RegistrationAudioGuidanceViewModel/playAudioGuidance/finished playing audio file/");
        String str = registrationAudioGuidanceViewModel.A03;
        if (str == null) {
            C18070vi.A11("audioFileId");
            throw null;
        }
        C17890vO.A1A(A10, str);
        AnonymousClass3MY.A1M(registrationAudioGuidanceViewModel.A08, false);
        RegistrationAudioGuidanceViewModel.A05(registrationAudioGuidanceViewModel);
    }
}
