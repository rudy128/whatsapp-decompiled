package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.8fM  reason: invalid class name and case insensitive filesystem */
public class C167078fM extends C195879u4 {
    public final Context A00;
    public final AnonymousClass195 A01;
    public final C218617r A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1NP A04;
    public final C27411Vz A05;
    public final AnonymousClass1NM A06;
    public final AnonymousClass11C A07;
    public final A1Q A08;
    public final AnonymousClass1Cd A09;
    public final AnonymousClass1DN A0A;
    public final C18030ve A0B;
    public final AnonymousClass18K A0C;
    public final AnonymousClass10I A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final C61452pi A0H;
    public final AnonymousClass1R8 A0I;
    public final AnonymousClass11P A0J;
    public final C19830z4 A0K;

    public static void A00(C167078fM r6) {
        if (r6.A03.A0N()) {
            Log.i("BackupMessagesAction/setupBackupMessagesAlarmIfNeeded skipping due to companion mode");
            return;
        }
        Calendar instance = Calendar.getInstance();
        if (instance.get(11) >= 2) {
            instance.add(5, 1);
        }
        AnonymousClass8BV.A1Q(instance, 14, 0);
        instance.set(12, 0);
        instance.set(11, 2);
        long timeInMillis = instance.getTimeInMillis() + C61452pi.A00(r6.A0H, 6225, 6226);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BackupMessagesAction/setupBackupMessagesAlarmIfNeeded; alarmTimeMillis=");
        C17900vP.A0b(new Date(timeInMillis), A10);
        if (!r6.A0I.A00(super.A03("com.whatsapp.action.BACKUP_MESSAGES", 134217728), 0, timeInMillis)) {
            Log.w("BackupMessagesAction/setupBackupMessagesAlarmIfNeeded AlarmManager is null");
        }
    }

    public C167078fM(Context context, AnonymousClass195 r3, C218617r r4, AnonymousClass11S r5, C61452pi r6, AnonymousClass1NP r7, C27411Vz r8, AnonymousClass1R8 r9, AnonymousClass1NM r10, AnonymousClass11C r11, AnonymousClass11P r12, C19830z4 r13, A1Q a1q, AnonymousClass1Cd r15, AnonymousClass1DN r16, C18030ve r17, AnonymousClass18K r18, AnonymousClass10I r19, AnonymousClass00H r20, AnonymousClass00H r21, AnonymousClass00H r22) {
        super(context);
        this.A00 = context;
        this.A0J = r12;
        this.A0B = r17;
        this.A0I = r9;
        this.A03 = r5;
        this.A0D = r19;
        this.A02 = r4;
        this.A0C = r18;
        this.A0F = r20;
        this.A07 = r11;
        this.A0H = r6;
        this.A06 = r10;
        this.A0G = r21;
        this.A08 = a1q;
        this.A09 = r15;
        this.A0K = r13;
        this.A05 = r8;
        this.A04 = r7;
        this.A0A = r16;
        this.A01 = r3;
        this.A0E = r22;
    }
}
