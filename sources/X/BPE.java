package X;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

public final class BPE extends C26688D9l implements E9Q {
    public int A00;
    public C26115Csd A01;
    public byte[] A02;

    public BPE() {
        super(false);
    }

    public Uri Bb3() {
        C26115Csd csd = this.A01;
        if (csd != null) {
            return csd.A04;
        }
        return null;
    }

    public void close() {
        if (this.A02 != null) {
            this.A02 = null;
            A01();
        }
        this.A01 = null;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.A02;
        int length = bArr2.length;
        int i3 = this.A00;
        int i4 = length - i3;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i2, i4);
        System.arraycopy(bArr2, i3, bArr, i, min);
        this.A00 += min;
        A03(min);
        return min;
    }

    public long CAj(C26115Csd csd) {
        A02();
        this.A01 = csd;
        Uri uri = csd.A04;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] split = uri.getSchemeSpecificPart().split(",");
            if (split.length <= 2) {
                String str = split[1];
                if (split[0].contains(";base64")) {
                    try {
                        this.A02 = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        throw new C24215BxS(AnonymousClass001.A1H("Error while parsing Base64 encoded string: ", str, AnonymousClass000.A10()), e);
                    }
                } else {
                    this.A02 = URLDecoder.decode(str, "US-ASCII").getBytes();
                }
                A04(csd);
                return (long) this.A02.length;
            }
            throw C24215BxS.A00(AnonymousClass001.A1E(uri, "Unexpected URI format: ", AnonymousClass000.A10()));
        }
        throw C24215BxS.A00(AnonymousClass001.A1H("Unsupported scheme: ", scheme, AnonymousClass000.A10()));
    }
}
