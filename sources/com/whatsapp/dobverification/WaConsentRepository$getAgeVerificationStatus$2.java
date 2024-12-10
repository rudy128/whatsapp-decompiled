package com.whatsapp.dobverification;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.dobverification.WaConsentRepository$getAgeVerificationStatus$2", f = "WaConsentRepository.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
public final class WaConsentRepository$getAgeVerificationStatus$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ WaConsentRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaConsentRepository$getAgeVerificationStatus$2(WaConsentRepository waConsentRepository, C30391dr r3) {
        super(2, r3);
        this.this$0 = waConsentRepository;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new WaConsentRepository$getAgeVerificationStatus$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new WaConsentRepository$getAgeVerificationStatus$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00df, code lost:
        if (r7 != r5) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e1, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r2 = 1
            if (r0 == 0) goto L_0x005c
            if (r0 != r2) goto L_0x00e2
            X.C30691eM.A01(r7)
        L_0x000c:
            com.whatsapp.dobverification.WaConsentRepository r3 = r6.this$0
            r1 = r7
            X.84z r1 = (X.C1595584z) r1
            X.7Fq r0 = X.C144007Fq.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0023
            r0 = 27
            com.whatsapp.dobverification.WaConsentRepository.A01(r3, r2, r0)
            r3.A04(r2)
        L_0x0022:
            return r7
        L_0x0023:
            boolean r0 = r1 instanceof X.C143937Fj
            if (r0 == 0) goto L_0x0034
            X.7Fj r1 = (X.C143937Fj) r1
            java.lang.String r1 = r1.A00
            r0 = 29
        L_0x002d:
            com.whatsapp.dobverification.WaConsentRepository.A01(r3, r1, r0)
            r3.A04(r2)
            return r7
        L_0x0034:
            boolean r0 = r1 instanceof X.C143927Fi
            if (r0 == 0) goto L_0x003f
            X.7Fi r1 = (X.C143927Fi) r1
            java.lang.String r1 = r1.A00
            r0 = 28
            goto L_0x002d
        L_0x003f:
            boolean r0 = r1 instanceof X.C143967Fm
            if (r0 == 0) goto L_0x0049
            X.7Fm r1 = (X.C143967Fm) r1
            com.whatsapp.dobverification.WaConsentRepository.A00(r3, r1)
            return r7
        L_0x0049:
            boolean r0 = r1 instanceof X.C143947Fk
            if (r0 == 0) goto L_0x0022
            X.7Fk r1 = (X.C143947Fk) r1
            r3.A03(r1)
            X.6kB r0 = r3.A01
            X.1CM r1 = r0.A08
            r0 = 26
            r1.A01(r0)
            return r7
        L_0x005c:
            X.C30691eM.A01(r7)
            com.whatsapp.dobverification.WaConsentRepository r0 = r6.this$0
            X.7Fg r1 = r0.A02
            r6.label = r2
            X.0z4 r0 = r1.A01
            java.lang.String r4 = X.C108955ca.A0t(r0)
            java.lang.String r3 = X.C108955ca.A0u(r0)
            boolean r0 = X.AnonymousClass1YF.A0T(r4)
            if (r0 != 0) goto L_0x00a5
            boolean r0 = X.AnonymousClass1YF.A0T(r3)
            if (r0 != 0) goto L_0x00a5
            X.00H r0 = r1.A02
            java.lang.Object r2 = r0.get()
            X.A98 r2 = (X.A98) r2
            java.lang.String r1 = ""
            java.lang.String r0 = "parent_verification"
            X.6k6 r4 = r2.A0K(r4, r3, r1, r0)
            if (r4 == 0) goto L_0x0096
            java.lang.Integer r0 = r4.A02
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00d2;
                case 1: goto L_0x0096;
                case 2: goto L_0x0096;
                case 3: goto L_0x009f;
                case 4: goto L_0x00a5;
                case 5: goto L_0x00b4;
                case 6: goto L_0x00ae;
                case 7: goto L_0x00b1;
                case 8: goto L_0x00ab;
                case 9: goto L_0x00a8;
                case 10: goto L_0x00a2;
                case 11: goto L_0x0096;
                case 12: goto L_0x00b7;
                case 13: goto L_0x0096;
                case 14: goto L_0x00c7;
                case 15: goto L_0x00bf;
                case 16: goto L_0x00cf;
                default: goto L_0x0096;
            }
        L_0x0096:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
        L_0x0098:
            X.7Fh r7 = new X.7Fh
            r7.<init>(r0)
            goto L_0x000c
        L_0x009f:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x0098
        L_0x00a2:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x0098
        L_0x00a5:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x0098
        L_0x00a8:
            X.7Fr r7 = X.C144017Fr.A00
            goto L_0x00df
        L_0x00ab:
            X.7Fs r7 = X.C144027Fs.A00
            goto L_0x00df
        L_0x00ae:
            X.7Fp r7 = X.C143997Fp.A00
            goto L_0x00df
        L_0x00b1:
            X.7Fu r7 = X.C144047Fu.A00
            goto L_0x00df
        L_0x00b4:
            X.7Ft r7 = X.C144037Ft.A00
            goto L_0x00df
        L_0x00b7:
            java.lang.String r0 = r4.A05
            X.7Fk r7 = new X.7Fk
            r7.<init>(r0)
            goto L_0x00df
        L_0x00bf:
            java.lang.String r0 = r4.A03
            X.7Fi r7 = new X.7Fi
            r7.<init>(r0)
            goto L_0x00df
        L_0x00c7:
            java.lang.String r0 = r4.A03
            X.7Fj r7 = new X.7Fj
            r7.<init>(r0)
            goto L_0x00df
        L_0x00cf:
            X.7Fq r7 = X.C144007Fq.A00
            goto L_0x00df
        L_0x00d2:
            java.lang.String r3 = r4.A04
            boolean r2 = r4.A09
            boolean r1 = r4.A08
            boolean r0 = r4.A07
            X.7Fm r7 = new X.7Fm
            r7.<init>(r3, r2, r1, r0)
        L_0x00df:
            if (r7 != r5) goto L_0x000c
            return r5
        L_0x00e2:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dobverification.WaConsentRepository$getAgeVerificationStatus$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
