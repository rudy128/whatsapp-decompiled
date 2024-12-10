package com.whatsapp.bot.home;

import X.AnonymousClass00H;
import X.AnonymousClass1G4;
import X.C18070vi;
import X.C18600wl;
import X.C34071js;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeLayoutQueryResponseImpl;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeSectionQueryResponseImpl;

public final class AiHomeFetchService {
    public AiHomeLayoutQueryResponseImpl.XfbFetchGenaiPersonaDiscoveryPaginatedLayout.UnionSectionsQuery.PageInfo A00;
    public AiHomeSectionQueryResponseImpl.XfbFetchGenaiPersonasBySection.PageInfo A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass1G4 A04 = C34071js.A00((Object) null);
    public final AnonymousClass1G4 A05 = C34071js.A00((Object) null);
    public final C18600wl A06;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1 A[SYNTHETIC, Splitter:B:28:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass5WY r10, com.whatsapp.bot.home.AiHomeFetchService r11, X.C30391dr r12, X.C22821Di r13, X.AnonymousClass1G2 r14, boolean r15) {
        /*
            boolean r0 = r12 instanceof X.AnonymousClass7V6
            if (r0 == 0) goto L_0x002f
            r3 = r12
            X.7V6 r3 = (X.AnonymousClass7V6) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002f
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r9 = r3.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r5 = 5
            r7 = 4
            r8 = 3
            r1 = 1
            r6 = 2
            r4 = 0
            if (r0 == 0) goto L_0x004b
            if (r0 == r1) goto L_0x0066
            if (r0 == r6) goto L_0x00e8
            if (r0 == r8) goto L_0x0040
            if (r0 == r7) goto L_0x0035
            if (r0 == r5) goto L_0x00e8
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002f:
            X.7V6 r3 = new X.7V6
            r3.<init>(r11, r12)
            goto L_0x0012
        L_0x0035:
            boolean r15 = r3.Z$0
            java.lang.Object r14 = r3.L$0
            X.1G2 r14 = (X.AnonymousClass1G2) r14
            X.C30691eM.A01(r9)     // Catch:{ 1Uc -> 0x00d0 }
            goto L_0x00eb
        L_0x0040:
            boolean r15 = r3.Z$0
            java.lang.Object r13 = r3.L$1
            X.1Di r13 = (X.C22821Di) r13
            java.lang.Object r14 = r3.L$0
            X.1G2 r14 = (X.AnonymousClass1G2) r14
            goto L_0x00bb
        L_0x004b:
            X.C30691eM.A01(r9)
            X.7Cz r0 = new X.7Cz
            r0.<init>(r15, r4)
            r3.L$0 = r11
            r3.L$1 = r10
            r3.L$2 = r14
            r3.L$3 = r13
            r3.Z$0 = r15
            r3.label = r1
            java.lang.Object r0 = r14.BJt(r0, r3)
            if (r0 != r2) goto L_0x007b
            return r2
        L_0x0066:
            boolean r15 = r3.Z$0
            java.lang.Object r13 = r3.L$3
            X.1Di r13 = (X.C22821Di) r13
            java.lang.Object r14 = r3.L$2
            X.1G2 r14 = (X.AnonymousClass1G2) r14
            java.lang.Object r10 = r3.L$1
            X.5WY r10 = (X.AnonymousClass5WY) r10
            java.lang.Object r11 = r3.L$0
            com.whatsapp.bot.home.AiHomeFetchService r11 = (com.whatsapp.bot.home.AiHomeFetchService) r11
            X.C30691eM.A01(r9)
        L_0x007b:
            X.00H r0 = r11.A03
            java.lang.Object r0 = r0.get()
            X.1PY r0 = (X.AnonymousClass1PY) r0
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x00a1
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            X.7D1 r0 = new X.7D1
            r0.<init>(r1, r4, r15)
            r3.L$0 = r4
            r3.L$1 = r4
            r3.L$2 = r4
            r3.L$3 = r4
            r3.label = r6
            java.lang.Object r0 = r14.BJt(r0, r3)
        L_0x009e:
            if (r0 != r2) goto L_0x00eb
            return r2
        L_0x00a1:
            X.0wl r1 = r11.A06     // Catch:{ 1Uc -> 0x00d0 }
            com.whatsapp.bot.home.AiHomeFetchService$requestData$response$1 r0 = new com.whatsapp.bot.home.AiHomeFetchService$requestData$response$1     // Catch:{ 1Uc -> 0x00d0 }
            r0.<init>(r10, r11, r4)     // Catch:{ 1Uc -> 0x00d0 }
            r3.L$0 = r14     // Catch:{ 1Uc -> 0x00d0 }
            r3.L$1 = r13     // Catch:{ 1Uc -> 0x00d0 }
            r3.L$2 = r4     // Catch:{ 1Uc -> 0x00d0 }
            r3.L$3 = r4     // Catch:{ 1Uc -> 0x00d0 }
            r3.Z$0 = r15     // Catch:{ 1Uc -> 0x00d0 }
            r3.label = r8     // Catch:{ 1Uc -> 0x00d0 }
            java.lang.Object r9 = X.C30451dy.A00(r3, r1, r0)     // Catch:{ 1Uc -> 0x00d0 }
            if (r9 != r2) goto L_0x00be
            goto L_0x00cf
        L_0x00bb:
            X.C30691eM.A01(r9)     // Catch:{ 1Uc -> 0x00d0 }
        L_0x00be:
            java.lang.Object r0 = r13.invoke(r9)     // Catch:{ 1Uc -> 0x00d0 }
            r3.L$0 = r14     // Catch:{ 1Uc -> 0x00d0 }
            r3.L$1 = r4     // Catch:{ 1Uc -> 0x00d0 }
            r3.Z$0 = r15     // Catch:{ 1Uc -> 0x00d0 }
            r3.label = r7     // Catch:{ 1Uc -> 0x00d0 }
            java.lang.Object r0 = r14.BJt(r0, r3)     // Catch:{ 1Uc -> 0x00d0 }
            goto L_0x009e
        L_0x00cf:
            return r2
        L_0x00d0:
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            X.7D1 r0 = new X.7D1
            r0.<init>(r1, r4, r15)
            r3.L$0 = r4
            r3.L$1 = r4
            r3.L$2 = r4
            r3.L$3 = r4
            r3.label = r5
            java.lang.Object r0 = r14.BJt(r0, r3)
            if (r0 != r2) goto L_0x00eb
            return r2
        L_0x00e8:
            X.C30691eM.A01(r9)
        L_0x00eb:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.home.AiHomeFetchService.A00(X.5WY, com.whatsapp.bot.home.AiHomeFetchService, X.1dr, X.1Di, X.1G2, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C30391dr r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.AnonymousClass7TF
            r8 = r13
            if (r0 == 0) goto L_0x00be
            r9 = r14
            X.7TF r9 = (X.AnonymousClass7TF) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00be
            int r2 = r2 - r1
            r9.label = r2
        L_0x0013:
            java.lang.Object r1 = r9.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r3 = 1
            if (r0 == 0) goto L_0x0024
            if (r0 != r3) goto L_0x00c5
            X.C30691eM.A01(r1)
        L_0x0021:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0024:
            X.C30691eM.A01(r1)
            X.1G4 r11 = r13.A04
            java.lang.Object r0 = r11.getValue()
            boolean r0 = r0 instanceof X.C143337Cz
            r5 = 0
            if (r0 != 0) goto L_0x003e
            com.whatsapp.infra.graphql.generated.aihome.AiHomeLayoutQueryResponseImpl$XfbFetchGenaiPersonaDiscoveryPaginatedLayout$UnionSectionsQuery$PageInfo r1 = r13.A00
            if (r1 == 0) goto L_0x004b
            java.lang.String r0 = "has_next_page"
            boolean r0 = r1.A0G(r0)
            if (r0 != 0) goto L_0x004b
        L_0x003e:
            r11.getValue()
            com.whatsapp.infra.graphql.generated.aihome.AiHomeLayoutQueryResponseImpl$XfbFetchGenaiPersonaDiscoveryPaginatedLayout$UnionSectionsQuery$PageInfo r1 = r13.A00
            if (r1 == 0) goto L_0x0021
            java.lang.String r0 = "has_next_page"
            r1.A0G(r0)
            goto L_0x0021
        L_0x004b:
            X.A7K r4 = new X.A7K
            r4.<init>()
            X.00H r7 = r13.A02
            X.1UD r0 = X.AnonymousClass3MW.A0X(r7)
            X.0ve r1 = r0.A00
            X.0vf r6 = X.C18040vf.A01
            r0 = 10446(0x28ce, float:1.4638E-41)
            int r0 = X.C18020vd.A00(r6, r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "layout_page_size"
            r4.A05(r1, r0)
            X.1UD r0 = X.AnonymousClass3MW.A0X(r7)
            X.0ve r1 = r0.A00
            r0 = 10447(0x28cf, float:1.464E-41)
            int r0 = X.C18020vd.A00(r6, r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "section_page_size"
            r4.A05(r1, r0)
            X.1UD r0 = X.AnonymousClass3MW.A0X(r7)
            X.0ve r1 = r0.A00
            r0 = 10568(0x2948, float:1.4809E-41)
            java.lang.String r1 = X.C18020vd.A01(r6, r1, r0)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "product"
            r4.A07(r0, r1)
            com.whatsapp.infra.graphql.generated.aihome.AiHomeLayoutQueryResponseImpl$XfbFetchGenaiPersonaDiscoveryPaginatedLayout$UnionSectionsQuery$PageInfo r1 = r13.A00
            if (r1 == 0) goto L_0x009c
            java.lang.String r0 = "end_cursor"
            java.lang.String r5 = r1.A0F(r0)
        L_0x009c:
            java.lang.String r0 = "after"
            r4.A07(r0, r5)
            java.lang.Class<com.whatsapp.infra.graphql.generated.aihome.AiHomeLayoutQueryResponseImpl> r1 = com.whatsapp.infra.graphql.generated.aihome.AiHomeLayoutQueryResponseImpl.class
            java.lang.String r0 = "AiHomeLayoutQuery"
            X.AIj r7 = new X.AIj
            r7.<init>(r4, r1, r0)
            com.whatsapp.infra.graphql.generated.aihome.AiHomeLayoutQueryResponseImpl$XfbFetchGenaiPersonaDiscoveryPaginatedLayout$UnionSectionsQuery$PageInfo r0 = r13.A00
            boolean r12 = X.AnonymousClass000.A1X(r0)
            X.826 r10 = new X.826
            r10.<init>(r13, r12)
            r9.label = r3
            java.lang.Object r0 = A00(r7, r8, r9, r10, r11, r12)
            if (r0 != r2) goto L_0x0021
            return r2
        L_0x00be:
            X.7TF r9 = new X.7TF
            r9.<init>(r13, r14)
            goto L_0x0013
        L_0x00c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.home.AiHomeFetchService.A01(X.1dr):java.lang.Object");
    }

    public AiHomeFetchService(AnonymousClass00H r3, AnonymousClass00H r4, C18600wl r5) {
        C18070vi.A0o(r3, r4, r5);
        this.A03 = r3;
        this.A02 = r4;
        this.A06 = r5;
    }
}
