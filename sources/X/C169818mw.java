package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.8mw  reason: invalid class name and case insensitive filesystem */
public final class C169818mw extends C60192nY {
    public final C20606ARq A00;
    public final C26371Rw A01;
    public final AnonymousClass1S4 A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass1CJ A04;
    public final A0H A05;

    public /* bridge */ /* synthetic */ C20126A8l A0C(A6U a6u, String str, boolean z) {
        C18070vi.A0d(a6u, 2);
        C166378cn r3 = a6u.A03;
        String[] strArr = a6u.A06;
        if (strArr.length != 3) {
            return null;
        }
        AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(strArr[1]);
        if (A022 == null) {
            Log.e("delete-chat-mutation/parseJid unable to create chat jid");
        }
        String str2 = strArr[2];
        Boolean A002 = C20068A5s.A00(str2);
        if (A002 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("delete-chat-mutation/parseDeleteMediaFiles value=");
            A10.append(str2);
            C17890vO.A19(A10, " at index=2 is not one of the valid strings");
        }
        if (A022 == null || A002 == null || r3 == null || !AnonymousClass8BU.A1a("deleteChat", strArr) || !C18070vi.A18(C62382rJ.A03, a6u.A01) || !AnonymousClass8BW.A1Q(r3.bitField0_) || (r3.bitField0_ & A7Y.A0F) == 0) {
            return null;
        }
        AnonymousClass8Y3 r2 = r3.deleteChatAction_;
        if (r2 == null) {
            r2 = AnonymousClass8Y3.DEFAULT_INSTANCE;
        }
        C18070vi.A0X(r2);
        boolean A1Q = AnonymousClass8BW.A1Q(r2.bitField0_);
        C165018aS r0 = r2.messageRange_;
        if (r0 == null) {
            r0 = C165018aS.DEFAULT_INSTANCE;
        }
        A7L A023 = A7L.A02(r0, A1Q);
        boolean booleanValue = A002.booleanValue();
        return new C170508py(a6u.A02, A023, A022, str, r3.timestamp_, booleanValue, z);
    }

    public boolean A0J() {
        return true;
    }

    private final void A00(C195559tX r8) {
        AnonymousClass1CJ r0 = this.A04;
        AnonymousClass1BI r6 = r8.A02;
        if (r0.A0A(r6) != null) {
            Log.i("delete-chat-handler/deleteChat deleteMessagesForRange");
            A0H a0h = this.A05;
            boolean z = ((C170508py) r8.A00).A00;
            A7L a7l = r8.A01;
            int A002 = A7L.A00(a0h.A01.A02(r6, true), a7l);
            if (A002 == 2 || A002 == 1) {
                a0h.A00.A0Y(r6, z, false, false);
                AnonymousClass9Q8.A00(a0h.A02.A00(), r6);
                return;
            }
            a0h.A01(a7l, r6, z, true);
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

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0072, code lost:
        if (r4.A04 <= r3.A04) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r1 != null) goto L_0x001d;
     */
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
            X.9tX r5 = X.C196629vN.A00(r2)
            if (r1 != 0) goto L_0x001d
            X.1Rs r0 = r15.A00
            X.C18070vi.A0W(r0)
            X.8q2 r1 = X.C196629vN.A01(r5, r0)
            if (r1 == 0) goto L_0x0063
        L_0x001d:
            X.9tX r0 = X.C196629vN.A00(r1)
            X.A7L r7 = r5.A01
            X.A7L r6 = r0.A01
            int r2 = X.A7L.A00(r7, r6)
            X.8q2 r3 = r5.A00
            X.A7L r1 = r3.A00
            X.8q2 r4 = r0.A00
            X.A7L r0 = r4.A00
            X.A7L.A00(r1, r0)
            if (r2 == 0) goto L_0x0074
            r0 = 1
            if (r2 == r0) goto L_0x007a
            r0 = 2
            if (r2 == r0) goto L_0x006c
            X.1BI r9 = r5.A02
            r0 = r4
            X.8py r0 = (X.C170508py) r0
            boolean r13 = r0.A00
            long r2 = r3.A04
            long r0 = r4.A04
            long r11 = java.lang.Math.max(r2, r0)
            X.A7L r8 = X.A7L.A01(r7, r6)
            r7 = 0
            r14 = 1
            X.8py r6 = new X.8py
            r10 = r7
            r6.<init>(r7, r8, r9, r10, r11, r13, r14)
            r15.A06(r4)
            X.1Rs r1 = r15.A00
            java.util.Set r0 = X.C18070vi.A0P(r6)
            r1.A0I(r0)
        L_0x0063:
            X.8q2 r0 = r5.A00
            r15.A0A(r0)
            r15.A00(r5)
            return
        L_0x006c:
            long r6 = r4.A04
            long r1 = r3.A04
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x007a
        L_0x0074:
            X.1Rs r0 = r15.A00
            r0.A0G(r4)
            goto L_0x0063
        L_0x007a:
            r15.A09(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169818mw.A0I(X.A8l, X.A8l):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C169818mw(A0H a0h, C20606ARq aRq, C26371Rw r3, AnonymousClass1S4 r4, AnonymousClass11P r5, AnonymousClass1CJ r6, C26331Rs r7) {
        super(r7);
        C18070vi.A0w(r5, r6, aRq, r3, r4);
        C18070vi.A0l(r7, a0h);
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = aRq;
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = a0h;
    }

    public String A0D() {
        return "regular_high";
    }

    public String A0E() {
        return "deleteChat";
    }

    public List A0F(boolean z) {
        return C18460wS.A00;
    }
}
