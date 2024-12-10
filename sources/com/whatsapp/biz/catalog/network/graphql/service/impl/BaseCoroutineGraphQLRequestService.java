package com.whatsapp.biz.catalog.network.graphql.service.impl;

import X.A0W;
import X.AnonymousClass9M3;
import X.C138476x9;
import X.C168428iq;
import X.C168438ir;
import X.C168448is;
import X.C168458it;
import X.C168478iv;
import X.C18070vi;
import X.C199279zj;
import com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper;
import com.whatsapp.jid.UserJid;

public abstract class BaseCoroutineGraphQLRequestService {
    public final int A00;
    public final A0W A01;
    public final C199279zj A02;
    public final C138476x9 A03;
    public final CoroutineDirectConnectionHelper A04;

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.9Ma] */
    public final void A04(AnonymousClass9M3 r10, int i) {
        int i2;
        UserJid userJid;
        C18070vi.A0d(r10, 0);
        if (r10 instanceof C168478iv) {
            C138476x9 r4 = this.A03;
            if (this instanceof DCVerifyPostcodeGraphQLService) {
                userJid = ((DCVerifyPostcodeGraphQLService) this).A02.A00;
            } else {
                userJid = ((CoroutineGetSingleCollectionGraphQLService) this).A02.A04;
            }
            int i3 = this.A00;
            C138476x9.A00(userJid, r4, i3, 1, -1);
            C199279zj.A00(userJid, new Object(), this.A02, i3, 0);
            return;
        }
        if (r10 instanceof C168458it) {
            i2 = ((C168458it) r10).A01.A01;
        } else if (r10 instanceof C168448is) {
            A03(0);
            return;
        } else if (r10 instanceof C168428iq) {
            A03(i);
            return;
        } else if (r10 instanceof C168438ir) {
            i2 = 422;
        } else {
            return;
        }
        A03(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService r5, X.AnonymousClass8AB r6, X.C30391dr r7) {
        /*
            boolean r0 = r7 instanceof X.C21641AnW
            if (r0 == 0) goto L_0x0069
            r4 = r7
            X.AnW r4 = (X.C21641AnW) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0069
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L_0x0059
            if (r1 != r0) goto L_0x00ad
            java.lang.Object r5 = r4.L$0
            com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService r5 = (com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService) r5
            X.C30691eM.A01(r3)
        L_0x0024:
            X.6TR r3 = (X.AnonymousClass6TR) r3
            boolean r0 = r3 instanceof X.AnonymousClass67F
            if (r0 == 0) goto L_0x0085
            X.67F r3 = (X.AnonymousClass67F) r3
            X.6xC r1 = r3.A00
            int r0 = r1.A00
            if (r0 == 0) goto L_0x006f
            X.163 r0 = r1.A04
            X.C18070vi.A0X(r0)
            java.util.Map r0 = r0.A00
            if (r0 == 0) goto L_0x008e
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r3 = X.C29431cG.A0Y(r0)
            X.71m r3 = (X.C1404571m) r3
            if (r3 == 0) goto L_0x008e
            org.json.JSONObject r2 = r1.A05
            X.A0W r1 = r5.A01
            int r0 = r3.A01
            int r0 = r1.A00(r0)
            X.8it r1 = new X.8it
            r1.<init>(r3, r2, r0)
            return r1
        L_0x0059:
            X.C30691eM.A01(r3)
            r4.L$0 = r5
            r4.label = r0
            X.1Ho r0 = X.C23761Hn.A01
            java.lang.Object r3 = r6.CBy(r4, r0)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x0069:
            X.AnW r4 = new X.AnW
            r4.<init>(r5, r7)
            goto L_0x0012
        L_0x006f:
            X.161 r0 = r1.A03
            X.C18070vi.A0X(r0)
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x007e
            X.8iv r1 = new X.8iv
            r1.<init>(r0)
            return r1
        L_0x007e:
            java.lang.String r0 = "No GraphQL Response available"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            goto L_0x0094
        L_0x0085:
            boolean r0 = r3 instanceof X.AnonymousClass67E
            if (r0 == 0) goto L_0x009a
            X.67E r3 = (X.AnonymousClass67E) r3
            java.lang.Exception r0 = r3.A00
            goto L_0x0094
        L_0x008e:
            java.lang.String r0 = "Error response received but no errors found"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
        L_0x0094:
            X.8is r1 = new X.8is
            r1.<init>(r0)
            return r1
        L_0x009a:
            boolean r0 = r3 instanceof X.AnonymousClass67D
            if (r0 == 0) goto L_0x00a8
            X.67D r3 = (X.AnonymousClass67D) r3
            java.io.IOException r0 = r3.A00
            X.8iq r1 = new X.8iq
            r1.<init>(r0)
            return r1
        L_0x00a8:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00ad:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService.A00(com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService, X.8AB, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(X.C30391dr r11) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService
            if (r0 == 0) goto L_0x00f9
            r4 = r10
            com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService r4 = (com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService) r4
            boolean r0 = r11 instanceof X.C21679Ao8
            if (r0 == 0) goto L_0x0091
            r7 = r11
            X.Ao8 r7 = (X.C21679Ao8) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0091
            int r2 = r2 - r1
            r7.label = r2
        L_0x0019:
            java.lang.Object r3 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r9 = 1
            r8 = 2
            r5 = 0
            if (r0 == 0) goto L_0x0041
            if (r0 == r9) goto L_0x0064
            if (r0 != r8) goto L_0x00e5
            java.lang.Object r4 = r7.L$0
            com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService r4 = (com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService) r4
            X.C30691eM.A01(r3)
        L_0x002f:
            X.9M3 r3 = (X.AnonymousClass9M3) r3
            boolean r0 = r3 instanceof X.C168478iv
            if (r0 == 0) goto L_0x0097
            X.9qC r1 = r4.A02
            X.8iv r3 = (X.C168478iv) r3
            java.lang.Object r0 = r3.A00
            X.8ip r6 = new X.8ip
            r6.<init>(r1, r0)
            return r6
        L_0x0041:
            X.C30691eM.A01(r3)
            X.9qC r1 = r4.A02
            X.4S5 r0 = r4.A05
            com.whatsapp.jid.UserJid r3 = r1.A00
            com.whatsapp.jid.UserJid r0 = r0.A00(r3)
            java.lang.String r1 = r1.A01
            X.9qC r2 = new X.9qC
            r2.<init>(r0, r1)
            com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper r0 = r4.A03
            r7.L$0 = r4
            r7.L$1 = r2
            r7.label = r9
            java.lang.Object r3 = r0.A00(r3, r1, r7)
            if (r3 != r6) goto L_0x006f
            return r6
        L_0x0064:
            java.lang.Object r2 = r7.L$1
            X.9qC r2 = (X.C193499qC) r2
            java.lang.Object r4 = r7.L$0
            com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService r4 = (com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService) r4
            X.C30691eM.A01(r3)
        L_0x006f:
            boolean r0 = X.AnonymousClass000.A1Y(r3)
            if (r0 == 0) goto L_0x00ea
            X.1Ty r1 = r4.A00
            com.whatsapp.jid.UserJid r0 = r2.A00
            java.lang.String r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x00ea
            com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService$sendOnWorker$finalOutcome$1 r0 = new com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService$sendOnWorker$finalOutcome$1
            r0.<init>(r2, r4, r5)
            r7.L$0 = r4
            r7.L$1 = r5
            r7.label = r8
            java.lang.Object r3 = r4.A02(r7, r0)
            if (r3 != r6) goto L_0x002f
            return r6
        L_0x0091:
            X.Ao8 r7 = new X.Ao8
            r7.<init>(r4, r11)
            goto L_0x0019
        L_0x0097:
            boolean r0 = r3 instanceof X.C168468iu
            if (r0 == 0) goto L_0x00e0
            X.8iu r3 = (X.C168468iu) r3
            X.A2z r0 = r4.A01
            r0.A03()
            boolean r0 = r3 instanceof X.C168448is
            if (r0 == 0) goto L_0x00c2
            r0 = r3
            X.8is r0 = (X.C168448is) r0
            java.lang.Exception r1 = r0.A00
            boolean r0 = r1 instanceof X.AnonymousClass9Le
            if (r0 == 0) goto L_0x00b9
            X.9qC r2 = r4.A02
            r1 = 1001(0x3e9, float:1.403E-42)
        L_0x00b3:
            X.8io r6 = new X.8io
            r6.<init>(r2, r1)
            return r6
        L_0x00b9:
            boolean r0 = r1 instanceof X.C180089Lb
            if (r0 == 0) goto L_0x00c2
            X.9qC r2 = r4.A02
            r1 = 1002(0x3ea, float:1.404E-42)
            goto L_0x00b3
        L_0x00c2:
            boolean r0 = r3 instanceof X.C168458it
            if (r0 == 0) goto L_0x00cd
            X.9qC r2 = r4.A02
            X.8it r3 = (X.C168458it) r3
            int r1 = r3.A00
            goto L_0x00b3
        L_0x00cd:
            boolean r0 = r3 instanceof X.C168428iq
            if (r0 == 0) goto L_0x00d6
            X.9qC r2 = r4.A02
            r1 = 440(0x1b8, float:6.17E-43)
            goto L_0x00b3
        L_0x00d6:
            boolean r0 = r3 instanceof X.C168438ir
            X.9qC r2 = r4.A02
            r1 = 0
            if (r0 == 0) goto L_0x00b3
            r1 = 422(0x1a6, float:5.91E-43)
            goto L_0x00b3
        L_0x00e0:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00e5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00ea:
            X.A2z r0 = r4.A01
            r0.A03()
            X.9qC r1 = r4.A02
            r0 = 422(0x1a6, float:5.91E-43)
            X.8io r6 = new X.8io
            r6.<init>(r1, r0)
            return r6
        L_0x00f9:
            r2 = r10
            com.whatsapp.biz.catalog.network.graphql.service.impl.CoroutineGetSingleCollectionGraphQLService r2 = (com.whatsapp.biz.catalog.network.graphql.service.impl.CoroutineGetSingleCollectionGraphQLService) r2
            boolean r0 = r11 instanceof X.C21642AnX
            if (r0 == 0) goto L_0x015c
            r6 = r11
            X.AnX r6 = (X.C21642AnX) r6
            int r3 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x015c
            int r3 = r3 - r1
            r6.label = r3
        L_0x010e:
            java.lang.Object r5 = r6.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L_0x0140
            if (r0 != r3) goto L_0x018d
            java.lang.Object r2 = r6.L$0
            com.whatsapp.biz.catalog.network.graphql.service.impl.CoroutineGetSingleCollectionGraphQLService r2 = (com.whatsapp.biz.catalog.network.graphql.service.impl.CoroutineGetSingleCollectionGraphQLService) r2
            X.C30691eM.A01(r5)
        L_0x0120:
            X.9M3 r5 = (X.AnonymousClass9M3) r5
            boolean r0 = r5 instanceof X.C168478iv
            if (r0 == 0) goto L_0x0162
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetSingleCollectionGraphQLServiceV2/send/Success jid="
            r3.append(r0)
            X.9tk r1 = r2.A02
            com.whatsapp.jid.UserJid r0 = r1.A04
            X.C17900vP.A0b(r0, r3)
            X.8iv r5 = (X.C168478iv) r5
            java.lang.Object r0 = r5.A00
            X.8ip r4 = new X.8ip
            r4.<init>(r1, r0)
            return r4
        L_0x0140:
            X.C30691eM.A01(r5)
            X.11E r0 = r2.A03
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x019b
            r1 = 0
            com.whatsapp.biz.catalog.network.graphql.service.impl.CoroutineGetSingleCollectionGraphQLService$sendOnWorker$result$1 r0 = new com.whatsapp.biz.catalog.network.graphql.service.impl.CoroutineGetSingleCollectionGraphQLService$sendOnWorker$result$1
            r0.<init>(r2, r1)
            r6.L$0 = r2
            r6.label = r3
            java.lang.Object r5 = r2.A02(r6, r0)
            if (r5 != r4) goto L_0x0120
            return r4
        L_0x015c:
            X.AnX r6 = new X.AnX
            r6.<init>(r2, r11)
            goto L_0x010e
        L_0x0162:
            boolean r0 = r5 instanceof X.C168438ir
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = "GetSingleCollectionGraphQLServiceV2/send/DirectConnectionFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.9tk r1 = r2.A02
            r0 = 422(0x1a6, float:5.91E-43)
            goto L_0x019e
        L_0x0170:
            boolean r0 = r5 instanceof X.C168458it
            if (r0 == 0) goto L_0x0180
            java.lang.String r0 = "GetSingleCollectionGraphQLServiceV2/send/ErrorResponse"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.9tk r1 = r2.A02
            X.8it r5 = (X.C168458it) r5
            int r0 = r5.A00
            goto L_0x019e
        L_0x0180:
            boolean r0 = r5 instanceof X.C168448is
            if (r0 == 0) goto L_0x0192
            java.lang.String r0 = "GetSingleCollectionGraphQLServiceV2/sendRequest/Error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.9tk r1 = r2.A02
            r0 = 0
            goto L_0x019e
        L_0x018d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0192:
            boolean r0 = r5 instanceof X.C168428iq
            if (r0 == 0) goto L_0x01a4
            java.lang.String r0 = "GetSingleCollectionGraphQLServiceV2/send/DeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x019b:
            X.9tk r1 = r2.A02
            r0 = -1
        L_0x019e:
            X.8io r4 = new X.8io
            r4.<init>(r1, r0)
            return r4
        L_0x01a4:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService.A01(X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088 A[PHI: r2 
      PHI: (r2v1 java.lang.Object) = (r2v2 java.lang.Object), (r2v0 java.lang.Object) binds: [B:23:0x0082, B:25:0x0085] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C30391dr r9, X.C36001nB r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C21678Ao7
            if (r0 == 0) goto L_0x0028
            r6 = r9
            X.Ao7 r6 = (X.C21678Ao7) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r2 = r6.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r6.label
            r5 = 3
            r0 = 2
            r4 = 1
            if (r1 == 0) goto L_0x006b
            if (r1 == r4) goto L_0x0085
            if (r1 == r0) goto L_0x002e
            if (r1 == r5) goto L_0x0085
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0028:
            X.Ao7 r6 = new X.Ao7
            r6.<init>(r8, r9)
            goto L_0x0012
        L_0x002e:
            java.lang.Object r3 = r6.L$1
            X.1nB r3 = (X.C36001nB) r3
            java.lang.Object r1 = r6.L$0
            com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService r1 = (com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService) r1
            X.C30691eM.A01(r2)
            boolean r0 = X.AnonymousClass000.A1Y(r2)
            if (r0 == 0) goto L_0x0054
            X.Arh r2 = new X.Arh
            r2.<init>(r1, r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.label = r5
            java.lang.Object r2 = r3.invoke(r2, r1, r6)
            goto L_0x0082
        L_0x0054:
            boolean r0 = r1 instanceof com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService
            if (r0 == 0) goto L_0x0064
            com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService r1 = (com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService) r1
            X.9qC r0 = r1.A02
            com.whatsapp.jid.UserJid r0 = r0.A00
        L_0x005e:
            X.8ir r2 = new X.8ir
            r2.<init>(r0)
            return r2
        L_0x0064:
            com.whatsapp.biz.catalog.network.graphql.service.impl.CoroutineGetSingleCollectionGraphQLService r1 = (com.whatsapp.biz.catalog.network.graphql.service.impl.CoroutineGetSingleCollectionGraphQLService) r1
            X.9tk r0 = r1.A02
            com.whatsapp.jid.UserJid r0 = r0.A04
            goto L_0x005e
        L_0x006b:
            X.C30691eM.A01(r2)
            r0 = 4
            X.Arh r1 = new X.Arh
            r1.<init>(r8, r0)
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            r6.L$0 = r8
            r6.L$1 = r10
            r6.label = r4
            java.lang.Object r2 = r10.invoke(r1, r0, r6)
        L_0x0082:
            if (r2 != r7) goto L_0x0088
            return r7
        L_0x0085:
            X.C30691eM.A01(r2)
        L_0x0088:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService.A02(X.1dr, X.1nB):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.9Ma] */
    public final void A03(int i) {
        UserJid userJid;
        C138476x9 r4 = this.A03;
        if (this instanceof DCVerifyPostcodeGraphQLService) {
            userJid = ((DCVerifyPostcodeGraphQLService) this).A02.A00;
        } else {
            userJid = ((CoroutineGetSingleCollectionGraphQLService) this).A02.A04;
        }
        int i2 = this.A00;
        C138476x9.A00(userJid, r4, i2, 2, (long) i);
        C199279zj.A00(userJid, new Object(), this.A02, i2, 1);
    }

    public BaseCoroutineGraphQLRequestService(CoroutineDirectConnectionHelper coroutineDirectConnectionHelper, A0W a0w, C199279zj r3, C138476x9 r4, int i) {
        this.A01 = a0w;
        this.A04 = coroutineDirectConnectionHelper;
        this.A03 = r4;
        this.A00 = i;
        this.A02 = r3;
    }
}
