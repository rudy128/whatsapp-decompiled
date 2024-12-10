package com.whatsapp.ptt.language.ui;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3U1;
import X.AnonymousClass46D;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageActivity$enqueueModelDownloadIntent$1", f = "TranscriptionChooseLanguageActivity.kt", i = {}, l = {229}, m = "invokeSuspend", n = {}, s = {})
public final class TranscriptionChooseLanguageActivity$enqueueModelDownloadIntent$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isWifi;
    public final /* synthetic */ int $position;
    public Object L$0;
    public int label;
    public final /* synthetic */ TranscriptionChooseLanguageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionChooseLanguageActivity$enqueueModelDownloadIntent$1(TranscriptionChooseLanguageActivity transcriptionChooseLanguageActivity, C30391dr r3, int i, boolean z) {
        super(2, r3);
        this.$isWifi = z;
        this.$position = i;
        this.this$0 = transcriptionChooseLanguageActivity;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        boolean z = this.$isWifi;
        return new TranscriptionChooseLanguageActivity$enqueueModelDownloadIntent$1(this.this$0, r6, this.$position, z);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass46D r1 = new AnonymousClass46D(this.$isWifi, this.$position);
            this.L$0 = r1;
            this.label = 1;
            if (((AnonymousClass3U1) this.this$0.A09.getValue()).A0C.BJt(r1, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranscriptionChooseLanguageActivity$enqueueModelDownloadIntent$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
