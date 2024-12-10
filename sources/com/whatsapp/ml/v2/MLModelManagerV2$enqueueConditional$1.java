package com.whatsapp.ml.v2;

import X.AnonymousClass1OS;
import X.AnonymousClass8AS;
import X.C1407873b;
import X.C162248Jv;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.MLModelManagerV2$enqueueConditional$1", f = "MLModelManagerV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelManagerV2$enqueueConditional$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass8AS $mlQPLLogger;
    public final /* synthetic */ String $uniqueName;
    public final /* synthetic */ C162248Jv $workRequest;
    public int label;
    public final /* synthetic */ C1407873b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelManagerV2$enqueueConditional$1(C162248Jv r2, C1407873b r3, AnonymousClass8AS r4, String str, C30391dr r6) {
        super(2, r6);
        this.this$0 = r3;
        this.$uniqueName = str;
        this.$workRequest = r2;
        this.$mlQPLLogger = r4;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new MLModelManagerV2$enqueueConditional$1(this.$workRequest, this.this$0, this.$mlQPLLogger, this.$uniqueName, r8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            if (r0 != 0) goto L_0x008b
            X.C30691eM.A01(r6)
            X.73b r0 = r5.this$0
            X.0vl r0 = r0.A06
            java.lang.Object r1 = r0.getValue()
            X.A7W r1 = (X.A7W) r1
            java.lang.String r0 = r5.$uniqueName
            X.5oM r0 = r1.A04(r0)
            java.lang.Object r1 = r0.get()
            java.util.List r1 = (java.util.List) r1
            X.C18070vi.A0b(r1)
            boolean r0 = r1 instanceof java.util.Collection
            java.lang.String r4 = "work_policy"
            if (r0 == 0) goto L_0x0053
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0053
        L_0x002c:
            X.73b r0 = r5.this$0
            X.0vl r0 = r0.A06
            java.lang.Object r3 = r0.getValue()
            X.A7W r3 = (X.A7W) r3
            java.lang.String r2 = r5.$uniqueName
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            X.8Jv r0 = r5.$workRequest
            r3.A07(r0, r1, r2)
            X.8AS r1 = r5.$mlQPLLogger
            if (r1 == 0) goto L_0x0048
            java.lang.String r0 = "keep"
        L_0x0045:
            r1.Bir(r4, r0)
        L_0x0048:
            X.8AS r1 = r5.$mlQPLLogger
            if (r1 == 0) goto L_0x0050
            r0 = 2
            r1.Biu(r0)
        L_0x0050:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0053:
            java.util.Iterator r2 = r1.iterator()
        L_0x0057:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r2.next()
            X.9tt r0 = (X.C195779tt) r0
            java.lang.Integer r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x0071
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 == r0) goto L_0x0071
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            if (r1 != r0) goto L_0x0057
        L_0x0071:
            X.73b r0 = r5.this$0
            X.0vl r0 = r0.A06
            java.lang.Object r3 = r0.getValue()
            X.A7W r3 = (X.A7W) r3
            java.lang.String r2 = r5.$uniqueName
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            X.8Jv r0 = r5.$workRequest
            r3.A07(r0, r1, r2)
            X.8AS r1 = r5.$mlQPLLogger
            if (r1 == 0) goto L_0x0048
            java.lang.String r0 = "replace"
            goto L_0x0045
        L_0x008b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.v2.MLModelManagerV2$enqueueConditional$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelManagerV2$enqueueConditional$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
