package X;

import java.io.BufferedInputStream;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HttpsURLConnection;

public final /* synthetic */ class AQ8 implements AnonymousClass11J {
    public final /* synthetic */ AnonymousClass10I A00;
    public final /* synthetic */ BufferedInputStream A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ AtomicBoolean A03;
    public final /* synthetic */ HttpsURLConnection A04;

    public final void Bps(C59732mn r9) {
        AnonymousClass10I r1 = this.A00;
        File file = this.A02;
        AtomicBoolean atomicBoolean = this.A03;
        HttpsURLConnection httpsURLConnection = this.A04;
        BufferedInputStream bufferedInputStream = this.A01;
        AnonymousClass00H r0 = C20134A8u.A00;
        r1.CGF(new C21368Aix(file, httpsURLConnection, atomicBoolean, bufferedInputStream, 34));
    }

    public /* synthetic */ AQ8(AnonymousClass10I r1, BufferedInputStream bufferedInputStream, File file, AtomicBoolean atomicBoolean, HttpsURLConnection httpsURLConnection) {
        this.A00 = r1;
        this.A02 = file;
        this.A03 = atomicBoolean;
        this.A04 = httpsURLConnection;
        this.A01 = bufferedInputStream;
    }
}
