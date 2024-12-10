package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.6Cu  reason: invalid class name and case insensitive filesystem */
public final class C120206Cu extends C120236Cx {
    public ImageView A00;
    public C36361nl A01;
    public C18000vb A02;
    public C1595985d A03;
    public C1418177b A04;
    public C36731oN A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public boolean A09;
    public final ViewStub A0A = ((ViewStub) AnonymousClass3MX.A0C(this, 2131434081));
    public final FrameLayout A0B = ((FrameLayout) AnonymousClass3MX.A0C(this, 2131431496));
    public final LinearLayout A0C = ((LinearLayout) AnonymousClass3MX.A0C(this, 2131434076));
    public final TextView A0D = C72453Mb.A0W(this, 2131428265);
    public final TextView A0E = C72453Mb.A0W(this, 2131430949);
    public final TextView A0F = C72453Mb.A0W(this, 2131436208);
    public final Toolbar A0G = ((Toolbar) AnonymousClass3MX.A0C(this, 2131436270));
    public final AnonymousClass1GP A0H;
    public final AppBarLayout A0I = ((AppBarLayout) AnonymousClass3MX.A0C(this, 2131427815));
    public final WDSButton A0J = ((WDSButton) AnonymousClass3MX.A0C(this, 2131428613));
    public final WDSButton A0K = ((WDSButton) AnonymousClass3MX.A0C(this, 2131428617));

    public C120206Cu(Context context, AnonymousClass1GP r5) {
        super(context);
        A01();
        A01();
        this.A0H = r5;
        LayoutInflater.from(context).inflate(2131626599, this, true);
        setOrientation(1);
    }

    public final void setBulletViewFactory(C1595985d r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setImageLoader(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setLinkLauncher(C36361nl r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setPrivacyDisclosureLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setUiUtils(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setUserNoticeActionHandler(C36731oN r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public void A01() {
        if (!this.A09) {
            this.A09 = true;
            C27691Xc r3 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            this.A03 = (C1595985d) r3.A0D.get();
            AnonymousClass10E r2 = r3.A10;
            AnonymousClass10G r1 = r2.A00;
            this.A06 = C000200d.A00(r1.AEt);
            this.A01 = C108985cd.A0N(r2);
            this.A07 = C000200d.A00(r2.A8g);
            this.A08 = C000200d.A00(r3.A0Y);
            this.A05 = (C36731oN) r1.A56.get();
            this.A02 = AnonymousClass10E.A6Q(r2);
        }
    }

    public final C1595985d getBulletViewFactory() {
        C1595985d r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("bulletViewFactory");
        throw null;
    }

    public final AnonymousClass00H getImageLoader() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("imageLoader");
        throw null;
    }

    public final C36361nl getLinkLauncher() {
        C36361nl r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkLauncher");
        throw null;
    }

    public final AnonymousClass00H getPrivacyDisclosureLogger() {
        AnonymousClass00H r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("privacyDisclosureLogger");
        throw null;
    }

    public final AnonymousClass00H getUiUtils() {
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("uiUtils");
        throw null;
    }

    public final C36731oN getUserNoticeActionHandler() {
        C36731oN r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("userNoticeActionHandler");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final AnonymousClass1GP getFragmentManager() {
        return this.A0H;
    }
}
