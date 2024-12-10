package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.WaImageView;
import com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceSetupManager$setupOptionsMenuItem$3;
import com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.4SH  reason: invalid class name */
public final class AnonymousClass4SH {
    public View A00;
    public LottieAnimationView A01;
    public WaImageView A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass11C A04;
    public final C18600wl A05;

    public final void A00(Menu menu, AnonymousClass1FY r7, RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel, String str) {
        LottieAnimationView lottieAnimationView;
        C17900vP.A0f("RegistrationAudioGuidanceSetupManager/setupOptionsMenuItem/audioFileId=", str, AnonymousClass3MZ.A19(registrationAudioGuidanceViewModel, 1));
        if (!registrationAudioGuidanceViewModel.A0V()) {
            if (menu.findItem(2131434441) != null) {
                menu.removeItem(2131434441);
            }
        } else if (str == null) {
            if (menu.findItem(2131434441) != null) {
                menu.removeItem(2131434441);
            }
            registrationAudioGuidanceViewModel.A0U(true);
        } else if (menu.findItem(2131434441) != null) {
            Log.i("RegistrationAudioGuidanceSetupManager/setupOptionsMenuItem/menu item already exists");
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("RegistrationAudioGuidanceSetupManager/setupOptionsMenuItem/enabled=");
            C17900vP.A0r(A10, AnonymousClass3MX.A1T(C17880vN.A0C(registrationAudioGuidanceViewModel.A0D.A01), "is_reg_audio_guidance_enabled"));
            r7.getMenuInflater().inflate(2131820588, menu);
            MenuItem findItem = menu.findItem(2131434441);
            View actionView = findItem.getActionView();
            if (actionView != null) {
                C90024dP.A00(actionView, this, registrationAudioGuidanceViewModel, 30);
            }
            View actionView2 = findItem.getActionView();
            View view = null;
            if (actionView2 != null) {
                view = actionView2.findViewById(2131432507);
            }
            this.A00 = view;
            View actionView3 = findItem.getActionView();
            if (actionView3 == null || (lottieAnimationView = (LottieAnimationView) actionView3.findViewById(2131432506)) == null) {
                lottieAnimationView = null;
            } else {
                lottieAnimationView.setRepeatCount(-1);
                if ((lottieAnimationView.getResources().getConfiguration().uiMode & 48) == 16) {
                    D7Z d7z = new D7Z(lottieAnimationView);
                    if (lottieAnimationView.A01 != null) {
                        d7z.BpV();
                    }
                    lottieAnimationView.A0A.add(d7z);
                }
            }
            this.A01 = lottieAnimationView;
            View actionView4 = findItem.getActionView();
            WaImageView waImageView = null;
            if (actionView4 != null) {
                waImageView = AnonymousClass3MW.A0S(actionView4, 2131432505);
            }
            this.A02 = waImageView;
            AnonymousClass3MW.A1X(this.A05, new RegistrationAudioGuidanceSetupManager$setupOptionsMenuItem$3(this, registrationAudioGuidanceViewModel, (C30391dr) null), AnonymousClass3MZ.A0H(r7));
        }
    }

    public final void A01(AnonymousClass1F9 r7, RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel, String str, String str2) {
        C72473Md.A1I(registrationAudioGuidanceViewModel, str2);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RegistrationAudioGuidanceSetupManager/setupAudioGuidance/audioFileId=");
        A10.append(str);
        A10.append(", enabled=");
        C18100vl r5 = registrationAudioGuidanceViewModel.A0D.A01;
        C17900vP.A0r(A10, AnonymousClass3MX.A1T(C17880vN.A0C(r5), "is_reg_audio_guidance_enabled"));
        if (str != null) {
            C17900vP.A0f("RegistrationAudioGuidanceViewModel/setDownloadAudioFileId/", str, AnonymousClass000.A10());
            registrationAudioGuidanceViewModel.A03 = str;
        }
        registrationAudioGuidanceViewModel.A04 = str2;
        if (!registrationAudioGuidanceViewModel.A0V() || str == null) {
            registrationAudioGuidanceViewModel.A0U(false);
            if (C17890vO.A00(C17880vN.A0C(r5), "reg_audio_guidance_feature_id") > 0 && !CGN.A00.contains(Locale.getDefault().toString()) && registrationAudioGuidanceViewModel.A03 != null) {
                Log.i("RegistrationAudioGuidanceViewModel/funnelLogAudioGuidanceUnsupportedLocale");
                RegistrationAudioGuidanceViewModel.A06(registrationAudioGuidanceViewModel, "audio_guidance_unsupported_locale", true);
            }
            if (C17890vO.A00(C17880vN.A0C(r5), "reg_audio_guidance_feature_id") > 0 && AnonymousClass1Y5.A0D(registrationAudioGuidanceViewModel.A0B.A0M()) && registrationAudioGuidanceViewModel.A03 != null) {
                Log.i("RegistrationAudioGuidanceViewModel/funnelLogAudioGuidanceAccessibilityEnabled");
                RegistrationAudioGuidanceViewModel.A06(registrationAudioGuidanceViewModel, "audio_guidance_accessibility_enabled", true);
                return;
            }
            return;
        }
        registrationAudioGuidanceViewModel.A02 = AnonymousClass00R.A00;
        C91634g0.A00(r7, registrationAudioGuidanceViewModel.A05, new AnonymousClass5U4(this), 23);
        C91634g0.A00(r7, registrationAudioGuidanceViewModel.A06, new AnonymousClass5VS(r7, this, registrationAudioGuidanceViewModel), 23);
        if (!AnonymousClass4F9.A00) {
            C91634g0.A00(r7, registrationAudioGuidanceViewModel.A07, new AnonymousClass5VT(r7, this, registrationAudioGuidanceViewModel), 23);
        }
        if (!AnonymousClass3MX.A1T(C17880vN.A0C(r5), "is_reg_audio_guidance_enabled")) {
            RegistrationAudioGuidanceViewModel.A06(registrationAudioGuidanceViewModel, "audio_guidance_autoplay_off", false);
        } else {
            registrationAudioGuidanceViewModel.A0T();
        }
    }

    public AnonymousClass4SH(AnonymousClass1KB r1, AnonymousClass11C r2, C18600wl r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A03 = r1;
        this.A04 = r2;
        this.A05 = r3;
    }
}
