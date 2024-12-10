package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Set;

/* renamed from: X.5xA  reason: invalid class name and case insensitive filesystem */
public final class C116375xA extends C60192nY {
    public final AnonymousClass11P A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1RL A02;
    public final C18030ve A03;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        AnonymousClass1E2 r8;
        C18070vi.A0d(a6u, 2);
        C166378cn r3 = a6u.A03;
        if (r3 == null) {
            return null;
        }
        String[] strArr = a6u.A06;
        if (!C18070vi.A18(strArr[0], "shareOwnPn") || strArr.length != 2 || !C18070vi.A18(a6u.A01, C116965yv.A02)) {
            return null;
        }
        UserJid A04 = UserJid.Companion.A04(strArr[1]);
        if (!(A04 instanceof AnonymousClass1E2) || (r8 = (AnonymousClass1E2) A04) == null) {
            return null;
        }
        return new C116965yv(a6u.A02, r8, str, r3.timestamp_);
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        C18070vi.A0d(a8l, 0);
        A07(a8l);
    }

    public List A0F(boolean z) {
        Set A0I = this.A01.A0I();
        C18070vi.A0X(A0I);
        C147157Sa A09 = AnonymousClass1b2.A09(AnonymousClass83Y.A00, new C99434so(A0I, 4));
        C18070vi.A0z(A09, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return AnonymousClass1b2.A06(AnonymousClass1b2.A0C(new C157977yx(this), AnonymousClass1b2.A09(new C157967yw(this), A09)));
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        C116965yv r3 = (C116965yv) a8l;
        C18070vi.A0d(r3, 0);
        this.A02.A08(r3.A00);
        A08(r3);
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        C116965yv r6 = (C116965yv) a8l;
        C18070vi.A0d(r6, 0);
        if (a8l2 == null) {
            this.A02.A08(r6.A00);
        } else if (a8l2.A04 < r6.A04) {
            A0B(r6, a8l2);
            return;
        }
        A09(r6);
    }

    public boolean A0J() {
        return C18020vd.A05(C18040vf.A02, this.A03, 3070);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116375xA(AnonymousClass11P r1, AnonymousClass1CJ r2, AnonymousClass1RL r3, C26331Rs r4, C18030ve r5) {
        super(r4);
        C18070vi.A0w(r4, r1, r5, r2, r3);
        this.A00 = r1;
        this.A03 = r5;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String A0D() {
        return "regular";
    }

    public String A0E() {
        return "shareOwnPn";
    }
}
