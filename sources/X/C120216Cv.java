package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.6Cv  reason: invalid class name and case insensitive filesystem */
public final class C120216Cv extends C120236Cx {
    public C36361nl A00;
    public C18000vb A01;
    public C1596085e A02;
    public C36731oN A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public ImageView A07;
    public C1418177b A08;
    public boolean A09;
    public final LinearLayout A0A = ((LinearLayout) AnonymousClass3MX.A0C(this, 2131434076));
    public final ViewStub A0B = ((ViewStub) AnonymousClass3MX.A0C(this, 2131434081));
    public final FrameLayout A0C = ((FrameLayout) AnonymousClass3MX.A0C(this, 2131431496));
    public final ImageView A0D = C108975cc.A0B(this, 2131428409);
    public final TextView A0E = C72453Mb.A0W(this, 2131428265);
    public final TextView A0F = C72453Mb.A0W(this, 2131428411);
    public final TextView A0G = C72453Mb.A0W(this, 2131430949);
    public final TextView A0H = C72453Mb.A0W(this, 2131436208);
    public final Toolbar A0I = ((Toolbar) AnonymousClass3MX.A0C(this, 2131436270));
    public final AnonymousClass1GP A0J;
    public final AppBarLayout A0K = ((AppBarLayout) AnonymousClass3MX.A0C(this, 2131427815));
    public final WDSButton A0L = ((WDSButton) AnonymousClass3MX.A0C(this, 2131428613));
    public final WDSButton A0M = ((WDSButton) AnonymousClass3MX.A0C(this, 2131428617));

    public C120216Cv(Context context, AnonymousClass1GP r5) {
        super(context);
        A01();
        A01();
        this.A0J = r5;
        LayoutInflater.from(context).inflate(2131626600, this, true);
        setOrientation(1);
    }

