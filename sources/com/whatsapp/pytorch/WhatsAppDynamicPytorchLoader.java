package com.whatsapp.pytorch;

import X.AnonymousClass000;
import X.AnonymousClass11N;
import X.AnonymousClass1A8;
import X.C108995ce;
import X.C18070vi;
import android.os.SystemClock;
import java.nio.FloatBuffer;

public final class WhatsAppDynamicPytorchLoader {
    public long A00;
    public boolean A01;
    public final AnonymousClass11N A02;

    public WhatsAppDynamicPytorchLoader(AnonymousClass11N r2) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
    }

    private final native void loadDynamicPytorchSymbols();

    public final native void loadModel(String str, String str2);

    public final native boolean modelLoaded(String str);

    public final native float[] runModel(String str, FloatBuffer floatBuffer, long[] jArr);

    public final void A00() {
        if (!this.A01) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                AnonymousClass1A8.A07("dynamic_pytorch_impl", 16);
                AnonymousClass1A8.A07("torch-code-gen", 16);
                loadDynamicPytorchSymbols();
                this.A01 = true;
            } catch (Throwable th) {
                C108995ce.A1M("WhatsAppDynamicPytorchLoader/Failed to load dynamic pytorch libraries: ", AnonymousClass000.A10(), th);
            }
            this.A00 = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }
}
