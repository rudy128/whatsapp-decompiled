package X;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ads  reason: case insensitive filesystem */
public final class C21062Ads implements C72413Lv {
    public final AnonymousClass11C A00;
    public final C219217x A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass118 A04;
    public final C19830z4 A05;

    public void Bi5(String str) {
        NotificationManager A07;
        C18070vi.A0d(str, 0);
        C22781De.A01();
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append("/settings/notifications-enabled: ");
        Context context = this.A04.A00;
        C17900vP.A0r(A11, new C27311Vp(context).A01());
        StringBuilder A112 = AnonymousClass000.A11(str);
        A112.append("/google-play-services: ");
        boolean z = false;
        if (C41371wF.A00(context) == 0) {
            z = true;
        }
        C17900vP.A0r(A112, z);
        AnonymousClass11C r3 = this.A00;
        PowerManager A0G = r3.A0G();
        if (A0G != null) {
            StringBuilder A113 = AnonymousClass000.A11(str);
            A113.append("/power-save-mode:");
            C17900vP.A0r(A113, A0G.isPowerSaveMode());
        }
        if (AnonymousClass112.A05() && (A07 = r3.A07()) != null) {
            int currentInterruptionFilter = A07.getCurrentInterruptionFilter();
            StringBuilder A114 = AnonymousClass000.A11(str);
            A114.append("/do-not-disturb:");
            boolean z2 = true;
            if (currentInterruptionFilter == 1 || currentInterruptionFilter == 0) {
                z2 = false;
            }
            C17900vP.A0r(A114, z2);
        }
        if (AnonymousClass112.A05()) {
            ActivityManager A042 = r3.A04();
            if (A042 != null) {
                StringBuilder A115 = AnonymousClass000.A11(str);
                A115.append("/background-restricted:");
                C17900vP.A0r(A115, A042.isBackgroundRestricted());
            }
            A00(str);
        }
    }

