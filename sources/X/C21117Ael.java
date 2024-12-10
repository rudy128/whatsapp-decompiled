package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ael  reason: case insensitive filesystem */
public class C21117Ael implements AnonymousClass1TI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public final void accept(Object obj) {
        String str;
        String str2;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                C33251iW r7 = (C33251iW) this.A01;
                AbstractMap abstractMap = (AbstractMap) this.A02;
                AnonymousClass1D6 r5 = (AnonymousClass1D6) this.A03;
                Iterator A13 = AnonymousClass8BR.A13(obj);
                while (A13.hasNext()) {
                    AnonymousClass206 A0Y = C17880vN.A0Y(A13);
                    AnonymousClass206 r2 = (AnonymousClass206) abstractMap.get(A0Y.A0v.A00);
                    if (r2 != null) {
                        r7.A0u.BCh(A0Y, r2, (AnonymousClass6RT) r5.second);
                    }
                }
                return;
            case 1:
                C33341if r52 = (C33341if) this.A01;
                Object obj3 = this.A02;
                r52.A0A.A01().A03(new ARG(obj3, r52, 0), (C20284AEs) this.A03);
                return;
            case 2:
                AnonymousClass91U r3 = (AnonymousClass91U) this.A01;
                PaymentView paymentView = (PaymentView) this.A03;
                C20107A7l a7l = r3.A0V;
                AnonymousClass1BI r6 = r3.A0G;
                C17960vV.A07(r6);
                UserJid userJid = r3.A0J;
                long j = r3.A02;
                String paymentNote = paymentView.getPaymentNote();
                List mentionedJids = paymentView.getMentionedJids();
                a7l.A05(r3, (AnonymousClass1KN) this.A02, paymentView.getPaymentBackground(), r6, userJid, (C55032f6) obj2, new C20854AaW(r3, paymentView), paymentNote, mentionedJids, j);
                return;
            case 3:
                C20107A7l a7l2 = (C20107A7l) this.A01;
                BDv bDv = (BDv) this.A02;
                Context context = (Context) this.A03;
                C55032f6 r8 = (C55032f6) obj2;
                bDv.CEx();
                if (r8.A01 != 5) {
                    if (!C18020vd.A05(C18040vf.A02, a7l2.A02, 1084) || r8.A00 != 5) {
                        int i = r8.A01;
                        if (i == 1 || i == 6 || !C20107A7l.A04(r8, a7l2)) {
                            int i2 = r8.A01;
                            if (i2 != 1 && i2 != 6) {
                                C20107A7l.A02(context, new C20155A9r(bDv, 37), new C20155A9r(bDv, 38));
                                return;
                            } else if (C20107A7l.A04(r8, a7l2)) {
                                C20107A7l.A00(context, new C20155A9r(bDv, 39), new C20155A9r(bDv, 40));
                                return;
                            } else {
                                bDv.By9(r8.A02);
                                return;
                            }
                        } else {
                            C20107A7l.A01(context, new C20155A9r(bDv, 32), new C20155A9r(bDv, 36));
                            return;
                        }
                    }
                }
                bDv.BIr();
                C73203Rj A002 = AnonymousClass4a6.A00(context);
                int i3 = 2131892439;
                if (AnonymousClass11E.A02(context)) {
                    i3 = 2131892440;
                }
                A002.A0D(i3);
                C73203Rj.A06(A002);
                AnonymousClass3MY.A1G(A002);
                return;
            default:
                BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = (BrazilAddPixKeyViewModel) this.A02;
                AnonymousClass9F9 r4 = (AnonymousClass9F9) this.A03;
                Boolean bool = (Boolean) obj2;
                C18070vi.A0k(r4, bool);
                List<C178239Ci> list = null;
                if (!bool.booleanValue()) {
                    Log.e("sendUpdateCustomPaymentMethodActionIq failed to remove pix key");
                    brazilAddPixKeyViewModel.A00.A0E(new C198179xu((Object) null, (Throwable) null, 1));
                    return;
                }
                AnonymousClass9DN r1 = (AnonymousClass9DN) r4.A00.A00;
                if (r1 != null) {
                    list = (List) ((AnonymousClass9DN) r1.A00).A00;
                }
                String str3 = "";
                if (list != null) {
                    str = str3;
                    str2 = str3;
                    for (C178239Ci r12 : list) {
                        String str4 = r12.A01;
                        int hashCode = str4.hashCode();
                        if (hashCode != -558983233) {
                            if (hashCode != 355905466) {
                                if (hashCode == 1302976136 && str4.equals("pix_display_name")) {
                                    str2 = r12.A02;
                                }
                            } else if (str4.equals("pix_key_type")) {
                                str3 = r12.A02;
                            }
                        } else if (str4.equals("pix_key")) {
                            str = r12.A02;
                        }
                    }
                } else {
                    str = str3;
                    str2 = str3;
                }
                BrazilAddPixKeyViewModel.A04(brazilAddPixKeyViewModel, r4, str3, str, str2);
                return;
        }
    }

    public C21117Ael(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj;
    }
}
