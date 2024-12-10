package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import java.util.Iterator;
import java.util.Map;

public final class zzji implements Iterator {
    public final Iterator zza;

    public zzji(Iterator it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry A16 = AnonymousClass000.A16(this.zza);
        A16.getValue();
        return A16;
    }

    public final void remove() {
        this.zza.remove();
    }
}
