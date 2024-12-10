package X;

import android.os.Process;
import android.os.UserManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.1m8  reason: invalid class name and case insensitive filesystem */
public class C35371m8 {
    public Boolean A00;
    public final AnonymousClass11C A01;
    public final AnonymousClass118 A02;
    public final C19830z4 A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass18O A05;
    public final AnonymousClass1DC A06;

    public boolean A01() {
        boolean booleanValue;
        AnonymousClass18O r1 = this.A05;
        boolean z = true;
        if (!r1.A09(AnonymousClass18O.A0A)) {
            z = false;
        }
        boolean A09 = r1.A09(AnonymousClass18O.A09);
        synchronized (this) {
            Boolean bool = this.A00;
            if (bool == null) {
                AnonymousClass11C r2 = this.A01;
                UserManager userManager = r2.A02;
                if (userManager == null) {
                    userManager = (UserManager) AnonymousClass11C.A03(r2, PublicKeyCredentialControllerUtility.JSON_KEY_USER, true);
                    r2.A02 = userManager;
                }
                boolean z2 = true;
                if (userManager != null) {
                    try {
                        if (userManager.getSerialNumberForUser(Process.myUserHandle()) != 0) {
                            z2 = false;
                        }
                    } catch (Exception e) {
                        Log.e("FbnsTokenManager/isAdminUser", e);
                    }
                }
                bool = Boolean.valueOf(z2);
                this.A00 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        if (!z) {
            return false;
        }
        if (!A09 || booleanValue) {
            return true;
        }
        return false;
    }

    public C35371m8(AnonymousClass18O r1, AnonymousClass11C r2, AnonymousClass118 r3, C19830z4 r4, AnonymousClass1DC r5, AnonymousClass00H r6) {
        this.A02 = r3;
        this.A05 = r1;
        this.A06 = r5;
        this.A01 = r2;
        this.A04 = r6;
        this.A03 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (r3 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (242478021 != r3) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7.A01()
            if (r0 == 0) goto L_0x00a6
            X.0z4 r5 = r7.A03
            java.lang.String r4 = r5.A0e()
            X.00H r0 = r5.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "fbns_app_vers"
            r0 = 0
            int r3 = r2.getInt(r1, r0)
            r1 = 242478021(0xe73ebc5, float:3.0065581E-30)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x002d
            boolean r0 = r8.equals(r4)
            if (r0 == 0) goto L_0x002d
            r2 = 0
            if (r1 == r3) goto L_0x002e
        L_0x002d:
            r2 = 1
        L_0x002e:
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r5)
            java.lang.String r0 = "last_server_fbns_token"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r8)
            r0.apply()
            if (r2 == 0) goto L_0x00d9
            X.118 r0 = r7.A02
            android.content.Context r4 = r0.A00
            java.lang.String r6 = X.C197569wu.A0D
            java.util.List r5 = X.C24698CGk.A00
            java.util.Iterator r1 = r5.iterator()
        L_0x0049:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = X.C25309CdE.A01(r4, r3)
            if (r0 == 0) goto L_0x0049
            r2 = 1
            if (r3 != 0) goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FbnsTokenManager/requestFbnsToken fbns-enabled:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x00a6
            if (r3 == 0) goto L_0x00a6
            java.lang.String r0 = "com.facebook.rti.fbns.intent.REGISTER"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "pkg_name"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "appid"
            r2.putExtra(r0, r6)
            boolean r0 = r5.contains(r3)
            if (r0 != 0) goto L_0x00a7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FBNSPreloadIPC/Unknown package "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00a6:
            return
        L_0x00a7:
            java.lang.String r0 = "com.oculus.horizon"
            boolean r0 = r3.equals(r0)     // Catch:{ IllegalStateException -> 0x00d0, SecurityException -> 0x00a6, RuntimeException -> 0x00c6 }
            if (r0 == 0) goto L_0x00c0
            java.lang.String r1 = "com.oculus.horizon.push.HorizonFbnsService"
        L_0x00b1:
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ IllegalStateException -> 0x00d0, SecurityException -> 0x00a6, RuntimeException -> 0x00c6 }
            r0.<init>(r3, r1)     // Catch:{ IllegalStateException -> 0x00d0, SecurityException -> 0x00a6, RuntimeException -> 0x00c6 }
            r2.setComponent(r0)     // Catch:{ IllegalStateException -> 0x00d0, SecurityException -> 0x00a6, RuntimeException -> 0x00c6 }
            X.C25309CdE.A00(r4, r2)     // Catch:{ IllegalStateException -> 0x00d0, SecurityException -> 0x00a6, RuntimeException -> 0x00c6 }
            r4.startService(r2)     // Catch:{ IllegalStateException -> 0x00d0, SecurityException -> 0x00a6, RuntimeException -> 0x00c6 }
            goto L_0x00c5
        L_0x00c0:
            java.lang.String r1 = "com.facebook.oxygen.services.fbns.PreloadedFbnsService"
            goto L_0x00b1
        L_0x00c3:
            r3 = 0
            goto L_0x005e
        L_0x00c5:
            return
        L_0x00c6:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x00d8
            return
        L_0x00d0:
            r2 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00d8
            return
        L_0x00d8:
            throw r2
        L_0x00d9:
            java.lang.String r0 = "FbnsTokenManager/verifyFbnsToken no-need-to-refresh"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35371m8.A00(java.lang.String):void");
    }
}
