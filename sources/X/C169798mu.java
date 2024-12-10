package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8mu  reason: invalid class name and case insensitive filesystem */
public class C169798mu extends C60192nY {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        C18070vi.A0d(a6u, 1);
        String[] strArr = a6u.A06;
        if (strArr.length == 2 && AnonymousClass8BU.A1a("primary_version", strArr)) {
            String str2 = strArr[1];
            if (C18070vi.A18(str2, "current") || C18070vi.A18(str2, "session_start")) {
                C62382rJ r1 = a6u.A01;
                C166378cn r2 = a6u.A03;
                if (C18070vi.A18(C62382rJ.A03, r1) && r2 != null && AnonymousClass8BW.A1Q(r2.bitField0_) && (r2.bitField0_ & 67108864) != 0) {
                    AnonymousClass8YG r0 = r2.primaryVersionAction_;
                    AnonymousClass8YG r12 = r0;
                    if (r0 == null) {
                        r0 = AnonymousClass8YG.DEFAULT_INSTANCE;
                    }
                    if ((r0.bitField0_ & 1) != 0) {
                        long j = r2.timestamp_;
                        if (r12 == null) {
                            r12 = AnonymousClass8YG.DEFAULT_INSTANCE;
                        }
                        String str3 = r12.version_;
                        C18070vi.A0X(str3);
                        return new C170548qC(a6u.A02, str2, str3, str, j);
                    }
                }
            }
        }
        return null;
    }

    public List A0F(boolean z) {
        ArrayList A0z = C17880vN.A0z(2);
        A0z.add(A0K("current"));
        if (!z) {
            A0z.add(A0K("session_start"));
        }
        return A0z;
    }

    public boolean A0J() {
        return true;
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        C17960vV.A0F(false, "PrimaryVersionMutation shouldn't have dependencies");
        A07(a8l);
    }

    public C170548qC A0K(String str) {
        C17960vV.A0D(!this.A00.A0N());
        return new C170548qC((C19999A2n) null, str, "2.24.24.78", (String) null, AnonymousClass11P.A01(this.A01));
    }

    public C169798mu(AnonymousClass11S r1, AnonymousClass11P r2, C26331Rs r3) {
        super(r3);
        this.A01 = r2;
        this.A00 = r1;
    }

    public String A0D() {
        return "regular_low";
    }

    public String A0E() {
        return "primary_version";
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        A08(a8l);
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        A09(a8l);
    }
}
