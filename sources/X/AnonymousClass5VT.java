package X;

import com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.5VT  reason: invalid class name */
public final class AnonymousClass5VT extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1F9 $activity;
    public final /* synthetic */ RegistrationAudioGuidanceViewModel $viewModel;
    public final /* synthetic */ AnonymousClass4SH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VT(AnonymousClass1F9 r2, AnonymousClass4SH r3, RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel) {
        super(1);
        this.this$0 = r3;
        this.$viewModel = registrationAudioGuidanceViewModel;
        this.$activity = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (AnonymousClass000.A1Y(obj)) {
            Log.i("RegistrationAudioGuidanceSetupManager/setupAudioGuidance/low volume");
            AnonymousClass4SH r4 = this.this$0;
            r4.A03.A0J(new C146517Pk(r4, this.$activity, 40));
            this.$viewModel.A07.A09(this.$activity);
            AnonymousClass4F9.A00 = true;
        }
        return C27621Wu.A00;
    }
}
