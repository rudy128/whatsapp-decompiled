package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.728  reason: invalid class name */
public final class AnonymousClass728 {
    public final AnonymousClass00H A00;
    public final AnonymousClass11C A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    public final void A04(Context context, TextView textView, C36731oN r11, String str, String str2, boolean z) {
        String str3;
        C18070vi.A0k(textView, r11);
        SpannableString spannableString = null;
        if (str != null) {
            C128656gT r1 = (C128656gT) this.A03.get();
            C41661wr r0 = r1.A02;
            C1583680k r4 = new C1583680k(r1);
            int i = 0;
            C133636pE A022 = r0.A02(str, 0);
            if (A022 == null) {
                str3 = str.toString();
            } else {
                int length = str.length();
                StringBuilder sb = new StringBuilder(length);
                do {
                    sb.append(str, i, A022.A00().A00);
                    sb.append((CharSequence) r4.invoke(A022));
                    i = A022.A00().A01 + 1;
                    A022 = A022.A01();
                    if (i >= length) {
                        break;
                    }
                } while (A022 != null);
                if (i < length) {
                    sb.append(str, i, length);
                }
                str3 = C18070vi.A0H(sb);
            }
        } else {
            str3 = null;
        }
        AnonymousClass3Ma.A1I(textView, this.A02);
        AnonymousClass3MZ.A1Q(textView, this.A01);
        if (str3 != null) {
            spannableString = AnonymousClass4Z3.A00(context, new AnonymousClass7NY(context, r11), Boolean.valueOf(z), str3);
        }
        textView.setText(spannableString);
        int i2 = 0;
        if (C18070vi.A18(str2, "large")) {
            textView.setTextSize(0, AnonymousClass3MW.A00(textView.getResources(), 2131169432));
            AnonymousClass3MX.A1C(context, textView, 2131103154);
        }
        CharSequence text = textView.getText();
        if (text == null || text.length() == 0) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public static final View A00(ViewStub viewStub, AnonymousClass77L r3) {
        View A0G;
        int i;
        if (r3 == null) {
            return null;
        }
        if (C18070vi.A18(r3.A06, "lottie")) {
            A0G = AnonymousClass3MY.A0G(viewStub, 2131626598);
            i = 2131434079;
        } else {
            A0G = AnonymousClass3MY.A0G(viewStub, 2131626597);
            i = 2131434080;
        }
        return AnonymousClass1HF.A06(A0G, i);
    }

    public final void A03(Context context, ImageView imageView, AnonymousClass77L r18, int i) {
        String str;
        float f;
        ImageView imageView2 = imageView;
        if (imageView != null) {
            AnonymousClass77L r1 = r18;
            if (r18 == null) {
                imageView2.setVisibility(8);
                return;
            }
            Context context2 = context;
            if (C28281Zt.A0B(context2)) {
                str = r1.A03;
            } else {
                str = r1.A04;
            }
            if (str != null) {
                C88284Zb A002 = AnonymousClass4HI.A00(context2, r1.A00, r1.A01);
                int i2 = 2131166533;
                if (A002 == null) {
                    i2 = 2131166532;
                }
                int A022 = AnonymousClass3Ma.A02(imageView2, i2);
                String str2 = r1.A05;
                Float f2 = null;
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != 102742843) {
                        if (hashCode != 109548807) {
                            if (hashCode == 1544803905 && str2.equals(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID)) {
                                f = 112.0f;
                            }
                        } else if (str2.equals("small")) {
                            f = 90.0f;
                        }
                    } else if (str2.equals("large")) {
                        f = 150.0f;
                    }
                    f2 = Float.valueOf(f);
                }
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -2;
                    imageView2.setLayoutParams(layoutParams);
                    ((C132666nJ) C18070vi.A0E(this.A00)).A00(context2, imageView2, new C134866rH(0, AnonymousClass00R.A00), A002, f2, r1.A02, str, r1.A06, i, A022, A022);
                    return;
                }
                throw AnonymousClass3MY.A0k();
            }
        }
    }

    public AnonymousClass728(AnonymousClass11C r1, C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r1, r3, r4);
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
        this.A03 = r4;
    }

    public static final void A01(Context context, AnonymousClass1GP r6, C36361nl r7, AnonymousClass771 r8, WDSButton wDSButton, C18090vk r10) {
        boolean A1Z = C72453Mb.A1Z(wDSButton);
        C18070vi.A0d(r6, 2);
        wDSButton.setVisibility(A1Z ? 1 : 0);
        wDSButton.setText(Html.fromHtml(r8.A01).toString());
        C18090vk r1 = r10;
        wDSButton.setOnClickListener(new AnonymousClass78H(r1, r8, r6, context, r7, 5));
    }

    public final void A02(Context context, FrameLayout frameLayout, Toolbar toolbar, AnonymousClass1GP r9, AppBarLayout appBarLayout, C18000vb r11, C1416776n r12) {
        int dimensionPixelSize;
        C18070vi.A0j(appBarLayout, toolbar);
        C18070vi.A0d(r9, 6);
        if (context != null) {
            C89964dJ r4 = new C89964dJ(r9, 13);
            boolean z = false;
            if (r12 == null || !r12.A00) {
                appBarLayout.setVisibility(8);
                toolbar.setVisibility(8);
            } else {
                appBarLayout.setVisibility(0);
                toolbar.setVisibility(0);
                C74743cP A002 = AnonymousClass3NL.A00(context, r11, 2131231814);
                A002.setColorFilter(AnonymousClass3Ma.A01(context, context.getResources(), 2130969324, 2131100309), PorterDuff.Mode.SRC_ATOP);
                toolbar.setNavigationIcon((Drawable) A002);
                toolbar.setNavigationOnClickListener(r4);
                z = true;
            }
            if (frameLayout != null) {
                C39351sv A012 = C43531zx.A01(frameLayout);
                if (z) {
                    dimensionPixelSize = 0;
                } else {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166529);
                }
                A012.A03 = dimensionPixelSize;
                C43531zx.A03(frameLayout, A012);
            }
        }
    }
}
