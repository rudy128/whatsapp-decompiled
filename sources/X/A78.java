package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;

public final class A78 {
    public final C24751Ln A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass00H A02;

    public boolean A04(UserJid userJid) {
        PhoneUserJid A002;
        if (userJid instanceof PhoneUserJid) {
            String str = userJid.user;
            this.A02.get();
            if (str == null || !str.startsWith(String.valueOf(91))) {
                return false;
            }
            return true;
        }
        if (userJid instanceof AnonymousClass1E2) {
            A002 = this.A00.A0D((AnonymousClass1E1) userJid);
            if (A002 == null) {
                return true;
            }
        } else if ((userJid instanceof AnonymousClass1E5) || (userJid instanceof C173468v7)) {
            A002 = AnonymousClass11S.A00(this.A01);
        }
        return A04(A002);
        return false;
    }

    public static int A00(C42741yf r1) {
        if (r1 == null) {
            return 1;
        }
        if (r1.A02()) {
            return 3;
        }
        if (!r1.A03()) {
            return 1;
        }
        return 2;
    }

    public static SpannableString A01(Context context, AE5 ae5, A6S a6s, C18000vb r5, BigDecimal bigDecimal, Date date) {
        if (bigDecimal == null || a6s == null) {
            return AnonymousClass8BU.A09(context, 2131886743);
        }
        String A03 = a6s.A03(r5, bigDecimal, true);
        if (ae5 == null || !ae5.A00(date)) {
            return new SpannableString(A03);
        }
        return A02(A03, a6s.A03(r5, ae5.A00, true));
    }

    public A78(AnonymousClass11S r1, C24751Ln r2, AnonymousClass00H r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public static SpannableString A02(String str, String str2) {
        SpannableString spannableString = new SpannableString(AnonymousClass001.A1H("  ", str, AnonymousClass000.A11(str2)));
        spannableString.setSpan(new StrikethroughSpan(), str2.length() + 1, spannableString.length(), 33);
        return spannableString;
    }

    public static boolean A03(Locale locale) {
        String upperCase = locale.getCountry().toUpperCase();
        String country = Locale.UK.getCountry();
        String country2 = Locale.US.getCountry();
        if (upperCase.equalsIgnoreCase(country) || upperCase.equalsIgnoreCase(country2)) {
            return true;
        }
        return false;
    }
}
