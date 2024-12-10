package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.8n0  reason: invalid class name */
public final class AnonymousClass8n0 extends C60192nY {
    public final C20606ARq A00;
    public final AnonymousClass1S4 A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1CJ A03;
    public final C32791hl A04;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        AnonymousClass1BI r6;
        C18070vi.A0d(a6u, 2);
        C166378cn r3 = a6u.A03;
        String[] strArr = a6u.A06;
        int length = strArr.length;
        if (length != 2 || !AnonymousClass8BU.A1a("markChatAsRead", strArr)) {
            r6 = null;
        } else {
            r6 = AnonymousClass1BI.A00.A02(strArr[1]);
            if (r6 == null) {
                Log.e("mark-chat-as-read-mutation/from-key-value unable to create chat jid");
            }
        }
        if (r3 == null || r6 == null || !C18070vi.A18(C62382rJ.A03, a6u.A01) || length != 2 || !AnonymousClass8BU.A1a("markChatAsRead", strArr) || !AnonymousClass8BW.A1Q(r3.bitField0_) || (r3.bitField0_ & 32768) == 0) {
            return null;
        }
        AnonymousClass8ZY r0 = r3.markChatAsReadAction_;
        AnonymousClass8ZY r2 = r0;
        if (r0 == null) {
            r0 = AnonymousClass8ZY.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return null;
        }
        if (r2 == null) {
            r2 = AnonymousClass8ZY.DEFAULT_INSTANCE;
        }
        boolean A1O = AnonymousClass000.A1O(r2.bitField0_ & 2);
        C165018aS r02 = r2.messageRange_;
        if (r02 == null) {
            r02 = C165018aS.DEFAULT_INSTANCE;
        }
        A7L A022 = A7L.A02(r02, A1O);
        boolean z2 = r2.read_;
        return new AnonymousClass8q0(a6u.A02, A022, r6, str, r3.timestamp_, z2, z);
    }

    public boolean A0J() {
        return true;
    }

    private final void A00(C195559tX r6) {
        C29691ci A0A;
        AnonymousClass1BI r4 = r6.A02;
        AnonymousClass1CJ r3 = this.A03;
        if (r3.A0A(r4) != null) {
            int A002 = A7L.A00(this.A00.A02(r4, false), r6.A01);
            if (A002 == 0 || !(A002 == 1 || A002 == 2)) {
                AnonymousClass8q2 r2 = r6.A00;
                if (((AnonymousClass8q0) r2).A00 && (A0A = r3.A0A(r4)) != null && A0A.A0A == -1) {
                    A01(r6);
                }
                A09(r2);
                return;
            }
            A01(r6);
        }
        A0A(r6.A00);
    }

    private final void A01(C195559tX r8) {
        if (((AnonymousClass8q0) r8.A00).A00) {
            this.A04.A00(r8.A02, 3, 5, false, true, false);
        } else {
            this.A04.A02(r8.A02, false);
        }
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        AnonymousClass8q2 r2 = (AnonymousClass8q2) a8l;
        C18070vi.A0d(r2, 0);
        A00(C196629vN.A00(r2));
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        AnonymousClass8q2 r4 = (AnonymousClass8q2) a8l;
        C18070vi.A0d(r4, 0);
        C195559tX A002 = C196629vN.A00(r4);
        if (this.A03.A0A(A002.A02) == null) {
            A06(r4);
            return;
        }
        A01(A002);
        A08(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0078, code lost:
        if (r6.A00.A04 <= r7.A00.A04) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r1 != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0I(X.C20126A8l r18, X.C20126A8l r19) {
        /*
            r17 = this;
            r1 = r19
            r2 = r18
            X.8q2 r2 = (X.AnonymousClass8q2) r2
            X.8q2 r1 = (X.AnonymousClass8q2) r1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.9tX r7 = X.C196629vN.A00(r2)
            r3 = r17
            if (r1 != 0) goto L_0x001f
            X.1Rs r0 = r3.A00
            X.C18070vi.A0W(r0)
            X.8q2 r1 = X.C196629vN.A01(r7, r0)
            if (r1 == 0) goto L_0x0081
        L_0x001f:
            X.9tX r6 = X.C196629vN.A00(r1)
            X.A7L r10 = r7.A01
            X.A7L r9 = r6.A01
            int r1 = X.A7L.A00(r10, r9)
            if (r1 == 0) goto L_0x007a
            r0 = 1
            if (r1 == r0) goto L_0x0085
            r0 = 2
            if (r1 == r0) goto L_0x006e
            X.8q2 r7 = r7.A00
            long r4 = r7.A04
            X.8q2 r8 = r6.A00
            long r0 = r8.A04
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0040
            r8 = r7
        L_0x0040:
            X.8q0 r8 = (X.AnonymousClass8q0) r8
            boolean r15 = r8.A00
            X.1BI r11 = r6.A02
            long r13 = java.lang.Math.max(r4, r0)
            X.A7L r10 = X.A7L.A01(r10, r9)
            r9 = 0
            r16 = 1
            X.8q0 r8 = new X.8q0
            r12 = r9
            r8.<init>(r9, r10, r11, r12, r13, r15, r16)
            r3.A09(r7)
            r3.A06(r7)
            X.1Rs r1 = r3.A00
            java.util.Set r0 = X.C18070vi.A0P(r8)
            r1.A0I(r0)
            X.9tX r0 = X.C196629vN.A00(r8)
            r3.A01(r0)
            return
        L_0x006e:
            X.8q2 r0 = r6.A00
            long r4 = r0.A04
            X.8q2 r0 = r7.A00
            long r1 = r0.A04
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0085
        L_0x007a:
            X.1Rs r1 = r3.A00
            X.8q2 r0 = r6.A00
            r1.A0G(r0)
        L_0x0081:
            r3.A00(r7)
            return
        L_0x0085:
            X.8q2 r0 = r7.A00
            r3.A09(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8n0.A0I(X.A8l, X.A8l):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8n0(C20606ARq aRq, AnonymousClass1S4 r3, C32791hl r4, AnonymousClass11P r5, AnonymousClass1CJ r6, C26331Rs r7) {
        super(r7);
        C18070vi.A0w(r5, r6, aRq, r3, r7);
        C18070vi.A0d(r4, 6);
        this.A02 = r5;
        this.A03 = r6;
        this.A00 = aRq;
        this.A01 = r3;
        this.A04 = r4;
    }

    public String A0D() {
        return "regular_low";
    }

    public String A0E() {
        return "markChatAsRead";
    }

    public List A0F(boolean z) {
        boolean z2;
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass1CJ r6 = this.A03;
        ArrayList A132 = AnonymousClass000.A13();
        ConcurrentHashMap A012 = AnonymousClass1CJ.A01(r6);
        synchronized (r6) {
            z2 = r6.A00;
        }
        if (z2) {
            Iterator A0i = C17890vO.A0i(A012);
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                AnonymousClass1BI r3 = (AnonymousClass1BI) A16.getKey();
                if (((C29691ci) A16.getValue()).A0A == -1 && !r6.A0T(r3)) {
                    A132.add(r3);
                }
            }
            Iterator it = A132.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                C18070vi.A0b(A0Q);
                long A013 = AnonymousClass11P.A01(this.A02);
                A7L A022 = this.A00.A02(A0Q, false);
                C18070vi.A0d(A0Q, 1);
                A13.add(new AnonymousClass8q0((C19999A2n) null, A022, A0Q, (String) null, A013, false, false));
            }
            return A13;
        }
        throw AnonymousClass000.A0n("ChatsCache/getMarkedAsUnreadChats: chat haven't initialized");
    }
}
