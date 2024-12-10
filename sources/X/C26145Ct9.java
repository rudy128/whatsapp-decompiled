package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashSet;

/* renamed from: X.Ct9  reason: case insensitive filesystem */
public class C26145Ct9 {
    public AnonymousClass190 A00;
    public C24991CSr A01;
    public byte[] A02 = null;
    public final AnonymousClass11C A03;
    public final AnonymousClass118 A04;
    public final C19830z4 A05;

    public static Bundle A00(ContentResolver contentResolver, Uri uri, Bundle bundle, CWB cwb, String str) {
        cwb.A00(uri);
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient != null) {
            try {
                return acquireUnstableContentProviderClient.call(str, (String) null, bundle);
            } finally {
                acquireUnstableContentProviderClient.release();
            }
        } else {
            throw AnonymousClass000.A0n("Failed to acquire client");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.A04.CFJ("FeO2ClientTypedContract_Authenticate", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.A05.A08(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.A04.CFJ("FeO2ClientTypedContract_Authenticate", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        com.whatsapp.util.Log.e("AutoconfManager/acquireAuthResponse", r0);
        r11.A00.A0G("AutoconfManager/acquireAuthResponse", r0.getMessage(), true);
        r7 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080 A[ExcHandler: C1R | RemoteException | IllegalArgumentException | SecurityException (r0v6 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:8:0x0025] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A04(java.lang.String r12) {
        /*
            r11 = this;
            r10 = 0
            if (r12 != 0) goto L_0x0009
            java.lang.String r0 = "AutoconfManager/acquireAuthResponse/null authChallenge"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0008:
            return r10
        L_0x0009:
            X.CSr r0 = r11.A01
            if (r0 != 0) goto L_0x0010
            r11.A01()
        L_0x0010:
            r0 = 8
            byte[] r1 = android.util.Base64.decode(r12, r0)
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "challenge"
            r2.putByteArray(r0, r1)
            r1 = 0
            java.lang.String r0 = "useDebugKey"
            r2.putBoolean(r0, r1)
            X.CSr r4 = r11.A01     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            X.C17960vV.A07(r4)     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            X.CKR r9 = new X.CKR     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r9.<init>(r2)     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r0.<init>()     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r7 = 0
            java.lang.String r3 = "FeO2ClientTypedContract_Authenticate"
            X.Cce r8 = r4.A05     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r8.A00(r9)     // Catch:{ Exception -> 0x003d, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            goto L_0x0043
        L_0x003d:
            r1 = move-exception
            X.E4l r0 = r4.A04     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r0.CFJ(r3, r1)     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
        L_0x0043:
            android.net.Uri r6 = r4.A01     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            X.CWB r5 = r4.A02     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            android.content.ContentResolver r1 = r4.A00     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            java.lang.String r2 = "authenticate"
            android.os.Bundle r0 = r9.A00     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            android.os.Bundle r0 = X.C26161CtZ.A00(r0)     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            android.os.Bundle r1 = A00(r1, r6, r0, r5, r2)     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            X.Cfi r0 = X.C25435Cfi.A01     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            X.C5w r0 = r4.A03     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            A02(r1, r0, r2)     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            if (r1 == 0) goto L_0x0067
            android.os.Bundle r0 = X.C26161CtZ.A00(r1)     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            X.CKS r7 = new X.CKS     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
        L_0x0067:
            r8.A01(r7)     // Catch:{ Exception -> 0x006b, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            goto L_0x0091
        L_0x006b:
            r1 = move-exception
            X.E4l r0 = r4.A04     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r0.CFJ(r3, r1)     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            goto L_0x0091
        L_0x0072:
            r2 = move-exception
            X.Cce r0 = r4.A05     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r0.A08(r2)     // Catch:{ Exception -> 0x0079, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            goto L_0x007f
        L_0x0079:
            r1 = move-exception
            X.E4l r0 = r4.A04     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r0.CFJ(r3, r1)     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
        L_0x007f:
            throw r2     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
        L_0x0080:
            r0 = move-exception
            java.lang.String r3 = "AutoconfManager/acquireAuthResponse"
            com.whatsapp.util.Log.e(r3, r0)
            X.190 r2 = r11.A00
            java.lang.String r1 = r0.getMessage()
            r0 = 1
            r2.A0G(r3, r1, r0)
            r7 = r10
        L_0x0091:
            if (r7 == 0) goto L_0x0008
            android.os.Bundle r2 = r7.A00
            java.lang.String r1 = "response"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00a2
            byte[] r10 = r2.getByteArray(r1)
            return r10
        L_0x00a2:
            java.lang.IllegalStateException r0 = X.BE6.A0k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26145Ct9.A04(java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.A04.CFJ("FeO2ClientTypedContract_Register", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.A05.A0A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.A04.CFJ("FeO2ClientTypedContract_Register", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        com.whatsapp.util.Log.e("AutoconfManager/acquireVerifier", r1);
        r11.A00.A0G("AutoconfManager/acquireVerifier/error", r1.getMessage(), true);
        r7 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080 A[ExcHandler: C1R | RemoteException | IllegalArgumentException | SecurityException (r1v3 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:8:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A06(java.lang.String r12) {
        /*
            r11 = this;
            r10 = 0
            if (r12 != 0) goto L_0x0009
            java.lang.String r0 = "AutoconfManager/acquireVerifier/null registerStartMessage"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0008:
            return r10
        L_0x0009:
            X.CSr r0 = r11.A01
            if (r0 != 0) goto L_0x0010
            r11.A01()
        L_0x0010:
            r0 = 8
            byte[] r1 = android.util.Base64.decode(r12, r0)
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "requestMessage"
            r2.putByteArray(r0, r1)
            r1 = 0
            java.lang.String r0 = "useDebugKey"
            r2.putBoolean(r0, r1)
            X.CKV r9 = new X.CKV
            r9.<init>(r2)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            X.CSr r4 = r11.A01     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            X.C17960vV.A07(r4)     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r7 = 0
            java.lang.String r3 = "FeO2ClientTypedContract_Register"
            X.Cce r8 = r4.A05     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r8.A04(r9)     // Catch:{ Exception -> 0x003d, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            goto L_0x0043
        L_0x003d:
            r1 = move-exception
            X.E4l r0 = r4.A04     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r0.CFJ(r3, r1)     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
        L_0x0043:
            android.net.Uri r6 = r4.A01     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            X.CWB r5 = r4.A02     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            android.content.ContentResolver r1 = r4.A00     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            java.lang.String r2 = "register"
            android.os.Bundle r0 = r9.A00     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            android.os.Bundle r0 = X.C26161CtZ.A00(r0)     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            android.os.Bundle r1 = A00(r1, r6, r0, r5, r2)     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            X.Cfi r0 = X.C25435Cfi.A01     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            X.C5w r0 = r4.A03     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            A02(r1, r0, r2)     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            if (r1 == 0) goto L_0x0067
            android.os.Bundle r0 = X.C26161CtZ.A00(r1)     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            X.CKW r7 = new X.CKW     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
        L_0x0067:
            r8.A05(r7)     // Catch:{ Exception -> 0x006b, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            goto L_0x0093
        L_0x006b:
            r1 = move-exception
            X.E4l r0 = r4.A04     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r0.CFJ(r3, r1)     // Catch:{ Exception -> 0x0072, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            goto L_0x0093
        L_0x0072:
            r2 = move-exception
            X.Cce r0 = r4.A05     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r0.A0A(r2)     // Catch:{ Exception -> 0x0079, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            goto L_0x007f
        L_0x0079:
            r1 = move-exception
            X.E4l r0 = r4.A04     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
            r0.CFJ(r3, r1)     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
        L_0x007f:
            throw r2     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x0080 }
        L_0x0080:
            r1 = move-exception
            java.lang.String r0 = "AutoconfManager/acquireVerifier"
            com.whatsapp.util.Log.e(r0, r1)
            X.190 r3 = r11.A00
            java.lang.String r2 = r1.getMessage()
            r1 = 1
            java.lang.String r0 = "AutoconfManager/acquireVerifier/error"
            r3.A0G(r0, r2, r1)
            r7 = r10
        L_0x0093:
            if (r7 == 0) goto L_0x0008
            android.os.Bundle r2 = r7.A00
            java.lang.String r1 = "verifier"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00a4
            byte[] r10 = r2.getByteArray(r1)
            return r10
        L_0x00a4:
            java.lang.IllegalStateException r0 = X.BE6.A0k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26145Ct9.A06(java.lang.String):byte[]");
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.E4l, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [X.C5w, java.lang.Object] */
    private void A01() {
        PackageManager packageManager = this.A04.A00.getPackageManager();
        AnonymousClass11B A0O = this.A03.A0O();
        ? obj = new Object();
        ? obj2 = new Object();
        obj2.A00 = obj;
        HashSet A12 = C17880vN.A12();
        C17960vV.A07(A0O);
        C23551Ble builder = C23552Blf.builder();
        Signature[] signatureArr = AnonymousClass9U5.A02;
        int i = 0;
        do {
            builder.put(C24717CHe.A02, signatureArr[i]);
            i++;
        } while (i < 2);
        this.A01 = new C24991CSr(A0O.A00, new CWB(packageManager, builder.build(), C199410f.of()), obj2, obj, new C25281Cce(obj, A12));
    }

    public static void A02(Bundle bundle, C24481C5w c5w, String str) {
        String str2;
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("@exception@");
            if (bundle2 != null) {
                Throwable A012 = c5w.A00(bundle2).A01();
                String message = A012.getMessage();
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Exception in provider when invoking ");
                A10.append(str);
                A10.append("(): ");
                C17900vP.A0a(A012, A10);
                if (message != null) {
                    str2 = AnonymousClass001.A1H(": ", message, AnonymousClass000.A10());
                } else {
                    str2 = "";
                }
                throw new C1R(AnonymousClass000.A0y(str2, A10), A012);
            }
            return;
        }
        throw BE6.A0m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r4.A04.CFJ("FeO2ClientTypedContract_Query", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0095, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r4.A05.A09(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r4.A04.CFJ("FeO2ClientTypedContract_Query", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a2, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a3, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a6, code lost:
        if ((r2 instanceof android.os.RemoteException) != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a8, code lost:
        r1 = r11.A05;
        r0 = "error_remote_exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ac, code lost:
        r1.A1W(r0);
        com.whatsapp.util.Log.e("AutoconfManager/acquireClientCapabilities", r2);
        r11.A00.A0G("AutoconfManager/acquireClientCapabilities/error", r2.getMessage(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c4, code lost:
        if ((r2 instanceof X.C1R) != false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c6, code lost:
        r1 = r11.A05;
        r0 = "error_wrapped_provider_exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cb, code lost:
        r0 = r2 instanceof java.lang.IllegalArgumentException;
        r1 = r11.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cf, code lost:
        if (r0 != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d1, code lost:
        r0 = "error_illegal_argument_exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d4, code lost:
        r0 = "error_security_exception";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a3 A[ExcHandler: C1R | RemoteException | IllegalArgumentException | SecurityException (r2v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:8:0x001a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A03() {
        /*
            r11 = this;
            byte[] r0 = r11.A02
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "AutoconfManager/acquireClientCapabilities/found cached clientCapabilities"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0z4 r1 = r11.A05
            java.lang.String r0 = "client_capabilities_cached"
            r1.A1W(r0)
        L_0x0010:
            byte[] r0 = r11.A02
            return r0
        L_0x0013:
            X.CSr r0 = r11.A01
            if (r0 != 0) goto L_0x001a
            r11.A01()
        L_0x001a:
            X.CSr r4 = r11.A01     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            X.C17960vV.A07(r4)     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            android.os.Bundle r2 = X.C17880vN.A0D()     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            r1 = 0
            java.lang.String r0 = "useDebugKey"
            r2.putBoolean(r0, r1)     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            X.CKT r10 = new X.CKT     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            r10.<init>(r2)     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            r0.<init>()     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            r6 = 0
            r7 = 0
            java.lang.String r3 = "FeO2ClientTypedContract_Query"
            X.Cce r9 = r4.A05     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            r9.A02(r10)     // Catch:{ Exception -> 0x003d, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            goto L_0x0043
        L_0x003d:
            r1 = move-exception
            X.E4l r0 = r4.A04     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            r0.CFJ(r3, r1)     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
        L_0x0043:
            android.net.Uri r8 = r4.A01     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            X.CWB r5 = r4.A02     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            android.content.ContentResolver r1 = r4.A00     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            java.lang.String r2 = "query"
            android.os.Bundle r0 = r10.A00     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            android.os.Bundle r0 = X.C26161CtZ.A00(r0)     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            android.os.Bundle r1 = A00(r1, r8, r0, r5, r2)     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            X.Cfi r0 = X.C25435Cfi.A01     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            X.C5w r0 = r4.A03     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            A02(r1, r0, r2)     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            if (r1 == 0) goto L_0x0067
            android.os.Bundle r0 = X.C26161CtZ.A00(r1)     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            X.CKU r7 = new X.CKU     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
        L_0x0067:
            r9.A03(r7)     // Catch:{ Exception -> 0x006b, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            goto L_0x0071
        L_0x006b:
            r1 = move-exception
            X.E4l r0 = r4.A04     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            r0.CFJ(r3, r1)     // Catch:{ Exception -> 0x0095, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
        L_0x0071:
            if (r7 == 0) goto L_0x0081
            android.os.Bundle r2 = r7.A00     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            java.lang.String r1 = "capabilities"
            boolean r0 = r2.containsKey(r1)     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            if (r0 == 0) goto L_0x0090
            byte[] r6 = r2.getByteArray(r1)     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
        L_0x0081:
            r11.A02 = r6     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            X.0z4 r1 = r11.A05     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            if (r6 != 0) goto L_0x008d
            java.lang.String r0 = "success_null_client_capabilities"
        L_0x0089:
            r1.A1W(r0)     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            goto L_0x0010
        L_0x008d:
            java.lang.String r0 = "success_get_client_capabilities"
            goto L_0x0089
        L_0x0090:
            java.lang.IllegalStateException r0 = X.BE6.A0k()     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            throw r0     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
        L_0x0095:
            r2 = move-exception
            X.Cce r0 = r4.A05     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            r0.A09(r2)     // Catch:{ Exception -> 0x009c, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3, C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            goto L_0x00a2
        L_0x009c:
            r1 = move-exception
            X.E4l r0 = r4.A04     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
            r0.CFJ(r3, r1)     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
        L_0x00a2:
            throw r2     // Catch:{ C1R | RemoteException | IllegalArgumentException | SecurityException -> 0x00a3 }
        L_0x00a3:
            r2 = move-exception
            boolean r0 = r2 instanceof android.os.RemoteException
            if (r0 == 0) goto L_0x00c2
            X.0z4 r1 = r11.A05
            java.lang.String r0 = "error_remote_exception"
        L_0x00ac:
            r1.A1W(r0)
            java.lang.String r0 = "AutoconfManager/acquireClientCapabilities"
            com.whatsapp.util.Log.e(r0, r2)
            X.190 r3 = r11.A00
            java.lang.String r2 = r2.getMessage()
            r1 = 1
            java.lang.String r0 = "AutoconfManager/acquireClientCapabilities/error"
            r3.A0G(r0, r2, r1)
            goto L_0x0010
        L_0x00c2:
            boolean r0 = r2 instanceof X.C1R
            if (r0 == 0) goto L_0x00cb
            X.0z4 r1 = r11.A05
            java.lang.String r0 = "error_wrapped_provider_exception"
            goto L_0x00ac
        L_0x00cb:
            boolean r0 = r2 instanceof java.lang.IllegalArgumentException
            X.0z4 r1 = r11.A05
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "error_illegal_argument_exception"
            goto L_0x00ac
        L_0x00d4:
            java.lang.String r0 = "error_security_exception"
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26145Ct9.A03():byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.A04.CFJ("FeO2ClientTypedContract_Start", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r4.A04.CFJ("FeO2ClientTypedContract_Start", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4.A05.A0B(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        com.whatsapp.util.Log.e("AutoconfManager/acquireClientStartMessage", r1);
        r11.A00.A0G("AutoconfManager/acquireClientStartMessage/error", r1.getMessage(), true);
        r7 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c A[ExcHandler: C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException (r1v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:4:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A05(java.lang.String r12) {
        /*
            r11 = this;
            X.CSr r0 = r11.A01
            if (r0 != 0) goto L_0x0007
            r11.A01()
        L_0x0007:
            r10 = 0
            X.CSr r0 = r11.A01     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            X.C17960vV.A07(r0)     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            android.os.Bundle r2 = X.C17880vN.A0D()     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            r1 = 0
            java.lang.String r0 = "useDebugKey"
            r2.putBoolean(r0, r1)     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            if (r12 == 0) goto L_0x0024
            r0 = 8
            byte[] r1 = android.util.Base64.decode(r12, r0)     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            java.lang.String r0 = "requestMessage"
            r2.putByteArray(r0, r1)     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
        L_0x0024:
            X.CSr r4 = r11.A01     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            X.CKX r9 = new X.CKX     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            r9.<init>(r2)     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            r0.<init>()     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            r7 = 0
            java.lang.String r3 = "FeO2ClientTypedContract_Start"
            X.Cce r8 = r4.A05     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            r8.A06(r9)     // Catch:{ Exception -> 0x0039, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            goto L_0x003f
        L_0x0039:
            r1 = move-exception
            X.E4l r0 = r4.A04     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            r0.CFJ(r3, r1)     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
        L_0x003f:
            android.net.Uri r6 = r4.A01     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            X.CWB r5 = r4.A02     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            android.content.ContentResolver r1 = r4.A00     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            java.lang.String r2 = "start"
            android.os.Bundle r0 = r9.A00     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            android.os.Bundle r0 = X.C26161CtZ.A00(r0)     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            android.os.Bundle r1 = A00(r1, r6, r0, r5, r2)     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            X.Cfi r0 = X.C25435Cfi.A01     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            X.C5w r0 = r4.A03     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            A02(r1, r0, r2)     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            if (r1 == 0) goto L_0x0063
            android.os.Bundle r0 = X.C26161CtZ.A00(r1)     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            X.CKY r7 = new X.CKY     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            r7.<init>(r0)     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
        L_0x0063:
            r8.A07(r7)     // Catch:{ Exception -> 0x0067, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            goto L_0x008f
        L_0x0067:
            r1 = move-exception
            X.E4l r0 = r4.A04     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            r0.CFJ(r3, r1)     // Catch:{ Exception -> 0x006e, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            goto L_0x008f
        L_0x006e:
            r2 = move-exception
            X.Cce r0 = r4.A05     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            r0.A0B(r2)     // Catch:{ Exception -> 0x0075, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c, C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            goto L_0x007b
        L_0x0075:
            r1 = move-exception
            X.E4l r0 = r4.A04     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
            r0.CFJ(r3, r1)     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
        L_0x007b:
            throw r2     // Catch:{ C1R | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x007c }
        L_0x007c:
            r1 = move-exception
            java.lang.String r0 = "AutoconfManager/acquireClientStartMessage"
            com.whatsapp.util.Log.e(r0, r1)
            X.190 r3 = r11.A00
            java.lang.String r2 = r1.getMessage()
            r1 = 1
            java.lang.String r0 = "AutoconfManager/acquireClientStartMessage/error"
            r3.A0G(r0, r2, r1)
            r7 = r10
        L_0x008f:
            if (r7 == 0) goto L_0x009f
            android.os.Bundle r2 = r7.A00
            java.lang.String r1 = "startMessage"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00a0
            byte[] r10 = r2.getByteArray(r1)
        L_0x009f:
            return r10
        L_0x00a0:
            java.lang.IllegalStateException r0 = X.BE6.A0k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26145Ct9.A05(java.lang.String):byte[]");
    }

    public C26145Ct9(AnonymousClass11C r2, AnonymousClass118 r3, C19830z4 r4) {
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r4;
    }
}
