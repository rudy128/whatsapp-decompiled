package X;

import android.os.SystemClock;
import java.io.File;

/* renamed from: X.7QC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7QC implements Runnable {
    public final /* synthetic */ AnonymousClass74M A00;
    public final /* synthetic */ AnonymousClass72K A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public final void run() {
        long j;
        AnonymousClass74M r3 = this.A00;
        AnonymousClass72K r2 = this.A01;
        boolean z = this.A02;
        boolean z2 = this.A03;
        boolean z3 = this.A04;
        boolean z4 = this.A05;
        if (AnonymousClass72K.A00(r2).isRecording()) {
            j = (SystemClock.elapsedRealtime() - r3.A06) + r3.A05;
            r3.A05 = j;
        } else {
            j = r3.A05;
        }
        C17900vP.A0m("voicenote/stopvoicenote duration:", AnonymousClass000.A10(), j);
        AnonymousClass74M.A0G(r3, r2, j, z);
        File A032 = r2.A03();
        r3.A0g.A0J(new AnonymousClass7QV(r3, A032, (File) r2.A0E.getValue(), A032.length(), j, z, z2, z3, z4));
    }

    public /* synthetic */ AnonymousClass7QC(AnonymousClass74M r1, AnonymousClass72K r2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A05 = z4;
    }
}
