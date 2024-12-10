package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class AVS implements AnonymousClass897 {
    public AnonymousClass7I8 A00;
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final C56452hU A04;
    public final LinkedAccountsMediaCard A05;
    public final AnonymousClass72R A06;
    public final C1417376t A07;
    public final AEW A08;
    public final C18000vb A09;
    public final AnonymousClass9AV A0A;
    public final Integer A0B;
    public final boolean A0C;
    public final AnonymousClass1L9 A0D;

    public static void A00(AVS avs) {
        AEB aeb;
        C20248ADg aDg = avs.A08.A06;
        if (aDg != null) {
            LinkedAccountsMediaCard linkedAccountsMediaCard = avs.A05;
            if (linkedAccountsMediaCard.A03 != null) {
                int i = avs.A02;
                if (i == 0) {
                    aeb = aDg.A00;
                } else if (i == 1) {
                    aeb = aDg.A01;
                } else {
                    return;
                }
                if (aeb != null) {
                    Uri A002 = AnonymousClass4ZB.A00(aeb, i);
                    AnonymousClass1L9 r2 = avs.A0D;
                    Context context = avs.A03;
                    AnonymousClass72R r6 = avs.A06;
                    String rawString = linkedAccountsMediaCard.A03.getRawString();
                    Integer num = avs.A0B;
                    C18070vi.A0e(r2, 1, context);
                    C18070vi.A0d(r6, 5);
                    r6.A06(num, Integer.valueOf(aeb.A00), rawString, 15, i, true);
                    r2.A08(context, AnonymousClass1LU.A1p(A002));
                    int i2 = 23;
                    if (i == 0) {
                        i2 = 20;
                    }
                    r6.A04(avs.A07, i2);
                }
            }
        }
    }

    public void A01(UserJid userJid) {
        UserJid userJid2;
        C193079pV r2;
        int i = this.A02;
        AnonymousClass9AV r1 = this.A0A;
        synchronized (r1) {
            userJid2 = userJid;
            if (i == 0) {
                r2 = (C193079pV) r1.A00.get(userJid2);
            } else {
                r2 = (C193079pV) r1.A02.get(userJid2);
            }
        }
        String string = this.A03.getString(2131887565);
        if (r2 != null) {
            List list = r2.A00;
            if (!list.isEmpty()) {
                LinkedAccountsMediaCard linkedAccountsMediaCard = this.A05;
                ArrayList A13 = AnonymousClass000.A13();
                ArrayList A132 = AnonymousClass000.A13();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C195249t2 r12 = (C195249t2) list.get(i2);
                    if (!r12.A04.isEmpty()) {
                        AEI aei = (AEI) r12.A04.get(0);
                        AEI aei2 = aei;
                        A132.add(new AnonymousClass77G(aei2, r12.A02, r12.A01, r12.A03, r12.A00));
                        A13.add(new C85774Or((Drawable) null, new C21075Ae5(linkedAccountsMediaCard.A02, userJid2, A132, i2), new C21076Ae6(aei, linkedAccountsMediaCard, 1), (String) null, string, AnonymousClass001.A1H("thumb-transition-", A1M.A00(aei.A04, 0), AnonymousClass000.A10())));
                    }
                }
                linkedAccountsMediaCard.A08(A13, Integer.MAX_VALUE);
                int i3 = 2131231739;
                if (i == 0) {
                    i3 = 2131232284;
                }
                AFB afb = new AFB(this, 13);
                View openProfileView = linkedAccountsMediaCard.getOpenProfileView();
                openProfileView.setOnClickListener(afb);
                AnonymousClass3MW.A0G(openProfileView, 2131432032).setImageResource(i3);
                linkedAccountsMediaCard.A00.addView(openProfileView);
                return;
            }
        }
        LinkedAccountsMediaCard linkedAccountsMediaCard2 = this.A05;
        C177649Aa r13 = new C177649Aa(this, 34);
        LinearLayout linearLayout = linkedAccountsMediaCard2.A00;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        linkedAccountsMediaCard2.A07(r13, 3);
    }

    public boolean A02(UserJid userJid) {
        int i = this.A02;
        AnonymousClass9AV r1 = this.A0A;
        synchronized (r1) {
            if (i == 0) {
                boolean A1W = AnonymousClass000.A1W(r1.A02.get(userJid));
                return A1W;
            }
            boolean A1W2 = AnonymousClass000.A1W(r1.A02.get(userJid));
            return A1W2;
        }
    }

    public void C7J(UserJid userJid) {
        if (C42171xk.A00(this.A05.A03, userJid)) {
            A01(userJid);
        }
    }

    public AVS(AnonymousClass1L9 r2, C56452hU r3, LinkedAccountsMediaCard linkedAccountsMediaCard, AnonymousClass72R r5, C1417376t r6, AEW aew, C18000vb r8, AnonymousClass9AV r9, Integer num, int i, boolean z) {
        this.A05 = linkedAccountsMediaCard;
        this.A02 = i;
        this.A08 = aew;
        this.A03 = linkedAccountsMediaCard.getContext();
        this.A0A = r9;
        this.A04 = r3;
        this.A09 = r8;
        this.A0D = r2;
        this.A0B = num;
        this.A07 = r6;
        this.A06 = r5;
        this.A0C = z;
    }

    public void Bto(UserJid userJid, int i) {
        C17900vP.A0i("LinkedAccountCardViewPresenter onFailure ", AnonymousClass000.A10(), i);
        LinkedAccountsMediaCard linkedAccountsMediaCard = this.A05;
        if (C42171xk.A00(linkedAccountsMediaCard.A03, userJid)) {
            C177649Aa r1 = new C177649Aa(this, 34);
            LinearLayout linearLayout = linkedAccountsMediaCard.A00;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            linkedAccountsMediaCard.A07(r1, 3);
        }
    }
}
