package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.01W  reason: invalid class name */
public class AnonymousClass01W implements Runnable {
    public final /* synthetic */ AnonymousClass01V A00;

    public AnonymousClass01W(AnonymousClass01V r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass01V r2 = this.A00;
        if ((r2.A01 & 1) != 0) {
            r2.A0u(0);
        }
        if ((r2.A01 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            r2.A0u(AnonymousClass74N.A03);
        }
        r2.A0M = false;
        r2.A01 = 0;
    }
}
