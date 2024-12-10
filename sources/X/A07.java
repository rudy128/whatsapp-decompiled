package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class A07 {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass12E A01;
    public final AnonymousClass1L9 A02;
    public final AnonymousClass190 A03;
    public final AnonymousClass11P A04;
    public final C30801eX A05;

    private void A00(AF0 af0, String str) {
        C30801eX r1 = this.A05;
        UserJid A022 = C22941Dw.A02(af0.A0F);
        C17960vV.A07(A022);
        r1.A05(A022, str, SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, System.currentTimeMillis(), System.currentTimeMillis());
    }

    public void A01(Context context, AF0 af0) {
        try {
            if (AnonymousClass3MY.A1a(AnonymousClass1L9.A01(context, BusinessApiSearchActivity.class).getIntent(), "directory_source")) {
                A00(af0, "directory");
            } else {
                A00(af0, "biz_search");
            }
        } catch (IllegalStateException e) {
            this.A03.A0G("ContactBusinessUtil/startMessageBusiness", e.getMessage(), true);
            Log.e("This method is expected to be called from BusinessApiSearch context, therefore no entrypoint conversion is stored", e);
        }
        AnonymousClass12E r3 = this.A01;
        AnonymousClass1M9 r1 = this.A00;
        String str = af0.A0F;
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(str);
        C17960vV.A07(A0l);
        r3.A0B(r1.A0H(A0l));
        Intent A0C = AnonymousClass1LU.A0C(context, 0);
        A0C.putExtra("jid", str);
        this.A02.A09(context, A0C);
    }

    public A07(AnonymousClass1L9 r1, AnonymousClass190 r2, AnonymousClass1M9 r3, AnonymousClass12E r4, AnonymousClass11P r5, C30801eX r6) {
        this.A04 = r5;
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = r3;
        this.A01 = r4;
        this.A05 = r6;
    }
}
