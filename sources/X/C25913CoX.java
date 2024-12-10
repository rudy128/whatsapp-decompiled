package X;

import android.util.Log;

/* renamed from: X.CoX  reason: case insensitive filesystem */
public abstract class C25913CoX {
    public static volatile DFF A00;

    public static void A00(DOZ doz, String str, String str2, Throwable th) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[");
        A10.append(str);
        Log.e("Whatsapp", AnonymousClass000.A0y("] ", A10), th);
        Log.e("Whatsapp", C17900vP.A0H("[", str, "] ").toString(), th);
        if (A00 != null) {
            DFF.A00(doz, A00, str2, th, false);
        }
    }

    public static void A01(String str, String str2) {
        StringBuilder A0q = BE9.A0q();
        A0q.append(str);
        Log.e("Whatsapp", AnonymousClass001.A1H("] ", str2, A0q));
        A00((DOZ) null, str, str2, (Throwable) null);
    }

    public static void A02(String str, Throwable th) {
        StringBuilder A0q = BE9.A0q();
        A0q.append(str);
        Log.e("Whatsapp", AnonymousClass001.A1E(th, "] ", A0q));
        A00((DOZ) null, str, "", th);
    }
}
