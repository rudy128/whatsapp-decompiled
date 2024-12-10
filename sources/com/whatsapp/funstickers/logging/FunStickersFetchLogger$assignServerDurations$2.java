package com.whatsapp.funstickers.logging;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C1184463m;
import X.C1404771o;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$assignServerDurations$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$assignServerDurations$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Long $llmDuration;
    public final /* synthetic */ Long $stickerGenDuration;
    public int label;
    public final /* synthetic */ C1404771o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$assignServerDurations$2(C1404771o r2, Long l, Long l2, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$llmDuration = l;
        this.$stickerGenDuration = l2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new FunStickersFetchLogger$assignServerDurations$2(this.this$0, this.$llmDuration, this.$stickerGenDuration, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C1184463m r2 = this.this$0.A02;
            if (r2 == null) {
                return null;
            }
            Long l = this.$llmDuration;
            Long l2 = this.$stickerGenDuration;
            r2.A05 = l;
            r2.A06 = l2;
            return r2;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FunStickersFetchLogger$assignServerDurations$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
