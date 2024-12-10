package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2rE  reason: invalid class name and case insensitive filesystem */
public class C62332rE {
    public final Handler A00;
    public final C188099gs A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C23651Hc A04;
    public final AnonymousClass11C A05;
    public final AnonymousClass118 A06;
    public final AnonymousClass1LD A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;

    public static void A00(C62332rE r7, boolean z) {
        Context context = r7.A06.A00;
        AnonymousClass1LD r3 = r7.A07;
        AnonymousClass11C r1 = r7.A05;
        C17960vV.A02();
        if (r3.A01()) {
            boolean A002 = C30841eb.A00(r1);
            C17900vP.A0n("ScreenLockReceiver manual check; locked=", AnonymousClass000.A10(), A002);
            r3.A00(A002);
        }
        AnonymousClass00H r5 = r7.A03;
        if (((C30881ef) r5.get()).A00 != 1) {
            if (((C30881ef) r5.get()).A00 == 2) {
                r7.A00.removeMessages(2);
                ((C30881ef) r5.get()).A00 = 1;
            } else if (z) {
                ((C30881ef) r5.get()).A00 = 1;
                C23651Hc r4 = r7.A04;
                if (r4.A05 != 1) {
                    C188099gs r32 = r7.A01;
                    r32.A05.execute(new C21448AkF(r32, 31));
                }
                if (!r4.A02()) {
                    C17890vO.A0u(new AnonymousClass2PP(context, r4, (C219017v) r7.A09.get()), r7.A08);
                }
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("presencestatemanager/setAvailable/new-state: ");
        A10.append(r5.get());
        C17900vP.A0n(" setIfUnavailable:", A10, z);
    }

    public void A01() {
        this.A00.removeMessages(2);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("presencestatemanager/setUnavailable previous-state: ");
        AnonymousClass00H r1 = this.A03;
        C17900vP.A0b(r1.get(), A10);
        ((C30881ef) r1.get()).A00 = 3;
    }

    public void A02() {
        AnonymousClass00H r4 = this.A03;
        if (((C30881ef) r4.get()).A00 == 1) {
            ((C30881ef) r4.get()).A00 = 2;
            this.A00.sendEmptyMessageDelayed(2, 15000);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("presencestatemanager/startTransitionToUnavailable/new-state ");
        C17900vP.A0b(r4.get(), A10);
    }

    public C62332rE(C23651Hc r4, AnonymousClass11C r5, AnonymousClass118 r6, C188099gs r7, AnonymousClass1LD r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        Boolean bool = C17960vV.A01;
        this.A06 = r6;
        this.A08 = r9;
        this.A05 = r5;
        this.A03 = r10;
        this.A04 = r4;
        this.A01 = r7;
        this.A09 = r11;
        this.A07 = r8;
        this.A02 = r12;
        this.A00 = new Handler(Looper.getMainLooper(), new C64292uX(this, r8));
    }
}
