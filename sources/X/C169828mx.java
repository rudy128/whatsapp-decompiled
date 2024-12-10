package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.8mx  reason: invalid class name and case insensitive filesystem */
public final class C169828mx extends C60192nY {
    public final C20606ARq A00;
    public final C26371Rw A01;
    public final AnonymousClass1S4 A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass1CJ A04;
    public final AnonymousClass18O A05;
    public final A0H A06;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        C18070vi.A0d(a6u, 2);
        C166378cn r3 = a6u.A03;
        String[] strArr = a6u.A06;
        if (strArr.length != 4) {
            return null;
        }
        AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(strArr[1]);
        if (A022 == null) {
            Log.e("clear-chat-mutation/from-key-value unable to create chat jid");
        }
        String str2 = strArr[2];
        Boolean A002 = C20068A5s.A00(str2);
        if (A002 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("clear-chat-mutation/from-key-value value=");
            A10.append(str2);
            C17890vO.A19(A10, " at index=2 is not one of the valid strings");
        }
        String str3 = strArr[3];
        Boolean A003 = C20068A5s.A00(str3);
        if (A003 == null) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("clear-chat-mutation/from-key-value value=");
            A102.append(str3);
            C17890vO.A19(A102, " at index=3 is not one of the valid strings");
        }
        if (A022 == null || A002 == null || A003 == null || r3 == null || !AnonymousClass8BU.A1a("clearChat", strArr) || !C18070vi.A18(C62382rJ.A03, a6u.A01) || !AnonymousClass8BW.A1Q(r3.bitField0_) || (r3.bitField0_ & 65536) == 0) {
            return null;
        }
        AnonymousClass8Y1 r2 = r3.clearChatAction_;
        if (r2 == null) {
            r2 = AnonymousClass8Y1.DEFAULT_INSTANCE;
        }
        boolean A1Q = AnonymousClass8BW.A1Q(r2.bitField0_);
        C165018aS r0 = r2.messageRange_;
        if (r0 == null) {
            r0 = C165018aS.DEFAULT_INSTANCE;
        }
        A7L A023 = A7L.A02(r0, A1Q);
        boolean booleanValue = A002.booleanValue();
        boolean booleanValue2 = A003.booleanValue();
        return new C170518pz(a6u.A02, A023, A022, str, r3.timestamp_, booleanValue, booleanValue2, z);
    }

    private final void A00(C195559tX r9) {
        AnonymousClass1CJ r0 = this.A04;
        AnonymousClass1BI r5 = r9.A02;
        if (r0.A0A(r5) != null) {
            Log.i("clear-chat-handler/clearChat deleteMessagesForRange");
            A0H a0h = this.A06;
            C170518pz r02 = (C170518pz) r9.A00;
            boolean z = r02.A00;
            boolean z2 = r02.A01;
            A7L a7l = r9.A01;
            int A002 = A7L.A00(a0h.A01.A02(r5, true), a7l);
            if (A002 == 2 || A002 == 1) {
                Log.i("DeleteMessagesForRange/clearChat use default service");
                if (z2) {
                    a0h.A05.A04(r5, (Long) null);
                }
                AnonymousClass121 r1 = a0h.A04;
                r1.CKc(r5, true);
                r1.BEq(r5, (Long) null, true, z);
                return;
            }
            Log.i("DeleteMessagesForRange/clearChat use deleteMessages");
            a0h.A01(a7l, r5, z, z2);
        }
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        AnonymousClass8q2 r4 = (AnonymousClass8q2) a8l;
        C18070vi.A0d(r4, 0);
        C195559tX A002 = C196629vN.A00(r4);
        if (this.A04.A0A(A002.A02) == null) {
            A06(r4);
            return;
        }
        A00(A002);
        A08(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (r3.A00.A04 <= r4.A00.A04) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0I(X.C20126A8l r16, X.C20126A8l r17) {
        /*
            r15 = this;
            r1 = r17
            r2 = r16
            X.8q2 r2 = (X.AnonymousClass8q2) r2
            X.8q2 r1 = (X.AnonymousClass8q2) r1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.9tX r4 = X.C196629vN.A00(r2)
            if (r1 != 0) goto L_0x007a
            X.1Rs r0 = r15.A00
            X.C18070vi.A0W(r0)
            X.8q2 r1 = X.C196629vN.A01(r4, r0)
            if (r1 != 0) goto L_0x007a
            r3 = 0
        L_0x001e:
            X.A7L r6 = r4.A01
            if (r3 == 0) goto L_0x005d
            X.A7L r5 = r3.A01
            int r1 = X.A7L.A00(r6, r5)
            if (r1 == 0) goto L_0x0072
            r0 = 1
            if (r1 == r0) goto L_0x007f
            r0 = 2
            if (r1 == r0) goto L_0x0066
            X.8q2 r1 = r3.A00
            r15.A06(r1)
            X.1BI r8 = r3.A02
            r0 = r1
            X.8pz r0 = (X.C170518pz) r0
            boolean r12 = r0.A01
            boolean r13 = r0.A00
            X.8q2 r0 = r4.A00
            long r2 = r0.A04
            long r0 = r1.A04
            long r10 = java.lang.Math.max(r2, r0)
            X.A7L r7 = X.A7L.A01(r6, r5)
            r6 = 0
            r14 = 1
            X.8pz r5 = new X.8pz
            r9 = r6
            r5.<init>(r6, r7, r8, r9, r10, r12, r13, r14)
            X.1Rs r1 = r15.A00
            java.util.Set r0 = X.C18070vi.A0P(r5)
            r1.A0I(r0)
        L_0x005d:
            X.8q2 r0 = r4.A00
            r15.A0A(r0)
            r15.A00(r4)
            return
        L_0x0066:
            X.8q2 r0 = r3.A00
            long r5 = r0.A04
            X.8q2 r0 = r4.A00
            long r1 = r0.A04
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x007f
        L_0x0072:
            X.1Rs r1 = r15.A00
            X.8q2 r0 = r3.A00
            r1.A0G(r0)
            goto L_0x005d
        L_0x007a:
            X.9tX r3 = X.C196629vN.A00(r1)
            goto L_0x001e
        L_0x007f:
            X.8q2 r0 = r4.A00
            r15.A09(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169828mx.A0I(X.A8l, X.A8l):void");
    }

    public boolean A0J() {
        return this.A05.A09(AnonymousClass18O.A0N);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C169828mx(AnonymousClass18O r1, A0H a0h, C20606ARq aRq, C26371Rw r4, AnonymousClass1S4 r5, AnonymousClass11P r6, AnonymousClass1CJ r7, C26331Rs r8) {
        super(r8);
        C18070vi.A0w(r6, r1, r7, aRq, r4);
        C18070vi.A0q(r5, r8, a0h);
        this.A03 = r6;
        this.A05 = r1;
        this.A04 = r7;
        this.A00 = aRq;
        this.A01 = r4;
        this.A02 = r5;
        this.A06 = a0h;
    }

    public String A0D() {
        return "regular_high";
    }

    public String A0E() {
        return "clearChat";
    }

    public List A0F(boolean z) {
        return C18460wS.A00;
    }
}
