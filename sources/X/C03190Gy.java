package X;

import android.content.Context;

/* renamed from: X.0Gy  reason: invalid class name and case insensitive filesystem */
public final class C03190Gy {
    public final AnonymousClass1DS A00;

    public C03190Gy(Context context) {
        AnonymousClass1DS r0;
        context.getClass();
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            r0 = new C01900Bq();
        } else {
            r0 = new C01910Br(context);
        }
        this.A00 = r0;
    }
}
