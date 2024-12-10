package com.google.android.gms.tasks;

import X.AnonymousClass000;
import java.util.ArrayList;
import java.util.Collection;

public final class zzab implements Continuation {
    public final /* synthetic */ Collection zza;

    public zzab(Collection collection) {
        this.zza = collection;
    }

    public final /* bridge */ /* synthetic */ Object then(Task task) {
        ArrayList A13 = AnonymousClass000.A13();
        A13.addAll(this.zza);
        zzw zzw = new zzw();
        zzw.zzb(A13);
        return zzw;
    }
}
