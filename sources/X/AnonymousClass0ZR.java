package X;

import androidx.car.app.CarAppBinder;
import androidx.car.app.IOnDoneCallback;

/* renamed from: X.0ZR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0ZR implements Runnable {
    public final /* synthetic */ CarAppBinder A00;
    public final /* synthetic */ IOnDoneCallback A01;
    public final /* synthetic */ String A02;

    public final void run() {
        this.A00.m0lambda$getManager$7$androidxcarappCarAppBinder(this.A02, this.A01);
    }

    public /* synthetic */ AnonymousClass0ZR(CarAppBinder carAppBinder, IOnDoneCallback iOnDoneCallback, String str) {
        this.A00 = carAppBinder;
        this.A02 = str;
        this.A01 = iOnDoneCallback;
    }
}
