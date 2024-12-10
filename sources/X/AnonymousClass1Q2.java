package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1Q2  reason: invalid class name */
public class AnonymousClass1Q2 {
    public final Handler A00;
    public final Handler A01;
    public final Handler A02;
    public final AnonymousClass1Q1 A03;
    public final C24681Lg A04;
    public final AnonymousClass00H A05;

    public AnonymousClass1Q2(AnonymousClass1Q1 r8, AnonymousClass1CJ r9, AnonymousClass1NN r10, C24681Lg r11, C24661Le r12, AnonymousClass00H r13) {
        this.A03 = r8;
        this.A04 = r11;
        this.A05 = r13;
        this.A00 = new AnonymousClass2P7(Looper.getMainLooper(), r8, this, r11);
        this.A02 = new AnonymousClass2P7(Looper.getMainLooper(), r10, this, r11);
        Looper mainLooper = Looper.getMainLooper();
        this.A01 = new AnonymousClass1Q4(mainLooper, r8, r9, this, r11, r12);
    }

    public static void A00(AnonymousClass1Q2 r3, AnonymousClass206 r4, int i) {
        r3.A04.A02(r4, i);
        AnonymousClass1Q1 r2 = r3.A03;
        AnonymousClass1BI r1 = r4.A0v.A00;
        C17960vV.A07(r1);
        r2.A03(r1, false);
        AW0 A002 = AnonymousClass25B.A00(r4);
        if (A002 != null) {
            C17890vO.A0s((AnonymousClass2L2) r3.A05.get(), A002, 24);
        }
    }

    public void A01(AnonymousClass206 r4, int i) {
        this.A02.post(new C70863Cu(this, i, 4, r4));
    }
}
