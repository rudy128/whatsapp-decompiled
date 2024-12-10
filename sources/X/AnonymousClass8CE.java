package X;

import android.database.ContentObserver;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8CE  reason: invalid class name */
public final class AnonymousClass8CE extends ContentObserver {
    public boolean A00;
    public final long A01 = TimeUnit.MINUTES.toMillis(5);
    public final Handler A02 = C17890vO.A0D();
    public final AnonymousClass11C A03;
    public final String A04;
    public final WeakReference A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass10I A07;

    public AnonymousClass8CE(AnonymousClass11C r4, AnonymousClass11P r5, B9O b9o, AnonymousClass10I r7, String str) {
        super((Handler) null);
        this.A07 = r7;
        this.A03 = r4;
        this.A04 = str;
        this.A06 = r5;
        this.A05 = AnonymousClass3MW.A0z(b9o);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        C21428Ajv.A00(this.A07, this, 14);
    }
}
