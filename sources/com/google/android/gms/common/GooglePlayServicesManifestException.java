package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
public abstract class GooglePlayServicesManifestException extends IllegalStateException {
    public final int zza;

    public GooglePlayServicesManifestException(int i, String str) {
        super(str);
        this.zza = i;
    }
}
