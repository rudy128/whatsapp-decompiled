package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat$InboxStyle;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2sq  reason: invalid class name and case insensitive filesystem */
public final class C63302sq {
    public final AnonymousClass118 A00;
    public final C27301Vn A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass00H A03;

    /* JADX WARNING: type inference failed for: r0v7, types: [X.72G, androidx.core.app.NotificationCompat$BigTextStyle] */
    public final void A03(Intent intent, C139316yd r7, CharSequence charSequence, String str, String str2, int i, int i2, boolean z, boolean z2) {
        String str3;
        C18070vi.A0d(str2, 1);
        if (!z && Build.VERSION.SDK_INT >= 26) {
            NotificationManager A07 = this.A02.A07();
            C17960vV.A07(A07);
            C18070vi.A0X(A07);
            if (!A01(A07)) {
                A00();
            }
        }
        Context context = this.A00.A00;
        if (z) {
            str3 = "critical_app_alerts@1";
        } else {
            str3 = "inactive_accounts";
        }
        C1409673t r1 = new C1409673t(context, str3);
        r1.A00 = C19740yt.A00(context, 2131102224);
        r1.A06(3);
        r1.A0Z = !z2;
        C17890vO.A0m(r1, str2, charSequence, true);
        r1.A08.icon = i;
        ? r0 = new AnonymousClass72G();
        r0.A07(charSequence);
        r1.A0B(r0);
        r1.A0A = C17880vN.A07(context, intent, 0);
        r1.A03 = 1;
        r1.A0F(charSequence);
        if (r7 != null) {
            r1.A0Q.add(r7);
        }
        C27301Vn r2 = this.A01;
        Notification A05 = r1.A05();
        C18070vi.A0X(A05);
        r2.BkS(str, 64, A05);
        ((AnonymousClass739) C18070vi.A0E(this.A03)).A04((Boolean) null, i2, 15);
    }

    public final void A04(Intent intent, C139316yd r8, String str, String str2, String str3, List list, boolean z) {
        C18070vi.A0e(str2, 1, list);
        C18070vi.A0d(str3, 3);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager A07 = this.A02.A07();
            C17960vV.A07(A07);
            C18070vi.A0X(A07);
            if (!A01(A07)) {
                A00();
            }
        }
        NotificationCompat$InboxStyle notificationCompat$InboxStyle = new NotificationCompat$InboxStyle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            if (charSequence != null) {
                notificationCompat$InboxStyle.A00.add(C1409673t.A04(charSequence));
            }
        }
        Context context = this.A00.A00;
        C1409673t r1 = new C1409673t(context, "inactive_accounts");
        r1.A00 = C19740yt.A00(context, 2131102224);
        r1.A06(3);
        r1.A0Z = !z;
        C17890vO.A0m(r1, str2, str3, true);
        C17880vN.A1G(r1);
        r1.A0B(notificationCompat$InboxStyle);
        r1.A0A = C17880vN.A07(context, intent, 0);
        r1.A03 = 1;
        r1.A0Q.add(r8);
        C27301Vn r2 = this.A01;
        Notification A05 = r1.A05();
        C18070vi.A0X(A05);
        r2.BkS(str, 64, A05);
        ((AnonymousClass739) C18070vi.A0E(this.A03)).A04((Boolean) null, 3, 15);
    }

    private final void A00() {
        NotificationManager A07 = this.A02.A07();
        C17960vV.A07(A07);
        C18070vi.A0X(A07);
        NotificationChannel notificationChannel = new NotificationChannel("inactive_accounts", this.A00.A01(2131893008), 4);
        notificationChannel.setLockscreenVisibility(0);
        notificationChannel.setShowBadge(true);
        A07.createNotificationChannel(notificationChannel);
    }

    public final void A02() {
        NotificationManager A07 = this.A02.A07();
        C17960vV.A07(A07);
        C18070vi.A0X(A07);
        if (A01(A07)) {
            A07.deleteNotificationChannel("inactive_accounts");
        }
    }

    public final void A05(String str) {
        C18070vi.A0d(str, 1);
        try {
            this.A01.BEK(64, str, "clear inactive account notifications");
        } catch (RuntimeException e) {
            Log.e("InactiveAccountNotification/clearNotifications/cancelfailed", e);
        }
    }

    public C63302sq(AnonymousClass11C r1, AnonymousClass118 r2, C27301Vn r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r1, r3, r4);
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = r3;
        this.A03 = r4;
    }

    public static final boolean A01(NotificationManager notificationManager) {
        List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
        C18070vi.A0X(notificationChannels);
        if (!(notificationChannels instanceof Collection) || !notificationChannels.isEmpty()) {
            for (NotificationChannel id : notificationChannels) {
                if (C18070vi.A18(id.getId(), "inactive_accounts")) {
                    return true;
                }
            }
        }
        return false;
    }
}
