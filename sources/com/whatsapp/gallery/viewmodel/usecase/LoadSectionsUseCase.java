package com.whatsapp.gallery.viewmodel.usecase;

import X.AnonymousClass11P;
import X.AnonymousClass858;
import X.C18070vi;
import X.C18600wl;

public final class LoadSectionsUseCase {
    public int A00;
    public AnonymousClass858 A01;
    public int A02;
    public final C18600wl A03;
    public final AnonymousClass11P A04;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass853 r18, X.C160878Ah r19, com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase r20, java.util.List r21, X.C30391dr r22, int r23) {
        /*
            r3 = r22
            r5 = r21
            r10 = r18
            r12 = r23
            r6 = r20
            r7 = r19
            boolean r0 = r3 instanceof X.AnonymousClass7VC
            if (r0 == 0) goto L_0x01d0
            r4 = r3
            X.7VC r4 = (X.AnonymousClass7VC) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01d0
            int r2 = r2 - r1
            r4.label = r2
        L_0x001e:
            java.lang.Object r14 = r4.result
            X.1g4 r11 = X.C31751g4.COROUTINE_SUSPENDED
            int r8 = r4.label
            r3 = 4
            r2 = 3
            r1 = 2
            r0 = 1
            if (r8 == 0) goto L_0x0036
            if (r8 == r0) goto L_0x00a1
            if (r8 == r1) goto L_0x013f
            if (r8 == r2) goto L_0x019c
            if (r8 != r3) goto L_0x01d7
            X.C30691eM.A01(r14)
        L_0x0035:
            return r14
        L_0x0036:
            X.C30691eM.A01(r14)
            int r9 = r7.getCount()
            r6.A02 = r9
            long r0 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r2 = 0
            r8 = 0
        L_0x0049:
            if (r8 >= r9) goto L_0x0166
            X.8B2 r13 = r7.BUY(r8)
            if (r13 == 0) goto L_0x0166
            int r14 = r12 + -1
            if (r8 != r14) goto L_0x00c8
            if (r2 == 0) goto L_0x00c8
            java.util.ArrayList r16 = X.C17880vN.A10(r3)
            X.7Sz r1 = r2.BF2()
            int r0 = r6.A02
            r1.bucketCount = r0
            r0 = r16
            r0.add(r1)
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.L$0 = r6
            r4.L$1 = r7
            r4.L$2 = r5
            r4.L$3 = r10
            r4.L$4 = r2
            r4.L$5 = r3
            r4.L$6 = r13
            r4.I$0 = r12
            r4.J$0 = r0
            r4.I$1 = r8
            r4.I$2 = r9
            r14 = 1
            r4.label = r14
            r23 = 1
            X.0wl r15 = r6.A03
            r22 = 0
            com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase$postReportBuckets$2 r14 = new com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase$postReportBuckets$2
            r17 = r14
            r18 = r7
            r19 = r6
            r20 = r16
            r21 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23)
            java.lang.Object r14 = X.C30451dy.A00(r4, r15, r14)
            if (r14 != r11) goto L_0x00c8
            return r11
        L_0x00a1:
            int r9 = r4.I$2
            int r8 = r4.I$1
            long r0 = r4.J$0
            int r12 = r4.I$0
            java.lang.Object r13 = r4.L$6
            X.8B2 r13 = (X.AnonymousClass8B2) r13
            java.lang.Object r3 = r4.L$5
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r4.L$4
            X.87A r2 = (X.AnonymousClass87A) r2
            java.lang.Object r10 = r4.L$3
            X.853 r10 = (X.AnonymousClass853) r10
            java.lang.Object r5 = r4.L$2
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r7 = r4.L$1
            X.8Ah r7 = (X.C160878Ah) r7
            java.lang.Object r6 = r4.L$0
            com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase r6 = (com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase) r6
            X.C30691eM.A01(r14)
        L_0x00c8:
            r15 = r10
            X.7Gy r15 = (X.C144347Gy) r15
            r14 = 0
            X.C18070vi.A0d(r13, r14)
            long r13 = r13.BQH()
            X.7Sz r14 = r15.A00(r13)
            if (r2 == 0) goto L_0x00e2
            boolean r13 = r2.equals(r14)
            if (r13 != 0) goto L_0x00e6
            r3.add(r2)
        L_0x00e2:
            r2 = 0
            r14.bucketCount = r2
            r2 = r14
        L_0x00e6:
            r14 = r2
            X.7Sz r14 = (X.C147397Sz) r14
            int r13 = r14.bucketCount
            int r13 = r13 + 1
            r14.bucketCount = r13
            boolean r13 = X.AnonymousClass000.A1a(r3)
            if (r13 == 0) goto L_0x0162
            r13 = 1000(0x3e8, double:4.94E-321)
            long r16 = r0 + r13
            long r14 = android.os.SystemClock.uptimeMillis()
            int r13 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r13 >= 0) goto L_0x0162
            long r0 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r18 = X.C17880vN.A10(r3)
            r3.clear()
            r4.L$0 = r6
            r4.L$1 = r7
            r4.L$2 = r5
            r4.L$3 = r10
            r4.L$4 = r2
            r4.L$5 = r3
            r13 = 0
            r4.L$6 = r13
            r4.I$0 = r12
            r4.J$0 = r0
            r4.I$1 = r8
            r4.I$2 = r9
            r13 = 2
            r4.label = r13
            X.0wl r14 = r6.A03
            r20 = 0
            r21 = 0
            com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase$postReportBuckets$2 r13 = new com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase$postReportBuckets$2
            r15 = r13
            r16 = r7
            r17 = r6
            r19 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.Object r13 = X.C30451dy.A00(r4, r14, r13)
            if (r13 != r11) goto L_0x0162
            return r11
        L_0x013f:
            int r9 = r4.I$2
            int r8 = r4.I$1
            long r0 = r4.J$0
            int r12 = r4.I$0
            java.lang.Object r3 = r4.L$5
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r4.L$4
            X.87A r2 = (X.AnonymousClass87A) r2
            java.lang.Object r10 = r4.L$3
            X.853 r10 = (X.AnonymousClass853) r10
            java.lang.Object r5 = r4.L$2
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r7 = r4.L$1
            X.8Ah r7 = (X.C160878Ah) r7
            java.lang.Object r6 = r4.L$0
            com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase r6 = (com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase) r6
            X.C30691eM.A01(r14)
        L_0x0162:
            int r8 = r8 + 1
            goto L_0x0049
        L_0x0166:
            r1 = 1
            if (r2 == 0) goto L_0x016c
            r3.add(r2)
        L_0x016c:
            boolean r0 = r3.isEmpty()
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x01a7
            r4.L$0 = r6
            r4.L$1 = r7
            r0 = 0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.L$4 = r0
            r4.L$5 = r0
            r4.L$6 = r0
            r0 = 3
            r4.label = r0
            r18 = 0
            X.0wl r0 = r6.A03
            r17 = 0
            com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase$postReportBuckets$2 r12 = new com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase$postReportBuckets$2
            r15 = r3
            r16 = r5
            r13 = r7
            r14 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = X.C30451dy.A00(r4, r0, r12)
            if (r0 != r11) goto L_0x01a7
            return r11
        L_0x019c:
            java.lang.Object r7 = r4.L$1
            X.8Ah r7 = (X.C160878Ah) r7
            java.lang.Object r6 = r4.L$0
            com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase r6 = (com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase) r6
            X.C30691eM.A01(r14)
        L_0x01a7:
            int r0 = r7.getCount()
            r6.A02 = r0
            r7.close()
            X.0wl r2 = r6.A03
            r0 = 0
            com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase$loadSections$3 r1 = new com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase$loadSections$3
            r1.<init>(r6, r0)
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.L$4 = r0
            r4.L$5 = r0
            r4.L$6 = r0
            r0 = 4
            r4.label = r0
            java.lang.Object r14 = X.C30451dy.A00(r4, r2, r1)
            if (r14 != r11) goto L_0x0035
            return r11
        L_0x01d0:
            X.7VC r4 = new X.7VC
            r4.<init>(r6, r3)
            goto L_0x001e
        L_0x01d7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase.A00(X.853, X.8Ah, com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase, java.util.List, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass853 r10, X.AnonymousClass87B r11, X.AnonymousClass858 r12, java.util.List r13, X.C30391dr r14, int r15, boolean r16) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof X.AnonymousClass7U0
            r5 = r9
            if (r0 == 0) goto L_0x0023
            r7 = r14
            X.7U0 r7 = (X.AnonymousClass7U0) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0023
            int r2 = r2 - r1
            r7.label = r2
        L_0x0013:
            java.lang.Object r3 = r7.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r1 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r1) goto L_0x002d
            java.lang.Object r4 = r7.L$0
            X.8Ah r4 = (X.C160878Ah) r4
            goto L_0x0029
        L_0x0023:
            X.7U0 r7 = new X.7U0
            r7.<init>(r9, r14)
            goto L_0x0013
        L_0x0029:
            X.C30691eM.A01(r3)     // Catch:{ CancellationException -> 0x004e }
            goto L_0x0056
        L_0x002d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0032:
            X.C30691eM.A01(r3)
            r0 = 0
            r9.A00 = r0
            r9.A01 = r12
            r0 = r16 ^ 1
            X.8Ah r4 = r11.BHY(r0)
            r7.L$0 = r4     // Catch:{ CancellationException -> 0x004e }
            r7.label = r1     // Catch:{ CancellationException -> 0x004e }
            r3 = r10
            r6 = r13
            r8 = r15
            java.lang.Object r0 = A00(r3, r4, r5, r6, r7, r8)     // Catch:{ CancellationException -> 0x004e }
            if (r0 != r2) goto L_0x0056
            return r2
        L_0x004e:
            java.lang.String r0 = "LoadSectionsUseCase/invoke/LoadSections cancelled"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4.close()
        L_0x0056:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase.A01(X.853, X.87B, X.858, java.util.List, X.1dr, int, boolean):java.lang.Object");
    }

    public LoadSectionsUseCase(AnonymousClass11P r1, C18600wl r2) {
        C18070vi.A0j(r1, r2);
        this.A04 = r1;
        this.A03 = r2;
    }
}
