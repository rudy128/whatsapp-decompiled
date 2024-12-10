package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment;
import com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment$cancelDownload$1;
import com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment$startDownload$1;

/* renamed from: X.4ef  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90804ef implements AdapterView.OnItemClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C73053Ou A01;
    public final /* synthetic */ TranslationLanguageSelectorFragment A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C73053Ou r5 = this.A01;
        TranslationLanguageSelectorFragment translationLanguageSelectorFragment = this.A02;
        View view2 = this.A00;
        String str = this.A03;
        String str2 = this.A04;
        int i2 = i;
        C83294Eo A002 = r5.getItem(i);
        if (A002 instanceof AnonymousClass436) {
            AnonymousClass436 r3 = (AnonymousClass436) A002;
            if (r3.A01) {
                AnonymousClass3MX.A1Q(new TranslationLanguageSelectorFragment$cancelDownload$1(r3, r5, translationLanguageSelectorFragment, (C30391dr) null), AnonymousClass2SS.A00(translationLanguageSelectorFragment));
                return;
            }
        }
        AnonymousClass3MX.A1Q(new TranslationLanguageSelectorFragment$startDownload$1(view2, r5, translationLanguageSelectorFragment, str, str2, (C30391dr) null, i2), AnonymousClass2SS.A00(translationLanguageSelectorFragment));
    }

    public /* synthetic */ C90804ef(View view, C73053Ou r2, TranslationLanguageSelectorFragment translationLanguageSelectorFragment, String str, String str2) {
        this.A01 = r2;
        this.A02 = translationLanguageSelectorFragment;
        this.A00 = view;
        this.A03 = str;
        this.A04 = str2;
    }
}
