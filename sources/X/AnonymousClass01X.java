package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.01X  reason: invalid class name */
public final class AnonymousClass01X {
    public static AnonymousClass01X A01;
    public static final PorterDuff.Mode A02 = PorterDuff.Mode.SRC_IN;
    public AnonymousClass02D A00;

    public synchronized Drawable A03(Context context, int i) {
        return this.A00.A09(context, i);
    }

    public static synchronized PorterDuffColorFilter A00(PorterDuff.Mode mode, int i) {
        PorterDuffColorFilter A002;
        synchronized (AnonymousClass01X.class) {
            A002 = AnonymousClass02D.A00(mode, i);
        }
        return A002;
    }

    public static synchronized AnonymousClass01X A01() {
        AnonymousClass01X r0;
        synchronized (AnonymousClass01X.class) {
            if (A01 == null) {
                A02();
            }
            r0 = A01;
        }
        return r0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.01X] */
    public static synchronized void A02() {
        synchronized (AnonymousClass01X.class) {
            if (A01 == null) {
                ? obj = new Object();
                A01 = obj;
                obj.A00 = AnonymousClass02D.A03();
                AnonymousClass02D r1 = A01.A00;
                AnonymousClass02Q r0 = new AnonymousClass02Q();
                synchronized (r1) {
                    r1.A01 = r0;
                }
            }
        }
    }
}
