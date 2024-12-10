package com.whatsapp.funstickers.data.pdf;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C138276wo;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C39741tZ;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.data.pdf.GenAiPrivacyLauncher$downloadDisclosure$2", f = "GenAiPrivacyLauncher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GenAiPrivacyLauncher$downloadDisclosure$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $noticeId;
    public int label;
    public final /* synthetic */ C138276wo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GenAiPrivacyLauncher$downloadDisclosure$2(C138276wo r2, C30391dr r3, int i) {
        super(2, r3);
        this.this$0 = r2;
        this.$noticeId = i;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new GenAiPrivacyLauncher$downloadDisclosure$2(this.this$0, r5, this.$noticeId);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            try {
                return this.this$0.A01.A01(this.$noticeId);
            } catch (C39741tZ e) {
                Log.i("GenAiPrivacyLauncher/downloadDisclosure failed to download disclosure", e);
                return null;
            }
        } else {
            throw AnonymousClass000.A0l();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GenAiPrivacyLauncher$downloadDisclosure$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
