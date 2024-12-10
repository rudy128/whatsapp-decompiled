package X;

/* renamed from: X.BeL  reason: case insensitive filesystem */
public class C23271BeL extends C23272BeM {
    public final byte[] zza;

    public final boolean equals(Object obj) {
        int A01;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if ((obj instanceof DSN) && (A01 = A01()) == ((DSN) obj).A01()) {
            if (A01 == 0) {
                return true;
            }
            if (!(obj instanceof C23271BeL)) {
                return obj.equals(this);
            }
            C23271BeL beL = (C23271BeL) obj;
            int i2 = this.zzc;
            int i3 = beL.zzc;
            if (i2 == 0 || i3 == 0 || i2 == i3) {
                if (A01 <= beL.A01()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = beL.zza;
                    int i4 = 0;
                    while (i4 < A01) {
                        if (bArr[i4] != bArr2[i]) {
                            return false;
                        }
                        i4++;
                        i++;
                    }
                    return true;
                }
                StringBuilder A10 = AnonymousClass000.A10();
                BE9.A1K(A10, A01);
                throw AnonymousClass000.A0j(A10);
            }
        }
        return false;
    }

    public C23271BeL(byte[] bArr) {
        if (bArr != null) {
            this.zza = bArr;
            return;
        }
        throw null;
    }
}
