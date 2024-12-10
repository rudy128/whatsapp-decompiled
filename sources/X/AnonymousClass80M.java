package X;

import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity;

/* renamed from: X.80M  reason: invalid class name */
public final class AnonymousClass80M extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass6BJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80M(AnonymousClass6BJ r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C86954Ts r6 = (C86954Ts) obj;
        AnonymousClass6BJ r4 = this.this$0;
        C18070vi.A0b(r6);
        r4.A05.CGN(new C21458AkP(r4, r6, 35));
        int intValue = r6.A01.intValue();
        if (intValue == 3) {
            r4.A4b().A0T(r6.A00, true, r4 instanceof NewsletterDirectoryCategoriesActivity);
        } else if (intValue == 2) {
            r4.A4b().A0T(r6.A00, false, r4 instanceof NewsletterDirectoryCategoriesActivity);
        }
        return C27621Wu.A00;
    }
}
