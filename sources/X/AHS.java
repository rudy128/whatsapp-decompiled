package X;

import android.content.Context;

public final /* synthetic */ class AHS implements C22397B6a {
    public final /* synthetic */ Context A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.AHR, java.lang.Object] */
    public final BE1 BGA(C187109fH r9) {
        Context context = this.A00;
        String str = r9.A02;
        C188939iF r4 = r9.A01;
        ? obj = new Object();
        if (str != null && str.length() != 0) {
            return obj.BGA(new C187109fH(context, r4, str, true, true));
        }
        throw AnonymousClass000.A0k("Must set a non-null database name to a configuration that uses the no backup directory.");
    }

    public /* synthetic */ AHS(Context context) {
        this.A00 = context;
    }
}
