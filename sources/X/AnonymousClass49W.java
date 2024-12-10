package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Pair;
import java.lang.ref.WeakReference;

/* renamed from: X.49W  reason: invalid class name */
public final class AnonymousClass49W extends A34 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Bitmap.CompressFormat A04;
    public final Bitmap A05;
    public final Rect A06;
    public final Uri A07;
    public final C57142ib A08;
    public final WeakReference A09;
    public final boolean A0A;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C57142ib r0 = this.A08;
        Uri uri = this.A07;
        int i = this.A03;
        Rect rect = this.A06;
        int i2 = this.A02;
        return r0.A00(this.A04, this.A05, rect, uri, i, i2, this.A01, this.A00, this.A0A);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Pair pair = (Pair) obj;
        Activity activity = (Activity) this.A09.get();
        if (activity != null) {
            if (pair != null) {
                Object obj2 = pair.first;
                C18070vi.A0W(obj2);
                activity.setResult(AnonymousClass000.A0M(obj2), (Intent) pair.second);
            }
            activity.finish();
        }
    }

    public AnonymousClass49W(Activity activity, Bitmap.CompressFormat compressFormat, Bitmap bitmap, Rect rect, Uri uri, C57142ib r7, int i, int i2, int i3, int i4, boolean z) {
        C18070vi.A0k(uri, compressFormat);
        C18070vi.A0d(bitmap, 5);
        C18070vi.A0d(r7, 10);
        this.A07 = uri;
        this.A04 = compressFormat;
        this.A02 = i;
        this.A05 = bitmap;
        this.A06 = rect;
        this.A0A = z;
        this.A01 = i2;
        this.A03 = i3;
        this.A08 = r7;
        this.A00 = i4;
        this.A09 = AnonymousClass3MW.A0z(activity);
    }
}
