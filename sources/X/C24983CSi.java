package X;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Map;

/* renamed from: X.CSi  reason: case insensitive filesystem */
public class C24983CSi {
    public C122996Ss A00;
    public String A01 = ".ttf";
    public final AssetManager A02;
    public final C25151Ca2 A03 = new Object();
    public final Map A04 = C17880vN.A11();
    public final Map A05 = C17880vN.A11();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Ca2, java.lang.Object] */
    public C24983CSi(Drawable.Callback callback, C122996Ss r3) {
        AssetManager assets;
        this.A00 = r3;
        if (!(callback instanceof View)) {
            C196379ux.A00("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        } else {
            assets = ((View) callback).getContext().getAssets();
        }
        this.A02 = assets;
    }
}
