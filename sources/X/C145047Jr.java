package X;

import com.whatsapp.migration.export.ui.ExportMigrationViewModel;

/* renamed from: X.7Jr  reason: invalid class name and case insensitive filesystem */
public class C145047Jr implements C22561BCu {
    public final /* synthetic */ ExportMigrationViewModel A00;

    public C145047Jr(ExportMigrationViewModel exportMigrationViewModel) {
        this.A00 = exportMigrationViewModel;
    }

    public void Bno() {
        this.A00.A0T(0);
    }

    public void Bnp() {
        this.A00.A0T(5);
    }

    public void Btc() {
        this.A00.A0T(2);
    }

    public void Btd(int i) {
        ExportMigrationViewModel exportMigrationViewModel = this.A00;
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass1DT r1 = exportMigrationViewModel.A01;
        if (!C42171xk.A00(valueOf, r1.A06())) {
            if (i > 100) {
                i = 100;
            } else if (i < 0) {
                i = 0;
            }
            AnonymousClass3MX.A1K(r1, i);
        }
    }

    public void Bte() {
        this.A00.A0T(1);
    }

    public void onError(int i) {
        ExportMigrationViewModel exportMigrationViewModel = this.A00;
        C17900vP.A0j("ExportMigrationViewModel/setErrorCode: ", AnonymousClass000.A10(), 1);
        AnonymousClass1DT r1 = exportMigrationViewModel.A00;
        if (!C108965cb.A1W(r1, 1)) {
            r1.A0E(1);
        }
    }
}
