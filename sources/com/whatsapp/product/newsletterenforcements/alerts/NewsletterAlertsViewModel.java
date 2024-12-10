package com.whatsapp.product.newsletterenforcements.alerts;

import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass4NT;
import X.C18070vi;
import X.C18600wl;
import X.C29681ch;
import X.C86274Qz;
import X.C86444Rq;
import com.whatsapp.newsletterenforcements.client.NewsletterEnforcementsClient;

public final class NewsletterAlertsViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final C29681ch A01;
    public final C86444Rq A02;
    public final C18600wl A03;
    public final NewsletterEnforcementsClient A04;
    public final AnonymousClass4NT A05;
    public final C86274Qz A06;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061 A[LOOP:0: B:16:0x005b->B:18:0x0061, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel r10, X.C30391dr r11) {
        /*
            boolean r0 = r11 instanceof X.C100704uw
            if (r0 == 0) goto L_0x00d0
            r6 = r11
            X.4uw r6 = (X.C100704uw) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d0
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r9 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r3) goto L_0x003b
            if (r0 == r2) goto L_0x0082
            if (r0 != r9) goto L_0x00d7
            java.lang.Object r4 = r6.L$0
            X.C30691eM.A01(r1)
        L_0x0028:
            return r4
        L_0x0029:
            X.C30691eM.A01(r1)
            com.whatsapp.newsletterenforcements.client.NewsletterEnforcementsClient r1 = r10.A04
            X.1ch r0 = r10.A01
            r6.L$0 = r10
            r6.label = r3
            java.lang.Object r1 = r1.A09(r0, r6)
            if (r1 != r5) goto L_0x0042
            return r5
        L_0x003b:
            java.lang.Object r10 = r6.L$0
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel r10 = (com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel) r10
            X.C30691eM.A01(r1)
        L_0x0042:
            r4 = r1
            X.4VA r4 = (X.AnonymousClass4VA) r4
            X.4NT r8 = r10.A05
            X.1ch r7 = r10.A01
            X.0vl r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            X.4VA r0 = (X.AnonymousClass4VA) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r3 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x005b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r0 = r1.next()
            X.444 r0 = (X.AnonymousClass444) r0
            java.lang.String r0 = r0.A04
            r3.add(r0)
            goto L_0x005b
        L_0x006d:
            r6.L$0 = r10
            r6.L$1 = r4
            r6.label = r2
            X.0wl r2 = r8.A02
            r1 = 0
            com.whatsapp.newsletterenforcements.repository.NewsletterGeosuspensionRepo$setGeosuspensions$2 r0 = new com.whatsapp.newsletterenforcements.repository.NewsletterGeosuspensionRepo$setGeosuspensions$2
            r0.<init>(r7, r8, r3, r1)
            java.lang.Object r0 = X.C30451dy.A00(r6, r2, r0)
            if (r0 != r5) goto L_0x008d
            return r5
        L_0x0082:
            java.lang.Object r4 = r6.L$1
            X.4VA r4 = (X.AnonymousClass4VA) r4
            java.lang.Object r10 = r6.L$0
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel r10 = (com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel) r10
            X.C30691eM.A01(r1)
        L_0x008d:
            X.4Qz r7 = r10.A06
            X.1ch r8 = r10.A01
            X.0vl r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            X.4VA r0 = (X.AnonymousClass4VA) r0
            java.util.List r0 = r0.A02
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x00a3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r1.next()
            X.446 r0 = (X.AnonymousClass446) r0
            java.lang.String r0 = r0.A07
            java.lang.Long r0 = X.AnonymousClass1YD.A04(r0)
            if (r0 == 0) goto L_0x00a3
            r3.add(r0)
            goto L_0x00a3
        L_0x00bb:
            r6.L$0 = r4
            r2 = 0
            r6.L$1 = r2
            r6.label = r9
            X.0wl r1 = r7.A03
            com.whatsapp.newsletterenforcements.repository.NewsletterMessageEnforcementRepo$setMessageEnforcementIds$2 r0 = new com.whatsapp.newsletterenforcements.repository.NewsletterMessageEnforcementRepo$setMessageEnforcementIds$2
            r0.<init>(r8, r7, r3, r2)
            java.lang.Object r0 = X.C30451dy.A00(r6, r1, r0)
            if (r0 != r5) goto L_0x0028
            return r5
        L_0x00d0:
            X.4uw r6 = new X.4uw
            r6.<init>(r10, r11)
            goto L_0x0012
        L_0x00d7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel.A00(com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel, X.1dr):java.lang.Object");
    }

    public NewsletterAlertsViewModel(C29681ch r2, NewsletterEnforcementsClient newsletterEnforcementsClient, AnonymousClass4NT r4, C86274Qz r5, C86444Rq r6, C18600wl r7) {
        C18070vi.A0w(r6, r4, r5, newsletterEnforcementsClient, r7);
        C18070vi.A0d(r2, 6);
        this.A02 = r6;
        this.A05 = r4;
        this.A06 = r5;
        this.A04 = newsletterEnforcementsClient;
        this.A03 = r7;
        this.A01 = r2;
    }
}
