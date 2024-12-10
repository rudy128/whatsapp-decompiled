package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import java.util.List;
import java.util.Map;

/* renamed from: X.69m  reason: invalid class name and case insensitive filesystem */
public class C1196969m extends AnonymousClass6z6 {
    public long A00;
    public boolean A01;
    public final AnonymousClass1SB A02;
    public final List A03 = AnonymousClass000.A13();
    public final Map A04;

    public C1196969m(RecyclerView recyclerView, C126126cE r4, ShapePickerRecyclerView shapePickerRecyclerView, AnonymousClass1SB r6) {
        super(recyclerView, r4, shapePickerRecyclerView, true);
        this.A02 = r6;
        this.A00 = 0;
        this.A04 = C17880vN.A11();
    }

    public void A01(C113105mY r6, boolean z) {
        super.A01(r6, z);
        View view = r6.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RecyclerView recyclerView = this.A05;
        Resources A0Y = AnonymousClass000.A0Y(recyclerView);
        int i = 2131168708;
        if (z) {
            i = 2131168707;
        }
        layoutParams.width = A0Y.getDimensionPixelSize(i);
        view.setLayoutParams(layoutParams);
        ImageView imageView = r6.A01;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Resources A0Y2 = AnonymousClass000.A0Y(recyclerView);
        int i2 = 2131168706;
        if (z) {
            i2 = 2131168705;
        }
        C108955ca.A1I(imageView, A0Y2.getDimensionPixelSize(i2), layoutParams2);
    }
}
