package com.whatsapp.registration.audioguidance;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1OX;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.B8P;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import X.C18600wl;
import X.C30391dr;
import X.C41561wd;
import X.C82784Cb;
import X.C85244Mq;
import X.CGN;
import android.media.MediaPlayer;
import com.whatsapp.util.Log;
import java.util.Locale;

public final class RegistrationAudioGuidanceViewModel extends AnonymousClass1J2 implements B8P {
    public int A00 = -1;
    public MediaPlayer A01;
    public Integer A02 = AnonymousClass00R.A00;
    public String A03;
    public String A04;
    public final AnonymousClass1DS A05;
    public final AnonymousClass1DS A06;
    public final AnonymousClass1DS A07;
    public final AnonymousClass1DT A08;
    public final AnonymousClass1DT A09;
    public final AnonymousClass1DT A0A;
    public final AnonymousClass11C A0B;
    public final AnonymousClass118 A0C;
    public final C85244Mq A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final C18600wl A0H;
    public final C18600wl A0I;
    public final AnonymousClass1OX A0J;

    public static final void A05(RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel) {
        AnonymousClass3MW.A1X(registrationAudioGuidanceViewModel.A0I, new RegistrationAudioGuidanceViewModel$stopAudioGuidanceInternal$1(registrationAudioGuidanceViewModel, (C30391dr) null), registrationAudioGuidanceViewModel.A0J);
    }

    public static final void A06(RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel, String str, boolean z) {
        if (z || !(!registrationAudioGuidanceViewModel.A0V() || registrationAudioGuidanceViewModel.A04 == null || registrationAudioGuidanceViewModel.A03 == null)) {
            AnonymousClass3MW.A1X(registrationAudioGuidanceViewModel.A0H, new RegistrationAudioGuidanceViewModel$logAction$1(registrationAudioGuidanceViewModel, str, (C30391dr) null), C41561wd.A00(registrationAudioGuidanceViewModel));
        }
    }

    public final void A0U(boolean z) {
        Log.i("RegistrationAudioGuidanceViewModel/stopAudioGuidance");
        if (z) {
            A06(this, "audio_guidance_autoplay_off", false);
        }
        A05(this);
    }

    public final boolean A0V() {
        if (C17890vO.A00(C17880vN.A0C(this.A0D.A01), "reg_audio_guidance_feature_id") <= 0 || !CGN.A00.contains(Locale.getDefault().toString()) || AnonymousClass1Y5.A0D(this.A0B.A0M())) {
            return false;
        }
        return true;
    }

    public RegistrationAudioGuidanceViewModel(AnonymousClass11C r2, AnonymousClass118 r3, C85244Mq r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, C18600wl r8, C18600wl r9, AnonymousClass1OX r10) {
        C18070vi.A0w(r8, r9, r10, r3, r5);
        C18070vi.A0q(r2, r6, r7);
        C18070vi.A0d(r4, 9);
        this.A0H = r8;
        this.A0I = r9;
        this.A0J = r10;
        this.A0C = r3;
        this.A0E = r5;
        this.A0B = r2;
        this.A0G = r6;
        this.A0F = r7;
        this.A0D = r4;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A09 = A0L;
        this.A06 = A0L;
        AnonymousClass1DT A0L2 = AnonymousClass3MW.A0L();
        this.A0A = A0L2;
        this.A07 = A0L2;
        AnonymousClass1DT A0L3 = AnonymousClass3MW.A0L();
        this.A08 = A0L3;
        this.A05 = A0L3;
    }

    public static final String A00(RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("android_");
        String str = registrationAudioGuidanceViewModel.A03;
        if (str == null) {
            C18070vi.A11("audioFileId");
            throw null;
        }
        A10.append(str);
        A10.append('_');
        A10.append(Locale.getDefault());
        A10.append('_');
        return C17880vN.A0t(A10, C17890vO.A00(C17880vN.A0C(registrationAudioGuidanceViewModel.A0D.A01), "reg_audio_guidance_feature_id"));
    }

    public static final String A03(RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("reg_audio_guidance/");
        A10.append(A00(registrationAudioGuidanceViewModel));
        return AnonymousClass000.A0y(".mp3", A10);
    }

    public static final void A04(RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RegistrationAudioGuidanceViewModel/failedToDownload/");
        String str = registrationAudioGuidanceViewModel.A03;
        if (str == null) {
            C18070vi.A11("audioFileId");
            throw null;
        }
        C17890vO.A1A(A10, str);
        A06(registrationAudioGuidanceViewModel, "audio_guidance_autoplay_on", false);
        AnonymousClass3MY.A1M(registrationAudioGuidanceViewModel.A08, false);
        registrationAudioGuidanceViewModel.A09.A0E(C82784Cb.FAILED);
    }

    public final void A0T() {
        boolean A0V = A0V();
        Boolean A0h = AnonymousClass000.A0h();
        if (!A0V) {
            this.A08.A0E(A0h);
        } else if (!AnonymousClass3MX.A1T(C17880vN.A0C(this.A0D.A01), "is_reg_audio_guidance_enabled")) {
            this.A08.A0E(A0h);
            A06(this, "audio_guidance_autoplay_off", false);
        } else {
            Log.i("RegistrationAudioGuidanceViewModel/playAudioGuidance");
            A05(this);
            AnonymousClass3MW.A1X(this.A0I, new RegistrationAudioGuidanceViewModel$playAudioGuidance$1(this, (C30391dr) null), C41561wd.A00(this));
        }
    }

    public void C8Q(int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RegistrationAudioGuidanceViewModel/onTaskCompleted/");
        String str = this.A03;
        if (str == null) {
            C18070vi.A11("audioFileId");
            throw null;
        }
        A10.append(str);
        A10.append('/');
        C17900vP.A0o(A10, i);
        this.A00 = i;
        if (i == 3) {
            AnonymousClass3MW.A1X(this.A0H, new RegistrationAudioGuidanceViewModel$onTaskCompleted$1(this, (C30391dr) null), C41561wd.A00(this));
            return;
        }
        A04(this);
    }

    public void A0S() {
        A05(this);
    }
}
