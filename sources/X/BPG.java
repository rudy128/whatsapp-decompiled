package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public final class BPG extends C26688D9l implements E9Q {
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;

    public BPG(Context context) {
        super(false);
        this.A04 = context.getAssets();
    }

    public void close() {
        this.A01 = null;
        try {
            InputStream inputStream = this.A02;
            if (inputStream != null) {
                inputStream.close();
            }
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A01();
            }
        } catch (IOException e) {
            throw new C24184Bwu(e);
        } catch (Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A01();
            }
            throw th;
        }
    }

    public Uri Bb3() {
        return this.A01;
    }

    public long CAj(C26115Csd csd) {
        try {
            Uri uri = csd.A04;
            this.A01 = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            A02();
            InputStream open = this.A04.open(path, 1);
            this.A02 = open;
            long j = csd.A03;
            if (open.skip(j) >= j) {
                long j2 = csd.A02;
                if (j2 != -1) {
                    this.A00 = j2;
                } else {
                    long available = (long) this.A02.available();
                    this.A00 = available;
                    if (available == 2147483647L) {
                        this.A00 = -1;
                    }
                }
                this.A03 = true;
                A04(csd);
                return this.A00;
            }
            throw BE6.A0i();
        } catch (IOException e) {
            throw new C24184Bwu(e);
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, (long) i2);
                } catch (IOException e) {
                    throw new C24184Bwu(e);
                }
            }
            int read = this.A02.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.A00;
                if (j2 != -1) {
                    this.A00 = j2 - ((long) read);
                }
                A03(read);
                return read;
            } else if (this.A00 != -1) {
                throw new C24184Bwu(BE6.A0i());
            }
        }
        return -1;
    }
}
