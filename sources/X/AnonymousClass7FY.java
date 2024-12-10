package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.7FY  reason: invalid class name */
public class AnonymousClass7FY implements C108045b2 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DialogFragment A01;
    public final /* synthetic */ AnonymousClass70E A02;
    public final /* synthetic */ AnonymousClass3uP A03;
    public final /* synthetic */ AnonymousClass206 A04;
    public final /* synthetic */ C61762qD A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public AnonymousClass7FY(Context context, DialogFragment dialogFragment, AnonymousClass70E r3, AnonymousClass3uP r4, AnonymousClass206 r5, C61762qD r6, String str, boolean z, boolean z2) {
        this.A02 = r3;
        this.A01 = dialogFragment;
        this.A06 = str;
        this.A05 = r6;
        this.A04 = r5;
        this.A08 = z;
        this.A00 = context;
        this.A03 = r4;
        this.A07 = z2;
    }

    public void Bkq() {
        this.A01.A28();
        String str = this.A06;
        if (str != null && !str.isEmpty()) {
            this.A05.A01 = str;
        }
        AnonymousClass70E r4 = this.A02;
        AnonymousClass206 r6 = this.A04;
        boolean z = this.A08;
        ((AnonymousClass706) r4.A08.get()).A04(r6, C108945cZ.A1A(AnonymousClass1EG.A0H(str)), 4, z);
        if (z) {
            r4.A04(this.A00, r6, this.A05);
            return;
        }
        AnonymousClass3uP r5 = this.A03;
        if (r5 != null) {
            AnonymousClass70E.A00(this.A00, r4, r5, r6, this.A05, this.A07);
        }
    }

    public void Bnl() {
        this.A01.A28();
    }
}
