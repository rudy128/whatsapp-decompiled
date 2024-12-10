package X;

import android.text.TextUtils;

/* renamed from: X.8to  reason: invalid class name and case insensitive filesystem */
public final class C172658to extends AUK {
    public final AnonymousClass1R5 A00;

    public void BDZ(C195629te r7, AnonymousClass8X1 r8, AnonymousClass206 r9) {
        AnonymousClass21F r4;
        AnonymousClass1QE r2;
        String str;
        C179859Ke r3;
        StringBuilder A10;
        String str2;
        C18070vi.A0d(r9, 0);
        C18070vi.A0j(r8, r7);
        if (!(r9 instanceof AnonymousClass21F) || (r4 = (AnonymousClass21F) r9) == null) {
            throw AnonymousClass8BW.A0S(0);
        }
        super.BDZ(r7, r8, r9);
        AnonymousClass1R5 r5 = this.A00;
        if (r4 instanceof AnonymousClass21G) {
            r3 = C179859Ke.A2a;
        } else if (r4 instanceof AnonymousClass21I) {
            r3 = C179859Ke.A2Z;
        } else {
            r2 = r5.A0A;
            str = "buildWebRequestSystemEvent: message type not supported";
            r2.A05(str);
        }
        String str3 = r4.A00;
        if (TextUtils.isEmpty(str3)) {
            r2 = r5.A0A;
            A10 = AnonymousClass000.A10();
            str2 = "buildWebRequestSystemEvent: failed to retrieve request message id for type: ";
        } else {
            AW0 A0J = AnonymousClass8BU.A0J(AnonymousClass8BR.A0O(r5.A09), str3, (String) null);
            if (A0J == null || TextUtils.isEmpty(A0J.A0I) || A0J.A09 == null) {
                r2 = r5.A0A;
                A10 = AnonymousClass000.A10();
                str2 = "buildWebRequestSystemEvent: request transaction, currency, or amount is null for type: ";
            } else {
                r8.A0I(r3);
                String A06 = C22971Dz.A06(r4.A0I());
                if (A06 == null) {
                    A06 = "";
                }
                r8.A0J(A06);
                r8.A0J(A0J.A0I);
                r8.A0J(String.valueOf(AnonymousClass8BX.A07(A0J.A09)));
                return;
            }
        }
        str = AnonymousClass001.A1E(r3, str2, A10);
        r2.A05(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C172658to(AnonymousClass1R5 r1, AnonymousClass00H r2) {
        super(r2);
        C18070vi.A0j(r2, r1);
        this.A00 = r1;
    }
}
