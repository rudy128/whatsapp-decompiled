package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.DQz  reason: case insensitive filesystem */
public class C27054DQz implements C28542E6q {
    public final int A00;
    public final Object A01;

    public C27054DQz(DR0 dr0, int i) {
        this.A00 = i;
        this.A01 = dr0;
    }

    public final void Bom() {
        switch (this.A00) {
            case 0:
                ((DR0) this.A01).BF9();
                return;
            case 1:
                DR0 dr0 = (DR0) this.A01;
                String str = dr0.A0B;
                Context context = dr0.A0I;
                C25022CTy cTy = dr0.A0N;
                AnonymousClass1L9 r4 = dr0.A0K;
                if (str != null) {
                    r4.CGU(context, Uri.parse(str), (AnonymousClass206) null);
                }
                cTy.A02 = true;
                cTy.A00 = 1;
                dr0.BF9();
                return;
            default:
                DR0 dr02 = (DR0) this.A01;
                if (dr02.A0C) {
                    dr02.BKs(false);
                    return;
                } else {
                    dr02.BKP();
                    return;
                }
        }
    }
}
