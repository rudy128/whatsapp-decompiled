package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: X.4Hg  reason: invalid class name and case insensitive filesystem */
public abstract class C83944Hg {
    public static final AnonymousClass3N2 A00(Context context) {
        Bitmap extractAlpha;
        int A01 = AnonymousClass1YL.A01(context, 2130971973, 2131103142, false);
        int A012 = AnonymousClass1YL.A01(context, 2130971972, 2131103140, false);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2131233686, (BitmapFactory.Options) null);
        if (decodeResource == null || (extractAlpha = decodeResource.extractAlpha()) == null) {
            return null;
        }
        decodeResource.recycle();
        return new AnonymousClass3N2(C19740yt.A00(context, A012), C19740yt.A00(context, A01), extractAlpha);
    }
}
