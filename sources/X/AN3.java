package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

public final class AN3 implements BAG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C21132Af0 A03;
    public final /* synthetic */ C195529tU A04;
    public final /* synthetic */ UserJid A05;

    public void BuB(UserJid userJid, int i) {
        if (C42171xk.A00(this.A05, userJid)) {
            C195529tU r2 = this.A04;
            C21453AkK.A01(r2.A01, r2, this, 46);
            this.A03.A0B(false);
            r2.A05.A06("catalog_collections_view_tag", false);
        }
    }

    public AN3(Context context, C21132Af0 af0, C195529tU r3, UserJid userJid, int i, int i2) {
        this.A05 = userJid;
        this.A04 = r3;
        this.A02 = context;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = af0;
    }

    public void BuC(UserJid userJid, boolean z, boolean z2) {
        UserJid userJid2 = this.A05;
        if (C42171xk.A00(userJid2, userJid)) {
            C195529tU r4 = this.A04;
            C21453AkK.A01(r4.A01, r4, this, 47);
            r4.A02.A0O(userJid2);
            Context context = this.A02;
            Intent A0z = AnonymousClass1LU.A0z(context, userJid2, Integer.valueOf(this.A01), this.A00);
            C18070vi.A0b(A0z);
            A0z.putExtra("is_prefetched_catalog", true);
            r4.A00.A08(context, A0z);
            this.A03.A0B(true);
        }
    }
}
