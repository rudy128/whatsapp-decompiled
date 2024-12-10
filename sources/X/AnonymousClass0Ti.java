package X;

import androidx.car.app.model.OnCheckedChangeDelegateImpl;
import androidx.car.app.navigation.model.PanModeDelegateImpl;

/* renamed from: X.0Ti  reason: invalid class name */
public class AnonymousClass0Ti implements C15970rV {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public AnonymousClass0Ti(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final void BIx() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            ((PanModeDelegateImpl.PanModeListenerStub) obj).m21lambda$onPanModeChanged$0$androidxcarappnavigationmodelPanModeDelegateImpl$PanModeListenerStub(this.A02);
        } else {
            ((OnCheckedChangeDelegateImpl.OnCheckedChangeListenerStub) obj).m12lambda$onCheckedChange$0$androidxcarappmodelOnCheckedChangeDelegateImpl$OnCheckedChangeListenerStub(this.A02);
        }
        throw null;
    }
}
