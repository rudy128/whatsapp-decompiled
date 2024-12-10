package com.whatsapp.ptt.language.data.repository;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.AnonymousClass4OD;
import X.C18070vi;
import X.C18460wS;
import X.C25351CeA;
import X.C25550Cho;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C86914To;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ptt.language.data.repository.TranscriptionChooseLanguageRepositoryImpl$getSupportedLanguages$1", f = "TranscriptionChooseLanguageRepositoryImpl.kt", i = {0}, l = {41, 44}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
public final class TranscriptionChooseLanguageRepositoryImpl$getSupportedLanguages$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass4OD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionChooseLanguageRepositoryImpl$getSupportedLanguages$1(AnonymousClass4OD r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        TranscriptionChooseLanguageRepositoryImpl$getSupportedLanguages$1 transcriptionChooseLanguageRepositoryImpl$getSupportedLanguages$1 = new TranscriptionChooseLanguageRepositoryImpl$getSupportedLanguages$1(this.this$0, r4);
        transcriptionChooseLanguageRepositoryImpl$getSupportedLanguages$1.L$0 = obj;
        return transcriptionChooseLanguageRepositoryImpl$getSupportedLanguages$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1G2 r5;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r5 = (AnonymousClass1G2) this.L$0;
            Set<C25550Cho> A05 = this.this$0.A03.A05();
            ArrayList A13 = AnonymousClass000.A13();
            for (C25550Cho cho : A05) {
                String str = cho.A01;
                if (str != null) {
                    String A01 = C25351CeA.A01(Locale.forLanguageTag(str));
                    C18070vi.A0X(A01);
                    A13.add(new C86914To(A01, str));
                }
            }
            this.L$0 = r5;
            this.label = 1;
            if (r5.BJt(A13, this) == r6) {
                return r6;
            }
        } else if (i == 1) {
            r5 = (AnonymousClass1G2) this.L$0;
            try {
                C30691eM.A01(obj);
            } catch (Exception e) {
                Log.e("TranscriptionLanguageRepositoryImpl/getSupportedLanguages", e);
                C18460wS r0 = C18460wS.A00;
                this.L$0 = null;
                this.label = 2;
                if (r5.BJt(r0, this) == r6) {
                    return r6;
                }
            }
        } else if (i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranscriptionChooseLanguageRepositoryImpl$getSupportedLanguages$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
