package com.whatsapp.voicetranscription.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.AnonymousClass4OZ;
import X.C119956Ao;
import X.C122716Rq;
import X.C1407873b;
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

@DebugMetadata(c = "com.whatsapp.voicetranscription.viewmodels.TranscriptionMessagesViewModel$sharedStateFlow$2$modelDownloadStatusFlow$1", f = "TranscriptionMessagesViewModel.kt", i = {}, l = {42, 44}, m = "invokeSuspend", n = {}, s = {})
public final class TranscriptionMessagesViewModel$sharedStateFlow$2$modelDownloadStatusFlow$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass4OZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionMessagesViewModel$sharedStateFlow$2$modelDownloadStatusFlow$1(AnonymousClass4OZ r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        TranscriptionMessagesViewModel$sharedStateFlow$2$modelDownloadStatusFlow$1 transcriptionMessagesViewModel$sharedStateFlow$2$modelDownloadStatusFlow$1 = new TranscriptionMessagesViewModel$sharedStateFlow$2$modelDownloadStatusFlow$1(this.this$0, r4);
        transcriptionMessagesViewModel$sharedStateFlow$2$modelDownloadStatusFlow$1.L$0 = obj;
        return transcriptionMessagesViewModel$sharedStateFlow$2$modelDownloadStatusFlow$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object A02;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r2 = (AnonymousClass1G2) this.L$0;
            C122716Rq r1 = C122716Rq.TRANSCRIPTION;
            if (((C1407873b) this.this$0.A00.get()).A08(r1)) {
                C119956Ao r0 = C119956Ao.A00;
                this.label = 1;
                A02 = r2.BJt(r0, this);
            } else {
                C23421Fz A022 = C26092CsA.A02(((C1407873b) this.this$0.A00.get()).A05(r1));
                this.label = 2;
                A02 = C88604aC.A02(this, A022, r2);
            }
            if (A02 == r4) {
                return r4;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranscriptionMessagesViewModel$sharedStateFlow$2$modelDownloadStatusFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
