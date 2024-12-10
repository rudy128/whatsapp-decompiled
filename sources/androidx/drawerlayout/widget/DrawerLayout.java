package androidx.drawerlayout.widget;

import X.E0G;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public abstract class DrawerLayout extends ViewGroup {
    public abstract float getDrawerElevation();

    public abstract Drawable getStatusBarBackgroundDrawable();

    public abstract void setDrawerElevation(float f);

    @Deprecated
    public abstract void setDrawerListener(E0G e0g);

    public abstract void setDrawerLockMode(int i);

    public abstract void setScrimColor(int i);

    public abstract void setStatusBarBackground(int i);

    public abstract void setStatusBarBackground(Drawable drawable);

    public abstract void setStatusBarBackgroundColor(int i);
}
