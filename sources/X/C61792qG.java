package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Trace;
import java.lang.reflect.Method;

/* renamed from: X.2qG  reason: invalid class name and case insensitive filesystem */
public class C61792qG {
    public final Context A00;
    public final C31091f0 A01;
    public final AnonymousClass194 A02;
    public final C26271Rm A03;
    public final AnonymousClass8CA A04;
    public final AnonymousClass1LQ A05;
    public final AnonymousClass1M9 A06;
    public final C24921Me A07;
    public final AnonymousClass11C A08;
    public final C27301Vn A09;
    public final AnonymousClass12L A0A;
    public final C33451iq A0B;
    public final AnonymousClass1LD A0C;
    public final AnonymousClass269 A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final C62332rE A0G;
    public final AnonymousClass10I A0H;

    public C61792qG(Context context, C31091f0 r3, AnonymousClass194 r4, C26271Rm r5, AnonymousClass8CA r6, AnonymousClass1LQ r7, AnonymousClass1M9 r8, C24921Me r9, AnonymousClass11C r10, C27301Vn r11, AnonymousClass12L r12, C62332rE r13, C33451iq r14, AnonymousClass1LD r15, AnonymousClass10I r16, AnonymousClass269 r17, AnonymousClass00H r18, AnonymousClass00H r19) {
        this.A00 = context;
        this.A0A = r12;
        this.A0H = r16;
        this.A02 = r4;
        this.A06 = r8;
        this.A08 = r10;
        this.A07 = r9;
        this.A04 = r6;
        this.A0E = r18;
        this.A0G = r13;
        this.A0B = r14;
        this.A05 = r7;
        this.A0F = r19;
        this.A09 = r11;
        this.A0C = r15;
        this.A01 = r3;
        this.A03 = r5;
        this.A0D = r17;
    }

    public static void A00(Context context) {
        Boolean bool;
        AnonymousClass10G r0 = ((AnonymousClass10E) C17890vO.A0H(context)).Ao8.A00;
        AnonymousClass10E r1 = r0.AJU;
        Context A002 = C000500i.A00(r1.Ao9);
        AnonymousClass12L r17 = (AnonymousClass12L) r1.A90.get();
        AnonymousClass00H A003 = C000200d.A00(r1.A62);
        AnonymousClass00H A004 = C000200d.A00(r1.A9c);
        AnonymousClass10E r02 = r0.AJU;
        AnonymousClass00H A005 = C000200d.A00(r02.A6X);
        C26271Rm r21 = (C26271Rm) r1.A0I.get();
        AnonymousClass8CA r22 = (AnonymousClass8CA) r0.A0L.get();
        AnonymousClass1LQ r23 = (AnonymousClass1LQ) r0.A0y.get();
        C61792qG r172 = new C61792qG(A002, (C31091f0) r1.A0P.get(), (AnonymousClass194) r1.A9Z.get(), r21, r22, r23, (AnonymousClass1M9) r1.A2f.get(), (C24921Me) r1.ABX.get(), (AnonymousClass11C) r1.AAp.get(), (C27301Vn) r1.A9A.get(), r17, (C62332rE) r1.A70.get(), (C33451iq) r1.ABJ.get(), (AnonymousClass1LD) r1.A9j.get(), (AnonymousClass10I) r1.AC1.get(), new AnonymousClass269((C29831cw) r02.A9c.get(), A005), A003, A004);
        Method method = AnonymousClass1CH.A03;
        Trace.beginSection("AppAsyncInit/BroadcastReceiver");
        new C146437Pc(r172.A05, 28).run();
        Context context2 = r172.A00;
        AnonymousClass11C r7 = r172.A08;
        AnonymousClass11A A0d = C17880vN.A0d(r172.A0E);
        AnonymousClass00H r6 = r172.A0F;
        AnonymousClass1LD r4 = r172.A0C;
        AnonymousClass12L r8 = r172.A0A;
        C30841eb r12 = C30841eb.A08;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        ((C29831cw) r6.get()).A01(context2, C30841eb.A08, intentFilter, true);
        if (C18020vd.A05(C18040vf.A02, r8.A00, 11755)) {
            bool = Boolean.valueOf(C30841eb.A00(r7));
        } else {
            bool = null;
        }
        A0d.CGP(new AnonymousClass3C5(bool, r4, r7, 39));
        new C21424Ajr(r172.A04, 16).run();
        AnonymousClass269 r11 = r172.A0D;
        r11.A00.A00(context2, r11, new IntentFilter("com.whatsapp.alarm.WEB_RENOTIFY"), C19620yd.A0B, (Handler) null, false);
        ((C29831cw) r6.get()).A01(context2, new C109305dA(r172, 4), new IntentFilter("android.intent.action.TIME_SET"), true);
        ((C29831cw) r6.get()).A01(context2, new AnonymousClass265(r172, 1), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"), true);
        ((C29831cw) r6.get()).A01(context2, new AnonymousClass265(r172, 2), new IntentFilter("android.intent.action.LOCALE_CHANGED"), true);
        AnonymousClass1M9 r42 = r172.A06;
        ((C29831cw) r42.A0N.get()).A01(context2, new C109305dA(r42, 0), new IntentFilter("android.intent.action.LOCALE_CHANGED"), true);
        C26271Rm r43 = r172.A03;
        if (!r43.A01.A0N()) {
            ((C29831cw) r43.A09.get()).A01(context2, new C161128Bv(r43, 2), new IntentFilter("android.intent.action.LOCALE_CHANGED"), true);
        }
        C31091f0 r44 = r172.A01;
        try {
            r44.A02.A01(context2, r44.A00, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), true);
        } catch (Exception e) {
            r44.A01.A0E("AudioBecomingNoisyMonitor", e.getMessage(), e);
        }
        Trace.endSection();
    }
}
