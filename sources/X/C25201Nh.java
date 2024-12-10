package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Nh  reason: invalid class name and case insensitive filesystem */
public class C25201Nh implements AnonymousClass1Ce {
    public static final long A0M = TimeUnit.DAYS.toMillis(60);
    public static final C25211Ni A0N = new C25211Ni();
    public CountDownLatch A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final AnonymousClass1KB A03;
    public final AnonymousClass11C A04;
    public final C219217x A05;
    public final AnonymousClass1CJ A06;
    public final C18030ve A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;
    public final C23581Gv A0A = new C66772yi(this, 4);
    public final C24671Lf A0B;
    public final C24921Me A0C;
    public final AnonymousClass11P A0D;
    public final AnonymousClass118 A0E;
    public final C19830z4 A0F;
    public final C25181Nf A0G;
    public final C25231Nk A0H = new AnonymousClass30Z(this, 3);
    public final AnonymousClass1NN A0I;
    public final C25221Nj A0J = new C683733c(this, 3);
    public final C25191Ng A0K;
    public final C18150vq A0L;

    public static final C59462mL A01(C25211Ni r5, String str) {
        AnonymousClass1BI A022;
        C18070vi.A0d(r5, 0);
        C18070vi.A0d(str, 1);
        String str2 = "group_chat_defaults";
        if (!str2.equals(str) && !"individual_chat_defaults".equals(str) && (A022 = AnonymousClass1BI.A00.A02(str)) != null) {
            if (!C22971Dz.A0e(A022)) {
                str2 = "individual_chat_defaults";
            }
            String A002 = r5.A00(str2);
            if (A002 != null) {
                return new C59462mL(str, A002, A022.getRawString());
            }
        }
        return null;
    }

    public static final String A02(NotificationChannel notificationChannel) {
        String str;
        C18070vi.A0d(notificationChannel, 0);
        String id = notificationChannel.getId();
        C18070vi.A0X(id);
        String A012 = C39591tK.A01(id);
        if (AnonymousClass112.A07()) {
            str = C39601tL.A00(notificationChannel);
        } else {
            str = null;
        }
        String obj = notificationChannel.toString();
        C18070vi.A0X(obj);
        if (A012 != null) {
            String A072 = C22971Dz.A07(A012);
            if (A072 == null) {
                A072 = "null";
            }
            obj = AnonymousClass1YE.A07(obj, A012, A072, false);
        }
        if (str == null) {
            return obj;
        }
        String A073 = C22971Dz.A07(str);
        if (A073 == null) {
            A073 = "null";
        }
        return AnonymousClass1YE.A07(obj, str, A073, false);
    }

