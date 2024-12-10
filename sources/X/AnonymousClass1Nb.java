package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Nb  reason: invalid class name */
public class AnonymousClass1Nb extends AnonymousClass1NZ implements C25141Na, C201511a {
    public C25201Nh A00;
    public C39561tH A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass1MC A04;
    public final AnonymousClass1M9 A05;
    public final AnonymousClass1NM A06;
    public final AnonymousClass11C A07;
    public final AnonymousClass11P A08;
    public final AnonymousClass118 A09;
    public final C219217x A0A;
    public final C19830z4 A0B;
    public final AnonymousClass1CJ A0C;
    public final AnonymousClass1NN A0D;
    public final AnonymousClass1CO A0E;
    public final C18030ve A0F;
    public final AnonymousClass12L A0G;
    public final AnonymousClass1NR A0H;
    public final AnonymousClass1DC A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final Map A0Q = new ConcurrentHashMap();
    public final AnonymousClass1NS A0R;
    public final AnonymousClass1CU A0S;
    public volatile Set A0T = null;

    private C42551yM A02(String str) {
        C25201Nh r5 = this.A00;
        String str2 = str;
        if (r5 == null || !C43541zy.A00) {
            return new C42551yM(this.A07, this.A08, this.A0A, this, str);
        }
        return new C43551zz(this.A07, this.A08, this.A0A, this, r5, str2);
    }

