package X;

import android.content.res.Resources;
import com.whatsapp.spamreport.ReportSpamDialogFragment;

/* renamed from: X.7ES  reason: invalid class name */
public final class AnonymousClass7ES implements C1600186u, C1600286v {
    public final AnonymousClass1KB A00;
    public final AnonymousClass118 A01;
    public final C24921Me A02;
    public final /* synthetic */ ReportSpamDialogFragment A03;

    public void C9q(AnonymousClass1E7 r7) {
        if (ReportSpamDialogFragment.A06(this.A03)) {
            this.A00.A09(2131896937, 1);
            return;
        }
        Resources A05 = AnonymousClass3MW.A05(this.A01);
        Object[] objArr = new Object[1];
        AnonymousClass3MX.A1N(this.A02, r7, objArr, 0);
        String string = A05.getString(2131895166, objArr);
        C18070vi.A0X(string);
        A00(this, string);
    }

    public AnonymousClass7ES(AnonymousClass1KB r1, C24921Me r2, AnonymousClass118 r3, ReportSpamDialogFragment reportSpamDialogFragment) {
        this.A03 = reportSpamDialogFragment;
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r2;
    }

    public static final void A00(AnonymousClass7ES r3, String str) {
        if (!r3.A03.A0Q) {
            r3.A00.A0J(new AnonymousClass7RS(13, str, r3));
        }
    }

    public void BvQ(AnonymousClass1E7 r3) {
        A00(this, C18070vi.A0G(this.A01, 2131895168));
    }
}
