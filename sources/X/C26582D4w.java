package X;

import android.view.View;
import com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView;

/* renamed from: X.D4w  reason: case insensitive filesystem */
public class C26582D4w implements View.OnLayoutChangeListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C26582D4w(CenteredSelectionRecyclerView centeredSelectionRecyclerView, int i, int i2) {
        this.A00 = i2;
        this.A02 = centeredSelectionRecyclerView;
        this.A01 = i;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        int i9 = this.A00;
        view.removeOnLayoutChangeListener(this);
        CenteredSelectionRecyclerView centeredSelectionRecyclerView = (CenteredSelectionRecyclerView) this.A02;
        int i10 = this.A01;
        if (i9 != 0) {
            z = false;
        } else {
            z = true;
        }
        CenteredSelectionRecyclerView.A05(centeredSelectionRecyclerView, i10, z);
    }
}
