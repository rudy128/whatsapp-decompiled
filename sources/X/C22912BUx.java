package X;

import com.facebook.profilo.core.ProvidersRegistry;

/* renamed from: X.BUx  reason: case insensitive filesystem */
public final class C22912BUx extends Cn8 {
    public static final int A00 = ProvidersRegistry.A00.A02("qpl");

    public void disable() {
    }

    public void enable() {
    }

    public int getSupportedProviders() {
        return A00;
    }

    public int getTracingProviders() {
        C26552D3s d3s = this.A00;
        if (d3s == null) {
            return 0;
        }
        return d3s.A02 & A00;
    }
}
