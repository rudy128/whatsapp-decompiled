package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.util.List;

/* renamed from: X.8mr  reason: invalid class name and case insensitive filesystem */
public final class C169768mr extends C60192nY {
    public final AnonymousClass1TK A00;
    public final C59992nD A01;
    public final AnonymousClass1NN A02;
    public final AnonymousClass11P A03;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        C18070vi.A0d(a6u, 2);
        C166378cn r2 = a6u.A03;
        if (r2 == null) {
            return null;
        }
        String[] strArr = a6u.A06;
        if (!C18070vi.A18(strArr[0], "setting_chatLock") || strArr.length != 1 || !C18070vi.A18(a6u.A01, C170578qF.A02) || (r2.bitField1_ & DefaultCrypto.BUFFER_SIZE) == 0) {
            return null;
        }
        long j = r2.timestamp_;
        C19999A2n a2n = a6u.A02;
        C164288Yg r22 = r2.chatLockSettings_;
        if (r22 == null) {
            r22 = C164288Yg.DEFAULT_INSTANCE;
        }
        C18070vi.A0X(r22);
        return new C170578qF(a2n, r22, str, j);
    }

    public List A0F(boolean z) {
        return AnonymousClass8BR.A11(A0K(), new C20126A8l[1], 0);
    }

    public boolean A0J() {
        return true;
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        C170578qF r6 = (C170578qF) a8l;
        C18070vi.A0d(r6, 0);
        if (a8l2 == null || a8l2.A04 < r6.A04) {
            C164288Yg r2 = r6.A00;
            boolean A1O = AnonymousClass000.A1O(r2.bitField0_ & 2);
            C59992nD r1 = this.A01;
            if (A1O) {
                C165328ax r0 = r2.secretCode_;
                if (r0 == null) {
                    r0 = C165328ax.DEFAULT_INSTANCE;
                }
                C18070vi.A0X(r0);
                r1.A03(r0);
            } else {
                r1.A02();
            }
            if ((r2.bitField0_ & 1) != 0) {
                this.A00.A02(r2.hideLockedChats_);
                this.A02.A00();
            }
            A0B(r6, a8l2);
            return;
        }
        A09(r6);
    }

    public final C170578qF A0K() {
        C163858Wp r3 = (C163858Wp) C164288Yg.DEFAULT_INSTANCE.A0N();
        C165328ax A002 = this.A01.A00();
        if (A002 != null) {
            r3.A0H(this.A00.A04());
            r3.A0G(A002);
        } else {
            r3.A0H(false);
            C164288Yg r1 = (C164288Yg) C17880vN.A0G(r3);
            r1.secretCode_ = null;
            r1.bitField0_ &= -3;
        }
        return new C170578qF((C19999A2n) null, (C164288Yg) r3.A0C(), (String) null, AnonymousClass11P.A01(this.A03));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C169768mr(AnonymousClass1TK r1, C59992nD r2, AnonymousClass11P r3, AnonymousClass1NN r4, C26331Rs r5) {
        super(r5);
        C18070vi.A0w(r5, r3, r2, r4, r1);
        this.A03 = r3;
        this.A01 = r2;
        this.A02 = r4;
        this.A00 = r1;
    }

    public String A0D() {
        return "regular_low";
    }

    public String A0E() {
        return "setting_chatLock";
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        AnonymousClass8BU.A1B(this, a8l);
    }
}
