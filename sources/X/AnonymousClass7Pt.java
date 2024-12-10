package X;

import com.whatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.7Pt  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7Pt implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ExportMigrationActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final void run() {
        ExportMigrationActivity exportMigrationActivity = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        long j = this.A00;
        C73203Rj A002 = AnonymousClass4a6.A00(exportMigrationActivity);
        A002.A0k(str);
        A002.A0S(str2);
        A002.A0T(false);
        AnonymousClass758.A01(A002, exportMigrationActivity, 6, 2131892293);
        A002.A0X(new C1412074s(exportMigrationActivity, j), 2131898766);
        A002.A0C();
    }

    public /* synthetic */ AnonymousClass7Pt(ExportMigrationActivity exportMigrationActivity, String str, String str2, long j) {
        this.A01 = exportMigrationActivity;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = j;
    }
}
