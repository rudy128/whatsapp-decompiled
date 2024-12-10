package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;

/* renamed from: X.D4v  reason: case insensitive filesystem */
public class C26581D4v implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;

    public C26581D4v(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Resources resources;
        Configuration configuration;
        int i9;
        switch (this.A00) {
            case 0:
                C22661BIv bIv = (C22661BIv) this.A01;
                View view2 = bIv.A01;
                if (view2 != null && (resources = view2.getResources()) != null && (configuration = resources.getConfiguration()) != null && (i9 = configuration.orientation) != bIv.A00) {
                    bIv.A00 = i9;
                    C18090vk r0 = bIv.A03;
                    if (r0 != null) {
                        r0.invoke();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                D4O d4o = (D4O) this.A01;
                d4o.A01.removeOnLayoutChangeListener(this);
                D4O.A00(d4o);
                return;
            case 2:
                ((BottomAppBar$Behavior) this.A01).A00.get();
                view.removeOnLayoutChangeListener(this);
                return;
            case 3:
                C23519Bii bii = (C23519Bii) this.A01;
                Paint paint = C27801Xq.A0N;
                int[] A1W = C108945cZ.A1W();
                view.getLocationOnScreen(A1W);
                bii.A06 = BE6.A0I(A1W);
                view.getWindowVisibleDisplayFrame(bii.A0D);
                return;
            default:
                return;
        }
    }
}
