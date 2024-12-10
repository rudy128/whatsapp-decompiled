package X;

import java.io.File;
import java.nio.charset.Charset;

/* renamed from: X.9oq  reason: invalid class name and case insensitive filesystem */
public final class C192709oq {
    public long A00;
    public C192399oK A01;
    public boolean A02;
    public final String A03;
    public final long[] A04;
    public final /* synthetic */ AiK A05;

    public File A00() {
        AiK aiK = this.A05;
        Charset charset = AiK.A0E;
        File file = aiK.A06;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A03);
        return C17880vN.A0e(file, AnonymousClass001.A1I(".", A10, 0));
    }

    public File A01() {
        AiK aiK = this.A05;
        Charset charset = AiK.A0E;
        File file = aiK.A06;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A03);
        A10.append(".");
        A10.append(0);
        return AnonymousClass8BW.A0X(file, ".tmp", A10);
    }

    public C192709oq(AiK aiK, String str) {
        this.A05 = aiK;
        this.A03 = str;
        Charset charset = AiK.A0E;
        this.A04 = new long[aiK.A04];
    }
}
