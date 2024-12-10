package com.whatsapp.avatar.prefetch;

import X.AnonymousClass000;
import X.AnonymousClass1H7;
import X.AnonymousClass1OB;
import X.AnonymousClass1OX;
import X.C108995ce;
import X.C18070vi;
import X.C18600wl;
import X.C24327BzO;
import X.C25184Caa;
import X.C25236CbX;
import X.C25724Cku;
import X.C26027Cql;
import X.C26651D8a;
import X.C29351c6;
import X.C54682eX;
import X.C55472fp;
import X.C72473Md;
import X.COK;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;

public final class AvatarPrefetchController {
    public AnonymousClass1OB A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C26651D8a A05;
    public final C25724Cku A06;
    public final C54682eX A07;
    public final COK A08;
    public final C55472fp A09;
    public final C18600wl A0A;
    public final AnonymousClass1OX A0B;

    public static final List A01(C25236CbX cbX) {
        C18070vi.A0d(cbX, 0);
        List<Map> list = cbX.A06;
        ArrayList A0D = C29351c6.A0D(list);
        for (Map map : list) {
            String valueOf = String.valueOf(map.get("category_id"));
            String valueOf2 = String.valueOf(map.get("choice_id"));
            Object obj = map.get("priority");
            C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.Int");
            int A0M = AnonymousClass000.A0M(obj);
            C24327BzO[] values = C24327BzO.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                C24327BzO bzO = values[i];
                if (bzO.index == A0M) {
                    A0D.add(new C25184Caa(bzO, valueOf, valueOf2));
                } else {
                    i++;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return A0D;
    }

    public final synchronized void A02() {
        AnonymousClass1OB r1 = this.A00;
        if (r1 != null) {
            r1.BEM((CancellationException) null);
        }
        this.A04 = false;
        this.A03 = false;
        this.A02 = false;
        this.A01 = false;
        AnonymousClass1H7 r12 = this.A08.A00.A00;
        ((C26027Cql) r12.A01()).A02();
        r12.A02();
        this.A06.A01();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014e A[LOOP:2: B:66:0x0148->B:68:0x014e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C26651D8a r8, com.whatsapp.avatar.prefetch.AvatarPrefetchController r9, X.C25236CbX r10, X.C30391dr r11) {
        /*
            boolean r0 = r11 instanceof X.C27423Dde
            if (r0 == 0) goto L_0x01e4
            r4 = r11
            X.Dde r4 = (X.C27423Dde) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01e4
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r2 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r4.label
            r6 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r0) goto L_0x0085
            if (r1 != r6) goto L_0x01eb
            X.C30691eM.A01(r2)
        L_0x0023:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0026:
            X.C30691eM.A01(r2)
            r4.L$0 = r9
            r4.L$1 = r8
            r4.L$2 = r10
            r4.label = r0
            java.util.Map r7 = r10.A07
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            r9.A03 = r0
            java.lang.String r3 = X.C108985cd.A0f()
            java.util.Map r2 = r10.A09
            r1 = 0
            if (r2 == 0) goto L_0x004a
            java.lang.String r0 = "pinAvatar"
            java.lang.Object r1 = r2.get(r0)
        L_0x004a:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0079
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x0079
            boolean r0 = r1.booleanValue()
        L_0x0056:
            r2 = 0
            X.1g7 r1 = X.C72473Md.A0m(r4)
            r8.A00 = r3
            r8.A03 = r0
            r8.A02 = r1
            java.lang.ref.WeakReference r0 = r8.A01
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r0.get()
            X.E4O r0 = (X.E4O) r0
            if (r0 == 0) goto L_0x007e
            X.DBR r0 = (X.DBR) r0
            X.EAU r0 = r0.A00
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "aleBridge"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0079:
            r0 = 0
            goto L_0x0056
        L_0x007b:
            r0.CCG(r3, r7)
        L_0x007e:
            java.lang.Object r0 = r1.A0C()
            if (r0 != r5) goto L_0x0094
            return r5
        L_0x0085:
            java.lang.Object r10 = r4.L$2
            X.CbX r10 = (X.C25236CbX) r10
            java.lang.Object r8 = r4.L$1
            X.D8a r8 = (X.C26651D8a) r8
            java.lang.Object r9 = r4.L$0
            com.whatsapp.avatar.prefetch.AvatarPrefetchController r9 = (com.whatsapp.avatar.prefetch.AvatarPrefetchController) r9
            X.C30691eM.A01(r2)
        L_0x0094:
            r5 = 0
            r4.L$0 = r5
            r4.L$1 = r5
            r4.L$2 = r5
            r4.label = r6
            java.util.List r0 = A01(r10)
            boolean r0 = X.AnonymousClass000.A1a(r0)
            r9.A02 = r0
            java.util.List r9 = A01(r10)
            java.lang.String r4 = r10.A04
            if (r4 == 0) goto L_0x00d5
            r0 = 4
            java.lang.Integer[] r3 = X.AnonymousClass00R.A00(r0)
            int r2 = r3.length
            r1 = 0
        L_0x00b6:
            if (r1 >= r2) goto L_0x00d5
            r0 = r3[r1]
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x00d2;
                case 2: goto L_0x00cf;
                case 3: goto L_0x00cc;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            java.lang.String r0 = "app_job"
        L_0x00c3:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00d5
            int r1 = r1 + 1
            goto L_0x00b6
        L_0x00cc:
            java.lang.String r0 = "external_surface"
            goto L_0x00c3
        L_0x00cf:
            java.lang.String r0 = "avatar_surface"
            goto L_0x00c3
        L_0x00d2:
            java.lang.String r0 = "avatar_editor"
            goto L_0x00c3
        L_0x00d5:
            java.util.Map r1 = r10.A09
            r7 = 0
            if (r1 == 0) goto L_0x0125
            java.lang.String r0 = "prefetchCacheType"
            java.lang.Object r1 = r1.get(r0)
        L_0x00e0:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x00e7
            r7 = r1
            java.lang.Integer r7 = (java.lang.Integer) r7
        L_0x00e7:
            java.lang.ref.WeakReference r0 = r8.A01
            if (r0 == 0) goto L_0x0023
            java.lang.Object r8 = r0.get()
            X.E4O r8 = (X.E4O) r8
            if (r8 == 0) goto L_0x0023
            java.util.UUID r0 = X.C8y.A00()
            java.lang.String r6 = X.C18070vi.A0H(r0)
            java.util.LinkedHashMap r4 = X.C17880vN.A13()
            java.util.Iterator r3 = r9.iterator()
        L_0x0103:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0127
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Caa r0 = (X.C25184Caa) r0
            X.BzO r1 = r0.A00
            java.lang.Object r0 = r4.get(r1)
            if (r0 != 0) goto L_0x011f
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r4.put(r1, r0)
        L_0x011f:
            java.util.List r0 = (java.util.List) r0
            r0.add(r2)
            goto L_0x0103
        L_0x0125:
            r1 = r7
            goto L_0x00e0
        L_0x0127:
            X.Dta r2 = X.C28218Dta.A00
            r1 = 4
            X.DUP r0 = new X.DUP
            r0.<init>(r2, r1)
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>(r0)
            r1.putAll(r4)
            int r0 = r1.size()
            int r0 = X.C200610r.A03(r0)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r0)
            java.util.Iterator r3 = X.C17890vO.A0i(r1)
        L_0x0148:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0166
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r3)
            java.lang.Object r0 = r2.getKey()
            X.BzO r0 = (X.C24327BzO) r0
            int r0 = r0.index
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r2.getValue()
            r4.put(r1, r0)
            goto L_0x0148
        L_0x0166:
            java.util.LinkedHashMap r9 = X.C108995ce.A0b(r4)
            java.util.Iterator r4 = X.AnonymousClass000.A15(r4)
        L_0x016e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01a3
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r4)
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            X.C18070vi.A0b(r0)
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x018d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x019f
            java.lang.Object r0 = r1.next()
            X.Caa r0 = (X.C25184Caa) r0
            java.lang.String r0 = r0.A01
            r2.add(r0)
            goto L_0x018d
        L_0x019f:
            r9.put(r3, r2)
            goto L_0x016e
        L_0x01a3:
            java.util.Iterator r9 = X.AnonymousClass000.A15(r9)
        L_0x01a7:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0023
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r9)
            int r4 = X.AnonymousClass8BV.A04(r0)
            java.lang.Object r3 = r0.getValue()
            java.util.List r3 = (java.util.List) r3
            r2 = r8
            X.DBR r2 = (X.DBR) r2
            r0 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass3MZ.A19(r3, r0)
            java.lang.String r0 = "prefetchCacheType: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", prefetchAssets: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r3, r0, r1)
            java.lang.String r0 = "AleProviderImpl"
            X.C26294Cx6.A04(r0, r1)
            X.EAU r0 = r2.A00
            if (r0 != 0) goto L_0x01e0
            java.lang.String r0 = "aleBridge"
            X.C18070vi.A11(r0)
            throw r5
        L_0x01e0:
            r0.CCF(r7, r6, r3, r4)
            goto L_0x01a7
        L_0x01e4:
            X.Dde r4 = new X.Dde
            r4.<init>(r9, r11)
            goto L_0x0012
        L_0x01eb:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avatar.prefetch.AvatarPrefetchController.A00(X.D8a, com.whatsapp.avatar.prefetch.AvatarPrefetchController, X.CbX, X.1dr):java.lang.Object");
    }

    public AvatarPrefetchController(C26651D8a d8a, C25724Cku cku, C54682eX r4, COK cok, C55472fp r6, C18600wl r7) {
        C18070vi.A0j(d8a, cku);
        C72473Md.A1J(r6, r7);
        this.A05 = d8a;
        this.A06 = cku;
        this.A07 = r4;
        this.A08 = cok;
        this.A09 = r6;
        this.A0A = r7;
        this.A0B = C108995ce.A0f(r7);
    }
}
