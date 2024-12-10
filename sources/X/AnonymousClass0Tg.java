package X;

import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.OnSelectedDelegateImpl;

/* renamed from: X.0Tg  reason: invalid class name */
public class AnonymousClass0Tg implements C15970rV {
    public final int A00;
    public final int A01;
    public final Object A02;

    public AnonymousClass0Tg(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void BIx() {
        int i = this.A00;
        Object obj = this.A02;
        if (i != 0) {
            ((OnSelectedDelegateImpl.OnSelectedListenerStub) obj).m16lambda$onSelected$0$androidxcarappmodelOnSelectedDelegateImpl$OnSelectedListenerStub(this.A01);
        } else {
            ((AlertCallbackDelegateImpl.AlertCallbackStub) obj).m8lambda$onAlertCancelled$0$androidxcarappmodelAlertCallbackDelegateImpl$AlertCallbackStub(this.A01);
        }
        throw null;
    }
}
