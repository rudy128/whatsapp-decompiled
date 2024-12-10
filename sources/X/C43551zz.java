package X;

import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1zz  reason: invalid class name and case insensitive filesystem */
public class C43551zz extends C42551yM {
    public final C25201Nh A00;

    public C43551zz(AnonymousClass11C r7, AnonymousClass11P r8, C219217x r9, AnonymousClass1Nb r10, C25201Nh r11, String str) {
        super(r7, r8, r9, r10, str);
        this.A00 = r11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r3.A00;
        r2 = r3.A0X;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A00() {
        /*
            r3 = this;
            boolean r0 = r3.A0V
            if (r0 == 0) goto L_0x0034
            X.1Nh r0 = r3.A00
            java.lang.String r2 = r3.A0X
            android.app.NotificationChannel r0 = r0.A09(r2)
            if (r0 == 0) goto L_0x0034
            int r1 = r0.getImportance()
            r0 = 3
            if (r1 >= r0) goto L_0x0034
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "chat-settings-store/getMuteEndTime notification channel muted for:"
            r1.append(r0)
            java.lang.String r0 = X.C22971Dz.A07(r2)
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "null"
        L_0x0027:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = -1
            return r0
        L_0x0034:
            long r0 = r3.A01()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43551zz.A00():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.A00;
        r2 = r3.A0X;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B() {
        /*
            r3 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0034
            X.1Nh r0 = r3.A00
            java.lang.String r2 = r3.A0X
            android.app.NotificationChannel r0 = r0.A09(r2)
            if (r0 == 0) goto L_0x0034
            int r0 = r0.getImportance()
            if (r0 != 0) goto L_0x0034
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "chat-settings-store/getShowNotifications notification channel disabled for:"
            r1.append(r0)
            java.lang.String r0 = X.C22971Dz.A07(r2)
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "null"
        L_0x0028:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x0034:
            boolean r0 = super.A0B()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43551zz.A0B():boolean");
    }

    public String A0D() {
        C25201Nh r1 = this.A00;
        String A0E = r1.A0E("channel_notification");
        if (A0E != null) {
            return A0E;
        }
        return r1.A0D(Settings.System.DEFAULT_NOTIFICATION_URI, r1.A0F("channel_notification"), "channel_notification", "FFFFFF", "1", (String) null, 4);
    }

    public String A0E() {
        String str;
        Uri parse;
        C25201Nh r3 = this.A00;
        String str2 = this.A0X;
        String A0E = r3.A0E(str2);
        if (!TextUtils.isEmpty(A0E)) {
            return A0E;
        }
        if (this.A0V) {
            StringBuilder sb = new StringBuilder();
            sb.append("chat-settings-store/getNotificationChannelId missing channel for chat with custom notifications:");
            String A07 = C22971Dz.A07(str2);
            if (A07 == null) {
                A07 = "null";
            }
            sb.append(A07);
            Log.i(sb.toString());
            String A0F = r3.A0F(str2);
            int i = 4;
            if (A0C()) {
                i = 3;
            }
            String str3 = this.A0I;
            String str4 = this.A0L;
            String str5 = this.A0K;
            if (str5 == null) {
                parse = Uri.EMPTY;
            } else {
                parse = Uri.parse(str5);
            }
            if (!TextUtils.isEmpty(str5) && !C64062u9.A0M(parse, r3.A04, r3.A05, true)) {
                parse = Settings.System.DEFAULT_NOTIFICATION_URI;
            }
            r3.A0D(parse, A0F, str2, str3, str4, "channel_group_chats", i);
            return r3.A0E(str2);
        }
        if (C22971Dz.A0e(AnonymousClass1BI.A00.A02(str2))) {
            str = "group_chat_defaults";
        } else {
            str = "individual_chat_defaults";
        }
        return r3.A0E(str);
    }

    public String A0F() {
        C25201Nh r1 = this.A00;
        return r1.A0H(r1.A0E("silent_notifications"));
    }

    public boolean A0G() {
        C25201Nh r1 = this.A00;
        return r1.A0U(r1.A0E("voip_notification"));
    }
}
