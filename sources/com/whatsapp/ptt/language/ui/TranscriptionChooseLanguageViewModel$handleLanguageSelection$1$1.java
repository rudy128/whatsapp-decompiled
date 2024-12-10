package com.whatsapp.ptt.language.ui;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1Nb;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3U1;
import X.AnonymousClass46H;
import X.AnonymousClass4OD;
import X.C18070vi;
import X.C24100BvS;
import X.C25550Cho;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41561wd;
import X.C42551yM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageViewModel$handleLanguageSelection$1$1", f = "TranscriptionChooseLanguageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TranscriptionChooseLanguageViewModel$handleLanguageSelection$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $it;
    public final /* synthetic */ String $languageFromIndex;
    public final /* synthetic */ int $selectedLanguagePosition;
    public int label;
    public final /* synthetic */ AnonymousClass3U1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionChooseLanguageViewModel$handleLanguageSelection$1$1(AnonymousClass1BI r2, AnonymousClass3U1 r3, String str, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = r3;
        this.$it = r2;
        this.$languageFromIndex = str;
        this.$selectedLanguagePosition = i;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new TranscriptionChooseLanguageViewModel$handleLanguageSelection$1$1(this.$it, this.this$0, this.$languageFromIndex, r8, this.$selectedLanguagePosition);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass4OD r0 = this.this$0.A05;
            AnonymousClass1BI r4 = this.$it;
            String str = this.$languageFromIndex;
            C18070vi.A0h(r4, str);
            AnonymousClass1Nb r3 = r0.A02;
            C25550Cho A01 = C25550Cho.A02.A01(str);
            r3.A0K.get();
            C42551yM A012 = AnonymousClass1Nb.A01(r3, r4.getRawString());
            Object obj2 = A012.A0B;
            if (obj2 == null) {
                obj2 = C24100BvS.A00;
            }
            if (!A01.equals(obj2)) {
                A012.A0B = A01;
                AnonymousClass1Nb.A07(A012, r3);
            }
            AnonymousClass3U1 r42 = this.this$0;
            if (r42.A09 != null) {
                AnonymousClass3MW.A1X(r42.A0B, new TranscriptionChooseLanguageViewModel$scheduleTranscriptionIfNeeded$1(r42, (C30391dr) null), C41561wd.A00(r42));
            }
            this.this$0.A0D.setValue(new AnonymousClass46H(this.$languageFromIndex, this.$selectedLanguagePosition));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranscriptionChooseLanguageViewModel$handleLanguageSelection$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
