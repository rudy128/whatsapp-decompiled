package X;

import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet;
import java.util.List;

/* renamed from: X.80b  reason: invalid class name and case insensitive filesystem */
public final class C1582780b extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterReactionsSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1582780b(NewsletterReactionsSheet newsletterReactionsSheet) {
        super(1);
        this.this$0 = newsletterReactionsSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        C134856rG r7 = (C134856rG) obj;
        NewsletterReactionsSheet newsletterReactionsSheet = this.this$0;
        C18070vi.A0b(r7);
        MaterialButtonToggleGroup materialButtonToggleGroup = newsletterReactionsSheet.A03;
        if (materialButtonToggleGroup != null) {
            List list = r7.A01;
            int i2 = 0;
            if (list.size() <= 1) {
                i2 = 8;
            }
            materialButtonToggleGroup.setVisibility(i2);
            if (materialButtonToggleGroup.getWidth() > 0 && (layoutParams = materialButtonToggleGroup.getLayoutParams()) != null) {
                layoutParams.width = materialButtonToggleGroup.getWidth();
            }
            int ordinal = ((AnonymousClass6RL) list.get(r7.A00)).ordinal();
            if (ordinal == 0) {
                i = 2131434360;
            } else if (ordinal == 1) {
                i = 2131434361;
            }
            MaterialButtonToggleGroup.A01(materialButtonToggleGroup, i, true);
        }
        ViewPager2 viewPager2 = this.this$0.A00;
        if (viewPager2 != null) {
            viewPager2.A03(r7.A00, true);
            C38391rD r0 = viewPager2.A04.A0B;
            if (r0 != null) {
                r0.notifyDataSetChanged();
            }
        }
        return C27621Wu.A00;
    }
}
