package X;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1Zq  reason: invalid class name and case insensitive filesystem */
public abstract class C28251Zq {
    public abstract void A01(int i);

    public abstract void A03(Typeface typeface);

    public final void A00(int i) {
        new Handler(Looper.getMainLooper()).post(new C449425j(this, i, 0));
    }

    public final void A02(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new C21471Akc((Object) this, (Object) typeface, 3));
    }
}
