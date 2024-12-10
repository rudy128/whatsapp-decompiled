package X;

import android.net.Uri;
import android.os.Handler;
import android.util.LruCache;

/* renamed from: X.CiY  reason: case insensitive filesystem */
public class C25593CiY {
    public final LruCache A00;
    public final LruCache A01;
    public final C24792CKl A02;
    public final C27066DRp A03;
    public final Handler A04 = C17890vO.A0D();
    public final C28620EAs A05;

    public static String A00(C25238CbZ cbZ, C27066DRp dRp) {
        boolean z = dRp.useVideoSourceAsWarmupKey;
        D47 d47 = cbZ.A0C;
        if (!z) {
            return d47.A0H;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        String str = d47.A0H;
        if (str != null) {
            A10.append("\n\tId: ");
            A10.append(str);
        }
        Uri uri = d47.A05;
        if (uri != null) {
            A10.append("\n\tUri: ");
            A10.append(uri);
        }
        return A10.toString();
    }

    public C25593CiY(C24792CKl cKl, C27066DRp dRp, C28620EAs eAs) {
        this.A03 = dRp;
        this.A02 = cKl;
        this.A05 = eAs;
        this.A00 = new C22635BGv(this, dRp.playerWarmUpPoolSize, 3);
        this.A01 = new C22635BGv(this);
    }
}
