package X;

import android.os.Process;
import com.whatsapp.migration.transferinfra.connection.IpThread$shutdown$1;
import java.io.Closeable;

/* renamed from: X.9Bo  reason: invalid class name and case insensitive filesystem */
public abstract class C178039Bo extends C201010v {
    public Closeable A00;
    public final B8J A01;
    public final C18600wl A02;
    public final AnonymousClass1OX A03;

    public void run() {
        Process.setThreadPriority(1);
    }

    public C178039Bo(B8J b8j, C18600wl r3, AnonymousClass1OX r4) {
        super("IpThread");
        this.A01 = b8j;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void A00() {
        AnonymousClass3MX.A1Q(new IpThread$shutdown$1(this, (C30391dr) null), this.A03);
    }
}
