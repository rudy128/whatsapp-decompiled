package X;

import android.content.Intent;
import android.content.IntentSender;

/* renamed from: X.0ZM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0ZM implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IntentSender.SendIntentException A01;
    public final /* synthetic */ AnonymousClass01M A02;

    public final void run() {
        this.A02.A09(new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.A01), this.A00, 0);
    }

    public /* synthetic */ AnonymousClass0ZM(IntentSender.SendIntentException sendIntentException, AnonymousClass01M r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = sendIntentException;
    }
}
