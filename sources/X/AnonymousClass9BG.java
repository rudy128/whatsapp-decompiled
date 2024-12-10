package X;

import com.whatsapp.registration.VerifyTwoFactorAuth;
import java.lang.ref.WeakReference;

/* renamed from: X.9BG  reason: invalid class name */
public class AnonymousClass9BG extends A34 {
    public final AnonymousClass118 A00;
    public final C19830z4 A01;
    public final A98 A02;
    public final String A03;
    public final String A04;
    public final WeakReference A05;

    public AnonymousClass9BG(AnonymousClass118 r2, C19830z4 r3, A98 a98, VerifyTwoFactorAuth verifyTwoFactorAuth, String str, String str2) {
        super(verifyTwoFactorAuth, true);
        this.A01 = r3;
        this.A02 = a98;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = AnonymousClass3MW.A0z(verifyTwoFactorAuth);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004d, code lost:
        if (((r8.A02 * 1000) + (r8.A03 - (r8.A04 * 1000))) >= X.AnonymousClass8BS.A01(r8)) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r15) {
        /*
            r14 = this;
            X.9yx r15 = (X.C198819yx) r15
            java.lang.ref.WeakReference r0 = r14.A05
            java.lang.Object r8 = r0.get()
            com.whatsapp.registration.VerifyTwoFactorAuth r8 = (com.whatsapp.registration.VerifyTwoFactorAuth) r8
            if (r8 == 0) goto L_0x003a
            r2 = 0
            r8.A0S = r2
            r4 = 5000(0x1388, double:2.4703E-320)
            r9 = 1
            if (r15 == 0) goto L_0x003b
            int r0 = r15.A0a
            if (r0 != r9) goto L_0x0050
            java.lang.String r0 = "VerifyTwoFactorAuth/checkifexists ok"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.VerifyTwoFactorAuth.A0d(r8, r9)
            X.0z4 r1 = r8.A0A
            boolean r0 = r15.A0f
            r1.A23(r0)
            X.0z4 r1 = r8.A0A
            boolean r0 = r15.A0e
            r1.A22(r0)
            X.0z4 r1 = r8.A0A
            boolean r0 = r15.A0d
            r1.A2B(r0)
            java.lang.String r0 = r15.A0c
            r8.A4f(r2, r0)
        L_0x003a:
            return
        L_0x003b:
            long r12 = X.AnonymousClass8BS.A01(r8)
            long r6 = r8.A03
            long r2 = r8.A04
            long r0 = r8.A02
            r10 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r10
            long r0 = r0 * r10
            long r6 = r6 - r2
            long r0 = r0 + r6
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x006a
            goto L_0x0062
        L_0x0050:
            long r2 = r15.A0C
            long r0 = r15.A0B
            long r2 = r2 + r0
            long r6 = r8.A02
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x006a
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r4 = java.lang.Math.max(r0, r4)
        L_0x0062:
            android.os.Handler r1 = r8.A0n
            java.lang.Runnable r0 = r8.A0p
            r1.postDelayed(r0, r4)
            return
        L_0x006a:
            com.whatsapp.registration.VerifyTwoFactorAuth.A0d(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9BG.A0H(java.lang.Object):void");
    }
}
