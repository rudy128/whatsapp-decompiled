package com.whatsapp.wds.metrics.logging.network;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass2JI;
import X.AnonymousClass3BU;
import X.C129476hr;
import X.C139036y6;
import X.C162178Jk;
import X.C17880vN;
import X.C23761Hn;
import X.C25113CYi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.wds.metrics.logging.network.HierarchyUploader$startWork$1$1$1", f = "HierarchyUploader.kt", i = {0}, l = {49}, m = "invokeSuspend", n = {"logFiles"}, s = {"L$0"})
public final class HierarchyUploader$startWork$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C25113CYi $completer;
    public Object L$0;
    public int label;
    public final /* synthetic */ C129476hr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HierarchyUploader$startWork$1$1$1(C25113CYi cYi, C129476hr r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$completer = cYi;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new HierarchyUploader$startWork$1$1$1(this.$completer, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C25113CYi cYi;
        Object obj2;
        File[] fileArr;
        File[] fileArr2;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            File A0e = C17880vN.A0e(((C139036y6) this.this$0.A01.get()).A00.getCacheDir(), "wds_metrics2");
            if (!A0e.exists() || (fileArr2 = A0e.listFiles(new AnonymousClass3BU(2))) == null) {
                fileArr2 = new File[0];
            }
            long currentTimeMillis = System.currentTimeMillis() - C139036y6.A03;
            for (File file : fileArr2) {
                if (file.lastModified() < currentTimeMillis) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
            fileArr = ((C139036y6) this.this$0.A01.get()).A00();
            if (fileArr.length != 0) {
                this.L$0 = fileArr;
                this.label = 1;
                if (((AnonymousClass2JI) this.this$0.A02.get()).CBx(this, C23761Hn.A01) == r2) {
                    return r2;
                }
            }
            cYi = this.$completer;
            obj2 = new C162178Jk();
            cYi.A00(obj2);
            return C27621Wu.A00;
        } else if (i == 1) {
            fileArr = (File[]) this.L$0;
            try {
                C30691eM.A01(obj);
            } catch (Exception | OutOfMemoryError unused2) {
                cYi = this.$completer;
                obj2 = new Object();
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        for (File file2 : fileArr) {
            this.this$0.A01.get();
            if (file2 != null) {
                try {
                    file2.delete();
                } catch (Exception unused3) {
                }
            }
        }
        cYi = this.$completer;
        obj2 = new C162178Jk();
        cYi.A00(obj2);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((HierarchyUploader$startWork$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
