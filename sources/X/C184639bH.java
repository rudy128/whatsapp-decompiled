package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.9bH  reason: invalid class name and case insensitive filesystem */
public class C184639bH {
    public final ComponentName A00;
    public final PackageManager A01;

    public C184639bH(Context context) {
        this.A01 = context.getPackageManager();
        this.A00 = new ComponentName(context, ExportMigrationActivity.class);
    }
}
