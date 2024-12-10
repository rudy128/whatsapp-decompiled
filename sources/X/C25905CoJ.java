package X;

import android.util.Log;

/* renamed from: X.CoJ  reason: case insensitive filesystem */
public abstract class C25905CoJ {
    public static boolean A00 = true;

    public static void A00(C26381Cyh cyh, String str, String str2, Object... objArr) {
        if (A00) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("playerId[");
            A10.append(cyh.A0k);
            C25922Cog.A01(str, AnonymousClass001.A1H("]: ", str2, A10), objArr);
        }
    }

    public static void A02(String str, Object... objArr) {
        if (A00) {
            C25922Cog.A01("HeroService", str, objArr);
        }
    }

    public static void A01(C26381Cyh cyh, String str, Throwable th, Object... objArr) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("playerId[");
        A10.append(cyh.A0k);
        Log.e("HeroService", String.format(AnonymousClass001.A1H("]: ", str, A10), objArr), th);
    }
}
