package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.SecureUriParser;

/* renamed from: X.6tZ  reason: invalid class name and case insensitive filesystem */
public final class C136286tZ {
    public final C18030ve A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass18K A04;
    public final C24901Mc A05;

    public final String A00(String str) {
        String A012;
        String queryParameter;
        if (str == null || str.length() == 0 || AnonymousClass1YF.A0T(str) || (A012 = C18020vd.A01(C18040vf.A02, this.A00, 3631)) == null || !str.startsWith(A012) || (queryParameter = SecureUriParser.parseEncodedRFC2396(str).getQueryParameter("code")) == null || queryParameter.length() == 0 || AnonymousClass1YF.A0T(queryParameter)) {
            return null;
        }
        return queryParameter;
    }

    public final boolean A02(C61762qD r4) {
        return (r4 == null || r4.A07 != 2 || A00(r4.A01) == null) ? false : true;
    }

    public final void A01(String str) {
        try {
            ClipData newPlainText = ClipData.newPlainText(str, str);
            ClipboardManager A09 = this.A02.A09();
            if (A09 != null) {
                A09.setPrimaryClip(newPlainText);
            }
            this.A01.A09(2131889048, 1);
        } catch (NullPointerException | SecurityException e) {
            Log.e("CouponMessageService/copycode", e);
        }
    }

    public C136286tZ(AnonymousClass1KB r2, AnonymousClass11C r3, AnonymousClass11P r4, C18030ve r5, AnonymousClass18K r6, C24901Mc r7) {
        C18070vi.A0w(r5, r2, r7, r6, r3);
        C18070vi.A0d(r4, 6);
        this.A00 = r5;
        this.A01 = r2;
        this.A05 = r7;
        this.A04 = r6;
        this.A02 = r3;
        this.A03 = r4;
    }
}
