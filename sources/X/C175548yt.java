package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.8yt  reason: invalid class name and case insensitive filesystem */
public class C175548yt extends C177699Af {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass1KI A04;
    public final C33711jG A05;
    public final C31061ex A06;
    public final AnonymousClass1QS A07;
    public final C20037A4g A08;
    public final C190229ka A09;
    public final AnonymousClass10I A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public C175548yt(Context context, AnonymousClass1KB r9, AnonymousClass11E r10, AnonymousClass1KI r11, C33711jG r12, AnonymousClass1QD r13, C31061ex r14, AnonymousClass1QS r15, C20037A4g a4g, C190229ka r17, AnonymousClass17E r18, C50412Ui r19, AnonymousClass10I r20, String str, String str2, String str3, int i, int i2) {
        super(r10, r13, r14, r18, r19);
        this.A02 = context;
        this.A03 = r9;
        this.A0A = r20;
        this.A07 = r15;
        this.A08 = a4g;
        this.A06 = r14;
        this.A04 = r11;
        this.A05 = r12;
        this.A0C = str;
        this.A0D = str2;
        this.A09 = r17;
        this.A0B = str3;
        this.A01 = i;
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C19760yx r0 = (C19760yx) obj;
        String str = (String) r0.A00;
        A7B a7b = (A7B) r0.A01;
        if (str == null) {
            this.A09.A00((AnonymousClass8pK) null, a7b, (ArrayList) null, false);
            return;
        }
        C31061ex r10 = this.A06;
        String A062 = r10.A06();
        String str2 = this.A0B;
        String str3 = this.A0D;
        Locale locale = Locale.US;
        Object[] A1a = AnonymousClass3MW.A1a();
        C17880vN.A1T(A1a, this.A00, 0);
        String format = String.format(locale, "%02d", A1a);
        String num = Integer.toString(this.A01);
        C18070vi.A0p(str2, str3, format);
        C18070vi.A0d(num, 5);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C29591cX.A01(A0Y, "xmlns", "w:pay");
        boolean A1X = AnonymousClass8BY.A1X(A0Y, A062);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "retokenize-card");
        if (C29601cY.A04(str2, 1, 200, A1X)) {
            C29591cX.A01(A0R, "credential_id", str2);
        }
        if (C29601cY.A04(str3, 1, 1000, A1X)) {
            C29591cX.A01(A0R, "nonce", str3);
        }
        if (C29601cY.A04(format, 2, 2, A1X)) {
            C29591cX.A01(A0R, "card_expiry_month", format);
        }
        if (C29601cY.A04(num, 4, 4, A1X)) {
            C29591cX.A01(A0R, "card_expiry_year", num);
        }
        if (C29601cY.A04(str, 1, 10000, A1X)) {
            C29591cX.A01(A0R, "token", str);
        }
        r10.A0H(new C175408yf(this.A02, this.A05, this.A03, this, 7), C29591cX.A00(A0R, A0Y), A062, C20113A7w.A0L);
    }
}
