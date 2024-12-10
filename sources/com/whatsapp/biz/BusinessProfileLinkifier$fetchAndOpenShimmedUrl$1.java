package com.whatsapp.biz;

import X.AnonymousClass10D;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.C18600wl;
import X.C26031Qo;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.BusinessProfileLinkifier$fetchAndOpenShimmedUrl$1", f = "BusinessProfileLinkifier.kt", i = {1}, l = {274, 285, 296}, m = "invokeSuspend", n = {"shimUrl"}, s = {"L$0"})
public final class BusinessProfileLinkifier$fetchAndOpenShimmedUrl$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1L9 $activityUtils;
    public final /* synthetic */ String $bizJid;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C26031Qo $crashLogsWrapper;
    public final /* synthetic */ AnonymousClass10D $entryPoint;
    public final /* synthetic */ AnonymousClass1OB $loadingJob;
    public final /* synthetic */ C18600wl $mainDispatcher;
    public final /* synthetic */ String $uriString;
    public final /* synthetic */ AnonymousClass1LU $waIntents;
    public Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessProfileLinkifier$fetchAndOpenShimmedUrl$1(Context context, AnonymousClass1L9 r3, AnonymousClass10D r4, C26031Qo r5, AnonymousClass1LU r6, String str, String str2, C30391dr r9, C18600wl r10, AnonymousClass1OB r11) {
        super(2, r9);
        this.$mainDispatcher = r10;
        this.$bizJid = str;
        this.$entryPoint = r4;
        this.$loadingJob = r11;
        this.$uriString = str2;
        this.$context = context;
        this.$activityUtils = r3;
        this.$waIntents = r6;
        this.$crashLogsWrapper = r5;
    }

    public final C30391dr create(Object obj, C30391dr r13) {
        C18600wl r9 = this.$mainDispatcher;
        String str = this.$bizJid;
        AnonymousClass10D r3 = this.$entryPoint;
        AnonymousClass1OB r10 = this.$loadingJob;
        String str2 = this.$uriString;
        return new BusinessProfileLinkifier$fetchAndOpenShimmedUrl$1(this.$context, this.$activityUtils, r3, this.$crashLogsWrapper, this.$waIntents, str, str2, r13, r9, r10);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1g4 r0 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r13.label
            r2 = 3
            r6 = 2
            r4 = 1
            r10 = 0
            if (r1 == 0) goto L_0x0025
            if (r1 == r4) goto L_0x0020
            if (r1 == r6) goto L_0x001a
            if (r1 != r2) goto L_0x0015
            X.C30691eM.A01(r14)     // Catch:{ 1Uc -> 0x0162 }
            goto L_0x018b
        L_0x0015:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001a:
            java.lang.Object r11 = r13.L$0
            X.4rF r11 = (X.C98494rF) r11
            goto L_0x00c2
        L_0x0020:
            X.C30691eM.A01(r14)
            goto L_0x018b
        L_0x0025:
            X.C30691eM.A01(r14)
            X.4rF r11 = X.C98494rF.A00()
            java.lang.Object r9 = X.AnonymousClass4ZB.A01
            X.10D r3 = r13.$entryPoint
            java.lang.String r8 = r13.$bizJid
            java.lang.String r7 = r13.$uriString
            monitor-enter(r9)
            X.1Mz r1 = X.AnonymousClass4ZB.A00     // Catch:{ all -> 0x018e }
            if (r1 != 0) goto L_0x0051
            X.10E r3 = (X.AnonymousClass10E) r3     // Catch:{ all -> 0x018e }
            X.10E r1 = r3.Ao8     // Catch:{ all -> 0x018e }
            X.10G r1 = r1.A00     // Catch:{ all -> 0x018e }
            X.00S r1 = r1.A1k     // Catch:{ all -> 0x018e }
            java.lang.Object r5 = r1.get()     // Catch:{ all -> 0x018e }
            X.1Mv r5 = (X.C25091Mv) r5     // Catch:{ all -> 0x018e }
            java.lang.String r3 = "jidShimUrlCache"
            r1 = 10
            X.1Mz r1 = r5.BH3(r3, r1)     // Catch:{ all -> 0x018e }
            X.AnonymousClass4ZB.A00 = r1     // Catch:{ all -> 0x018e }
        L_0x0051:
            java.lang.Object r1 = r1.A0A(r8)     // Catch:{ all -> 0x018e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x018e }
            if (r1 == 0) goto L_0x0060
            java.lang.String r1 = X.C17880vN.A0s(r7, r1)     // Catch:{ all -> 0x018e }
        L_0x005d:
            r11.element = r1     // Catch:{ all -> 0x018e }
            goto L_0x0062
        L_0x0060:
            r1 = r10
            goto L_0x005d
        L_0x0062:
            monitor-exit(r9)
            java.lang.Object r1 = r11.element
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0089
            boolean r1 = X.AnonymousClass1YF.A0T(r1)
            r1 = r1 ^ 1
            if (r1 != r4) goto L_0x0089
            X.0wl r1 = r13.$mainDispatcher
            X.1OB r12 = r13.$loadingJob
            X.1L9 r8 = r13.$activityUtils
            android.content.Context r7 = r13.$context
            X.1LU r9 = r13.$waIntents
            com.whatsapp.biz.BusinessProfileLinkifier$fetchAndOpenShimmedUrl$1$2 r6 = new com.whatsapp.biz.BusinessProfileLinkifier$fetchAndOpenShimmedUrl$1$2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.label = r4
            java.lang.Object r1 = X.C30451dy.A00(r13, r1, r6)
        L_0x0086:
            if (r1 != r0) goto L_0x018b
            return r0
        L_0x0089:
            X.A7K r7 = new X.A7K
            r7.<init>()
            java.lang.String r3 = r13.$bizJid
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            java.lang.String r1 = "bizJid"
            r7.A07(r1, r3)
            java.lang.Class<com.whatsapp.infra.graphql.generated.bizprofile.GetBusinessProfileWebsiteShimUrlQueryResponseImpl> r5 = com.whatsapp.infra.graphql.generated.bizprofile.GetBusinessProfileWebsiteShimUrlQueryResponseImpl.class
            java.lang.String r1 = "GetBusinessProfileWebsiteShimUrlQuery"
            X.AIj r3 = new X.AIj
            r3.<init>(r7, r5, r1)
            X.4rF r11 = X.C98494rF.A00()
            X.10D r1 = r13.$entryPoint     // Catch:{ 1Uc -> 0x0162 }
            X.10E r1 = (X.AnonymousClass10E) r1     // Catch:{ 1Uc -> 0x0162 }
            X.1PY r1 = X.AnonymousClass3Ma.A0l(r1)     // Catch:{ 1Uc -> 0x0162 }
            X.A2g r3 = r1.A01(r3)     // Catch:{ 1Uc -> 0x0162 }
            r3.A01 = r4     // Catch:{ 1Uc -> 0x0162 }
            r13.L$0 = r11     // Catch:{ 1Uc -> 0x0162 }
            r13.label = r6     // Catch:{ 1Uc -> 0x0162 }
            X.B33 r1 = X.B33.A00     // Catch:{ 1Uc -> 0x0162 }
            java.lang.Object r14 = r3.A01(r13, r1)     // Catch:{ 1Uc -> 0x0162 }
            if (r14 != r0) goto L_0x00c5
            goto L_0x015e
        L_0x00c2:
            X.C30691eM.A01(r14)     // Catch:{ 1Uc -> 0x0162 }
        L_0x00c5:
            java.lang.Object r9 = X.AnonymousClass4ZB.A01     // Catch:{ 1Uc -> 0x0162 }
            java.lang.String r7 = r13.$bizJid     // Catch:{ 1Uc -> 0x0162 }
            java.lang.String r6 = r13.$uriString     // Catch:{ 1Uc -> 0x0162 }
            monitor-enter(r9)     // Catch:{ 1Uc -> 0x0162 }
            X.1Mz r1 = X.AnonymousClass4ZB.A00     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x00d8
            java.lang.Object r1 = r1.A0A(r7)     // Catch:{ all -> 0x015f }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x015f }
            if (r1 != 0) goto L_0x00e3
        L_0x00d8:
            X.1Mz r3 = X.AnonymousClass4ZB.A00     // Catch:{ all -> 0x015f }
            if (r3 == 0) goto L_0x00e3
            java.util.LinkedHashMap r1 = X.C17880vN.A13()     // Catch:{ all -> 0x015f }
            r3.A0F(r7, r1)     // Catch:{ all -> 0x015f }
        L_0x00e3:
            com.whatsapp.infra.graphql.generated.bizprofile.GetBusinessProfileWebsiteShimUrlQueryResponseImpl r14 = (com.whatsapp.infra.graphql.generated.bizprofile.GetBusinessProfileWebsiteShimUrlQueryResponseImpl) r14     // Catch:{ all -> 0x015f }
            java.lang.String r3 = "xwa_whatsapp_smb_get_profile_linkshims"
            java.lang.Class<com.whatsapp.infra.graphql.generated.bizprofile.GetBusinessProfileWebsiteShimUrlQueryResponseImpl$XwaWhatsappSmbGetProfileLinkshims> r1 = com.whatsapp.infra.graphql.generated.bizprofile.GetBusinessProfileWebsiteShimUrlQueryResponseImpl.XwaWhatsappSmbGetProfileLinkshims.class
            X.1IX r1 = r14.A0A(r1, r3)     // Catch:{ all -> 0x015f }
            X.C199610h.A04(r1)     // Catch:{ all -> 0x015f }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x015f }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x015f }
        L_0x00f7:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x012b
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x015f }
            com.whatsapp.infra.graphql.generated.bizprofile.GetBusinessProfileWebsiteShimUrlQueryResponseImpl$XwaWhatsappSmbGetProfileLinkshims r1 = (com.whatsapp.infra.graphql.generated.bizprofile.GetBusinessProfileWebsiteShimUrlQueryResponseImpl.XwaWhatsappSmbGetProfileLinkshims) r1     // Catch:{ all -> 0x015f }
            org.json.JSONObject r1 = r1.A00     // Catch:{ all -> 0x015f }
            X.C18070vi.A0W(r1)     // Catch:{ all -> 0x015f }
            com.whatsapp.infra.graphql.generated.bizprofile.GetBusinessProfileWebsiteShimUrlQueryResponseImpl$XwaWhatsappSmbGetProfileLinkshims$InlineXWAWhatsAppSMBProfileWebsiteInfo r5 = new com.whatsapp.infra.graphql.generated.bizprofile.GetBusinessProfileWebsiteShimUrlQueryResponseImpl$XwaWhatsappSmbGetProfileLinkshims$InlineXWAWhatsAppSMBProfileWebsiteInfo     // Catch:{ all -> 0x015f }
            r5.<init>(r1)     // Catch:{ all -> 0x015f }
            java.lang.String r1 = "website"
            java.lang.String r4 = r5.A0F(r1)     // Catch:{ all -> 0x015f }
            if (r4 == 0) goto L_0x00f7
            X.1Mz r1 = X.AnonymousClass4ZB.A00     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x00f7
            java.lang.Object r3 = r1.A0A(r7)     // Catch:{ all -> 0x015f }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x015f }
            if (r3 == 0) goto L_0x00f7
            java.lang.String r1 = "shimmed_website_url"
            java.lang.String r1 = r5.A0F(r1)     // Catch:{ all -> 0x015f }
            r3.put(r4, r1)     // Catch:{ all -> 0x015f }
            goto L_0x00f7
        L_0x012b:
            X.1Mz r1 = X.AnonymousClass4ZB.A00     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x013e
            java.lang.Object r1 = r1.A0A(r7)     // Catch:{ all -> 0x015f }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x013e
            java.lang.String r1 = X.C17880vN.A0s(r6, r1)     // Catch:{ all -> 0x015f }
        L_0x013b:
            r11.element = r1     // Catch:{ all -> 0x015f }
            goto L_0x0140
        L_0x013e:
            r1 = r10
            goto L_0x013b
        L_0x0140:
            monitor-exit(r9)     // Catch:{ 1Uc -> 0x0162 }
            X.0wl r1 = r13.$mainDispatcher     // Catch:{ 1Uc -> 0x0162 }
            X.1OB r12 = r13.$loadingJob     // Catch:{ 1Uc -> 0x0162 }
            X.1L9 r6 = r13.$activityUtils     // Catch:{ 1Uc -> 0x0162 }
            android.content.Context r5 = r13.$context     // Catch:{ 1Uc -> 0x0162 }
            X.1LU r8 = r13.$waIntents     // Catch:{ 1Uc -> 0x0162 }
            java.lang.String r9 = r13.$uriString     // Catch:{ 1Uc -> 0x0162 }
            X.1Qo r7 = r13.$crashLogsWrapper     // Catch:{ 1Uc -> 0x0162 }
            com.whatsapp.biz.BusinessProfileLinkifier$fetchAndOpenShimmedUrl$1$4 r4 = new com.whatsapp.biz.BusinessProfileLinkifier$fetchAndOpenShimmedUrl$1$4     // Catch:{ 1Uc -> 0x0162 }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ 1Uc -> 0x0162 }
            r13.L$0 = r10     // Catch:{ 1Uc -> 0x0162 }
            r13.label = r2     // Catch:{ 1Uc -> 0x0162 }
            java.lang.Object r1 = X.C30451dy.A00(r13, r1, r4)     // Catch:{ 1Uc -> 0x0162 }
            goto L_0x0086
        L_0x015e:
            return r0
        L_0x015f:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ 1Uc -> 0x0162 }
            throw r0     // Catch:{ 1Uc -> 0x0162 }
        L_0x0162:
            r1 = move-exception
            X.1OB r0 = r13.$loadingJob
            r0.BEM(r10)
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
            java.lang.String r5 = r13.$uriString
            android.content.Context r4 = r13.$context
            X.1L9 r3 = r13.$activityUtils
            X.1Qo r2 = r13.$crashLogsWrapper
            java.lang.String r1 = r1.toString()
            X.3xC r0 = X.C80453xC.A00
            r2.A00(r0, r1)
            java.lang.String r0 = X.C87364Vh.A01(r5)
            android.net.Uri r0 = X.C87364Vh.A00(r0)
            android.content.Intent r0 = X.AnonymousClass1LU.A1p(r0)
            r3.A08(r4, r0)
        L_0x018b:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x018e:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.BusinessProfileLinkifier$fetchAndOpenShimmedUrl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BusinessProfileLinkifier$fetchAndOpenShimmedUrl$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
