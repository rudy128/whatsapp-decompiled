package X;

import com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity;
import com.whatsapp.companiondevice.LinkedDeviceEditDeviceViewModel;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.5Ri  reason: invalid class name and case insensitive filesystem */
public final class C105265Ri extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ LinkedDeviceEditDeviceActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105265Ri(LinkedDeviceEditDeviceActivity linkedDeviceEditDeviceActivity) {
        super(1);
        this.this$0 = linkedDeviceEditDeviceActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        LinkedDeviceEditDeviceViewModel linkedDeviceEditDeviceViewModel = (LinkedDeviceEditDeviceViewModel) this.this$0.A0C.getValue();
        DeviceJid deviceJid = this.this$0.A05;
        if (deviceJid == null) {
            C18070vi.A11("deviceJid");
            throw null;
        }
        C98804rk.A01(linkedDeviceEditDeviceViewModel.A02, linkedDeviceEditDeviceViewModel, deviceJid, 42);
        return C27621Wu.A00;
    }
}
