package com.whatsapp.consent;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.consent.ConsentNavigationViewModel$handleYouthConsentDisclosureAccepted$1", f = "ConsentNavigationViewModel.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
public final class ConsentNavigationViewModel$handleYouthConsentDisclosureAccepted$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ ConsentNavigationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsentNavigationViewModel$handleYouthConsentDisclosureAccepted$1(Context context, ConsentNavigationViewModel consentNavigationViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = consentNavigationViewModel;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ConsentNavigationViewModel$handleYouthConsentDisclosureAccepted$1(this.$context, this.this$0, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00dc, code lost:
        r0 = X.AnonymousClass00R.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00de, code lost:
        r14 = new X.C143917Fh(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013a, code lost:
        if (r0 != null) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r13.label
            r1 = 1
            if (r0 == 0) goto L_0x0079
            if (r0 != r1) goto L_0x0146
            X.C30691eM.A01(r14)
        L_0x000c:
            X.84z r14 = (X.C1595584z) r14
            boolean r0 = r14 instanceof X.C143967Fm
            if (r0 == 0) goto L_0x0043
            com.whatsapp.consent.ConsentNavigationViewModel r0 = r13.this$0
            X.1KB r0 = r0.A01
            r0.A04()
            com.whatsapp.consent.ConsentNavigationViewModel r0 = r13.this$0
            com.whatsapp.dobverification.WaConsentRepository r1 = r0.A04
            X.7Fm r14 = (X.C143967Fm) r14
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            com.whatsapp.dobverification.WaConsentRepository.A00(r1, r14)
            com.whatsapp.consent.ConsentNavigationViewModel r0 = r13.this$0
            com.whatsapp.consent.ConsentNavigationViewModel.A03(r0)
        L_0x002b:
            com.whatsapp.consent.ConsentNavigationViewModel r0 = r13.this$0
            X.1iv r2 = r0.A06
            r1 = 20240708(0x134d944, float:3.321666E-38)
            java.util.concurrent.ConcurrentHashMap r0 = r2.A0A
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.remove(r1)
            java.util.concurrent.ConcurrentSkipListSet r0 = r2.A0B
            r0.remove(r1)
        L_0x0040:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0043:
            X.7Fw r0 = X.C144067Fw.A00
            boolean r2 = X.C18070vi.A18(r14, r0)
            com.whatsapp.consent.ConsentNavigationViewModel r0 = r13.this$0
            X.1KB r0 = r0.A01
            r0.A04()
            if (r2 == 0) goto L_0x005f
            com.whatsapp.consent.ConsentNavigationViewModel r0 = r13.this$0
            com.whatsapp.dobverification.WaConsentRepository r0 = r0.A04
            X.6kB r0 = r0.A01
            X.1CM r1 = r0.A08
            r0 = 7
            r1.A01(r0)
            goto L_0x002b
        L_0x005f:
            com.whatsapp.consent.ConsentNavigationViewModel r3 = r13.this$0
            android.content.Context r2 = r13.$context
            r0 = 2131886573(0x7f1201ed, float:1.9407729E38)
            java.lang.String r2 = X.C18070vi.A0F(r2, r0)
            X.1KB r0 = r3.A01
            r0.A0H(r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConsentNavigationViewModel/Response error: "
            X.C17900vP.A0X(r14, r0, r1)
            goto L_0x0040
        L_0x0079:
            X.C30691eM.A01(r14)
            com.whatsapp.consent.ConsentNavigationViewModel r0 = r13.this$0
            X.7Fg r6 = r0.A03
            r13.label = r1
            r5 = 20240708(0x134d944, float:3.321666E-38)
            r4 = 5
            X.0z4 r0 = r6.A01
            java.lang.String r7 = X.C108955ca.A0t(r0)
            java.lang.String r8 = r0.A0n()
            java.lang.StringBuilder r3 = X.C108955ca.A15(r8)
            java.lang.String r0 = "WaPancakeApi/sendConsentResult id="
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = " result="
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = " v="
            X.C17900vP.A0j(r0, r3, r1)
            boolean r0 = X.AnonymousClass1YF.A0T(r7)
            if (r0 != 0) goto L_0x013d
            boolean r0 = X.AnonymousClass1YF.A0T(r8)
            if (r0 != 0) goto L_0x013d
            X.00H r0 = r6.A02
            java.lang.Object r4 = r0.get()
            X.A98 r4 = (X.A98) r4
            java.lang.String r3 = "consent"
            boolean r0 = r4.A0T()
            if (r0 != 0) goto L_0x010b
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            X.6k6 r0 = new X.6k6
            r0.<init>(r3)
        L_0x00cc:
            java.lang.Integer r3 = r0.A02
            int r4 = r3.intValue()
            r3 = 0
            if (r4 == r3) goto L_0x00fd
            r0 = 11
            if (r4 == r0) goto L_0x00fa
            switch(r4) {
                case 3: goto L_0x00f4;
                case 4: goto L_0x00f1;
                case 5: goto L_0x00ee;
                case 6: goto L_0x00e8;
                case 7: goto L_0x00eb;
                case 8: goto L_0x00dc;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00f7;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
        L_0x00de:
            X.7Fh r14 = new X.7Fh
            r14.<init>(r0)
        L_0x00e3:
            X.84z r14 = (X.C1595584z) r14
            if (r14 != r2) goto L_0x000c
            return r2
        L_0x00e8:
            X.7Fp r14 = X.C143997Fp.A00
            goto L_0x00e3
        L_0x00eb:
            X.7Fu r14 = X.C144047Fu.A00
            goto L_0x00e3
        L_0x00ee:
            X.7Ft r14 = X.C144037Ft.A00
            goto L_0x00e3
        L_0x00f1:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x00de
        L_0x00f4:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x00de
        L_0x00f7:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x00de
        L_0x00fa:
            X.7Fw r14 = X.C144067Fw.A00
            goto L_0x00e3
        L_0x00fd:
            java.lang.String r5 = r0.A04
            boolean r4 = r0.A09
            boolean r3 = r0.A08
            boolean r0 = r0.A07
            X.7Fm r14 = new X.7Fm
            r14.<init>(r5, r4, r3, r0)
            goto L_0x00e3
        L_0x010b:
            byte[] r11 = r4.A0V(r7, r8)
            byte[] r12 = r4.A0U(r3)
            X.00H r0 = r4.A0D
            java.lang.Object r6 = r0.get()
            X.A7d r6 = (X.C20100A7d) r6
            X.0z4 r0 = r4.A07
            android.content.SharedPreferences r3 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "2fa"
            java.lang.String r9 = X.C17880vN.A0r(r3, r0)
            java.lang.String r0 = "consent_entrypoint"
            java.lang.String r10 = r4.A0P(r7, r0)
            X.2bP r5 = r4.A09
            X.6Or r4 = new X.6Or
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = X.C19951A0i.A00(r4)
            X.6k6 r0 = (X.C130846k6) r0
            if (r0 == 0) goto L_0x00dc
            goto L_0x00cc
        L_0x013d:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            X.7Fh r14 = new X.7Fh
            r14.<init>(r0)
            goto L_0x000c
        L_0x0146:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.consent.ConsentNavigationViewModel$handleYouthConsentDisclosureAccepted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConsentNavigationViewModel$handleYouthConsentDisclosureAccepted$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
