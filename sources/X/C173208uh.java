package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.whatsapp.infra.graphql.generated.reg.AccountTransferNotificationResponseImpl;

/* renamed from: X.8uh  reason: invalid class name and case insensitive filesystem */
public final class C173208uh extends AnonymousClass2SE {
    public final AnonymousClass11P A00;
    public final AnonymousClass118 A01;
    public final C27301Vn A02;
    public final AnonymousClass1LU A03;

    public void A02(C172768tz r11) {
        C27301Vn r7 = this.A02;
        AnonymousClass118 r1 = this.A01;
        Context A0E = C108945cZ.A0E(r1);
        String A0G = C18070vi.A0G(r1, 2131886420);
        String A0G2 = C18070vi.A0G(r1, 2131886419);
        C1409673t A032 = C217217d.A03(A0E);
        A032.A0M = "critical_app_alerts@1";
        A032.A03 = 1;
        A032.A0F(A0G2);
        A032.A09(AnonymousClass11P.A01(this.A00));
        A032.A06(3);
        C17890vO.A0m(A032, A0G, A0G2, true);
        NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
        notificationCompat$BigTextStyle.A07(A0G2);
        A032.A0B(notificationCompat$BigTextStyle);
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(A0E.getPackageName(), "com.whatsapp.migration.transfer.ui.P2pTransferQrScannerActivity");
        A0A.putExtra("hint", 2131886404);
        A0A.putExtra("entry_point", 4);
        A032.A0A = C1408573i.A00(A0E, 1, A0A, 0);
        C17880vN.A1G(A032);
        Notification A05 = A032.A05();
        C18070vi.A0X(A05);
        r7.BkR(101, A05);
    }

    public C173208uh(AnonymousClass11P r1, AnonymousClass118 r2, C27301Vn r3, AnonymousClass1LU r4) {
        C18070vi.A0s(r1, r2, r4, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public Class A00() {
        return AccountTransferNotificationResponseImpl.class;
    }

    public String A01() {
        return "AccountTransferNotification";
    }
}
