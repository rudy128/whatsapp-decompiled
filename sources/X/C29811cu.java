package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1cu  reason: invalid class name and case insensitive filesystem */
public class C29811cu {
    public BroadcastReceiver A00;
    public C219017v A01;
    public final Handler A02;
    public final AnonymousClass195 A03;
    public final AnonymousClass118 A04;
    public final C18030ve A05;
    public final C29771cq A06;
    public final C29791cs A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass190 A0A;
    public final AnonymousClass1R8 A0B;
    public final AnonymousClass11C A0C;
    public final AnonymousClass11P A0D;

    private PendingIntent A00(String str, int i) {
        return C1408573i.A01(this.A04.A00, 0, new Intent(str).setPackage("com.whatsapp"), i);
    }

    public static void A01(C29811cu r1, int i) {
        Handler handler = r1.A02;
        handler.sendMessage(handler.obtainMessage(i, "com.whatsapp.MessageHandler.LOGOUT_ACTION"));
    }

    public static void A03(C29811cu r6, String str) {
        C17960vV.A07(r6.A01);
        if (!r6.A07.A03()) {
            A02(r6, str);
            C219017v.A01(r6.A01);
        } else if (r6.A01.A0J.A01() || r6.A03.A00) {
            Log.i("xmpp/handler/logout-timer/reset");
            if (A05(r6, str)) {
                A04(r6, str);
            }
            r6.A06.A08();
        } else {
            C18030ve r2 = r6.A05;
            C18040vf r1 = C18040vf.A02;
            if (!C18020vd.A05(r1, r2, 8924) || !((C29971dB) r6.A09.get()).A0B()) {
                C219017v r0 = r6.A01;
                C17960vV.A07(r0);
                C36281nd r22 = r0.A07;
                if (r22 != null) {
                    r22.CHR(false, 7);
                } else {
                    Log.i("MessageHandler/onDoLogout ignoring due to null sending channel");
                }
                C29971dB r12 = (C29971dB) r6.A09.get();
                if (!r12.A07 && C29971dB.A03(r12, "xmpp-bg-to-logout")) {
                    r12.A07 = true;
                }
                A01(r6, 3);
                return;
            }
            r6.A02.postDelayed(new AnonymousClass7RS(35, str, r6), ((long) C18020vd.A00(r1, r2, 3532)) * 1000);
        }
    }

    public static boolean A05(C29811cu r1, String str) {
        PendingIntent A002 = r1.A00(str, 536870912);
        boolean z = false;
        if (A002 != null) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("xmpp/handler/logout-timer/has=");
        sb.append(z);
        Log.i(sb.toString());
        return z;
    }

    public C29811cu(AnonymousClass195 r4, AnonymousClass190 r5, AnonymousClass1R8 r6, AnonymousClass11C r7, AnonymousClass11P r8, AnonymousClass118 r9, C18030ve r10, C29771cq r11, C29791cs r12, C25151Nc r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        this.A0D = r8;
        this.A05 = r10;
        this.A0B = r6;
        this.A0A = r5;
        this.A04 = r9;
        this.A0C = r7;
        this.A06 = r11;
        this.A07 = r12;
        this.A08 = r14;
        this.A09 = r15;
        this.A03 = r4;
        this.A02 = new Handler(r13.A00(), new C29821cv(this));
    }

    public static void A02(C29811cu r2, String str) {
        Log.i("xmpp/handler/logout-timer/cancel");
        try {
            PendingIntent A002 = r2.A00(str, 536870912);
            if (A002 != null) {
                AlarmManager A052 = r2.A0C.A05();
                if (A052 != null) {
                    A052.cancel(A002);
                } else {
                    Log.w("MessageHandler/cancelLogoutTimer AlarmManager is null");
                }
                A002.cancel();
            }
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                r2.A0A.A0G("messagehandler/deadOS", (String) null, false);
                return;
            }
            throw e;
        }
    }

    public static void A04(C29811cu r8, String str) {
        Log.i("xmpp/handler/logout-timer/start");
        synchronized (r8) {
            if (r8.A00 == null) {
                r8.A00 = new AnonymousClass2DQ(r8, 2);
                ((C29831cw) r8.A08.get()).A00(r8.A04.A00, r8.A00, new IntentFilter("com.whatsapp.MessageHandler.LOGOUT_ACTION"), C19620yd.A0B, r8.A02, false);
            }
        }
        PendingIntent A002 = r8.A00(str, 134217728);
        C17960vV.A07(A002);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C18030ve r4 = r8.A05;
        if (!r8.A0B.A00(A002, 2, elapsedRealtime + (((long) C18020vd.A00(C18040vf.A02, r4, 431)) * 60 * 1000))) {
            Log.w("MessageHandler/startLogoutTimer AlarmManager is null");
        }
    }
}
