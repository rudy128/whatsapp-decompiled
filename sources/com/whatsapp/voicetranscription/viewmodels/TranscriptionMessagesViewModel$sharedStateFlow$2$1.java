package com.whatsapp.voicetranscription.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass205;
import X.AnonymousClass20H;
import X.AnonymousClass3MX;
import X.AnonymousClass4OZ;
import X.AnonymousClass6TT;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C25802CmF;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C88534a3;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.voicetranscription.viewmodels.TranscriptionMessagesViewModel$sharedStateFlow$2$1", f = "TranscriptionMessagesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TranscriptionMessagesViewModel$sharedStateFlow$2$1 extends C30431dv implements AnonymousClass20H {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public int label;
    public final /* synthetic */ AnonymousClass4OZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionMessagesViewModel$sharedStateFlow$2$1(AnonymousClass4OZ r2, C30391dr r3) {
        super(5, r3);
        this.this$0 = r2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass6TT r5 = (AnonymousClass6TT) this.L$0;
            boolean z = this.Z$0;
            boolean z2 = this.Z$1;
            AnonymousClass205 r6 = (AnonymousClass205) this.L$1;
            C88534a3 A0y = AnonymousClass3MX.A0y(this.this$0.A01);
            C18030ve r3 = A0y.A01;
            C18040vf r2 = C18040vf.A02;
            boolean z3 = false;
            if (C18020vd.A05(r2, r3, 2890) && C18020vd.A05(r2, r3, 9589) && AnonymousClass3MX.A1T(C17890vO.A0B(A0y.A00), "voice_message_transcription_upsell_enabled") && (A0y.A09() || !C18020vd.A05(r2, r3, 12747))) {
                z3 = true;
            }
            C88534a3 A0y2 = AnonymousClass3MX.A0y(this.this$0.A01);
            boolean z4 = false;
            if (A0y2.A09()) {
                C18030ve r1 = A0y2.A01;
                if (!C18020vd.A05(r2, r1, 6808) && C18020vd.A05(r2, r1, 11650)) {
                    z4 = true;
                }
            }
            return new C25802CmF(r5, r6, z, z2, z3, z4, C18020vd.A05(r2, AnonymousClass3MX.A0y(this.this$0.A01).A01, 11650));
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean A1Y = AnonymousClass000.A1Y(obj2);
        boolean A1Y2 = AnonymousClass000.A1Y(obj3);
        TranscriptionMessagesViewModel$sharedStateFlow$2$1 transcriptionMessagesViewModel$sharedStateFlow$2$1 = new TranscriptionMessagesViewModel$sharedStateFlow$2$1(this.this$0, (C30391dr) obj5);
        transcriptionMessagesViewModel$sharedStateFlow$2$1.L$0 = obj;
        transcriptionMessagesViewModel$sharedStateFlow$2$1.Z$0 = A1Y;
        transcriptionMessagesViewModel$sharedStateFlow$2$1.Z$1 = A1Y2;
        transcriptionMessagesViewModel$sharedStateFlow$2$1.L$1 = obj4;
        return transcriptionMessagesViewModel$sharedStateFlow$2$1.invokeSuspend(C27621Wu.A00);
    }
}
