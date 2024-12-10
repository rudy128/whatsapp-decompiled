package X;

import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment;
import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel;
import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel$onSelfieCapture$1;

/* renamed from: X.4jP  reason: invalid class name and case insensitive filesystem */
public final class C93704jP implements E8C {
    public final /* synthetic */ ImagineMeOnboardingCameraFragment A00;

    public C93704jP(ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment) {
        this.A00 = imagineMeOnboardingCameraFragment;
    }

    public void C0c(byte[] bArr, boolean z) {
        ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment = this.A00;
        if (bArr == null) {
            AnonymousClass1KB r2 = imagineMeOnboardingCameraFragment.A03;
            if (r2 != null) {
                r2.A08(2131887876, 1);
            } else {
                AnonymousClass3MW.A1C();
                throw null;
            }
        } else {
            ImagineMeOnboardingViewModel A0O = AnonymousClass3Ma.A0O(imagineMeOnboardingCameraFragment);
            C101185Bq r3 = new C101185Bq(imagineMeOnboardingCameraFragment);
            Object value = A0O.A0O.getValue();
            if (value == AnonymousClass4DI.CAPTURE_SELFIE_1 || value == AnonymousClass4DI.CAPTURE_SELFIE_2 || value == AnonymousClass4DI.CAPTURE_SELFIE_3) {
                AnonymousClass3MX.A1Q(new ImagineMeOnboardingViewModel$onSelfieCapture$1(A0O, (C30391dr) null, r3, bArr), C41561wd.A00(A0O));
            }
        }
    }

    public void onShutter() {
        ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment = this.A00;
        AnonymousClass1KB r2 = imagineMeOnboardingCameraFragment.A03;
        if (r2 != null) {
            r2.A0J(new C21445AkC(imagineMeOnboardingCameraFragment, 41));
        } else {
            AnonymousClass3MW.A1C();
            throw null;
        }
    }
}
