package X;

import java.util.List;

/* renamed from: X.8mq  reason: invalid class name and case insensitive filesystem */
public final class C169758mq extends C60192nY {
    public final AnonymousClass4bI A00;
    public final AnonymousClass11P A01;
    public final C18030ve A02;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        AnonymousClass9Jm r7;
        C18070vi.A0d(a6u, 2);
        C166378cn r3 = a6u.A03;
        if (r3 == null) {
            return null;
        }
        String[] strArr = a6u.A06;
        if (!C18070vi.A18(strArr[0], "usernameChatStartMode") || strArr.length != 1 || !C18070vi.A18(a6u.A01, C170588qG.A02) || (r3.bitField1_ & 2097152) == 0) {
            return null;
        }
        long j = r3.timestamp_;
        C19999A2n a2n = a6u.A02;
        AnonymousClass8YR r0 = r3.usernameChatStartMode_;
        if (r0 == null) {
            r0 = AnonymousClass8YR.DEFAULT_INSTANCE;
        }
        int i = r0.chatStartMode_;
        if (i == 1 || i != 2) {
            r7 = AnonymousClass9Jm.LID;
        } else {
            r7 = AnonymousClass9Jm.PN;
        }
        return new C170588qG(a2n, r7, str, j);
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        C18070vi.A0d(a8l, 0);
        A07(a8l);
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        C82804Cd r0;
        C170588qG r6 = (C170588qG) a8l;
        C18070vi.A0d(r6, 0);
        if (a8l2 == null) {
            AnonymousClass9Jm r02 = r6.A00;
            AnonymousClass4bI r1 = this.A00;
            if (r02.ordinal() != 0) {
                r0 = C82804Cd.PHONE_NUMBER;
            } else {
                r0 = C82804Cd.USERNAME;
            }
            r1.A01(r0);
        } else if (a8l2.A04 < r6.A04) {
            A0B(r6, a8l2);
            return;
        }
        A09(r6);
    }

    public boolean A0J() {
        return C18020vd.A05(C18040vf.A02, this.A02, 10976);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C169758mq(AnonymousClass11P r1, C26331Rs r2, C18030ve r3, AnonymousClass4bI r4) {
        super(r2);
        C18070vi.A0s(r2, r3, r4, r1);
        this.A02 = r3;
        this.A00 = r4;
        this.A01 = r1;
    }

    public String A0D() {
        return "regular";
    }

    public String A0E() {
        return "usernameChatStartMode";
    }

    public List A0F(boolean z) {
        AnonymousClass9Jm r2;
        long currentTimeMillis = System.currentTimeMillis();
        int ordinal = this.A00.A00().ordinal();
        if (ordinal == 0) {
            r2 = AnonymousClass9Jm.LID;
        } else if (ordinal == 1) {
            r2 = AnonymousClass9Jm.PN;
        } else {
            throw AnonymousClass3MW.A14();
        }
        return C18070vi.A0M(new C170588qG((C19999A2n) null, r2, (String) null, currentTimeMillis));
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        AnonymousClass8BU.A1B(this, a8l);
    }
}
