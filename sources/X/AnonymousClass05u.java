package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.05u  reason: invalid class name */
public class AnonymousClass05u extends C005302h {
    public static Intent A00(Uri uri) {
        C18070vi.A0d(uri, 1);
        Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
        C18070vi.A0X(putExtra);
        return putExtra;
    }

    public /* bridge */ /* synthetic */ Object A05(Intent intent, int i) {
        return Boolean.valueOf(AnonymousClass000.A1T(i, -1));
    }

    public /* bridge */ /* synthetic */ Intent A03(Context context, Object obj) {
        return A00((Uri) obj);
    }

    public /* bridge */ /* synthetic */ C03160Gv A04(Context context, Object obj) {
        return null;
    }
}
