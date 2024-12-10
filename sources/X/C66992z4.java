package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.jid.Jid;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.2z4  reason: invalid class name and case insensitive filesystem */
public final class C66992z4 implements AnonymousClass5ZX {
    public final AnonymousClass190 A00;
    public final C36361nl A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    public void CBR(Context context, AnonymousClass5XY r16, AnonymousClass206 r17, C20285AEt aEt, int i) {
        AnonymousClass190 r1;
        String str;
        String str2;
        ADF adf = aEt.A08;
        if (adf == null || (str2 = adf.A02) == null) {
            r1 = this.A00;
            str = "missing content/shopId";
        } else {
            String A012 = C18020vd.A01(C18040vf.A02, this.A02, 1054);
            C18070vi.A0X(A012);
            if (A012.length() == 0) {
                r1 = this.A00;
                str = "missing url format";
            } else {
                C36361nl r3 = this.A01;
                String format = String.format(Locale.US, A012, Arrays.copyOf(new Object[]{str2}, 1));
                C18070vi.A0X(format);
                r3.CGU(context, Uri.parse(format), (AnonymousClass206) null);
                ((C190579lB) this.A03.get()).A00((Jid) null, (Integer) null, (String) null, (String) null, 5, 6, 33, false);
                return;
            }
        }
        r1.A0G("OpenShopAction/perform", str, false);
    }

    public C66992z4(AnonymousClass190 r1, C36361nl r2, C18030ve r3, AnonymousClass00H r4) {
        C18070vi.A0s(r3, r1, r2, r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }
}
