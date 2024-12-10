package com.whatsapp.ptt.language.ui;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3U1;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99614tB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageActivity$onCreate$2", f = "TranscriptionChooseLanguageActivity.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
public final class TranscriptionChooseLanguageActivity$onCreate$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ TranscriptionChooseLanguageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionChooseLanguageActivity$onCreate$2(TranscriptionChooseLanguageActivity transcriptionChooseLanguageActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = transcriptionChooseLanguageActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new TranscriptionChooseLanguageActivity$onCreate$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new TranscriptionChooseLanguageActivity$onCreate$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G4 r2 = ((AnonymousClass3U1) this.this$0.A09.getValue()).A0D;
            C99614tB A00 = C99614tB.A00(this.this$0, 41);
            this.label = 1;
            if (r2.BFC(this, A00) == r4) {
                return r4;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0l();
        } else {
            C30691eM.A01(obj);
        }
        throw AnonymousClass3MW.A13();
    }
}
