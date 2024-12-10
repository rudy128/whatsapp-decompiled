package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0vc  reason: invalid class name and case insensitive filesystem */
public class C18010vc {
    public static final Set A07;
    public static final Set A08;
    public static final Set A09 = new HashSet();
    public static volatile File A0A;
    public final Context A00;
    public final AnonymousClass10Y A01;
    public final AnonymousClass10X A02;
    public final AnonymousClass10Z A03;
    public final AnonymousClass00H A04;
    public final Map A05 = new HashMap();
    public final AtomicInteger A06 = new AtomicInteger();

    public synchronized SharedPreferences A04(String str) {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            Map map = this.A05;
            String str2 = str;
            sharedPreferences = (SharedPreferences) map.get(str);
            if (sharedPreferences == null && (sharedPreferences = A00(A01(this.A00), str2, false, true, true)) != null) {
                map.put(str, sharedPreferences);
            }
        }
        return sharedPreferences;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.SharedPreferences A05(java.lang.String r11) {
        /*
            r10 = this;
            r4 = r10
            monitor-enter(r4)
            java.util.Set r0 = A07     // Catch:{ all -> 0x004e }
            r6 = r11
            boolean r0 = r0.contains(r11)     // Catch:{ all -> 0x004e }
            r3 = 0
            if (r0 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            java.lang.Boolean r0 = X.C17960vV.A01     // Catch:{ all -> 0x004e }
            java.util.Set r0 = A08     // Catch:{ all -> 0x004e }
            boolean r0 = r0.contains(r11)     // Catch:{ all -> 0x004e }
            r8 = 0
            r9 = 1
            if (r0 != 0) goto L_0x001c
            goto L_0x001b
        L_0x001a:
            r8 = 1
        L_0x001b:
            r9 = 0
        L_0x001c:
            java.util.Map r2 = r10.A05     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r2.get(r11)     // Catch:{ all -> 0x004c }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x004a
            java.lang.Boolean r0 = X.C17970vW.A03     // Catch:{ all -> 0x004c }
            boolean r0 = A03(r11)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0038
            android.content.Context r0 = r10.A00     // Catch:{ all -> 0x004c }
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r11, r3)     // Catch:{ all -> 0x004c }
        L_0x0034:
            r2.put(r11, r1)     // Catch:{ all -> 0x004c }
            goto L_0x004a
        L_0x0038:
            android.content.Context r0 = r10.A00     // Catch:{ all -> 0x004c }
            java.io.File r5 = A01(r0)     // Catch:{ all -> 0x004c }
            r7 = 1
            X.10k r1 = r4.A00(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x0034
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r11, r3)     // Catch:{ all -> 0x004c }
            goto L_0x0034
        L_0x004a:
            monitor-exit(r4)
            return r1
        L_0x004c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18010vc.A05(java.lang.String):android.content.SharedPreferences");
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("com.whatsapp");
        sb.append("_preferences");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.whatsapp");
        sb2.append("_preferences_payments_debug");
        A07 = new HashSet(Arrays.asList(new String[]{sb.toString(), "ab-props", "ab-prechatd-props", "startup_prefs", "field-stats-events-sampling", "server_prop_preferences", "forced_blocked_shared_prefs", "debug_drawer", "com.whatsapp_payment_debug_preferences", sb2.toString()}));
        StringBuilder sb3 = new StringBuilder();
        String str = C19620yd.A09;
        sb3.append(str);
        sb3.append("_light_debug");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append("_light");
        A08 = new HashSet(Arrays.asList(new String[]{sb3.toString(), sb4.toString(), "xfamily_fb_account_file", "fb_credentials_prefs", "smb_subscription_pref_file", "premium_messages_pref_file", "smb_shared_preferences", "user_notice_prefs", "user_notice_cms_prefs", "privacy_disclosure_store", "tos_gating_prefs", "com.whatsapp_payment_preferences", "bonsai_prefs", "pref_smb_biz_tool_data_file", "fb_linked_account", "wa_ad_linked_account", "native_ads_settings", "com.whatsapp.w4b_ctwa_entrypoints", "pref_consumer_disclosure", "smb_eligibility_check_pref_file", "time_spent_prefs", "critical_event_client_prefs", "companion_mode_prefs", "register_phone_prefs", "ctwa_ads_entry_points", "anr_shared_prefs", "catalog_quality_shared_prefs"}));
    }

    public static File A01(Context context) {
        if (A0A == null) {
            A0A = new File(context.getFilesDir().getParent(), "shared_prefs");
        }
        return A0A;
    }

    public static synchronized void A02(String str) {
        synchronized (C18010vc.class) {
            A09.add(str);
        }
    }

    public static synchronized boolean A03(String str) {
        boolean contains;
        synchronized (C18010vc.class) {
            contains = A09.contains(str);
        }
        if (contains) {
            return true;
        }
        return false;
    }

    public C18010vc(Context context, AnonymousClass10Y r3, AnonymousClass10X r4, AnonymousClass10Z r5, AnonymousClass00H r6) {
        this.A00 = context;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
    }

    private C199910k A00(File file, String str, boolean z, boolean z2, boolean z3) {
        StringBuilder sb;
        if (!file.exists()) {
            try {
                file.mkdir();
                if (!file.exists()) {
                    sb = new StringBuilder();
                    sb.append("SharedPreferencesFactory/Failed to create preference dir ");
                    sb.append(file.getAbsolutePath());
                } else if (!file.isDirectory() || !file.canRead() || !file.canWrite()) {
                    sb = new StringBuilder();
                    sb.append("SharedPreferencesFactory/Invalid preference dir ");
                    sb.append(file.getAbsolutePath());
                    sb.append(", isDirectory=");
                    sb.append(file.isDirectory());
                    sb.append(", canRead=");
                    sb.append(file.canRead());
                    sb.append(", canWrite=");
                    sb.append(file.canWrite());
                }
                Log.e(sb.toString());
                return null;
            } catch (SecurityException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SharedPreferencesFactory/Unable to create LightSharedPreferences: ");
                sb2.append(file.getAbsolutePath());
                Log.e(sb2.toString(), e);
                return null;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(".xml");
        C199810j r2 = new C199810j(new File(file, sb3.toString()));
        AnonymousClass10X r3 = this.A02;
        int andIncrement = this.A06.getAndIncrement();
        return new C199910k(this.A01, r2, r3, this.A03, this.A04, str, andIncrement, z, z2, z3);
    }
}
