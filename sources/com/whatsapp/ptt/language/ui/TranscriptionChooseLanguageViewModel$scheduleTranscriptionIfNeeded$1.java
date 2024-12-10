package com.whatsapp.ptt.language.ui;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3U1;
import X.C24027BuE;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C441822l;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageViewModel$scheduleTranscriptionIfNeeded$1", f = "TranscriptionChooseLanguageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TranscriptionChooseLanguageViewModel$scheduleTranscriptionIfNeeded$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass3U1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionChooseLanguageViewModel$scheduleTranscriptionIfNeeded$1(AnonymousClass3U1 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new TranscriptionChooseLanguageViewModel$scheduleTranscriptionIfNeeded$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new TranscriptionChooseLanguageViewModel$scheduleTranscriptionIfNeeded$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass3U1 r4 = this.this$0;
            List<AnonymousClass205> list = r4.A09;
            ArrayList<C441822l> A13 = AnonymousClass000.A13();
            for (AnonymousClass205 A05 : list) {
                AnonymousClass206 A052 = r4.A06.A01.A05(A05);
                if ((A052 instanceof C441822l) && A052 != null) {
                    A13.add(A052);
                }
            }
            AnonymousClass3U1 r6 = this.this$0;
            for (C441822l buE : A13) {
                r6.A04.A02(new C24027BuE(buE, true, false));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
