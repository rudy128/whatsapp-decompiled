package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.8mo  reason: invalid class name and case insensitive filesystem */
public class C169738mo extends C60192nY {
    public final AnonymousClass18O A00;
    public final AnonymousClass11P A01;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        C18070vi.A0d(a6u, 2);
        String[] strArr = a6u.A06;
        C62382rJ r3 = a6u.A01;
        C166378cn r2 = a6u.A03;
        if (strArr.length != 1 || !AnonymousClass8BU.A1a("android_unsupported_actions", strArr) || !C18070vi.A18(C62382rJ.A03, r3) || r2 == null || !AnonymousClass8BW.A1Q(r2.bitField0_) || (r2.bitField0_ & 1048576) == 0) {
            return null;
        }
        C164188Xw r0 = r2.androidUnsupportedActions_;
        if (r0 == null) {
            r0 = C164188Xw.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return null;
        }
        return new AnonymousClass8q5(a6u.A02, str, r2.timestamp_, z);
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        A0B(a8l, (C20126A8l) null);
    }

    public List A0F(boolean z) {
        return Collections.singletonList(new AnonymousClass8q5((C19999A2n) null, (String) null, AnonymousClass11P.A01(this.A01), false));
    }

    public boolean A0J() {
        return this.A00.A09(AnonymousClass18O.A0M);
    }

    public C169738mo(AnonymousClass18O r1, AnonymousClass11P r2, C26331Rs r3) {
        super(r3);
        this.A01 = r2;
        this.A00 = r1;
    }

    public String A0D() {
        return "regular_low";
    }

    public String A0E() {
        return "android_unsupported_actions";
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        A0B(a8l, a8l2);
    }
}
