package com.whatsapp.funstickers.data.pdf;

import X.AnonymousClass000;
import X.AnonymousClass1FU;
import X.AnonymousClass1OS;
import X.C122586Qy;
import X.C138276wo;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.data.pdf.GenAiPrivacyLauncher$attemptDownloadDisclosure$1", f = "GenAiPrivacyLauncher.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
public final class GenAiPrivacyLauncher$attemptDownloadDisclosure$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $callback;
    public final /* synthetic */ AnonymousClass1FU $dialogActivity;
    public final /* synthetic */ int $noticeId;
    public int label;
    public final /* synthetic */ C138276wo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GenAiPrivacyLauncher$attemptDownloadDisclosure$1(AnonymousClass1FU r2, C138276wo r3, C30391dr r4, C22821Di r5, int i) {
        super(2, r4);
        this.$dialogActivity = r2;
        this.this$0 = r3;
        this.$noticeId = i;
        this.$callback = r5;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new GenAiPrivacyLauncher$attemptDownloadDisclosure$1(this.$dialogActivity, this.this$0, r8, this.$callback, this.$noticeId);
    }

    public final Object invokeSuspend(Object obj) {
        C22821Di r1;
        C122586Qy r0;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.$dialogActivity.CNA(2131891797);
            C138276wo r4 = this.this$0;
            int i2 = this.$noticeId;
            this.label = 1;
            obj = C30451dy.A00(this, r4.A02, new GenAiPrivacyLauncher$downloadDisclosure$2(r4, (C30391dr) null, i2));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        String str = (String) obj;
        this.$dialogActivity.CEx();
        if (str == null || str.length() == 0) {
            Log.i("GenAiPrivacyLauncher/isAccepted error downloading disclosure");
            r1 = this.$callback;
            r0 = C122586Qy.ERROR;
        } else {
            Log.i("GenAiPrivacyLauncher/isAccepted disclosure state downloaded");
            r1 = this.$callback;
            r0 = C122586Qy.DOWNLOADED;
        }
        r1.invoke(r0);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GenAiPrivacyLauncher$attemptDownloadDisclosure$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
