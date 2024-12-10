package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.5VS  reason: invalid class name */
public final class AnonymousClass5VS extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1F9 $activity;
    public final /* synthetic */ RegistrationAudioGuidanceViewModel $viewModel;
    public final /* synthetic */ AnonymousClass4SH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VS(AnonymousClass1F9 r2, AnonymousClass4SH r3, RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel) {
        super(1);
        this.this$0 = r3;
        this.$activity = r2;
        this.$viewModel = registrationAudioGuidanceViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        ViewTreeObserver viewTreeObserver;
        if (obj == C82784Cb.DOWNLOADED) {
            AnonymousClass4SH r5 = this.this$0;
            AnonymousClass1F9 r4 = this.$activity;
            C18070vi.A0z(r4, "null cannot be cast to non-null type android.app.Activity");
            RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel = this.$viewModel;
            if (!(C17880vN.A1W(C17880vN.A0C(registrationAudioGuidanceViewModel.A0D.A01), "is_reg_audio_guidance_tooltip_shown") || (view = r5.A00) == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
                viewTreeObserver.addOnGlobalLayoutListener(new C90444e5(r4, r5, registrationAudioGuidanceViewModel, 4));
            }
        } else if (obj == C82784Cb.FAILED) {
            Log.e("RegistrationAudioGuidanceSetupManager/setupRegistrationToolbar/audioGuidance/failed to download audio file");
            AnonymousClass4SH r42 = this.this$0;
            r42.A03.A0J(new C146517Pk(r42, this.$activity, 39));
        }
        return C27621Wu.A00;
    }
}
