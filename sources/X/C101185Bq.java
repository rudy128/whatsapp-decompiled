package X;

import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment;
import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel;
import java.util.List;

/* renamed from: X.5Bq  reason: invalid class name and case insensitive filesystem */
public final class C101185Bq extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ImagineMeOnboardingCameraFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101185Bq(ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment) {
        super(0);
        this.this$0 = imagineMeOnboardingCameraFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object value;
        ImagineMeOnboardingCameraFragment imagineMeOnboardingCameraFragment = this.this$0;
        if (imagineMeOnboardingCameraFragment.A0B != null) {
            ImagineMeOnboardingViewModel A0O = AnonymousClass3Ma.A0O(imagineMeOnboardingCameraFragment);
            List list = A0O.A0I;
            int size = list.size();
            int i = A0O.A00;
            if (i < 0 || i >= size || list.get(i) == null) {
                ImagineMeOnboardingCameraFragment.A01(imagineMeOnboardingCameraFragment);
            } else {
                ImagineMeOnboardingViewModel A0O2 = AnonymousClass3Ma.A0O(imagineMeOnboardingCameraFragment);
                C106275Vf r3 = C106275Vf.A00;
                AnonymousClass1G4 r2 = A0O2.A0J;
                do {
                    value = r2.getValue();
                } while (!r2.BFK(value, r3.invoke(value)));
            }
        }
        return C27621Wu.A00;
    }
}
