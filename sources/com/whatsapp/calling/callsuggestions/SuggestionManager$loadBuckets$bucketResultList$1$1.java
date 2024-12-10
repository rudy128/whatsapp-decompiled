package com.whatsapp.calling.callsuggestions;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C190989lq;
import X.C22496BAd;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callsuggestions.SuggestionManager$loadBuckets$bucketResultList$1$1", f = "SuggestionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SuggestionManager$loadBuckets$bucketResultList$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22496BAd $it;
    public int label;
    public final /* synthetic */ C190989lq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionManager$loadBuckets$bucketResultList$1$1(C190989lq r2, C22496BAd bAd, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$it = bAd;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new SuggestionManager$loadBuckets$bucketResultList$1$1(this.this$0, this.$it, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            int intValue = this.this$0.A00.A06.intValue();
            C22496BAd bAd = this.$it;
            if (intValue != 1) {
                return bAd.Bhg();
            }
            return bAd.Bhh();
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SuggestionManager$loadBuckets$bucketResultList$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
