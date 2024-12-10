package X;

import android.util.Log;

/* renamed from: X.AfE  reason: case insensitive filesystem */
public final /* synthetic */ class C21143AfE implements B9X {
    public final /* synthetic */ String A00;

    public final void Bsi(boolean z, Object obj) {
        String str = this.A00;
        String str2 = (String) obj;
        if (z) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Bloks: CacheShards evicted ");
            A10.append(str);
            Log.d("Whatsapp", AnonymousClass001.A1H(" :: ", str2, A10));
        }
    }

    public /* synthetic */ C21143AfE(String str) {
        this.A00 = str;
    }
}
