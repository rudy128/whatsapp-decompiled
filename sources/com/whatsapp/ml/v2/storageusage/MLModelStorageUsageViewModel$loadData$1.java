package com.whatsapp.ml.v2.storageusage;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C122716Rq;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.storageusage.MLModelStorageUsageViewModel$loadData$1", f = "MLModelStorageUsageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelStorageUsageViewModel$loadData$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ MLModelStorageUsageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelStorageUsageViewModel$loadData$1(MLModelStorageUsageViewModel mLModelStorageUsageViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = mLModelStorageUsageViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MLModelStorageUsageViewModel$loadData$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MLModelStorageUsageViewModel$loadData$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ArrayList A13 = AnonymousClass000.A13();
            C122716Rq[] values = C122716Rq.values();
            MLModelStorageUsageViewModel mLModelStorageUsageViewModel = this.this$0;
            for (C122716Rq r3 : values) {
                try {
                    List BRe = mLModelStorageUsageViewModel.A03.A00(r3, false).BRe();
                    if (BRe != null) {
                        A13.addAll(BRe);
                    }
                } catch (Exception e) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("MLModelStorageUsageViewModel Exception while loading the Downloaded Models: ");
                    Log.e(AnonymousClass000.A0y(r3.name(), A10), e);
                }
            }
            this.this$0.A00.A0E(A13);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
