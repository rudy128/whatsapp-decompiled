package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.118  reason: invalid class name */
public class AnonymousClass118 {
    public final Context A00;

    public Resources A00() {
        return this.A00.getResources();
    }

    public String A01(int i) {
        return this.A00.getResources().getString(i);
    }

    public String A02(int i, Object... objArr) {
        return this.A00.getResources().getString(i, objArr);
    }

    public AnonymousClass118(Context context) {
        this.A00 = context;
    }
}
