package X;

import com.whatsapp.WaTabLayout;
import com.whatsapp.WaViewPager;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;

/* renamed from: X.82Z  reason: invalid class name */
public final class AnonymousClass82Z extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ WaViewPager $nonNullWaViewPager;
    public final /* synthetic */ ReactionsBottomSheetDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82Z(WaViewPager waViewPager, ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment) {
        super(1);
        this.this$0 = reactionsBottomSheetDialogFragment;
        this.$nonNullWaViewPager = waViewPager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WaTabLayout waTabLayout = this.this$0.A04;
        if (waTabLayout != null) {
            waTabLayout.setupTabsForAccessibility(this.$nonNullWaViewPager);
        }
        return C27621Wu.A00;
    }
}
