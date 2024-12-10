package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.net.URL;

public class DHY implements EAT {
    public int A00;
    public Context A01;
    public EAS A02;
    public CUT A03;
    public E7t A04;

    public C25225CbM BUZ() {
        return null;
    }

    public boolean BeS() {
        return false;
    }

    public void CRW(A5W a5w) {
    }

    public void CS4() {
    }

    public void cancel() {
    }

    public void BFX(int i) {
        this.A00 = i;
        C26052CrM crM = this.A03.A06;
        C26159CtX.A01(crM);
        crM.A03(C24322BzJ.VIDEO, this.A00);
        this.A02 = this.A04.BHI();
    }

    public long BI6() {
        throw AnonymousClass000.A0s("loadImage");
    }

    public void BI7(long j) {
        throw AnonymousClass000.A0s("loadImage");
    }

    public long BQJ() {
        return 0;
    }

    public void CHA(long j) {
        throw AnonymousClass000.A0s("loadImage");
    }

    public void release() {
        EAS eas = this.A02;
        if (eas != null) {
            eas.finish();
        }
    }

    public void start() {
        C26052CrM crM = this.A03.A06;
        C26159CtX.A01(crM);
        C25833Cmm A032 = crM.A03(C24322BzJ.VIDEO, this.A00);
        C26159CtX.A01(A032);
        C25271CcJ ccJ = (C25271CcJ) AnonymousClass8BS.A0Y(C17880vN.A10(A032.A04));
        File file = ccJ.A05;
        URL url = ccJ.A06;
        if (file != null) {
            Uri.fromFile(file);
            C26171Ctn.A02((Object) null);
            throw AnonymousClass000.A0s("setDataSource");
        } else if (url != null) {
            C26215Cuu.A01(url.toString());
            C26171Ctn.A02((Object) null);
            throw AnonymousClass000.A0s("setDataSource");
        }
    }
}
