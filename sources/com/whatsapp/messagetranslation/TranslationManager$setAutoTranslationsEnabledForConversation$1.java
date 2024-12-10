package com.whatsapp.messagetranslation;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1Nb;
import X.AnonymousClass1OS;
import X.AnonymousClass4RU;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.TranslationManager$setAutoTranslationsEnabledForConversation$1", f = "TranslationManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TranslationManager$setAutoTranslationsEnabledForConversation$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ AnonymousClass1BI $jid;
    public final /* synthetic */ String $sourceLang;
    public final /* synthetic */ String $targetLang;
    public int label;
    public final /* synthetic */ AnonymousClass4RU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslationManager$setAutoTranslationsEnabledForConversation$1(AnonymousClass1BI r2, AnonymousClass4RU r3, String str, String str2, C30391dr r6, boolean z) {
        super(2, r6);
        this.this$0 = r3;
        this.$jid = r2;
        this.$sourceLang = str;
        this.$targetLang = str2;
        this.$enabled = z;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new TranslationManager$setAutoTranslationsEnabledForConversation$1(this.$jid, this.this$0, this.$sourceLang, this.$targetLang, r9, this.$enabled);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ((AnonymousClass1Nb) this.this$0.A00.get()).A0q(this.$jid, this.$sourceLang, this.$targetLang, this.$enabled);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranslationManager$setAutoTranslationsEnabledForConversation$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
