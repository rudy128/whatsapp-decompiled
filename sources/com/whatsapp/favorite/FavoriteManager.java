package com.whatsapp.favorite;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1E2;
import X.AnonymousClass1EC;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1OX;
import X.AnonymousClass1TI;
import X.C18070vi;
import X.C18100vl;
import X.C18110vm;
import X.C18600wl;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30451dy;
import X.C31751g4;
import X.C39521tD;
import X.C41891xG;
import X.C41901xH;
import X.C41911xI;
import X.C41921xJ;
import X.C41931xL;
import X.C62482rT;
import com.whatsapp.jid.PhoneUserJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

public final class FavoriteManager implements C41921xJ {
    public final AnonymousClass1KB A00;
    public final C41911xI A01;
    public final AnonymousClass1M9 A02;
    public final C39521tD A03;
    public final C41891xG A04;
    public final AnonymousClass00H A05;
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final C18100vl A07 = new C18110vm(new C41931xL(this));
    public final C18600wl A08;
    public final C18600wl A09;
    public final C41901xH A0A;
    public final AnonymousClass1OX A0B;

    public FavoriteManager(AnonymousClass1KB r3, C41911xI r4, AnonymousClass1M9 r5, C41901xH r6, C39521tD r7, C41891xG r8, AnonymousClass00H r9, C18600wl r10, C18600wl r11, AnonymousClass1OX r12) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r9, 2);
        C18070vi.A0d(r8, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        C18070vi.A0d(r7, 6);
        C18070vi.A0d(r4, 7);
        C18070vi.A0d(r10, 8);
        C18070vi.A0d(r11, 9);
        C18070vi.A0d(r12, 10);
        this.A00 = r3;
        this.A05 = r9;
        this.A04 = r8;
        this.A02 = r5;
        this.A0A = r6;
        this.A03 = r7;
        this.A01 = r4;
        this.A08 = r10;
        this.A09 = r11;
        this.A0B = r12;
    }

    public void A05(AnonymousClass1TI r10, Collection collection, int i) {
        Collection collection2 = collection;
        C18070vi.A0d(collection, 0);
        if (!collection.isEmpty()) {
            AnonymousClass1OX r2 = this.A0B;
            C30451dy.A02(AnonymousClass00R.A00, this.A08, new FavoriteManager$deleteFavoritesJids$1(this, r10, collection2, (C30391dr) null, i), r2);
        }
    }

    public void A06(String str, String str2, Collection collection, int i) {
        Collection collection2 = collection;
        C18070vi.A0d(collection, 0);
        if (!collection.isEmpty()) {
            AnonymousClass1OX r2 = this.A0B;
            C30451dy.A02(AnonymousClass00R.A00, this.A08, new FavoriteManager$insertFavoritesJids$1(this, str2, str, collection2, (C30391dr) null, i), r2);
        }
    }

    public final boolean A08(Collection collection) {
        C18070vi.A0d(collection, 0);
        for (Object next : collection) {
            C18070vi.A0d(next, 0);
            if (!(next instanceof AnonymousClass1EC) && !(next instanceof AnonymousClass1E2) && !(next instanceof PhoneUserJid)) {
                return false;
            }
        }
        if (!this.A06.get() || ((AbstractCollection) this.A07.getValue()).containsAll(collection)) {
            return false;
        }
        return true;
    }

    public final boolean A09(Collection collection) {
        C18070vi.A0d(collection, 0);
        if (!this.A06.get() || !((AbstractCollection) this.A07.getValue()).containsAll(collection)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.favorite.FavoriteManager r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.AnonymousClass3FK
            if (r0 == 0) goto L_0x0055
            r6 = r8
            X.3FK r6 = (X.AnonymousClass3FK) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0055
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0027
            if (r0 == r3) goto L_0x003c
            if (r0 != r4) goto L_0x005b
            X.C30691eM.A01(r1)
        L_0x0024:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0027:
            X.C30691eM.A01(r1)
            X.0wl r1 = r7.A09
            com.whatsapp.favorite.FavoriteManager$notifyObservers$2 r0 = new com.whatsapp.favorite.FavoriteManager$notifyObservers$2
            r0.<init>(r7, r2)
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r0 = X.C30451dy.A00(r6, r1, r0)
            if (r0 != r5) goto L_0x0043
            return r5
        L_0x003c:
            java.lang.Object r7 = r6.L$0
            com.whatsapp.favorite.FavoriteManager r7 = (com.whatsapp.favorite.FavoriteManager) r7
            X.C30691eM.A01(r1)
        L_0x0043:
            X.0wl r1 = r7.A08
            com.whatsapp.favorite.FavoriteManager$notifyObservers$3 r0 = new com.whatsapp.favorite.FavoriteManager$notifyObservers$3
            r0.<init>(r7, r2)
            r6.L$0 = r2
            r6.label = r4
            java.lang.Object r0 = X.C30451dy.A00(r6, r1, r0)
            if (r0 != r5) goto L_0x0024
            return r5
        L_0x0055:
            X.3FK r6 = new X.3FK
            r6.<init>(r7, r8)
            goto L_0x0012
        L_0x005b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.favorite.FavoriteManager.A00(com.whatsapp.favorite.FavoriteManager, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("FavoriteStore/deleteFavorite failed to delete favorite: ");
        r1.append(r7);
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b0, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009b */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C62482rT r12, java.lang.Integer r13, X.C30391dr r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.AnonymousClass3FI
            if (r0 == 0) goto L_0x00c1
            r4 = r14
            X.3FI r4 = (X.AnonymousClass3FI) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c1
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r2 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r5 = 1
            if (r0 == 0) goto L_0x0023
            if (r0 != r5) goto L_0x00c8
            java.lang.Object r1 = r4.L$0
            X.C30691eM.A01(r2)
        L_0x0022:
            return r1
        L_0x0023:
            X.C30691eM.A01(r2)
            if (r13 == 0) goto L_0x0043
            X.1xH r7 = r11.A0A
            X.0vl r0 = r11.A07
            java.lang.Object r6 = r0.getValue()
            java.util.concurrent.CopyOnWriteArraySet r6 = (java.util.concurrent.CopyOnWriteArraySet) r6
            X.1BI r0 = r12.A03
            java.util.List r2 = java.util.Collections.singletonList(r0)
            X.C18070vi.A0X(r2)
            r1 = 0
            int r0 = r13.intValue()
            r7.A03(r6, r2, r0, r1)
        L_0x0043:
            X.0vl r0 = r11.A07
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            X.1BI r7 = r12.A03
            r0.remove(r7)
            X.1xG r6 = r11.A04
            monitor-enter(r6)
            r2 = 0
            X.1Cd r0 = r6.A02     // Catch:{ all -> 0x009b }
            X.1au r9 = r0.A05()     // Catch:{ all -> 0x009b }
            r1 = r7
            boolean r0 = r7 instanceof X.AnonymousClass1E2     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x006f
            X.1NG r0 = r6.A04     // Catch:{ all -> 0x0094 }
            boolean r0 = r0.A04()     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x006f
            X.1Ln r0 = r6.A03     // Catch:{ all -> 0x0094 }
            X.1E1 r1 = (X.AnonymousClass1E1) r1     // Catch:{ all -> 0x0094 }
            com.whatsapp.jid.PhoneUserJid r1 = r0.A0D(r1)     // Catch:{ all -> 0x0094 }
        L_0x006f:
            if (r1 != 0) goto L_0x0072
            r1 = r7
        L_0x0072:
            X.1DL r0 = r6.A01     // Catch:{ all -> 0x0094 }
            long r0 = r0.A09(r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r10 = "jid_row_id = ?"
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0094 }
            r8[r2] = r0     // Catch:{ all -> 0x0094 }
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0094 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "favorite"
            java.lang.String r0 = "FavoriteStore/DELETE_FAVORITE_ROW_ID"
            int r0 = r2.A04(r1, r10, r0, r8)     // Catch:{ all -> 0x0094 }
            r9.close()     // Catch:{ all -> 0x009b }
            monitor-exit(r6)
            goto L_0x00b1
        L_0x0094:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x009b }
            throw r0     // Catch:{ all -> 0x009b }
        L_0x009b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r1.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "FavoriteStore/deleteFavorite failed to delete favorite: "
            r1.append(r0)     // Catch:{ all -> 0x00d0 }
            r1.append(r7)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d0 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00d0 }
            monitor-exit(r6)
            r0 = -1
        L_0x00b1:
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            r4.L$0 = r1
            r4.label = r5
            java.lang.Object r0 = A00(r11, r4)
            if (r0 != r3) goto L_0x0022
            return r3
        L_0x00c1:
            X.3FI r4 = new X.3FI
            r4.<init>(r11, r14)
            goto L_0x0012
        L_0x00c8:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.favorite.FavoriteManager.A01(X.2rT, java.lang.Integer, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0119, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011d, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.Integer r14, java.util.List r15, X.C30391dr r16) {
        /*
            r13 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.AnonymousClass3FJ
            if (r0 == 0) goto L_0x0137
            r5 = r3
            X.3FJ r5 = (X.AnonymousClass3FJ) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0137
            int r2 = r2 - r1
            r5.label = r2
        L_0x0014:
            java.lang.Object r2 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r3) goto L_0x013e
            java.lang.Object r1 = r5.L$0
            X.C30691eM.A01(r2)
        L_0x0024:
            return r1
        L_0x0025:
            X.C30691eM.A01(r2)
            X.1xG r2 = r13.A04
            java.util.List r0 = r2.A02()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r9 = r0.iterator()
        L_0x0037:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r8 = r9.next()
            r0 = r8
            X.2rT r0 = (X.C62482rT) r0
            long r0 = r0.A01
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r0)
            boolean r0 = r15.contains(r6)
            if (r0 == 0) goto L_0x0037
            r7.add(r8)
            goto L_0x0037
        L_0x0055:
            r0 = 10
            int r0 = X.C29351c6.A0C(r7, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r1 = r7.iterator()
        L_0x0064:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r1.next()
            X.2rT r0 = (X.C62482rT) r0
            X.1BI r0 = r0.A03
            r6.add(r0)
            goto L_0x0064
        L_0x0076:
            java.util.Set r8 = X.C29431cG.A12(r6)
            if (r14 == 0) goto L_0x008e
            X.1xH r7 = r13.A0A
            X.0vl r0 = r13.A07
            java.lang.Object r6 = r0.getValue()
            java.util.concurrent.CopyOnWriteArraySet r6 = (java.util.concurrent.CopyOnWriteArraySet) r6
            r1 = 0
            int r0 = r14.intValue()
            r7.A03(r6, r8, r0, r1)
        L_0x008e:
            X.0vl r0 = r13.A07
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.removeAll(r8)
            monitor-enter(r2)
            r11 = 0
            X.C18070vi.A0d(r15, r11)     // Catch:{ all -> 0x0146 }
            X.1Cd r0 = r2.A02     // Catch:{ all -> 0x011e }
            X.1au r6 = r0.A05()     // Catch:{ all -> 0x011e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            r8.<init>()     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "_id IN ("
            r8.append(r0)     // Catch:{ all -> 0x0117 }
            int r7 = r15.size()     // Catch:{ all -> 0x0117 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0117 }
            r9.<init>(r7)     // Catch:{ all -> 0x0117 }
            r1 = 0
        L_0x00b8:
            if (r1 >= r7) goto L_0x00c2
            java.lang.String r0 = "?"
            r9.add(r0)     // Catch:{ all -> 0x0117 }
            int r1 = r1 + 1
            goto L_0x00b8
        L_0x00c2:
            java.lang.String r7 = ","
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r0 = X.C29431cG.A0g(r7, r0, r0, r9, r1)     // Catch:{ all -> 0x0117 }
            r8.append(r0)     // Catch:{ all -> 0x0117 }
            r0 = 41
            r8.append(r0)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = r8.toString()     // Catch:{ all -> 0x0117 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0117 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0117 }
            java.lang.String r7 = "favorite"
            r0 = 10
            int r0 = X.C29351c6.A0C(r15, r0)     // Catch:{ all -> 0x0117 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0117 }
            r10.<init>(r0)     // Catch:{ all -> 0x0117 }
            java.util.Iterator r12 = r15.iterator()     // Catch:{ all -> 0x0117 }
        L_0x00ed:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x0117 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x0117 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0117 }
            r10.add(r0)     // Catch:{ all -> 0x0117 }
            goto L_0x00ed
        L_0x0105:
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ all -> 0x0117 }
            java.lang.Object[] r1 = r10.toArray(r0)     // Catch:{ all -> 0x0117 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "FavoriteStore/DELETE_FAVORITE_ROW_IDS"
            int r0 = r8.A04(r7, r9, r0, r1)     // Catch:{ all -> 0x0117 }
            r6.close()     // Catch:{ all -> 0x011e }
            goto L_0x0126
        L_0x0117:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0119 }
        L_0x0119:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x011e }
            throw r0     // Catch:{ all -> 0x011e }
        L_0x011e:
            java.lang.String r0 = "FavoriteStore/deleteFavorites failed to delete favorite"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0146 }
            monitor-exit(r2)
            r0 = -1
            goto L_0x0127
        L_0x0126:
            monitor-exit(r2)
        L_0x0127:
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = A00(r13, r5)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x0137:
            X.3FJ r5 = new X.3FJ
            r5.<init>(r13, r3)
            goto L_0x0014
        L_0x013e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0146:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.favorite.FavoriteManager.A02(java.lang.Integer, java.util.List, X.1dr):java.lang.Object");
    }

    public final Object A03(Integer num, List list, C30391dr r9) {
        if (num != null) {
            C41901xH r5 = this.A0A;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.A07.getValue();
            ArrayList arrayList = new ArrayList(C29351c6.A0C(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C62482rT) it.next()).A03);
            }
            r5.A03(copyOnWriteArraySet, arrayList, num.intValue(), true);
        }
        this.A04.A03(list);
        AbstractCollection abstractCollection = (AbstractCollection) this.A07.getValue();
        ArrayList arrayList2 = new ArrayList(C29351c6.A0C(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C62482rT) it2.next()).A03);
        }
        abstractCollection.addAll(arrayList2);
        Object A002 = A00(this, r9);
        if (A002 != C31751g4.COROUTINE_SUSPENDED) {
            return C27621Wu.A00;
        }
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ab, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.util.List r15, X.C30391dr r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.AnonymousClass3FL
            if (r0 == 0) goto L_0x00ea
            r5 = r3
            X.3FL r5 = (X.AnonymousClass3FL) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ea
            int r2 = r2 - r1
            r5.label = r2
        L_0x0014:
            java.lang.Object r2 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r3) goto L_0x00f1
            java.lang.Object r1 = r5.L$0
            X.C30691eM.A01(r2)
        L_0x0024:
            return r1
        L_0x0025:
            X.C30691eM.A01(r2)
            X.1xG r2 = r14.A04
            r0 = 10
            int r0 = X.C29351c6.A0C(r15, r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            java.util.Iterator r6 = r15.iterator()
            r11 = 0
        L_0x003a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r1 = r6.next()
            int r0 = r11 + 1
            if (r11 >= 0) goto L_0x004d
            X.AnonymousClass1ZU.A0B()
            r1 = 0
            throw r1
        L_0x004d:
            X.2rT r1 = (X.C62482rT) r1
            long r12 = r1.A01
            X.1BI r10 = r1.A03
            X.2Qt r9 = r1.A02
            X.2rT r8 = new X.2rT
            r8.<init>(r9, r10, r11, r12)
            r7.add(r8)
            r11 = r0
            goto L_0x003a
        L_0x005f:
            monitor-enter(r2)
            X.1Cd r0 = r2.A02     // Catch:{ all -> 0x00ac }
            X.1au r8 = r0.A05()     // Catch:{ all -> 0x00ac }
            X.1xA r9 = r8.BD0()     // Catch:{ all -> 0x00a5 }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x009e }
            X.1Ev r12 = r0.A02     // Catch:{ all -> 0x009e }
            java.lang.String r11 = "favorite"
            java.lang.String r1 = "FavoriteStore/FAVORITE_DELETE_ALL_SET_ORDER"
            r0 = 0
            r12.A04(r11, r0, r1, r0)     // Catch:{ all -> 0x009e }
            java.util.Iterator r10 = r7.iterator()     // Catch:{ all -> 0x009e }
        L_0x007b:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x009e }
            X.2rT r0 = (X.C62482rT) r0     // Catch:{ all -> 0x009e }
            android.content.ContentValues r6 = X.C41891xG.A00(r0, r2)     // Catch:{ all -> 0x009e }
            java.lang.String r1 = "FavoriteStore/INSERT_FAVORITE_SET_ORDER"
            r0 = 5
            r12.A09(r11, r1, r6, r0)     // Catch:{ all -> 0x009e }
            goto L_0x007b
        L_0x0092:
            r9.A00()     // Catch:{ all -> 0x009e }
            X.1Wu r1 = X.C27621Wu.A00     // Catch:{ all -> 0x009e }
            r9.close()     // Catch:{ all -> 0x00a5 }
            r8.close()     // Catch:{ all -> 0x00ac }
            goto L_0x00b2
        L_0x009e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            X.1IU r1 = new X.1IU     // Catch:{ all -> 0x00f9 }
            r1.<init>(r0)     // Catch:{ all -> 0x00f9 }
        L_0x00b2:
            java.lang.Throwable r1 = X.C30671eK.A00(r1)     // Catch:{ all -> 0x00f9 }
            if (r1 == 0) goto L_0x00d9
            java.lang.String r0 = "FavoriteStore/failed to re-arrange"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00f9 }
            X.190 r8 = r2.A00     // Catch:{ all -> 0x00f9 }
            java.lang.String r6 = "FavoriteStore/setOrder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r1.<init>()     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "setOrder "
            r1.append(r0)     // Catch:{ all -> 0x00f9 }
            r1.append(r7)     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f9 }
            r8.A0G(r6, r0, r3)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r2)
            r0 = 0
            goto L_0x00db
        L_0x00d9:
            monitor-exit(r2)
            r0 = 1
        L_0x00db:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = A00(r14, r5)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x00ea:
            X.3FL r5 = new X.3FL
            r5.<init>(r14, r3)
            goto L_0x0014
        L_0x00f1:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x00f9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.favorite.FavoriteManager.A04(java.util.List, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(java.util.List r7) {
        /*
            r6 = this;
            X.1xG r5 = r6.A04
            monitor-enter(r5)
            X.1Cd r0 = r5.A02     // Catch:{ all -> 0x0021 }
            X.1au r4 = r0.A05()     // Catch:{ all -> 0x0021 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x001a }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x001a }
            java.lang.String r2 = "favorite"
            java.lang.String r1 = "FavoriteStore/DELETE_ALL_FAVORITE"
            r0 = 0
            r3.A04(r2, r0, r1, r0)     // Catch:{ all -> 0x001a }
            r4.close()     // Catch:{ all -> 0x0021 }
            goto L_0x0026
        L_0x001a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001c }
        L_0x001c:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0021 }
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x0021:
            java.lang.String r0 = "FavoriteStore/deleteAllFavorites failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0071 }
        L_0x0026:
            monitor-exit(r5)
            r5.A03(r7)
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A06
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0061
            X.0vl r1 = r6.A07
            java.lang.Object r0 = r1.getValue()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.clear()
            java.lang.Object r3 = r1.getValue()
            java.util.AbstractCollection r3 = (java.util.AbstractCollection) r3
            java.util.concurrent.CopyOnWriteArraySet r2 = new java.util.concurrent.CopyOnWriteArraySet
            r2.<init>()
            java.util.Iterator r1 = r7.iterator()
        L_0x004c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r1.next()
            X.2rT r0 = (X.C62482rT) r0
            X.1BI r0 = r0.A03
            r2.add(r0)
            goto L_0x004c
        L_0x005e:
            r3.addAll(r2)
        L_0x0061:
            X.1OX r3 = r6.A0B
            X.0wl r2 = r6.A08
            r0 = 0
            com.whatsapp.favorite.FavoriteManager$replaceAll$1 r1 = new com.whatsapp.favorite.FavoriteManager$replaceAll$1
            r1.<init>(r6, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.C30451dy.A02(r0, r2, r1, r3)
            return
        L_0x0071:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.favorite.FavoriteManager.A07(java.util.List):void");
    }

    public void BxC() {
    }
}
