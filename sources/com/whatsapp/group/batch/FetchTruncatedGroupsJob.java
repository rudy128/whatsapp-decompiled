package com.whatsapp.group.batch;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass126;
import X.AnonymousClass127;
import X.AnonymousClass190;
import X.AnonymousClass8BS;
import X.C000100c;
import X.C000200d;
import X.C17890vO;
import X.C179429Hx;
import X.C18030ve;
import X.C18070vi;
import X.C183129Xa;
import X.C184529b6;
import X.C186769ej;
import X.C199369zs;
import X.C22488B9u;
import X.C25001Mm;
import android.content.Context;
import java.util.List;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

public final class FetchTruncatedGroupsJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass190 A00;
    public transient C25001Mm A01;
    public transient C18030ve A02;
    public transient AnonymousClass127 A03;
    public transient AnonymousClass126 A04;
    public transient C199369zs A05;
    public transient C183129Xa A06;
    public transient C186769ej A07;
    public transient C184529b6 A08;
    public final C179429Hx batchGetGroupInfoContext;
    public final List groupsToFetch;
    public final Integer maxNumberOfRounds;
    public final int params;
    public final int round;
    public final Set successfullyProcessedGroups;

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        C000100c A0H = C17890vO.A0H(AnonymousClass8BS.A02(context));
        C18030ve BAL = A0H.BAL();
        C18070vi.A0d(BAL, 0);
        this.A02 = BAL;
        AnonymousClass190 BG6 = A0H.BG6();
        C18070vi.A0d(BG6, 0);
        this.A00 = BG6;
        AnonymousClass10E r3 = (AnonymousClass10E) A0H;
        C25001Mm r0 = (C25001Mm) C18070vi.A0E(C000200d.A00(r3.ABf));
        C18070vi.A0d(r0, 0);
        this.A01 = r0;
        AnonymousClass126 r02 = (AnonymousClass126) r3.A8y.get();
        C18070vi.A0d(r02, 0);
        this.A04 = r02;
        C199369zs r03 = (C199369zs) r3.A4n.get();
        C18070vi.A0d(r03, 0);
        this.A05 = r03;
        AnonymousClass127 BA7 = A0H.BA7();
        C18070vi.A0d(BA7, 0);
        this.A03 = BA7;
        AnonymousClass10G r1 = r3.Ao8.A00;
        this.A07 = AnonymousClass10G.A5f(r1);
        C184529b6 r04 = (C184529b6) r1.A0K.get();
        C18070vi.A0d(r04, 0);
        this.A08 = r04;
        C183129Xa r05 = (C183129Xa) r3.A4o.get();
        C18070vi.A0d(r05, 0);
        this.A06 = r05;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x01e2 A[LOOP:4: B:47:0x01dc->B:49:0x01e2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01fe A[LOOP:5: B:51:0x01f8->B:53:0x01fe, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r21 = this;
            r0 = r21
            X.9Xa r3 = r0.A06
            if (r3 == 0) goto L_0x0373
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            long r1 = r1.freeMemory()
            double r4 = (double) r1
            r1 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            double r4 = r4 * r1
            r1 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r4 = r4 / r1
            int r6 = (int) r4
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r6 >= r1) goto L_0x001f
            r6 = 10000(0x2710, float:1.4013E-41)
        L_0x001f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "GroupInfoBatchProcessor/processGroupInfo/getMaxParticipantsInGroupQueries - \n              | Client can handle "
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = " per round as per memory \n              | constraints"
            java.lang.String r1 = X.AnonymousClass000.A0y(r1, r2)
            java.lang.String r1 = X.AnonymousClass1Y7.A02(r1)
            java.lang.String r2 = "\n"
            java.lang.String r5 = ""
            r4 = 0
            X.AnonymousClass1YE.A07(r1, r2, r5, r4)
            X.0ve r3 = r3.A00
            r1 = 6267(0x187b, float:8.782E-42)
            X.0vf r8 = X.C18040vf.A02
            int r12 = X.C18020vd.A00(r8, r3, r1)
            if (r12 <= r6) goto L_0x004a
            r12 = r6
        L_0x004a:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "GroupInfoBatchProcessor/processGroupInfo/getMaxParticipantsInGroupQueriesCode - \n              | Processing "
            r3.append(r1)
            r3.append(r12)
            java.lang.String r1 = " participants\n              | as per device constraints and server limits"
            java.lang.String r1 = X.AnonymousClass000.A0y(r1, r3)
            java.lang.String r1 = X.AnonymousClass1Y7.A02(r1)
            X.AnonymousClass1YE.A07(r1, r2, r5, r4)
            java.util.List r1 = r0.groupsToFetch
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.Iterator r6 = r1.iterator()
            r9 = 0
        L_0x0072:
            r5 = 0
        L_0x0073:
            boolean r1 = r6.hasNext()
            r7 = 1
            if (r1 == 0) goto L_0x0099
            java.lang.Object r4 = r6.next()
            X.1D6 r4 = (X.AnonymousClass1D6) r4
            int r3 = X.C108955ca.A09(r4)
            if (r5 == 0) goto L_0x0094
            int r1 = r5 + r3
            if (r1 <= r12) goto L_0x0094
            r11.add(r10)
            X.1D6[] r1 = new X.AnonymousClass1D6[r7]
            java.util.ArrayList r10 = X.AnonymousClass8BR.A11(r4, r1, r9)
            goto L_0x0072
        L_0x0094:
            r10.add(r4)
            int r5 = r5 + r3
            goto L_0x0073
        L_0x0099:
            boolean r1 = r10.isEmpty()
            X.AnonymousClass3MZ.A1V(r10, r11, r1)
            java.util.List r1 = X.C29431cG.A0t(r11)
            java.lang.Object r5 = X.C29431cG.A0b(r1)
            java.util.List r5 = (java.util.List) r5
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "GroupInfoBatchProcessor/FetchTruncatedGroupsJob/fetching additional\n          | group info; round="
            r3.append(r1)
            int r1 = r0.round
            java.lang.String r1 = X.C17880vN.A0t(r3, r1)
            java.lang.String r1 = X.AnonymousClass1Y7.A02(r1)
            X.AnonymousClass8BV.A0s(r1, r2)
            X.1Ug r4 = new X.1Ug
            r4.<init>()
            java.util.ArrayList r12 = X.C29351c6.A0E(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x00cd:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x00e7
            java.lang.Object r3 = r5.next()
            X.1D6 r3 = (X.AnonymousClass1D6) r3
            X.1yz r1 = X.AnonymousClass1EC.A01
            java.lang.Object r1 = r3.first
            java.lang.String r1 = (java.lang.String) r1
            X.1EC r1 = X.C42941yz.A01(r1)
            r12.add(r1)
            goto L_0x00cd
        L_0x00e7:
            X.9Hx r6 = r0.batchGetGroupInfoContext
            int r3 = r6.ordinal()
            r5 = 1
            r1 = 2
            if (r3 == r1) goto L_0x015a
            if (r3 == r9) goto L_0x0157
            if (r3 != r7) goto L_0x036e
            java.lang.String r7 = "per_group_dirty_recovery_truncatable"
        L_0x00f7:
            X.9Hx r1 = X.C179429Hx.GET_PARTICIPATING_GROUPS_PAGINATED
            if (r6 != r1) goto L_0x017c
            X.0ve r6 = r0.A02
            if (r6 == 0) goto L_0x0376
            r3 = 10805(0x2a35, float:1.5141E-41)
            boolean r3 = X.C18020vd.A05(r8, r6, r3)
            if (r3 == 0) goto L_0x017c
            int r8 = r0.round
            int r6 = r0.params
            org.whispersystems.jobqueue.JobParameters r3 = r0.parameters
            int r3 = r3.retryCount
            X.9rl r9 = new X.9rl
            r9.<init>(r8, r6, r3)
            X.9ej r8 = r0.A07
            if (r8 == 0) goto L_0x0178
            X.1PY r11 = r8.A03
            X.A7K r10 = X.A7K.A00()
            com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupBatchQueryInput r13 = new com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupBatchQueryInput
            r13.<init>()
            java.lang.String r6 = X.C108975cc.A0e(r7)
            java.lang.String r3 = "request_context"
            r13.A05(r3, r6)
            java.util.ArrayList r14 = X.C29351c6.A0E(r12)
            java.util.Iterator r15 = r12.iterator()
        L_0x0134:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x015d
            com.whatsapp.jid.Jid r3 = X.C17880vN.A0S(r15)
            com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupQueryInput r12 = new com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupQueryInput
            r12.<init>()
            java.lang.String r6 = X.C72463Mc.A0n(r3)
            java.lang.String r3 = "group_jid"
            r12.A05(r3, r6)
            java.lang.String r6 = "INTERACTIVE"
            java.lang.String r3 = "query_context"
            r12.A05(r3, r6)
            r14.add(r12)
            goto L_0x0134
        L_0x0157:
            java.lang.String r7 = "per_group_dirty_recovery"
            goto L_0x00f7
        L_0x015a:
            java.lang.String r7 = "get_participating_groups_paginated"
            goto L_0x00f7
        L_0x015d:
            java.lang.String r3 = "groups"
            r13.A06(r3, r14)
            java.lang.String r3 = "input"
            r10.A04(r13, r3)
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryBatchGetGroupsResponseImpl> r6 = com.whatsapp.infra.graphql.generated.groups.QueryBatchGetGroupsResponseImpl.class
            java.lang.String r3 = "QueryBatchGetGroups"
            X.A2g r6 = X.AIj.A01(r10, r11, r6, r3)
            X.B1g r3 = new X.B1g
            r3.<init>(r9, r8, r4, r7)
            r6.A04(r3)
            goto L_0x01cc
        L_0x0178:
            java.lang.String r0 = "batchGetGroupInfoMexHelper"
            goto L_0x0378
        L_0x017c:
            X.9b6 r8 = r0.A08
            if (r8 == 0) goto L_0x036b
            X.B0v r10 = new X.B0v
            r10.<init>(r0, r4)
            X.00H r6 = r8.A01
            java.lang.String r3 = X.C17890vO.A0T(r6)
            X.Ai8 r9 = new X.Ai8
            r9.<init>(r3, r7, r12)
            java.lang.Object r14 = X.C18070vi.A0E(r6)
            X.1OZ r14 = (X.AnonymousClass1OZ) r14
            X.00H r8 = r8.A00
            java.lang.Object r7 = X.C18070vi.A0E(r8)
            r6 = 5
            X.Arh r11 = new X.Arh
            r11.<init>(r7, r6)
            java.lang.Object r7 = X.C18070vi.A0E(r8)
            r6 = 6
            X.Arh r12 = new X.Arh
            r12.<init>(r7, r6)
            r18 = 20
            r19 = 32000(0x7d00, double:1.581E-319)
            r6 = 0
            X.C18070vi.A0d(r14, r6)
            X.0vl r6 = r9.A03
            java.lang.Object r6 = r6.getValue()
            X.A8g r6 = (X.C20121A8g) r6
            X.1ca r16 = r6.BVP()
            r13 = 0
            X.9HH r8 = new X.9HH
            r8.<init>(r9, r10, r11, r12, r13)
            r15 = r8
            r17 = r3
            r14.A0N(r15, r16, r17, r18, r19)
        L_0x01cc:
            java.lang.Object r10 = r4.get()
            X.9rk r10 = (X.C194449rk) r10
            java.util.Set r3 = r10.A02
            java.util.ArrayList r6 = X.C29351c6.A0E(r3)
            java.util.Iterator r4 = r3.iterator()
        L_0x01dc:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x01e6
            X.AnonymousClass8BX.A1N(r6, r4)
            goto L_0x01dc
        L_0x01e6:
            java.util.HashSet r9 = X.C29431cG.A0n(r6)
            java.util.Map r3 = r10.A00
            java.util.Set r3 = r3.keySet()
            java.util.ArrayList r6 = X.C29351c6.A0E(r3)
            java.util.Iterator r4 = r3.iterator()
        L_0x01f8:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0202
            X.AnonymousClass8BX.A1N(r6, r4)
            goto L_0x01f8
        L_0x0202:
            java.util.HashSet r3 = X.C29431cG.A0n(r6)
            java.util.LinkedHashSet r8 = X.C41841x9.A04(r3, r9)
            java.util.List r3 = r0.groupsToFetch
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r6 = r3.iterator()
        L_0x0214:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x022d
            java.lang.Object r4 = r6.next()
            r3 = r4
            X.1D6 r3 = (X.AnonymousClass1D6) r3
            java.lang.Object r3 = r3.first
            boolean r3 = r8.contains(r3)
            if (r3 != 0) goto L_0x0214
            r7.add(r4)
            goto L_0x0214
        L_0x022d:
            java.util.ArrayList r11 = X.C29351c6.A0E(r7)
            java.util.Iterator r7 = r7.iterator()
        L_0x0235:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x025b
            java.lang.Object r3 = r7.next()
            X.1D6 r3 = (X.AnonymousClass1D6) r3
            java.lang.Object r6 = r3.first
            int r4 = X.C108955ca.A09(r3)
            java.util.Map r3 = r10.A01
            java.lang.Number r3 = X.C108945cZ.A1E(r6, r3)
            if (r3 == 0) goto L_0x0253
            int r4 = r3.intValue()
        L_0x0253:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            X.AnonymousClass1D6.A02(r6, r3, r11)
            goto L_0x0235
        L_0x025b:
            java.lang.Integer r3 = r0.maxNumberOfRounds
            if (r3 == 0) goto L_0x02ae
            int r3 = r3.intValue()
        L_0x0263:
            java.util.Set r4 = r0.successfullyProcessedGroups
            java.util.LinkedHashSet r12 = X.C41841x9.A04(r9, r4)
            boolean r4 = X.C17880vN.A1X(r11)
            if (r4 == 0) goto L_0x02de
            int r4 = r0.round
            if (r4 >= r3) goto L_0x02de
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r1 = "GroupInfoBatchProcessor/FetchTruncatedGroupsJob/Scheduling new batch for processing.\n              | Processed "
            r4.append(r1)
            int r1 = r8.size()
            r4.append(r1)
            java.lang.String r1 = " groups. "
            X.C17890vO.A14(r1, r4, r11)
            java.lang.String r1 = " to go."
            java.lang.String r1 = X.AnonymousClass000.A0y(r1, r4)
            java.lang.String r1 = X.AnonymousClass1Y7.A02(r1)
            X.AnonymousClass8BV.A0s(r1, r2)
            int r1 = r0.round
            int r13 = r1 + 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            int r14 = r0.params
            X.9Hx r9 = r0.batchGetGroupInfoContext
            com.whatsapp.group.batch.FetchTruncatedGroupsJob r8 = new com.whatsapp.group.batch.FetchTruncatedGroupsJob
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.1Mm r0 = r0.A01
            if (r0 == 0) goto L_0x02da
            r0.A01(r8)
            return
        L_0x02ae:
            java.util.List r4 = r0.groupsToFetch
            X.9Xa r3 = r0.A06
            if (r3 == 0) goto L_0x0373
            java.util.Iterator r6 = r4.iterator()
            r4 = 0
        L_0x02b9:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x02cb
            java.lang.Object r3 = r6.next()
            X.1D6 r3 = (X.AnonymousClass1D6) r3
            int r3 = X.C108955ca.A09(r3)
            int r4 = r4 + r3
            goto L_0x02b9
        L_0x02cb:
            int r3 = r4 / 10000
            int r3 = r3 + 1
            double r3 = (double) r3
            r6 = 4607857958744122982(0x3ff2666666666666, double:1.15)
            double r3 = r3 * r6
            int r6 = (int) r3
            int r3 = r6 + 1
            goto L_0x0263
        L_0x02da:
            java.lang.String r0 = "waJobManager"
            goto L_0x0378
        L_0x02de:
            boolean r3 = X.C17880vN.A1X(r11)
            if (r3 == 0) goto L_0x0310
            X.190 r7 = r0.A00
            if (r7 == 0) goto L_0x0368
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "GroupInfoBatchProcessor/FetchTruncatedGroupsJob/Aborted after "
            r4.append(r3)
            int r3 = r0.round
            r4.append(r3)
            java.lang.String r3 = " rounds"
            java.lang.String r6 = X.AnonymousClass000.A0y(r3, r4)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            int r3 = r11.size()
            r4.append(r3)
            java.lang.String r3 = " unprocessed groups."
            java.lang.String r3 = X.AnonymousClass000.A0y(r3, r4)
            r7.A0G(r6, r3, r5)
        L_0x0310:
            X.9Hx r3 = r0.batchGetGroupInfoContext
            if (r3 != r1) goto L_0x034a
            X.127 r3 = r0.A03
            if (r3 == 0) goto L_0x0340
            r1 = 0
            r3.A01 = r1
            X.126 r6 = r0.A04
            if (r6 == 0) goto L_0x033d
            int r5 = r0.params
            java.util.ArrayList r4 = X.C29351c6.A0E(r12)
            java.util.Iterator r3 = r12.iterator()
        L_0x0329:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0343
            java.lang.String r1 = X.C17880vN.A0v(r3)
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1EC r0 = X.C42941yz.A01(r1)
            r4.add(r0)
            goto L_0x0329
        L_0x033d:
            java.lang.String r0 = "groupChatManager"
            goto L_0x0378
        L_0x0340:
            java.lang.String r0 = "groupSyncStateBridge"
            goto L_0x0378
        L_0x0343:
            java.util.Set r0 = X.C29431cG.A12(r4)
            r6.A0k(r0, r5)
        L_0x034a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupInfoBatchProcessor/FetchTruncatedGroupsJob/Sync batch group processing done.\n              | Processed "
            r1.append(r0)
            int r0 = r12.size()
            r1.append(r0)
            java.lang.String r0 = "\n              | groups in total."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = X.AnonymousClass1Y7.A02(r0)
            X.AnonymousClass8BV.A0s(r0, r2)
            return
        L_0x0368:
            java.lang.String r0 = "crashLogs"
            goto L_0x0378
        L_0x036b:
            java.lang.String r0 = "batchGetGroupInfoProtocolHelper"
            goto L_0x0378
        L_0x036e:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0373:
            java.lang.String r0 = "groupInfoPipelineStrategyController"
            goto L_0x0378
        L_0x0376:
            java.lang.String r0 = "abProps"
        L_0x0378:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.batch.FetchTruncatedGroupsJob.A0A():void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FetchTruncatedGroupsJob(X.C179429Hx r3, java.lang.Integer r4, java.util.List r5, java.util.Set r6, int r7, int r8) {
        /*
            r2 = this;
            X.C72473Md.A1J(r6, r3)
            X.9lc r1 = new X.9lc
            r1.<init>()
            java.lang.String r0 = "fetch_truncated_groups_job"
            X.AnonymousClass3EB.A00(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r2.<init>(r0)
            r2.round = r7
            r2.maxNumberOfRounds = r4
            r2.params = r8
            r2.groupsToFetch = r5
            r2.successfullyProcessedGroups = r6
            r2.batchGetGroupInfoContext = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.batch.FetchTruncatedGroupsJob.<init>(X.9Hx, java.lang.Integer, java.util.List, java.util.Set, int, int):void");
    }
}
