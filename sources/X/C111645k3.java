package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.5k3  reason: invalid class name and case insensitive filesystem */
public class C111645k3 extends C58342kX {
    public final /* synthetic */ GridLayoutManager A00;
    public final /* synthetic */ C112395lP A01;
    public final /* synthetic */ ShapePickerRecyclerView A02;

    public C111645k3(GridLayoutManager gridLayoutManager, C112395lP r2, ShapePickerRecyclerView shapePickerRecyclerView) {
        this.A02 = shapePickerRecyclerView;
        this.A01 = r2;
        this.A00 = gridLayoutManager;
    }

    public int A00(int i) {
        if (C112395lP.A00(this.A01, i).A00 != 0) {
            return this.A00.A00;
        }
        return this.A02.A01;
    }
}
