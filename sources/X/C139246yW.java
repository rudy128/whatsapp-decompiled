package X;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.6yW  reason: invalid class name and case insensitive filesystem */
public class C139246yW {
    public final C218617r A00;
    public final AnonymousClass121 A01;
    public final C24681Lg A02;
    public final Map A03 = C17880vN.A11();
    public final AnonymousClass190 A04;
    public final AnonymousClass1KB A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass10I A07;

    public static void A00(C139246yW r2, AnonymousClass21V r3, Throwable th) {
        r2.A03.remove(r3);
        AnonymousClass206.A00(r3).A0f = false;
        r2.A02.A02(r3, -1);
        if (th instanceof FileNotFoundException) {
            AnonymousClass1KB r22 = r2.A05;
            int i = 2131891448;
            if (r3.A0w()) {
                i = 2131892887;
            }
            r22.A06(i, 1);
        }
    }

    public void A01(AnonymousClass21V r12) {
        int i = r12.A0u;
        long A09 = this.A06.A09(r12.A0I);
        String str = r12.A05;
        if (str == null) {
            this.A05.CGP(new C146807Qr(this, r12, 45));
            return;
        }
        AnonymousClass190 r5 = this.A04;
        AnonymousClass10I r6 = this.A07;
        int i2 = r12.A09;
        ArrayList A0z = C17880vN.A0z(3);
        C218617r r1 = this.A00;
        A0z.add(r1.A0K(i, i2, 2));
        A0z.add(r1.A0K(i, i2, 1));
        A0z.add(r1.A0K(i, i2, 3));
        C115275tg r4 = new C115275tg(r5, r6, str, A0z, A09);
        this.A03.put(r12, r4);
        C62572rc A002 = AnonymousClass206.A00(r12);
        A002.A0f = true;
        A002.A0C = 0;
        this.A02.A02(r12, -1);
        C145937Ne r13 = new C145937Ne(r12, this, 19);
        Executor executor = this.A05.A05;
        r4.A0A(r13, executor);
        r4.A00.A03(new C145937Ne(r12, this, 20), executor);
        if (C22781De.A03()) {
            r6.CGF(r4);
            return;
        }
        try {
            r4.A0E();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public C139246yW(AnonymousClass190 r2, C218617r r3, AnonymousClass1KB r4, AnonymousClass11P r5, AnonymousClass121 r6, C24681Lg r7, AnonymousClass10I r8) {
        this.A06 = r5;
        this.A05 = r4;
        this.A04 = r2;
        this.A07 = r8;
        this.A00 = r3;
        this.A01 = r6;
        this.A02 = r7;
    }
}
