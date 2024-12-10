package X;

import com.whatsapp.util.Log;

/* renamed from: X.30z  reason: invalid class name and case insensitive filesystem */
public class C678230z implements C72223Lc {
    public final /* synthetic */ AnonymousClass1RK A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C678230z(AnonymousClass1RK r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = z2;
    }

    public void C7G(C199410f r5) {
        Log.i("companion-device-manager/createDeviceRemoveRequestProtocolHelper/onSuccess");
        AnonymousClass1RK r3 = this.A00;
        r3.A0I.execute(new C70753Cj(r5, r3, this.A02));
    }

    public void BtB(C199410f r5, String str, int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("companion-device-manager/createDeviceRemoveRequestProtocolHelper/onError: ");
        A10.append(i);
        C17900vP.A0f("; ", str, A10);
        if (this.A01) {
            AnonymousClass1RK r3 = this.A00;
            r3.A0I.execute(new C70753Cj(r5, r3, false));
            return;
        }
        this.A00.notifyAllObservers(new AnonymousClass35S(r5, str, i));
    }
}
