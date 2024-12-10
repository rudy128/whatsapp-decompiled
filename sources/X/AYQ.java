package X;

import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;

public final /* synthetic */ class AYQ implements C22450B8i {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ IndiaUpiPauseMandateViewModel A02;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.9NY, java.lang.Object] */
    public final void C3f(A7B a7b) {
        IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel = this.A02;
        long j = this.A00;
        long j2 = this.A01;
        if (a7b == null) {
            indiaUpiPauseMandateViewModel.A09.CGF(new C21359Aio(indiaUpiPauseMandateViewModel, 1, j, j2));
            return;
        }
        ? obj = new Object();
        obj.A00 = 3;
        obj.A04 = a7b;
        indiaUpiPauseMandateViewModel.A02.A0E(obj);
    }

    public /* synthetic */ AYQ(IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel, long j, long j2) {
        this.A02 = indiaUpiPauseMandateViewModel;
        this.A00 = j;
        this.A01 = j2;
    }
}
