package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.banners.WDSBannerCompact;

/* renamed from: X.3ry  reason: invalid class name and case insensitive filesystem */
public class C78013ry extends C98524rI {
    public View A00;
    public AnonymousClass1E7 A01;
    public UserJid A02;
    public UserJid A03;
    public final ViewGroup A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass1M9 A06;
    public final AnonymousClass1SG A07;
    public final AnonymousClass1LU A08;
    public final UserJid A09;
    public final AnonymousClass10I A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final C24921Me A0D;

    public C78013ry(ViewGroup viewGroup, AnonymousClass11S r3, AnonymousClass1M9 r4, C24921Me r5, C108885cS r6, AnonymousClass1SG r7, AnonymousClass1E7 r8, AnonymousClass1LU r9, UserJid userJid, AnonymousClass10I r11, boolean z, boolean z2) {
        super(r6, 15);
        this.A05 = r3;
        this.A0A = r11;
        this.A06 = r4;
        this.A0D = r5;
        this.A07 = r7;
        this.A09 = userJid;
        this.A04 = viewGroup;
        this.A0B = z;
        this.A0C = z2;
        this.A01 = r8;
        this.A08 = r9;
    }

    public static void A00(C78013ry r5) {
        int i;
        boolean A0N = r5.A05.A0N();
        boolean equals = r5.A09.equals(r5.A03);
        if (!A0N) {
            i = 2131888049;
            if (equals) {
                i = 2131888051;
            }
        } else {
            i = 2131888050;
            if (equals) {
                i = 2131888052;
            }
        }
        AnonymousClass1M9 r1 = r5.A06;
        UserJid userJid = r5.A03;
        C17960vV.A07(userJid);
        String A0P = r5.A0D.A0P(r1.A0H(userJid));
        String A0j = C72473Md.A0j(C98524rI.A03(r5), A0P, i);
        AFV afv = new AFV(10, A0P, r5);
        C89904dD r2 = new C89904dD(r5, 3);
        View view = r5.A00;
        if (view instanceof WDSBannerCompact) {
            WDSBannerCompact wDSBannerCompact = (WDSBannerCompact) view;
            wDSBannerCompact.setText((CharSequence) A0j);
            wDSBannerCompact.setOnClickListener(afv);
            wDSBannerCompact.setOnDismissListener((View.OnClickListener) r2);
            return;
        }
        C17960vV.A05(view);
        C72453Mb.A1F(view, A0j, 2131428993);
        r5.A00.setOnClickListener(afv);
        r5.A00.findViewById(2131428970).setOnClickListener(r2);
    }
}
