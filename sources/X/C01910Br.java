package X;

import android.content.AsyncQueryHandler;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;

/* renamed from: X.0Br  reason: invalid class name and case insensitive filesystem */
public final class C01910Br extends AnonymousClass1DS {
    public static final Uri A03 = new Uri.Builder().scheme("content").authority("androidx.car.app.connection").build();
    public final AsyncQueryHandler A00;
    public final Context A01;
    public final AnonymousClass04M A02 = new AnonymousClass04M(this);

    public void A07() {
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = Build.VERSION.SDK_INT;
        Context context = this.A01;
        AnonymousClass04M r0 = this.A02;
        if (i >= 33) {
            AnonymousClass0DS.A00(r0, context, intentFilter);
        } else {
            context.registerReceiver(r0, intentFilter);
        }
        A0G();
    }

    public void A08() {
        this.A01.unregisterReceiver(this.A02);
        this.A00.cancelOperation(42);
    }

    public void A0G() {
        this.A00.startQuery(42, (Object) null, A03, new String[]{"CarConnectionState"}, (String) null, (String[]) null, (String) null);
    }

    public C01910Br(Context context) {
        this.A01 = context;
        this.A00 = new AnonymousClass04J(context.getContentResolver(), this);
    }
}
