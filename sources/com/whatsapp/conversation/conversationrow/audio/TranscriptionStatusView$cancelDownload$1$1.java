package com.whatsapp.conversation.conversationrow.audio;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C122716Rq;
import X.C1407873b;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.ml.v2.MLModelManagerV2$cancelDownloadInternal$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.audio.TranscriptionStatusView$cancelDownload$1$1", f = "TranscriptionStatusView.kt", i = {}, l = {283}, m = "invokeSuspend", n = {}, s = {})
public final class TranscriptionStatusView$cancelDownload$1$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ TranscriptionStatusView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionStatusView$cancelDownload$1$1(TranscriptionStatusView transcriptionStatusView, C30391dr r3) {
        super(2, r3);
        this.this$0 = transcriptionStatusView;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new TranscriptionStatusView$cancelDownload$1$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new TranscriptionStatusView$cancelDownload$1$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C1407873b A03 = this.this$0.getMlModelManager();
            C122716Rq r4 = C122716Rq.TRANSCRIPTION;
            this.label = 1;
            if (C30451dy.A00(this, A03.A07, new MLModelManagerV2$cancelDownloadInternal$2(A03, r4, (C30391dr) null, false)) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
