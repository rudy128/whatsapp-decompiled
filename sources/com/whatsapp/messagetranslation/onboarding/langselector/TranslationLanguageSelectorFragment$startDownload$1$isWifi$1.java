package com.whatsapp.messagetranslation.onboarding.langselector;

import X.AnonymousClass000;
import X.AnonymousClass11E;
import X.AnonymousClass1LR;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment$startDownload$1$isWifi$1", f = "TranslationLanguageSelectorFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TranslationLanguageSelectorFragment$startDownload$1$isWifi$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ TranslationLanguageSelectorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslationLanguageSelectorFragment$startDownload$1$isWifi$1(TranslationLanguageSelectorFragment translationLanguageSelectorFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = translationLanguageSelectorFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new TranslationLanguageSelectorFragment$startDownload$1$isWifi$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new TranslationLanguageSelectorFragment$startDownload$1$isWifi$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass11E r0 = this.this$0.A02;
            if (r0 != null) {
                AnonymousClass1LR A04 = r0.A04();
                if (A04 != null) {
                    z = A04.A06;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            C18070vi.A11("connectivityStateProvider");
            throw null;
        }
        throw AnonymousClass000.A0l();
    }
}
