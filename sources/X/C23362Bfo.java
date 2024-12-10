package X;

/* renamed from: X.Bfo  reason: case insensitive filesystem */
public class C23362Bfo extends C23363Bfp {
    public final byte[] zza;

    public final boolean equals(Object obj) {
        int A03;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof DSS) && (A03 = A03()) == ((DSS) obj).A03()) {
            if (A03 == 0) {
                return true;
            }
            if (!(obj instanceof C23362Bfo)) {
                return obj.equals(this);
            }
            C23362Bfo bfo = (C23362Bfo) obj;
            int i3 = this.zzc;
            int i4 = bfo.zzc;
            if (i3 == 0 || i4 == 0 || i3 == i4) {
                if (A03 <= bfo.A03()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = bfo.zza;
                    if (this instanceof C23361Bfn) {
                        i = ((C23361Bfn) this).zzc;
                    } else {
                        i = 0;
                    }
                    int i5 = i + A03;
                    if (bfo instanceof C23361Bfn) {
                        i2 = ((C23361Bfn) bfo).zzc;
                    } else {
                        i2 = 0;
                    }
                    while (i < i5) {
                        if (bArr[i] != bArr2[i2]) {
                            return false;
                        }
                        i++;
                        i2++;
                    }
                    return true;
                }
                StringBuilder A10 = AnonymousClass000.A10();
                BE9.A1K(A10, A03);
                throw AnonymousClass000.A0j(A10);
            }
        }
        return false;
    }

    public C23362Bfo(byte[] bArr) {
        if (bArr != null) {
            this.zza = bArr;
            return;
        }
        throw null;
    }
}
