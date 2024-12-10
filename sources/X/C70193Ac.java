package X;

import android.util.Pair;
import java.io.File;

/* renamed from: X.3Ac  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70193Ac implements AnonymousClass1TI {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Pair A01;
    public final /* synthetic */ C57102iX A02;
    public final /* synthetic */ AnonymousClass1T6 A03;
    public final /* synthetic */ AnonymousClass34A A04;
    public final /* synthetic */ C62492rU A05;
    public final /* synthetic */ File A06;

    public final void accept(Object obj) {
        AnonymousClass1T6 r8 = this.A03;
        AnonymousClass34A r4 = this.A04;
        C62492rU r2 = this.A05;
        C57102iX r3 = this.A02;
        File file = this.A06;
        Pair pair = this.A01;
        long j = this.A00;
        C55612g5 r11 = (C55612g5) obj;
        AnonymousClass18K r7 = r8.A03;
        C56202h4 r9 = r4.A00;
        C1408173e r10 = r4.A01;
        int i = r11.A00;
        r7.CC7(r8.A0E(r9, r10, r11, i, 1, 0).A00);
        C196299un r72 = r11.A02;
        C61382pa A002 = r72.A00();
        if (i != 0 || ((r2.A02.A0E && A002 == null) || r72.A03() == null || AnonymousClass1T6.A02(r8, file, r72.A03(), r72.A05()) == null)) {
            r3.A00();
            return;
        }
        C693536w A012 = AnonymousClass1T6.A01(pair, r11, C49572Qz.WEB_THUMBNAIL, j);
        C33251iW r42 = r3.A00;
        r42.A03.A0J(new C21455AkM(r42, r3.A01, A012, 3));
    }

    public /* synthetic */ C70193Ac(Pair pair, C57102iX r2, AnonymousClass1T6 r3, AnonymousClass34A r4, C62492rU r5, File file, long j) {
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = r2;
        this.A06 = file;
        this.A01 = pair;
        this.A00 = j;
    }
}
