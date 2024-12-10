package com.whatsapp.ml.v2;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OS;
import X.AnonymousClass708;
import X.AnonymousClass8AS;
import X.AnonymousClass8Ak;
import X.C122716Rq;
import X.C138026wP;
import X.C1407873b;
import X.C192939pH;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.ml.v2.repo.MLModelRepository;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.MLModelManagerV2$enqueueSilentDownloadIfRequired$1", f = "MLModelManagerV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelManagerV2$enqueueSilentDownloadIfRequired$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122716Rq $mlModelType;
    public int label;
    public final /* synthetic */ C1407873b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelManagerV2$enqueueSilentDownloadIfRequired$1(C1407873b r2, C122716Rq r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$mlModelType = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MLModelManagerV2$enqueueSilentDownloadIfRequired$1(this.this$0, this.$mlModelType, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C1407873b r0 = this.this$0;
            AnonymousClass8Ak A00 = r0.A01.A00(this.$mlModelType, true);
            this.this$0.A03.get();
            String A002 = MLModelUtilV2.A00(A00.BV1());
            AnonymousClass8AS A01 = C1407873b.A01(this.this$0, this.$mlModelType, A00, A002, true);
            AnonymousClass00H r3 = this.this$0.A02;
            if (!((MLModelRepository) r3.get()).A06((AnonymousClass708) C29431cG.A0b(A00.BMy())) && A00.BMy().size() != 1) {
                Iterator it = A00.BMy().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((MLModelRepository) r3.get()).A06((AnonymousClass708) it.next())) {
                        C192939pH r32 = new C192939pH();
                        r32.A02(A00.BV1().A00().A00);
                        r32.A00.put("SILENT_MODEL_UPDATE_KEY", true);
                        C1407873b.A02(C138026wP.A00(r32.A00(), A00), this.this$0, A01, A002);
                        break;
                    }
                }
                return C27621Wu.A00;
            }
            A01.Biu(4);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelManagerV2$enqueueSilentDownloadIfRequired$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
