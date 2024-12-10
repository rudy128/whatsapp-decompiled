package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.invites.PaymentInviteFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4k3  reason: invalid class name and case insensitive filesystem */
public abstract class C94104k3 implements C22539BBw {
    public View A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public PaymentInviteFragment A04;
    public C28931bI A05;
    public Button A06;
    public GridView A07;
    public ImageButton A08;
    public TextView A09;
    public TextView A0A;
    public AnonymousClass1PM A0B;
    public Button A0C;
    public final C24921Me A0D;
    public final String A0E;
    public final boolean A0F;
    public final AnonymousClass1M9 A0G;
    public final C27201Vd A0H;

    public /* bridge */ /* synthetic */ void BD6(Object obj) {
        C184389as r5 = (C184389as) obj;
        Context context = this.A00.getContext();
        C17960vV.A07(r5);
        if (1 == r5.A00) {
            this.A03.setVisibility(0);
            this.A02.setVisibility(8);
            return;
        }
        this.A03.setVisibility(8);
        Object obj2 = r5.A01;
        C17960vV.A07(obj2);
        A00(context, (List) obj2);
    }

    public void CA8(View view) {
        this.A00 = view;
        this.A06 = (Button) AnonymousClass1HF.A06(view, 2131431795);
        this.A0C = (Button) AnonymousClass1HF.A06(view, 2131435001);
        this.A07 = (GridView) AnonymousClass1HF.A06(view, 2131435110);
        this.A02 = AnonymousClass3MW.A0C(view, 2131431811);
        this.A03 = AnonymousClass3MW.A0C(view, 2131431812);
        this.A08 = (ImageButton) AnonymousClass1HF.A06(view, 2131428012);
        this.A09 = AnonymousClass3MW.A0J(view, 2131433556);
        this.A0A = AnonymousClass3MW.A0J(view, 2131433557);
        this.A01 = AnonymousClass3MW.A0C(view, 2131431593);
    }

    public C94104k3(AnonymousClass1M9 r1, AnonymousClass1PM r2, C24921Me r3, C27201Vd r4, String str, boolean z) {
        this.A0F = z;
        this.A0H = r4;
        this.A0G = r1;
        this.A0D = r3;
        this.A0E = str;
        this.A0B = r2;
    }

    public void A00(Context context, List list) {
        View view;
        Context context2 = context;
        if (list.size() == 1) {
            UserJid userJid = (UserJid) list.get(0);
            String A0O = this.A0D.A0O(this.A0G.A0H(userJid));
            C42741yf A012 = this.A0B.A01(userJid);
            if (A012 == null || !A012.A03()) {
                this.A06.setText(2131893904);
                AnonymousClass3MY.A0y(context, this.A09, new Object[]{A0O}, 2131893645);
                AnonymousClass3MY.A0y(context, this.A0A, new Object[]{A0O}, 2131893646);
                if (this.A0F) {
                    AnonymousClass3MY.A0y(context, AnonymousClass3MW.A0J(this.A00, 2131431594), new Object[]{A0O}, 2131891308);
                    view = this.A01;
                    view.setVisibility(0);
                }
            } else {
                this.A04.A28(true);
            }
        } else {
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass3MY.A1O(this.A0G, C17880vN.A0Q(it), A13);
            }
            this.A07.setAdapter(new C72943Oh(context2, context, this.A0H.A06(context, "payment-invite-view-component"), this, A13, A13));
            view = this.A07;
            view.setVisibility(0);
        }
        this.A06.setOnClickListener(new AFQ(this, 48));
        this.A08.setOnClickListener(new AFT(this, list, 28));
        this.A0C.setOnClickListener(new AFQ(this, 49));
        this.A02.setVisibility(0);
    }

    public int BTw() {
        return 2131626373;
    }
}
