package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* renamed from: X.BZt  reason: case insensitive filesystem */
public final class C23017BZt extends C23023BZz {
    public final GoogleSignInOptions A00;

    public final int BUx() {
        return 12451000;
    }

    public final boolean CCu() {
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23017BZt(android.content.Context r13, android.os.Looper r14, com.google.android.gms.auth.api.signin.GoogleSignInOptions r15, X.EDW r16, X.EDX r17, X.CTL r18) {
        /*
            r12 = this;
            r11 = 91
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r16
            r9 = r17
            r10 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.CXS r4 = new X.CXS
            if (r15 == 0) goto L_0x0061
            r4.<init>()
            java.util.HashSet r0 = X.C17880vN.A12()
            r4.A05 = r0
            java.util.HashMap r0 = X.C17880vN.A11()
            r4.A04 = r0
            android.os.Parcelable$Creator r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR
            java.util.ArrayList r0 = r15.A08
            java.util.HashSet r0 = X.AnonymousClass8BR.A12(r0)
            r4.A05 = r0
            boolean r0 = r15.A09
            r4.A06 = r0
            boolean r0 = r15.A0A
            r4.A07 = r0
            boolean r0 = r15.A05
            r4.A08 = r0
            java.lang.String r0 = r15.A01
            r4.A01 = r0
            android.accounts.Account r0 = r15.A00
            r4.A00 = r0
            java.lang.String r0 = r15.A02
            r4.A02 = r0
            java.util.ArrayList r0 = r15.A04
            java.util.HashMap r3 = X.C17880vN.A11()
            if (r0 == 0) goto L_0x0065
            java.util.Iterator r2 = r0.iterator()
        L_0x004f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r1 = r2.next()
            X.Bal r1 = (X.C23070Bal) r1
            int r0 = r1.A00
            X.C108955ca.A1V(r1, r3, r0)
            goto L_0x004f
        L_0x0061:
            r4.<init>()
            goto L_0x006b
        L_0x0065:
            r4.A04 = r3
            java.lang.String r0 = r15.A03
            r4.A03 = r0
        L_0x006b:
            r0 = 16
            byte[] r1 = new byte[r0]
            java.security.SecureRandom r0 = X.CF2.A00
            r0.nextBytes(r1)
            java.lang.String r0 = X.AnonymousClass8BT.A0x(r1)
            r4.A03 = r0
            java.util.Set r1 = r10.A06
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00a0
            java.util.Iterator r3 = r1.iterator()
        L_0x0086:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r2 = r3.next()
            r0 = 0
            com.google.android.gms.common.api.Scope[] r0 = new com.google.android.gms.common.api.Scope[r0]
            java.util.Set r1 = r4.A05
            r1.add(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            goto L_0x0086
        L_0x00a0:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r4.A00()
            r12.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23017BZt.<init>(android.content.Context, android.os.Looper, com.google.android.gms.auth.api.signin.GoogleSignInOptions, X.EDW, X.EDX, X.CTL):void");
    }

    public final Intent BZI() {
        Context context = this.A0F;
        GoogleSignInOptions googleSignInOptions = this.A00;
        C25398Cez.A00.A00("getSignInIntent()");
        SignInConfiguration signInConfiguration = new SignInConfiguration(googleSignInOptions, context.getPackageName());
        Intent A0G = C108945cZ.A0G("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        A0G.setPackage(context.getPackageName());
        A0G.setClass(context, SignInHubActivity.class);
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelable("config", signInConfiguration);
        A0G.putExtra("config", A0D);
        return A0G;
    }
}
