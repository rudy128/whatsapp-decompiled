package X;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.car.app.CarAppBinder;
import androidx.car.app.ICarHost;

/* renamed from: X.0Tj  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0Tj implements C15970rV {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Configuration A01;
    public final /* synthetic */ CarAppBinder A02;
    public final /* synthetic */ ICarHost A03;

    public final void BIx() {
        this.A02.m1lambda$onAppCreate$0$androidxcarappCarAppBinder(this.A03, this.A01, this.A00);
        throw null;
    }

    public /* synthetic */ AnonymousClass0Tj(Intent intent, Configuration configuration, CarAppBinder carAppBinder, ICarHost iCarHost) {
        this.A02 = carAppBinder;
        this.A03 = iCarHost;
        this.A01 = configuration;
        this.A00 = intent;
    }
}
