package X;

import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.jid.PhoneUserJid;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.2xe  reason: invalid class name and case insensitive filesystem */
public class C66112xe implements AnonymousClass191 {
    public final AnonymousClass11S A00;
    public final AnonymousClass11C A01;
    public final AnonymousClass00H A02;

    public /* synthetic */ void Blg() {
    }

    public void Blf() {
        AnonymousClass11S r1 = this.A00;
        r1.A0I();
        if (r1.A00 != null) {
            PhoneUserJid A012 = AnonymousClass11S.A01(r1);
            C40751vD r3 = (C40751vD) this.A02.get();
            String str = A012.user;
            if (!TextUtils.isEmpty(str) && !r3.A00) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("https://www.whatsapp.com/android/");
                A10.append(str.substring(str.length() - 1));
                String A0y = AnonymousClass000.A0y("/", A10);
                C17900vP.A0f("upgrade source initialized; path=", A0y, AnonymousClass000.A10());
                try {
                    C40751vD.A0B = new URL(AnonymousClass000.A0y("WhatsApp.apk", AnonymousClass000.A11(A0y)));
                    C40751vD.A0C = new URL(AnonymousClass000.A0y("WhatsApp.sha256", AnonymousClass000.A11(A0y)));
                    C40751vD.A0D = new URL(AnonymousClass000.A0y("WhatsApp.version", AnonymousClass000.A11(A0y)));
                    r3.A00 = true;
                } catch (MalformedURLException e) {
                    throw new AssertionError(e);
                }
            }
        }
        try {
            AnonymousClass11B A0O = this.A01.A0O();
            if (A0O != null && Settings.Secure.getInt(A0O.A00, "install_non_market_apps") == 1) {
                C40751vD r5 = (C40751vD) this.A02.get();
                if (r5.A00) {
                    int A03 = r5.A02.A03(true);
                    if ((A03 == 1 || (AnonymousClass2TA.A00(r5.A06, A03) & 4) != 0) && C17890vO.A05(C17890vO.A0B(r5.A06), "last_upgrade_check") + 21600000 <= System.currentTimeMillis()) {
                        r5.A07.CGF(new C70603Bt(r5, 37));
                    }
                }
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
    }

    public C66112xe(AnonymousClass11S r1, AnonymousClass11C r2, AnonymousClass00H r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Ba9() {
    }
}
