package X;

import com.whatsapp.voipcalling.Voip;

/* renamed from: X.7Pf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146467Pf implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    public final void run() {
        Voip.videoDeviceAndDisplayOrientationChanged(this.A00, this.A01 * 90, false);
    }

    public /* synthetic */ C146467Pf(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
