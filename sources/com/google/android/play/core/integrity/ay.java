package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

public final /* synthetic */ class ay implements SuccessContinuation {
    public final /* synthetic */ az a;
    public final /* synthetic */ StandardIntegrityManager.PrepareIntegrityTokenRequest b;

    public /* synthetic */ ay(az azVar, StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        this.a = azVar;
        this.b = prepareIntegrityTokenRequest;
    }

    public final Task then(Object obj) {
        return this.a.a(this.b, (Long) obj);
    }
}
