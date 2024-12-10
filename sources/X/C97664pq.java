package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4pq  reason: invalid class name and case insensitive filesystem */
public class C97664pq implements C108555bt {
    public final int A00;
    public final Object A01;

    public C97664pq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00() {
        AnonymousClass1FU r3 = (AnonymousClass1FU) this.A01;
        if (!r3.Bed()) {
            C73203Rj A002 = AnonymousClass4a6.A00(r3);
            C73203Rj.A03(r3, A002);
            A002.A0d(r3, new C91614fy(this, 9));
            A002.A0E(2131889397);
            A002.A0D(2131889396);
            A002.A0C();
        }
    }

    public void BrR() {
        if (this.A00 != 0) {
            Log.i("QrScannerActivity/onDevicePairingRequested");
            DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this.A01;
            devicePairQrScannerActivity.A0D.get();
            devicePairQrScannerActivity.CNA(2131891825);
            Runnable runnable = devicePairQrScannerActivity.A0E;
            if (runnable != null) {
                devicePairQrScannerActivity.A00.removeCallbacks(runnable);
            }
            View view = devicePairQrScannerActivity.A00;
            Runnable runnable2 = devicePairQrScannerActivity.A0E;
            if (runnable2 == null) {
                runnable2 = new AnonymousClass7RB((Object) devicePairQrScannerActivity, 19);
                devicePairQrScannerActivity.A0E = runnable2;
            }
            view.postDelayed(runnable2, DevicePairQrScannerActivity.A0K);
            ((AnonymousClass4Qn) devicePairQrScannerActivity.A0B.get()).A00(0);
            return;
        }
        Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onDevicePairingRequested");
        ((LinkedDevicesEnterCodeActivity) this.A01).A0G.get();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.whatsapp.qrcode.DevicePairQrScannerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bw6() {
        /*
            r3 = this;
            int r0 = r3.A00
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r3.A01
            com.whatsapp.qrcode.DevicePairQrScannerActivity r0 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r0
            com.whatsapp.qrcode.DevicePairQrScannerActivity.A03(r0)
        L_0x000b:
            X.1KB r2 = r0.A05
            r1 = 2131888628(0x7f1209f4, float:1.9411897E38)
            r0 = 1
            r2.A08(r1, r0)
            return
        L_0x0015:
            java.lang.String r0 = "LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onInvalidDeviceTime"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r3.A01
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r0 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r0
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A0Q(r0)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97664pq.Bw6():void");
    }

    public void Bw7() {
        if (this.A00 != 0) {
            DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this.A01;
            DevicePairQrScannerActivity.A03(devicePairQrScannerActivity);
            C73203Rj A002 = AnonymousClass4a6.A00(devicePairQrScannerActivity);
            C73203Rj.A03(devicePairQrScannerActivity, A002);
            A002.A0d(devicePairQrScannerActivity, new C91614fy(this, 10));
            A002.A0E(2131891447);
            A002.A0D(2131891446);
            A002.A0C();
            ((AnonymousClass4Qn) devicePairQrScannerActivity.A0B.get()).A00(1);
            return;
        }
        Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onInvalidQrCode");
        ((AnonymousClass1FU) this.A01).A03.A0G("LinkedDevicesEnterCodeActivity/onInvalidQrCode", (String) null, true);
    }

    public void C00(String str, int i) {
        if (this.A00 != 0) {
            DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this.A01;
            DevicePairQrScannerActivity.A03(devicePairQrScannerActivity);
            if (i != 403) {
                if (i != 405) {
                    if (i == 419) {
                        devicePairQrScannerActivity.A05.A08(2131889987, 1);
                        devicePairQrScannerActivity.finish();
                        return;
                    } else if (i != 450) {
                        if (i != 452) {
                            if (i != 496) {
                                A00();
                                return;
                            } else {
                                Bw7();
                                return;
                            }
                        } else if (!devicePairQrScannerActivity.Bed()) {
                            AnonymousClass3MY.A1H(AnonymousClass4FY.A00(new AnonymousClass4bB(devicePairQrScannerActivity, 40), new AnonymousClass4bB(devicePairQrScannerActivity, 41), (CharSequence) null, new Object[0], (Object[]) null, 1000, 2131891685, 2131897387, 2131898766, 0), devicePairQrScannerActivity, (String) null);
                            return;
                        } else {
                            return;
                        }
                    }
                } else if (!devicePairQrScannerActivity.Bed()) {
                    Log.w("QrScannerActivity/onConsumerSmbCrossPairingError receive 405 error");
                    C73203Rj A002 = AnonymousClass4a6.A00(devicePairQrScannerActivity);
                    C73203Rj.A03(devicePairQrScannerActivity, A002);
                    A002.A0d(devicePairQrScannerActivity, new C91614fy(devicePairQrScannerActivity, 8));
                    A002.A0D(2131891654);
                    A002.A0E(2131889397);
                    A002.A0C();
                    return;
                } else {
                    return;
                }
            }
            devicePairQrScannerActivity.A05.CFY();
            devicePairQrScannerActivity.A05.A0K(devicePairQrScannerActivity.A0I, DevicePairQrScannerActivity.A0L);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onError errorCode: ");
        A10.append(i);
        C17900vP.A0f(" errorReason: ", str, A10);
        LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = (LinkedDevicesEnterCodeActivity) this.A01;
        if (!linkedDevicesEnterCodeActivity.Bed()) {
            LinkedDevicesEnterCodeActivity.A0Q(linkedDevicesEnterCodeActivity);
            LinkedDevicesEnterCodeActivity.A0c(linkedDevicesEnterCodeActivity, 0);
        }
    }

    public void C01() {
        if (this.A00 != 0) {
            DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this.A01;
            if (devicePairQrScannerActivity.A08.A00().A00 == null) {
                DevicePairQrScannerActivity.A0Q(devicePairQrScannerActivity);
                return;
            }
            return;
        }
        Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onSuccess");
        LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = (LinkedDevicesEnterCodeActivity) this.A01;
        if (!linkedDevicesEnterCodeActivity.Bed() && linkedDevicesEnterCodeActivity.A07.A00() == null) {
            LinkedDevicesEnterCodeActivity.A0V(linkedDevicesEnterCodeActivity);
        }
    }

    public void C35() {
        if (this.A00 != 0) {
            AnonymousClass4HV.A00((Activity) this.A01);
        } else {
            Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onRemovedAllDevices");
        }
    }

    public void C8G() {
        if (this.A00 != 0) {
            DevicePairQrScannerActivity.A03((DevicePairQrScannerActivity) this.A01);
            A00();
            return;
        }
        Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onSyncdDeleteAllError");
        LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = (LinkedDevicesEnterCodeActivity) this.A01;
        if (!linkedDevicesEnterCodeActivity.Bed()) {
            LinkedDevicesEnterCodeActivity.A0Q(linkedDevicesEnterCodeActivity);
            LinkedDevicesEnterCodeActivity.A0c(linkedDevicesEnterCodeActivity, 0);
        }
    }
}
