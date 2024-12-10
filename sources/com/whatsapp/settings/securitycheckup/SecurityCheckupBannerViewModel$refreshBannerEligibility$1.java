package com.whatsapp.settings.securitycheckup;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.securitycheckup.SecurityCheckupBannerViewModel$refreshBannerEligibility$1", f = "SecurityCheckupBannerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SecurityCheckupBannerViewModel$refreshBannerEligibility$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ SecurityCheckupBannerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecurityCheckupBannerViewModel$refreshBannerEligibility$1(SecurityCheckupBannerViewModel securityCheckupBannerViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = securityCheckupBannerViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new SecurityCheckupBannerViewModel$refreshBannerEligibility$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SecurityCheckupBannerViewModel$refreshBannerEligibility$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (X.A87.A00(180, java.lang.System.currentTimeMillis(), r4) < 180) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.label
            if (r0 != 0) goto L_0x009c
            X.C30691eM.A01(r10)
            com.whatsapp.settings.securitycheckup.SecurityCheckupBannerViewModel r0 = r9.this$0
            X.1wy r6 = r0.A03
            X.4OF r7 = r0.A01
            X.11S r1 = r7.A00
            r1.A0I()
            X.1E3 r0 = r1.A02
            boolean r0 = r1.A0P(r0)
            if (r0 != 0) goto L_0x0082
            X.0z4 r8 = r7.A01
            java.lang.String r3 = "security_checkup_banner_last_seen_timestamp"
            long r4 = r8.A0W(r3)
            r1 = -1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x008b
            r8.A1i(r3)
        L_0x002b:
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r8)
            java.lang.String r1 = "security_checkup_dismiss_count"
            r0 = -1
            int r1 = r2.getInt(r1, r0)
            r0 = 3
            if (r1 >= r0) goto L_0x0082
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            java.lang.String r0 = "security_checkup_banner_cool_off_timestamp"
            boolean r0 = r8.A2b(r0, r1)
            if (r0 == 0) goto L_0x0082
            X.0ve r2 = r7.A02
            r1 = 9983(0x26ff, float:1.3989E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0082
            com.whatsapp.settings.securitycheckup.SecurityCheckupBannerViewModel r0 = r9.this$0
            com.whatsapp.settings.securitycheckup.SecurityCheckupStatusRepository r2 = r0.A02
            com.whatsapp.passkeys.PasskeyExistsCache r0 = r2.A02
            X.1G1 r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C20741AWw
            if (r0 == 0) goto L_0x0089
            X.0z4 r1 = r2.A00
            java.lang.String r0 = r1.A0o()
            if (r0 == 0) goto L_0x0089
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            if (r0 != 0) goto L_0x0089
            boolean r0 = r1.A2N()
            if (r0 == 0) goto L_0x0089
            X.1eh r0 = r2.A03
            java.lang.String r0 = r0.A02()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0089
        L_0x0082:
            r0 = 0
        L_0x0083:
            X.AnonymousClass3MY.A1M(r6, r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0089:
            r0 = 1
            goto L_0x0083
        L_0x008b:
            long r2 = java.lang.System.currentTimeMillis()
            r1 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r0 = X.A87.A00(r0, r2, r4)
            if (r0 >= r1) goto L_0x0082
            goto L_0x002b
        L_0x009c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.securitycheckup.SecurityCheckupBannerViewModel$refreshBannerEligibility$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
