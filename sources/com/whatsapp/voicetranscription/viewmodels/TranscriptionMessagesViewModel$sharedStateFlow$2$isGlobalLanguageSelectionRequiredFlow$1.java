package com.whatsapp.voicetranscription.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass4OZ;
import X.C18020vd;
import X.C18040vf;
import X.C23421Fz;
import X.C26092CsA;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C88604aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.voicetranscription.viewmodels.TranscriptionMessagesViewModel$sharedStateFlow$2$isGlobalLanguageSelectionRequiredFlow$1", f = "TranscriptionMessagesViewModel.kt", i = {}, l = {52, 56}, m = "invokeSuspend", n = {}, s = {})
public final class TranscriptionMessagesViewModel$sharedStateFlow$2$isGlobalLanguageSelectionRequiredFlow$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass4OZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionMessagesViewModel$sharedStateFlow$2$isGlobalLanguageSelectionRequiredFlow$1(AnonymousClass4OZ r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        TranscriptionMessagesViewModel$sharedStateFlow$2$isGlobalLanguageSelectionRequiredFlow$1 transcriptionMessagesViewModel$sharedStateFlow$2$isGlobalLanguageSelectionRequiredFlow$1 = new TranscriptionMessagesViewModel$sharedStateFlow$2$isGlobalLanguageSelectionRequiredFlow$1(this.this$0, r4);
        transcriptionMessagesViewModel$sharedStateFlow$2$isGlobalLanguageSelectionRequiredFlow$1.L$0 = obj;
        return transcriptionMessagesViewModel$sharedStateFlow$2$isGlobalLanguageSelectionRequiredFlow$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object BJt;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r4 = (AnonymousClass1G2) this.L$0;
            if (C18020vd.A05(C18040vf.A02, AnonymousClass3MX.A0y(this.this$0.A01).A01, 9215)) {
                C23421Fz A02 = C26092CsA.A02(AnonymousClass3MX.A18(AnonymousClass3MX.A0y(this.this$0.A01).A02));
                this.label = 1;
                BJt = C88604aC.A02(this, A02, r4);
            } else {
                Boolean A0h = AnonymousClass000.A0h();
                this.label = 2;
                BJt = r4.BJt(A0h, this);
            }
            if (BJt == r3) {
                return r3;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranscriptionMessagesViewModel$sharedStateFlow$2$isGlobalLanguageSelectionRequiredFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
