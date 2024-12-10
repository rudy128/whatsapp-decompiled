package X;

import com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment;
import java.util.List;

/* renamed from: X.7PI  reason: invalid class name */
public final class AnonymousClass7PI implements C1605989c {
    public final /* synthetic */ AnonymousClass01E A00;
    public final /* synthetic */ C1606089d A01;
    public final /* synthetic */ C139146yI A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    public AnonymousClass7PI(AnonymousClass01E r1, C1606089d r2, C139146yI r3, Integer num, String str, List list) {
        this.A02 = r3;
        this.A03 = num;
        this.A00 = r1;
        this.A05 = list;
        this.A04 = str;
        this.A01 = r2;
    }

    public void onSuccess() {
        C18070vi.A0d("CrosspostAccountValidationManager/validateAccountLink link successful", 0);
        C139146yI r5 = this.A02;
        AnonymousClass00H r6 = r5.A04;
        C108945cZ.A13(r6).A06(AnonymousClass74B.A03(this.A03), "INIT_CROSSPOST", 927599499);
        AnonymousClass01E r4 = this.A00;
        List list = this.A05;
        C20098A7b.A02(new AutoShareNuxDialogFragment(new C129516hv(this.A01, r5, this.A04, list)), r4.getSupportFragmentManager());
        C108945cZ.A13(r6).A04("SEE_CONTEXTUAL_UPSELL");
        ((AnonymousClass6QF) r5.A03.get()).A04();
    }

    public void Btv(C122946Sn r3, Integer num, Integer num2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostAccountValidationManager/validateAccountLink Failed to link account. Error code: ");
        A10.append(num);
        A10.append(", subcode: ");
        C108995ce.A1K(num2, A10);
        this.A01.Btv(r3, num, num2);
    }
}
