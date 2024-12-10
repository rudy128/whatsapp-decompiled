package com.whatsapp.registration.audioguidance;

import X.A1I;
import X.AnonymousClass000;
import X.AnonymousClass10I;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.AnonymousClass2YR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4bK;
import X.C167238fg;
import X.C17890vO;
import X.C18070vi;
import X.C182679Vh;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import android.media.AudioManager;
import android.media.MediaPlayer;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel$playAudioGuidance$1", f = "RegistrationAudioGuidanceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RegistrationAudioGuidanceViewModel$playAudioGuidance$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ RegistrationAudioGuidanceViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegistrationAudioGuidanceViewModel$playAudioGuidance$1(RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = registrationAudioGuidanceViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new RegistrationAudioGuidanceViewModel$playAudioGuidance$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new RegistrationAudioGuidanceViewModel$playAudioGuidance$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Throwable e;
        AudioManager audioManager;
        if (this.label == 0) {
            C30691eM.A01(obj);
            File A02 = ((A1I) this.this$0.A0F.get()).A02(RegistrationAudioGuidanceViewModel.A03(this.this$0));
            if (A02 == null || !A02.exists()) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("RegistrationAudioGuidanceViewModel/playAudioGuidance/download/");
                String str = this.this$0.A03;
                if (str != null) {
                    C17890vO.A1A(A10, str);
                    AnonymousClass3MY.A1M(this.this$0.A08, false);
                    RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel = this.this$0;
                    A1I a1i = (A1I) registrationAudioGuidanceViewModel.A0F.get();
                    String A00 = RegistrationAudioGuidanceViewModel.A00(registrationAudioGuidanceViewModel);
                    String A03 = RegistrationAudioGuidanceViewModel.A03(registrationAudioGuidanceViewModel);
                    AnonymousClass10I r3 = a1i.A04;
                    AnonymousClass2YR r0 = a1i.A01;
                    r3.CGN(new C167238fg((C182679Vh) r0.A00.A00.A4H.get(), A00, A03, AnonymousClass3MW.A0z(registrationAudioGuidanceViewModel)));
                }
                C18070vi.A11("audioFileId");
                throw null;
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("RegistrationAudioGuidanceViewModel/playAudioGuidance/audio file exists/");
            String str2 = this.this$0.A03;
            if (str2 != null) {
                C17890vO.A1A(A102, str2);
                AnonymousClass1DT r02 = this.this$0.A08;
                Boolean A0i = AnonymousClass000.A0i();
                r02.A0E(A0i);
                RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel2 = this.this$0;
                registrationAudioGuidanceViewModel2.A00 = 3;
                try {
                    if (registrationAudioGuidanceViewModel2.A01 == null) {
                        MediaPlayer mediaPlayer = new MediaPlayer();
                        RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel3 = this.this$0;
                        mediaPlayer.setDataSource(A02.getAbsolutePath());
                        mediaPlayer.setAudioStreamType(3);
                        mediaPlayer.setOnCompletionListener(new AnonymousClass4bK(registrationAudioGuidanceViewModel3, 0));
                        registrationAudioGuidanceViewModel2.A01 = mediaPlayer;
                    }
                    MediaPlayer mediaPlayer2 = this.this$0.A01;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.prepare();
                    }
                    MediaPlayer mediaPlayer3 = this.this$0.A01;
                    if (mediaPlayer3 != null) {
                        mediaPlayer3.start();
                    }
                } catch (Exception e2) {
                    e = e2;
                    if ((e instanceof IllegalStateException) || (e instanceof IOException)) {
                        Log.e("RegistrationAudioGuidanceViewModel/playAudioGuidance/IllegalStateException while preparing/starting media player", e);
                        AnonymousClass3MY.A1M(this.this$0.A08, false);
                    }
                }
                RegistrationAudioGuidanceViewModel.A06(this.this$0, "audio_guidance_autoplay_on", false);
                RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel4 = this.this$0;
                if (registrationAudioGuidanceViewModel4.A07.A02.A00 > 0 && (audioManager = (AudioManager) registrationAudioGuidanceViewModel4.A0C.A00.getSystemService("audio")) != null) {
                    RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel5 = this.this$0;
                    if (((double) (((float) audioManager.getStreamVolume(3)) / ((float) audioManager.getStreamMaxVolume(3)))) < 0.25d) {
                        registrationAudioGuidanceViewModel5.A0A.A0E(A0i);
                    }
                }
            }
            C18070vi.A11("audioFileId");
            throw null;
            return C27621Wu.A00;
        }
        e = AnonymousClass000.A0l();
        throw e;
    }
}