    public final void setBulletViewFactory(C1596085e r2) {
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

    public void A00(C1418177b r31, int i, int i2) {
        String str;
        String str2;
        ViewStub viewStub = this.A0B;
        C1418177b r1 = r31;
        if (viewStub.getParent() != null) {
            getUiUtils().get();
            View A002 = AnonymousClass728.A00(viewStub, r1.A03);
            if (A002 != null) {
                this.A07 = (ImageView) A002;
            }
        }
        C1416776n r5 = r1.A04;
        AppBarLayout appBarLayout = this.A0K;
        Toolbar toolbar = this.A0I;
        FrameLayout frameLayout = this.A0C;
        Context context = getContext();
        C18000vb whatsAppLocale = getWhatsAppLocale();
        AnonymousClass1GP r2 = this.A0J;
        AnonymousClass1GP r29 = r2;
        ((AnonymousClass728) getUiUtils().get()).A02(context, frameLayout, toolbar, r2, appBarLayout, whatsAppLocale, r5);
        int i3 = i;
        ((AnonymousClass728) getUiUtils().get()).A03(AnonymousClass3MY.A04(this), this.A07, r1.A03, i3);
        AnonymousClass728 r4 = (AnonymousClass728) getUiUtils().get();
        Context A042 = AnonymousClass3MY.A04(this);
        AnonymousClass77L r10 = r1.A02;
        ImageView imageView = this.A0D;
        if (imageView != null) {
            int i4 = 8;
            if (r10 != null) {
                i4 = 0;
            }
            imageView.setVisibility(i4);
            if (r10 != null) {
                if (C28281Zt.A0B(A042)) {
                    str2 = r10.A03;
                } else {
                    str2 = r10.A04;
                }
                if (str2 != null) {
                    C88284Zb A003 = AnonymousClass4HI.A00(A042, r10.A00, r10.A01);
                    int A022 = AnonymousClass3Ma.A02(imageView, 2131166520);
                    String str3 = r10.A06;
                    C134866rH r3 = new C134866rH(0, AnonymousClass00R.A00);
                    ((C132666nJ) C18070vi.A0E(r4.A00)).A00(A042, imageView, r3, A003, (Float) null, r10.A02, str2, str3, i3, A022, A022);
                }
            }
        }
        Context A043 = AnonymousClass3MY.A04(this);
        String str4 = r1.A07;
        ((AnonymousClass728) C18070vi.A0E(getUiUtils())).A04(A043, this.A0F, getUserNoticeActionHandler(), str4, (String) null, false);
        Context A044 = AnonymousClass3MY.A04(this);
        String str5 = r1.A0C;
        TextView textView = this.A0H;
        ((AnonymousClass728) C18070vi.A0E(getUiUtils())).A04(A044, textView, getUserNoticeActionHandler(), str5, (String) null, false);
        Context A045 = AnonymousClass3MY.A04(this);
        String str6 = r1.A06;
        ((AnonymousClass728) C18070vi.A0E(getUiUtils())).A04(A045, this.A0E, getUserNoticeActionHandler(), str6, (String) null, false);
        AnonymousClass776[] r12 = r1.A0D;
        LinearLayout linearLayout = this.A0A;
        int length = r12.length;
        linearLayout.setVisibility(C72453Mb.A02(length));
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            AnonymousClass776 r7 = r12[i5];
            int i7 = i6 + 1;
            C1596085e bulletViewFactory = getBulletViewFactory();
            Context A046 = AnonymousClass3MY.A04(this);
            C27701Xd r6 = ((AnonymousClass7L0) bulletViewFactory).A00;
            C27691Xc r42 = r6.A01;
            C110575gG r17 = new C110575gG(A046, (C132666nJ) r42.A0X.get(), (AnonymousClass728) r42.A0Y.get(), (C36731oN) r6.A00.A00.A56.get(), i6);
            AnonymousClass77L r43 = r7.A00;
            if (r43 != null) {
                if (C28281Zt.A0B(r17.getContext())) {
                    str = r43.A03;
                } else {
                    str = r43.A04;
                }
                String str7 = r43.A06;
                int dimensionPixelSize = r17.getResources().getDimensionPixelSize(2131166523);
                if (str != null) {
                    r17.A04.A00(AnonymousClass3MY.A04(r17), r17.A00, new C134866rH(r17.A03, AnonymousClass00R.A01), (C88284Zb) null, (Float) null, (Integer) null, str, str7, i3, dimensionPixelSize, dimensionPixelSize);
                }
            }
            String str8 = r7.A01;
            if (str8.length() > 0) {
                String str9 = r7.A02;
                if (str9 == null || str9.length() == 0) {
                    r17.setText((String) null);
                } else {
                    r17.setText(str8);
                    str8 = str9;
                }
                r17.setSecondaryText(str8);
            } else {
                r17.setText((String) null);
                r17.setSecondaryText((String) null);
            }
            r17.setItemPaddingIfNeeded(AnonymousClass000.A1U(i6, length - 1));
            linearLayout.addView(r17);
            i5++;
            i6 = i7;
        }
        Context A047 = AnonymousClass3MY.A04(this);
        String str10 = r1.A08;
        ((AnonymousClass728) C18070vi.A0E(getUiUtils())).A04(A047, this.A0G, getUserNoticeActionHandler(), str10, (String) null, true);
        C108955ca.A1S(getUiUtils());
        AnonymousClass1GP r72 = r29;
        AnonymousClass728.A01(getContext(), r72, getLinkLauncher(), r1.A00, this.A0L, (C18090vk) null);
        AnonymousClass771 r44 = r1.A01;
        if (r44 != null) {
            getUiUtils().get();
            AnonymousClass1GP r8 = r29;
            AnonymousClass728.A01(getContext(), r8, getLinkLauncher(), r44, this.A0M, new AnonymousClass7w8(this, i3, i2));
        }
        AnonymousClass1Y5.A0A(textView, true);
        this.A08 = r1;
    }

    public void A01() {
        if (!this.A09) {
            this.A09 = true;
            C27691Xc r3 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            this.A02 = (C1596085e) r3.A0F.get();
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

    public final C1596085e getBulletViewFactory() {
        C1596085e r0 = this.A02;
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

    public final AnonymousClass1GP getFragmentManager() {
        return this.A0J;
    }
}
