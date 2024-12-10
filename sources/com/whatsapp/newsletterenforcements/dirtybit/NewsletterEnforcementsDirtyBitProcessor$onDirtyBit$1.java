package com.whatsapp.newsletterenforcements.dirtybit;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C85744Oo;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.dirtybit.NewsletterEnforcementsDirtyBitProcessor$onDirtyBit$1", f = "NewsletterEnforcementsDirtyBitProcessor.kt", i = {0, 1, 1, 2}, l = {41, 45, 51}, m = "invokeSuspend", n = {"newsletterJid", "newsletterJid", "enforcements", "newsletterJid"}, s = {"L$1", "L$1", "L$2", "L$1"})
public final class NewsletterEnforcementsDirtyBitProcessor$onDirtyBit$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ C85744Oo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterEnforcementsDirtyBitProcessor$onDirtyBit$1(C85744Oo r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new NewsletterEnforcementsDirtyBitProcessor$onDirtyBit$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterEnforcementsDirtyBitProcessor$onDirtyBit$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ad A[Catch:{ 4tL -> 0x011c }, LOOP:0: B:30:0x00a7->B:32:0x00ad, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce A[Catch:{ 4tL -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f1 A[Catch:{ 4tL -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0118 A[Catch:{ 4tL -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r7 = 0
            r6 = 3
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 == r4) goto L_0x0032
            if (r0 == r5) goto L_0x001f
            if (r0 != r6) goto L_0x001a
            java.lang.Object r9 = r12.L$1
            java.lang.Object r3 = r12.L$0
            java.util.Iterator r3 = (java.util.Iterator) r3
            X.C30691eM.A01(r13)     // Catch:{ 4tL -> 0x0054 }
            goto L_0x0062
        L_0x001a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001f:
            java.lang.Object r2 = r12.L$2
            X.4VA r2 = (X.AnonymousClass4VA) r2
            java.lang.Object r9 = r12.L$1
            X.1ch r9 = (X.C29681ch) r9
            java.lang.Object r3 = r12.L$0
            java.util.Iterator r3 = (java.util.Iterator) r3
            X.C30691eM.A01(r13)     // Catch:{ 4tL -> 0x0030 }
            goto L_0x00cf
        L_0x0030:
            r2 = move-exception
            goto L_0x0055
        L_0x0032:
            java.lang.Object r9 = r12.L$1
            X.1ch r9 = (X.C29681ch) r9
            java.lang.Object r3 = r12.L$0
            java.util.Iterator r3 = (java.util.Iterator) r3
            X.C30691eM.A01(r13)     // Catch:{ 4tL -> 0x0054 }
            goto L_0x0088
        L_0x003e:
            X.C30691eM.A01(r13)
            X.4Oo r0 = r12.this$0
            X.00H r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.1i5 r0 = (X.C32991i5) r0
            java.util.List r0 = r0.A05()
            java.util.Iterator r3 = r0.iterator()
            goto L_0x0062
        L_0x0054:
            r2 = move-exception
        L_0x0055:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Something went wrong refreshing enforcements for "
            java.lang.String r0 = X.AnonymousClass001.A1E(r9, r0, r1)
            com.whatsapp.util.Log.w(r0, r2)
        L_0x0062:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0125
            java.lang.Object r9 = r3.next()
            X.1ch r9 = (X.C29681ch) r9
            X.4Oo r0 = r12.this$0     // Catch:{ 4tL -> 0x011f }
            X.00H r0 = r0.A00     // Catch:{ 4tL -> 0x011f }
            java.lang.Object r0 = r0.get()     // Catch:{ 4tL -> 0x011f }
            com.whatsapp.newsletterenforcements.client.NewsletterEnforcementsClient r0 = (com.whatsapp.newsletterenforcements.client.NewsletterEnforcementsClient) r0     // Catch:{ 4tL -> 0x011f }
            r12.L$0 = r3     // Catch:{ 4tL -> 0x011f }
            r12.L$1 = r9     // Catch:{ 4tL -> 0x011f }
            r12.L$2 = r7     // Catch:{ 4tL -> 0x011f }
            r12.label = r4     // Catch:{ 4tL -> 0x011f }
            java.lang.Object r13 = r0.A09(r9, r12)     // Catch:{ 4tL -> 0x011f }
            if (r13 != r8) goto L_0x0088
            goto L_0x0122
        L_0x0088:
            r2 = r13
            X.4VA r2 = (X.AnonymousClass4VA) r2     // Catch:{ 4tL -> 0x011c }
            X.4Oo r0 = r12.this$0     // Catch:{ 4tL -> 0x011c }
            X.00H r0 = r0.A01     // Catch:{ 4tL -> 0x011c }
            java.lang.Object r11 = r0.get()     // Catch:{ 4tL -> 0x011c }
            X.4NT r11 = (X.AnonymousClass4NT) r11     // Catch:{ 4tL -> 0x011c }
            X.0vl r0 = r2.A05     // Catch:{ 4tL -> 0x011c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ 4tL -> 0x011c }
            X.4VA r0 = (X.AnonymousClass4VA) r0     // Catch:{ 4tL -> 0x011c }
            java.util.List r0 = r0.A01     // Catch:{ 4tL -> 0x011c }
            java.util.ArrayList r10 = X.C29351c6.A0D(r0)     // Catch:{ 4tL -> 0x011c }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ 4tL -> 0x011c }
        L_0x00a7:
            boolean r0 = r1.hasNext()     // Catch:{ 4tL -> 0x011c }
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r1.next()     // Catch:{ 4tL -> 0x011c }
            X.444 r0 = (X.AnonymousClass444) r0     // Catch:{ 4tL -> 0x011c }
            java.lang.String r0 = r0.A04     // Catch:{ 4tL -> 0x011c }
            r10.add(r0)     // Catch:{ 4tL -> 0x011c }
            goto L_0x00a7
        L_0x00b9:
            r12.L$0 = r3     // Catch:{ 4tL -> 0x011c }
            r12.L$1 = r9     // Catch:{ 4tL -> 0x011c }
            r12.L$2 = r2     // Catch:{ 4tL -> 0x011c }
            r12.label = r5     // Catch:{ 4tL -> 0x011c }
            X.0wl r1 = r11.A02     // Catch:{ 4tL -> 0x011c }
            com.whatsapp.newsletterenforcements.repository.NewsletterGeosuspensionRepo$setGeosuspensions$2 r0 = new com.whatsapp.newsletterenforcements.repository.NewsletterGeosuspensionRepo$setGeosuspensions$2     // Catch:{ 4tL -> 0x011c }
            r0.<init>(r9, r11, r10, r7)     // Catch:{ 4tL -> 0x011c }
            java.lang.Object r0 = X.C30451dy.A00(r12, r1, r0)     // Catch:{ 4tL -> 0x011c }
            if (r0 != r8) goto L_0x00cf
            goto L_0x0123
        L_0x00cf:
            X.4Oo r0 = r12.this$0     // Catch:{ 4tL -> 0x0119 }
            X.00H r0 = r0.A02     // Catch:{ 4tL -> 0x0119 }
            java.lang.Object r10 = r0.get()     // Catch:{ 4tL -> 0x0119 }
            X.4Qz r10 = (X.C86274Qz) r10     // Catch:{ 4tL -> 0x0119 }
            X.0vl r0 = r2.A05     // Catch:{ 4tL -> 0x0119 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ 4tL -> 0x0119 }
            X.4VA r0 = (X.AnonymousClass4VA) r0     // Catch:{ 4tL -> 0x0119 }
            java.util.List r0 = r0.A02     // Catch:{ 4tL -> 0x0119 }
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ 4tL -> 0x0119 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ 4tL -> 0x0119 }
        L_0x00eb:
            boolean r0 = r1.hasNext()     // Catch:{ 4tL -> 0x0119 }
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r1.next()     // Catch:{ 4tL -> 0x0119 }
            X.446 r0 = (X.AnonymousClass446) r0     // Catch:{ 4tL -> 0x0119 }
            java.lang.String r0 = r0.A07     // Catch:{ 4tL -> 0x0119 }
            java.lang.Long r0 = X.AnonymousClass1YD.A04(r0)     // Catch:{ 4tL -> 0x0119 }
            if (r0 == 0) goto L_0x00eb
            r2.add(r0)     // Catch:{ 4tL -> 0x0119 }
            goto L_0x00eb
        L_0x0103:
            r12.L$0 = r3     // Catch:{ 4tL -> 0x0119 }
            r12.L$1 = r9     // Catch:{ 4tL -> 0x0119 }
            r12.L$2 = r7     // Catch:{ 4tL -> 0x0119 }
            r12.label = r6     // Catch:{ 4tL -> 0x0119 }
            X.0wl r1 = r10.A03     // Catch:{ 4tL -> 0x0119 }
            com.whatsapp.newsletterenforcements.repository.NewsletterMessageEnforcementRepo$setMessageEnforcementIds$2 r0 = new com.whatsapp.newsletterenforcements.repository.NewsletterMessageEnforcementRepo$setMessageEnforcementIds$2     // Catch:{ 4tL -> 0x0119 }
            r0.<init>(r9, r10, r2, r7)     // Catch:{ 4tL -> 0x0119 }
            java.lang.Object r0 = X.C30451dy.A00(r12, r1, r0)     // Catch:{ 4tL -> 0x0119 }
            if (r0 != r8) goto L_0x0062
            goto L_0x0124
        L_0x0119:
            r2 = move-exception
            goto L_0x0055
        L_0x011c:
            r2 = move-exception
            goto L_0x0055
        L_0x011f:
            r2 = move-exception
            goto L_0x0055
        L_0x0122:
            return r8
        L_0x0123:
            return r8
        L_0x0124:
            return r8
        L_0x0125:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletterenforcements.dirtybit.NewsletterEnforcementsDirtyBitProcessor$onDirtyBit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
