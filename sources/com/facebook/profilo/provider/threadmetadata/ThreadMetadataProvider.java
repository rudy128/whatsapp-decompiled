package com.facebook.profilo.provider.threadmetadata;

import X.C26552D3s;
import X.Cn8;
import X.DFA;
import com.facebook.profilo.mmapbuf.core.Buffer;

public final class ThreadMetadataProvider extends Cn8 {
    public static native void nativeLogThreadMetadata(Buffer buffer);

    public void disable() {
    }

    public void enable() {
    }

    public int getSupportedProviders() {
        return -1;
    }

    public int getTracingProviders() {
        return 0;
    }

    public ThreadMetadataProvider() {
        this.A01 = "profilo_threadmetadata";
        this.A02 = false;
    }

    public void logOnTraceEnd(C26552D3s d3s, DFA dfa) {
        nativeLogThreadMetadata(d3s.A09);
    }

    public void onTraceEnded(C26552D3s d3s, DFA dfa) {
        if (d3s.A00 != 2) {
            nativeLogThreadMetadata(d3s.A09);
        }
    }
}
