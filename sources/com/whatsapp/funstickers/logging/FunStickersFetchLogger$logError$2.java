package com.whatsapp.funstickers.logging;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C1184363l;
import X.C1184463m;
import X.C1404771o;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.os.SystemClock;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$logError$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$logError$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Integer $errorCode;
    public final /* synthetic */ int $errorType;
    public int label;
    public final /* synthetic */ C1404771o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$logError$2(C1404771o r2, Integer num, C30391dr r4, int i) {
        super(2, r4);
        this.this$0 = r2;
        this.$errorType = i;
        this.$errorCode = num;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new FunStickersFetchLogger$logError$2(this.this$0, this.$errorCode, r6, this.$errorType);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C1184363l r2 = new C1184363l();
            C1404771o r1 = this.this$0;
            C1404771o.A00(r2, r1);
            r2.A01 = AnonymousClass3MW.A0v(3);
            r2.A00 = AnonymousClass3MW.A0v(this.$errorType);
            Integer num = this.$errorCode;
            if (num != null) {
                r2.A07 = num.toString();
            }
            r1.A0B.CC7(r2);
            C1404771o r6 = this.this$0;
            Long l = r6.A06;
            if (l != null) {
                long longValue = l.longValue();
                C1184463m r3 = r6.A02;
                if (r3 != null) {
                    r3.A04 = new Long(SystemClock.elapsedRealtime() - longValue);
                }
            }
            C1184463m r12 = r6.A02;
            if (r12 != null) {
                r6.A0B.CC7(r12);
            }
            r6.A06 = null;
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FunStickersFetchLogger$logError$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
