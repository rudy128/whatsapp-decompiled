package X;

import android.content.Intent;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.Aio  reason: case insensitive filesystem */
public class C21359Aio implements Runnable {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;

    public C21359Aio(Object obj, int i, long j, long j2) {
        this.A00 = i;
        this.A03 = obj;
        this.A01 = j;
        this.A02 = j2;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.9lx, java.lang.Object] */
    public final void run() {
        Intent A0G;
        switch (this.A00) {
            case 0:
                ExportMigrationActivity.A0Q((ExportMigrationActivity) this.A03, this.A01 - this.A02);
                return;
            case 1:
                IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel = (IndiaUpiPauseMandateViewModel) this.A03;
                long j = this.A01;
                long j2 = this.A02;
                C196219ue r2 = AnonymousClass8BS.A0C(indiaUpiPauseMandateViewModel.A01).A0H;
                C17960vV.A07(r2);
                ? obj = new Object();
                obj.A02 = "PAUSE";
                obj.A03 = "PENDING";
                obj.A01 = j;
                obj.A00 = j2;
                r2.A0B = obj;
                AnonymousClass8BR.A0O(indiaUpiPauseMandateViewModel.A08).A0c(indiaUpiPauseMandateViewModel.A01);
                indiaUpiPauseMandateViewModel.A03.A0J(new C21448AkF(indiaUpiPauseMandateViewModel, 0));
                return;
            case 2:
                VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A03;
                long j3 = this.A01;
                long j4 = this.A02;
                if (!AnonymousClass8BR.A1O(verifyPhoneNumber)) {
                    AnonymousClass4Yv.A00(verifyPhoneNumber, 43);
                }
                if (verifyPhoneNumber.A02 == 0) {
                    A0G = AnonymousClass1LU.A1W(verifyPhoneNumber, (String) null, (String) null, -1, 0, 0, j3, j4, 0, 0, verifyPhoneNumber.A1Z, AnonymousClass8BR.A1O(verifyPhoneNumber), verifyPhoneNumber.A1N, false);
                } else {
                    A0G = AnonymousClass1LU.A0G(verifyPhoneNumber, 0, 3, j3, j4, 0, verifyPhoneNumber.A1N, verifyPhoneNumber.A1Z);
                }
                C33841jT.A03(verifyPhoneNumber.A0j, verifyPhoneNumber.A4e(), true);
                verifyPhoneNumber.finish();
                verifyPhoneNumber.startActivity(A0G);
                return;
            case 3:
                AnonymousClass74M r0 = (AnonymousClass74M) this.A03;
                long j5 = this.A01;
                long j6 = this.A02;
                r0.A1A.A01(j5, j6, System.currentTimeMillis(), r0.A0w.A0B);
                return;
            default:
                AnonymousClass74M r02 = (AnonymousClass74M) this.A03;
                r02.A1A.A02(this.A01, r02.A0w.A0B, this.A02);
                return;
        }
    }
}
