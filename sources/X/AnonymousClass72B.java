package X;

import com.whatsapp.bridge.wfal.WfalManager;
import java.util.Collection;

/* renamed from: X.72B  reason: invalid class name */
public final class AnonymousClass72B {
    public final C18100vl A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18030ve A05;

    public static int A00(AnonymousClass00H r2) {
        return ((AnonymousClass72B) r2.get()).A02(false).ordinal();
    }

    public final boolean A04(C122646Re r6, Collection collection, int i, boolean z) {
        AnonymousClass6R1 A022 = A02(z);
        if (r6 == C122646Re.FACEBOOK) {
            int ordinal = A022.ordinal();
            if (ordinal == 3) {
                return ((C139066y9) this.A01.getValue()).A01(r6, collection, i);
            }
            if (ordinal == 2 || ordinal == 1) {
                return ((C133776pT) this.A03.getValue()).A01(i, collection);
            }
            return false;
        } else if (r6 == C122646Re.INSTAGRAM && (A022 == AnonymousClass6R1.V2_TO_V3_TRANSITION || A022 == AnonymousClass6R1.WAFFLE_V3)) {
            return ((C139066y9) this.A01.getValue()).A01(r6, collection, i);
        } else {
            return false;
        }
    }

    public final AnonymousClass6R1 A02(boolean z) {
        boolean A002 = ((C30141dS) this.A04.getValue()).A00();
        boolean A003 = WfalManager.A00((WfalManager) this.A02.getValue(), AnonymousClass000.A1O(z ? 1 : 0));
        if (A002) {
            if (!A003) {
                return AnonymousClass6R1.V2_ENABLED;
            }
            if (((C35511mM) this.A00.getValue()).A06(AnonymousClass00R.A0S)) {
                return AnonymousClass6R1.V2_TO_V3_TRANSITION;
            }
        } else if (!A003) {
            return AnonymousClass6R1.DISABLED;
        }
        return AnonymousClass6R1.WAFFLE_V3;
    }

    public final boolean A03() {
        if (!C18020vd.A05(C18040vf.A01, this.A05, 12192)) {
            return false;
        }
        if (((C30141dS) this.A04.getValue()).A00() || WfalManager.A00((WfalManager) this.A02.getValue(), false)) {
            return true;
        }
        return false;
    }

    public AnonymousClass72B(C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A05 = r2;
        this.A02 = AnonymousClass1DF.A01(new C154967rz(r4));
        this.A04 = AnonymousClass1DF.A01(new C154987s1(r5));
        this.A00 = AnonymousClass1DF.A01(new C154947rx(r3));
        this.A03 = AnonymousClass1DF.A01(new C154977s0(r6));
        this.A01 = AnonymousClass1DF.A01(new C154957ry(r7));
    }

    public static AnonymousClass6R1 A01(AnonymousClass00H r1) {
        return ((AnonymousClass72B) r1.get()).A02(false);
    }
}
