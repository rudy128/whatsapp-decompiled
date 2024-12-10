package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.02i  reason: invalid class name and case insensitive filesystem */
public final class C005402i extends C005302h {
    public static void A00(Intent intent) {
        C18070vi.A0d(intent, 1);
    }

    public /* bridge */ /* synthetic */ Intent A03(Context context, Object obj) {
        Intent intent = (Intent) obj;
        A00(intent);
        return intent;
    }

    public /* bridge */ /* synthetic */ Object A05(Intent intent, int i) {
        return new C005702m(i, intent);
    }
}
