package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE7;
import java.io.IOException;

public class zzje extends IOException {
    public zzke zza = null;
    public boolean zzb;

    public final zzje zzh(zzke zzke) {
        this.zza = zzke;
        return this;
    }

    public final void zzk() {
        this.zzb = true;
    }

    public final boolean zzl() {
        return this.zzb;
    }

    public static zzje zzb() {
        return BE6.A0Y("Protocol message end-group tag did not match expected tag.");
    }

    public static zzje zzc() {
        return BE6.A0Y("Protocol message contained an invalid tag (zero).");
    }

    public static zzje zzd() {
        return BE6.A0Y("Protocol message had invalid UTF-8.");
    }

    public static zzje zze() {
        return BE6.A0Y("CodedInputStream encountered a malformed varint.");
    }

    public static zzje zzg() {
        return BE6.A0Y("Failed to parse the message.");
    }

    public static zzje zzi() {
        return BE6.A0Y("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public zzje(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzjd zza() {
        return BE7.A0J();
    }

    public static zzje zzf() {
        return BE7.A0K();
    }

    public static zzje zzj() {
        return BE7.A0L();
    }

    public zzje(String str) {
        super(str);
    }
}
