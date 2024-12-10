package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8mt  reason: invalid class name and case insensitive filesystem */
public final class C169788mt extends C60192nY {
    public final AnonymousClass1S4 A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass121 A02;
    public final AnonymousClass1WM A03;
    public final AnonymousClass00H A04;

    public /* bridge */ /* synthetic */ C20126A8l A0C(A6U a6u, String str, boolean z) {
        C18070vi.A0d(a6u, 2);
        C166378cn r2 = a6u.A03;
        String[] strArr = a6u.A06;
        if (strArr.length != 5) {
            return null;
        }
        C22931Dv r4 = AnonymousClass1BI.A00;
        AnonymousClass1BI A022 = r4.A02(strArr[1]);
        if (A022 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("delete-message-for-me-mutation/from-key-value unable to create chat jid from ");
            C17890vO.A19(A10, strArr[1]);
        }
        String str2 = strArr[3];
        Boolean A002 = C20068A5s.A00(str2);
        if (A002 == null) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("delete-message-for-me-mutation/from-key-value value=");
            A102.append(str2);
            C17890vO.A19(A102, " at index=3 is not one of the valid strings");
        }
        if (A022 == null || A002 == null || r2 == null || !C18070vi.A18(C62382rJ.A03, a6u.A01) || !AnonymousClass8BU.A1a("deleteMessageForMe", strArr) || !AnonymousClass8BW.A1Q(r2.bitField0_) || (r2.bitField0_ & DefaultCrypto.BUFFER_SIZE) == 0) {
            return null;
        }
        AnonymousClass8ZX r0 = r2.deleteMessageForMeAction_;
        AnonymousClass8ZX r1 = r0;
        if (r0 == null) {
            r0 = AnonymousClass8ZX.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return null;
        }
        if (r1 == null) {
            r1 = AnonymousClass8ZX.DEFAULT_INSTANCE;
        }
        if ((r1.bitField0_ & 2) == 0) {
            return null;
        }
        AnonymousClass205 A012 = AnonymousClass205.A01(A022, strArr[2], A002.booleanValue());
        AnonymousClass1BI A023 = r4.A02(strArr[4]);
        AnonymousClass8ZX r12 = r2.deleteMessageForMeAction_;
        AnonymousClass8ZX r02 = r12;
        if (r12 == null) {
            r12 = AnonymousClass8ZX.DEFAULT_INSTANCE;
        }
        boolean z2 = r12.deleteMedia_;
        long j = r2.timestamp_;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (r02 == null) {
            r02 = AnonymousClass8ZX.DEFAULT_INSTANCE;
        }
        return new C170478pv(a6u.A02, A023, A012, str, j, timeUnit.toMillis(r02.messageTimestamp_), z2, z);
    }

    public boolean A0J() {
        return true;
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        C170478pv r4 = (C170478pv) a8l;
        C18070vi.A0d(r4, 0);
        A24 A002 = C196619vM.A00(r4);
        AnonymousClass206 A003 = AnonymousClass2T0.A00(this.A03, A24.A00(A002, A002.A00), (AnonymousClass1W6) C18070vi.A0E(this.A04));
        if (A003 != null) {
            this.A02.BIL(C18070vi.A0P(A003), r4.A02 ? 1 : 0);
            A07(r4);
        }
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        C170478pv r4 = (C170478pv) a8l;
        C18070vi.A0d(r4, 0);
        A24 A002 = C196619vM.A00(r4);
        AnonymousClass206 A012 = AnonymousClass1W2.A01(A24.A00(A002, A002.A00), this.A04);
        if (A012 != null) {
            this.A02.BIL(C18070vi.A0P(A012), r4.A02 ? 1 : 0);
        }
        A08(r4);
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        C170598qH r6 = (C170598qH) a8l;
        C170478pv r7 = (C170478pv) a8l2;
        C18070vi.A0d(r6, 0);
        A24 A002 = C196619vM.A00(r6);
        C170598qH r4 = A002.A00;
        AnonymousClass205 A003 = A24.A00(A002, r4);
        if (r7 == null) {
            C26331Rs r0 = this.A00;
            C18070vi.A0W(r0);
            r7 = (C170478pv) C196619vM.A01(A002, r0);
            if (r7 == null) {
                AnonymousClass206 A004 = AnonymousClass2T0.A00(this.A03, A003, (AnonymousClass1W6) C18070vi.A0E(this.A04));
                if (A004 != null) {
                    this.A02.BIL(C18070vi.A0P(A004), ((C170478pv) r4).A02 ? 1 : 0);
                    A09(r4);
                }
                A0A(r4);
                return;
            }
        }
        if (((C170478pv) r4).A02 || !r7.A02) {
            A0B(r4, r7);
            return;
        }
        A09(r4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C169788mt(AnonymousClass1S4 r2, AnonymousClass11P r3, AnonymousClass121 r4, AnonymousClass1WM r5, C26331Rs r6, AnonymousClass00H r7) {
        super(r6);
        C18070vi.A0w(r3, r4, r7, r2, r5);
        C18070vi.A0d(r6, 6);
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r7;
        this.A00 = r2;
        this.A03 = r5;
    }

    public String A0D() {
        return "regular_high";
    }

    public String A0E() {
        return "deleteMessageForMe";
    }

    public List A0F(boolean z) {
        return AnonymousClass000.A13();
    }
}
