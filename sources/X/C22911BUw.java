package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.profilo.provider.atrace.Atrace;

/* renamed from: X.BUw  reason: case insensitive filesystem */
public final class C22911BUw extends Cn8 {
    public static final int A00 = ProvidersRegistry.A00.A02("atrace");

    public C22911BUw() {
        this.A01 = "profilo_atrace";
        this.A02 = false;
    }

    public int getSupportedProviders() {
        return A00;
    }

    public void disable() {
        MultiBufferLogger A01 = A01();
        C26552D3s d3s = this.A00;
        boolean z = false;
        if (d3s != null) {
            z = d3s.A08.A01("provider.atrace.use_syscall_for_safe_write", false);
        }
        Atrace.restoreSystrace(A01, z);
    }

    public void enable() {
        MultiBufferLogger A01 = A01();
        C26552D3s d3s = this.A00;
        boolean z = false;
        if (d3s != null) {
            z = d3s.A08.A01("provider.atrace.use_syscall_for_safe_write", false);
        }
        Atrace.enableSystrace(A01, z);
    }

    public int getTracingProviders() {
        if (Atrace.isEnabled()) {
            return A00;
        }
        return 0;
    }
}
