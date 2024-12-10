package X;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.TextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.6Cw  reason: invalid class name and case insensitive filesystem */
public final class C120226Cw extends C120236Cx {
    public C36361nl A00;
    public C18000vb A01;
    public C1595985d A02;
    public C36731oN A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public C1418177b A07;
    public boolean A08;
    public final TextView A09;
    public final AnonymousClass1GP A0A;
    public final WDSButton A0B = ((WDSButton) AnonymousClass3MX.A0C(this, 2131428614));

    public C120226Cw(Context context, AnonymousClass1GP r5) {
        super(context);
        A01();
        A01();
        this.A0A = r5;
        LayoutInflater.from(context).inflate(2131626596, this, true);
        setOrientation(1);
        TextView A0W = C72453Mb.A0W(this, 2131436042);
        this.A09 = A0W;
        AnonymousClass1Y5.A0A(A0W, true);
    }

    private final void setupButton(AnonymousClass771 r2, WDSButton wDSButton) {
        wDSButton.setVisibility(0);
        Spanned fromHtml = Html.fromHtml(r2.A01);
        C18070vi.A0X(fromHtml);
        wDSButton.setText(fromHtml.toString());
        C90024dP.A00(wDSButton, r2, this, 0);
    }

    public final void setBulletViewFactory(C1595985d r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setImageLoader(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setLinkLauncher(C36361nl r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setPrivacyDisclosureLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setUiUtils(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setUserNoticeActionHandler(C36731oN r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public void A01() {
        if (!this.A08) {
            this.A08 = true;
            C27691Xc r3 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            this.A02 = (C1595985d) r3.A0D.get();
            AnonymousClass10E r2 = r3.A10;
            AnonymousClass10G r1 = r2.A00;
            this.A04 = C000200d.A00(r1.AEt);
            this.A00 = C108985cd.A0N(r2);
            this.A05 = C000200d.A00(r2.A8g);
            this.A06 = C000200d.A00(r3.A0Y);
            this.A03 = (C36731oN) r1.A56.get();
            this.A01 = AnonymousClass10E.A6Q(r2);
        }
    }

    public final C1595985d getBulletViewFactory() {
        C1595985d r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("bulletViewFactory");
        throw null;
    }

    public final AnonymousClass00H getImageLoader() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("imageLoader");
        throw null;
    }

    public final C36361nl getLinkLauncher() {
        C36361nl r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkLauncher");
        throw null;
    }

    public final AnonymousClass00H getPrivacyDisclosureLogger() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("privacyDisclosureLogger");
        throw null;
    }

    public final AnonymousClass00H getUiUtils() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("uiUtils");
        throw null;
    }

    public final C36731oN getUserNoticeActionHandler() {
        C36731oN r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("userNoticeActionHandler");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public static final void setupButton$lambda$2(AnonymousClass771 r2, C120226Cw r3, View view) {
        AnonymousClass1GP r0;
        Integer num;
        C18070vi.A0h(r2, r3);
        List list = C139476yu.A02;
        String str = r2.A00;
        if (list.contains(str)) {
            num = AnonymousClass00R.A01;
            switch (str.hashCode()) {
                case -1956801605:
                    if (str.equals("OPTOUT")) {
                        num = AnonymousClass00R.A0j;
                        break;
                    }
                    break;
                case -1905312150:
                    if (str.equals("DISMISS")) {
                        num = AnonymousClass00R.A0N;
                        break;
                    }
                    break;
                case 2094604:
                    if (str.equals("DENY")) {
                        num = AnonymousClass00R.A0C;
                        break;
                    }
                    break;
                case 75424504:
                    if (str.equals("OPTIN")) {
                        num = AnonymousClass00R.A0Y;
                        break;
                    }
                    break;
                case 1924835592:
                    if (str.equals("ACCEPT")) {
                        num = AnonymousClass00R.A00;
                        break;
                    }
                    break;
            }
            r0 = r3.A0A;
        } else if (URLUtil.isHttpsUrl(str)) {
            Context context = r3.getContext();
            if (context != null) {
                C72453Mb.A18(context, r3.getLinkLauncher(), str);
                return;
            }
            return;
        } else {
            r0 = r3.A0A;
            num = AnonymousClass00R.A01;
        }
        AnonymousClass6XD.A00(r0, num);
    }

    public void A00(C1418177b r8, int i, int i2) {
        ((AnonymousClass728) C18070vi.A0E(getUiUtils())).A04(AnonymousClass3MY.A04(this), this.A09, getUserNoticeActionHandler(), r8.A0C, (String) null, false);
        setupButton(r8.A00, this.A0B);
        this.A07 = r8;
    }

    public final AnonymousClass1GP getFragmentManager() {
        return this.A0A;
    }
}
