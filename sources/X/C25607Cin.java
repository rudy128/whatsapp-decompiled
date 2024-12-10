package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Log;

/* renamed from: X.Cin  reason: case insensitive filesystem */
public final class C25607Cin {
    @Deprecated
    public static final C24924CPx A07;
    public static final C22993BYp A08;
    public static final C24599CAv A09;
    public C24371C0l A00;
    public final int A01;
    public final Context A02;
    public final C28440E1g A03;
    public final C28441E1h A04;
    public final C28450E1q A05;
    public final String A06;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.E1k, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.Cso, X.E1h] */
    public C25607Cin(Context context) {
        ? cso = new C26126Cso(context, (C28622EAu) null, A07, new C25540Chd(Looper.getMainLooper(), new Object()));
        DJ3 dj3 = DJ3.A00;
        C26887DHu dHu = new C26887DHu(context);
        C24371C0l c0l = C24371C0l.DEFAULT;
        this.A00 = c0l;
        this.A02 = context;
        this.A06 = context.getPackageName();
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.A01 = i;
        this.A04 = cso;
        this.A05 = dj3;
        this.A00 = c0l;
        this.A03 = dHu;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.CAv] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.BYp] */
    static {
        ? obj = new Object();
        A09 = obj;
        ? obj2 = new Object();
        A08 = obj2;
        A07 = new C24924CPx(obj2, obj, "ClearcutLogger.API");
    }
}
