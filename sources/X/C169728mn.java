package X;

import java.util.List;

/* renamed from: X.8mn  reason: invalid class name and case insensitive filesystem */
public final class C169728mn extends C60192nY {
    public final AnonymousClass11S A00;
    public final C19880zA A01;
    public final AnonymousClass11P A02;
    public final C18030ve A03;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        C18070vi.A0d(a6u, 2);
        String[] strArr = a6u.A06;
        if (strArr.length == 0 || !"generated_wui".equals(strArr[0])) {
            return null;
        }
        C62382rJ r1 = a6u.A01;
        C166378cn r2 = a6u.A03;
        if (!C18070vi.A18(C62382rJ.A03, r1) || r2 == null || !AnonymousClass8BW.A1Q(r2.bitField0_) || (r2.bitField1_ & 16384) == 0) {
            return null;
        }
        AnonymousClass8YT r0 = r2.wamoUserIdentifierAction_;
        AnonymousClass8YT r12 = r0;
        if (r0 == null) {
            r0 = AnonymousClass8YT.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return null;
        }
        if (r12 == null) {
            r12 = AnonymousClass8YT.DEFAULT_INSTANCE;
        }
        String str2 = r12.identifier_;
        C18070vi.A0X(str2);
        return new C170538qB(a6u.A02, str2, str, r2.timestamp_);
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        C18070vi.A0d(a8l, 0);
        this.A00.A0N();
        A09(a8l);
    }

    public List A0F(boolean z) {
        this.A00.A0N();
        return AnonymousClass000.A13();
    }

    public boolean A0J() {
        return C18020vd.A05(C18040vf.A02, this.A03, 7890);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C169728mn(C19880zA r1, AnonymousClass11S r2, AnonymousClass11P r3, C26331Rs r4, C18030ve r5) {
        super(r4);
        C18070vi.A0w(r3, r5, r2, r1, r4);
        this.A02 = r3;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r1;
    }

    public String A0D() {
        return "critical_block";
    }

    public String A0E() {
        return "generated_wui";
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        AnonymousClass8BU.A1B(this, a8l);
    }
}
