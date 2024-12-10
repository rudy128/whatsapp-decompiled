package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5x8  reason: invalid class name and case insensitive filesystem */
public final class C116355x8 extends C60192nY {
    public final AnonymousClass11P A00;
    public final C24751Ln A01;
    public final C18030ve A02;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        AnonymousClass1E2 r8;
        PhoneUserJid phoneUserJid;
        C18070vi.A0d(a6u, 2);
        C166378cn r2 = a6u.A03;
        if (r2 == null) {
            return null;
        }
        String[] strArr = a6u.A06;
        if (!C18070vi.A18(strArr[0], "pnForLidChat") || strArr.length != 2 || !C18070vi.A18(a6u.A01, C116975yw.A03) || (r2.bitField0_ & Integer.MIN_VALUE) == 0) {
            return null;
        }
        C22941Dw r1 = UserJid.Companion;
        UserJid A04 = r1.A04(strArr[1]);
        if (!(A04 instanceof AnonymousClass1E2) || (r8 = (AnonymousClass1E2) A04) == null) {
            return null;
        }
        AnonymousClass8YF r0 = r2.pnForLidChatAction_;
        if (r0 == null) {
            r0 = AnonymousClass8YF.DEFAULT_INSTANCE;
        }
        UserJid A042 = r1.A04(r0.pnJid_);
        if (!(A042 instanceof PhoneUserJid) || (phoneUserJid = (PhoneUserJid) A042) == null) {
            return null;
        }
        return new C116975yw(a6u.A02, r8, phoneUserJid, str, r2.timestamp_);
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        C18070vi.A0d(a8l, 0);
        A07(a8l);
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        C18070vi.A0d(a8l, 0);
        A08(a8l);
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        C116975yw r6 = (C116975yw) a8l;
        C18070vi.A0d(r6, 0);
        if (a8l2 == null) {
            this.A01.A0P(r6.A00, r6.A01);
        } else if (a8l2.A04 < r6.A04) {
            A0B(r6, a8l2);
            return;
        }
        A09(r6);
    }

    public boolean A0J() {
        return C18020vd.A05(C18040vf.A02, this.A02, 3062);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116355x8(AnonymousClass11P r1, C24751Ln r2, C26331Rs r3, C18030ve r4) {
        super(r3);
        C18070vi.A0s(r3, r2, r1, r4);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r4;
    }

    public String A0D() {
        return "regular";
    }

    public String A0E() {
        return "pnForLidChat";
    }

    public List A0F(boolean z) {
        return C18460wS.A00;
    }
}
