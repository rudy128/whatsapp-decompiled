package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.button.WDSButtonGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4kk  reason: invalid class name and case insensitive filesystem */
public final class C94514kk implements AnonymousClass5ZD {
    public final Context A00;
    public final AnonymousClass5ZN A01;
    public final AnonymousClass5ZT A02;
    public final AnonymousClass5ZW A03;
    public final AnonymousClass5XW A04;
    public final AnonymousClass1MZ A05;
    public final C18030ve A06;
    public final AnonymousClass126 A07;
    public final AnonymousClass1EC A08;
    public final C436420i A09;
    public final C24901Mc A0A;

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.TextView, X.4Bx, android.view.View, X.3Rk, com.whatsapp.wds.components.button.WDSButton] */
    public static final AnonymousClass4Bx A00(Context context, C436420i r15) {
        AnonymousClass1BI r2;
        ? wDSButton = new WDSButton(context, (AttributeSet) null);
        wDSButton.A06();
        wDSButton.setAction(AnonymousClass4DG.DESTRUCTIVE);
        wDSButton.setVariant(C27881Xz.OUTLINE);
        wDSButton.setText(2131890191);
        wDSButton.setIcon(2131232077);
        C42941yz r22 = AnonymousClass1EC.A01;
        AnonymousClass205 r23 = r15.A0v;
        if (r23 != null) {
            r2 = r23.A00;
        } else {
            r2 = null;
        }
        AnonymousClass1EC A002 = C42941yz.A00(r2);
        if (A002 != null) {
            AnonymousClass1FB r24 = (AnonymousClass1FB) C72453Mb.A0L(wDSButton);
            AnonymousClass10E r4 = ((C94704l3) wDSButton.getViewModelFactory()).A00.A00;
            C18030ve A8r = AnonymousClass10E.A8r(r4);
            AnonymousClass10I AL1 = AnonymousClass10E.AL1(r4);
            AnonymousClass1CJ A0d = AnonymousClass3Ma.A0d(r4);
            AnonymousClass18K A0g = AnonymousClass3Ma.A0g(r4);
            C24901Mc A0u = AnonymousClass3Ma.A0u(r4);
            AnonymousClass3Ut r42 = new AnonymousClass3Ut(AnonymousClass3MZ.A0b(r4), A0d, AnonymousClass3MY.A0V(r4), (C34591kk) r4.AB5.get(), A8r, A0g, AnonymousClass3MY.A0X(r4), (C27141Uw) r4.A4m.get(), A002, A0u, AL1);
            wDSButton.A01 = r42;
            C91644g1.A00(r24, r42.A00, new C105435Rz(wDSButton), 11);
            AnonymousClass3Ut r3 = wDSButton.A01;
            if (r3 == null) {
                C18070vi.A11("viewModel");
                throw null;
            }
            C91644g1.A00(r24, r3.A01, new AnonymousClass5S0(wDSButton), 11);
            C90074dU.A00(wDSButton, r24, 44);
        }
        return wDSButton;
    }

    public List getCTAViews() {
        Object[] objArr;
        Object obj;
        AnonymousClass4C2 r8;
        C24901Mc r1 = this.A0A;
        AnonymousClass1EC r7 = this.A08;
        if (C72463Mc.A1S(this.A07, r7, r1)) {
            if (C18020vd.A05(C18040vf.A02, this.A06, 11410)) {
                AnonymousClass5ZW r0 = this.A03;
                Context context = this.A00;
                C436420i r12 = this.A09;
                ArrayList A062 = AnonymousClass1ZU.A06(r0.BGU(context, r12));
                if (this.A05.A0J(r7)) {
                    WDSButtonGroup wDSButtonGroup = new WDSButtonGroup(context, (AttributeSet) null);
                    AnonymousClass4Bx A002 = A00(context, r12);
                    C94824lF r02 = (C94824lF) this.A04;
                    int i = r02.A00;
                    Object obj2 = r02.A01;
                    if (i != 0) {
                        AnonymousClass10E r13 = ((AnonymousClass10H) obj2).A00;
                        AnonymousClass10G r03 = r13.A00;
                        r8 = new AnonymousClass4C2(context, AnonymousClass3MY.A0U(r13), AnonymousClass3Ma.A0g(r13), r7, AnonymousClass3Ma.A0u(r13));
                        r03.AXH(r8);
                    } else {
                        AnonymousClass1K2 r04 = (AnonymousClass1K2) obj2;
                        AnonymousClass1K1 r14 = r04.A00;
                        AnonymousClass10E r05 = r04.A01;
                        r8 = new AnonymousClass4C2(context, AnonymousClass3MY.A0U(r05), AnonymousClass3Ma.A0g(r05), r7, AnonymousClass3Ma.A0u(r05));
                        r14.A8x(r8);
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, r8.getResources().getDimensionPixelSize(2131166122), 1.0f);
                    A002.setLayoutParams(layoutParams);
                    r8.setLayoutParams(layoutParams);
                    wDSButtonGroup.addView(A002);
                    wDSButtonGroup.addView(r8);
                    A062.add(wDSButtonGroup);
                }
                return A062;
            }
            objArr = new Object[2];
            AnonymousClass5ZW r06 = this.A03;
            Context context2 = this.A00;
            C436420i r15 = this.A09;
            objArr[0] = r06.BGU(context2, r15);
            obj = A00(context2, r15);
        } else {
            objArr = new Object[2];
            AnonymousClass5ZT r07 = this.A02;
            Context context3 = this.A00;
            objArr[0] = r07.BGS(context3, r7);
            obj = this.A01.BGo(context3, r7, (AnonymousClass1EC) null, this.A09, 4, false);
        }
        return C18070vi.A0O(obj, objArr, 1);
    }

    public C94514kk(Context context, AnonymousClass5ZN r2, AnonymousClass5ZT r3, AnonymousClass5ZW r4, AnonymousClass5XW r5, AnonymousClass1MZ r6, C18030ve r7, AnonymousClass126 r8, AnonymousClass1EC r9, C436420i r10, C24901Mc r11) {
        C18070vi.A0w(r7, r11, r8, r3, r2);
        C18070vi.A0q(r6, r4, r5);
        this.A06 = r7;
        this.A0A = r11;
        this.A07 = r8;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = context;
        this.A09 = r10;
        this.A08 = r9;
    }
}
