package X;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.DJr  reason: case insensitive filesystem */
public final class C26936DJr implements E24, Serializable {
    public final MessageDigest zza;
    public final int zzb;
    public final boolean zzc;
    public final String zzd;

    public C26936DJr() {
    }

    public final String toString() {
        return this.zzd;
    }

    public C26936DJr(String str, String str2) {
        boolean z;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            this.zza = instance;
            this.zzb = instance.getDigestLength();
            this.zzd = "Hashing.sha256()";
            try {
                instance.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.zzc = z;
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }
}
