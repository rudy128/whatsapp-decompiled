package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.1an  reason: invalid class name and case insensitive filesystem */
public class C28721an {
    public C70313Ao A00;
    public Runnable A01;
    public Handler A02;
    public final AnonymousClass11S A03;
    public final C25161Nd A04;
    public final AnonymousClass11C A05;
    public final AnonymousClass118 A06;
    public final AnonymousClass1CJ A07;
    public final AnonymousClass1R3 A08;
    public final C28601ab A09;
    public final AnonymousClass1Nb A0A;
    public final C200710s A0B;
    public final AnonymousClass10I A0C;

    public synchronized Handler A00() {
        Handler handler;
        handler = this.A02;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("update_widget", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A02 = handler;
        }
        return handler;
    }

    public void A01() {
        C200710s r2 = this.A0B;
        r2.A03();
        r2.execute(new C70613Bu(this, 41));
    }

    public C28721an(AnonymousClass11S r3, C25161Nd r4, AnonymousClass11C r5, AnonymousClass118 r6, AnonymousClass1CJ r7, AnonymousClass1R3 r8, C28601ab r9, AnonymousClass1Nb r10, AnonymousClass10I r11) {
        this.A06 = r6;
        this.A03 = r3;
        this.A0C = r11;
        this.A07 = r7;
        this.A05 = r5;
        this.A09 = r9;
        this.A08 = r8;
        this.A0A = r10;
        this.A04 = r4;
        this.A0B = new C200710s(r11, false);
    }
}
