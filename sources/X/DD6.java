package X;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

public class DD6 implements E4W {
    public final ContentResolver A00;
    public final Executor A01;

    public void CCn(C25268CcD ccD, ECs eCs) {
        ECs eCs2 = eCs;
        DDI ddi = (DDI) eCs2;
        C28605E9w e9w = ddi.A05;
        C25256Cbv cbv = ddi.A07;
        eCs.CD4("local", "video");
        C22865BSt bSt = new C22865BSt(ccD, this, eCs2, eCs, e9w, e9w, cbv);
        C25027CUe.A00(eCs, bSt, this, 4);
        this.A01.execute(bSt);
    }

    public DD6(ContentResolver contentResolver, Executor executor) {
        this.A01 = executor;
        this.A00 = contentResolver;
    }
}
