package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;

public class ANG implements BAK {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ AnonymousClass1KB A02;
    public final /* synthetic */ C21132Af0 A03;
    public final /* synthetic */ CatalogManager A04;
    public final /* synthetic */ UserJid A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public ANG(Context context, Intent intent, AnonymousClass1KB r3, C21132Af0 af0, CatalogManager catalogManager, UserJid userJid, String str, boolean z) {
        this.A06 = str;
        this.A02 = r3;
        this.A04 = catalogManager;
        this.A05 = userJid;
        this.A07 = z;
        this.A00 = context;
        this.A01 = intent;
        this.A03 = af0;
    }

    public void BuO(String str, int i) {
        if (this.A06.equals(str)) {
            AnonymousClass1KB r3 = this.A02;
            r3.A02.post(new C21450AkH(this, this.A04, 32));
            this.A03.A0B(AnonymousClass000.A0h());
        }
    }

    public void BuP(String str) {
        String str2 = this.A06;
        if (str2.equals(str)) {
            AnonymousClass1KB r3 = this.A02;
            r3.A02.post(new C21450AkH(this, this.A04, 31));
            C20057A5g.A01(this.A00, this.A01, this.A05, (Integer) null, (Integer) null, str2, 6, this.A07);
            this.A03.A0B(AnonymousClass000.A0i());
        }
    }
}
