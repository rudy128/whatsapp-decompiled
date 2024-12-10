package com.whatsapp.ml.v2.actions;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.AnonymousClass3MY;
import X.C122716Rq;
import X.C124056Ww;
import X.C1407873b;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.content.Intent;
import com.whatsapp.ml.v2.MLModelManagerV2$cancelDownloadInternal$2;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.actions.MLModelDownloadCancelReceiver$onReceive$1", f = "MLModelDownloadCancelReceiver.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelDownloadCancelReceiver$onReceive$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Intent $intent;
    public int label;
    public final /* synthetic */ MLModelDownloadCancelReceiver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelDownloadCancelReceiver$onReceive$1(Intent intent, MLModelDownloadCancelReceiver mLModelDownloadCancelReceiver, C30391dr r4) {
        super(2, r4);
        this.this$0 = mLModelDownloadCancelReceiver;
        this.$intent = intent;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MLModelDownloadCancelReceiver$onReceive$1(this.$intent, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C122716Rq A00;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            String stringExtra = this.$intent.getStringExtra("ML_MODEL_WORKER_MODEL_FEATURE_NAME");
            if (!(stringExtra == null || (A00 = C124056Ww.A00(stringExtra)) == null)) {
                Intent intent = this.$intent;
                MLModelDownloadCancelReceiver mLModelDownloadCancelReceiver = this.this$0;
                boolean A1a = AnonymousClass3MY.A1a(intent, "SILENT_MODEL_UPDATE_KEY");
                AnonymousClass00H r0 = mLModelDownloadCancelReceiver.A00;
                if (r0 != null) {
                    C1407873b r2 = (C1407873b) r0.get();
                    this.label = 1;
                    if (C30451dy.A00(this, r2.A07, new MLModelManagerV2$cancelDownloadInternal$2(r2, A00, (C30391dr) null, A1a)) == r6) {
                        return r6;
                    }
                } else {
                    C18070vi.A11("modelManager");
                    throw null;
                }
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (Throwable th) {
                AnonymousClass1OX r02 = this.this$0.A01;
                if (r02 != null) {
                    AnonymousClass1OW.A04((CancellationException) null, r02);
                }
                this.this$0.A01 = null;
                throw th;
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass1OX r03 = this.this$0.A01;
        if (r03 != null) {
            AnonymousClass1OW.A04((CancellationException) null, r03);
        }
        this.this$0.A01 = null;
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelDownloadCancelReceiver$onReceive$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
