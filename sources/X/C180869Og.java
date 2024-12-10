package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.9Og  reason: invalid class name and case insensitive filesystem */
public abstract class C180869Og {
    /* JADX WARNING: type inference failed for: r3v2, types: [X.8QY, X.8Qd] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.8Qi, X.A8B] */
    public static void A00(Context context, Intent intent) {
        AnonymousClass8QY r3;
        A5E A00 = A5E.A00();
        synchronized (A00) {
            AnonymousClass8QY r32 = A00.A00;
            r3 = r32;
            if (r32 == null) {
                AnonymousClass8Qi r2 = A00.A02;
                AnonymousClass8Qi r22 = r2;
                if (r2 == null) {
                    ? a8b = new A8B(A5E.A0I, A5E.A0H);
                    A00.A02 = a8b;
                    r22 = a8b;
                }
                ? r33 = new AnonymousClass8Qd(r22, A00.A0C, A00.A0D);
                A00.A00 = r33;
                r3 = r33;
            }
        }
        r3.A05(context, intent);
    }
}
