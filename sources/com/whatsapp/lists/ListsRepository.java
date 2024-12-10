package com.whatsapp.lists;

import X.AnonymousClass00H;
import X.AnonymousClass10T;
import X.AnonymousClass1BI;
import X.AnonymousClass1KB;
import X.AnonymousClass1NN;
import X.AnonymousClass35V;
import X.C18070vi;
import X.C18600wl;
import X.C19880zA;
import X.C200510q;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30451dy;
import X.C31751g4;
import X.C41601wk;
import X.C41761x1;
import X.C96994ok;
import X.C97014om;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ListsRepository {
    public final C19880zA A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final Map A0A = C200510q.A02(new ConcurrentHashMap(), C41601wk.A00);
    public final C18600wl A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final C18600wl A0E;
    public volatile boolean A0F;

    public ListsRepository(C19880zA r3, AnonymousClass1KB r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, C18600wl r15, C18600wl r16) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r7, 4);
        C18070vi.A0d(r8, 5);
        C18070vi.A0d(r9, 6);
        C18070vi.A0d(r10, 7);
        C18070vi.A0d(r11, 8);
        C18070vi.A0d(r12, 9);
        C18070vi.A0d(r13, 10);
        C18070vi.A0d(r3, 11);
        C18070vi.A0d(r14, 12);
        C18070vi.A0d(r15, 13);
        C18600wl r1 = r16;
        C18070vi.A0d(r1, 14);
        this.A01 = r4;
        this.A08 = r5;
        this.A07 = r6;
        this.A05 = r7;
        this.A02 = r8;
        this.A0D = r9;
        this.A09 = r10;
        this.A0C = r11;
        this.A04 = r12;
        this.A06 = r13;
        this.A00 = r3;
        this.A03 = r14;
        this.A0B = r15;
        this.A0E = r1;
    }

    public static final void A00(ListsRepository listsRepository, List list, List list2, boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList(C29351c6.A0C(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((C41761x1) it.next()).A03));
            }
            ((AnonymousClass10T) listsRepository.A0D.get()).notifyAllObservers(new C97014om(C29431cG.A1C(arrayList), 0));
        } else {
            for (Object r3 : list2) {
                ((AnonymousClass10T) listsRepository.A0D.get()).notifyAllObservers(new AnonymousClass35V(r3, 0));
            }
        }
        if (!list.isEmpty()) {
            ((AnonymousClass10T) listsRepository.A0D.get()).notifyAllObservers(new C96994ok(3));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((AnonymousClass1NN) listsRepository.A0C.get()).A02((AnonymousClass1BI) it2.next());
            }
            ((AnonymousClass1NN) listsRepository.A0C.get()).A01(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e3, code lost:
        if (r8 == -2) goto L_0x00e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C41761x1 r29, java.lang.String r30, X.C30391dr r31) {
        /*
            r28 = this;
            r3 = r31
            r15 = r29
            boolean r0 = r3 instanceof X.AnonymousClass3FX
            r14 = r28
            if (r0 == 0) goto L_0x00d0
            r13 = r3
            X.3FX r13 = (X.AnonymousClass3FX) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d0
            int r2 = r2 - r1
            r13.label = r2
        L_0x0018:
            java.lang.Object r1 = r13.result
            X.1g4 r12 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r13.label
            r11 = 2
            r2 = 1
            r10 = 0
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x007a
            if (r0 != r11) goto L_0x00d7
            long r8 = r13.J$0
            java.lang.Object r15 = r13.L$0
            X.1x1 r15 = (X.C41761x1) r15
            X.C30691eM.A01(r1)
        L_0x0030:
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00df
            X.42Y r0 = new X.42Y
            r0.<init>(r15)
            return r0
        L_0x003c:
            X.C30691eM.A01(r1)
            r1 = r30
            java.lang.CharSequence r0 = X.AnonymousClass1YF.A0G(r1)
            java.lang.String r7 = r0.toString()
            int r0 = r15.A02
            if (r0 != 0) goto L_0x00e8
            int r0 = r7.length()
            if (r0 != 0) goto L_0x0056
            X.42a r0 = X.C820742a.A00
            return r0
        L_0x0056:
            X.00H r0 = r14.A09
            java.lang.Object r0 = r0.get()
            X.1wu r0 = (X.C41691wu) r0
            boolean r0 = r0.A02(r1)
            if (r0 != 0) goto L_0x00e5
            X.0wl r1 = r14.A0B
            com.whatsapp.lists.ListsRepository$updateListName$status$1 r0 = new com.whatsapp.lists.ListsRepository$updateListName$status$1
            r0.<init>(r15, r14, r7, r10)
            r13.L$0 = r14
            r13.L$1 = r15
            r13.L$2 = r7
            r13.label = r2
            java.lang.Object r1 = X.C30451dy.A00(r13, r1, r0)
            if (r1 != r12) goto L_0x0089
            return r12
        L_0x007a:
            java.lang.Object r7 = r13.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r15 = r13.L$1
            X.1x1 r15 = (X.C41761x1) r15
            java.lang.Object r14 = r13.L$0
            com.whatsapp.lists.ListsRepository r14 = (com.whatsapp.lists.ListsRepository) r14
            X.C30691eM.A01(r1)
        L_0x0089:
            java.lang.Number r1 = (java.lang.Number) r1
            long r8 = r1.longValue()
            int r0 = r15.A02
            r27 = r0
            long r5 = r15.A03
            long r3 = r15.A04
            int r0 = r15.A01
            r17 = r0
            long r1 = r15.A05
            boolean r0 = r15.A07
            r16 = r0
            int r0 = r15.A00
            X.1x1 r15 = new X.1x1
            r22 = r3
            r24 = r1
            r26 = r16
            r18 = r17
            r19 = r0
            r20 = r5
            r16 = r7
            r17 = r27
            r15.<init>(r16, r17, r18, r19, r20, r22, r24, r26)
            X.0wl r1 = r14.A0E
            com.whatsapp.lists.ListsRepository$updateListName$2 r0 = new com.whatsapp.lists.ListsRepository$updateListName$2
            r0.<init>(r15, r14, r10)
            r13.L$0 = r15
            r13.L$1 = r10
            r13.L$2 = r10
            r13.J$0 = r8
            r13.label = r11
            java.lang.Object r0 = X.C30451dy.A00(r13, r1, r0)
            if (r0 != r12) goto L_0x0030
            return r12
        L_0x00d0:
            X.3FX r13 = new X.3FX
            r13.<init>(r14, r3)
            goto L_0x0018
        L_0x00d7:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00df:
            r1 = -2
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00e8
        L_0x00e5:
            X.42Z r0 = X.AnonymousClass42Z.A00
            return r0
        L_0x00e8:
            X.42b r0 = X.AnonymousClass42b.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsRepository.A01(X.1x1, java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        if (X.C30451dy.A00(r7, r1, r0) != r6) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C41761x1 r9, java.util.List r10, X.C30391dr r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.AnonymousClass3FV
            if (r0 == 0) goto L_0x0079
            r7 = r11
            X.3FV r7 = (X.AnonymousClass3FV) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0079
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r1 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 2
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x002c
            if (r0 != r5) goto L_0x007f
            int r3 = r7.I$0
            X.C30691eM.A01(r1)
        L_0x0026:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r3)
            return r0
        L_0x002c:
            java.lang.Object r10 = r7.L$2
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r9 = r7.L$1
            X.1x1 r9 = (X.C41761x1) r9
            java.lang.Object r2 = r7.L$0
            com.whatsapp.lists.ListsRepository r2 = (com.whatsapp.lists.ListsRepository) r2
            X.C30691eM.A01(r1)
            goto L_0x005b
        L_0x003c:
            X.C30691eM.A01(r1)
            int r0 = r9.A02
            if (r0 == 0) goto L_0x0045
            r3 = -3
            goto L_0x0026
        L_0x0045:
            X.0wl r1 = r8.A0B
            com.whatsapp.lists.ListsRepository$deleteListsChatJids$status$1 r0 = new com.whatsapp.lists.ListsRepository$deleteListsChatJids$status$1
            r0.<init>(r9, r8, r10, r4)
            r7.L$0 = r8
            r7.L$1 = r9
            r7.L$2 = r10
            r7.label = r2
            java.lang.Object r1 = X.C30451dy.A00(r7, r1, r0)
            if (r1 == r6) goto L_0x0078
            r2 = r8
        L_0x005b:
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0wl r1 = r2.A0E
            com.whatsapp.lists.ListsRepository$deleteListsChatJids$2 r0 = new com.whatsapp.lists.ListsRepository$deleteListsChatJids$2
            r0.<init>(r9, r2, r10, r4)
            r7.L$0 = r4
            r7.L$1 = r4
            r7.L$2 = r4
            r7.I$0 = r3
            r7.label = r5
            java.lang.Object r0 = X.C30451dy.A00(r7, r1, r0)
            if (r0 != r6) goto L_0x0026
        L_0x0078:
            return r6
        L_0x0079:
            X.3FV r7 = new X.3FV
            r7.<init>(r8, r11)
            goto L_0x0012
        L_0x007f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsRepository.A02(X.1x1, java.util.List, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C41761x1 r9, java.util.List r10, X.C30391dr r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.AnonymousClass3FT
            if (r0 == 0) goto L_0x007f
            r5 = r11
            X.3FT r5 = (X.AnonymousClass3FT) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007f
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r7 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r7) goto L_0x0085
            java.lang.Object r9 = r5.L$2
            java.lang.Object r10 = r5.L$1
            java.lang.Object r3 = r5.L$0
            com.whatsapp.lists.ListsRepository r3 = (com.whatsapp.lists.ListsRepository) r3
            X.C30691eM.A01(r1)
        L_0x0028:
            X.1KB r2 = r3.A01
            r1 = 12
            X.7R0 r0 = new X.7R0
            r0.<init>(r3, r10, r9, r1)
            r2.A0J(r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0037:
            X.C30691eM.A01(r1)
            X.00H r0 = r8.A04
            java.lang.Object r6 = r0.get()
            com.whatsapp.favorite.FavoriteManager r6 = (com.whatsapp.favorite.FavoriteManager) r6
            r0 = 10
            int r0 = X.C29351c6.A0C(r10, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r2 = r10.iterator()
        L_0x0051:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r1 = r2.next()
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.2rT r0 = new X.2rT
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0051
        L_0x0066:
            r5.L$0 = r8
            r5.L$1 = r10
            r5.L$2 = r9
            r5.label = r7
            X.0wl r2 = r6.A08
            r1 = 0
            com.whatsapp.favorite.FavoriteManager$reorderFavoriteJids$2 r0 = new com.whatsapp.favorite.FavoriteManager$reorderFavoriteJids$2
            r0.<init>(r6, r3, r1)
            java.lang.Object r0 = X.C30451dy.A00(r5, r2, r0)
            if (r0 != r4) goto L_0x007d
            return r4
        L_0x007d:
            r3 = r8
            goto L_0x0028
        L_0x007f:
            X.3FT r5 = new X.3FT
            r5.<init>(r8, r11)
            goto L_0x0012
        L_0x0085:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsRepository.A03(X.1x1, java.util.List, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C41761x1 r7, X.C30391dr r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C41871xD
            if (r0 == 0) goto L_0x0056
            r5 = r8
            X.1xD r5 = (X.C41871xD) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0056
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 == r2) goto L_0x0064
            if (r0 != r3) goto L_0x005c
            X.C30691eM.A01(r1)
        L_0x0023:
            X.C18070vi.A0a(r1)
        L_0x0026:
            return r1
        L_0x0027:
            X.C30691eM.A01(r1)
            int r1 = r7.A02
            r0 = 4
            if (r1 != r0) goto L_0x0040
            r5.label = r2
            X.0wl r2 = r6.A0B
            r1 = 0
            com.whatsapp.lists.ListsRepository$getFavoriteConversations$2 r0 = new com.whatsapp.lists.ListsRepository$getFavoriteConversations$2
            r0.<init>(r6, r1)
            java.lang.Object r1 = X.C30451dy.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0026
            return r4
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            X.0wS r1 = X.C18460wS.A00
            return r1
        L_0x0045:
            X.0wl r2 = r6.A0B
            r1 = 0
            com.whatsapp.lists.ListsRepository$getConversations$2 r0 = new com.whatsapp.lists.ListsRepository$getConversations$2
            r0.<init>(r7, r6, r1)
            r5.label = r3
            java.lang.Object r1 = X.C30451dy.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0023
            return r4
        L_0x0056:
            X.1xD r5 = new X.1xD
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x005c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0064:
            X.C30691eM.A01(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsRepository.A04(X.1x1, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.C41761x1 r16, X.C30391dr r17, long r18, boolean r20) {
        /*
            r15 = this;
            r3 = r17
            r9 = r16
            r14 = r20
            boolean r0 = r3 instanceof X.AnonymousClass3FW
            r10 = r15
            if (r0 == 0) goto L_0x0084
            r7 = r3
            X.3FW r7 = (X.AnonymousClass3FW) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0084
            int r2 = r2 - r1
            r7.label = r2
        L_0x0019:
            java.lang.Object r3 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r1) goto L_0x005a
            if (r0 != r5) goto L_0x008a
            long r1 = r7.J$0
            X.C30691eM.A01(r3)
        L_0x002c:
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            return r3
        L_0x0032:
            X.C30691eM.A01(r3)
            int r0 = r9.A02
            if (r0 != 0) goto L_0x0041
            r0 = -3
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
            return r3
        L_0x0041:
            X.0wl r0 = r15.A0B
            r11 = 0
            com.whatsapp.lists.ListsRepository$updateListHidden$status$1 r8 = new com.whatsapp.lists.ListsRepository$updateListHidden$status$1
            r12 = r18
            r8.<init>(r9, r10, r11, r12, r14)
            r7.L$0 = r15
            r7.L$1 = r9
            r7.Z$0 = r14
            r7.label = r1
            java.lang.Object r3 = X.C30451dy.A00(r7, r0, r8)
            if (r3 != r6) goto L_0x0067
            return r6
        L_0x005a:
            boolean r14 = r7.Z$0
            java.lang.Object r9 = r7.L$1
            X.1x1 r9 = (X.C41761x1) r9
            java.lang.Object r10 = r7.L$0
            com.whatsapp.lists.ListsRepository r10 = (com.whatsapp.lists.ListsRepository) r10
            X.C30691eM.A01(r3)
        L_0x0067:
            java.lang.Number r3 = (java.lang.Number) r3
            long r1 = r3.longValue()
            X.0wl r4 = r10.A0E
            r3 = 0
            com.whatsapp.lists.ListsRepository$updateListHidden$2 r0 = new com.whatsapp.lists.ListsRepository$updateListHidden$2
            r0.<init>(r9, r10, r3, r14)
            r7.L$0 = r3
            r7.L$1 = r3
            r7.J$0 = r1
            r7.label = r5
            java.lang.Object r0 = X.C30451dy.A00(r7, r4, r0)
            if (r0 != r6) goto L_0x002c
            return r6
        L_0x0084:
            X.3FW r7 = new X.3FW
            r7.<init>(r15, r3)
            goto L_0x0019
        L_0x008a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsRepository.A05(X.1x1, X.1dr, long, boolean):java.lang.Object");
    }

    public final Object A06(Collection collection, C30391dr r5) {
        Object A002 = C30451dy.A00(r5, this.A0B, new ListsRepository$deleteLabels$2(this, collection, (C30391dr) null));
        if (A002 != C31751g4.COROUTINE_SUSPENDED) {
            return C27621Wu.A00;
        }
        return A002;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r2 == r3) goto L_0x0053;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(X.C30391dr r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.AnonymousClass3FB
            if (r0 == 0) goto L_0x0054
            r4 = r6
            X.3FB r4 = (X.AnonymousClass3FB) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0054
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r2 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 != r0) goto L_0x005a
            X.C30691eM.A01(r2)
        L_0x0020:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x002b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1x1 r0 = (X.C41761x1) r0
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x002b
            r3.add(r1)
            goto L_0x002b
        L_0x0040:
            X.C30691eM.A01(r2)
            r4.label = r0
            X.0wl r2 = r5.A0B
            r1 = 0
            com.whatsapp.lists.ListsRepository$getListsIncludingHidden$2 r0 = new com.whatsapp.lists.ListsRepository$getListsIncludingHidden$2
            r0.<init>(r5, r1)
            java.lang.Object r2 = X.C30451dy.A00(r4, r2, r0)
            if (r2 != r3) goto L_0x0020
        L_0x0053:
            return r3
        L_0x0054:
            X.3FB r4 = new X.3FB
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x005a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsRepository.A07(X.1dr):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r2 == r3) goto L_0x0055;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(X.C30391dr r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C41631wn
            if (r0 == 0) goto L_0x0056
            r4 = r6
            X.1wn r4 = (X.C41631wn) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0056
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r2 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L_0x0042
            if (r1 != r0) goto L_0x005c
            X.C30691eM.A01(r2)
        L_0x0020:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x002b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1x1 r0 = (X.C41761x1) r0
            boolean r0 = r0.A07
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002b
            r3.add(r1)
            goto L_0x002b
        L_0x0042:
            X.C30691eM.A01(r2)
            r4.label = r0
            X.0wl r2 = r5.A0B
            r1 = 0
            com.whatsapp.lists.ListsRepository$getListsIncludingHidden$2 r0 = new com.whatsapp.lists.ListsRepository$getListsIncludingHidden$2
            r0.<init>(r5, r1)
            java.lang.Object r2 = X.C30451dy.A00(r4, r2, r0)
            if (r2 != r3) goto L_0x0020
        L_0x0055:
            return r3
        L_0x0056:
            X.1wn r4 = new X.1wn
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x005c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsRepository.A08(X.1dr):java.lang.Object");
    }
}
