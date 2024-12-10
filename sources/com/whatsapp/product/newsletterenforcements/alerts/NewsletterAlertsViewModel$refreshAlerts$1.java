package com.whatsapp.product.newsletterenforcements.alerts;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$refreshAlerts$1", f = "NewsletterAlertsViewModel.kt", i = {}, l = {46, 51}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAlertsViewModel$refreshAlerts$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ NewsletterAlertsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAlertsViewModel$refreshAlerts$1(NewsletterAlertsViewModel newsletterAlertsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = newsletterAlertsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new NewsletterAlertsViewModel$refreshAlerts$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterAlertsViewModel$refreshAlerts$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }, LOOP:0: B:17:0x0056->B:19:0x005c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073 A[Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090 A[Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9 A[Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }, LOOP:1: B:31:0x00a3->B:33:0x00a9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb A[Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ce A[Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }, LOOP:2: B:37:0x00c8->B:39:0x00ce, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fb A[Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }, LOOP:3: B:41:0x00f5->B:43:0x00fb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011e A[Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }, LOOP:4: B:45:0x0118->B:47:0x011e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0142 A[Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0161 A[Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r8.label
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r0) goto L_0x0028
            if (r1 != r4) goto L_0x000d
            goto L_0x003f
        L_0x000d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0012:
            X.C30691eM.A01(r9)
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel r3 = r8.this$0
            r8.label = r0
            X.0wl r2 = r3.A03
            r1 = 0
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$hideChannelAlertsBanner$2 r0 = new com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$hideChannelAlertsBanner$2
            r0.<init>(r3, r1)
            java.lang.Object r0 = X.C30451dy.A00(r8, r2, r0)
            if (r0 != r5) goto L_0x002b
            return r5
        L_0x0028:
            X.C30691eM.A01(r9)
        L_0x002b:
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel r0 = r8.this$0
            X.1DT r1 = r0.A00
            X.4p2 r0 = X.C97174p2.A00
            r1.A0E(r0)
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel r0 = r8.this$0     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r8.label = r4     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.lang.Object r9 = com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel.A00(r0, r8)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            if (r9 != r5) goto L_0x0042
            return r5
        L_0x003f:
            X.C30691eM.A01(r9)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
        L_0x0042:
            X.4VA r9 = (X.AnonymousClass4VA) r9     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.0vl r0 = r9.A05     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.lang.Object r3 = r0.getValue()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.4VA r3 = (X.AnonymousClass4VA) r3     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.List r0 = r3.A04     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.ArrayList r7 = X.C29351c6.A0E(r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
        L_0x0056:
            boolean r0 = r2.hasNext()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            if (r0 == 0) goto L_0x006b
            java.lang.Object r1 = r2.next()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.443 r1 = (X.AnonymousClass443) r1     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.453 r0 = new X.453     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r0.<init>(r1)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r7.add(r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            goto L_0x0056
        L_0x006b:
            java.util.List r1 = r3.A00     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            boolean r0 = X.AnonymousClass000.A1a(r1)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            if (r0 == 0) goto L_0x00bb
            X.450 r0 = new X.450     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r0.<init>(r1)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.List r6 = X.C18070vi.A0M(r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
        L_0x007c:
            boolean r0 = r7.isEmpty()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r6.isEmpty()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            if (r0 == 0) goto L_0x00b8
            java.util.List r1 = r3.A02     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            boolean r0 = X.AnonymousClass000.A1a(r1)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            if (r0 == 0) goto L_0x00b8
            X.452 r0 = new X.452     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r0.<init>(r1)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.List r5 = X.C18070vi.A0M(r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
        L_0x0099:
            java.util.List r0 = r3.A03     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.ArrayList r4 = X.C29351c6.A0E(r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
        L_0x00a3:
            boolean r0 = r2.hasNext()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            if (r0 == 0) goto L_0x00be
            java.lang.Object r1 = r2.next()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.442 r1 = (X.AnonymousClass442) r1     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.44z r0 = new X.44z     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r0.<init>(r1)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r4.add(r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            goto L_0x00a3
        L_0x00b8:
            X.0wS r5 = X.C18460wS.A00     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            goto L_0x0099
        L_0x00bb:
            X.0wS r6 = X.C18460wS.A00     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            goto L_0x007c
        L_0x00be:
            java.util.List r0 = r3.A01     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.ArrayList r3 = X.C29351c6.A0E(r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
        L_0x00c8:
            boolean r0 = r2.hasNext()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r1 = r2.next()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.444 r1 = (X.AnonymousClass444) r1     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.451 r0 = new X.451     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r0.<init>(r1)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r3.add(r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            goto L_0x00c8
        L_0x00dd:
            java.util.ArrayList r0 = X.C29431cG.A0k(r6, r7)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.ArrayList r0 = X.C29431cG.A0k(r5, r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.ArrayList r0 = X.C29431cG.A0k(r4, r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.ArrayList r0 = X.C29431cG.A0k(r3, r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.ArrayList r4 = X.C29351c6.A0E(r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
        L_0x00f5:
            boolean r0 = r2.hasNext()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            if (r0 == 0) goto L_0x010a
            java.lang.Object r1 = r2.next()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.4Et r1 = (X.C83344Et) r1     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.454 r0 = new X.454     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r0.<init>(r1)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r4.add(r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            goto L_0x00f5
        L_0x010a:
            X.0vl r0 = r9.A06     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.List r0 = X.AnonymousClass3MW.A11(r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.ArrayList r3 = X.C29351c6.A0E(r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
        L_0x0118:
            boolean r0 = r2.hasNext()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            if (r0 == 0) goto L_0x012d
            java.lang.Object r1 = r2.next()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.4cY r1 = (X.C89494cY) r1     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.456 r0 = new X.456     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r0.<init>(r1)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r3.add(r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            goto L_0x0118
        L_0x012d:
            r0 = 13
            java.util.List r3 = X.C98924rw.A00(r3, r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel r0 = r8.this$0     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.1DT r2 = r0.A00     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            int r1 = r4.size()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            int r0 = r3.size()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            int r1 = r1 + r0
            if (r1 <= 0) goto L_0x0161
            java.util.ArrayList r1 = X.C29431cG.A0k(r3, r4)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.4oz r0 = new X.4oz     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r0.<init>(r1)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
        L_0x014b:
            r2.A0E(r0)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel r1 = r8.this$0     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.4Rq r0 = r1.A02     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.1ch r2 = r1.A01     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r1 = 0
            X.00H r0 = r0.A01     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            java.lang.Object r0 = r0.get()     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            X.1i5 r0 = (X.C32991i5) r0     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            r0.A08(r2, r1)     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            goto L_0x0174
        L_0x0161:
            X.4p0 r0 = X.C97154p0.A00     // Catch:{ 441 -> 0x016b, 4tL -> 0x0164 }
            goto L_0x014b
        L_0x0164:
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel r0 = r8.this$0
            X.1DT r1 = r0.A00
            X.4p1 r0 = X.C97164p1.A00
            goto L_0x0171
        L_0x016b:
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel r0 = r8.this$0
            X.1DT r1 = r0.A00
            X.4p3 r0 = X.C97184p3.A00
        L_0x0171:
            r1.A0E(r0)
        L_0x0174:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$refreshAlerts$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
