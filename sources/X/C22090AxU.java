package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.AxU  reason: case insensitive filesystem */
public final class C22090AxU extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AJU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22090AxU(AJU aju) {
        super(1);
        this.this$0 = aju;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            boolean z = th instanceof CancellationException;
            C113975oM r1 = this.this$0.A00;
            if (z) {
                r1.cancel(true);
            } else {
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                r1.A06(th);
            }
        } else if (!this.this$0.A00.isDone()) {
            throw AnonymousClass000.A0k("Failed requirement.");
        }
        return C27621Wu.A00;
    }
}
