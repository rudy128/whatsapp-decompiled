package X;

import java.io.Serializable;

/* renamed from: X.Bfj  reason: case insensitive filesystem */
public final class C23357Bfj extends C25755ClQ implements Serializable {
    public final byte[] zza;

    public final byte[] A00() {
        return (byte[]) this.zza.clone();
    }

    public C23357Bfj(byte[] bArr) {
        if (bArr != null) {
            this.zza = bArr;
            return;
        }
        throw null;
    }
}
