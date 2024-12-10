package com.facebook.video.heroplayer.service;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.BE6;
import X.C22926BVo;
import X.C25922Cog;
import X.C92;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.util.concurrent.atomic.AtomicReference;

public class ServiceEventCallbackImpl implements VpsEventCallback {
    public String A00;
    public final C92 A01;
    public final AtomicReference A02;

    public void A00() {
        C25922Cog.A01("ServiceEventCallbackImpl", "skipping log because listener is null", BE6.A1Z());
    }

    public void errorCallback(String str, String str2, String str3) {
        new C22926BVo(this.A00, str, str2, str3);
        A00();
    }

    public ServiceEventCallbackImpl(C92 c92, String str, AtomicReference atomicReference) {
        this.A02 = atomicReference;
        this.A01 = c92;
        this.A00 = str == null ? "" : str;
        C25922Cog.A01("ServiceEventCallbackImpl", AnonymousClass001.A1E(atomicReference, "setting listener for event callback to: ", AnonymousClass000.A10()), BE6.A1Z());
    }

    public ServiceEventCallbackImpl(AtomicReference atomicReference) {
        this.A02 = atomicReference;
        this.A01 = null;
        this.A00 = "";
        C25922Cog.A01("ServiceEventCallbackImpl", AnonymousClass001.A1E(atomicReference, "setting listener for event callback to: ", AnonymousClass000.A10()), BE6.A1Z());
    }
}
