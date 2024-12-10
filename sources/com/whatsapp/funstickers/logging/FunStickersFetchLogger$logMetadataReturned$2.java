package com.whatsapp.funstickers.logging;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C1184363l;
import X.C1184463m;
import X.C1404771o;
import X.C18020vd;
import X.C18040vf;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.os.SystemClock;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMetadataReturned$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$logMetadataReturned$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $numberOfAnimatedOptions;
    public final /* synthetic */ long $numberOfOptions;
    public int label;
    public final /* synthetic */ C1404771o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$logMetadataReturned$2(C1404771o r2, C30391dr r3, long j, long j2) {
        super(2, r3);
        this.this$0 = r2;
        this.$numberOfOptions = j;
        this.$numberOfAnimatedOptions = j2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new FunStickersFetchLogger$logMetadataReturned$2(this.this$0, r9, this.$numberOfOptions, this.$numberOfAnimatedOptions);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C1184363l r6 = new C1184363l();
            C1404771o r3 = this.this$0;
            C1404771o.A00(r6, r3);
            r6.A01 = AnonymousClass3MW.A0v(5);
            long j = this.$numberOfOptions;
            r6.A04 = new Long(j);
            r3.A01 = j;
            r3.A00 = 0;
            if (C18020vd.A05(C18040vf.A02, r3.A0A, 7186)) {
                long j2 = this.$numberOfAnimatedOptions;
                r6.A03 = new Long(j2);
                C1184463m r1 = this.this$0.A02;
                if (r1 != null) {
                    r1.A00 = Boolean.valueOf(AnonymousClass000.A1R((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1))));
                }
            }
            this.this$0.A0B.CC7(r6);
            C1404771o r62 = this.this$0;
            Long l = r62.A06;
            if (l != null) {
                long longValue = l.longValue();
                C1184463m r32 = r62.A02;
                if (r32 != null) {
                    r32.A04 = new Long(SystemClock.elapsedRealtime() - longValue);
                }
            }
            r62.A06 = new Long(SystemClock.elapsedRealtime());
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FunStickersFetchLogger$logMetadataReturned$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
