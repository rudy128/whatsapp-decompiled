package X;

import android.view.View;
import android.view.ViewStub;
import com.google.android.material.chip.Chip;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity;

/* renamed from: X.80N  reason: invalid class name */
public final class AnonymousClass80N extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterDirectoryCategoriesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80N(NewsletterDirectoryCategoriesActivity newsletterDirectoryCategoriesActivity) {
        super(1);
        this.this$0 = newsletterDirectoryCategoriesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View A02;
        String str;
        C135346s3 r12 = (C135346s3) obj;
        C18070vi.A0d(r12, 0);
        NewsletterDirectoryCategoriesActivity newsletterDirectoryCategoriesActivity = this.this$0;
        C179619Ir r1 = r12.A00;
        newsletterDirectoryCategoriesActivity.A09 = r1;
        AnonymousClass4VZ A4c = newsletterDirectoryCategoriesActivity.A4c();
        C18070vi.A0z(A4c, "null cannot be cast to non-null type com.whatsapp.newsletter.ui.directory.NewsletterDirectoryToolBarHelper");
        AnonymousClass6FL r6 = (AnonymousClass6FL) A4c;
        String str2 = r12.A01;
        View view = r6.A00;
        View findViewById = view.findViewById(2131428924);
        if (!(findViewById instanceof ViewStub)) {
            A02 = view.findViewById(2131428923);
        } else {
            A02 = new C28931bI(findViewById).A02();
        }
        Chip chip = (Chip) A02;
        C18070vi.A0b(chip);
        AnonymousClass6FL.A00(chip, r6, str2, false);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(2131166500);
        int floor = (int) Math.floor(((double) view.getWidth()) * 0.3d);
        if (dimensionPixelSize < floor) {
            dimensionPixelSize = floor;
        }
        chip.setMaxWidth(dimensionPixelSize);
        if (C108985cd.A1b(this.this$0.A4d())) {
            NewsletterDirectoryCategoriesActivity newsletterDirectoryCategoriesActivity2 = this.this$0;
            AnonymousClass00H r0 = newsletterDirectoryCategoriesActivity2.A0G;
            if (r0 != null) {
                newsletterDirectoryCategoriesActivity2.A00 = (long) AnonymousClass3MW.A11(((C133836pa) r0.get()).A01).indexOf(r1);
                AnonymousClass74D r3 = (AnonymousClass74D) C18070vi.A0E(this.this$0.A4e());
                String A00 = C111285jR.A00(this.this$0);
                NewsletterDirectoryCategoriesActivity newsletterDirectoryCategoriesActivity3 = this.this$0;
                C179619Ir r02 = newsletterDirectoryCategoriesActivity3.A09;
                if (r02 != null) {
                    str = r02.name();
                } else {
                    str = null;
                }
                r3.A0L((Integer) null, (Integer) null, A00, str, 3, newsletterDirectoryCategoriesActivity3.A00);
            } else {
                C18070vi.A11("newsletterDirectoryUtil");
                throw null;
            }
        }
        this.this$0.A4m((Integer) null, false);
        return C27621Wu.A00;
    }
}
