package com.whatsapp.data.repository;

import X.AnonymousClass10I;
import X.C108945cZ;
import X.C30391dr;

public abstract class MetaAiTypeaheadRepository {
    public final AnonymousClass10I A00;

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (r7 == 0) goto L_0x011f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.Object r21, X.C30391dr r22, int r23) {
        /*
            r20 = this;
            r4 = r22
            r3 = r21
            boolean r0 = r4 instanceof X.C147727Ug
            r5 = r20
            if (r0 == 0) goto L_0x00ed
            r9 = r4
            X.7Ug r9 = (X.C147727Ug) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ed
            int r2 = r2 - r1
            r9.label = r2
        L_0x0018:
            java.lang.Object r8 = r9.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r2 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0042
            if (r0 != r6) goto L_0x0116
            int r7 = r9.I$0
            java.lang.Object r3 = r9.L$1
            java.lang.Object r5 = r9.L$0
            com.whatsapp.data.repository.MetaAiTypeaheadRepository r5 = (com.whatsapp.data.repository.MetaAiTypeaheadRepository) r5
            X.C30691eM.A01(r8)
        L_0x002f:
            X.76w r8 = (X.C1417676w) r8
            boolean r0 = r5 instanceof com.whatsapp.data.repository.MetaAISearchRepository
            if (r0 == 0) goto L_0x0105
            com.whatsapp.data.repository.MetaAISearchRepository r5 = (com.whatsapp.data.repository.MetaAISearchRepository) r5
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = X.C18070vi.A16(r3, r8)
            X.6L0 r4 = r5.A02
            monitor-enter(r4)
            goto L_0x00f4
        L_0x0042:
            X.C30691eM.A01(r8)
            boolean r7 = r5 instanceof com.whatsapp.data.repository.MetaAISearchRepository
            if (r7 == 0) goto L_0x00d6
            r1 = r5
            com.whatsapp.data.repository.MetaAISearchRepository r1 = (com.whatsapp.data.repository.MetaAISearchRepository) r1
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
            X.76w r8 = r1.A02(r0)
        L_0x0053:
            if (r8 != 0) goto L_0x011e
            r9.L$0 = r5
            r9.L$1 = r3
            r9.I$0 = r2
            r9.label = r6
            X.1g7 r6 = X.C72473Md.A0m(r9)
            if (r7 == 0) goto L_0x00c2
            r0 = r5
            com.whatsapp.data.repository.MetaAISearchRepository r0 = (com.whatsapp.data.repository.MetaAISearchRepository) r0
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
            X.C18070vi.A0d(r1, r2)
            X.6as r0 = r0.A00
            X.10H r0 = r0.A00
            X.10E r0 = r0.A00
            X.0ve r15 = X.AnonymousClass10E.A8r(r0)
            X.181 r12 = X.C108965cb.A0H(r0)
            X.0z4 r13 = X.AnonymousClass3Ma.A0c(r0)
            X.00H r17 = X.C108945cZ.A14(r0)
            X.0vb r14 = X.AnonymousClass10E.A6Q(r0)
            X.1fq r16 = X.C108955ca.A0X(r0)
            X.00S r0 = r0.A13
            X.00H r18 = X.C000200d.A00(r0)
            X.67a r11 = new X.67a
            r19 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0097:
            X.C18070vi.A0d(r11, r2)
            X.4rF r10 = X.C98494rF.A00()
            r0 = -1
            r1 = r23
            if (r1 == r0) goto L_0x00b3
            X.10I r9 = r5.A00
            long r0 = (long) r1
            r8 = 25
            X.3Ch r7 = new X.3Ch
            r7.<init>(r6, r5, r8)
            X.25d r0 = r9.CGv(r7, r0)
            r10.element = r0
        L_0x00b3:
            X.7I1 r0 = new X.7I1
            r0.<init>(r5, r10, r6, r2)
            r11.CBv(r0)
            java.lang.Object r8 = r6.A0C()
            if (r8 != r4) goto L_0x00ea
            return r4
        L_0x00c2:
            r8 = r5
            X.5ys r8 = (X.C116935ys) r8
            X.C18070vi.A0d(r3, r2)
            X.6ki r7 = r8.A02
            X.61j r1 = X.C116935ys.A04
            X.7Hw r0 = new X.7Hw
            r0.<init>(r3, r8, r2)
            X.7IB r11 = X.C131206ki.A00(r1, r7, r0)
            goto L_0x0097
        L_0x00d6:
            r0 = r5
            X.5ys r0 = (X.C116935ys) r0
            X.C18070vi.A0d(r3, r2)
            X.6Kx r1 = r0.A01
            monitor-enter(r1)
            X.00z r0 = r1.A00     // Catch:{ all -> 0x0124 }
            java.lang.Object r8 = r0.A04(r3)     // Catch:{ all -> 0x0124 }
            X.76w r8 = (X.C1417676w) r8     // Catch:{ all -> 0x0124 }
            monitor-exit(r1)
            goto L_0x0053
        L_0x00ea:
            r7 = 0
            goto L_0x002f
        L_0x00ed:
            X.7Ug r9 = new X.7Ug
            r9.<init>(r5, r4)
            goto L_0x0018
        L_0x00f4:
            X.00z r1 = r4.A02     // Catch:{ all -> 0x0102 }
            X.6qN r0 = new X.6qN     // Catch:{ all -> 0x0102 }
            r0.<init>(r3)     // Catch:{ all -> 0x0102 }
            r1.A08(r0, r8)     // Catch:{ all -> 0x0102 }
            r4.A00 = r6     // Catch:{ all -> 0x0102 }
            monitor-exit(r4)
            goto L_0x011c
        L_0x0102:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0105:
            X.5ys r5 = (X.C116935ys) r5
            X.C18070vi.A0h(r3, r8)
            X.6Kx r1 = r5.A01
            monitor-enter(r1)
            X.00z r0 = r1.A00     // Catch:{ all -> 0x0113 }
            r0.A08(r3, r8)     // Catch:{ all -> 0x0113 }
            goto L_0x011b
        L_0x0113:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0116:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x011b:
            monitor-exit(r1)
        L_0x011c:
            if (r7 == 0) goto L_0x011f
        L_0x011e:
            r2 = 1
        L_0x011f:
            X.1D6 r0 = X.C108975cc.A0i(r8, r2)
            return r0
        L_0x0124:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.data.repository.MetaAiTypeaheadRepository.A01(java.lang.Object, X.1dr, int):java.lang.Object");
    }

    public MetaAiTypeaheadRepository(AnonymousClass10I r1) {
        this.A00 = r1;
    }

    public static final void A00(Exception exc, C30391dr r1) {
        try {
            r1.resumeWith(C108945cZ.A1J(exc));
        } catch (IllegalStateException e) {
            e.getMessage();
        }
    }
}
