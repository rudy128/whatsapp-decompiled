package X;

import android.media.MediaCrypto;
import java.util.UUID;

public final class CP9 {
    public final MediaCrypto A00;
    public final UUID A01;
    public final byte[] A02;

    public CP9(MediaCrypto mediaCrypto, UUID uuid, byte[] bArr) {
        this.A00 = mediaCrypto;
        this.A01 = uuid;
        this.A02 = bArr;
    }
}
