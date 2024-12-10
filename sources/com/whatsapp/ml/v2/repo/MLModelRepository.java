package com.whatsapp.ml.v2.repo;

import X.AnonymousClass000;
import X.AnonymousClass1DF;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass708;
import X.AnonymousClass7x7;
import X.C108975cc;
import X.C122716Rq;
import X.C134406qX;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C18600wl;
import X.C221618v;
import X.C30391dr;
import X.C35911n2;
import X.C35921n3;
import X.C52342al;
import com.whatsapp.ml.v2.MLModelUtilV2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class MLModelRepository {
    public final MLModelUtilV2 A00;
    public final C134406qX A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(AnonymousClass7x7.A00);
    public final C18600wl A03;
    public final AnonymousClass1OX A04;
    public final C35911n2 A05 = new C35921n3();
    public final C52342al A06 = ((C52342al) C221618v.A01(32810));

    public final ArrayList A03(C122716Rq r6) {
        List<AnonymousClass708> A002 = this.A01.A00(r6);
        ArrayList A13 = AnonymousClass000.A13();
        for (AnonymousClass708 r1 : A002) {
            MLModelUtilV2 mLModelUtilV2 = this.A00;
            C18070vi.A0d(r1, 0);
            if (C108975cc.A1M(mLModelUtilV2.A03(r1))) {
                A13.add(r1);
            }
        }
        return A13;
    }

    public final void A05(AnonymousClass708 r5, C18090vk r6) {
        C18070vi.A0d(r5, 0);
        C52342al r0 = this.A06;
        String A002 = A00(r5);
        C18070vi.A0d(A002, 0);
        r0.A00.remove(A002);
        AnonymousClass3MW.A12(this.A02).remove(A01(r5));
        AnonymousClass3MW.A1X(this.A03, new MLModelRepository$removeModel$2(r5, this, (C30391dr) null, r6), this.A04);
    }

    public final boolean A06(AnonymousClass708 r9) {
        C18070vi.A0d(r9, 0);
        C52342al r1 = this.A06;
        String A002 = A00(r9);
        C18070vi.A0d(A002, 0);
        Map map = r1.A00;
        if (map.containsKey(A002)) {
            String A003 = A00(r9);
            C18070vi.A0d(A003, 0);
            if (map.get(A003) != null) {
                return true;
            }
            return false;
        }
        for (Object next : this.A01.A00(r9.A02)) {
            if (C18070vi.A18(next, r9)) {
                boolean A1M = C108975cc.A1M(this.A00.A03(r9));
                String A004 = A00(r9);
                if (A1M) {
                    C18070vi.A0d(A004, 0);
                    map.put(A004, next);
                    return true;
                }
                C18070vi.A0d(A004, 0);
                map.put(A004, (Object) null);
            }
        }
        boolean A1M2 = C108975cc.A1M(this.A00.A03(r9));
        String A005 = A00(r9);
        if (A1M2) {
            C18070vi.A0d(A005, 0);
            map.put(A005, r9);
            AnonymousClass3MW.A1X(this.A03, new MLModelRepository$contains$1(r9, this, (C30391dr) null), this.A04);
            return true;
        }
        C18070vi.A0d(A005, 0);
        map.put(A005, (Object) null);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass708 r10, X.C30391dr r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C147787Um
            if (r0 == 0) goto L_0x002e
            r5 = r11
            X.7Um r5 = (X.C147787Um) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002e
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r6 = r5.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r5.label
            r4 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r0) goto L_0x0034
            java.lang.Object r3 = r5.L$2
            X.1n2 r3 = (X.C35911n2) r3
            java.lang.Object r10 = r5.L$1
            X.708 r10 = (X.AnonymousClass708) r10
            java.lang.Object r5 = r5.L$0
            com.whatsapp.ml.v2.repo.MLModelRepository r5 = (com.whatsapp.ml.v2.repo.MLModelRepository) r5
            X.C30691eM.A01(r6)
            goto L_0x004e
        L_0x002e:
            X.7Um r5 = new X.7Um
            r5.<init>(r9, r11)
            goto L_0x0012
        L_0x0034:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0039:
            X.C30691eM.A01(r6)
            X.1n2 r3 = r9.A05
            r5.L$0 = r9
            r5.L$1 = r10
            r5.L$2 = r3
            r5.label = r0
            java.lang.Object r0 = r3.Bhx(r5)
            if (r0 != r2) goto L_0x004d
            return r2
        L_0x004d:
            r5 = r9
        L_0x004e:
            X.6qX r7 = r5.A01     // Catch:{ all -> 0x008d }
            X.6Rq r6 = r10.A02     // Catch:{ all -> 0x008d }
            java.util.List r8 = r7.A00(r6)     // Catch:{ all -> 0x008d }
            boolean r0 = r8.contains(r10)     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0087
            com.whatsapp.ml.v2.MLModelUtilV2 r0 = r5.A00     // Catch:{ all -> 0x008d }
            java.lang.String r0 = r0.A03(r10)     // Catch:{ all -> 0x008d }
            boolean r0 = X.C108975cc.A1M(r0)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0087
            X.2al r2 = r5.A06     // Catch:{ all -> 0x008d }
            java.lang.String r1 = r5.A00(r10)     // Catch:{ all -> 0x008d }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x008d }
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x008d }
            r0.put(r1, r10)     // Catch:{ all -> 0x008d }
            java.util.ArrayList r0 = X.C29431cG.A0l(r10, r8)     // Catch:{ all -> 0x008d }
            r7.A01(r6, r0)     // Catch:{ all -> 0x008d }
            X.6Ao r0 = X.C119956Ao.A00     // Catch:{ all -> 0x008d }
            java.lang.String r0 = X.C137336vI.A01(r0)     // Catch:{ all -> 0x008d }
            r5.A04(r10, r0)     // Catch:{ all -> 0x008d }
        L_0x0087:
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x008d }
            r3.CQ9(r4)
            return r0
        L_0x008d:
            r0 = move-exception
            r3.CQ9(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.v2.repo.MLModelRepository.A02(X.708, X.1dr):java.lang.Object");
    }

    public MLModelRepository(MLModelUtilV2 mLModelUtilV2, C134406qX r3, C18600wl r4, AnonymousClass1OX r5) {
        C18070vi.A0s(r3, mLModelUtilV2, r5, r4);
        this.A01 = r3;
        this.A00 = mLModelUtilV2;
        this.A04 = r5;
        this.A03 = r4;
    }

    private final String A00(AnonymousClass708 r3) {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A14(A10, r3.A02.name());
        return AnonymousClass000.A0y(MLModelUtilV2.A00(r3), A10);
    }

    public static final String A01(AnonymousClass708 r2) {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A14(A10, r2.A02.name());
        A10.append(MLModelUtilV2.A00(r2));
        return AnonymousClass000.A0y(":downloadingStatus", A10);
    }

    public final void A04(AnonymousClass708 r5, String str) {
        C18070vi.A0h(r5, str);
        AnonymousClass3MW.A12(this.A02).put(A01(r5), str);
        AnonymousClass3MW.A1X(this.A03, new MLModelRepository$setDownloadingStatus$1(r5, this, str, (C30391dr) null), this.A04);
    }
}
