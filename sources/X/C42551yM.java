package X;

import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import java.util.Locale;

/* renamed from: X.1yM  reason: invalid class name and case insensitive filesystem */
public class C42551yM {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public long A03;
    public long A04;
    public long A05 = 0;
    public long A06;
    public long A07;
    public long A08;
    public AnonymousClass202 A09 = AnonymousClass202.NEVER_SHOWN;
    public AnonymousClass201 A0A = AnonymousClass201.DEFAULT_ALL_MESSAGES;
    public C25550Cho A0B;
    public AnonymousClass200 A0C = AnonymousClass200.DEFAULT;
    public C85344Na A0D;
    public C85344Na A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public final AnonymousClass11P A0W;
    public final String A0X;
    public final AnonymousClass11C A0Y;
    public final C219217x A0Z;
    public final AnonymousClass1Nb A0a;

    public long A01() {
        long j = this.A06;
        if (j == -1) {
            return j;
        }
        if (j > AnonymousClass11P.A01(this.A0W)) {
            return this.A06;
        }
        return 0;
    }

    public C42551yM A02() {
        String str = this.A0X;
        if ("group_chat_defaults".equals(str) || "individual_chat_defaults".equals(str) || "channel_notification".equals(str) || "status_likes_notification".equals(str)) {
            return this;
        }
        if (GroupJid.Companion.A03(str) != null) {
            return this.A0a.A0V();
        }
        C29681ch A012 = C29681ch.A03.A01(str);
        AnonymousClass1Nb r0 = this.A0a;
        if (A012 != null) {
            return r0.A0X();
        }
        return r0.A0W();
    }

    public String A03() {
        String str;
        if (C29681ch.A03.A01(this.A0X) != null) {
            return null;
        }
        if ((this.A0V && (str = this.A0F) != null) || (str = A02().A0F) != null) {
            if (C64062u9.A0M(Uri.parse(str), this.A0Y, this.A0Z, false)) {
                return str;
            }
        }
        return Settings.System.DEFAULT_NOTIFICATION_URI.toString();
    }

    public String A04() {
        if (!this.A0V || TextUtils.isEmpty(this.A0G)) {
            return A02().A0G;
        }
        return this.A0G;
    }

    public String A05() {
        if (this.A0V && !TextUtils.isEmpty(this.A0I)) {
            return this.A0I;
        }
        String str = A02().A0I;
        if (str == null) {
            return "FFFFFF";
        }
        return str;
    }

    public String A06() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Integer.toString(0);
        }
        if (this.A0V && !TextUtils.isEmpty(this.A0J)) {
            return this.A0J;
        }
        String str = A02().A0J;
        String num = Integer.toString(0);
        if (str == null) {
            return num;
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (X.C64062u9.A0M(android.net.Uri.parse(r4), r5.A0Y, r5.A0Z, false) != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A07() {
        /*
            r5 = this;
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x0008
            java.lang.String r4 = r5.A0K
            if (r4 != 0) goto L_0x0010
        L_0x0008:
            X.1yM r0 = r5.A02()
            java.lang.String r4 = r0.A0K
            if (r4 == 0) goto L_0x0026
        L_0x0010:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 >= r0) goto L_0x0025
            X.11C r3 = r5.A0Y
            X.17x r2 = r5.A0Z
            android.net.Uri r1 = android.net.Uri.parse(r4)
            r0 = 0
            boolean r0 = X.C64062u9.A0M(r1, r3, r2, r0)
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            return r4
        L_0x0026:
            android.net.Uri r0 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42551yM.A07():java.lang.String");
    }

    public String A08() {
        if (this.A0V && !TextUtils.isEmpty(this.A0L)) {
            return this.A0L;
        }
        String str = A02().A0L;
        if (str == null) {
            return "1";
        }
        return str;
    }

    public boolean A09() {
        long j = this.A03;
        if (j != -1) {
            if (j > AnonymousClass11P.A01(this.A0W)) {
                j = this.A03;
            }
            return false;
        }
        if (j == 0) {
            return false;
        }
        return true;
    }

    public boolean A0B() {
        if (this.A0T || !A0A()) {
            return true;
        }
        return false;
    }

    public boolean A0C() {
        if (!this.A0V) {
            return A02().A0Q;
        }
        return this.A0Q;
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[25];
        String A072 = C22971Dz.A07(this.A0X);
        if (A072 == null) {
            A072 = "null";
        }
        objArr[0] = A072;
        objArr[1] = Long.valueOf(this.A04);
        objArr[2] = Long.valueOf(this.A06);
        objArr[3] = Boolean.valueOf(this.A0T);
        objArr[4] = Long.valueOf(this.A05);
        objArr[5] = Boolean.valueOf(this.A0V);
        objArr[6] = Integer.valueOf(this.A0A.value);
        objArr[7] = Integer.valueOf(this.A09.value);
        objArr[8] = this.A0K;
        objArr[9] = this.A0L;
        objArr[10] = this.A0J;
        objArr[11] = this.A0I;
        objArr[12] = this.A0F;
        objArr[13] = this.A0G;
        objArr[14] = Boolean.valueOf(this.A0U);
        objArr[15] = Boolean.valueOf(this.A0S);
        objArr[16] = Long.valueOf(this.A07);
        objArr[17] = Boolean.valueOf(this.A0Q);
        objArr[18] = Integer.valueOf(this.A01);
        objArr[19] = Boolean.valueOf(this.A0R);
        objArr[20] = Integer.valueOf(this.A00);
        objArr[21] = Integer.valueOf(this.A02);
        objArr[22] = Boolean.valueOf(this.A0P);
        objArr[23] = this.A0M;
        objArr[24] = this.A0N;
        return String.format(locale, "jid: %s deleted:%d muteEndTime:%d showNotificationWhenMuted:%b lastChatEntryTimestampMillis:%d useCustomNotification:%b notificationActivityLevel:%d notificationActivityBannerState:%d messageTone:%s messageVibrate:%s messagePopup:%s messageLight:%s callTone:%s callVibrate:%s statusMuted:%b pinned:%b pinned_time:%d lowPriorityNotifications:%b mediaVisibility:%d muteReactions:%b autoMutedStatus: %d pushRecordingButtonMode: %d enableMessageTranslation:%b sourceLang:%s targetLang:%s", objArr);
    }

    public C42551yM(AnonymousClass11C r3, AnonymousClass11P r4, C219217x r5, AnonymousClass1Nb r6, String str) {
        this.A0W = r4;
        this.A0Y = r3;
        this.A0a = r6;
        this.A0Z = r5;
        this.A0X = str;
    }

    public long A00() {
        return A01();
    }

    public boolean A0A() {
        if (A00() != 0) {
            return true;
        }
        return false;
    }
}
