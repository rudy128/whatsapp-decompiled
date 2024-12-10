package X;

import android.view.ViewGroup;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5lT  reason: invalid class name and case insensitive filesystem */
public final class C112435lT extends C38391rD implements AnonymousClass8AW, AnonymousClass1GC {
    public C116705yU A00;
    public List A01 = C18460wS.A00;
    public C34541kf A02;
    public final int A03;
    public final C131406l2 A04;
    public final C131426l5 A05;
    public final C37451pZ A06;
    public final C18100vl A07;

    public void Bl7() {
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C42011xT A002;
        C18070vi.A0d(viewGroup, 0);
        if (this.A03 == 3) {
            A002 = this.A05.A00(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624690, false), this.A06, this, false, false);
        } else {
            A002 = this.A04.A00(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131627089, false), this.A06, this, true);
        }
        C42011xT r1 = A002;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.updates.ui.adapter.status.viewholders.StatusViewHolder<com.whatsapp.updates.ui.adapter.StatusDataItem>");
        return r1;
    }

    public /* synthetic */ void Byt() {
    }

    public void Byu() {
    }

    public void C6U(C27581Wq r3, AnonymousClass1F9 r4) {
        int A042 = C108955ca.A04(r3, 1);
        if (A042 == 3) {
            C108955ca.A1O(this.A00);
        } else if (A042 == 5) {
            this.A06.A02();
            this.A02 = null;
        }
    }

    public int A0Q() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r3, int i) {
        C113585nK r32 = (C113585nK) r3;
        C18070vi.A0d(r32, 0);
        List list = C42011xT.A0I;
        r32.A0C((AnonymousClass6U0) this.A01.get(i));
    }

    public void C6a(UserJid userJid) {
        C34541kf r0 = this.A02;
        if (r0 != null) {
            r0.C6a(userJid);
        }
    }

    public void C6g(UserJid userJid, boolean z) {
        C34541kf r0 = this.A02;
        if (r0 != null) {
            r0.C6g(userJid, z);
        }
    }

    public C112435lT(C131406l2 r3, C131426l5 r4, C27201Vd r5, AnonymousClass118 r6, C34541kf r7, AnonymousClass10I r8, int i) {
        C18070vi.A0w(r8, r5, r6, r3, r4);
        this.A04 = r3;
        this.A05 = r4;
        this.A02 = r7;
        this.A03 = i;
        this.A07 = AnonymousClass1DF.A01(new C154577rM(r8));
        this.A06 = r5.A06(r6.A00, "muted_statuses_activity");
    }
}