    public static Map A05(AnonymousClass1Nb r9, boolean z) {
        Cursor A0A2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        try {
            C28781at A052 = r9.A0U().get();
            try {
                A0A2 = ((C28801av) A052).A02.A0A("SELECT jid, pinned_time FROM settings WHERE pinned != 0 ORDER BY pinned_time DESC", "getPinnedJids/QUERY_CHAT_SETTINGS", (String[]) null);
                int columnIndex = A0A2.getColumnIndex("jid");
                int columnIndex2 = A0A2.getColumnIndex("pinned_time");
                while (A0A2.moveToNext()) {
                    AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(A0A2.getString(columnIndex));
                    long j = A0A2.getLong(columnIndex2);
                    if (A022 != null && (!z || !C22971Dz.A0V(A022))) {
                        linkedHashMap.put(A022, Long.valueOf(j));
                    }
                }
                A0A2.close();
                A052.close();
                for (Map.Entry entry : ((AnonymousClass1NG) r9.A0K.get()).A03(linkedHashMap.keySet()).entrySet()) {
                    Object remove = linkedHashMap.remove(entry.getKey());
                    if (remove != null) {
                        linkedHashMap.put(entry.getValue(), remove);
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                r9.A0T = unmodifiableMap.keySet();
                return unmodifiableMap;
            } catch (Throwable th) {
                A052.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/get-pinned-jids", e);
            r9.A0g();
            throw e;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public synchronized C39561tH A0U() {
        if (this.A01 == null) {
            C39561tH r1 = (C39561tH) this.A0S.CCq(Collections.emptySet());
            this.A01 = r1;
            C25201Nh r0 = this.A00;
            if (r0 != null) {
                C25201Nh A0B2 = r0.A0B();
                AnonymousClass10W r2 = r1.A01;
                AnonymousClass11L r12 = new AnonymousClass11L(A0B2);
                if (r2.A01.putIfAbsent(A0B2, r12) == null) {
                    r2.A02.add(A0B2);
                    r12.A00();
                }
            }
        }
        return this.A01;
    }

    public Long A0b(AnonymousClass1BI r4) {
        return A03(r4, 0, false);
    }

    public LinkedHashSet A0e() {
        Map A052 = A05(this, false);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Jid jid : A052.keySet()) {
            if (C22971Dz.A0V(jid)) {
                linkedHashSet.add(jid);
            }
        }
        return linkedHashSet;
    }

    public synchronized void A0i() {
        C39561tH r0 = this.A01;
        if (r0 != null) {
            r0.close();
            C25201Nh r1 = this.A00;
            if (r1 != null) {
                C39561tH r02 = this.A01;
                r02.A01.A01(r1.A0B());
            }
            this.A01 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x020e, code lost:
        if (r3 == null) goto L_0x0210;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C42551yM A00(android.database.Cursor r9, X.AnonymousClass1Nb r10) {
        /*
            java.lang.String r0 = "jid"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r9.getString(r0)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = ""
        L_0x000e:
            X.1yM r5 = r10.A02(r0)
            java.lang.String r0 = "mute_end"
            int r0 = r9.getColumnIndexOrThrow(r0)
            long r0 = r9.getLong(r0)
            r5.A06 = r0
            java.lang.String r0 = "muted_notifications"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r1 = r9.getInt(r0)
            r6 = 0
            r4 = 1
            r0 = 0
            if (r1 != r4) goto L_0x002e
            r0 = 1
        L_0x002e:
            r5.A0T = r0
            java.lang.String r0 = "use_custom_notifications"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r1 = r9.getInt(r0)
            r0 = 0
            if (r1 != r4) goto L_0x003f
            r0 = 1
        L_0x003f:
            r5.A0V = r0
            java.lang.String r0 = "message_tone"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r9.getString(r0)
            r5.A0K = r0
            java.lang.String r0 = "message_vibrate"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r9.getString(r0)
            r5.A0L = r0
            java.lang.String r0 = "message_popup"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r9.getString(r0)
            r5.A0J = r0
            java.lang.String r0 = "message_light"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r9.getString(r0)
            r5.A0I = r0
            java.lang.String r0 = "call_tone"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r9.getString(r0)
            r5.A0F = r0
            java.lang.String r0 = "call_vibrate"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r9.getString(r0)
            r5.A0G = r0
            java.lang.String r0 = "status_muted"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r1 = r9.getInt(r0)
            r0 = 0
            if (r1 != r4) goto L_0x0098
            r0 = 1
        L_0x0098:
            r5.A0U = r0
            java.lang.String r0 = "pinned"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r1 = r9.getInt(r0)
            r0 = 0
            if (r1 != r4) goto L_0x00a8
            r0 = 1
        L_0x00a8:
            r5.A0S = r0
            java.lang.String r0 = "pinned_time"
            int r0 = r9.getColumnIndexOrThrow(r0)
            long r0 = r9.getLong(r0)
            r5.A07 = r0
            java.lang.String r0 = "snooze_end_time"
            int r0 = r9.getColumnIndexOrThrow(r0)
            r1 = 0
            long r7 = X.AnonymousClass1Eu.A02(r9, r0, r1)
            r5.A08 = r7
            java.lang.String r0 = "low_pri_notifications"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r3 = r9.getInt(r0)
            r0 = 0
            if (r3 != r4) goto L_0x00d3
            r0 = 1
        L_0x00d3:
            r5.A0Q = r0
            java.lang.String r0 = "media_visibility"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r0 = r9.getInt(r0)
            r5.A01 = r0
            java.lang.String r0 = "mute_reactions"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r3 = r9.getInt(r0)
            r0 = 0
            if (r3 != r4) goto L_0x00ef
            r0 = 1
        L_0x00ef:
            r5.A0R = r0
            java.lang.String r3 = "0"
            java.lang.String r0 = r5.A0I
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00ff
            java.lang.String r0 = "000000"
            r5.A0I = r0
        L_0x00ff:
            java.lang.String r0 = "wallpaper_light_type"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r8 = r9.getString(r0)
            if (r8 == 0) goto L_0x0122
            java.lang.String r0 = "wallpaper_light_value"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r7 = r9.getString(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            X.4Na r0 = new X.4Na
            r0.<init>(r3, r8, r7)
            r5.A0E = r0
        L_0x0122:
            java.lang.String r0 = "wallpaper_dark_type"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r8 = r9.getString(r0)
            if (r8 == 0) goto L_0x0150
            java.lang.String r0 = "wallpaper_dark_value"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r7 = r9.getString(r0)
            java.lang.String r0 = "wallpaper_dark_opacity"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r0 = r9.getInt(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.4Na r0 = new X.4Na
            r0.<init>(r3, r8, r7)
            r5.A0D = r0
        L_0x0150:
            java.lang.String r0 = "notifications_auto_muted"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r0 = r9.getInt(r0)
            r5.A00 = r0
            java.lang.String r0 = "push_recording_button_mode"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r0 = r9.getInt(r0)
            r5.A02 = r0
            java.lang.String r0 = "call_mute_end_time"
            int r0 = r9.getColumnIndexOrThrow(r0)
            long r7 = r9.getLong(r0)
            r5.A03 = r7
            java.lang.String r0 = "auto_delete_media"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r0 = r9.getInt(r0)
            X.200 r0 = X.C50482Up.A00(r0)
            r5.A0C = r0
            X.CXq r3 = X.C25550Cho.A02
            java.lang.String r0 = "transcription_locale"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r0 = r9.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.Cho r0 = r3.A00(r0)
            r5.A0B = r0
            java.lang.String r0 = "enable_auto_message_translations"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r0 = r9.getInt(r0)
            if (r0 != r4) goto L_0x01a8
            r6 = 1
        L_0x01a8:
            r5.A0P = r6
            java.lang.String r0 = "source_lang"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r9.getString(r0)
            r5.A0M = r0
            java.lang.String r0 = "target_lang"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r9.getString(r0)
            r5.A0N = r0
            java.lang.String r0 = "theme_id"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r9.getString(r0)
            r5.A0H = r0
            java.lang.String r0 = "notification_activity_level"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r0 = r9.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.201 r0 = X.AnonymousClass2UH.A00(r0)
            r5.A0A = r0
            java.lang.String r0 = "notification_activity_banner_state"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r6 = r9.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            if (r0 == 0) goto L_0x0210
            X.0z2 r0 = X.AnonymousClass202.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x01fb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x022e
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.202 r0 = (X.AnonymousClass202) r0
            int r0 = r0.value
            if (r0 != r6) goto L_0x01fb
        L_0x020c:
            X.202 r3 = (X.AnonymousClass202) r3
            if (r3 != 0) goto L_0x0212
        L_0x0210:
            X.202 r3 = X.AnonymousClass202.NEVER_SHOWN
        L_0x0212:
            r5.A09 = r3
            java.lang.String r0 = "last_chat_entry_timestamp_millis"
            int r0 = r9.getColumnIndexOrThrow(r0)
            long r0 = X.AnonymousClass1Eu.A02(r9, r0, r1)
            r5.A05 = r0
            java.lang.String r0 = "theme_bundle_id"
            int r0 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r9.getString(r0)
            r5.A0O = r0
            return r5
        L_0x022e:
            r3 = 0
            goto L_0x020c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Nb.A00(android.database.Cursor, X.1Nb):X.1yM");
    }

    public static C42551yM A01(AnonymousClass1Nb r6, String str) {
        Cursor A0A2;
        Map map = r6.A0Q;
        C42551yM r0 = (C42551yM) map.get(str);
        if (r0 == null) {
            try {
                C28781at A052 = r6.A0U().get();
                try {
                    A0A2 = ((C28801av) A052).A02.A0A(C43481zs.A01, "loadChatSettings/QUERY_CHAT_SETTINGS", new String[]{str});
                    if (A0A2.moveToNext()) {
                        r0 = A00(A0A2, r6);
                        A0A2.close();
                        A052.close();
                    } else {
                        A0A2.close();
                        A052.close();
                        r0 = r6.A02(str);
                    }
                    map.put(str, r0);
                } catch (Throwable th) {
                    A052.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e("chat-settings-store/get", e);
                r6.A0g();
                throw e;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
        }
        return r0;
        throw th;
    }

    private Long A03(AnonymousClass1BI r19, long j, boolean z) {
        C28791au A062;
        long j2 = j;
        AnonymousClass1BI r7 = r19;
        boolean z2 = z;
        if (z) {
            this.A04.A00(r7, 7);
        }
        this.A0K.get();
        C42551yM A0a = A0a(r7);
        boolean z3 = A0a.A0S;
        long j3 = A0a.A07;
        try {
            A062 = A0U().A06();
            A0a.A0S = z2;
            if (!z) {
                j2 = 0;
            }
            A0a.A07 = j2;
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("pinned", Boolean.valueOf(A0a.A0S));
            contentValues.put("pinned_time", Long.valueOf(A0a.A07));
            C23141Ev r12 = ((C28801av) A062).A02;
            boolean z4 = true;
            if (r12.A02(contentValues, "settings", "jid =?", "ChatSettingsStore/setPin/UPDATE_CHAT_SETTINGS", new String[]{r7.getRawString()}) == 0) {
                contentValues.put("jid", r7.getRawString());
                r12.A05("settings", "ChatSettingsStore/setPin/INSERT_CHAT_SETTINGS", contentValues);
            }
            if (z3 == z2 && j3 == A0a.A07) {
                z4 = false;
            }
            A062.close();
            this.A0D.A00();
            if (C22971Dz.A0V(r7)) {
                this.A03.A0J(new C146527Pl(this, r7, 28));
            }
            if (z4) {
                A05(this, true).keySet();
            }
            if (z4) {
                return Long.valueOf(j3);
            }
            return null;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/set-pin", e);
            A0g();
            throw e;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public static HashSet A04(AnonymousClass1Nb r6) {
        Cursor A0A2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            C28781at A052 = r6.A0U().get();
            try {
                A0A2 = ((C28801av) A052).A02.A0A("SELECT jid FROM settings WHERE use_custom_notifications != 0", "getCustomNotificationJids/QUERY_CHAT_SETTINGS", (String[]) null);
                int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("jid");
                while (A0A2.moveToNext()) {
                    AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(A0A2.getString(columnIndexOrThrow));
                    if (A022 != null) {
                        linkedHashSet.add(A022);
                    }
                }
                A0A2.close();
                A052.close();
                return new HashSet(((AnonymousClass1NG) r6.A0K.get()).A03(linkedHashSet).values());
            } catch (Throwable th) {
                A052.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/get-pinned-jids", e);
            r6.A0g();
            throw e;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    private void A06() {
        C25201Nh r1;
        AnonymousClass1NS r0;
        C25201Nh r02 = this.A00;
        if (r02 != null) {
            r02.A0K();
        }
        if (!AnonymousClass112.A03() || (r0 = this.A0R) == null) {
            r1 = null;
        } else {
            AnonymousClass10E r12 = r0.A00.A00;
            C18030ve r23 = (C18030ve) r12.A04.get();
            AnonymousClass1NN r22 = (AnonymousClass1NN) r12.A2q.get();
            C25181Nf r21 = (C25181Nf) r12.A2o.get();
            AnonymousClass1CJ r20 = (AnonymousClass1CJ) r12.A2H.get();
            C19830z4 r19 = (C19830z4) r12.ABl.get();
            C219217x r18 = (C219217x) r12.ABj.get();
            AnonymousClass118 r17 = (AnonymousClass118) r12.ABY.get();
            AnonymousClass11P r16 = (AnonymousClass11P) r12.AAv.get();
            AnonymousClass11C r15 = (AnonymousClass11C) r12.AAp.get();
            C24921Me r14 = (C24921Me) r12.ABX.get();
            r1 = new C25201Nh((AnonymousClass1KB) r12.A4b.get(), (C24671Lf) r12.A2g.get(), r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, (C25191Ng) r12.A4u.get(), (AnonymousClass10I) r12.AC1.get(), (C25151Nc) r12.ABk.get());
        }
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x017b, code lost:
        if (r3.A01() == 0) goto L_0x017d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.C42551yM r16, X.AnonymousClass1Nb r17) {
        /*
            r0 = 24
            android.content.ContentValues r13 = new android.content.ContentValues
            r13.<init>(r0)
            r3 = r16
            boolean r0 = r3.A0V
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "use_custom_notifications"
            r13.put(r0, r1)
            java.lang.String r1 = "message_tone"
            java.lang.String r0 = r3.A07()
            r13.put(r1, r0)
            java.lang.String r1 = "message_vibrate"
            java.lang.String r0 = r3.A08()
            r13.put(r1, r0)
            java.lang.String r1 = "message_popup"
            java.lang.String r0 = r3.A06()
            r13.put(r1, r0)
            java.lang.String r1 = "message_light"
            java.lang.String r0 = r3.A05()
            r13.put(r1, r0)
            java.lang.String r1 = "call_tone"
            java.lang.String r0 = r3.A03()
            r13.put(r1, r0)
            java.lang.String r1 = "call_vibrate"
            java.lang.String r0 = r3.A04()
            r13.put(r1, r0)
            boolean r0 = r3.A0S
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "pinned"
            r13.put(r0, r1)
            long r0 = r3.A07
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "pinned_time"
            r13.put(r0, r1)
            boolean r0 = r3.A0U
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "status_muted"
            r13.put(r0, r1)
            boolean r0 = r3.A0C()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "low_pri_notifications"
            r13.put(r0, r1)
            int r0 = r3.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "media_visibility"
            r13.put(r0, r1)
            X.200 r0 = r3.A0C
            int r0 = r0.value
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "auto_delete_media"
            r13.put(r0, r1)
            X.1yM r0 = r3.A02()
            boolean r0 = r0.A0R
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "mute_reactions"
            r13.put(r0, r1)
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "notifications_auto_muted"
            r13.put(r0, r1)
            int r0 = r3.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "push_recording_button_mode"
            r13.put(r0, r1)
            X.4Na r0 = r3.A0E
            java.lang.String r2 = "wallpaper_light_value"
            java.lang.String r1 = "wallpaper_light_type"
            r5 = 0
            if (r0 == 0) goto L_0x0196
            java.lang.String r0 = r0.A01
            r13.put(r1, r0)
            X.4Na r0 = r3.A0E
            java.lang.String r0 = r0.A02
            r13.put(r2, r0)
        L_0x00ce:
            X.4Na r0 = r3.A0D
            java.lang.String r4 = "wallpaper_dark_opacity"
            java.lang.String r2 = "wallpaper_dark_value"
            java.lang.String r1 = "wallpaper_dark_type"
            if (r0 == 0) goto L_0x018b
            java.lang.String r0 = r0.A01
            r13.put(r1, r0)
            X.4Na r0 = r3.A0D
            java.lang.String r0 = r0.A02
            r13.put(r2, r0)
            X.4Na r0 = r3.A0D
            java.lang.Integer r0 = r0.A00
            r13.put(r4, r0)
        L_0x00ee:
            X.Cho r0 = r3.A0B
            if (r0 != 0) goto L_0x00f4
            X.BvS r0 = X.C24100BvS.A00
        L_0x00f4:
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x00fd
            r1 = 0
        L_0x00fd:
            java.lang.String r0 = "transcription_locale"
            r13.put(r0, r1)
            java.lang.String r1 = "theme_id"
            java.lang.String r0 = r3.A0H
            r13.put(r1, r0)
            X.201 r0 = r3.A0A
            int r0 = r0.value
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "notification_activity_level"
            r13.put(r0, r1)
            X.202 r0 = r3.A09
            int r0 = r0.value
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "notification_activity_banner_state"
            r13.put(r0, r1)
            long r0 = r3.A05
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "last_chat_entry_timestamp_millis"
            r13.put(r0, r1)
            java.lang.String r1 = "theme_bundle_id"
            java.lang.String r0 = r3.A0O
            r13.put(r1, r0)
            long r4 = r3.A08
            X.11P r0 = r3.A0W
            long r1 = X.AnonymousClass11P.A01(r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0188
            long r6 = r3.A08
        L_0x0146:
            r4 = 0
            r1 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0151
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
        L_0x0151:
            java.lang.String r0 = "snooze_end_time"
            X.C63432t4.A00(r13, r1, r0)
            long r4 = r3.A01()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x019e
            long r0 = r3.A01()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "mute_end"
            r13.put(r0, r1)
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x017d
            long r6 = r3.A01()
            r4 = 0
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x017e
        L_0x017d:
            r0 = 1
        L_0x017e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "muted_notifications"
            r13.put(r0, r1)
            goto L_0x019e
        L_0x0188:
            r6 = 0
            goto L_0x0146
        L_0x018b:
            r13.put(r1, r5)
            r13.put(r2, r5)
            r13.put(r4, r5)
            goto L_0x00ee
        L_0x0196:
            r13.put(r1, r5)
            r13.put(r2, r5)
            goto L_0x00ce
        L_0x019e:
            r2 = r17
            X.1tH r0 = r2.A0U()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0262 }
            X.1au r7 = r0.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0262 }
            boolean r0 = A0C(r3)     // Catch:{ all -> 0x0258 }
            java.lang.String r14 = "settings"
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L_0x01e6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0258 }
            r1.<init>()     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = "chat-settings-store/save-chat-settings deleting row for id:"
            r1.append(r0)     // Catch:{ all -> 0x0258 }
            java.lang.String r11 = r3.A0X     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = X.C22971Dz.A07(r11)     // Catch:{ all -> 0x0258 }
            if (r0 != 0) goto L_0x01c7
            java.lang.String r0 = "null"
        L_0x01c7:
            r1.append(r0)     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0258 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0258 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0258 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0258 }
            java.lang.String r3 = "jid = ?"
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x0258 }
            r1[r6] = r11     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = "saveChatSettings/DELETE_CHAT_SETTINGS"
            r4.A04(r14, r3, r0, r1)     // Catch:{ all -> 0x0258 }
            X.1Nh r0 = r2.A00     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0230
            goto L_0x022d
        L_0x01e6:
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0258 }
            X.1Ev r12 = r0.A02     // Catch:{ all -> 0x0258 }
            java.lang.String r15 = "jid = ?"
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ all -> 0x0258 }
            java.lang.String r11 = r3.A0X     // Catch:{ all -> 0x0258 }
            r0[r6] = r11     // Catch:{ all -> 0x0258 }
            java.lang.String r16 = "saveChatSettings/UPDATE_CHAT_SETTINGS"
            r17 = r0
            int r0 = r12.A02(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0258 }
            if (r0 != 0) goto L_0x0207
            java.lang.String r0 = "jid"
            r13.put(r0, r11)     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = "saveChatSettings/INSERT_CHAT_SETTINGS"
            r12.A05(r14, r0, r13)     // Catch:{ all -> 0x0258 }
        L_0x0207:
            X.1Nh r8 = r2.A00     // Catch:{ all -> 0x0258 }
            if (r8 == 0) goto L_0x0230
            java.lang.String r0 = "status_likes_notification"
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x0258 }
            if (r0 != 0) goto L_0x0230
            java.lang.String r0 = "individual_chat_defaults"
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x0258 }
            if (r0 != 0) goto L_0x0236
            java.lang.String r0 = "group_chat_defaults"
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x0258 }
            if (r0 != 0) goto L_0x0236
            boolean r0 = r3.A0V     // Catch:{ all -> 0x0258 }
            if (r0 != 0) goto L_0x0236
            X.C22971Dz.A07(r11)     // Catch:{ all -> 0x0258 }
            X.1Nh r0 = r2.A00     // Catch:{ all -> 0x0258 }
        L_0x022d:
            r0.A0R(r11)     // Catch:{ all -> 0x0258 }
        L_0x0230:
            java.util.Map r0 = r2.A0Q     // Catch:{ all -> 0x0258 }
            r0.remove(r11)     // Catch:{ all -> 0x0258 }
            goto L_0x0254
        L_0x0236:
            java.lang.String r10 = r8.A0F(r11)     // Catch:{ all -> 0x0258 }
            java.lang.String r12 = r3.A05()     // Catch:{ all -> 0x0258 }
            java.lang.String r13 = r3.A08()     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = r3.A07()     // Catch:{ all -> 0x0258 }
            android.net.Uri r9 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x0258 }
            boolean r14 = r3.A0C()     // Catch:{ all -> 0x0258 }
            boolean r15 = r3.A0V     // Catch:{ all -> 0x0258 }
            r8.A0O(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0258 }
            goto L_0x0230
        L_0x0254:
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0262 }
            return
        L_0x0258:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x025d }
            goto L_0x0261
        L_0x025d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0262 }
        L_0x0261:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0262 }
        L_0x0262:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/save"
            com.whatsapp.util.Log.i(r0, r1)
            r2.A0g()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Nb.A07(X.1yM, X.1Nb):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ("status_likes_notification".equals(r2) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0C(X.C42551yM r7) {
        /*
            java.lang.String r0 = "group_chat_defaults"
            java.lang.String r2 = r7.A0X
            boolean r0 = r0.equals(r2)
            r6 = 0
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "individual_chat_defaults"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "status_likes_notification"
            boolean r0 = r0.equals(r2)
            r1 = 0
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r1 = 1
        L_0x001e:
            X.25J r0 = X.C29681ch.A03
            X.1ch r0 = r0.A01(r2)
            r5 = 0
            if (r0 == 0) goto L_0x0028
            r5 = 1
        L_0x0028:
            if (r1 != 0) goto L_0x00f8
            long r1 = r7.A06
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00f8
            long r1 = r7.A03
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r7.A0V
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r7.A0U
            if (r0 != 0) goto L_0x00f8
            X.1yM r2 = r7.A02()
            java.lang.String r1 = r7.A07()
            java.lang.String r0 = r2.A07()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = r7.A08()
            java.lang.String r0 = r2.A08()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = r7.A06()
            java.lang.String r0 = r2.A06()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = r7.A05()
            java.lang.String r0 = r2.A05()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = r7.A03()
            java.lang.String r0 = r2.A03()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = r7.A04()
            java.lang.String r0 = r2.A04()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00f8
            boolean r1 = r7.A0C()
            boolean r0 = r2.A0C()
            if (r1 != r0) goto L_0x00f8
            r1 = 1
            int r0 = r7.A01
            if (r5 == 0) goto L_0x00f9
            if (r0 != r1) goto L_0x00f8
        L_0x00a9:
            X.200 r1 = r7.A0C
            X.200 r0 = X.AnonymousClass200.DEFAULT
            if (r1 != r0) goto L_0x00f8
            X.1yM r0 = r7.A02()
            boolean r1 = r0.A0R
            X.1yM r0 = r2.A02()
            boolean r0 = r0.A0R
            if (r1 != r0) goto L_0x00f8
            X.4Na r0 = r7.A0E
            if (r0 != 0) goto L_0x00f8
            X.4Na r0 = r7.A0D
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r7.A0S
            if (r0 != 0) goto L_0x00f8
            X.201 r1 = r7.A0A
            X.201 r0 = X.AnonymousClass201.DEFAULT_ALL_MESSAGES
            if (r1 != r0) goto L_0x00f8
            X.202 r1 = r7.A09
            X.202 r0 = X.AnonymousClass202.NEVER_SHOWN
            if (r1 != r0) goto L_0x00f8
            long r1 = r7.A05
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00f8
            int r0 = r7.A00
            if (r0 != 0) goto L_0x00f8
            int r0 = r7.A02
            if (r0 != 0) goto L_0x00f8
            X.Cho r1 = r7.A0B
            if (r1 != 0) goto L_0x00e9
            X.BvS r1 = X.C24100BvS.A00
        L_0x00e9:
            X.BvS r0 = X.C24100BvS.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f8
            long r1 = r7.A08
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00f8
            r6 = 1
        L_0x00f8:
            return r6
        L_0x00f9:
            if (r0 != 0) goto L_0x00f8
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Nb.A0C(X.1yM):boolean");
    }

    public static boolean A0D(AnonymousClass1Nb r5, String str) {
        if (r5.A00 == null || !C43541zy.A00) {
            return false;
        }
        C28791au A062 = r5.A0U().A06();
        try {
            String A0E2 = r5.A00.A0E(str);
            if (A0E2 != null) {
                NotificationManager A072 = r5.A07.A07();
                C17960vV.A07(A072);
                NotificationChannel A012 = C39581tJ.A01(A072, A0E2);
                if (A012 != null && r5.A00.A0T(A012, A062)) {
                    r5.A0Q.remove(r5.A00.A0G(A0E2));
                    A062.close();
                    return true;
                }
            }
            A062.close();
            return false;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r33v0, types: [X.1Cb, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        com.whatsapp.util.Log.e("chat-settings-store/backup failed", r3);
        X.C64062u9.A0Q(r6);
        r7 = new X.A26("chat-settings", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0309, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x030a, code lost:
        r15.A0U().A08();
        r18.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0314, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02bd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        X.AnonymousClass0DT.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02c2, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        com.whatsapp.util.Log.e("chat-settings-store/copy", r3);
        com.whatsapp.util.Log.e("chat-settings-store/backup/failed-to-copy");
        r15.A0U().close();
        r7 = new X.A26("chat-settings", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02da, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x027d A[Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02da A[ExcHandler: IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r3v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:9:0x00ec] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.A26 A0T(X.C171828sL r46, X.AnonymousClass9JN r47) {
        /*
            r45 = this;
            java.lang.String r12 = "chat-settings"
            X.1Ez r11 = new X.1Ez
            r11.<init>((java.lang.String) r12)
            r10 = r45
            X.118 r9 = r10.A09
            X.11P r0 = r10.A08
            r23 = r0
            X.0ve r8 = r10.A0F
            X.1KB r0 = r10.A03
            r44 = r0
            X.190 r0 = r10.A02
            r43 = r0
            X.1CJ r0 = r10.A0C
            r28 = r0
            X.12L r0 = r10.A0G
            r39 = r0
            X.1CO r0 = r10.A0E
            r35 = r0
            X.1M9 r0 = r10.A05
            r20 = r0
            X.1DC r0 = r10.A0I
            r38 = r0
            X.11C r0 = r10.A07
            r18 = r0
            X.1MC r0 = r10.A04
            r19 = r0
            X.00H r0 = r10.A0L
            r17 = r0
            X.1NM r0 = r10.A06
            r16 = r0
            X.17x r15 = r10.A0A
            X.0z4 r13 = r10.A0B
            X.00H r0 = r10.A0J
            r37 = r0
            X.1NN r7 = r10.A0D
            X.00H r6 = r10.A0M
            X.00H r5 = r10.A0O
            X.1NR r4 = r10.A0H
            X.00H r3 = r10.A0K
            X.00H r2 = r10.A0N
            X.00H r0 = r10.A0P
            r42 = r0
            X.1NX r1 = r10.A03
            java.lang.Object r0 = r2.get()
            X.1CP r0 = (X.AnonymousClass1CP) r0
            X.1Cb r33 = new X.1Cb
            r33.<init>()
            java.lang.String r36 = "chatsettingsbackup.db"
            X.1NY r30 = new X.1NY
            r31 = r43
            r32 = r9
            r34 = r0
            r30.<init>(r31, r32, r33, r34, r35, r36)
            r14 = 0
            X.1Nb r0 = new X.1Nb
            r21 = r16
            r22 = r18
            r24 = r9
            r25 = r15
            r26 = r13
            r27 = r1
            r29 = r7
            r31 = r35
            r32 = r8
            r33 = r39
            r34 = r4
            r35 = r38
            r36 = r17
            r38 = r6
            r39 = r5
            r40 = r3
            r41 = r2
            r15 = r0
            r16 = r43
            r17 = r14
            r18 = r44
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.1tH r1 = r10.A0U()
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.A02
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r18 = r1.writeLock()
            r18.lock()
            X.9JN r1 = X.AnonymousClass9JN.CRYPT13
            r4 = r47
            if (r4 != r1) goto L_0x00c0
            X.1L7 r1 = r10.A02
            java.io.File r2 = r1.A03()
            java.lang.String r1 = "chatsettingsbackup.db.crypt1"
            java.io.File r6 = new java.io.File
            r6.<init>(r2, r1)
        L_0x00be:
            r5 = 1
            goto L_0x00ea
        L_0x00c0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "chatsettingsbackup.db.crypt"
            r2.append(r1)
            int r1 = r4.version
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            X.9JN r1 = X.AnonymousClass9JN.UNENCRYPTED
            if (r4 != r1) goto L_0x00de
            X.17y r1 = r10.A04
            java.io.File r6 = r1.A00(r2)
            goto L_0x00be
        L_0x00de:
            X.1L7 r1 = r10.A02
            java.io.File r1 = r1.A03()
            java.io.File r6 = new java.io.File
            r6.<init>(r1, r2)
            goto L_0x00be
        L_0x00ea:
            r2 = r46
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r7.<init>()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.String r1 = "chat-settings-store/copy "
            r7.append(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.1tH r13 = r10.A0U()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.118 r1 = r13.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            android.content.Context r3 = r1.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.String r1 = r13.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.io.File r1 = r3.getDatabasePath(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r7.append(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.String r1 = " -> "
            r7.append(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.1tH r13 = r0.A0U()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.118 r1 = r13.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            android.content.Context r3 = r1.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.String r1 = r13.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.io.File r1 = r3.getDatabasePath(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r7.append(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.String r1 = r7.toString()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.1tH r1 = r0.A0U()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02c2, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.1au r17 = r1.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02c2, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.1xA r16 = r17.BD0()     // Catch:{ all -> 0x02b8 }
            X.1tH r1 = r10.A0U()     // Catch:{ all -> 0x02ae }
            X.1at r15 = r1.get()     // Catch:{ all -> 0x02ae }
            r1 = r15
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x02a4 }
            X.1Ev r7 = r1.A02     // Catch:{ all -> 0x02a4 }
            java.lang.String r3 = X.C43481zs.A00     // Catch:{ all -> 0x02a4 }
            java.lang.String r1 = "copyChatSettingsDb/QUERY_CHAT_SETTINGS"
            android.database.Cursor r7 = r7.A0A(r3, r1, r14)     // Catch:{ all -> 0x02a4 }
            r7.getCount()     // Catch:{ all -> 0x0298 }
        L_0x0148:
            boolean r1 = r7.moveToNext()     // Catch:{ all -> 0x0298 }
            if (r1 == 0) goto L_0x0187
            X.1yM r13 = A00(r7, r10)     // Catch:{ all -> 0x0298 }
            java.lang.String r1 = r13.A0X     // Catch:{ all -> 0x0298 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0298 }
            if (r1 != 0) goto L_0x0172
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0298 }
            r3.<init>()     // Catch:{ all -> 0x0298 }
            java.lang.String r1 = "chat-settings-store/copy-chat-settings "
            r3.append(r1)     // Catch:{ all -> 0x0298 }
            r3.append(r13)     // Catch:{ all -> 0x0298 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0298 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0298 }
            A07(r13, r0)     // Catch:{ all -> 0x0298 }
            goto L_0x0148
        L_0x0172:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0298 }
            r3.<init>()     // Catch:{ all -> 0x0298 }
            java.lang.String r1 = "chat-settings-store/backup/null-jid/skipped "
            r3.append(r1)     // Catch:{ all -> 0x0298 }
            r3.append(r13)     // Catch:{ all -> 0x0298 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0298 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0298 }
            goto L_0x0148
        L_0x0187:
            r16.A00()     // Catch:{ all -> 0x0298 }
            r7.close()     // Catch:{ all -> 0x02a4 }
            r15.close()     // Catch:{ all -> 0x02ae }
            r16.close()     // Catch:{ all -> 0x02b8 }
            r17.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02c2, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.String r1 = "chat-settings-store/backup/close-backup-db"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.1tH r1 = r0.A0U()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r1.A07()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.1tH r1 = r0.A0U()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r1.close()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            boolean r1 = r10.A0L()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            if (r1 != 0) goto L_0x01bb
            java.lang.String r1 = "chat-settings-store/backup/skip no media or read-only media"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.A26 r7 = new X.A26     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r7.<init>(r12, r5)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            goto L_0x02e8
        L_0x01bb:
            java.io.File r1 = r10.A0G(r4)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.util.ArrayList r1 = r10.A0N(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.util.Iterator r7 = r1.iterator()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
        L_0x01c7:
            boolean r1 = r7.hasNext()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            if (r1 == 0) goto L_0x01e3
            java.lang.Object r3 = r7.next()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.io.File r3 = (java.io.File) r3     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            boolean r1 = r3.equals(r6)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            if (r1 != 0) goto L_0x01c7
            boolean r1 = r3.exists()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            if (r1 == 0) goto L_0x01c7
            r3.delete()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            goto L_0x01c7
        L_0x01e3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r3.<init>()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.String r1 = "chat-settings-store/backup/to "
            r3.append(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r3.append(r6)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.Object r3 = r37.get()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.9mv r3 = (X.C191639mv) r3     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r1 = 0
            X.A5N r7 = r3.A00(r14, r4, r6, r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.1tH r13 = r0.A0U()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.118 r1 = r13.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            android.content.Context r3 = r1.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.String r1 = r13.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.io.File r3 = r3.getDatabasePath(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r13 = 8968(0x2308, float:1.2567E-41)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            boolean r1 = X.C18020vd.A05(r1, r8, r13)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.String r13 = "chat-settings-store/backup/prepare for backup failed"
            if (r1 == 0) goto L_0x0232
            android.content.Context r8 = r9.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            boolean r1 = r7.A09(r8, r3)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            if (r1 == 0) goto L_0x022d
            java.lang.String r1 = "chat-settings-store/backup/skip backup because backup file has the same source file"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r8 = 2
            r13 = 0
            goto L_0x0253
        L_0x022d:
            boolean r1 = r7.A0A(r8, r3)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            goto L_0x0238
        L_0x0232:
            android.content.Context r1 = r9.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            boolean r1 = r7.A0A(r1, r14)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
        L_0x0238:
            if (r1 != 0) goto L_0x0247
            com.whatsapp.util.Log.w((java.lang.String) r13)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.C64062u9.A0Q(r6)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.A26 r7 = new X.A26     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r7.<init>(r12, r5)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            goto L_0x02e8
        L_0x0247:
            r7.A08(r14, r3)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r8 = 0
            java.io.File r1 = r10.A0G(r4)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            long r13 = r10.A0E(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
        L_0x0253:
            java.lang.String r1 = "wallpapers"
            X.1Ez r3 = new X.1Ez     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r3.<init>((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.Object r1 = r42.get()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.8om r1 = (X.C170128om) r1     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.A26 r9 = r1.A0F(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            int r7 = r9.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            int r1 = X.A3O.A01(r7)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r2.A0D = r1     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            long r3 = r3.A02()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r2.A0U = r1     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            if (r8 == r7) goto L_0x0281
            r8 = 0
            if (r7 != r5) goto L_0x0281
            r8 = 1
        L_0x0281:
            long r3 = r9.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            long r3 = r3 + r13
            java.lang.Long r1 = r9.A04     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.A26 r7 = new X.A26     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r22 = r12
            r23 = r8
            r24 = r3
            r19 = r7
            r20 = r6
            r21 = r1
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            goto L_0x02e8
        L_0x0298:
            r3 = move-exception
            if (r7 == 0) goto L_0x02a3
            r7.close()     // Catch:{ all -> 0x029f }
            goto L_0x02a3
        L_0x029f:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r3, r1)     // Catch:{ all -> 0x02a4 }
        L_0x02a3:
            throw r3     // Catch:{ all -> 0x02a4 }
        L_0x02a4:
            r3 = move-exception
            r15.close()     // Catch:{ all -> 0x02a9 }
            goto L_0x02ad
        L_0x02a9:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r3, r1)     // Catch:{ all -> 0x02ae }
        L_0x02ad:
            throw r3     // Catch:{ all -> 0x02ae }
        L_0x02ae:
            r3 = move-exception
            r16.close()     // Catch:{ all -> 0x02b3 }
            goto L_0x02b7
        L_0x02b3:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r3, r1)     // Catch:{ all -> 0x02b8 }
        L_0x02b7:
            throw r3     // Catch:{ all -> 0x02b8 }
        L_0x02b8:
            r3 = move-exception
            r17.close()     // Catch:{ all -> 0x02bd }
            goto L_0x02c1
        L_0x02bd:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r3, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02c2, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
        L_0x02c1:
            throw r3     // Catch:{ SQLiteDatabaseCorruptException -> 0x02c2, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
        L_0x02c2:
            r3 = move-exception
            java.lang.String r1 = "chat-settings-store/copy"
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            java.lang.String r1 = "chat-settings-store/backup/failed-to-copy"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.1tH r1 = r0.A0U()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r1.close()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            X.A26 r7 = new X.A26     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            r7.<init>(r12, r5)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02da }
            goto L_0x02e8
        L_0x02da:
            r3 = move-exception
            java.lang.String r1 = "chat-settings-store/backup failed"
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ all -> 0x0309 }
            X.C64062u9.A0Q(r6)     // Catch:{ all -> 0x0309 }
            X.A26 r7 = new X.A26     // Catch:{ all -> 0x0309 }
            r7.<init>(r12, r5)     // Catch:{ all -> 0x0309 }
        L_0x02e8:
            X.1tH r0 = r0.A0U()
            r0.A08()
            r18.unlock()
            int r0 = r7.A01
            int r0 = X.A3O.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A06 = r0
            long r0 = r11.A02()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0H = r0
            return r7
        L_0x0309:
            r1 = move-exception
            X.1tH r0 = r0.A0U()
            r0.A08()
            r18.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Nb.A0T(X.8sL, X.9JN):X.A26");
    }

    public C42551yM A0V() {
        C42551yM A012 = A01(this, "group_chat_defaults");
        if (A012.A0K == null) {
            A012.A0K = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A012.A0L)) {
            A012.A0L = "1";
        }
        if (TextUtils.isEmpty(A012.A0J)) {
            A012.A0J = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A012.A0I)) {
            A012.A0I = "FFFFFF";
        }
        return A012;
    }

    public C42551yM A0W() {
        C42551yM A012 = A01(this, "individual_chat_defaults");
        if (A012.A0K == null) {
            A012.A0K = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A012.A0L)) {
            A012.A0L = "1";
        }
        if (TextUtils.isEmpty(A012.A0J)) {
            A012.A0J = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A012.A0I)) {
            A012.A0I = "FFFFFF";
        }
        if (A012.A0F == null) {
            A012.A0F = Settings.System.DEFAULT_RINGTONE_URI.toString();
        }
        if (TextUtils.isEmpty(A012.A0G)) {
            A012.A0G = "1";
        }
        return A012;
    }

    public C42551yM A0X() {
        C42551yM A022 = A02("channel_notification");
        if (A022.A0K == null) {
            A022.A0K = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A022.A0L)) {
            A022.A0L = "1";
        }
        if (TextUtils.isEmpty(A022.A0J)) {
            A022.A0J = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A022.A0I)) {
            A022.A0I = "FFFFFF";
        }
        A022.A01 = 1;
        return A022;
    }

    public C42551yM A0Z(AnonymousClass1BI r3) {
        Map map = this.A0Q;
        this.A0K.get();
        return (C42551yM) map.get(r3.getRawString());
    }

    public C42551yM A0a(AnonymousClass1BI r2) {
        this.A0K.get();
        return A01(this, r2.getRawString());
    }

    public Long A0c(AnonymousClass1BI r6, long j) {
        boolean z = false;
        if (j > 0) {
            z = true;
        }
        C17960vV.A0F(z, "Pinned time should be strictly positive");
        return A03(r6, j, true);
    }

    public ArrayList A0d(boolean z) {
        Cursor A0A2;
        ArrayList arrayList = new ArrayList();
        C28781at A052 = A0U().get();
        try {
            A0A2 = ((C28801av) A052).A02.A0A("SELECT jid, mute_end FROM settings WHERE muted_notifications = ? AND (mute_end > ? OR mute_end = ? ) ORDER BY jid ASC", "GET_MUTED_CHAT_JID_WITH_END_TIME_SORTED", new String[]{String.valueOf(0), String.valueOf(System.currentTimeMillis()), String.valueOf(-1)});
            int columnIndex = A0A2.getColumnIndex("jid");
            int columnIndex2 = A0A2.getColumnIndex("mute_end");
            while (A0A2.moveToNext()) {
                AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(A0A2.getString(columnIndex));
                if (!z || (A022 instanceof GroupJid)) {
                    arrayList.add(new C194379rd(A022, Long.valueOf(A0A2.getLong(columnIndex2))));
                }
            }
            A0A2.close();
            A052.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    @Deprecated
    public Set A0f() {
        Set set = this.A0T;
        if (set == null) {
            return A05(this, true).keySet();
        }
        return set;
    }

    public void A0g() {
        this.A0Q.clear();
        A0U().A08();
        A0i();
        A06();
    }

    public void A0h() {
        String A0G2;
        if (this.A00 != null && C43541zy.A00) {
            C28791au A062 = A0U().A06();
            try {
                NotificationManager A072 = this.A07.A07();
                C17960vV.A07(A072);
                for (NotificationChannel notificationChannel : C39581tJ.A03(A072)) {
                    if (!C39571tI.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId()) && this.A00.A0T(notificationChannel, A062) && (A0G2 = this.A00.A0G(notificationChannel.getId())) != null) {
                        this.A0Q.remove(A0G2);
                    }
                }
                A062.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
    }

    public void A0j(AnonymousClass1BI r14, long j) {
        C28791au A062;
        this.A0K.get();
        C42551yM A0a = A0a(r14);
        if (j != A0a.A03) {
            try {
                A062 = A0U().A06();
                A0a.A03 = j;
                if (A0C(A0a)) {
                    ((C28801av) A062).A02.A04("settings", "jid = ?", "ChatSettingsStore/setCallMute/DELETE_CHAT_SETTINGS", new String[]{r14.getRawString()});
                    this.A0Q.remove(r14.getRawString());
                } else {
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("call_mute_end_time", Long.valueOf(j));
                    C23141Ev r7 = ((C28801av) A062).A02;
                    if (r7.A02(contentValues, "settings", "jid = ?", "ChatSettingsStore/setCallMute/UPDATE_CHAT_SETTINGS", new String[]{r14.getRawString()}) == 0) {
                        contentValues.put("jid", r14.getRawString());
                        r7.A05("settings", "ChatSettingsStore/setCallMute/INSERT_CHAT_SETTINGS", contentValues);
                    }
                }
                A062.close();
                this.A03.A0J(new C146527Pl(this, r14, 26));
                return;
            } catch (SQLiteDatabaseCorruptException e) {
                Log.i("chat-settings-store/setcallmute", e);
                A0g();
                throw e;
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    public void A0k(AnonymousClass1BI r3, String str) {
        this.A0K.get();
        C42551yM A012 = A01(this, r3.getRawString());
        if (!TextUtils.equals(str, A012.A0F)) {
            A012.A0F = str;
            A07(A012, this);
        }
    }

    public void A0l(AnonymousClass1BI r3, String str) {
        this.A0K.get();
        C42551yM A012 = A01(this, r3.getRawString());
        if (!TextUtils.equals(str, A012.A0G)) {
            A012.A0G = str;
            A07(A012, this);
        }
    }

    public void A0m(AnonymousClass1BI r2, String str) {
        this.A0K.get();
        A0A(this, r2.getRawString(), str);
    }

    public void A0n(AnonymousClass1BI r2, String str) {
        this.A0K.get();
        A0B(this, r2.getRawString(), str);
    }

    public void A0o(AnonymousClass1BI r11, String str) {
        C42551yM A0a;
        this.A0K.get();
        String str2 = "individual_chat_defaults";
        if (r11 == null) {
            A0a = A01(this, str2);
        } else {
            A0a = A0a(r11);
        }
        C28791au A062 = A0U().A06();
        try {
            A0a.A0H = str;
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("theme_id", str);
            if (r11 != null) {
                str2 = r11.getRawString();
            }
            C23141Ev r4 = ((C28801av) A062).A02;
            if (r4.A02(contentValues, "settings", "jid =?", "ChatSettingsStore/UPDATE_THEME_COLOR_SCHEMA_ID", new String[]{str2}) == 0) {
                contentValues.put("jid", str2);
                r4.A05("settings", "ChatSettingsStore/INSERT_THEME_COLOR_SCHEMA_ID", contentValues);
            }
            A062.close();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChatSettingsStore/setThemeColorSchemaId/error");
            sb.append(e);
            Log.e(sb.toString());
            throw new RuntimeException(e);
        } catch (Throwable th) {
            try {
                A062.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
    }

    public void A0p(AnonymousClass1BI r11, String str) {
        C42551yM A0a;
        this.A0K.get();
        String str2 = "individual_chat_defaults";
        if (r11 == null) {
            A0a = A01(this, str2);
        } else {
            A0a = A0a(r11);
        }
        C28791au A062 = A0U().A06();
        try {
            A0a.A0O = str;
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("theme_bundle_id", str);
            if (r11 != null) {
                str2 = r11.getRawString();
            }
            C23141Ev r4 = ((C28801av) A062).A02;
            if (r4.A02(contentValues, "settings", "jid =?", "ChatSettingsStore/UPDATE_THEME_ID", new String[]{str2}) == 0) {
                contentValues.put("jid", str2);
                r4.A05("settings", "ChatSettingsStore/INSERT_THEME_ID", contentValues);
            }
            A062.close();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChatSettingsStore/setChatThemeId/error");
            sb.append(e);
            Log.e(sb.toString());
            throw new RuntimeException(e);
        } catch (Throwable th) {
            try {
                A062.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
    }

    public void A0q(AnonymousClass1BI r10, String str, String str2, boolean z) {
        C28791au A062;
        this.A0K.get();
        C42551yM A0a = A0a(r10);
        try {
            A062 = A0U().A06();
            A0a.A0P = z;
            A0a.A0M = str;
            A0a.A0N = str2;
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("enable_auto_message_translations", Boolean.valueOf(A0a.A0P));
            contentValues.put("source_lang", A0a.A0M);
            contentValues.put("target_lang", A0a.A0N);
            C23141Ev r3 = ((C28801av) A062).A02;
            if (r3.A02(contentValues, "settings", "jid = ?", "ChatSettingsStore/enableMessageTranslation/UPDATE_CHAT_SETTINGS", new String[]{r10.getRawString()}) == 0) {
                contentValues.put("jid", r10.getRawString());
                r3.A05("settings", "ChatSettingsStore/enableMessageTranslation/INSERT_CHAT_SETTINGS", contentValues);
            }
            A062.close();
            this.A03.A0J(new C146527Pl(this, r10, 27));
            return;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("chat-settings-store/enableMessageTranslation", e);
            A0g();
            throw e;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public void A0r(AnonymousClass1BI r15, boolean z) {
        this.A0K.get();
        C42551yM A0a = A0a(r15);
        C25201Nh r1 = this.A00;
        if (r1 != null && A0a.A0V) {
            r1.A0R(r15.getRawString());
        }
        C28791au A062 = A0U().A06();
        if (z) {
            try {
                if (A0a.A0V) {
                    A0a.A04 = System.currentTimeMillis();
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("deleted", Long.valueOf(A0a.A04));
                    ((C28801av) A062).A02.A02(contentValues, "settings", "jid = ?", "setChatDeleted/UPDATE_CHAT_SETTINGS", new String[]{r15.getRawString()});
                } else {
                    this.A0Q.remove(r15.getRawString());
                    ((C28801av) A062).A02.A04("settings", "jid = ?", "setChatDeleted/DELETE_CHAT_SETTINGS", new String[]{r15.getRawString()});
                }
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
        A062.close();
    }

    public void A0s(C42551yM r3) {
        if (!r3.A0V) {
            r3 = r3.A02();
        }
        A0A(this, r3.A0X, Settings.System.DEFAULT_NOTIFICATION_URI.toString());
        Log.i("chat-settings-store/set-underlying-message-tone-to-default updated message tone to default");
    }

    public void A0t(boolean z) {
        C42551yM A012 = A01(this, "group_chat_defaults");
        if (z != A012.A0Q) {
            A012.A0Q = z;
            A07(A012, this);
        }
    }

    public void A0u(boolean z) {
        C42551yM A012 = A01(this, "individual_chat_defaults");
        if (z != A012.A0Q) {
            A012.A0Q = z;
            A07(A012, this);
        }
    }

    public boolean A0v() {
        String string;
        C18030ve r7 = this.A0F;
        C18040vf r6 = C18040vf.A02;
        if (!C18020vd.A05(r6, r7, 3354)) {
            return false;
        }
        if (C18020vd.A05(r6, r7, 5418)) {
            AnonymousClass00H r3 = this.A0B.A00;
            int i = ((SharedPreferences) r3.get()).getInt("push_to_video_sending_enabled", -1);
            if (i == 0) {
                return false;
            }
            if (i != 1) {
                int A002 = C18020vd.A00(r6, r7, 5419);
                if (A002 == -1) {
                    return false;
                }
                if (!(A002 == 0 || (string = ((SharedPreferences) r3.get()).getString("push_to_video_sending_enabled_default_info", (String) null)) == null)) {
                    boolean z = !string.endsWith("0");
                    if (Boolean.valueOf(z) == null || z) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public boolean A0y(AnonymousClass1BI r2) {
        Set set = this.A0T;
        if (set != null) {
            return set.contains(r2);
        }
        return A0a(r2).A0S;
    }

    public boolean A0z(AnonymousClass1BI r18, C32961i2 r19, long j) {
        C28791au A062;
        this.A0K.get();
        AnonymousClass1BI r6 = r18;
        C42551yM A0a = A0a(r6);
        long j2 = j;
        if (j == A0a.A06) {
            return false;
        }
        try {
            A062 = A0U().A06();
            A0a.A06 = j2;
            if (A0C(A0a)) {
                ((C28801av) A062).A02.A04("settings", "jid = ?", "ChatSettingsStore/setMute/DELETE_CHAT_SETTINGS", new String[]{r6.getRawString()});
                this.A0Q.remove(r6.getRawString());
            } else {
                A0a.A0T = false;
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("mute_end", Long.valueOf(j2));
                contentValues.put("muted_notifications", false);
                C23141Ev r11 = ((C28801av) A062).A02;
                if (r11.A02(contentValues, "settings", "jid = ?", "ChatSettingsStore/setMute/UPDATE_CHAT_SETTINGS", new String[]{r6.getRawString()}) == 0) {
                    contentValues.put("jid", r6.getRawString());
                    r11.A05("settings", "ChatSettingsStore/setMute/INSERT_CHAT_SETTINGS", contentValues);
                }
            }
            A062.close();
            this.A03.A0J(new AnonymousClass3C8(this, r6, r19, 12, j2));
            return true;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/setmute", e);
            A0g();
            throw e;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public HashSet BMw() {
        Cursor A0A2;
        String str;
        String str2;
        HashSet hashSet = new HashSet();
        C42551yM A0W = A0W();
        C85344Na r1 = A0W.A0D;
        if (!(r1 == null || !"USER_PROVIDED".equalsIgnoreCase(r1.A01) || (str2 = r1.A02) == null)) {
            hashSet.add(str2);
        }
        C85344Na r12 = A0W.A0E;
        if (!(r12 == null || !"USER_PROVIDED".equalsIgnoreCase(r12.A01) || (str = r12.A02) == null)) {
            hashSet.add(str);
        }
        try {
            C28781at A052 = A0U().get();
            try {
                A0A2 = ((C28801av) A052).A02.A0A("SELECT wallpaper_light_value FROM settings WHERE wallpaper_light_type = ?", "getSettings/QUERY_WALLPAPER", new String[]{"USER_PROVIDED"});
                while (A0A2.moveToNext()) {
                    hashSet.add(A0A2.getString(A0A2.getColumnIndexOrThrow("wallpaper_light_value")));
                }
                A0A2.close();
                A052.close();
                return hashSet;
            } catch (Throwable th) {
                A052.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("chat-settings-store/get-wallpaper-files", e);
            throw e;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public C85344Na Bbh(AnonymousClass1BI r2, boolean z) {
        C42551yM A0a;
        if (r2 == null) {
            A0a = A0W();
        } else {
            A0a = A0a(r2);
        }
        if (z) {
            return A0a.A0D;
        }
        return A0a.A0E;
    }

    public void CGo(AnonymousClass1BI r2, C85344Na r3, boolean z) {
        C42551yM A0a;
        if (r2 == null) {
            A0a = A0W();
        } else {
            A0a = A0a(r2);
        }
        if (z) {
            A0a.A0D = r3;
        } else {
            A0a.A0E = r3;
        }
        A07(A0a, this);
    }

    public AnonymousClass1Nb(AnonymousClass190 r2, AnonymousClass1NS r3, AnonymousClass1KB r4, AnonymousClass1MC r5, AnonymousClass1M9 r6, AnonymousClass1NM r7, AnonymousClass11C r8, AnonymousClass11P r9, AnonymousClass118 r10, C219217x r11, C19830z4 r12, AnonymousClass1NX r13, AnonymousClass1CJ r14, AnonymousClass1NN r15, AnonymousClass1CU r16, AnonymousClass1CO r17, C18030ve r18, AnonymousClass12L r19, AnonymousClass1NR r20, AnonymousClass1DC r21, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28) {
        super(r13);
        this.A09 = r10;
        this.A08 = r9;
        this.A0F = r18;
        this.A03 = r4;
        this.A02 = r2;
        this.A0C = r14;
        this.A0G = r19;
        this.A0E = r17;
        this.A0L = r22;
        this.A05 = r6;
        this.A0I = r21;
        this.A07 = r8;
        this.A0J = r23;
        this.A04 = r5;
        this.A06 = r7;
        this.A0M = r24;
        this.A0O = r25;
        this.A0A = r11;
        this.A0B = r12;
        this.A0K = r26;
        this.A0D = r15;
        this.A0S = r16;
        this.A0N = r27;
        this.A0P = r28;
        this.A0H = r20;
        this.A0R = r3;
        A06();
    }

    public static void A08(AnonymousClass1Nb r2, String str, String str2) {
        C42551yM A012 = A01(r2, str);
        if (!TextUtils.equals(str2, A012.A0I)) {
            A012.A0I = str2;
            A07(A012, r2);
        }
    }

    public static void A09(AnonymousClass1Nb r2, String str, String str2) {
        C42551yM A012 = A01(r2, str);
        if (!TextUtils.equals(str2, A012.A0J)) {
            A012.A0J = str2;
            A07(A012, r2);
        }
    }

    public static void A0A(AnonymousClass1Nb r2, String str, String str2) {
        C42551yM A012 = A01(r2, str);
        if (!TextUtils.equals(str2, A012.A0K)) {
            A012.A0K = str2;
            A07(A012, r2);
        }
    }

    public static void A0B(AnonymousClass1Nb r2, String str, String str2) {
        C42551yM A012 = A01(r2, str);
        if (!TextUtils.equals(str2, A012.A0L)) {
            A012.A0L = str2;
            A07(A012, r2);
        }
    }

    public C42551yM A0Y() {
        C42551yM A012 = A01(this, "status_likes_notification");
        if (TextUtils.isEmpty(A012.A0L)) {
            A012.A0L = "0";
        }
        if (TextUtils.isEmpty(A012.A0J)) {
            A012.A0J = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A012.A0I)) {
            A012.A0I = "000000";
        }
        A012.A0Q = true;
        A012.A0K = null;
        return A012;
    }

    public boolean A0w(AnonymousClass1BI r7) {
        boolean z;
        NotificationChannel A092;
        C42551yM A0a = A0a(r7);
        C25201Nh r1 = this.A00;
        if (r1 == null || !C43541zy.A00 || !A0a.A0V || (A092 = r1.A09(r7.getRawString())) == null || A092.getImportance() >= 3) {
            z = false;
        } else {
            Log.i("chat-settings-store//cancelMute unmuting channel");
            this.A00.A0N(A092, r7.getRawString(), C39581tJ.A00(A0a.A0C()));
            z = true;
        }
        boolean A0z = A0z(r7, C32961i2.OTHER, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("chat-settings-store//cancelMute for jid:");
        sb.append(r7);
        sb.append(" channelChanged:");
        sb.append(z);
        sb.append(" dbchanged:");
        sb.append(A0z);
        Log.i(sb.toString());
        if (z || A0z) {
            return true;
        }
        return false;
    }

    public boolean A0x(AnonymousClass1BI r2) {
        return A0a(r2).A0A();
    }

    public boolean A10(AnonymousClass1BI r5, AnonymousClass201 r6) {
        AnonymousClass202 r0;
        C42551yM A0a = A0a(r5);
        AnonymousClass201 r2 = A0a.A0A;
        if (r2 == r6) {
            return false;
        }
        AnonymousClass201 r1 = AnonymousClass201.DEFAULT_RELEVANT_MESSAGES;
        if (r6 == r1) {
            r0 = AnonymousClass202.SHOWING_RELEVANT;
        } else {
            AnonymousClass201 r02 = AnonymousClass201.DEFAULT_ALL_MESSAGES;
            if ((r2 == r02 || r2 == r1) && r6 != r02) {
                r0 = AnonymousClass202.DISMISSED;
            }
            A0a.A0A = r6;
            A07(A0a, this);
            AnonymousClass1Q1 r3 = (AnonymousClass1Q1) this.A0L.get();
            C18070vi.A0d(r5, 0);
            ((AnonymousClass11A) r3.A00.get()).A00(new AnonymousClass3C4(r3, r5, r6, 8));
            return true;
        }
        A0a.A09 = r0;
        A0a.A0A = r6;
        A07(A0a, this);
        AnonymousClass1Q1 r32 = (AnonymousClass1Q1) this.A0L.get();
        C18070vi.A0d(r5, 0);
        ((AnonymousClass11A) r32.A00.get()).A00(new AnonymousClass3C4(r32, r5, r6, 8));
        return true;
    }

    public boolean A11(UserJid userJid) {
        C42551yM A0a = A0a(userJid);
        if (!A0a.A0U) {
            return false;
        }
        A0a.A0U = false;
        A07(A0a, this);
        this.A03.A0J(new C146527Pl(this, userJid, 29));
        return true;
    }

    public boolean A12(UserJid userJid) {
        C42551yM A0a = A0a(userJid);
        if (A0a.A0U) {
            return false;
        }
        A0a.A0U = true;
        A07(A0a, this);
        this.A03.A0J(new C146527Pl(this, userJid, 29));
        return true;
    }
}
