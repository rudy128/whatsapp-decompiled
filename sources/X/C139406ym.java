package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import com.whatsapp.inorganicnotifications.InorganicNotificationDismissedReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6ym  reason: invalid class name and case insensitive filesystem */
public final class C139406ym {
    public long A00;
    public long A01;
    public String A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;
    public final AnonymousClass11P A05;
    public final C27301Vn A06;
    public final C19830z4 A07;
    public final C18000vb A08;
    public final AnonymousClass1CJ A09;
    public final AnonymousClass122 A0A;
    public final AnonymousClass00H A0B;
    public final Context A0C;
    public final C32951i1 A0D;
    public final AnonymousClass118 A0E;
    public final AnonymousClass1LU A0F;
    public final C217217d A0G;
    public final AnonymousClass10I A0H;
    public final AnonymousClass00H A0I;

    public C139406ym(Context context, AnonymousClass1M9 r18, C24921Me r19, C32951i1 r20, AnonymousClass11P r21, AnonymousClass118 r22, C27301Vn r23, C19830z4 r24, C18000vb r25, AnonymousClass1CJ r26, AnonymousClass122 r27, AnonymousClass1LU r28, C217217d r29, AnonymousClass10I r30, AnonymousClass00H r31, AnonymousClass00H r32) {
        AnonymousClass11P r12 = r21;
        C18070vi.A0d(r12, 1);
        AnonymousClass10I r3 = r30;
        AnonymousClass1LU r5 = r28;
        AnonymousClass118 r11 = r22;
        C72473Md.A1M(r11, r5, r3, 3);
        AnonymousClass00H r2 = r31;
        AnonymousClass122 r6 = r27;
        C18000vb r8 = r25;
        AnonymousClass1CJ r7 = r26;
        AnonymousClass1M9 r15 = r18;
        C18070vi.A0x(r7, r15, r8, r6, r2);
        C217217d r4 = r29;
        C27301Vn r10 = r23;
        C19830z4 r9 = r24;
        C24921Me r14 = r19;
        C32951i1 r13 = r20;
        C18070vi.A0y(r13, r4, r14, r9, r10);
        AnonymousClass00H r1 = r32;
        C18070vi.A0d(r1, 16);
        this.A05 = r12;
        this.A0C = context;
        this.A0E = r11;
        this.A0F = r5;
        this.A0H = r3;
        this.A09 = r7;
        this.A03 = r15;
        this.A08 = r8;
        this.A0A = r6;
        this.A0B = r2;
        this.A0D = r13;
        this.A0G = r4;
        this.A04 = r14;
        this.A07 = r9;
        this.A06 = r10;
        this.A0I = r1;
    }

