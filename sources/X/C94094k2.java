package X;

import com.whatsapp.companiondevice.LinkedDevicesViewModel;
import java.util.List;

/* renamed from: X.4k2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94094k2 implements C34221k8 {
    public final /* synthetic */ LinkedDevicesViewModel A00;

    public final void C02(List list, List list2) {
        LinkedDevicesViewModel linkedDevicesViewModel = this.A00;
        linkedDevicesViewModel.A00 = list;
        linkedDevicesViewModel.A05.A0F((Object) null);
        if (!list.isEmpty() || !list2.isEmpty()) {
            linkedDevicesViewModel.A07.A0F(list);
            linkedDevicesViewModel.A06.A0F(list2);
            return;
        }
        linkedDevicesViewModel.A04.A0F((Object) null);
    }

    public /* synthetic */ C94094k2(LinkedDevicesViewModel linkedDevicesViewModel) {
        this.A00 = linkedDevicesViewModel;
    }
}