    public static final String A04(Collection collection) {
        C18070vi.A0d(collection, 0);
        ArrayList arrayList = new ArrayList(C29351c6.A0C(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(A02((NotificationChannel) it.next()));
        }
        return arrayList.toString();
    }

    public static final void A08(Collection collection) {
        C18070vi.A0d(collection, 0);
        ArrayList arrayList = new ArrayList(C29351c6.A0C(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            NotificationChannelGroup notificationChannelGroup = (NotificationChannelGroup) it.next();
            C18070vi.A0d(notificationChannelGroup, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationChannelGroup{mId='");
            sb.append(notificationChannelGroup.getId());
            sb.append("', mName=");
            sb.append(notificationChannelGroup.getName());
            sb.append(", mChannels=");
            List<NotificationChannel> channels = notificationChannelGroup.getChannels();
            C18070vi.A0X(channels);
            sb.append(A04(channels));
            sb.append('}');
            arrayList.add(sb.toString());
        }
        arrayList.toString();
    }

    public C25201Nh A0B() {
        return this;
    }

    public String A0C() {
        int i = 3;
        if (!C18020vd.A05(C18040vf.A02, this.A07, 10928)) {
            i = 2;
        }
        return A0D((Uri) null, A0F("status_likes_notification"), "status_likes_notification", "FFFFFF", "0", (String) null, i);
    }

    public synchronized String A0D(Uri uri, CharSequence charSequence, String str, String str2, String str3, String str4, int i) {
        String A002;
        C25211Ni r4 = A0N;
        A002 = r4.A00(str);
        if (A002 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationChannelsManager26/addNotificationChannel channel already exists for settingsId:");
            String A072 = C22971Dz.A07(str);
            if (A072 == null) {
                A072 = "null";
            }
            sb.append(A072);
            Log.e(sb.toString());
        } else {
            C19830z4 r6 = this.A0F;
            int i2 = ((SharedPreferences) r6.A00.get()).getInt("num_notification_channels_created", 0) + 1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("_");
            sb2.append(i2);
            A002 = sb2.toString();
            int i3 = i;
            NotificationChannel notificationChannel = new NotificationChannel(A002, charSequence, i3);
            String str5 = str4;
            if (!TextUtils.isEmpty(str5)) {
                notificationChannel.setGroup(str5);
            }
            Integer A052 = C217217d.A05(str2);
            if (A052 != null) {
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(A052.intValue());
            } else {
                notificationChannel.enableLights(false);
            }
            long[] A0D2 = C217217d.A0D(str3);
            if (A0D2 != null) {
                notificationChannel.setVibrationPattern(A0D2);
                notificationChannel.enableVibration(true);
            } else {
                notificationChannel.enableVibration(false);
            }
            notificationChannel.setSound(uri, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            notificationChannel.setLockscreenVisibility(0);
            C59462mL A012 = A01(r4, str);
            if (AnonymousClass112.A07() && A012 != null) {
                C60552oD.A00(notificationChannel, A012);
            }
            if (A012 != null) {
                String str6 = A012.A01;
                String str7 = A012.A00;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str6);
                sb3.append(" : ");
                sb3.append(str7);
                String obj = sb3.toString();
                AnonymousClass00H r7 = this.A09;
                NotificationChannel notificationChannel2 = ((NotificationManager) r7.get()).getNotificationChannel(obj);
                if (notificationChannel2 != null) {
                    ((NotificationManager) r7.get()).deleteNotificationChannel(notificationChannel2.getId());
                    A05(notificationChannel2);
                }
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("NotificationChannelsManager26/addNotificationChannel adding channel with id:");
            sb4.append(A03(A002));
            sb4.append(" importance:");
            sb4.append(i3);
            sb4.append(" lights:");
            sb4.append(notificationChannel.shouldShowLights());
            sb4.append(" color:");
            String hexString = Integer.toHexString(notificationChannel.getLightColor() & 16777215);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("000000".substring(hexString.length()));
            sb5.append(hexString);
            sb4.append(sb5.toString());
            sb4.append(" vibrate:");
            sb4.append(notificationChannel.shouldVibrate());
            sb4.append(" sounduri:");
            sb4.append(notificationChannel.getSound());
            Log.i(sb4.toString());
            C39581tJ.A04(notificationChannel, (NotificationManager) this.A09.get());
            C19830z4.A00(r6).putInt("num_notification_channels_created", i2).apply();
            r4.A02(str, A002);
        }
        return A002;
    }

    public synchronized void A0N(NotificationChannel notificationChannel, String str, int i) {
        C19830z4 r6 = this.A0F;
        int i2 = ((SharedPreferences) r6.A00.get()).getInt("num_notification_channels_created", 0) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(i2);
        String obj = sb.toString();
        NotificationChannel notificationChannel2 = new NotificationChannel(obj, A0F(str), i);
        notificationChannel2.setGroup("channel_group_chats");
        notificationChannel2.enableLights(notificationChannel.shouldShowLights());
        notificationChannel2.setLightColor(notificationChannel.getLightColor());
        notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
        notificationChannel2.setVibrationPattern(notificationChannel.getVibrationPattern());
        notificationChannel2.setSound(notificationChannel.getSound(), notificationChannel.getAudioAttributes());
        notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
        notificationChannel2.setShowBadge(notificationChannel.canShowBadge());
        notificationChannel2.setBypassDnd(notificationChannel.canBypassDnd());
        C25211Ni r7 = A0N;
        C59462mL A012 = A01(r7, str);
        if (AnonymousClass112.A07() && A012 != null) {
            C60552oD.A00(notificationChannel2, A012);
        }
        r7.A03(str, notificationChannel.getId());
        AnonymousClass00H r2 = this.A09;
        C39581tJ.A05((NotificationManager) r2.get(), notificationChannel.getId());
        C39581tJ.A04(notificationChannel2, (NotificationManager) r2.get());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NotificationChannelsManager26/unMuteChannelBySettingsId creating new channel:");
        sb2.append(A02(notificationChannel2));
        Log.i(sb2.toString());
        r7.A02(str, obj);
        C19830z4.A00(r6).putInt("num_notification_channels_created", i2).apply();
    }

    public synchronized void A0P(C28781at r2) {
        A06(((C28801av) r2).A02);
    }

    public void Bqu() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ContentValues A00(android.app.NotificationChannel r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.Integer r1 = X.C217217d.A05(r7)
            java.lang.String r5 = "message_light"
            boolean r0 = r6.shouldShowLights()
            if (r1 == 0) goto L_0x00c0
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "000000"
        L_0x0015:
            r4.put(r5, r0)
        L_0x0018:
            long[] r2 = X.C217217d.A0D(r8)
            java.lang.String r1 = "message_vibrate"
            boolean r0 = r6.shouldVibrate()
            if (r2 == 0) goto L_0x0080
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "0"
        L_0x0028:
            r4.put(r1, r0)
        L_0x002b:
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = "message_tone"
            android.net.Uri r0 = r6.getSound()
            if (r2 != 0) goto L_0x005a
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = ""
        L_0x003b:
            r4.put(r1, r0)
        L_0x003e:
            r0 = 4
            if (r10 == 0) goto L_0x0042
            r0 = 3
        L_0x0042:
            int r2 = r6.getImportance()
            if (r2 == r0) goto L_0x0059
            r0 = 3
            if (r2 < r0) goto L_0x0059
            r1 = 3
            r0 = 0
            if (r2 != r1) goto L_0x0050
            r0 = 1
        L_0x0050:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "low_pri_notifications"
            r4.put(r0, r1)
        L_0x0059:
            return r4
        L_0x005a:
            if (r0 == 0) goto L_0x003e
            android.net.Uri r0 = r6.getSound()
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            goto L_0x0075
        L_0x0069:
            android.net.Uri r0 = r6.getSound()
            java.lang.String r0 = r0.toString()
            boolean r0 = r9.equals(r0)
        L_0x0075:
            if (r0 != 0) goto L_0x003e
            android.net.Uri r0 = r6.getSound()
            java.lang.String r0 = r0.toString()
            goto L_0x003b
        L_0x0080:
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "1"
            goto L_0x0028
        L_0x0085:
            int r0 = r6.getLightColor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0018
            int r1 = r6.getLightColor()
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            java.lang.String r3 = java.lang.Integer.toHexString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "000000"
            int r0 = r3.length()
            java.lang.String r0 = r1.substring(r0)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toUpperCase(r0)
            goto L_0x0015
        L_0x00c0:
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "FFFFFF"
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25201Nh.A00(android.app.NotificationChannel, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.ContentValues");
    }

    private synchronized void A06(C23141Ev r26) {
        Map map;
        boolean containsKey;
        boolean containsKey2;
        boolean containsKey3;
        Cursor A0A2;
        Uri parse;
        AnonymousClass1BI A022;
        String A012;
        String A002;
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            C25211Ni r1 = A0N;
            synchronized (r1) {
                map = r1.A01;
                map.clear();
                r1.A00.clear();
            }
            this.A01 = false;
            Context context = this.A0E.A00;
            AnonymousClass11C r10 = this.A04;
            C39571tI.A00(context, r10);
            AnonymousClass00H r5 = this.A09;
            List<NotificationChannel> A032 = C39581tJ.A03((NotificationManager) r5.get());
            C19830z4 r2 = this.A0F;
            C19830z4 r24 = r2;
            AnonymousClass00H r8 = r2.A00;
            ((SharedPreferences) r8.get()).getInt("notification_channels_schema_version", 0);
            if (((SharedPreferences) r8.get()).getInt("notification_channels_schema_version", 0) >= 2) {
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                for (NotificationChannel notificationChannel : A032) {
                    if (!C39571tI.A01.contains(notificationChannel.getId())) {
                        String A013 = C39591tK.A01(notificationChannel.getId());
                        if ("individual_chat_defaults".equals(A013)) {
                            z = true;
                        } else if ("group_chat_defaults".equals(A013)) {
                            z2 = true;
                        } else if ("silent_notifications".equals(A013)) {
                            z3 = true;
                        }
                    }
                }
                if (z && z2 && z3) {
                    A032.size();
                    ((SharedPreferences) r8.get()).getInt("num_notification_channels_created", 0);
                    A08(C39581tJ.A02((NotificationManager) r5.get()));
                    ArrayList arrayList = new ArrayList(A032.size());
                    ArrayList arrayList2 = new ArrayList();
                    for (NotificationChannel notificationChannel2 : A032) {
                        if (!C39571tI.A01.contains(notificationChannel2.getId()) && !"miscellaneous".equals(notificationChannel2.getId())) {
                            String A014 = C39591tK.A01(notificationChannel2.getId());
                            if (A014 != null) {
                                C22971Dz.A07(A014);
                                A02(notificationChannel2);
                                r1.A02(A014, notificationChannel2.getId());
                                arrayList.add(notificationChannel2);
                            } else {
                                arrayList2.add(notificationChannel2);
                            }
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        NotificationChannel notificationChannel3 = (NotificationChannel) it.next();
                        C18070vi.A0d(notificationChannel3, 0);
                        if (AnonymousClass112.A07() && (A012 = C39601tL.A01(notificationChannel3)) != null && AnonymousClass112.A07() && (A002 = C39601tL.A00(notificationChannel3)) != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(A012);
                            sb.append(" : ");
                            sb.append(A002);
                            if (C18070vi.A18(sb.toString(), notificationChannel3.getId())) {
                                Iterator it2 = arrayList.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    NotificationChannel notificationChannel4 = (NotificationChannel) it2.next();
                                    C18070vi.A0d(notificationChannel4, 1);
                                    if (AnonymousClass112.A07()) {
                                        str = C39601tL.A01(notificationChannel3);
                                    } else {
                                        str = null;
                                    }
                                    if (AnonymousClass112.A07()) {
                                        str2 = C39601tL.A01(notificationChannel4);
                                    } else {
                                        str2 = null;
                                    }
                                    if (C18070vi.A18(str, str2)) {
                                        if (AnonymousClass112.A07()) {
                                            str3 = C39601tL.A00(notificationChannel3);
                                        } else {
                                            str3 = null;
                                        }
                                        if (AnonymousClass112.A07()) {
                                            str4 = C39601tL.A00(notificationChannel4);
                                        } else {
                                            str4 = null;
                                        }
                                        if (C18070vi.A18(str3, str4)) {
                                            ((NotificationManager) r5.get()).deleteNotificationChannel(notificationChannel3.getId());
                                            A05(notificationChannel3);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.A01 = true;
                    this.A03.CGP(new C448925e(this, 6));
                }
            }
            A0J();
            A04(A032);
            A08(C39581tJ.A02((NotificationManager) r5.get()));
            try {
                A0A2 = r26.A0A("SELECT jid, message_light, message_vibrate, message_tone, use_custom_notifications, low_pri_notifications FROM settings", "CHAT_SETTINGS/GET_ALL_NOTIFICATION_CHANNELS", (String[]) null);
                int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("jid");
                int columnIndexOrThrow2 = A0A2.getColumnIndexOrThrow("message_light");
                int columnIndexOrThrow3 = A0A2.getColumnIndexOrThrow("message_vibrate");
                int columnIndexOrThrow4 = A0A2.getColumnIndexOrThrow("message_tone");
                int columnIndexOrThrow5 = A0A2.getColumnIndexOrThrow("use_custom_notifications");
                int columnIndexOrThrow6 = A0A2.getColumnIndexOrThrow("low_pri_notifications");
                while (A0A2.moveToNext()) {
                    String string = A0A2.getString(columnIndexOrThrow);
                    boolean z4 = false;
                    boolean z5 = false;
                    if (A0A2.getInt(columnIndexOrThrow5) == 1) {
                        z5 = true;
                    }
                    if (string != null) {
                        if (!"individual_chat_defaults".equals(string) && !"group_chat_defaults".equals(string)) {
                            if (z5 && (A022 = AnonymousClass1BI.A00.A02(string)) != null) {
                                AnonymousClass1CJ r52 = this.A06;
                                if (r52.A0P(A022)) {
                                    if (r52.A08(A022) <= System.currentTimeMillis() - A0M) {
                                    }
                                }
                            }
                        }
                        if (A0A2.getInt(columnIndexOrThrow6) == 1) {
                            z4 = true;
                        }
                        String A0F2 = A0F(string);
                        int i = 4;
                        if (z4) {
                            i = 3;
                        }
                        String string2 = A0A2.getString(columnIndexOrThrow2);
                        String string3 = A0A2.getString(columnIndexOrThrow3);
                        String string4 = A0A2.getString(columnIndexOrThrow4);
                        if (string4 == null) {
                            parse = Uri.EMPTY;
                        } else {
                            parse = Uri.parse(string4);
                        }
                        if (!TextUtils.isEmpty(string4) && !C64062u9.A0M(parse, r10, this.A05, true)) {
                            parse = Settings.System.DEFAULT_NOTIFICATION_URI;
                        }
                        A0D(parse, A0F2, string, string2, string3, "channel_group_chats", i);
                    }
                }
                A0A2.close();
            } catch (Exception e) {
                Log.e("NotificationChannelsManager26/syncNotificationChannels", e);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
            synchronized (r1) {
                containsKey = map.containsKey("individual_chat_defaults");
            }
            if (!containsKey) {
                A0D(Settings.System.DEFAULT_NOTIFICATION_URI, A0F("individual_chat_defaults"), "individual_chat_defaults", "FFFFFF", "1", "channel_group_chats", 4);
            }
            synchronized (r1) {
                containsKey2 = map.containsKey("group_chat_defaults");
            }
            if (!containsKey2) {
                A0D(Settings.System.DEFAULT_NOTIFICATION_URI, A0F("group_chat_defaults"), "group_chat_defaults", "FFFFFF", "1", "channel_group_chats", 4);
            }
            synchronized (r1) {
                containsKey3 = map.containsKey("silent_notifications");
            }
            if (!containsKey3) {
                A0D((Uri) null, A0F("silent_notifications"), "silent_notifications", (String) null, (String) null, (String) null, 2);
            }
            this.A01 = true;
            C19830z4.A00(r24).putInt("notification_channels_schema_version", 2).apply();
            this.A03.CGP(new C448925e(this, 6));
        }
        return;
        throw th;
    }

    public static void A07(C25201Nh r3) {
        Handler handler = (Handler) r3.A0L.get();
        if (!handler.hasMessages(1)) {
            handler.sendEmptyMessageDelayed(1, 3000);
        }
    }

    public NotificationChannel A09(String str) {
        String A002 = A0N.A00(str);
        if (A002 != null) {
            return C39581tJ.A01((NotificationManager) this.A09.get(), A002);
        }
        return null;
    }

    public String A0E(String str) {
        CountDownLatch countDownLatch;
        C25211Ni r3 = A0N;
        String A002 = r3.A00(str);
        if (A002 != null) {
            return A002;
        }
        if (C18020vd.A05(C18040vf.A01, this.A07, 9557) && (countDownLatch = this.A00) != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        return r3.A00(str);
    }

    public String A0F(String str) {
        Context context;
        int i;
        if ("individual_chat_defaults".equals(str)) {
            context = this.A0E.A00;
            i = 2131899403;
        } else if ("group_chat_defaults".equals(str)) {
            context = this.A0E.A00;
            i = 2131895904;
        } else if ("silent_notifications".equals(str)) {
            context = this.A0E.A00;
            i = 2131888025;
        } else if ("channel_notification".equals(str)) {
            context = this.A0E.A00;
            i = 2131892742;
        } else if ("voip_notification".equals(str)) {
            context = this.A0E.A00;
            i = 2131888026;
        } else if ("status_likes_notification".equals(str)) {
            context = this.A0E.A00;
            i = 2131896345;
        } else {
            AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(str);
            if (A022 == null) {
                return null;
            }
            return this.A0C.A0I(this.A0G.A01(A022));
        }
        return context.getString(i);
    }

    public String A0G(String str) {
        CountDownLatch countDownLatch;
        C25211Ni r3 = A0N;
        String A012 = r3.A01(str);
        if (A012 != null) {
            return A012;
        }
        if (C18020vd.A05(C18040vf.A01, this.A07, 9557) && (countDownLatch = this.A00) != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        return r3.A01(str);
    }

    public String A0H(String str) {
        String str2;
        if (str != null) {
            str2 = A0N.A01(str);
        } else {
            str2 = null;
        }
        if (!"silent_notifications".equals(str2)) {
            return str;
        }
        NotificationChannel A012 = C39581tJ.A01((NotificationManager) this.A09.get(), str);
        if (A012 == null || A012.getImportance() <= 2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationChannelsManager26/repairSilentNotificationChannel repairing channel:");
        String A072 = C22971Dz.A07(str2);
        if (A072 == null) {
            A072 = "null";
        }
        sb.append(A072);
        Log.i(sb.toString());
        A0R(str2);
        return A0D((Uri) null, A0F(str2), str2, (String) null, (String) null, (String) null, 2);
    }

    public String A0I(String str) {
        String A012 = A0N.A01(str);
        if (!"status_likes_notification".equals(A012)) {
            return str;
        }
        if (!C18020vd.A05(C18040vf.A02, this.A07, 10928)) {
            return str;
        }
        NotificationChannel A013 = C39581tJ.A01((NotificationManager) this.A09.get(), str);
        C19830z4 r3 = this.A0F;
        if (((SharedPreferences) r3.A00.get()).getBoolean("status_like_notification_priority_upgrade_executed", false) || A013 == null || A013.getImportance() != 2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationChannelsManager26/repairStatusLikesNotificationChannel repairing channel:");
        String A072 = C22971Dz.A07(A012);
        if (A072 == null) {
            A072 = "null";
        }
        sb.append(A072);
        Log.i(sb.toString());
        try {
            A0R(A012);
            C19830z4.A00(r3).putBoolean("status_like_notification_priority_upgrade_executed", true).apply();
            return A0C();
        } catch (SecurityException unused) {
            Log.w("NotificationChannelsManager26/repairStatusLikesNotificationChannel SecurityException in deleteNotificationChannel");
            return str;
        }
    }

    public void A0J() {
        NotificationManager notificationManager = (NotificationManager) this.A09.get();
        for (NotificationChannel notificationChannel : C39581tJ.A03(notificationManager)) {
            if (!C39571tI.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId())) {
                A03(notificationChannel.getId());
                C39581tJ.A05(notificationManager, notificationChannel.getId());
            }
        }
        C25211Ni r1 = A0N;
        synchronized (r1) {
            r1.A01.clear();
            r1.A00.clear();
        }
    }

    public void A0K() {
        this.A03.CGP(new C98844ro((Object) this, 32));
        C18150vq r1 = this.A0L;
        if (r1.A03()) {
            ((Handler) r1.get()).removeMessages(1);
        }
    }

    public /* synthetic */ void A0L() {
        if (!this.A02) {
            this.A0B.registerObserver(this.A0A);
            this.A0I.registerObserver(this.A0H);
            this.A0K.registerObserver(this.A0J);
            this.A02 = true;
        }
    }

    public /* synthetic */ void A0M() {
        if (this.A02) {
            this.A0B.unregisterObserver(this.A0A);
            this.A0I.unregisterObserver(this.A0H);
            this.A0K.unregisterObserver(this.A0J);
            this.A02 = false;
        }
    }

    public void A0O(Uri uri, CharSequence charSequence, String str, String str2, String str3, boolean z, boolean z2) {
        int i;
        NotificationChannel A012;
        boolean z3;
        String str4 = str;
        C22971Dz.A07(str4);
        String A002 = A0N.A00(str4);
        if (!C39571tI.A01.contains(A002)) {
            Uri uri2 = uri;
            String str5 = str2;
            String str6 = str3;
            if (A002 == null || (A012 = C39581tJ.A01((NotificationManager) this.A09.get(), A002)) == null) {
                i = 4;
                if (z) {
                    i = 3;
                }
            } else {
                Integer A052 = C217217d.A05(str5);
                boolean z4 = true;
                boolean shouldShowLights = A012.shouldShowLights();
                if (A052 == null ? !shouldShowLights : shouldShowLights && A052.equals(Integer.valueOf(A012.getLightColor()))) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                long[] A0D2 = C217217d.A0D(str6);
                boolean shouldVibrate = A012.shouldVibrate();
                if (A0D2 == null ? shouldVibrate : !shouldVibrate) {
                    z3 = true;
                }
                if (!AnonymousClass026.A00(uri, A012.getSound())) {
                    z3 = true;
                }
                int importance = A012.getImportance();
                i = 4;
                if (z) {
                    i = 3;
                }
                if (importance == i) {
                    z4 = z3;
                } else if (importance < 3) {
                    C22971Dz.A07(str4);
                    z4 = z3;
                    i = importance;
                }
                if ((!AnonymousClass112.A07() || !z2 || !TextUtils.isEmpty(A012.getConversationId())) && !z4) {
                    C22971Dz.A07(str4);
                    return;
                }
                A0R(str4);
            }
            A0D(uri2, charSequence, str4, str5, str6, "channel_group_chats", i);
        }
    }

    public void A0R(String str) {
        C25211Ni r1 = A0N;
        String A002 = r1.A00(str);
        if (A002 != null && !C39571tI.A01.contains(A002)) {
            C39581tJ.A05((NotificationManager) this.A09.get(), A002);
            r1.A03(str, A002);
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationChannelsManager26/deleteNotificationChannel/deleting channelId:");
            sb.append(A03(A002));
            sb.append(" for settingsId:");
            String A072 = C22971Dz.A07(str);
            if (A072 == null) {
                A072 = "null";
            }
            sb.append(A072);
            Log.i(sb.toString());
        }
    }

    public /* synthetic */ boolean A0S() {
        if (!this.A01) {
            return true;
        }
        AnonymousClass00H r5 = this.A09;
        for (NotificationChannel notificationChannel : C39581tJ.A03((NotificationManager) r5.get())) {
            if (!C39571tI.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId()) && "channel_group_chats".equals(notificationChannel.getGroup())) {
                String A012 = C39591tK.A01(notificationChannel.getId());
                if (A012 != null) {
                    CharSequence name = notificationChannel.getName();
                    String A0F2 = A0F(A012);
                    if (!TextUtils.equals(name, A0F2)) {
                        A03(notificationChannel.getId());
                        C39581tJ.A04(new NotificationChannel(notificationChannel.getId(), A0F2, notificationChannel.getImportance()), (NotificationManager) r5.get());
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("NotificationChannelsManager26/updateChannelNames ignoring channel:");
                    sb.append(A03(notificationChannel.getId()));
                    Log.i(sb.toString());
                }
            }
        }
        return true;
    }

    public boolean A0T(NotificationChannel notificationChannel, C28791au r19) {
        StringBuilder sb;
        Cursor A0A2;
        NotificationChannel notificationChannel2 = notificationChannel;
        C28791au r5 = r19;
        String id = notificationChannel2.getId();
        String A012 = C39591tK.A01(id);
        if (A012 == null) {
            sb.append("NotificationChannelsManager26/updateStoreFromNotificationChannel invalid channel id: ");
            sb.append(A03(id));
            Log.e(sb.toString());
            return false;
        }
        sb = new StringBuilder();
        sb.append("NotificationChannelsManager26/updateStoreFromNotificationChannel for id:");
        sb.append(A03(id));
        Log.i(sb.toString());
        try {
            C23141Ev r11 = ((C28801av) r5).A02;
            A0A2 = r11.A0A("SELECT message_light, message_vibrate, message_tone, low_pri_notifications FROM settings WHERE jid = ?", "updateStoreFromNotificationChannel/QUERY_CHAT_SETTINGS", new String[]{A012});
            if (A0A2.moveToNext()) {
                C22971Dz.A07(A012);
                String string = A0A2.getString(A0A2.getColumnIndexOrThrow("message_light"));
                String string2 = A0A2.getString(A0A2.getColumnIndexOrThrow("message_vibrate"));
                String string3 = A0A2.getString(A0A2.getColumnIndexOrThrow("message_tone"));
                boolean z = false;
                if (A0A2.getInt(A0A2.getColumnIndexOrThrow("low_pri_notifications")) == 1) {
                    z = true;
                }
                ContentValues A002 = A00(notificationChannel2, string, string2, string3, z);
                if (A002.size() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("NotificationChannelsManager26/updateStoreFromNotificationChannel updating row for settingsId: ");
                    String A072 = C22971Dz.A07(A012);
                    if (A072 == null) {
                        A072 = "null";
                    }
                    sb2.append(A072);
                    sb2.append(" with values:");
                    sb2.append(A002);
                    Log.i(sb2.toString());
                    r11.A02(A002, "settings", "jid = ?", "updateStoreFromNotificationChannel/UPDATE_CHAT_SETTINGS", new String[]{A012});
                }
                A0A2.close();
                return false;
            }
            C22971Dz.A07(A012);
            if ("individual_chat_defaults".equals(A012) || "group_chat_defaults".equals(A012)) {
                ContentValues A003 = A00(notificationChannel2, "FFFFFF", "1", Settings.System.DEFAULT_NOTIFICATION_URI.toString(), false);
                if (A003.size() > 0) {
                    A003.put("jid", A012);
                    if (!A003.containsKey("message_light")) {
                        A003.put("message_light", "FFFFFF");
                    }
                    if (!A003.containsKey("message_vibrate")) {
                        A003.put("message_vibrate", "1");
                    }
                    if (!A003.containsKey("message_tone")) {
                        A003.put("message_tone", Settings.System.DEFAULT_NOTIFICATION_URI.toString());
                    }
                    A003.put("message_popup", Integer.toString(0));
                    A003.put("call_tone", Settings.System.DEFAULT_RINGTONE_URI.toString());
                    A003.put("call_vibrate", "1");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("NotificationChannelsManager26/updateStoreFromNotificationChannel adding row for settingsId: ");
                    String A073 = C22971Dz.A07(A012);
                    if (A073 == null) {
                        A073 = "null";
                    }
                    sb3.append(A073);
                    Log.i(sb3.toString());
                    r11.A05("settings", "ChatSettingsStore/updateStoreFromNotificationChannel/INSERT_CHAT_SETTINGS", A003);
                }
                A0A2.close();
                return false;
            }
            if (!"silent_notifications".equals(A012) && !"voip_notification".equals(A012)) {
                C39581tJ.A05((NotificationManager) this.A09.get(), id);
                A0N.A03(A012, id);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("NotificationChannelsManager26/updateStoreFromNotificationChannel deleting channel: ");
                sb4.append(A03(id));
                Log.i(sb4.toString());
            }
            A0A2.close();
            return false;
            A0A2.close();
            return true;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("NotificationChannelsManager26/updateStoreFromNotificationChannel", e);
            return false;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public boolean A0U(String str) {
        NotificationChannel A012;
        if (!"voip_notification".equals(A0N.A01(str)) || (A012 = C39581tJ.A01((NotificationManager) this.A09.get(), str)) == null || A012.getImportance() != 0) {
            return false;
        }
        return true;
    }

    public void Bqv(SQLiteException sQLiteException) {
        Log.i("NotificationChannelsManager26/deleteDatabaseFiles success");
        A0J();
    }

    public void Bqw(C23141Ev r4) {
        if (C18020vd.A05(C18040vf.A01, this.A07, 9557)) {
            Log.i("NotificationChannelsManager26/onOpen targeting api 26/async");
            this.A00 = new CountDownLatch(1);
            this.A08.CGF(new C146527Pl(this, r4, 30));
            return;
        }
        Log.i("NotificationChannelsManager26/onOpen targeting api 26/main");
        A06(r4);
    }

    public C25201Nh(AnonymousClass1KB r5, C24671Lf r6, C24921Me r7, AnonymousClass11C r8, AnonymousClass11P r9, AnonymousClass118 r10, C219217x r11, C19830z4 r12, AnonymousClass1CJ r13, C25181Nf r14, AnonymousClass1NN r15, C18030ve r16, C25191Ng r17, AnonymousClass10I r18, C25151Nc r19) {
        this.A0E = r10;
        this.A0D = r9;
        this.A07 = r16;
        this.A03 = r5;
        this.A08 = r18;
        this.A06 = r13;
        this.A04 = r8;
        this.A0C = r7;
        this.A0B = r6;
        this.A05 = r11;
        this.A0F = r12;
        this.A0I = r15;
        this.A0G = r14;
        this.A0K = r17;
        r8.getClass();
        this.A09 = new C18150vq((Object) null, new C70943Dc(r8, 19));
        this.A0L = new C18150vq((Object) null, new C70953Dd(this, r19, 3));
    }

    public static final String A03(String str) {
        Pair A002 = C39591tK.A00(str);
        if (A002 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C22971Dz.A07((String) A002.first));
        sb.append('_');
        sb.append(A002.second);
        return sb.toString();
    }

    public static final void A05(NotificationChannel notificationChannel) {
        String A012;
        String A002;
        if (AnonymousClass112.A07() && (A012 = C39601tL.A01(notificationChannel)) != null && AnonymousClass112.A07() && (A002 = C39601tL.A00(notificationChannel)) != null) {
            String A032 = A03(A012);
            String A072 = C22971Dz.A07(A002);
            if (A072 == null) {
                A072 = "null";
            }
            C18070vi.A0d(A032, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(A032);
            sb.append(" : ");
            sb.append(A072);
            sb.toString();
        }
    }

    public /* synthetic */ Handler A0A(C25151Nc r4) {
        return new Handler(r4.A00(), new AnonymousClass75Y(this, 7));
    }

    public /* synthetic */ void A0Q(C23141Ev r2) {
        A06(r2);
        this.A00.countDown();
    }
}
