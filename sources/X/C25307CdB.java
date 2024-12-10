package X;

import android.content.Context;
import android.view.TextureView;

/* renamed from: X.CdB  reason: case insensitive filesystem */
public abstract class C25307CdB {
    public static final DAU A00(Context context, TextureView textureView) {
        C18070vi.A0d(context, 0);
        DAU dau = new DAU(context, textureView, new C26814DEw(false), C24671CEl.A00(context));
        dau.A0F = false;
        return dau;
    }

    public static final DAU A01(Context context, TextureView textureView) {
        DAU dau = new DAU(context, textureView, new C26814DEw(true), C24671CEl.A00(context));
        dau.A0F = true;
        return dau;
    }
}
