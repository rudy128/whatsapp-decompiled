package X;

import android.content.Context;
import android.content.DialogInterface;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.A7l  reason: case insensitive filesystem */
public class C20107A7l {
    public final AnonymousClass1KB A00;
    public final C33251iW A01;
    public final C18030ve A02;
    public final C31061ex A03;
    public final C32551hN A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;

    public static void A03(AnonymousClass1KN r5, AEX aex, AnonymousClass1BI r7, UserJid userJid, C55032f6 r9, BDu bDu, C20107A7l a7l) {
        C55032f6 r4 = r9;
        C441322g r3 = r9.A03;
        C17960vV.A07(r3);
        C20107A7l a7l2 = a7l;
        C31061ex r1 = a7l.A03;
        if (!C22971Dz.A0e(r7)) {
            userJid = C22941Dw.A00(r7);
        }
        r1.A0M(r5, aex, userJid, r3);
        a7l.A00.A0J(new C146617Py(a7l2, r3, r4, bDu, 9));
    }

    public static boolean A04(C55032f6 r3, C20107A7l a7l) {
        int i;
        if (!C18020vd.A05(C18040vf.A02, a7l.A02, 1084) || (i = r3.A00) == 7 || i == 1) {
            return false;
        }
        return true;
    }

    public void A05(Context context, AnonymousClass1KN r27, AEX aex, AnonymousClass1BI r29, UserJid userJid, C55032f6 r31, BDu bDu, String str, List list, long j) {
        BDu bDu2 = bDu;
        bDu2.CEx();
        C55032f6 r4 = r31;
        Context context2 = context;
        if (r4.A01 != 5) {
            if (!C18020vd.A05(C18040vf.A02, this.A02, 1084) || r4.A00 != 5) {
                int i = r4.A01;
                AnonymousClass1KN r5 = r27;
                AnonymousClass1BI r7 = r29;
                UserJid userJid2 = userJid;
                String str2 = str;
                List list2 = list;
                long j2 = j;
                if (i == 1 || i == 6 || !A04(r4, this)) {
                    int i2 = r4.A01;
                    AEX aex2 = aex;
                    if (i2 != 1 && i2 != 6) {
                        A02(context2, new C20149A9l(r5, aex2, r7, userJid2, bDu2, this, str2, list2, j2), new C20155A9r(bDu2, 34));
                        return;
                    } else if (A04(r4, this)) {
                        A00(context2, new AnonymousClass4b6(this, r4, r5, r7, bDu2, userJid2, 1), new C20155A9r(bDu2, 35));
                        return;
                    } else {
                        A03(r5, aex2, r7, userJid2, r4, bDu2, this);
                        return;
                    }
                } else {
                    A01(context2, new C20148A9k(r5, r7, userJid2, bDu2, this, str2, list2, j2), new C20155A9r(bDu2, 33));
                    return;
                }
            }
        }
        C73203Rj A002 = AnonymousClass4a6.A00(context2);
        int i3 = 2131892439;
        if (AnonymousClass11E.A02(context2)) {
            i3 = 2131892440;
        }
        A002.A0D(i3);
        C73203Rj.A06(A002);
        AnonymousClass3MY.A1G(A002);
    }

    public C20107A7l(AnonymousClass1KB r1, C33251iW r2, C18030ve r3, C31061ex r4, C32551hN r5, AnonymousClass10I r6, AnonymousClass00H r7) {
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = r6;
        this.A01 = r2;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
    }

    public static void A00(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        A002.A0E(2131893605);
        A002.A0D(2131893603);
        A002.A0Z(onClickListener, 2131893604);
        A002.A0X(onClickListener2, 2131895092);
        AnonymousClass3MY.A1G(A002);
    }

    public static void A01(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        A002.A0E(2131893655);
        A002.A0D(2131893653);
        A002.A0Z(onClickListener, 2131893654);
        A002.A0X(onClickListener2, 2131895092);
        AnonymousClass3MY.A1G(A002);
    }

    public static void A02(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        A002.A0E(2131893745);
        A002.A0D(2131893743);
        A002.A0Z(onClickListener, 2131893744);
        A002.A0X(onClickListener2, 2131895092);
        AnonymousClass3MY.A1G(A002);
    }
}
