package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9og  reason: invalid class name and case insensitive filesystem */
public class C192609og {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass12E A01;
    public final C30801eX A02;
    public final AnonymousClass1L9 A03;
    public final AnonymousClass11P A04;

    public void A00(Context context, AF0 af0) {
        String str = af0.A0F;
        UserJid A022 = C22941Dw.A02(str);
        C17960vV.A07(A022);
        this.A02.A05(A022, "directory", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, System.currentTimeMillis(), System.currentTimeMillis());
        AnonymousClass12E r3 = this.A01;
        AnonymousClass1M9 r1 = this.A00;
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(str);
        C17960vV.A07(A0l);
        r3.A0B(r1.A0H(A0l));
        Intent A0C = AnonymousClass1LU.A0C(context, 0);
        A0C.putExtra("jid", str);
        this.A03.A09(context, A0C);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.1LU, java.lang.Object] */
    public void A01(Context context, AnonymousClass1E7 r10) {
        this.A02.A05((UserJid) r10.A0J, "directory", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, System.currentTimeMillis(), System.currentTimeMillis());
        this.A03.A09(context, AnonymousClass3MY.A06(context, new Object(), r10.A0J));
    }

    public C192609og(AnonymousClass1L9 r1, AnonymousClass1M9 r2, AnonymousClass12E r3, AnonymousClass11P r4, C30801eX r5) {
        this.A04 = r4;
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r5;
    }
}
