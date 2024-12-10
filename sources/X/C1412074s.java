package X;

import android.content.DialogInterface;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.74s  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1412074s implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ExportMigrationActivity A01;

    public final void onClick(DialogInterface dialogInterface, int i) {
        ExportMigrationActivity exportMigrationActivity = this.A01;
        long j = this.A00;
        C108965cb.A0S(exportMigrationActivity).A00(exportMigrationActivity.A0L, 7);
        ExportMigrationActivity.A0V(exportMigrationActivity, new C146487Ph(exportMigrationActivity, j, 19), new C70593Bs(exportMigrationActivity, 43), false);
    }

    public /* synthetic */ C1412074s(ExportMigrationActivity exportMigrationActivity, long j) {
        this.A01 = exportMigrationActivity;
        this.A00 = j;
    }
}
