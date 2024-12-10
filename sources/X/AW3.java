package X;

import android.content.Context;
import com.whatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel;
import com.whatsapp.util.Log;

public class AW3 implements BDR {
    public final int A00;
    public final Object A01;

    public AW3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bno() {
        if (this.A00 != 0) {
            Log.i("GoogleMigrateImporterViewModel/onCancellationCompleted()");
            ((GoogleMigrateImporterViewModel) this.A01).A0W(C17880vN.A0i());
            return;
        }
        A4W a4w = ((GoogleMigrateService) this.A01).A03;
        Log.i("GoogleMigrateNotificationManager/onCancellationComplete()");
        A4W.A01(a4w, AnonymousClass3MW.A05(a4w.A00).getString(2131890823), (String) null, -1, true, true);
    }

    public void Bnp() {
        if (this.A00 != 0) {
            Log.i("GoogleMigrateImporterViewModel/onCancellationStarted()");
            ((GoogleMigrateImporterViewModel) this.A01).A0V(7);
            return;
        }
        A4W a4w = ((GoogleMigrateService) this.A01).A03;
        Log.i("GoogleMigrateNotificationManager/onCancelling()");
        A4W.A01(a4w, AnonymousClass3MW.A05(a4w.A00).getString(2131890822), (String) null, -1, false, false);
    }

    public void BpM(boolean z) {
        int i = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        if (i != 0) {
            C17900vP.A0n("GoogleMigrateImporterViewModel/onComplete()/success = ", A10, z);
            if (z) {
                GoogleMigrateImporterViewModel googleMigrateImporterViewModel = (GoogleMigrateImporterViewModel) this.A01;
                googleMigrateImporterViewModel.A0V(5);
                AnonymousClass3MX.A1K(googleMigrateImporterViewModel.A03, 100);
                return;
            }
            return;
        }
        C17900vP.A0n("GoogleMigrateService/onComplete/success = ", A10, z);
        if (z) {
            GoogleMigrateService googleMigrateService = (GoogleMigrateService) this.A01;
            A4W a4w = googleMigrateService.A03;
            Log.i("GoogleMigrateNotificationManager/onComplete()");
            A4W.A01(a4w, AnonymousClass3MW.A05(a4w.A00).getString(2131890824), (String) null, -1, true, false);
            Log.i("GoogleMigrateService/onComplete/sent import complete logging");
            AnonymousClass8BR.A0q(googleMigrateService.A05).A0H("google_migrate_import_complete", "google_migrate_import_complete_next");
        }
    }

    public void Bvm() {
        if (this.A00 != 0) {
            GoogleMigrateImporterViewModel googleMigrateImporterViewModel = (GoogleMigrateImporterViewModel) this.A01;
            googleMigrateImporterViewModel.A0V(3);
            AnonymousClass3MX.A1K(googleMigrateImporterViewModel.A03, -1);
            return;
        }
        ((GoogleMigrateService) this.A01).A03.A02(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r3 == 101) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C1V(int r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "GoogleMigrateImporterViewModel/onPrepareBeforeRetryCompleted()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 301(0x12d, float:4.22E-43)
            if (r3 == r0) goto L_0x0016
            r0 = 104(0x68, float:1.46E-43)
            if (r3 == r0) goto L_0x0016
            r0 = 101(0x65, float:1.42E-43)
            r1 = 0
            if (r3 != r0) goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            java.lang.Object r0 = r2.A01
            com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel r0 = (com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel) r0
            if (r1 == 0) goto L_0x0038
            r0.A0T()
        L_0x0020:
            return
        L_0x0021:
            r0 = 301(0x12d, float:4.22E-43)
            if (r3 == r0) goto L_0x0020
            r0 = 104(0x68, float:1.46E-43)
            if (r3 == r0) goto L_0x0020
            r0 = 101(0x65, float:1.42E-43)
            if (r3 == r0) goto L_0x0020
            java.lang.Object r0 = r2.A01
            com.whatsapp.migration.android.integration.service.GoogleMigrateService r0 = (com.whatsapp.migration.android.integration.service.GoogleMigrateService) r0
            X.A4W r1 = r0.A03
            r0 = 0
            r1.A02(r0)
            return
        L_0x0038:
            r0.A0U()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AW3.C1V(int):void");
    }

    public void C1W() {
        if (this.A00 != 0) {
            Log.i("GoogleMigrateImporterViewModel/onPrepareBeforeRetryStarted()");
            ((GoogleMigrateImporterViewModel) this.A01).A0V(17);
            return;
        }
        A4W a4w = ((GoogleMigrateService) this.A01).A03;
        A4W.A01(a4w, AnonymousClass3MW.A05(a4w.A00).getString(2131891797), (String) null, -1, true, false);
    }

    public void C20(int i) {
        int i2 = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        if (i2 != 0) {
            C17900vP.A0j("GoogleMigrateImporterViewModel/onProgress(); progress=", A10, i);
            GoogleMigrateImporterViewModel googleMigrateImporterViewModel = (GoogleMigrateImporterViewModel) this.A01;
            googleMigrateImporterViewModel.A0V(3);
            AnonymousClass3MX.A1K(googleMigrateImporterViewModel.A03, i);
            return;
        }
        C17900vP.A0j("GoogleMigrateService/onProgress; progress=", A10, i);
        ((GoogleMigrateService) this.A01).A03.A02(i);
    }

    public void onError(int i) {
        int i2 = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        if (i2 != 0) {
            C17900vP.A0j("GoogleMigrateImporterViewModel/onError()/errorCode = ", A10, i);
            ((GoogleMigrateImporterViewModel) this.A01).A0V(C181469Qp.A00(i));
            return;
        }
        C17900vP.A0j("GoogleMigrateService/onError/errorCode = ", A10, i);
        A4W a4w = ((GoogleMigrateService) this.A01).A03;
        Context context = a4w.A00.A00;
        A4W.A01(a4w, context.getResources().getString(2131890825), context.getResources().getString(2131890826), -1, true, false);
    }
}
