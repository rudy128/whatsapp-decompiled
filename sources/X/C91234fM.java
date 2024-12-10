package X;

import androidx.fragment.app.DialogFragment;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.4fM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91234fM implements C15950rT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C97924qH A01;
    public final /* synthetic */ AnonymousClass1BI A02;
    public final /* synthetic */ AnonymousClass1EC A03;

    public final Object apply(Object obj) {
        Integer num;
        C97924qH r6 = this.A01;
        AnonymousClass1EC r8 = this.A03;
        AnonymousClass1BI r7 = this.A02;
        int i = this.A00;
        C86844Th r10 = (C86844Th) obj;
        C34511kb r4 = r6.A07;
        if (r4.A0R(r8)) {
            num = C17880vN.A0i();
        } else {
            num = 1;
        }
        AnonymousClass4ZP.A00(r6.A0B, r6.A0D, r7, 1, num.intValue());
        AnonymousClass1FR r1 = r6.A04;
        r1.CEx();
        DialogFragment A002 = AnonymousClass4GA.A00(r4, r8, true);
        if (A002 == null) {
            Set singleton = Collections.singleton(r8);
            boolean A1T = AnonymousClass000.A1T(i, 1);
            String str = "group_spam_banner_exit";
            if (r6.A01) {
                str = "triggered_block";
            }
            A002 = C83754Gn.A00(r10.A01, str, singleton, 0, 2, A1T, false);
        }
        r1.CMl(A002);
        return null;
    }

    public /* synthetic */ C91234fM(C97924qH r1, AnonymousClass1BI r2, AnonymousClass1EC r3, int i) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i;
    }
}
