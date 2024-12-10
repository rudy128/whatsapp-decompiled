package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8FA  reason: invalid class name */
public final class AnonymousClass8FA extends AnonymousClass8FK implements C22419B7b {
    public String A00;
    public boolean A01;
    public final C22801Dg A02;
    public final C20529AOo A03;
    public final AEQ A04;
    public final C19989A2b A05;
    public final C41731wy A06 = AnonymousClass3MW.A0o();
    public final String A07;
    public final C189319it A08;
    public final AnonymousClass0I4 A09;
    public final AnonymousClass0IX A0A;
    public final A17 A0B;
    public final String A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8FA(Application application, C189319it r6, AnonymousClass0I4 r7, AnonymousClass0IX r8, C20529AOo aOo, AEQ aeq, A17 a17, String str, String str2) {
        super(application);
        C72473Md.A1M(application, a17, r7, 1);
        C18070vi.A0d(r6, 9);
        this.A0A = r8;
        this.A03 = aOo;
        this.A0B = a17;
        this.A09 = r7;
        this.A0C = str;
        this.A04 = aeq;
        this.A07 = str2;
        this.A08 = r6;
        C22801Dg A0R = C108945cZ.A0R();
        this.A02 = A0R;
        r8.A01 = aOo;
        C20339AGv.A01(aOo.A00, A0R, new C21728Are(this, 15), 18);
        C19989A2b A002 = r6.A00(this.A04 != null ? 741480633 : 741478382);
        this.A05 = A002;
        A002.A02();
    }

    public /* bridge */ /* synthetic */ void C42(C174058wA r6) {
        this.A01 = true;
        ArrayList A13 = AnonymousClass000.A13();
        C22801Dg r3 = this.A02;
        List A10 = AnonymousClass3MW.A10(r3);
        if (A10 != null) {
            A13.addAll(A10.subList(0, AnonymousClass3MX.A02(A10, 1)));
        }
        A13.add(new C174358we(66));
        r3.A0E(A13);
        A0T(this.A04);
    }

    public void A0S() {
        this.A0A.A01 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0097, code lost:
        if (r3.A01 != false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(X.AEQ r17) {
        /*
            r16 = this;
            r3 = r16
            X.AOo r0 = r3.A03
            X.1DT r0 = r0.A00
            java.lang.Object r0 = r0.A06()
            X.9y6 r0 = (X.C198289y6) r0
            if (r0 == 0) goto L_0x00c1
            X.9qq r2 = r0.A03
        L_0x0010:
            r0 = 1
            r4 = 0
            r11 = 0
            r5 = r17
            if (r17 != 0) goto L_0x0081
            X.1Dg r2 = r3.A02
            X.8we[] r1 = new X.C174358we[r0]
            X.8w4 r0 = new X.8w4
            r0.<init>()
            r1[r4] = r0
            java.util.ArrayList r0 = X.C220618l.newArrayList((java.lang.Object[]) r1)
            r2.A0E(r0)
        L_0x0029:
            X.0IX r0 = r3.A0A
            java.lang.String r15 = r3.A07
            X.9it r4 = r3.A08
            X.AEQ r2 = r3.A04
            r1 = 741478382(0x2c320fee, float:2.5304164E-12)
            if (r2 == 0) goto L_0x0039
            r1 = 741480633(0x2c3218b9, float:2.5309045E-12)
        L_0x0039:
            X.A2b r12 = r4.A00(r1)
            r0.A00()
            X.0rO r2 = r0.A04
            X.9XW r1 = r0.A06
            X.9mx r10 = r1.A00
            r1 = 1
            X.0YV r9 = new X.0YV
            r9.<init>(r0, r1)
            X.AOl r2 = (X.C20526AOl) r2
            X.10H r1 = r2.A00
            X.10E r2 = r1.A00
            X.190 r3 = X.AnonymousClass3MY.A0N(r2)
            X.10I r14 = X.AnonymousClass10E.AL1(r2)
            X.0vb r7 = X.AnonymousClass10E.A6Q(r2)
            X.B6y r4 = X.AnonymousClass8BT.A0B(r2)
            X.1Kq r6 = X.AnonymousClass8BU.A0F(r2)
            X.10G r1 = r2.A00
            X.00S r1 = r1.A1B
            java.lang.Object r13 = r1.get()
            X.9Xq r13 = (X.C183279Xq) r13
            X.0ve r8 = X.AnonymousClass10E.A8r(r2)
            X.0CE r2 = new X.0CE
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A0E()
            r0.A03 = r2
        L_0x0080:
            return
        L_0x0081:
            if (r2 != 0) goto L_0x009c
            X.1Dg r2 = r3.A02
            X.8we[] r1 = new X.C174358we[r0]
            X.8w4 r0 = new X.8w4
            r0.<init>()
            r1[r4] = r0
            java.util.ArrayList r0 = X.C220618l.newArrayList((java.lang.Object[]) r1)
            r2.A0E(r0)
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0029
        L_0x0099:
            r3.A01 = r4
            goto L_0x0029
        L_0x009c:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0029
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x00ae
            r1 = 150(0x96, float:2.1E-43)
            java.lang.String r0 = r3.A00
            X.9qq r11 = new X.9qq
            r11.<init>(r1, r0)
            goto L_0x0099
        L_0x00ae:
            java.lang.String r0 = r3.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0080
            int r0 = r2.A00
            X.9qq r11 = new X.9qq
            r11.<init>(r0, r1)
            r3.A00 = r1
            goto L_0x0029
        L_0x00c1:
            r2 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8FA.A0T(X.AEQ):void");
    }

    public static final void A00(AnonymousClass8FA r9, int i) {
        ArrayList A13 = AnonymousClass000.A13();
        if (r9.A09.A00(r9.A0C)) {
            r9.A0B.A02(-1, 1, -1);
        }
        C22801Dg r4 = r9.A02;
        List A10 = AnonymousClass3MW.A10(r4);
        if (A10 != null) {
            if (((C174358we) C29431cG.A0d(A10)).A00 == 66) {
                A13.addAll(A10.subList(0, AnonymousClass3MX.A01(A10)));
            }
            A13.add(new C174058wA(r9, 67, i));
        }
        r4.A0E(A13);
    }
}
