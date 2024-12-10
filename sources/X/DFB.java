package X;

import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

public class DFB implements NativeTraceWriterCallbacks {
    public final /* synthetic */ BG5 A00;
    public final /* synthetic */ C26552D3s A01;

    public DFB(BG5 bg5, C26552D3s d3s) {
        this.A00 = bg5;
        this.A01 = d3s;
    }

    public void onTraceWriteAbort(long j, int i) {
        this.A00.A02.C8z(this.A01, i);
    }

    public void onTraceWriteEnd(long j) {
        this.A00.A02.C90(this.A01);
    }

    public void onTraceWriteException(long j, Throwable th) {
        this.A00.A02.C91(this.A01, th);
    }

    public void onTraceWriteStart(long j, int i) {
        this.A00.A02.C92(this.A01);
    }
}
