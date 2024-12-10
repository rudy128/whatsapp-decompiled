package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.2n1  reason: invalid class name and case insensitive filesystem */
public final class C59872n1 {
    public final AnonymousClass195 A00;
    public final AnonymousClass1R8 A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass118 A04;
    public final C27301Vn A05;
    public final C19830z4 A06;
    public final AnonymousClass19D A07;
    public final C139576z4 A08;
    public final AnonymousClass1CM A09;
    public final A8V A0A;

    public final void A00(C49332Qb r8) {
        String str;
        C19830z4 r2;
        SharedPreferences A0B;
        String str2;
        long A032;
        String A0y;
        String str3;
        boolean z = r8 instanceof AnonymousClass2JY;
        if (z) {
            str = "com.whatsapp.alarm.ONBOARDING_INCOMPLETE";
        } else {
            str = "com.whatsapp.alarm.ENTER_PHONE_NUMBER";
        }
        Intent intent = new Intent(str).setPackage("com.whatsapp");
        C18070vi.A0X(intent);
        PendingIntent A012 = C1408573i.A01(this.A04.A00, 0, intent, 536870912);
        if (A012 != null) {
            AlarmManager A052 = this.A02.A05();
            if (A052 != null) {
                A052.cancel(A012);
            }
            A012.cancel();
        }
        int i = C50822Vx.A00[r8.ordinal()];
        if (i == 1) {
            r2 = this.A06;
            A0B = C17890vO.A0B(r2);
            str2 = "pref_onboarding_incomplete_notif_scheduled";
        } else if (i == 2) {
            r2 = this.A06;
            A0B = C17890vO.A0B(r2);
            str2 = "pref_enter_phone_number_notif_scheduled";
        } else {
            throw new AnonymousClass3EW();
        }
        if (A0B.getBoolean(str2, false)) {
            C17880vN.A1F(C19830z4.A00(r2), str2, false);
            C139576z4 r5 = this.A08;
            AnonymousClass19D r22 = this.A07;
            if (z) {
                A032 = (long) C18020vd.A00(C18040vf.A02, r22, 7780);
            } else {
                A032 = C17890vO.A03(r5.A01(10067));
            }
            if (A032 > 60000) {
                A8V a8v = this.A0A;
                if (z) {
                    A0y = "onboarding_incomplete_timer_cancelled";
                    str3 = "onboarding_incomplete_notification_step";
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("enter_phone_number_timer_cancelled");
                    A0y = AnonymousClass000.A0y(r8.A00(r5), A10);
                    str3 = "enter_phone_number_notification_step";
                }
                a8v.A0E(A0y, str3);
            }
        }
    }

