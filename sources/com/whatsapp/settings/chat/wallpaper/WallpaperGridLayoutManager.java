package com.whatsapp.settings.chat.wallpaper;

import X.BLi;
import X.C38391rD;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;

public final class WallpaperGridLayoutManager extends GridLayoutManager {
    public final Context A00;
    public final C38391rD A01;

    public WallpaperGridLayoutManager(Context context, C38391rD r4) {
        super(context, 4);
        this.A00 = context;
        this.A01 = r4;
        this.A01 = new BLi(this, 3);
    }
}
