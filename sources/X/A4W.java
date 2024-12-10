package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;

public class A4W {
    public final AnonymousClass118 A00;
    public final C27301Vn A01;
    public final C18000vb A02;

    public static void A01(A4W a4w, String str, String str2, int i, boolean z, boolean z2) {
        boolean A1T = AnonymousClass000.A1T(i, -1);
        C1409673t A002 = A00(a4w, z2);
        int i2 = 100;
        if (A1T) {
            i2 = 0;
            i = 0;
        }
        A002.A07(i2, i, false);
        A002.A0G(z);
        A002.A0H(A1T);
        A002.A0E(str);
        A002.A0D(str2);
        a4w.A01.BkR(31, A002.A05());
    }

    public void A02(int i) {
        Context context = this.A00.A00;
        String string = context.getResources().getString(2131890828);
        int i2 = i;
        if (i >= 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GoogleMigrateNotificationManager/onProgress (");
            A10.append(i);
            C17890vO.A1A(A10, "%)");
            A01(this, string, AnonymousClass3MW.A0x(context.getResources(), AnonymousClass8BX.A0Z(this.A02, i), AnonymousClass3MW.A1a(), 0, 2131890827), i2, false, false);
        }
    }

    public static C1409673t A00(A4W a4w, boolean z) {
        Context context;
        Intent A07;
        if (z) {
            Intent A0A = C17880vN.A0A();
            context = a4w.A00.A00;
            A07 = A0A.setClassName(context.getPackageName(), "com.whatsapp.registration.RegisterName");
        } else {
            context = a4w.A00.A00;
            A07 = AnonymousClass8BR.A07(context, GoogleMigrateImporterActivity.class);
            A07.setAction(GoogleMigrateImporterActivity.A0F);
        }
        C1409673t A03 = C217217d.A03(context);
        A03.A0M = "other_notifications@1";
        int i = -2;
        if (Build.VERSION.SDK_INT >= 26) {
            i = -1;
        }
        A03.A03 = i;
        A03.A0A = C17880vN.A07(context, A07, 0);
        C17880vN.A1G(A03);
        A03.A06 = 1;
        return A03;
    }

    public A4W(AnonymousClass118 r1, C27301Vn r2, C18000vb r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
