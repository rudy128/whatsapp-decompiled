package X;

import com.whatsapp.util.Log;

/* renamed from: X.30y  reason: invalid class name and case insensitive filesystem */
public class C678130y implements C72223Lc {
    public final /* synthetic */ C203711w A00;
    public final /* synthetic */ boolean A01;

    public C678130y(C203711w r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void C7G(C199410f r6) {
        Log.i("companion/deregister/sendCompanionDeviceLogoutRequest/onSuccess");
        C203711w r4 = this.A00;
        r4.A0I.post(new AnonymousClass7RK(27, (Object) r4, this.A01));
    }

    public void BtB(C199410f r6, String str, int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("companion/deregister/sendCompanionDeviceLogoutRequest/onError: ");
        A10.append(i);
        C17900vP.A0f("; ", str, A10);
        C203711w r4 = this.A00;
        r4.A0I.post(new AnonymousClass7RK(27, (Object) r4, this.A01));
    }
}
