package X;

import androidx.fragment.app.Fragment;
import com.whatsapp.bot.metaai.imagineme.Hilt_ImagineMeOnboardingFinishingFragment;
import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingActivity;
import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment;
import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingErrorOrCompleteFragment;

/* renamed from: X.3Zx  reason: invalid class name and case insensitive filesystem */
public final class C74423Zx extends BLs {
    public final /* synthetic */ ImagineMeOnboardingActivity A00;

    public int A0Q() {
        return 3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74423Zx(AnonymousClass1FL r1, ImagineMeOnboardingActivity imagineMeOnboardingActivity) {
        super(r1);
        this.A00 = imagineMeOnboardingActivity;
    }

    public Fragment A0U(int i) {
        if (i == 0) {
            return new ImagineMeOnboardingCameraFragment();
        }
        if (i == 1) {
            return new Hilt_ImagineMeOnboardingFinishingFragment();
        }
        if (i == 2) {
            return new ImagineMeOnboardingErrorOrCompleteFragment();
        }
        throw AnonymousClass001.A13("Invalid position: ", AnonymousClass000.A10(), i);
    }
}
