package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.3SG  reason: invalid class name */
public final class AnonymousClass3SG extends ConstraintLayout implements AnonymousClass009 {
    public C03610Iy A00;
    public C24921Me A01;
    public C27201Vd A02;
    public AnonymousClass11C A03;
    public C18000vb A04;
    public AnonymousClass1VU A05;
    public C18030ve A06;
    public C18010vc A07;
    public C28931bI A08;
    public C28931bI A09;
    public C28931bI A0A;
    public WDSButton A0B;
    public WDSButton A0C;
    public AnonymousClass031 A0D;
    public boolean A0E;
    public LinearLayout A0F;
    public TextEmojiLabel A0G;
    public TextEmojiLabel A0H;
    public WaImageView A0I;
    public C28931bI A0J;
    public C28931bI A0K;
    public final C18100vl A0L;

    public AnonymousClass3SG(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        if (!this.A0E) {
            this.A0E = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A06 = AnonymousClass10E.A8r(A0O);
            this.A02 = AnonymousClass3MZ.A0i(A0O);
            this.A05 = AnonymousClass3MZ.A0s(A0O);
            this.A07 = AnonymousClass3Ma.A0r(A0O);
            this.A03 = AnonymousClass3Ma.A0a(A0O);
            this.A01 = AnonymousClass3MZ.A0g(A0O);
            this.A04 = AnonymousClass10E.A6Q(A0O);
        }
        this.A0L = AnonymousClass1DF.A01(new AnonymousClass5FQ(context));
        View.inflate(context, 2131626002, this);
        this.A0H = AnonymousClass3MX.A0W(this, 2131436208);
        this.A0I = AnonymousClass3MW.A0S(this, 2131427946);
        this.A0G = AnonymousClass3MX.A0W(this, 2131435885);
        this.A0F = (LinearLayout) findViewById(2131436241);
        this.A0K = C72453Mb.A0s(this, 2131436450);
        this.A0B = AnonymousClass3MW.A0r(this, 2131427831);
        this.A0C = AnonymousClass3MW.A0r(this, 2131434468);
        this.A09 = C72453Mb.A0s(this, 2131434195);
        this.A08 = C72453Mb.A0s(this, 2131430785);
        this.A0A = C72453Mb.A0s(this, 2131434612);
        C72473Md.A0z(this);
        AnonymousClass3MY.A14(getResources(), this, 2131168777);
    }

    public static final void setupButtons$lambda$10(C87284Uz r1, View view) {
        C18070vi.A0d(r1, 0);
        r1.A05.invoke(r1.A02, C82904Cp.REJECT);
    }

    public static final void setupButtons$lambda$11(C87284Uz r1, View view) {
        C18070vi.A0d(r1, 0);
        r1.A05.invoke(r1.A02, C82904Cp.CANCEL);
    }

