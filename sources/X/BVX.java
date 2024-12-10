package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.DisplayMetrics;

public class BVX extends C6F implements Parcelable {
    public static final Parcelable.Creator CREATOR = new D37(BVX.class);
    public Resources A00;
    public CDP A01;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.CDP, java.lang.Object] */
    public void A00(Context context) {
        Resources resources = context.getResources();
        if (context instanceof C28557E7i) {
            C18070vi.A0b(resources);
            C28557E7i e7i = (C28557E7i) context;
            C72023Ki BZn = e7i.BZn();
            AssetManager assets = resources.getAssets();
            C18070vi.A0X(assets);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            C18070vi.A0X(displayMetrics);
            Configuration configuration = resources.getConfiguration();
            C18070vi.A0X(configuration);
            resources = new C451126e(assets, configuration, resources, displayMetrics, BZn, e7i.BSj());
        } else {
            C18070vi.A0b(resources);
        }
        this.A00 = resources;
        this.A01 = new Object();
    }
}
