package X;

import android.content.Context;
import android.content.res.ColorStateList;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity;
import java.util.List;

/* renamed from: X.80O  reason: invalid class name */
public final class AnonymousClass80O extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterDirectoryCategoriesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80O(NewsletterDirectoryCategoriesActivity newsletterDirectoryCategoriesActivity) {
        super(1);
        this.this$0 = newsletterDirectoryCategoriesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C135366s5 r14 = (C135366s5) obj;
        NewsletterDirectoryCategoriesActivity newsletterDirectoryCategoriesActivity = this.this$0;
        C18070vi.A0b(r14);
        newsletterDirectoryCategoriesActivity.A4o(NewsletterDirectoryCategoriesActivity.A0Q(newsletterDirectoryCategoriesActivity));
        if (C108985cd.A0V(newsletterDirectoryCategoriesActivity).A09()) {
            r14.A00 = C111285jR.A00(newsletterDirectoryCategoriesActivity);
        }
        C112405lQ r0 = newsletterDirectoryCategoriesActivity.A03;
        if (r0 == null) {
            str = "newsletterDirectoryCategoriesAdapter";
        } else {
            r0.A0X(r14);
            List<C135346s3> list = r14.A02;
            if (list != null) {
                AnonymousClass6F4 r7 = newsletterDirectoryCategoriesActivity.A02;
                if (r7 == null) {
                    str = "newsletterDirectoryCategoriesChipListView";
                } else {
                    AnonymousClass80N r6 = new AnonymousClass80N(newsletterDirectoryCategoriesActivity);
                    ChipGroup chipGroup = r7.A01;
                    chipGroup.removeAllViews();
                    for (C135346s3 r4 : list) {
                        Context A04 = AnonymousClass3MY.A04(r7);
                        String str2 = r4.A01;
                        Chip chip = new Chip(A04);
                        chip.setText(str2);
                        chip.setClickable(true);
                        C72463Mc.A0y(A04, chip, 2130971978, 2131103153);
                        chip.setChipBackgroundColor(new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{AnonymousClass3Ma.A00(A04, 2130972001, 2131103207), AnonymousClass3Ma.A00(A04, 2130972000, 2131103205)}));
                        chip.setOnClickListener(new AnonymousClass78A(chip, r6, r4, 19));
                        chipGroup.addView(chip);
                    }
                    C108995ce.A0u(r7);
                }
            }
            return C27621Wu.A00;
        }
        C18070vi.A11(str);
        throw null;
    }
}
