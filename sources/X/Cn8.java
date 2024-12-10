package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;

public abstract class Cn8 {
    public C26552D3s A00;
    public String A01 = null;
    public boolean A02 = true;
    public int A03;
    public MultiBufferLogger A04;
    public volatile boolean A05;

    public abstract void disable();

    public abstract void enable();

    public abstract int getSupportedProviders();

    public abstract int getTracingProviders();

    public void onTraceEnded(C26552D3s d3s, DFA dfa) {
    }

    public void onTraceStarted(C26552D3s d3s, DFA dfa) {
    }

    public final MultiBufferLogger A01() {
        if (!this.A05) {
            synchronized (this) {
                if (!this.A05) {
                    this.A04 = new MultiBufferLogger();
                    this.A05 = true;
                }
            }
        }
        return this.A04;
    }

    public final void A02() {
        if (!this.A02) {
            synchronized (this) {
                if (!this.A02) {
                    MultiBufferLogger A012 = A01();
                    try {
                        int writeStandardEntry = A012.writeStandardEntry(6, 21, 0, 0, 0, 0, 0);
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("ensureSoLibLoaded: ");
                        String str = this.A01;
                        A012.writeBytesEntry(0, 83, writeStandardEntry, AnonymousClass000.A0y(str, A10));
                        AnonymousClass1A8.A06(str);
                        this.A02 = true;
                        A012.writeStandardEntry(6, 22, 0, 0, 0, 0, 0);
                    } catch (Throwable th) {
                        A012.writeStandardEntry(6, 22, 0, 0, 0, 0, 0);
                        throw th;
                    }
                }
            }
        }
    }

    public final void A03(C26552D3s d3s, DFA dfa) {
        if (this.A03 != 0 && (d3s.A02 & getSupportedProviders()) != 0) {
            A02();
            onTraceEnded(d3s, dfa);
            A00(this, d3s);
            A01().removeBuffer(d3s.A09);
        }
    }

    public static void A00(Cn8 cn8, C26552D3s d3s) {
        int supportedProviders = cn8.getSupportedProviders() & TraceEvents.sProviders;
        int i = cn8.A03;
        if (i != 0) {
            int i2 = i & TraceEvents.sProviders;
            int i3 = cn8.A03;
            if (i2 == i3) {
                return;
            }
            if (i3 != 0) {
                cn8.disable();
                cn8.A00 = null;
            }
        }
        if (supportedProviders != 0) {
            cn8.A00 = d3s;
            cn8.enable();
        }
        cn8.A03 = supportedProviders;
    }
}
