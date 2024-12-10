package X;

import android.os.Bundle;
import com.whatsapp.messagetranslation.onboarding.Hilt_TranslationOnboardingFragment;
import com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment;
import java.util.Collection;

/* renamed from: X.4H4  reason: invalid class name */
public abstract class AnonymousClass4H4 {
    /* JADX WARNING: type inference failed for: r0v2, types: [com.whatsapp.messagetranslation.onboarding.Hilt_TranslationOnboardingFragment, androidx.fragment.app.Fragment, com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment] */
    public static final TranslationOnboardingFragment A00(AnonymousClass1BI r2, Collection collection, boolean z) {
        Bundle A0J = C72463Mc.A0J(r2);
        AnonymousClass3MY.A15(A0J, r2, "chat_jid");
        A0J.putBoolean("is_translated", z);
        if (collection != null) {
            AnonymousClass4aU.A0C(A0J, collection);
        }
        ? hilt_TranslationOnboardingFragment = new Hilt_TranslationOnboardingFragment();
        hilt_TranslationOnboardingFragment.A1R(A0J);
        return hilt_TranslationOnboardingFragment;
    }
}
