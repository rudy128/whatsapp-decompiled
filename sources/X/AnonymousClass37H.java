package X;

import com.whatsapp.util.Log;

/* renamed from: X.37H  reason: invalid class name */
public class AnonymousClass37H implements AnonymousClass1O5 {
    public final C22701Cw A00;
    public final C21523AlW A01;
    public final /* synthetic */ C31451fa A02;

    public AnonymousClass37H(C22701Cw r1, C31451fa r2, C21523AlW alW) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = alW;
    }

    private void A00() {
        C22701Cw r6 = this.A00;
        long A012 = AnonymousClass11P.A01(r6.A05);
        C18010vc r5 = r6.A0A;
        C17880vN.A1D(r5.A05("keystore").edit(), "last_failed_auth_key_rotation_attempt", A012);
        r6.A0H(C17890vO.A00(r5.A05("keystore"), "remaining_auth_key_rotation_attempts") - 1);
    }

    public void BrD(String str) {
        Log.w("AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onDeliveryFailure");
    }

    public void Bt9(C29621ca r2, String str) {
        Log.w("AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onError: 500 IQ error");
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        if (r9 > ((long) r11)) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0112, code lost:
        com.whatsapp.util.Log.w("AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onSuccess: failed to overwrite existing authkey");
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r16, java.lang.String r17) {
        /*
            r15 = this;
            X.1Cw r3 = r15.A00
            X.AlW r2 = r15.A01
            monitor-enter(r3)
            X.C22701Cw.A07(r3)     // Catch:{ all -> 0x011b }
            X.0vc r5 = r3.A0A     // Catch:{ all -> 0x011b }
            java.lang.String r4 = "keystore"
            android.content.SharedPreferences r7 = r5.A05(r4)     // Catch:{ all -> 0x011b }
            X.0ve r8 = r3.A08     // Catch:{ all -> 0x011b }
            r0 = 831(0x33f, float:1.164E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x011b }
            boolean r0 = X.C18020vd.A05(r1, r8, r0)     // Catch:{ all -> 0x011b }
            if (r0 != 0) goto L_0x00c6
            X.1Cx r0 = r3.A01     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = "can_user_android_key_store"
            r6 = 0
            boolean r0 = r7.getBoolean(r0, r6)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x00c6
            android.content.SharedPreferences r9 = r5.A05(r4)     // Catch:{ all -> 0x011b }
            r0 = 375(0x177, float:5.25E-43)
            int r14 = X.C18020vd.A00(r1, r8, r0)     // Catch:{ all -> 0x011b }
            r0 = 384(0x180, float:5.38E-43)
            int r11 = X.C18020vd.A00(r1, r8, r0)     // Catch:{ all -> 0x011b }
            java.lang.String r8 = "client_static_keypair_enc_success"
            r0 = 0
            long r12 = r9.getLong(r8, r0)     // Catch:{ all -> 0x011b }
            java.lang.String r8 = "client_static_keypair_enc_failed"
            long r9 = r9.getLong(r8, r0)     // Catch:{ all -> 0x011b }
            long r0 = (long) r14     // Catch:{ all -> 0x011b }
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0052
            long r0 = (long) r11     // Catch:{ all -> 0x011b }
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r0 = 1
            if (r8 <= 0) goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            java.lang.String r9 = "AuthKeyStore/mismatch after rotation"
            if (r0 == 0) goto L_0x008f
            android.content.SharedPreferences r0 = r5.A05(r4)     // Catch:{ all -> 0x011b }
            X.C22701Cw.A05(r0)     // Catch:{ all -> 0x011b }
            byte[] r0 = r2.A02()     // Catch:{ all -> 0x011b }
            boolean r0 = X.C22701Cw.A0B(r3, r0)     // Catch:{ all -> 0x011b }
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = "authkeystore/overwriteExistingKeypairKeyStore: failed to write the new authkey, lost the old authkey"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x011b }
            r1 = 0
            goto L_0x0070
        L_0x006f:
            r1 = 1
        L_0x0070:
            java.lang.String r0 = "client_static_keypair_pwd_enc"
            boolean r0 = r7.contains(r0)     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x007b
            if (r0 == 0) goto L_0x00da
            goto L_0x00cd
        L_0x007b:
            if (r0 != 0) goto L_0x0111
            X.190 r4 = r3.A04     // Catch:{ all -> 0x011b }
            java.lang.String r1 = "AuthKeyStore/failed to rotate KeyStore key"
            java.lang.String r0 = "Failed to update new authkey to KeyStore"
            r4.A0G(r1, r0, r6)     // Catch:{ all -> 0x011b }
            byte[] r0 = r2.A02()     // Catch:{ all -> 0x011b }
            X.C22701Cw.A06(r7, r3, r0)     // Catch:{ all -> 0x011b }
            goto L_0x0111
        L_0x008f:
            android.content.SharedPreferences r0 = r5.A05(r4)     // Catch:{ all -> 0x011b }
            X.C22701Cw.A05(r0)     // Catch:{ all -> 0x011b }
            byte[] r0 = r2.A02()     // Catch:{ all -> 0x011b }
            boolean r0 = X.C22701Cw.A0B(r3, r0)     // Catch:{ all -> 0x011b }
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = "authkeystore/overwriteExistingKeypairKeyStore: failed to write the new authkey, lost the old authkey"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x011b }
            r8 = 0
            goto L_0x00a8
        L_0x00a7:
            r8 = 1
        L_0x00a8:
            boolean r10 = X.C22701Cw.A0A(r3, r2)     // Catch:{ all -> 0x011b }
            if (r8 == r10) goto L_0x00ca
            X.190 r7 = r3.A04     // Catch:{ all -> 0x011b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "KeyStoreKeyIsSuccessfullyRotated: "
            r1.append(r0)     // Catch:{ all -> 0x011b }
            r1.append(r8)     // Catch:{ all -> 0x011b }
            java.lang.String r0 = ", PwdKeyIsSuccessfullyRotated: "
            java.lang.String r0 = X.C17900vP.A0D(r0, r1, r10)     // Catch:{ all -> 0x011b }
            r7.A0G(r9, r0, r6)     // Catch:{ all -> 0x011b }
            goto L_0x00ca
        L_0x00c6:
            boolean r10 = X.C22701Cw.A0A(r3, r2)     // Catch:{ all -> 0x011b }
        L_0x00ca:
            if (r10 == 0) goto L_0x0111
            goto L_0x00da
        L_0x00cd:
            boolean r0 = X.C22701Cw.A0A(r3, r2)     // Catch:{ all -> 0x011b }
            if (r0 != 0) goto L_0x00da
            X.190 r1 = r3.A04     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "KeyStore key was rotated, PWD key was not rotated"
            r1.A0G(r9, r0, r6)     // Catch:{ all -> 0x011b }
        L_0x00da:
            r1 = 7
            X.2cV r0 = new X.2cV     // Catch:{ all -> 0x011b }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x011b }
            r3.A00 = r0     // Catch:{ all -> 0x011b }
            X.0z4 r0 = r3.A06     // Catch:{ all -> 0x011b }
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x011b }
            java.lang.String r1 = "connection_lc"
            r0 = 0
            X.C17880vN.A1C(r2, r1, r0)     // Catch:{ all -> 0x011b }
            X.1Ct r0 = r3.A07     // Catch:{ all -> 0x011b }
            r0.A04()     // Catch:{ all -> 0x011b }
            monitor-exit(r3)
            java.lang.String r0 = "AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onSuccess: success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r3.A0H(r0)
            X.11P r0 = r3.A05
            long r2 = X.AnonymousClass11P.A01(r0)
            android.content.SharedPreferences r0 = r5.A05(r4)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "last_succeeded_auth_key_rotation_attempt"
            X.C17880vN.A1D(r1, r0, r2)
            return
        L_0x0111:
            monitor-exit(r3)
            java.lang.String r0 = "AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onSuccess: failed to overwrite existing authkey"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r15.A00()
            return
        L_0x011b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37H.C7Z(X.1ca, java.lang.String):void");
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
