package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.ListItemWithRightIcon;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.3Zg  reason: invalid class name and case insensitive filesystem */
public final class C74293Zg extends C42011xT {
    public AnonymousClass1OB A00;
    public final View A01;
    public final C37571pl A02;
    public final AnonymousClass11S A03;
    public final C72043Kk A04;
    public final AnonymousClass1VW A05;
    public final AnonymousClass1M9 A06;
    public final C24921Me A07;
    public final AnonymousClass1CJ A08;
    public final AnonymousClass1MZ A09;
    public final AnonymousClass1KW A0A;
    public final C18030ve A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final C18100vl A0E = AnonymousClass1DF.A01(new C101915El(this));
    public final C18100vl A0F = AnonymousClass1DF.A01(new C101925Em(this));
    public final C18100vl A0G = AnonymousClass1DF.A01(new C101935En(this));
    public final C18100vl A0H = AnonymousClass1DF.A01(new C101945Eo(this));
    public final C18100vl A0I = AnonymousClass1DF.A01(new C101955Ep(this));
    public final C18100vl A0J = AnonymousClass1DF.A01(new C101965Eq(this));
    public final C18100vl A0K = AnonymousClass1DF.A01(new C101975Er(this));
    public final C18600wl A0L;
    public final C18600wl A0M;

    public static final void A00(C74293Zg r4, C37451pZ r5, A2B a2b, AnonymousClass1E7 r7) {
        AnonymousClass1VW r2;
        ImageView A0J2;
        int dimensionPixelSize;
        AnonymousClass1VX r42;
        int i;
        float f;
        if (r4.A08.A06(a2b.A02) == 3) {
            r2 = r4.A05;
            C18100vl r1 = r4.A0F;
            A0J2 = AnonymousClass3MX.A0J(r1);
            i = 2131231044;
            if (C22891Dp.A02) {
                i = 2131231045;
            }
            dimensionPixelSize = AnonymousClass3MW.A0A(r1).getResources().getDimensionPixelSize(2131168739);
            r42 = null;
            f = -2.14748365E9f;
        } else {
            if (a2b.A00 == 6 && !r7.A0g) {
                if (C18020vd.A05(C18040vf.A02, r4.A0B, 5021)) {
                    r2 = r4.A05;
                    C18100vl r0 = r4.A0F;
                    A0J2 = AnonymousClass3MX.A0J(r0);
                    dimensionPixelSize = AnonymousClass3MW.A0A(r0).getResources().getDimensionPixelSize(2131168739);
                    r42 = null;
                    i = 2131231055;
                    f = -1.0f;
                }
            }
            r5.A07(AnonymousClass3MX.A0J(r4.A0F), r7);
            return;
        }
        r2.A0A(A0J2, r42, f, i, dimensionPixelSize);
    }

    public static final void A01(C74293Zg r1, AnonymousClass1E7 r2) {
        WDSProfilePhoto wDSProfilePhoto;
        C42111xd r0;
        if (!r2.A0n || !AnonymousClass3MX.A1Z(r1.A0B)) {
            wDSProfilePhoto = (WDSProfilePhoto) r1.A0F.getValue();
            r0 = null;
        } else {
            wDSProfilePhoto = (WDSProfilePhoto) r1.A0F.getValue();
            r0 = new C42111xd();
        }
        wDSProfilePhoto.setProfileBadge(r0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74293Zg(View view, AnonymousClass11S r7, C72043Kk r8, AnonymousClass1VW r9, AnonymousClass1M9 r10, C24921Me r11, AnonymousClass1CJ r12, AnonymousClass1MZ r13, AnonymousClass1KW r14, C18030ve r15, Integer num, Integer num2, C18600wl r18, C18600wl r19) {
        super(view);
        String str;
        C18070vi.A0w(r15, r7, r12, r14, r9);
        C18070vi.A0q(r10, r11, r13);
        C18070vi.A0d(r8, 9);
        Integer num3 = num;
        Integer num4 = num2;
        C18600wl r3 = r18;
        C18070vi.A0r(num3, num4, r3);
        C18600wl r2 = r19;
        C18070vi.A0d(r2, 14);
        this.A0B = r15;
        this.A03 = r7;
        this.A08 = r12;
        this.A0A = r14;
        this.A05 = r9;
        this.A06 = r10;
        this.A07 = r11;
        this.A09 = r13;
        this.A04 = r8;
        this.A01 = view;
        this.A0C = num3;
        this.A0D = num4;
        this.A0L = r3;
        this.A0M = r2;
        this.A02 = AnonymousClass2SS.A00((AnonymousClass1F9) C72453Mb.A0L(view));
        ImageView A0J2 = AnonymousClass3MX.A0J(this.A0E);
        int intValue = num3.intValue();
        int i = 2131231814;
        if (intValue != 1) {
            i = 2131232282;
            if (intValue != 2) {
                i = 0;
            }
        }
        A0J2.setImageResource(i);
        View A0A2 = AnonymousClass3MW.A0A(this.A0E);
        Context A042 = AnonymousClass3MY.A04(AnonymousClass3MW.A0A(this.A0E));
        if (intValue != 0) {
            str = C18070vi.A0F(A042, intValue != 1 ? 2131891125 : 2131895092);
        } else {
            str = "";
        }
        A0A2.setContentDescription(str);
        if (C72453Mb.A1a(this.A0I)) {
            C18100vl r1 = this.A0G;
            AnonymousClass3MX.A0v(r1).A04(0);
            ((ListItemWithRightIcon) C72463Mc.A0O(r1)).setDescriptionVisibility(8);
            AnonymousClass3MX.A0v(this.A0H).A04(0);
        }
    }
}
