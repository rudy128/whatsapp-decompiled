package com.whatsapp.executorch;

import X.AnonymousClass000;
import X.AnonymousClass11N;
import X.AnonymousClass191;
import X.AnonymousClass1A8;
import X.C108995ce;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import android.os.SystemClock;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicLong;

public final class WhatsAppDynamicExecuTorchLoader implements AnonymousClass191 {
    public AtomicLong A00 = new AtomicLong(0);
    public boolean A01;
    public final AnonymousClass11N A02;
    public final C18030ve A03;

    private final native void loadDynamicExecuTorchSymbols();

    public final synchronized void A00() {
        if (!this.A01) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                AnonymousClass1A8.A07("dynamic_executorch", 16);
                loadDynamicExecuTorchSymbols();
                this.A01 = true;
            } catch (Throwable th) {
                C108995ce.A1M("WhatsAppDynamicExecuTorchLoader/Failed to load dynamic executorch libraries: ", AnonymousClass000.A10(), th);
            }
            this.A00.set(SystemClock.uptimeMillis() - uptimeMillis);
        }
    }

    public /* synthetic */ void Blg() {
    }

    public final native void loadModel(String str, String str2);

    public final native boolean modelLoaded(String str);

    public final native float[] runModel(String str, FloatBuffer floatBuffer, long[] jArr);

    public void Blf() {
        if (C18020vd.A05(C18040vf.A02, this.A03, 11814)) {
            A00();
        }
    }

    public WhatsAppDynamicExecuTorchLoader(AnonymousClass11N r4, C18030ve r5) {
        C18070vi.A0j(r5, r4);
        this.A03 = r5;
        this.A02 = r4;
    }

    public void Ba9() {
    }
}
