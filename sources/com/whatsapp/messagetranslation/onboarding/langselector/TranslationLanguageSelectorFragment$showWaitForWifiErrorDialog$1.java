package com.whatsapp.messagetranslation.onboarding.langselector;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C73053Ou;
import X.C99124sJ;
import android.view.View;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment$showWaitForWifiErrorDialog$1", f = "TranslationLanguageSelectorFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TranslationLanguageSelectorFragment$showWaitForWifiErrorDialog$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C73053Ou $adapter;
    public final /* synthetic */ String $chatSettingLang;
    public final /* synthetic */ String $lastSelectedSourceLangTag;
    public final /* synthetic */ int $position;
    public final /* synthetic */ View $view;
    public int label;
    public final /* synthetic */ TranslationLanguageSelectorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslationLanguageSelectorFragment$showWaitForWifiErrorDialog$1(View view, C73053Ou r3, TranslationLanguageSelectorFragment translationLanguageSelectorFragment, String str, String str2, C30391dr r7, int i) {
        super(2, r7);
        this.this$0 = translationLanguageSelectorFragment;
        this.$view = view;
        this.$adapter = r3;
        this.$position = i;
        this.$chatSettingLang = str;
        this.$lastSelectedSourceLangTag = str2;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        TranslationLanguageSelectorFragment translationLanguageSelectorFragment = this.this$0;
        return new TranslationLanguageSelectorFragment$showWaitForWifiErrorDialog$1(this.$view, this.$adapter, translationLanguageSelectorFragment, this.$chatSettingLang, this.$lastSelectedSourceLangTag, r10, this.$position);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            TranslationLanguageSelectorFragment translationLanguageSelectorFragment = this.this$0;
            String A0F = C18070vi.A0F(this.$view.getContext(), 2131898954);
            TranslationLanguageSelectorFragment translationLanguageSelectorFragment2 = this.this$0;
            View view = this.$view;
            C73053Ou r5 = this.$adapter;
            int i = this.$position;
            String str = this.$chatSettingLang;
            String str2 = this.$lastSelectedSourceLangTag;
            TranslationLanguageSelectorFragment translationLanguageSelectorFragment3 = translationLanguageSelectorFragment;
            TranslationLanguageSelectorFragment.A03(translationLanguageSelectorFragment3, A0F, new C99124sJ(view, r5, translationLanguageSelectorFragment2, str, str2, i, 1), new C99124sJ(view, r5, translationLanguageSelectorFragment2, str, str2, i, 2), 2131898955, 2131898676);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranslationLanguageSelectorFragment$showWaitForWifiErrorDialog$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
