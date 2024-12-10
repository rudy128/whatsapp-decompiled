package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.98k  reason: invalid class name and case insensitive filesystem */
public class C1773998k extends C20083A6j {
    public final C18030ve A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1773998k(C18030ve r2, C20285AEt aEt, C185129c4 r4) {
        super(aEt, r4);
        C18070vi.A0d(r2, 3);
        this.A00 = r2;
    }

    public String A0F(Context context) {
        C18070vi.A0d(context, 0);
        C20285AEt aEt = this.A02;
        if (!AnonymousClass8BU.A1S(aEt, "review_order") && !AnonymousClass8BU.A1S(aEt, "payment_status") && !AnonymousClass8BU.A1S(aEt, "payment_method")) {
            return super.A0F(context);
        }
        String A0E = A0E(context);
        if (A0E == null) {
            return "";
        }
        return A0E;
    }

    public String A0G(Context context) {
        C18070vi.A0d(context, 0);
        C20285AEt aEt = this.A02;
        if (!AnonymousClass8BU.A1S(aEt, "review_order") && !AnonymousClass8BU.A1S(aEt, "payment_status") && !AnonymousClass8BU.A1S(aEt, "payment_method")) {
            return super.A0G(context);
        }
        String A0E = A0E(context);
        if (A0E == null) {
            return "";
        }
        return A0E;
    }

    public void A0H(C19998A2m a2m, AnonymousClass206 r10) {
        List<C20253ADl> list;
        C18070vi.A0h(a2m, r10);
        super.A0H(a2m, r10);
        C20285AEt A0g = AnonymousClass8BR.A0g(r10);
        String str = null;
        if (A0g != null && A0g.A06 != null && A0g.A00 == 5) {
            AnonymousClass8X8 r6 = a2m.A00;
            C163878Wr A002 = AnonymousClass8X8.A00(r6);
            C163758Wf r4 = (C163758Wf) ((C166398cp) A002.A00).A0S().A0O();
            C20277AEk aEk = A0g.A06;
            if (aEk != null) {
                str = aEk.A02;
            }
            C164818a7 r1 = (C164818a7) C17880vN.A0G(r4);
            int i = C164818a7.BUTTONS_FIELD_NUMBER;
            str.getClass();
            r1.bitField0_ |= 1;
            r1.messageParamsJson_ = str;
            C20277AEk aEk2 = A0g.A06;
            if (aEk2 != null) {
                list = aEk2.A03;
            } else {
                list = C18460wS.A00;
            }
            for (C20253ADl aDl : list) {
                C163888Ws r2 = (C163888Ws) AnonymousClass8Z3.DEFAULT_INSTANCE.A0N();
                C20271AEe aEe = aDl.A01;
                r2.A0H(aEe.A02);
                String str2 = aEe.A00;
                if (str2 != null) {
                    r2.A0G(str2);
                }
                C164818a7 r3 = (C164818a7) C17880vN.A0G(r4);
                C23577Bm6 A0C = r2.A0C();
                A0C.getClass();
                EE9 ee9 = r3.buttons_;
                if (!((C27296DbR) ee9).A00) {
                    ee9 = C23577Bm6.A09(ee9);
                    r3.buttons_ = ee9;
                }
                ee9.add(A0C);
            }
            A002.A0H(r4);
            AnonymousClass8X8.A06(A002, r6);
        }
    }
}
