package X;

import java.util.TimerTask;

/* renamed from: X.Amr  reason: case insensitive filesystem */
public class C21602Amr extends TimerTask {
    public final /* synthetic */ C177959Bg A00;

    public C21602Amr(C177959Bg r1) {
        this.A00 = r1;
    }

    public void run() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/not-finished-in-");
        C177959Bg r2 = this.A00;
        A10.append(C17880vN.A04(r2.A06.A01()));
        C17890vO.A1A(A10, "-seconds");
        C21457AkO.A00(r2.A00, this, 19);
    }
}