    public void BiC(C186289dx r18) {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder A11;
        String str5;
        String str6;
        C186289dx r10 = r18;
        C18070vi.A0d(r10, 0);
        Context context = r10.A00;
        Locale locale = C108965cb.A03(context).locale;
        C19830z4 r5 = this.A05;
        String A0t = C108955ca.A0t(r5);
        String A0u = C108955ca.A0u(r5);
        AnonymousClass11C r7 = this.A00;
        TelephonyManager A0K = r7.A0K();
        if (A0K != null) {
            str = A6P.A01(A0K.getNetworkOperator(), "N/A");
            C18070vi.A0X(str);
            str3 = A6P.A01(A0K.getSimOperator(), "N/A");
            C18070vi.A0X(str3);
            str2 = A0K.getNetworkOperatorName();
            C18070vi.A0X(str2);
        } else {
            str = "N/A (no telephony manager)";
            str2 = "UNKNOWN (no telephony manager)";
            str3 = str;
        }
        Integer valueOf = Integer.valueOf(this.A02.A06());
        Map map = r10.A01;
        map.put("Device ID", valueOf);
        map.put("Description", "2.24.24.78");
        map.put("Version", AnonymousClass000.A0y("", AnonymousClass000.A11("2.24.24.78")));
        map.put("App", "com.whatsapp");
        String str7 = "zz";
        if (locale != null) {
            str4 = locale.getCountry();
        } else {
            str4 = str7;
        }
        map.put("LC", str4);
        if (locale != null) {
            str7 = locale.getLanguage();
        }
        map.put("LG", str7);
        map.put("Carrier", str2);
        map.put("Manufacturer", Build.MANUFACTURER);
        map.put("Model", Build.MODEL);
        map.put("CPU ABI", C62912sC.A02());
        map.put("OS", Build.VERSION.RELEASE);
        map.put("Radio MCC-MNC", str);
        map.put("SIM MCC-MNC", str3);
        if (r10.A02) {
            A11 = AnonymousClass8BW.A0o("", A0t);
        } else {
            A11 = AnonymousClass000.A11(A0t);
            A11.append(' ');
            A11.append(A0u);
        }
        map.put("CCode", A11.toString());
        TelephonyManager A0K2 = r7.A0K();
        if (A0K2 != null) {
            int phoneType = A0K2.getPhoneType();
            if (phoneType == 0) {
                str5 = "NONE";
            } else if (phoneType == 1) {
                str5 = "GSM";
            } else if (phoneType == 2) {
                str5 = "CDMA";
            } else if (phoneType != 3) {
                str5 = "UNKNOWN";
            } else {
                str5 = "SIP";
            }
            switch (C62912sC.A01(A0K2, this.A01)) {
                case 1:
                    str6 = "GPRS";
                    break;
                case 2:
                    str6 = "EDGE";
                    break;
                case 3:
                    str6 = "UMTS";
                    break;
                case 4:
                    str6 = "CDMA";
                    break;
                case 5:
                    str6 = "CDMA - EvDo rev. 0";
                    break;
                case 6:
                    str6 = "CDMA - EvDo rev. A";
                    break;
                case 7:
                    str6 = "CDMA - 1xRTT";
                    break;
                case 8:
                    str6 = "HSDPA";
                    break;
                case 9:
                    str6 = "HSUPA";
                    break;
                case 10:
                    str6 = "HSPA";
                    break;
                case 11:
                    str6 = "iDEN";
                    break;
                case 12:
                    str6 = "CDMA - EvDo rev. B";
                    break;
                case 13:
                    str6 = "LTE";
                    break;
                case 14:
                    str6 = "CDMA - eHRPD";
                    break;
                case 15:
                    str6 = "HSPA+";
                    break;
                default:
                    str6 = "UNKNOWN";
                    break;
            }
        } else {
            str5 = "UNKNOWN (no telephony manager)";
            str6 = str5;
        }
        map.put("Target", "release");
        map.put("Product", Build.PRODUCT);
        map.put("Device", Build.DEVICE);
        map.put("Build", Build.FINGERPRINT);
        map.put("Board", Build.BOARD);
        map.put("Kernel", C17970vW.A00());
        map.put("Device ISO8601", AnonymousClass8BS.A0q("yyyy-MM-dd HH:mm:ss.SSSZ").format(new Date()));
        int length = str5.length();
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            sb.append(str5.charAt(i));
            sb.append('.');
        }
        map.put("Phone Type", sb.toString());
        int length2 = str6.length();
        StringBuilder sb2 = new StringBuilder(length2 * 2);
        for (int i2 = 0; i2 < length2; i2++) {
            sb2.append(str6.charAt(i2));
            sb2.append('.');
        }
        map.put("Network Type", sb2.toString());
        if (AnonymousClass112.A01()) {
            map.put("Missing Permissions", C181419Qk.A00(context));
        }
        map.put("Architecture", System.getProperty("os.arch"));
        if (AnonymousClass112.A05()) {
            AnonymousClass00H r4 = r5.A00;
            if (C17880vN.A0B(r4).getString("pref_primary_flash_call_status", (String) null) != null) {
                map.put("Primary flash call status", C17880vN.A0B(r4).getString("pref_primary_flash_call_status", (String) null));
            }
        }
        if (AnonymousClass112.A01()) {
            AnonymousClass00H r42 = r5.A00;
            if (C17880vN.A0B(r42).getString("pref_secondary_flash_call_status", (String) null) != null) {
                map.put("Secondary flash call status", C17880vN.A0B(r42).getString("pref_secondary_flash_call_status", (String) null));
            }
        }
        AnonymousClass00H r43 = r5.A00;
        map.put("AutoConf status", C17880vN.A0r(C17880vN.A0B(r43), "pref_autoconf_status"));
        if (C17880vN.A0B(r43).getString("pref_wa_old_status", (String) null) != null) {
            map.put("WA old status", C17880vN.A0B(r43).getString("pref_wa_old_status", (String) null));
        }
        if (C17880vN.A0B(r43).getString("pref_email_otp_status", (String) null) != null) {
            map.put("Email OTP status", C17880vN.A0B(r43).getString("pref_email_otp_status", (String) null));
        }
        if (C17880vN.A0B(r43).getString("pref_silent_auth_status", (String) null) != null) {
            map.put("Silent auth status", C17880vN.A0B(r43).getString("pref_silent_auth_status", (String) null));
        }
    }

    public /* synthetic */ void BiY(String str) {
    }

    private final void A00(String str) {
        StringBuilder sb;
        UsageStatsManager A08 = this.A00.A08();
        if (A08 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            UsageEvents queryEventsForSelf = A08.queryEventsForSelf(currentTimeMillis - TimeUnit.HOURS.toMillis(12), currentTimeMillis);
            C18070vi.A0X(queryEventsForSelf);
            UsageEvents.Event event = new UsageEvents.Event();
            while (queryEventsForSelf.getNextEvent(event)) {
                if (event.getEventType() == 11) {
                    StringBuilder A11 = AnonymousClass000.A11(str);
                    A11.append("/app-standby bucket:");
                    A11.append(event.getAppStandbyBucket());
                    A11.append(" time:");
                    C17890vO.A16(A11, event.getTimeStamp());
                }
            }
            sb = AnonymousClass000.A11(str);
            sb.append("/current app-standby bucket:");
            sb.append(A08.getAppStandbyBucket());
        } else {
            sb = AnonymousClass000.A11(str);
            sb.append("/usage-stats-manager null");
        }
        Log.i(sb.toString());
    }

    public C21062Ads(AnonymousClass11S r2, AnonymousClass11C r3, AnonymousClass11P r4, AnonymousClass118 r5, C219217x r6, C19830z4 r7) {
        C18070vi.A0w(r4, r5, r2, r3, r7);
        C18070vi.A0d(r6, 6);
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r2;
        this.A00 = r3;
        this.A05 = r7;
        this.A01 = r6;
    }
}
