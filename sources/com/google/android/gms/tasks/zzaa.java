package com.google.android.gms.tasks;

import X.AnonymousClass000;
import java.util.ArrayList;
import java.util.Collection;

public final class zzaa implements Continuation {
    public final /* synthetic */ Collection zza;

    public zzaa(Collection collection) {
        this.zza = collection;
    }

    public final /* bridge */ /* synthetic */ Object then(Task task) {
        ArrayList A13 = AnonymousClass000.A13();
        for (Task result : this.zza) {
            A13.add(result.getResult());
        }
        return A13;
    }
}