    public static final void setupButtons$lambda$9(C87284Uz r1, View view) {
        C18070vi.A0d(r1, 0);
        r1.A05.invoke(r1.A02, C82904Cp.APPROVE);
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setContactPhotos(C27201Vd r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setPathDrawableHelper(AnonymousClass1VU r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setSharedPreferencesFactory(C18010vc r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWaContactNames(C24921Me r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    private final void A00(C28931bI r4) {
        C28931bI r0 = this.A0J;
        if (r0 != null && r0.A01() == 0) {
            ViewGroup.LayoutParams A032 = r4.A03();
            C18070vi.A0z(A032, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A032;
            marginLayoutParams.topMargin = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131168776);
            r4.A06(marginLayoutParams);
        }
    }

    private final void setCompletedUi(int i) {
        int i2;
        int i3;
        int A002;
        TextView A0M;
        int A0D2 = C72453Mb.A0D(this.A0B);
        WDSButton wDSButton = this.A0C;
        if (wDSButton != null) {
            wDSButton.setVisibility(A0D2);
        }
        C28931bI r0 = this.A09;
        if (r0 != null) {
            r0.A04(A0D2);
        }
        C28931bI r5 = this.A0A;
        if (r5 != null) {
            r5.A04(0);
        }
        if (i != 2) {
            if (i == 3) {
                i2 = 2131231561;
                i3 = 2131891960;
            } else if (i == 4) {
                i2 = 2131231561;
                i3 = 2131891959;
            } else {
                return;
            }
            A002 = 2131101148;
        } else {
            i2 = 2131231562;
            i3 = 2131891958;
            A002 = AnonymousClass1YL.A00(getContext(), 2130970019, 2131101150);
        }
        if (r5 != null && (A0M = AnonymousClass3MX.A0M(r5)) != null) {
            A0M.setText(A0M.getResources().getText(i3));
            C72453Mb.A17(A0M.getContext(), A0M, i2);
            AnonymousClass3MX.A1C(A0M.getContext(), A0M, A002);
        }
    }

    private final void setupButtons(C87284Uz r5) {
        WDSButton wDSButton;
        int i;
        C28931bI r0 = this.A09;
        if (r0 != null) {
            r0.A04(8);
        }
        C28931bI r02 = this.A0A;
        if (r02 != null) {
            r02.A04(8);
        }
        C28931bI r03 = this.A08;
        if (r03 != null) {
            r03.A04(8);
        }
        int ordinal = r5.A01.ordinal();
        if (ordinal == 0) {
            WDSButton wDSButton2 = this.A0B;
            if (wDSButton2 != null) {
                wDSButton2.setVisibility(0);
            }
            wDSButton = this.A0C;
            if (wDSButton != null) {
                wDSButton.setVisibility(0);
            }
            if (wDSButton2 != null) {
                AnonymousClass3MY.A0w(getContext(), wDSButton2, 2131892308);
            }
            if (wDSButton != null) {
                AnonymousClass3MY.A0w(getContext(), wDSButton, 2131892314);
            }
            if (wDSButton2 != null) {
                C89894dC.A00(wDSButton2, r5, 31);
            }
            if (wDSButton != null) {
                i = 32;
            } else {
                return;
            }
        } else if (ordinal == 1) {
            WDSButton wDSButton3 = this.A0B;
            if (wDSButton3 != null) {
                wDSButton3.setVisibility(8);
            }
            wDSButton = this.A0C;
            if (wDSButton != null) {
                AnonymousClass3MY.A0w(AnonymousClass3MX.A04(wDSButton, this, 0), wDSButton, 2131892309);
                i = 33;
            } else {
                return;
            }
        } else {
            return;
        }
        C89894dC.A00(wDSButton, r5, i);
    }

    private final void setupDescription(C87284Uz r9) {
        View A022;
        TextEmojiLabel A0W;
        String str = r9.A02.A05;
        if (str == null || str.length() == 0) {
            AnonymousClass3Ma.A1M(this.A0J);
            return;
        }
        C28931bI A0s = C72453Mb.A0s(AnonymousClass3MY.A0I(this.A0K, 0), 2131429927);
        this.A0J = A0s;
        A0s.A04(0);
        C28931bI r0 = this.A0J;
        if (r0 != null && (A022 = r0.A02()) != null && (A0W = AnonymousClass3MX.A0W(A022, 2131432467)) != null) {
            AnonymousClass11C systemServices = getSystemServices();
            C18010vc sharedPreferencesFactory = getSharedPreferencesFactory();
            A0W.A0S(AnonymousClass3MW.A09(C26302CxJ.A02(str, getResources().getDimension(2131169436), AnonymousClass3MZ.A02(getContext(), getContext(), 2130970817, 2131102224), C26302CxJ.A00(systemServices, sharedPreferencesFactory), false)), (List) null, 0, false);
        }
    }

    private final void setupHiddenSubgroupSignal(C87284Uz r4) {
        if (r4.A02.A08 && AnonymousClass3MX.A1Z(getAbProps())) {
            C28931bI A0s = C72453Mb.A0s(AnonymousClass3MY.A0I(this.A0K, 0), 2131432469);
            A0s.A04(0);
            A00(A0s);
        }
    }

    private final void setupParticipantCount(C87284Uz r9) {
        long j = r9.A02.A01;
        if (j > 0 && r9.A01 != AnonymousClass4CT.MEMBER) {
            C28931bI A0p = AnonymousClass3MW.A0p(C72453Mb.A0s(AnonymousClass3MY.A0I(this.A0K, 0), 2131432470).A02());
            A0p.A04(0);
            TextView A0E2 = C17880vN.A0E(this, 2131432471);
            C18000vb whatsAppLocale = getWhatsAppLocale();
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass3MX.A1S(A1a, 0, j);
            A0E2.setText(whatsAppLocale.A0K(A1a, 2131755314, j));
            A00(A0p);
        }
    }

    private final void setupProfilePic(C87284Uz r6) {
        WaImageView waImageView = this.A0I;
        if (waImageView != null) {
            getContactPhotosLoader().A08(waImageView, r6.A04, -1.0f, getResources().getDimensionPixelSize(2131166074));
        }
    }

    private final void setupSubTitle(C87284Uz r12) {
        String A0I2;
        Resources resources;
        int i;
        Object[] objArr;
        TextEmojiLabel textEmojiLabel = this.A0G;
        if (textEmojiLabel != null) {
            int ordinal = r12.A01.ordinal();
            if (ordinal == 0) {
                A0I2 = getWaContactNames().A0I(r12.A03);
                resources = getResources();
                i = 2131891954;
                objArr = new Object[1];
            } else if (ordinal == 1) {
                resources = getResources();
                i = 2131891961;
                objArr = new Object[1];
                A0I2 = AnonymousClass11X.A00.A06(getWhatsAppLocale(), r12.A02.A00 * 1000);
            } else {
                throw AnonymousClass3MW.A14();
            }
            textEmojiLabel.A0S(AnonymousClass3MW.A0x(resources, A0I2, objArr, 0, i), (List) null, 0, false);
        }
    }

    private final void setupTitle(C87284Uz r3) {
        TextEmojiLabel textEmojiLabel = this.A0H;
        if (textEmojiLabel != null) {
            C72453Mb.A1L(textEmojiLabel, r3.A02.A06);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0D;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0D = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1FU getActivity() {
        return (AnonymousClass1FU) this.A0L.getValue();
    }

    public final C27201Vd getContactPhotos() {
        C27201Vd r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }

    public final AnonymousClass1VU getPathDrawableHelper() {
        AnonymousClass1VU r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pathDrawableHelper");
        throw null;
    }

    public final C18010vc getSharedPreferencesFactory() {
        C18010vc r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sharedPreferencesFactory");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final C24921Me getWaContactNames() {
        C24921Me r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContactNames");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    private final void setupPopupMenu(C87284Uz r12) {
        C03610Iy r5;
        String A0I2 = getWaContactNames().A0I(r12.A03);
        LinearLayout linearLayout = this.A0F;
        if (linearLayout != null) {
            r5 = new C03610Iy(linearLayout.getContext(), linearLayout, 8388611, 0, 2132084874);
        } else {
            r5 = null;
        }
        this.A00 = r5;
        if (r5 != null) {
            r5.A03.add((CharSequence) getActivity().getResources().getString(2131892049, AnonymousClass000.A1b(A0I2, 1)));
        }
        C03610Iy r2 = this.A00;
        if (r2 != null) {
            r2.A01 = new C91164fF((Object) r12, (Object) this, 1);
        }
        if (linearLayout != null) {
            C90004dN.A00(linearLayout, this, r12, 10);
        }
    }

    public static final void setupPopupMenu$lambda$2(AnonymousClass3SG r2, C87284Uz r3, View view) {
        C03610Iy r0;
        C18070vi.A0h(r2, r3);
        if (r3.A01 == AnonymousClass4CT.ADMIN && (r0 = r2.A00) != null) {
            r0.A00();
        }
    }

    public final void A07(C87284Uz r3) {
        C28931bI r1;
        setupPopupMenu(r3);
        setupProfilePic(r3);
        setupTitle(r3);
        setupSubTitle(r3);
        setupDescription(r3);
        setupParticipantCount(r3);
        setupHiddenSubgroupSignal(r3);
        int i = r3.A00;
        if (i != 0) {
            if (i == 1) {
                int A0D2 = C72453Mb.A0D(this.A0B);
                WDSButton wDSButton = this.A0C;
                if (wDSButton != null) {
                    wDSButton.setVisibility(A0D2);
                }
                C28931bI r0 = this.A0A;
                if (r0 != null) {
                    r0.A04(A0D2);
                }
                r1 = this.A09;
            } else if (i == 2 || i == 3 || i == 4) {
                setCompletedUi(i);
                return;
            } else if (i == 5) {
                int A0D3 = C72453Mb.A0D(this.A0B);
                WDSButton wDSButton2 = this.A0C;
                if (wDSButton2 != null) {
                    wDSButton2.setVisibility(A0D3);
                }
                C28931bI r02 = this.A09;
                if (r02 != null) {
                    r02.A04(A0D3);
                }
                C28931bI r03 = this.A0A;
                if (r03 != null) {
                    r03.A04(A0D3);
                }
                r1 = this.A08;
            } else {
                return;
            }
            if (r1 != null) {
                r1.A04(0);
                return;
            }
            return;
        }
        setupButtons(r3);
    }

    public final C37451pZ getContactPhotosLoader() {
        Activity A002 = C18050vg.A00(getContext());
        if (A002 instanceof AnonymousClass5YT) {
            return ((AnonymousClass5YT) A002).getContactPhotosLoader();
        }
        C37451pZ A062 = getContactPhotos().A06(getContext(), "rich-message-welcome-card");
        C18070vi.A0b(A062);
        return A062;
    }
}
