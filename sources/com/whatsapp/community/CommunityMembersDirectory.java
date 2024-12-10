package com.whatsapp.community;

import X.A2B;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EC;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1MY;
import X.AnonymousClass1MZ;
import X.AnonymousClass1b2;
import X.AnonymousClass3IM;
import X.C18000vb;
import X.C18070vi;
import X.C18600wl;
import X.C199410f;
import X.C24921Me;
import X.C29431cG;
import X.C32101gd;
import X.C34511kb;
import X.C42941yz;
import X.C71893It;
import X.C99434so;
import android.os.Parcelable;
import java.util.LinkedHashSet;
import java.util.Set;

public final class CommunityMembersDirectory implements C32101gd {
    public final AnonymousClass1KB A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1M9 A02;
    public final C24921Me A03;
    public final C18000vb A04;
    public final AnonymousClass1CJ A05;
    public final AnonymousClass1MZ A06;
    public final AnonymousClass1MY A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final C18600wl A0E;

    public CommunityMembersDirectory(AnonymousClass1KB r17, AnonymousClass11S r18, AnonymousClass1M9 r19, C24921Me r20, C18000vb r21, AnonymousClass1CJ r22, AnonymousClass1MZ r23, AnonymousClass1MY r24, AnonymousClass10I r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, C18600wl r31) {
        AnonymousClass1KB r15 = r17;
        C18070vi.A0d(r15, 1);
        AnonymousClass10I r7 = r25;
        C18070vi.A0d(r7, 2);
        AnonymousClass11S r14 = r18;
        C18070vi.A0d(r14, 3);
        AnonymousClass1CJ r10 = r22;
        C18070vi.A0d(r10, 4);
        AnonymousClass1M9 r13 = r19;
        C18070vi.A0d(r13, 5);
        C24921Me r12 = r20;
        C18070vi.A0d(r12, 6);
        C18000vb r11 = r21;
        C18070vi.A0d(r11, 7);
        AnonymousClass00H r6 = r26;
        C18070vi.A0d(r6, 8);
        AnonymousClass00H r5 = r27;
        C18070vi.A0d(r5, 9);
        AnonymousClass00H r4 = r28;
        C18070vi.A0d(r4, 10);
        AnonymousClass1MZ r9 = r23;
        C18070vi.A0d(r9, 11);
        AnonymousClass00H r3 = r29;
        C18070vi.A0d(r3, 12);
        AnonymousClass1MY r8 = r24;
        C18070vi.A0d(r8, 13);
        AnonymousClass00H r2 = r30;
        C18070vi.A0d(r2, 14);
        C18600wl r1 = r31;
        C18070vi.A0d(r1, 15);
        this.A00 = r15;
        this.A08 = r7;
        this.A01 = r14;
        this.A05 = r10;
        this.A02 = r13;
        this.A03 = r12;
        this.A04 = r11;
        this.A0C = r6;
        this.A0D = r5;
        this.A09 = r4;
        this.A06 = r9;
        this.A0B = r3;
        this.A07 = r8;
        this.A0A = r2;
        this.A0E = r1;
    }

    public int BVA(AnonymousClass1EC r4) {
        C18070vi.A0d(r4, 0);
        if (this.A05.A06(r4) != 1 && (r4 = ((C34511kb) this.A09.get()).A05(r4)) == null) {
            return 0;
        }
        C199410f A0B2 = this.A06.A08.A0B(r4).A0B();
        C18070vi.A0X(A0B2);
        Number number = (Number) AnonymousClass1b2.A04(AnonymousClass1b2.A0C(C71893It.A00, AnonymousClass1b2.A09(new AnonymousClass3IM(this), new C99434so(A0B2, 4))));
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static final AnonymousClass1EC A00(CommunityMembersDirectory communityMembersDirectory, AnonymousClass1EC r1) {
        A2B A012 = ((C34511kb) communityMembersDirectory.A09.get()).A01(r1);
        if (A012 == null) {
            return null;
        }
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        return C42941yz.A00(A012.A02);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad A[LOOP:1: B:25:0x00a7->B:27:0x00ad, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BOz(X.AnonymousClass1EC r7, X.C30391dr r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.AnonymousClass3FF
            if (r0 == 0) goto L_0x0088
            r4 = r8
            X.3FF r4 = (X.AnonymousClass3FF) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0088
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r2 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L_0x0070
            if (r1 != r0) goto L_0x00c1
            java.lang.Object r0 = r4.L$0
            com.whatsapp.community.CommunityMembersDirectory r0 = (com.whatsapp.community.CommunityMembersDirectory) r0
            X.C30691eM.A01(r2)
        L_0x0024:
            java.util.Map r2 = (java.util.Map) r2
            X.00H r0 = r0.A0C
            java.lang.Object r1 = r0.get()
            X.1Ln r1 = (X.C24751Ln) r1
            java.util.Set r0 = r2.keySet()
            java.util.Set r0 = X.C29431cG.A12(r0)
            java.util.LinkedHashMap r4 = r1.A0G(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0047:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            boolean r0 = r0 instanceof com.whatsapp.jid.PhoneUserJid
            java.lang.Object r2 = r1.getKey()
            if (r0 != 0) goto L_0x0063
            java.lang.Object r2 = r4.get(r2)
        L_0x0063:
            java.lang.Object r1 = r1.getValue()
            X.1D6 r0 = new X.1D6
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x0047
        L_0x0070:
            X.C30691eM.A01(r2)
            r4.L$0 = r6
            r4.label = r0
            X.0wl r2 = r6.A0E
            r1 = 0
            com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$2 r0 = new com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$2
            r0.<init>(r6, r7, r1)
            java.lang.Object r2 = X.C30451dy.A00(r4, r2, r0)
            if (r2 != r3) goto L_0x0086
            return r3
        L_0x0086:
            r0 = r6
            goto L_0x0024
        L_0x0088:
            X.3FF r4 = new X.3FF
            r4.<init>(r6, r8)
            goto L_0x0012
        L_0x008e:
            r0 = 10
            int r0 = X.C29351c6.A0C(r5, r0)
            int r1 = X.C200610r.A03(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x009e
            r1 = 16
        L_0x009e:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r1)
            java.util.Iterator r3 = r5.iterator()
        L_0x00a7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r2 = r3.next()
            X.1D6 r2 = (X.AnonymousClass1D6) r2
            java.lang.Object r1 = r2.first
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid"
            X.C18070vi.A0z(r1, r0)
            java.lang.Object r0 = r2.second
            r4.put(r1, r0)
            goto L_0x00a7
        L_0x00c0:
            return r4
        L_0x00c1:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.CommunityMembersDirectory.BOz(X.1EC, X.1dr):java.lang.Object");
    }

    public Set BP3(AnonymousClass1EC r4) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.A05.A06(r4) == 1) {
            linkedHashSet.add(r4);
            AnonymousClass1EC A002 = A00(this, r4);
            if (A002 != null && this.A06.A0J(A002)) {
                linkedHashSet.add(A002);
            }
        }
        return C29431cG.A12(linkedHashSet);
    }
}
