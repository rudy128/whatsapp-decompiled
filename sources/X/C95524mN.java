package X;

import android.app.Activity;
import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4mN  reason: invalid class name and case insensitive filesystem */
public class C95524mN implements C26701Td {
    public final int A00;
    public final Object A01;

    public C95524mN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BqZ(C59312m6 r4, boolean z) {
        Activity activity;
        Runnable runnable;
        switch (this.A00) {
            case 0:
                Log.w(C17900vP.A0D("LinkedDevicesEnterCodeActivity/companionDeviceObserver/onCriticalDataSyncFailed: ", AnonymousClass000.A10(), z));
                activity = (Activity) this.A01;
                runnable = new AnonymousClass7RF(this, r4, 25, z);
                break;
            case 3:
                Log.w(C17900vP.A0D("DevicePairQrScannerActivity/onCriticalDataSyncFailed: ", AnonymousClass000.A10(), z));
                activity = (Activity) this.A01;
                runnable = new C146867Qx(this, r4, 11, z);
                break;
            default:
                return;
        }
        activity.runOnUiThread(runnable);
    }

    public void BrL(C59312m6 r4) {
        Activity activity;
        Runnable runnable;
        switch (this.A00) {
            case 0:
                activity = (Activity) this.A01;
                runnable = new C98804rk(this, r4, 47);
                break;
            case 3:
                activity = (Activity) this.A01;
                runnable = new C146517Pk(this, r4, 19);
                break;
            default:
                return;
        }
        activity.runOnUiThread(runnable);
    }

    public void BrO(C59312m6 r4) {
        Activity activity;
        Runnable r1;
        switch (this.A00) {
            case 0:
                Log.i("LinkedDevicesEnterCodeActivity/companionDeviceObserver/onDeviceLoginComplete");
                activity = (Activity) this.A01;
                r1 = new C98804rk(this, r4, 45);
                break;
            case 1:
                ((LinkedDevicesSharedViewModel) this.A01).A0R.A0E((Object) null);
                return;
            case 2:
                IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A01;
                IdentityVerificationActivity.A0u(identityVerificationActivity, AnonymousClass11S.A00(identityVerificationActivity.A02));
                return;
            default:
                activity = (Activity) this.A01;
                r1 = new C146517Pk(this, r4, 18);
                break;
        }
        activity.runOnUiThread(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if (r4 != null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void BrP(X.C199410f r7, java.lang.String r8, int r9) {
        /*
            r6 = this;
            int r0 = r6.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x006b
            int r0 = r7.size()
            r3 = 1
            if (r0 != r3) goto L_0x0041
            java.lang.Object r5 = r6.A01
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r5 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r5
            X.1RK r2 = r5.A0F
            X.1IZ r0 = r7.iterator()
            com.whatsapp.jid.Jid r0 = X.C17880vN.A0S(r0)
            java.lang.String r1 = r0.getRawString()
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r0 = r0.A06(r1)
            X.C17960vV.A07(r0)
            X.4Zh r0 = X.AnonymousClass1RK.A00(r2, r0)
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L_0x0041
            android.app.Application r2 = r5.A04
            r1 = 2131896157(0x7f12275d, float:1.9427167E38)
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r0, r3)
            java.lang.String r4 = r2.getString(r1, r0)
            if (r4 != 0) goto L_0x004e
        L_0x0041:
            java.lang.Object r5 = r6.A01
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r5 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r5
            android.app.Application r2 = r5.A04
            r0 = 2131891666(0x7f1215d2, float:1.9418058E38)
            java.lang.String r4 = r2.getString(r0)
        L_0x004e:
            X.11E r0 = r5.A0C
            boolean r1 = r0.A09()
            r0 = 2131892439(0x7f1218d7, float:1.9419626E38)
            if (r1 == 0) goto L_0x005c
            r0 = 2131891665(0x7f1215d1, float:1.9418056E38)
        L_0x005c:
            java.lang.String r3 = r2.getString(r0)
            X.1KB r2 = r5.A07
            r1 = 7
            X.7Pq r0 = new X.7Pq
            r0.<init>(r6, r4, r3, r1)
            r2.A0J(r0)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95524mN.BrP(X.10f, java.lang.String, int):void");
    }

    public void BrS(C59312m6 r4) {
        Activity activity;
        Runnable runnable;
        switch (this.A00) {
            case 0:
                Log.i("LinkedDevicesEnterCodeActivity/companionDeviceObserver/onDeviceRegistered");
                activity = (Activity) this.A01;
                runnable = new C98804rk(this, r4, 44);
                break;
            case 3:
                activity = (Activity) this.A01;
                runnable = new C146517Pk(this, r4, 17);
                break;
            default:
                return;
        }
        activity.runOnUiThread(runnable);
    }

    public /* synthetic */ void BrT(C199410f r4) {
        switch (this.A00) {
            case 1:
                ((LinkedDevicesSharedViewModel) this.A01).A07.A0J(new C98764rg((Object) this, 35));
                return;
            case 2:
                IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A01;
                IdentityVerificationActivity.A0u(identityVerificationActivity, AnonymousClass11S.A00(identityVerificationActivity.A02));
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BrU() {
        if (1 - this.A00 == 0) {
            ((LinkedDevicesSharedViewModel) this.A01).A0R.A0E((Object) null);
        }
    }
}
