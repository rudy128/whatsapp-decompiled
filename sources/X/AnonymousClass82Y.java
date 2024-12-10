package X;

import com.whatsapp.WaTabLayout;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;

/* renamed from: X.82Y  reason: invalid class name */
public final class AnonymousClass82Y extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C111215j4 $viewModel;
    public final /* synthetic */ ReactionsBottomSheetDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82Y(ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment, C111215j4 r3) {
        super(1);
        this.this$0 = reactionsBottomSheetDialogFragment;
        this.$viewModel = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WaTabLayout waTabLayout = this.this$0.A04;
        if (waTabLayout != null) {
            int i = this.$viewModel.A00;
            int A07 = C108945cZ.A07(waTabLayout);
            if (A07 > 0 && i >= 0 && i < A07) {
                waTabLayout.A0M(i);
            }
        }
        return C27621Wu.A00;
    }
}
