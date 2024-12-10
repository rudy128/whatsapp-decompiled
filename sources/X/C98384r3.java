package X;

import java.util.Collection;

/* renamed from: X.4r3  reason: invalid class name and case insensitive filesystem */
public class C98384r3 implements C34191k5 {
    public final int A00;
    public final Object A01;

    public C98384r3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ void BnA() {
    }

    public /* synthetic */ void BnD() {
    }

    public void BnE(C178119Bw r5) {
        if (this.A00 != 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GroupCallButtonController/onCallLogUpdated groupJid: ");
            C91454fi r2 = (C91454fi) this.A01;
            C17900vP.A0b(r2.A05, A10);
            if (r2.A05.equals(r5.A0C)) {
                if (!C42171xk.A00(r5.A0E, r2.A07)) {
                    r2.A07 = r5.A0E;
                    C91454fi.A00(r2);
                }
                if (r2.A07 == null) {
                    r5 = null;
                }
                r2.A06 = r5;
                return;
            }
            return;
        }
        C77843ra r3 = (C77843ra) this.A01;
        AnonymousClass1BI r22 = r3.A0G;
        if (r22.equals(r5.A0C)) {
            C17900vP.A0Y(r22, "groupconversationmenu/onCallLogUpdated groupJid: ", AnonymousClass000.A10());
            if (!C42171xk.A00(r5.A0E, r3.A02)) {
                r3.A02 = r5.A0E;
                r3.A01.invalidateOptionsMenu();
            }
            if (r3.A02 == null) {
                r5 = null;
            }
            r3.A01 = r5;
            r3.A09.CQq(r5);
        }
    }

    public /* synthetic */ void BnF(Collection collection) {
    }
}
