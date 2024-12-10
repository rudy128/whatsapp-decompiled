package com.whatsapp.voicerecorder;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass25H;
import X.AnonymousClass4I5;
import X.C23421Fz;
import X.C27621Wu;
import X.C28243Du4;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C42391y6;
import X.C42441yB;
import X.C49472Qp;
import X.C95324m3;
import X.C99494su;
import X.C99614tB;
import com.whatsapp.messagedrafts.CompositionMessageStore$getCompositionMessageLiteByMessageTypeAndTimestamp$1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.voicerecorder.DraftVoiceNotesCacheDailyCron$onDailyCronWithMessageStore$1", f = "DraftVoiceNotesCacheDailyCron.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
public final class DraftVoiceNotesCacheDailyCron$onDailyCronWithMessageStore$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C95324m3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraftVoiceNotesCacheDailyCron$onDailyCronWithMessageStore$1(C95324m3 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new DraftVoiceNotesCacheDailyCron$onDailyCronWithMessageStore$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DraftVoiceNotesCacheDailyCron$onDailyCronWithMessageStore$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C23421Fz A00;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C42441yB r4 = (C42441yB) this.this$0.A00;
            if (!r4.BeW()) {
                A00 = C99494su.A00;
            } else {
                C42391y6 r8 = r4.A09;
                A00 = AnonymousClass4I5.A00(r4.A0B, new C28243Du4(new CompositionMessageStore$getCompositionMessageLiteByMessageTypeAndTimestamp$1(C49472Qp.AUDIO, AnonymousClass25H.DRAFT, r8, (C30391dr) null, 1000, 100, System.currentTimeMillis() - 604800000)));
            }
            C99614tB A002 = C99614tB.A00(this.this$0, 44);
            this.label = 1;
            if (A00.BFC(this, A002) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
