package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.WaImageView;

/* renamed from: X.6Cx  reason: invalid class name and case insensitive filesystem */
public abstract class C120236Cx extends C110605gL {
    public void A00(C1418177b r33, int i, int i2) {
        String str;
        C120206Cu r0 = (C120206Cu) this;
        ViewStub viewStub = r0.A0A;
        C1418177b r1 = r33;
        if (viewStub.getParent() != null) {
            r0.getUiUtils().get();
            View A00 = AnonymousClass728.A00(viewStub, r1.A03);
            if (A00 != null) {
                r0.A00 = (ImageView) A00;
            }
        }
        C1416776n r4 = r1.A04;
        AppBarLayout appBarLayout = r0.A0I;
        Toolbar toolbar = r0.A0G;
        FrameLayout frameLayout = r0.A0B;
        Context context = r0.getContext();
        C18000vb whatsAppLocale = r0.getWhatsAppLocale();
        AnonymousClass1GP r2 = r0.A0H;
        AnonymousClass1GP r30 = r2;
        ((AnonymousClass728) r0.getUiUtils().get()).A02(context, frameLayout, toolbar, r2, appBarLayout, whatsAppLocale, r4);
        int i3 = i;
        ((AnonymousClass728) r0.getUiUtils().get()).A03(AnonymousClass3MY.A04(r0), r0.A00, r1.A03, i3);
        Context A04 = AnonymousClass3MY.A04(r0);
        String str2 = r1.A0C;
        TextView textView = r0.A0F;
        ((AnonymousClass728) C18070vi.A0E(r0.getUiUtils())).A04(A04, textView, r0.getUserNoticeActionHandler(), str2, (String) null, false);
        Context A042 = AnonymousClass3MY.A04(r0);
        String str3 = r1.A06;
        TextView textView2 = r0.A0D;
        ((AnonymousClass728) C18070vi.A0E(r0.getUiUtils())).A04(A042, textView2, r0.getUserNoticeActionHandler(), str3, (String) null, false);
        AnonymousClass776[] r9 = r1.A0D;
        LinearLayout linearLayout = r0.A0C;
        int length = r9.length;
        linearLayout.setVisibility(C72453Mb.A02(length));
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            AnonymousClass776 r42 = r9[i4];
            int i6 = i5 + 1;
            C1595985d bulletViewFactory = r0.getBulletViewFactory();
            Context A043 = AnonymousClass3MY.A04(r0);
            C27701Xd r22 = ((C145367Kz) bulletViewFactory).A00;
            C27691Xc r3 = r22.A01;
            C110565gF r222 = new C110565gF(A043, (C132666nJ) r3.A0X.get(), (AnonymousClass728) r3.A0Y.get(), (C36731oN) r22.A00.A00.A56.get(), i5);
            AnonymousClass77L r11 = r42.A00;
            if (r11 != null) {
                if (C28281Zt.A0B(r222.getContext())) {
                    str = r11.A03;
                } else {
                    str = r11.A04;
                }
                String str4 = r11.A06;
                int dimensionPixelSize = r222.getResources().getDimensionPixelSize(2131166523);
                if (str != null) {
                    C132666nJ r15 = r222.A04;
                    Context A044 = AnonymousClass3MY.A04(r222);
                    WaImageView waImageView = r222.A00;
                    r15.A00(A044, waImageView, new C134866rH(r222.A03, AnonymousClass00R.A01), (C88284Zb) null, (Float) null, (Integer) null, str, str4, i3, dimensionPixelSize, dimensionPixelSize);
                }
            }
            r222.setText(r42.A01);
            r222.setSecondaryText(r42.A02);
            r222.setItemPaddingIfNeeded(AnonymousClass000.A1U(i5, length - 1));
            linearLayout.addView(r222);
            i4++;
            i5 = i6;
        }
        Context A045 = AnonymousClass3MY.A04(r0);
        String str5 = r1.A08;
        TextView textView3 = r0.A0E;
        ((AnonymousClass728) C18070vi.A0E(r0.getUiUtils())).A04(A045, textView3, r0.getUserNoticeActionHandler(), str5, r1.A09, false);
        C108955ca.A1S(r0.getUiUtils());
        AnonymousClass1GP r5 = r30;
        AnonymousClass728.A01(r0.getContext(), r5, r0.getLinkLauncher(), r1.A00, r0.A0J, (C18090vk) null);
        AnonymousClass771 r52 = r1.A01;
        if (r52 != null) {
            r0.getUiUtils().get();
            AnonymousClass1GP r8 = r30;
            AnonymousClass728.A01(r0.getContext(), r8, r0.getLinkLauncher(), r52, r0.A0K, new AnonymousClass7w7(r0, i3, i2));
        }
        AnonymousClass1Y5.A0A(textView, true);
        r0.A04 = r1;
    }
}
