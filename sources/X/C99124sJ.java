package X;

import android.view.View;
import com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment;
import com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment$startDownload$1;

/* renamed from: X.4sJ  reason: invalid class name and case insensitive filesystem */
public class C99124sJ implements C18080vj, C18090vk {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public C99124sJ(View view, C73053Ou r2, TranslationLanguageSelectorFragment translationLanguageSelectorFragment, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = translationLanguageSelectorFragment;
        this.A03 = view;
        this.A04 = r2;
        this.A01 = i;
        this.A05 = str;
        this.A06 = str2;
    }

    public final Object invoke() {
        TranslationLanguageSelectorFragment translationLanguageSelectorFragment;
        View view;
        C73053Ou r1;
        int i;
        String str;
        String str2;
        boolean z;
        switch (this.A00) {
            case 0:
                TranslationLanguageSelectorFragment translationLanguageSelectorFragment2 = (TranslationLanguageSelectorFragment) this.A02;
                int i2 = this.A01;
                String str3 = this.A05;
                String str4 = this.A06;
                AnonymousClass3MX.A1Q(new TranslationLanguageSelectorFragment$startDownload$1((View) this.A03, (C73053Ou) this.A04, translationLanguageSelectorFragment2, str3, str4, (C30391dr) null, i2), AnonymousClass2SS.A00(translationLanguageSelectorFragment2));
                break;
            case 1:
                translationLanguageSelectorFragment = (TranslationLanguageSelectorFragment) this.A02;
                view = (View) this.A03;
                r1 = (C73053Ou) this.A04;
                i = this.A01;
                str = this.A05;
                str2 = this.A06;
                z = true;
                break;
            default:
                translationLanguageSelectorFragment = (TranslationLanguageSelectorFragment) this.A02;
                view = (View) this.A03;
                r1 = (C73053Ou) this.A04;
                i = this.A01;
                str = this.A05;
                str2 = this.A06;
                z = false;
                break;
        }
        TranslationLanguageSelectorFragment.A01(view, r1, translationLanguageSelectorFragment, str, str2, i, z);
        return C27621Wu.A00;
    }
}
