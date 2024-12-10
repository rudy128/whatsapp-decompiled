package com.whatsapp.messagetranslation.onboarding.langselector;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1Nb;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.messagetranslation.onboarding.TranslationViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment$setupLanguageList$1$chatSettings$1", f = "TranslationLanguageSelectorFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TranslationLanguageSelectorFragment$setupLanguageList$1$chatSettings$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ TranslationLanguageSelectorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslationLanguageSelectorFragment$setupLanguageList$1$chatSettings$1(TranslationLanguageSelectorFragment translationLanguageSelectorFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = translationLanguageSelectorFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new TranslationLanguageSelectorFragment$setupLanguageList$1$chatSettings$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new TranslationLanguageSelectorFragment$setupLanguageList$1$chatSettings$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        if (this.label == 0) {
            C30691eM.A01(obj);
            TranslationLanguageSelectorFragment translationLanguageSelectorFragment = this.this$0;
            AnonymousClass1Nb r1 = translationLanguageSelectorFragment.A07;
            if (r1 != null) {
                TranslationViewModel translationViewModel = translationLanguageSelectorFragment.A05;
                if (translationViewModel == null) {
                    AnonymousClass3MW.A1H();
                } else {
                    AnonymousClass1BI r0 = translationViewModel.A00;
                    if (r0 != null) {
                        return r1.A0a(r0);
                    }
                    str = "chatJid";
                    C18070vi.A11(str);
                }
            } else {
                str = "chatSettingsStore";
                C18070vi.A11(str);
            }
            throw null;
        }
        throw AnonymousClass000.A0l();
    }
}
