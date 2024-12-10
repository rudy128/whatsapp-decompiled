package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.IntentChooserBottomSheetDialogFragment;

/* renamed from: X.5k7  reason: invalid class name and case insensitive filesystem */
public class C111655k7 extends GridLayoutManager {
    public int A00 = 0;
    public final /* synthetic */ IntentChooserBottomSheetDialogFragment A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111655k7(Context context, IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment) {
        super(context, 4);
        this.A01 = intentChooserBottomSheetDialogFragment;
    }

    public void A1D(C37931qQ r4, C38021qZ r5) {
        int i = this.A03;
        if (i > 0 && i != this.A00) {
            this.A00 = i;
            int dimensionPixelSize = AnonymousClass3MZ.A09(this.A01).getDimensionPixelSize(2131167179);
            if (dimensionPixelSize > 0) {
                A1g(Math.max(1, ((i - A0N()) - A0M()) / dimensionPixelSize));
            }
        }
        super.A1D(r4, r5);
    }
}
