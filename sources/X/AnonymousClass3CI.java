package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderMessageAlarmBroadcastReceiver;

/* renamed from: X.3CI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CI implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ ScheduledReminderMessageAlarmBroadcastReceiver A03;
    public final /* synthetic */ AnonymousClass1BI A04;
    public final /* synthetic */ AnonymousClass205 A05;

    public final void run() {
        String str;
        String str2;
        PendingIntent A002;
        String str3;
        ScheduledReminderMessageAlarmBroadcastReceiver scheduledReminderMessageAlarmBroadcastReceiver = this.A03;
        AnonymousClass205 r8 = this.A05;
        Context context = this.A02;
        AnonymousClass1BI r11 = this.A04;
        long j = this.A00;
        long j2 = this.A01;
        AnonymousClass00H r7 = scheduledReminderMessageAlarmBroadcastReceiver.A0A;
        if (r7 != null) {
            AnonymousClass206 A012 = AnonymousClass1W2.A01(r8, r7);
            if (A012 != null) {
                AnonymousClass00H r72 = scheduledReminderMessageAlarmBroadcastReceiver.A0C;
                if (r72 != null) {
                    ((C56802i3) r72.get()).A00(A012, "cta_cancel_reminder", "cta_reminder");
                    AnonymousClass00H r73 = scheduledReminderMessageAlarmBroadcastReceiver.A0B;
                    if (r73 != null) {
                        C20083A6j A013 = ((C42341y1) r73.get()).A01((AnonymousClass21K) A012);
                        if (A013 != null) {
                            str2 = A013.A0E(context);
                        } else {
                            str2 = null;
                        }
                        AnonymousClass10I r82 = scheduledReminderMessageAlarmBroadcastReceiver.A09;
                        if (r82 != null) {
                            r82.CGF(new C21456AkN(r11, scheduledReminderMessageAlarmBroadcastReceiver, A012, str2, 26));
                            AnonymousClass00H r74 = scheduledReminderMessageAlarmBroadcastReceiver.A0D;
                            if (r74 != null) {
                                ((C58272kQ) r74.get()).A01(A012.A0x);
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append("ScheduledReminderMessageAlarmBroadcastReceiver/onReceive current time is ");
                                C18000vb r75 = scheduledReminderMessageAlarmBroadcastReceiver.A04;
                                if (r75 != null) {
                                    A10.append(A8I.A00(r75, j));
                                    A10.append(", scheduled time is ");
                                    C18000vb r76 = scheduledReminderMessageAlarmBroadcastReceiver.A04;
                                    if (r76 != null) {
                                        A10.append(A8I.A00(r76, j2));
                                        A10.append(" time diff ms is ");
                                        C17890vO.A16(A10, j - j2);
                                        AnonymousClass1M9 r2 = scheduledReminderMessageAlarmBroadcastReceiver.A00;
                                        if (r2 != null) {
                                            C27301Vn r13 = scheduledReminderMessageAlarmBroadcastReceiver.A03;
                                            if (r13 != null) {
                                                AnonymousClass11P r14 = scheduledReminderMessageAlarmBroadcastReceiver.A02;
                                                if (r14 != null) {
                                                    C18000vb r12 = scheduledReminderMessageAlarmBroadcastReceiver.A04;
                                                    if (r12 != null) {
                                                        AnonymousClass1PM r3 = scheduledReminderMessageAlarmBroadcastReceiver.A01;
                                                        if (r3 != null) {
                                                            if (r11 == null) {
                                                                Intent A022 = AnonymousClass1LU.A02(context);
                                                                A022.putExtra("fromNotification", true);
                                                                A002 = C1408573i.A00(context, 1, A022, 0);
                                                            } else {
                                                                Uri A003 = C62952sG.A00(r2.A0H(r11));
                                                                String str4 = AnonymousClass2WR.A00;
                                                                Intent A0C = AnonymousClass1LU.A0C(context, 0);
                                                                A0C.setData(A003);
                                                                A0C.setAction(str4);
                                                                A0C.addFlags(335544320);
                                                                A002 = C1408573i.A00(context, 2, A0C.putExtra("fromNotification", true), 0);
                                                            }
                                                            C18070vi.A0X(A002);
                                                            new C1409673t(context, "critical_app_alerts@1");
                                                            C1409673t r77 = new C1409673t(context, "critical_app_alerts@1");
                                                            r77.A0E(context.getString(2131892400));
                                                            C42741yf A014 = r3.A01(A012.A0I());
                                                            if ((A014 == null || (str3 = A014.A08) == null) && (r11 == null || (str3 = r2.A0H(r11).A0K()) == null)) {
                                                                str3 = "";
                                                            }
                                                            Object[] objArr = new Object[3];
                                                            objArr[0] = str3;
                                                            objArr[1] = C64052u8.A01(r14, r12, AnonymousClass00R.A01, A012.A0I);
                                                            String A0q = C17880vN.A0q(context, A8I.A00(r12, A012.A0I), objArr, 2, 2131892399);
                                                            C18070vi.A0X(A0q);
                                                            SpannableString spannableString = new SpannableString(A0q);
                                                            spannableString.setSpan(new StyleSpan(1), AnonymousClass1YF.A0F(A0q, str3, 0, false), AnonymousClass1YF.A0F(A0q, str3, 0, false) + str3.length(), 33);
                                                            r77.A0D(spannableString);
                                                            r77.A03 = 1;
                                                            C17880vN.A1G(r77);
                                                            r77.A0A = A002;
                                                            Notification A052 = r77.A05();
                                                            C18070vi.A0X(A052);
                                                            r13.BkR(77, A052);
                                                            return;
                                                        }
                                                        str = "verifiedNameManager";
                                                    }
                                                } else {
                                                    str = "time";
                                                }
                                            } else {
                                                str = "waNotificationManager";
                                            }
                                        } else {
                                            str = "contactManager";
                                        }
                                    }
                                }
                                str = "whatsAppLocale";
                            } else {
                                str = "scheduledReminderMessageStore";
                            }
                        } else {
                            str = "waWorkers";
                        }
                    } else {
                        str = "interactiveMessageCustomizerFactory";
                    }
                } else {
                    str = "reminderUtils";
                }
            } else {
                return;
            }
        } else {
            str = "fMessageDatabase";
        }
        C18070vi.A11(str);
        throw null;
    }

    public /* synthetic */ AnonymousClass3CI(Context context, ScheduledReminderMessageAlarmBroadcastReceiver scheduledReminderMessageAlarmBroadcastReceiver, AnonymousClass1BI r3, AnonymousClass205 r4, long j, long j2) {
        this.A03 = scheduledReminderMessageAlarmBroadcastReceiver;
        this.A05 = r4;
        this.A02 = context;
        this.A04 = r3;
        this.A00 = j;
        this.A01 = j2;
    }
}
