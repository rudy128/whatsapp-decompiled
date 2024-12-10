package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass1D7;
import X.AnonymousClass1EC;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1OX;
import X.AnonymousClass3D0;
import X.AnonymousClass3MX;
import X.AnonymousClass4XG;
import X.C18070vi;
import X.C25091Mv;
import X.C25131Mz;
import X.C29431cG;
import X.C30391dr;
import X.C34071js;
import X.C58822lJ;
import X.C59802mu;
import X.C98804rk;
import com.whatsapp.community.iq.SubgroupSuggestionActionProtocolHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public final class MemberSuggestedGroupsManager {
    public final AnonymousClass1KB A00;
    public final C25131Mz A01;
    public final SubgroupSuggestionActionProtocolHelper A02;
    public final AnonymousClass3D0 A03 = new Object();
    public final AnonymousClass1M9 A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass4XG A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass1OX A0B;
    public final AnonymousClass1G4 A0C;
    public final AnonymousClass1G1 A0D;

    public final void A04(C59802mu r3, AnonymousClass1EC r4) {
        C18070vi.A0d(r4, 0);
        this.A04.A0h(r4, false);
        ((C58822lJ) this.A09.get()).A02(C18070vi.A0M(r3));
        if (A03(r4).add(r3)) {
            C98804rk.A00(this.A00, this, r4, 33);
        }
    }

    public final void A05(AnonymousClass1EC r4, AnonymousClass1EC r5) {
        C18070vi.A0d(r5, 1);
        AnonymousClass3MX.A1Q(new MemberSuggestedGroupsManager$fetchSuggestedGroups$1(this, r4, r5, (C30391dr) null), this.A0B);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r6, X.AnonymousClass1EC r7, X.AnonymousClass1EC r8, X.C30391dr r9) {
        /*
            boolean r0 = r9 instanceof X.C100794v5
            if (r0 == 0) goto L_0x0068
            r5 = r9
            X.4v5 r5 = (X.C100794v5) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0068
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r2) goto L_0x0049
            if (r0 != r3) goto L_0x006e
            X.C30691eM.A01(r1)
        L_0x0023:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0026:
            X.C30691eM.A01(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MemberSuggestedGroupsManager/fetch/parent: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", hint: "
            X.C17900vP.A0Y(r8, r0, r1)
            r5.L$0 = r6
            r5.L$1 = r7
            r5.L$2 = r8
            r5.label = r2
            java.lang.Object r0 = r6.A02(r7, r5, r2)
            if (r0 != r4) goto L_0x0058
            return r4
        L_0x0049:
            java.lang.Object r8 = r5.L$2
            X.1EC r8 = (X.AnonymousClass1EC) r8
            java.lang.Object r7 = r5.L$1
            X.1EC r7 = (X.AnonymousClass1EC) r7
            java.lang.Object r6 = r5.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r6 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r6
            X.C30691eM.A01(r1)
        L_0x0058:
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r3
            java.lang.Object r0 = A01(r6, r7, r8, r5)
            if (r0 != r4) goto L_0x0023
            return r4
        L_0x0068:
            X.4v5 r5 = new X.4v5
            r5.<init>(r6, r9)
            goto L_0x0012
        L_0x006e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager.A00(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager, X.1EC, X.1EC, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r8, X.AnonymousClass1EC r9, X.AnonymousClass1EC r10, X.C30391dr r11) {
        /*
            boolean r0 = r11 instanceof X.C100644uq
            if (r0 == 0) goto L_0x00a7
            r4 = r11
            X.4uq r4 = (X.C100644uq) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a7
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r7 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 0
            r2 = 3
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 == r1) goto L_0x0036
            if (r0 == r6) goto L_0x002a
            if (r0 != r2) goto L_0x00ae
            X.C30691eM.A01(r7)
        L_0x0027:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002a:
            java.lang.Object r9 = r4.L$1
            X.1EC r9 = (X.AnonymousClass1EC) r9
            java.lang.Object r8 = r4.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r8 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r8
            X.C30691eM.A01(r7)     // Catch:{ 4Dx -> 0x006a }
            goto L_0x0027
        L_0x0036:
            java.lang.Object r9 = r4.L$1
            X.1EC r9 = (X.AnonymousClass1EC) r9
            java.lang.Object r8 = r4.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r8 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r8
            goto L_0x0057
        L_0x003f:
            X.C30691eM.A01(r7)
            X.00H r0 = r8.A08     // Catch:{ 4Dx -> 0x006a }
            java.lang.Object r0 = r0.get()     // Catch:{ 4Dx -> 0x006a }
            com.whatsapp.community.mex.GetSuggestedGroupsGraphQlHandler r0 = (com.whatsapp.community.mex.GetSuggestedGroupsGraphQlHandler) r0     // Catch:{ 4Dx -> 0x006a }
            r4.L$0 = r8     // Catch:{ 4Dx -> 0x006a }
            r4.L$1 = r9     // Catch:{ 4Dx -> 0x006a }
            r4.label = r1     // Catch:{ 4Dx -> 0x006a }
            java.lang.Object r7 = r0.A00(r9, r10, r4)     // Catch:{ 4Dx -> 0x006a }
            if (r7 != r5) goto L_0x005a
            goto L_0x00b3
        L_0x0057:
            X.C30691eM.A01(r7)     // Catch:{ 4Dx -> 0x006a }
        L_0x005a:
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ 4Dx -> 0x006a }
            r8.A06(r9, r7)     // Catch:{ 4Dx -> 0x006a }
            r4.L$0 = r8     // Catch:{ 4Dx -> 0x006a }
            r4.L$1 = r9     // Catch:{ 4Dx -> 0x006a }
            r4.label = r6     // Catch:{ 4Dx -> 0x006a }
            java.lang.Object r0 = r8.A02(r9, r4, r3)     // Catch:{ 4Dx -> 0x006a }
            goto L_0x008f
        L_0x006a:
            r0 = move-exception
            int r6 = r0.errorCode
            r0 = 403(0x193, float:5.65E-43)
            if (r6 == r0) goto L_0x00a1
            r0 = 404(0x194, float:5.66E-43)
            if (r6 == r0) goto L_0x00a1
            r0 = -1
            if (r6 == r0) goto L_0x0084
            r0 = 400(0x190, float:5.6E-43)
            if (r6 == r0) goto L_0x0084
            r0 = 500(0x1f4, float:7.0E-43)
            if (r0 > r6) goto L_0x0092
            r0 = 600(0x258, float:8.41E-43)
            if (r6 >= r0) goto L_0x0097
        L_0x0084:
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r2
            java.lang.Object r0 = r8.A02(r9, r4, r3)
        L_0x008f:
            if (r0 != r5) goto L_0x0027
            return r5
        L_0x0092:
            r0 = 429(0x1ad, float:6.01E-43)
            if (r6 != r0) goto L_0x0097
            goto L_0x0084
        L_0x0097:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MemberSuggestedGroupsManager/fetchSuggestedGroups/unknown error: "
            X.C17900vP.A0i(r0, r1, r6)
            goto L_0x0084
        L_0x00a1:
            X.0wS r0 = X.C18460wS.A00
            r8.A06(r9, r0)
            goto L_0x0084
        L_0x00a7:
            X.4uq r4 = new X.4uq
            r4.<init>(r8, r11)
            goto L_0x0012
        L_0x00ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00b3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager.A01(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager, X.1EC, X.1EC, X.1dr):java.lang.Object");
    }

    private final Object A02(AnonymousClass1EC r4, C30391dr r5, boolean z) {
        AnonymousClass1G4 r2 = this.A0C;
        LinkedHashMap A082 = AnonymousClass1D7.A08((Map) r2.getValue());
        A082.put(r4, Boolean.valueOf(z));
        return AnonymousClass3MX.A13(r2.BJt(AnonymousClass1D7.A0F(A082), r5));
    }

    public final SortedSet A03(AnonymousClass1EC r5) {
        C25131Mz r3 = this.A01;
        SortedSet sortedSet = (SortedSet) r3.A0A(r5);
        if (sortedSet != null) {
            return sortedSet;
        }
        ArrayList A002 = ((C58822lJ) this.A09.get()).A00(r5);
        AnonymousClass3D0 r1 = this.A03;
        C18070vi.A0d(A002, 0);
        TreeSet treeSet = new TreeSet(r1);
        C29431cG.A17(A002, treeSet);
        r3.A0F(r5, treeSet);
        return treeSet;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.3D0, java.lang.Object] */
    public MemberSuggestedGroupsManager(AnonymousClass1KB r3, C25091Mv r4, SubgroupSuggestionActionProtocolHelper subgroupSuggestionActionProtocolHelper, AnonymousClass1M9 r6, AnonymousClass11P r7, AnonymousClass4XG r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass1OX r13) {
        C18070vi.A0w(r7, r4, r3, r6, r13);
        C18070vi.A0x(r9, r10, r8, r11, r12);
        C25131Mz BH3 = r4.BH3("MemberSuggestedGroupsManager", 50);
        this.A05 = r7;
        this.A01 = BH3;
        this.A00 = r3;
        this.A04 = r6;
        this.A0B = r13;
        this.A0A = r9;
        this.A07 = r10;
        this.A09 = r11;
        this.A06 = r8;
        this.A08 = r12;
        this.A02 = subgroupSuggestionActionProtocolHelper;
        AnonymousClass1G7 A002 = C34071js.A00(AnonymousClass1D7.A0I());
        this.A0C = A002;
        this.A0D = A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass1EC r10, java.lang.Iterable r11) {
        /*
            r9 = this;
            boolean r3 = X.C18070vi.A15(r10, r11)
            java.util.SortedSet r0 = r9.A03(r10)
            java.util.Set r2 = X.C29431cG.A12(r0)
            java.util.Set r0 = X.C29431cG.A12(r11)
            X.AnonymousClass3Ma.A1N(r2, r3, r0)
            java.util.Set r1 = X.C41841x9.A06(r0, r2)
            java.util.Set r0 = X.C41841x9.A06(r2, r0)
            java.util.LinkedHashSet r0 = X.C41841x9.A04(r0, r1)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002c
            X.1M9 r0 = r9.A04
            r0.A0h(r10, r3)
        L_0x002c:
            X.00H r0 = r9.A09
            java.lang.Object r8 = r0.get()
            X.2lJ r8 = (X.C58822lJ) r8
            X.1Lt r0 = r8.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x008b }
            X.1au r6 = r0.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x008b }
            X.1xA r7 = r6.BD0()     // Catch:{ all -> 0x0084 }
            java.util.ArrayList r1 = r8.A00(r10)     // Catch:{ all -> 0x007d }
            java.util.Set r0 = X.C29431cG.A12(r11)     // Catch:{ all -> 0x007d }
            java.util.Set r0 = X.C29431cG.A14(r1, r0)     // Catch:{ all -> 0x007d }
            java.util.ArrayList r5 = X.C29351c6.A0D(r0)     // Catch:{ all -> 0x007d }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x007d }
        L_0x0052:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x006d
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x007d }
            X.2mu r0 = (X.C59802mu) r0     // Catch:{ all -> 0x007d }
            X.1EC r3 = r0.A03     // Catch:{ all -> 0x007d }
            X.1EC r2 = r0.A02     // Catch:{ all -> 0x007d }
            com.whatsapp.jid.UserJid r1 = r0.A04     // Catch:{ all -> 0x007d }
            X.2m5 r0 = new X.2m5     // Catch:{ all -> 0x007d }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x007d }
            r5.add(r0)     // Catch:{ all -> 0x007d }
            goto L_0x0052
        L_0x006d:
            r8.A01(r10, r5)     // Catch:{ all -> 0x007d }
            r8.A02(r11)     // Catch:{ all -> 0x007d }
            r7.A00()     // Catch:{ all -> 0x007d }
            r7.close()     // Catch:{ all -> 0x0084 }
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x008b }
            goto L_0x008f
        L_0x007d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x0084 }
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x008b }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x008b }
        L_0x008b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x008f:
            X.1Mz r2 = r9.A01
            X.3D0 r1 = r9.A03
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r1)
            X.C29431cG.A17(r11, r0)
            r2.A0F(r10, r0)
            X.1KB r1 = r9.A00
            r0 = 30
            X.C98804rk.A00(r1, r9, r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager.A06(X.1EC, java.lang.Iterable):void");
    }
}
