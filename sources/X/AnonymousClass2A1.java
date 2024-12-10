package X;

import com.facebook.msys.mci.NetworkSession;

/* renamed from: X.2A1  reason: invalid class name */
public class AnonymousClass2A1 extends C70553Bn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NetworkSession A02;
    public final /* synthetic */ C23081El A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ byte[] A05;

    public void run() {
        this.A02.updateDataTaskUploadProgress(this.A04, (long) this.A00, (long) this.A01, (long) this.A05.length);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2A1(NetworkSession networkSession, C23081El r3, String str, byte[] bArr, int i, int i2) {
        super("updateDataTaskUploadProgress");
        this.A03 = r3;
        this.A02 = networkSession;
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = bArr;
    }
}
