package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* renamed from: X.0Hs  reason: invalid class name and case insensitive filesystem */
public class C03350Hs {
    public final Context A00;
    public final Rect A01 = new Rect();
    public final View A02;
    public final WindowManager.LayoutParams A03;
    public final TextView A04;
    public final int[] A05 = new int[2];
    public final int[] A06 = new int[2];

    public C03350Hs(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.A03 = layoutParams;
        this.A00 = context;
        View inflate = LayoutInflater.from(context).inflate(2131623963, (ViewGroup) null);
        this.A02 = inflate;
        this.A04 = (TextView) inflate.findViewById(2131432664);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132082717;
        layoutParams.flags = 24;
    }
}
