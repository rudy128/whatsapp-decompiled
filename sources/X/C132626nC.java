package X;

import java.io.File;

/* renamed from: X.6nC  reason: invalid class name and case insensitive filesystem */
public final class C132626nC {
    public final File A00;
    public final byte[] A01;
    public final long A02;
    public final long A03;

    public C132626nC(File file, byte[] bArr, long j, long j2) {
        this.A00 = file;
        this.A02 = j;
        this.A03 = j2;
        this.A01 = bArr;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DownloadResult{fileSize=");
        A10.append(this.A02);
        A10.append(", roundTripTime=");
        A10.append(this.A03);
        return C17890vO.A0b(A10);
    }
}
