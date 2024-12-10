package X;

import androidx.car.app.IOnDoneCallback;

/* renamed from: X.0ZS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0ZS implements Runnable {
    public final /* synthetic */ IOnDoneCallback A00;
    public final /* synthetic */ C15970rV A01;
    public final /* synthetic */ String A02;

    public final void run() {
        IOnDoneCallback iOnDoneCallback = this.A00;
        String str = this.A02;
        try {
            this.A01.BIx();
            throw null;
        } catch (RuntimeException e) {
            C04400Nd.A02(iOnDoneCallback, str, e);
            throw new RuntimeException(e);
        } catch (AnonymousClass0CX e2) {
            C04400Nd.A02(iOnDoneCallback, str, e2);
        }
    }

    public /* synthetic */ AnonymousClass0ZS(IOnDoneCallback iOnDoneCallback, C15970rV r2, String str) {
        this.A00 = iOnDoneCallback;
        this.A02 = str;
        this.A01 = r2;
    }
}
