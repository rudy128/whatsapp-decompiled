package X;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.1xI  reason: invalid class name and case insensitive filesystem */
public class C41911xI implements AnonymousClass11V {
    public final AnonymousClass11S A00;
    public final C26811To A01;
    public final AnonymousClass00H A02;
    public final C18030ve A03;
    public final AnonymousClass10I A04;

    public void A00() {
        C169768mr r0;
        C26811To r2 = this.A01;
        if (r2.A0T() && (r0 = (C169768mr) ((C58862lN) this.A02.get()).A00("setting_chatLock")) != null) {
            r2.A0N(Collections.singletonList(r0.A0K()));
            r2.A0I();
        }
    }

    public void A01() {
        C116365x9 r0;
        C26811To r2 = this.A01;
        if (r2.A0T() && (r0 = (C116365x9) ((C58862lN) this.A02.get()).A00("device_capabilities")) != null) {
            r2.A0N(Collections.singletonList(r0.A0K()));
            r2.A0I();
        }
    }

    public void A02() {
        C169748mp r0;
        C26811To r2 = this.A01;
        if (r2.A0T() && (r0 = (C169748mp) ((C58862lN) this.A02.get()).A00("status_privacy")) != null) {
            AnonymousClass8q3 A0K = r0.A0K();
            ArrayList arrayList = new ArrayList();
            arrayList.add(A0K);
            r2.A0N(arrayList);
            r2.A0I();
        }
    }

    public void A03() {
        C60192nY A002;
        if (!this.A00.A0N() && (A002 = ((C58862lN) this.A02.get()).A00("time_format")) != null) {
            this.A04.CGF(new C70623Bv(this, A002, 7));
        }
    }

    public void BxE() {
        if (!this.A00.A0N()) {
            A03();
            C45992Cl r2 = (C45992Cl) ((C58862lN) this.A02.get()).A00("setting_locale");
            if (r2 != null) {
                this.A04.CGF(new AnonymousClass2PF(this, r2));
            }
        }
    }

    public C41911xI(AnonymousClass11S r1, C26811To r2, C18030ve r3, AnonymousClass10I r4, AnonymousClass00H r5) {
        this.A03 = r3;
        this.A00 = r1;
        this.A04 = r4;
        this.A01 = r2;
        this.A02 = r5;
    }
}
