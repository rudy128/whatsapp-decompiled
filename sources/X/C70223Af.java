package X;

import android.util.Pair;
import java.io.File;

/* renamed from: X.3Af  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70223Af implements AnonymousClass1TI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Pair A02;
    public final /* synthetic */ AnonymousClass3M0 A03;
    public final /* synthetic */ AnonymousClass1T6 A04;
    public final /* synthetic */ AnonymousClass34A A05;
    public final /* synthetic */ C62492rU A06;
    public final /* synthetic */ C49572Qz A07;
    public final /* synthetic */ File A08;
    public final /* synthetic */ String A09;

    public final void accept(Object obj) {
        AnonymousClass1T6 r12 = this.A04;
        AnonymousClass34A r2 = this.A05;
        C62492rU r10 = this.A06;
        AnonymousClass3M0 r9 = this.A03;
        String str = this.A09;
        int i = this.A00;
        File file = this.A08;
        Pair pair = this.A02;
        C49572Qz r4 = this.A07;
        long j = this.A01;
        C55612g5 r15 = (C55612g5) obj;
        AnonymousClass18K r3 = r12.A03;
        C56202h4 r13 = r2.A00;
        C1408173e r14 = r2.A01;
        int i2 = r15.A00;
        r3.CC7(r12.A0E(r13, r14, r15, i2, 1, 0).A00);
        C196299un r11 = r15.A02;
        C61382pa A002 = r11.A00();
        if (i2 != 0 || ((r10.A02.A0E && A002 == null) || r11.A03() == null || AnonymousClass1T6.A02(r12, file, r11.A03(), r11.A05()) == null)) {
            r9.CJU(str, i);
        } else {
            r9.CJW(AnonymousClass1T6.A01(pair, r15, r4, j), str, i);
        }
    }

    public /* synthetic */ C70223Af(Pair pair, AnonymousClass3M0 r2, AnonymousClass1T6 r3, AnonymousClass34A r4, C62492rU r5, C49572Qz r6, File file, String str, int i, long j) {
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A03 = r2;
        this.A09 = str;
        this.A00 = i;
        this.A08 = file;
        this.A02 = pair;
        this.A07 = r6;
        this.A01 = j;
    }
}
