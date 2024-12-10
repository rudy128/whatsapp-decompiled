package com.whatsapp.calling.psa.viewmodel;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel$fetchSuggestions$1", f = "GroupCallPsaViewModel.kt", i = {1}, l = {37, 39}, m = "invokeSuspend", n = {"suggestions"}, s = {"L$0"})
public final class GroupCallPsaViewModel$fetchSuggestions$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ GroupCallPsaViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupCallPsaViewModel$fetchSuggestions$1(GroupCallPsaViewModel groupCallPsaViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = groupCallPsaViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new GroupCallPsaViewModel$fetchSuggestions$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GroupCallPsaViewModel$fetchSuggestions$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r7 == r4) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 == r1) goto L_0x004e
            if (r0 != r3) goto L_0x0084
            java.lang.Object r0 = r6.L$0
            java.util.List r0 = (java.util.List) r0
            X.C30691eM.A01(r7)
        L_0x0013:
            com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel r5 = r6.this$0
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x001d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0074
            X.1E7 r2 = X.C17880vN.A0O(r3)
            X.1Me r0 = r5.A01
            java.lang.String r1 = r0.A0I(r2)
            if (r1 == 0) goto L_0x001d
            X.4TB r0 = new X.4TB
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x001d
        L_0x0038:
            X.C30691eM.A01(r7)
            com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel r0 = r6.this$0
            X.4Ou r2 = r0.A00
            r6.label = r1
            r1 = 0
            com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2 r0 = new com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2
            r0.<init>(r2, r1)
            java.lang.Object r7 = X.AnonymousClass1OW.A00(r6, r0)
            if (r7 != r4) goto L_0x0051
        L_0x004d:
            return r4
        L_0x004e:
            X.C30691eM.A01(r7)
        L_0x0051:
            java.util.List r7 = (java.util.List) r7
            com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel r0 = r6.this$0
            X.5bm r1 = r0.A02
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x006e
            X.Bq4 r0 = new X.Bq4
            r0.<init>()
        L_0x0062:
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r0 = r1.CHH(r0, r6)
            if (r0 == r4) goto L_0x004d
            r0 = r7
            goto L_0x0013
        L_0x006e:
            X.Bq3 r0 = new X.Bq3
            r0.<init>()
            goto L_0x0062
        L_0x0074:
            X.1G4 r2 = r5.A04
            r1 = 2131890904(0x7f1212d8, float:1.9416513E38)
            X.4Y7 r0 = new X.4Y7
            r0.<init>(r1, r4)
            r2.setValue(r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0084:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel$fetchSuggestions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
