package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.71e  reason: invalid class name and case insensitive filesystem */
public class C1403771e {
    public final AnonymousClass118 A00;
    public final C27301Vn A01;
    public final C18000vb A02;

    public static void A01(C1403771e r4, String str, String str2, int i, boolean z) {
        boolean z2 = true;
        int i2 = 100;
        if (i == -1) {
            z2 = false;
            i2 = 0;
            i = 0;
        }
        C1409673t A002 = A00(r4);
        A002.A07(i2, i, false);
        A002.A0G(z);
        A002.A0H(z2);
        A002.A0E(str);
        A002.A0D(str2);
        r4.A01.BkR(31, A002.A05());
    }

    public static C1409673t A00(C1403771e r5) {
        Context context = r5.A00.A00;
        Intent intent = new Intent(context, ExportMigrationActivity.class);
        intent.setAction("com.whatsapp.export.ACTION_OPENED_VIA_NOTIFICATION");
        C1409673t A03 = C217217d.A03(context);
        A03.A0M = "other_notifications@1";
        int i = -2;
        if (Build.VERSION.SDK_INT >= 26) {
            i = -1;
        }
        A03.A03 = i;
        A03.A0A = C17880vN.A07(context, intent, 0);
        C17880vN.A1G(A03);
        A03.A06 = 1;
        return A03;
    }

    public void A02(int i) {
        Context context = this.A00.A00;
        String string = context.getResources().getString(2131890246);
        if (i >= 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MessagesExporterNotificationManager/onProgress (");
            A10.append(i);
            C17890vO.A1A(A10, "%)");
            A01(this, string, AnonymousClass3MW.A0x(context.getResources(), this.A02.A0M().format(((double) i) / 100.0d), AnonymousClass3MW.A1a(), 0, 2131890245), i, false);
        }
    }

    public C1403771e(AnonymousClass118 r1, C27301Vn r2, C18000vb r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
