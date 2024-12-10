package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Vb  reason: invalid class name and case insensitive filesystem */
public final class C73363Vb extends AnonymousClass1J2 implements C108655c5 {
    public final Bundle A00;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0M(true);
    public final AnonymousClass1DT A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass1DT A04 = AnonymousClass3MW.A0M(true);
    public final C34511kb A05;
    public final AnonymousClass3TB A06;
    public final AnonymousClass1EC A07;
    public final AnonymousClass1DS A08;
    public final AnonymousClass1DS A09;
    public final AnonymousClass1DS A0A;
    public final C56552he A0B;
    public final AnonymousClass1M9 A0C;
    public final AnonymousClass3L6 A0D;
    public final C27141Uw A0E;
    public final AnonymousClass10I A0F;

    public C73363Vb(Bundle bundle, C56552he r7, C34511kb r8, AnonymousClass1M9 r9, C27141Uw r10, AnonymousClass1EC r11, AnonymousClass10I r12) {
        C72473Md.A1M(r12, r9, r8, 3);
        C18070vi.A0l(r10, r7);
        this.A00 = bundle;
        this.A07 = r11;
        this.A0F = r12;
        this.A0C = r9;
        this.A05 = r8;
        this.A0E = r10;
        this.A0B = r7;
        Boolean A0h = AnonymousClass000.A0h();
        this.A02 = AnonymousClass3MW.A0M(A0h);
        this.A03 = AnonymousClass3MW.A0M(A0h);
        this.A06 = new AnonymousClass3TB(r7, r8, r9, r12);
        this.A08 = AnonymousClass3MW.A0M(A0h);
        this.A09 = AnonymousClass3MW.A0M(true);
        this.A0A = AnonymousClass3MW.A0M(AnonymousClass000.A13());
        C96294nc r3 = new C96294nc(this, 17);
        this.A0D = r3;
        AnonymousClass1DT r1 = this.A02;
        Bundle bundle2 = this.A00;
        AnonymousClass3MY.A1M(r1, bundle2.getBoolean("require_membership_approval", false));
        AnonymousClass3MY.A1M(this.A03, bundle2.getBoolean("add_other_participants", false));
        AnonymousClass3MY.A1M(this.A04, bundle2.getBoolean("send_messages", true));
        AnonymousClass3MY.A1M(this.A01, bundle2.getBoolean("edit_group_info", true));
        r10.A00(r3);
    }

    public void BJp(AnonymousClass1FU r1, List list) {
    }

    public void BpY() {
    }

    public void Bpa() {
    }

    public void C2q() {
    }

    public void C2s() {
    }

    public void C3I(boolean z) {
    }

    public void CRL(int i, boolean z) {
        Bundle bundle;
        String str;
        if (i == 1) {
            bundle = this.A00;
            str = "edit_group_info";
        } else if (i == 2) {
            bundle = this.A00;
            str = "send_messages";
        } else if (i == 3) {
            bundle = this.A00;
            str = "require_membership_approval";
        } else if (i == 4) {
            this.A00.putBoolean("add_other_participants", z);
            AnonymousClass3MY.A1M(this.A03, z);
            this.A06.A0G(this.A07, z);
            return;
        } else {
            return;
        }
        bundle.putBoolean(str, z);
    }

    public void A0S() {
        this.A0E.A01(this.A0D);
    }

    public AnonymousClass1DS BMe() {
        return this.A0A;
    }

    public AnonymousClass3TB BP4() {
        return this.A06;
    }

    public AnonymousClass1DS BTF() {
        return this.A08;
    }

    public AnonymousClass1DT BTG() {
        return this.A01;
    }

    public AnonymousClass1DS BTH() {
        return this.A09;
    }

    public AnonymousClass1DS BTI() {
        return this.A08;
    }

    public AnonymousClass1DS BTJ() {
        return this.A08;
    }

    public AnonymousClass1DS BTK() {
        return this.A09;
    }

    public AnonymousClass1DT BTL() {
        return this.A02;
    }

    public AnonymousClass1DT BTM() {
        return this.A03;
    }

    public AnonymousClass1DS BTP() {
        return this.A08;
    }

    public AnonymousClass1DS BTQ() {
        return this.A09;
    }

    public AnonymousClass1DT BTR() {
        return this.A04;
    }

    public AnonymousClass1DS BTS() {
        return this.A09;
    }

    public AnonymousClass1DS BYB() {
        return this.A08;
    }

    public AnonymousClass1DS BZF() {
        return this.A08;
    }

    public ArrayList BMd() {
        return AnonymousClass000.A13();
    }

    public C41731wy BZE() {
        return AnonymousClass3MW.A0o();
    }

    public C41731wy BZG() {
        return AnonymousClass3MW.A0o();
    }
}