    public final void A01(C49332Qb r22, boolean z) {
        long A032;
        C19830z4 r6;
        AnonymousClass00H r12;
        SharedPreferences A0B;
        String str;
        SharedPreferences A0B2;
        String str2;
        String str3;
        SharedPreferences.Editor A002;
        String str4;
        String A0y;
        String str5;
        String str6;
        C139576z4 r3 = this.A08;
        AnonymousClass19D r62 = this.A07;
        C49332Qb r4 = r22;
        boolean z2 = r4 instanceof AnonymousClass2JY;
        if (z2) {
            A032 = (long) C18020vd.A00(C18040vf.A02, r62, 7780);
        } else {
            A032 = C17890vO.A03(r3.A01(10067));
        }
        if (A032 <= 60000) {
            str6 = "RegAndOnboardingNotificationsManager/scheduleNotification/too-soon";
        } else {
            int[] iArr = C50822Vx.A00;
            int ordinal = r4.ordinal();
            int i = iArr[ordinal];
            if (i == 1) {
                r6 = this.A06;
                r12 = r6.A00;
                A0B = C17880vN.A0B(r12);
                str = "pref_onboarding_incomplete_notif_shown";
            } else if (i == 2) {
                r6 = this.A06;
                r12 = r6.A00;
                A0B = C17880vN.A0B(r12);
                str = "pref_enter_phone_number_notif_shown";
            } else {
                throw new AnonymousClass3EW();
            }
            if (!A0B.getBoolean(str, false)) {
                int i2 = iArr[ordinal];
                if (i2 == 1) {
                    A0B2 = C17880vN.A0B(r12);
                    str2 = "pref_onboarding_incomplete_notif_scheduled";
                } else if (i2 == 2) {
                    A0B2 = C17880vN.A0B(r12);
                    str2 = "pref_enter_phone_number_notif_scheduled";
                } else {
                    throw new AnonymousClass3EW();
                }
                if (A0B2.getBoolean(str2, false)) {
                    A00(r4);
                }
                if (z2) {
                    str3 = "com.whatsapp.alarm.ONBOARDING_INCOMPLETE";
                } else {
                    str3 = "com.whatsapp.alarm.ENTER_PHONE_NUMBER";
                }
                Intent intent = new Intent(str3).setPackage("com.whatsapp");
                C18070vi.A0X(intent);
                PendingIntent A062 = C17880vN.A06(this.A04.A00, intent, 0);
                if (!this.A01.A00.A02(A062, 2, SystemClock.elapsedRealtime() + A032, false)) {
                    str6 = "RegAndOnboardingNotificationsManager/scheduleNotification/AlarmManager-is-null";
                } else {
                    int i3 = iArr[ordinal];
                    if (i3 == 1) {
                        A002 = C19830z4.A00(r6);
                        str4 = "pref_onboarding_incomplete_notif_scheduled";
                    } else if (i3 == 2) {
                        A002 = C19830z4.A00(r6);
                        str4 = "pref_enter_phone_number_notif_scheduled";
                    } else {
                        throw new AnonymousClass3EW();
                    }
                    C17880vN.A1F(A002, str4, true);
                    if (z) {
                        A8V a8v = this.A0A;
                        if (z2) {
                            A0y = "onboarding_incomplete_timer_scheduled";
                            str5 = "onboarding_incomplete_notification_step";
                        } else {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("enter_phone_number_timer_scheduled");
                            A0y = AnonymousClass000.A0y(r4.A00(r3), A10);
                            str5 = "enter_phone_number_notification_step";
                        }
                        a8v.A0E(A0y, str5);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        Log.w(str6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r1.A00(false) != 10) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r5.A00.A00 == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        r3 = r5.A0A;
        r2 = r5.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if ((r6 instanceof X.AnonymousClass2JY) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r1 = "onboarding_incomplete_timer_rescheduled_app_open";
        r0 = "onboarding_incomplete_notification_step";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        r3.A0E(r1, r0);
        A01(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("enter_phone_number_timer_rescheduled_app_open");
        r1 = X.AnonymousClass000.A0y(r6.A00(r2), r1);
        r0 = "enter_phone_number_notification_step";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        return ((X.AnonymousClass1Vo) r5.A05).A00.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r5.A09.A00(false) > 1) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.C49332Qb r6) {
        /*
            r5 = this;
            r4 = 0
            int[] r1 = X.C50822Vx.A00
            int r0 = r6.ordinal()
            r2 = r1[r0]
            r1 = 1
            if (r2 == r1) goto L_0x003b
            r0 = 2
            if (r2 != r0) goto L_0x004c
            X.1CM r0 = r5.A09
            int r0 = r0.A00(r4)
            if (r0 <= r1) goto L_0x0052
        L_0x0017:
            X.A8V r3 = r5.A0A
            X.6z4 r2 = r5.A08
            boolean r0 = r6 instanceof X.AnonymousClass2JY
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = "onboarding_incomplete_timer_expired_finished_onboarding"
            java.lang.String r0 = "onboarding_incomplete_notification_step"
        L_0x0023:
            r3.A0E(r1, r0)
            return r4
        L_0x0027:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "enter_phone_number_timer_expired_pn_entered"
            r1.append(r0)
            java.lang.String r0 = r6.A00(r2)
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "enter_phone_number_notification_step"
            goto L_0x0023
        L_0x003b:
            X.1CM r1 = r5.A09
            boolean r0 = r1.A04()
            if (r0 != 0) goto L_0x0017
            int r1 = r1.A00(r4)
            r0 = 10
            if (r1 != r0) goto L_0x0052
            goto L_0x0017
        L_0x004c:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        L_0x0052:
            X.195 r0 = r5.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x007f
            X.A8V r3 = r5.A0A
            X.6z4 r2 = r5.A08
            boolean r0 = r6 instanceof X.AnonymousClass2JY
            if (r0 == 0) goto L_0x006b
            java.lang.String r1 = "onboarding_incomplete_timer_rescheduled_app_open"
            java.lang.String r0 = "onboarding_incomplete_notification_step"
        L_0x0064:
            r3.A0E(r1, r0)
            r5.A01(r6, r4)
            return r4
        L_0x006b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "enter_phone_number_timer_rescheduled_app_open"
            r1.append(r0)
            java.lang.String r0 = r6.A00(r2)
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "enter_phone_number_notification_step"
            goto L_0x0064
        L_0x007f:
            X.1Vn r0 = r5.A05
            X.1Vo r0 = (X.AnonymousClass1Vo) r0
            X.1Vp r0 = r0.A00
            boolean r0 = r0.A01()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59872n1.A02(X.2Qb):boolean");
    }

    public C59872n1(AnonymousClass195 r2, AnonymousClass1R8 r3, AnonymousClass11C r4, AnonymousClass11P r5, AnonymousClass118 r6, C27301Vn r7, C19830z4 r8, AnonymousClass19D r9, C139576z4 r10, AnonymousClass1CM r11, A8V a8v) {
        C18070vi.A0w(r5, r3, r6, a8v, r4);
        C18070vi.A0x(r10, r9, r8, r7, r11);
        C18070vi.A0d(r2, 11);
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
        this.A0A = a8v;
        this.A02 = r4;
        this.A08 = r10;
        this.A07 = r9;
        this.A06 = r8;
        this.A05 = r7;
        this.A09 = r11;
        this.A00 = r2;
    }
}
