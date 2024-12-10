package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;

public class ANF implements BAK {
    public final /* synthetic */ CatalogManager A00;
    public final /* synthetic */ C185809dB A01;
    public final /* synthetic */ String A02;

    public ANF(CatalogManager catalogManager, C185809dB r2, String str) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = catalogManager;
    }

    public void BuO(String str, int i) {
        if (this.A02.equals(str)) {
            C185809dB r3 = this.A01;
            AE3 ae3 = r3.A02.A01;
            if (ae3.A00) {
                ae3.A00 = true;
                r3.A00.A02.CQx(r3.A01, -1);
            }
            this.A00.A08.remove(this);
        }
    }

    public void BuP(String str) {
        if (this.A02.equals(str)) {
            C185809dB r3 = this.A01;
            AE3 ae3 = r3.A02.A01;
            if (ae3.A00) {
                ae3.A00 = false;
                r3.A00.A02.CQx(r3.A01, -1);
            }
            this.A00.A08.remove(this);
        }
    }
}
