package com.whatsapp.calling.dialer;

import X.AnonymousClass1E7;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1OB;
import X.AnonymousClass4IV;
import X.C18070vi;
import X.C26023Cqh;
import X.C34081jt;

public final class DialerRepository {
    public final DialerDataSourceLocal A00;
    public final AnonymousClass1G4 A01;
    public final AnonymousClass1G1 A02;
    public final DialerDataSourceRemote A03;

    public static void A00(C26023Cqh cqh, DialerRepository dialerRepository) {
        AnonymousClass1G4 r0 = dialerRepository.A01;
        String str = cqh.A07;
        Integer num = cqh.A04;
        AnonymousClass1E7 r4 = cqh.A02;
        String str2 = cqh.A05;
        r0.setValue(new C26023Cqh(cqh.A00, cqh.A01, r4, num, cqh.A03, str, str2, cqh.A06));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r16, X.C30391dr r17) {
        /*
            r15 = this;
            r5 = r17
            boolean r0 = r5 instanceof X.C27403DdK
            r2 = r15
            if (r0 == 0) goto L_0x00a3
            r4 = r5
            X.DdK r4 = (X.C27403DdK) r4
            int r3 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00a3
            int r3 = r3 - r1
            r4.label = r3
        L_0x0015:
            java.lang.Object r7 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r6 = r4.label
            r0 = 3
            r5 = 2
            r1 = 1
            if (r6 == 0) goto L_0x0037
            if (r6 == r1) goto L_0x005b
            if (r6 == r5) goto L_0x0094
            if (r6 != r0) goto L_0x00aa
            java.lang.Object r6 = r4.L$1
            X.Cqh r6 = (X.C26023Cqh) r6
            java.lang.Object r2 = r4.L$0
            com.whatsapp.calling.dialer.DialerRepository r2 = (com.whatsapp.calling.dialer.DialerRepository) r2
            X.C30691eM.A01(r7)
        L_0x0031:
            A00(r6, r2)
        L_0x0034:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0037:
            X.C30691eM.A01(r7)
            r7 = 0
            java.lang.Integer r10 = X.AnonymousClass00R.A00
            r14 = 0
            X.Cqh r6 = new X.Cqh
            r9 = r7
            r11 = r7
            r13 = r7
            r12 = r16
            r8 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            A00(r6, r15)
            com.whatsapp.calling.dialer.DialerDataSourceLocal r0 = r15.A00
            r4.L$0 = r15
            r4.L$1 = r6
            r4.label = r1
            java.lang.Object r0 = r0.A00(r6, r4)
            if (r0 != r3) goto L_0x0066
            return r3
        L_0x005b:
            java.lang.Object r6 = r4.L$1
            X.Cqh r6 = (X.C26023Cqh) r6
            java.lang.Object r2 = r4.L$0
            com.whatsapp.calling.dialer.DialerRepository r2 = (com.whatsapp.calling.dialer.DialerRepository) r2
            X.C30691eM.A01(r7)
        L_0x0066:
            A00(r6, r2)
            X.1E7 r0 = r6.A02
            if (r0 == 0) goto L_0x0085
            int r0 = r0.A01
            if (r0 != r1) goto L_0x0085
        L_0x0071:
            android.graphics.drawable.Drawable r0 = r6.A00
            if (r0 != 0) goto L_0x0034
            com.whatsapp.calling.dialer.DialerDataSourceRemote r1 = r2.A03
            r4.L$0 = r2
            r4.L$1 = r6
            r0 = 3
            r4.label = r0
            java.lang.Object r0 = r1.A00(r6, r4)
            if (r0 != r3) goto L_0x0031
            return r3
        L_0x0085:
            com.whatsapp.calling.dialer.DialerDataSourceRemote r0 = r2.A03
            r4.L$0 = r2
            r4.L$1 = r6
            r4.label = r5
            java.lang.Object r0 = r0.A01(r6, r4)
            if (r0 != r3) goto L_0x009f
            return r3
        L_0x0094:
            java.lang.Object r6 = r4.L$1
            X.Cqh r6 = (X.C26023Cqh) r6
            java.lang.Object r2 = r4.L$0
            com.whatsapp.calling.dialer.DialerRepository r2 = (com.whatsapp.calling.dialer.DialerRepository) r2
            X.C30691eM.A01(r7)
        L_0x009f:
            A00(r6, r2)
            goto L_0x0071
        L_0x00a3:
            X.DdK r4 = new X.DdK
            r4.<init>(r15, r5)
            goto L_0x0015
        L_0x00aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.dialer.DialerRepository.A01(java.lang.String, X.1dr):java.lang.Object");
    }

    public DialerRepository(DialerDataSourceLocal dialerDataSourceLocal, DialerDataSourceRemote dialerDataSourceRemote) {
        C18070vi.A0j(dialerDataSourceLocal, dialerDataSourceRemote);
        this.A00 = dialerDataSourceLocal;
        this.A03 = dialerDataSourceRemote;
        AnonymousClass1G7 r2 = new AnonymousClass1G7(AnonymousClass4IV.A01);
        this.A01 = r2;
        this.A02 = new C34081jt((AnonymousClass1OB) null, r2);
    }
}