    public final void A01(AnonymousClass1BI r38, AnonymousClass1BI r39, AnonymousClass1BI r40, String str, long j) {
        Intent intent;
        String str2;
        String str3;
        AnonymousClass1BI r36 = r39;
        C18070vi.A0d(r36, 1);
        Context context = this.A0C;
        String A0F2 = C18070vi.A0F(context, 2131898700);
        String A0f = C108985cd.A0f();
        AnonymousClass1BI r3 = r38;
        if (r38 == null || (intent = this.A0F.A1w(context, r3, 2).putExtra("fromMessageReminderNotification", true)) == null) {
            Intent A022 = AnonymousClass1LU.A02(context);
            A022.putExtra("fromNotification", true);
            intent = A022.putExtra("fromMessageReminderNotificationChatJid", r36.getRawString());
            C18070vi.A0X(intent);
        }
        Intent putExtra = intent.putExtra("inorganic_notification_id", A0f);
        String str4 = null;
        AnonymousClass1BI r28 = r40;
        if (r40 != null) {
            str2 = r28.getRawString();
        } else {
            str2 = null;
        }
        long j2 = j;
        putExtra.putExtra("inorganic_notification_chat_jid", str2).putExtra("inorganic_notification_type", "message_reminder_push_notification").putExtra("inorganic_notification_thread_count", j2).putExtra("inorganic_notification_promotion_id", this.A02);
        String str5 = str;
        if (r38 == null || (str != null && str5.length() > 0)) {
            str3 = A0F2;
        } else {
            AnonymousClass1E7 A0G2 = this.A03.A0G(r3);
            if (A0G2 != null) {
                str3 = this.A04.A0I(A0G2);
            } else {
                str3 = null;
            }
        }
        PendingIntent A002 = C1408573i.A00(context, 0, intent, 134217728);
        Context A0E2 = C108945cZ.A0E(this.A0E);
        String str6 = this.A02;
        if (r40 != null) {
            str4 = r28.getRawString();
        }
        Long valueOf = Long.valueOf(j2);
        Intent intent2 = new Intent(A0E2, InorganicNotificationDismissedReceiver.class);
        intent2.putExtra("inorganic_notification_id", A0f);
        intent2.putExtra("inorganic_notification_type", "message_reminder_push_notification");
        intent2.putExtra("inorganic_notification_chat_jid", str4);
        intent2.putExtra("inorganic_notification_thread_count", valueOf);
        intent2.putExtra("inorganic_notification_promotion_id", str6);
        PendingIntent A012 = C1408573i.A01(A0E2, 1, intent2, 134217728);
        C18070vi.A0X(A012);
        if (r38 == null || (str != null && str5.length() > 0)) {
            C18070vi.A0b(A002);
            A00(A002, A012, (AnonymousClass1E7) null, A0F2, str3, str5);
        } else {
            ArrayList A13 = AnonymousClass000.A13();
            long A072 = this.A09.A07(r3);
            AnonymousClass122 r0 = this.A0A;
            AnonymousClass11P r11 = this.A05;
            C54242dp BUp = r0.BUp(r3, 1, A072, AnonymousClass11P.A01(r11));
            try {
                Cursor cursor = BUp.A00;
                if (cursor != null) {
                    if (cursor.moveToFirst()) {
                        while (true) {
                            AnonymousClass206 A023 = C17880vN.A0c(this.A0B).A02(cursor, r3);
                            if (!(A023 == null || A023.A0x == A072 || A023.A0v.A02)) {
                                long j3 = A023.A0G;
                                long A013 = AnonymousClass11P.A01(r11);
                                TimeUnit timeUnit = TimeUnit.MINUTES;
                                if (j3 >= A013 - timeUnit.toMillis(this.A00) && A023.A0G <= AnonymousClass11P.A01(r11) - timeUnit.toMillis(this.A01)) {
                                    A13.add(A023);
                                    break;
                                }
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                        }
                    }
                    cursor.close();
                }
                Iterator it = A13.iterator();
                while (it.hasNext()) {
                    AnonymousClass206 A0Y = C17880vN.A0Y(it);
                    int A003 = A87.A00(30, System.currentTimeMillis(), A0Y.A0I);
                    Resources resources = A0E2.getResources();
                    Object[] objArr = new Object[2];
                    objArr[0] = str3;
                    C17880vN.A1T(objArr, A003, 1);
                    String string = resources.getString(2131892086, objArr);
                    C18070vi.A0X(string);
                    AnonymousClass1E7 A0G3 = this.A03.A0G(r3);
                    if (A0G3 != null) {
                        String obj = this.A0G.A0H(A0G3, A0Y).A00.toString();
                        C18070vi.A0b(A002);
                        A00(A002, A012, A0G3, A0F2, string, obj);
                    }
                }
            } catch (Throwable th) {
                Cursor cursor2 = BUp.A00;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        }
        this.A0D.A0C(r36, 9);
        ((C133946pl) this.A0I.get()).A01(r28, valueOf, A0f, "message_reminder_push_notification", this.A02, 1);
    }

    private final void A00(PendingIntent pendingIntent, PendingIntent pendingIntent2, AnonymousClass1E7 r14, String str, String str2, String str3) {
        AnonymousClass11P r1 = this.A05;
        long A012 = AnonymousClass11P.A01(r1);
        C1409673t A032 = C217217d.A03(this.A0C);
        A032.A0M = "other_notifications@1";
        A032.A03 = 1;
        A032.A0F(str);
        A032.A09(A012);
        A032.A06(2);
        String str4 = str2;
        String str5 = str3;
        C17890vO.A0m(A032, str4, str5, true);
        A032.A0A = pendingIntent;
        Notification notification = A032.A08;
        notification.deleteIntent = pendingIntent2;
        notification.icon = 2131231578;
        AnonymousClass1E7 r5 = r14;
        if (!AnonymousClass112.A02() || r14 == null) {
            C17900vP.A0L(A032, str5);
            if (r14 != null) {
                AnonymousClass70v.A00(this.A0G.A0F(r14), A032);
            }
        } else {
            AnonymousClass6WY.A00(A032, r5, this.A0G, str5, str4, A012);
        }
        C19830z4 r0 = this.A07;
        C17880vN.A1D(C19830z4.A00(r0), "inorganic_notification_last_timestamp", AnonymousClass11P.A01(r1));
        C27301Vn r2 = this.A06;
        Notification A052 = A032.A05();
        C18070vi.A0X(A052);
        r2.BkS(str4, 74, A052);
    }
}
