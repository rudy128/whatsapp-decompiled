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
import X.C42551yM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.TranslationManager$disableMessageTranslationForConversation$1", f = "TranslationManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TranslationManager$disableMessageTranslationForConversation$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $jid;
    public int label;
    public final /* synthetic */ AnonymousClass4RU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslationManager$disableMessageTranslationForConversation$1(AnonymousClass1BI r2, AnonymousClass4RU r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$jid = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new TranslationManager$disableMessageTranslationForConversation$1(this.$jid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1Nb r4 = (AnonymousClass1Nb) this.this$0.A00.get();
            AnonymousClass1BI r3 = this.$jid;
            C42551yM A0a = r4.A0a(r3);
            r4.A0q(r3, A0a.A0M, A0a.A0N, false);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranslationManager$disableMessageTranslationForConversation$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
