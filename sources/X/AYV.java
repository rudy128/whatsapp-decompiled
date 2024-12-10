package X;

import android.text.TextUtils;

public final /* synthetic */ class AYV implements C22456B8o {
    public final /* synthetic */ C20284AEs A00;
    public final /* synthetic */ C198809yw A01;
    public final /* synthetic */ AnonymousClass8pT A02;

    public final void C3r(String str) {
        C198809yw r3 = this.A01;
        AnonymousClass8pT r1 = this.A02;
        C20284AEs aEs = this.A00;
        if (!TextUtils.isEmpty(str)) {
            r1.A05 = str;
            r3.A0F.A01().A03((C22442B7y) null, aEs);
        }
    }

    public /* synthetic */ AYV(C20284AEs aEs, C198809yw r2, AnonymousClass8pT r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = aEs;
    }
}
