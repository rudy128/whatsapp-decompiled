package X;

import android.view.View;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4qR  reason: invalid class name and case insensitive filesystem */
public final class C98014qR implements C107705aS {
    public final /* synthetic */ AnonymousClass4SU A00;
    public final /* synthetic */ AnonymousClass21V A01;

    public C98014qR(AnonymousClass4SU r1, AnonymousClass21V r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Bp3(View view) {
        AnonymousClass4SU r3 = this.A00;
        AnonymousClass21V r9 = this.A01;
        r3.A00 = r9;
        View view2 = view;
        if (r9.A0u == 23) {
            AnonymousClass22Q r92 = (AnonymousClass22Q) r9;
            UserJid userJid = r92.A01;
            if (userJid == null) {
                r3.A01.A08(2131888017, 0);
                return;
            }
            r3.A06.A08(3, (String) null, (String) null);
            boolean A0O = r3.A02.A0O(userJid);
            if (view != null) {
                C20057A5g.A02(view2.getContext(), view2, r3.A04, r3.A05, r3.A07, r92, r3.A0B, 5, false, A0O, A0O);
                return;
            }
            return;
        }
        AnonymousClass1FY r2 = r3.A03;
        if (!r3.A08.A0D()) {
            r2.startActivityForResult(AnonymousClass74O.A00(r2, C123636Vf.A00()), 34);
        } else {
            r3.A00(view2);
        }
    }
}
