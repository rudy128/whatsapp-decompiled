package X;

import android.os.Handler;
import android.os.SystemClock;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4SY  reason: invalid class name */
public final class AnonymousClass4SY {
    public int A00;
    public long A01;
    public long A02;
    public C81833zs A03;
    public Set A04;
    public boolean A05;
    public final C21448AkF A06 = new C21448AkF(this, 28);
    public final C34171k3 A07 = new C76693nw(this, 5);
    public final C35751mk A08;
    public final AnonymousClass4LE A09;
    public final AnonymousClass11P A0A;
    public final AnonymousClass1CJ A0B;
    public final AnonymousClass1MZ A0C;
    public final C18030ve A0D;
    public final C95684md A0E;
    public final GroupJid A0F;
    public final C85044Lw A0G = new C85044Lw(this);
    public final C26241Rj A0H;
    public final C18100vl A0I = AnonymousClass1DF.A01(AnonymousClass5QK.A00);
    public final AnonymousClass18K A0J;
    public final C25241Nl A0K;
    public final C85994Pt A0L = new C85994Pt(this);
    public final C25431Oe A0M;

    public final void A00() {
        ((Handler) this.A0I.getValue()).removeCallbacks(this.A06);
        C81833zs r6 = this.A03;
        Set set = this.A04;
        this.A03 = null;
        this.A04 = null;
        long j = 0L;
        if (r6 != null) {
            if (set != null) {
                Iterator it = set.iterator();
                long j2 = 0;
                long j3 = 0;
                while (it.hasNext()) {
                    AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                    C26241Rj r8 = this.A0H;
                    if (r8.A07(A0Q) != 0) {
                        j2++;
                    } else if (r8.A05(A0Q) == 2) {
                        j3++;
                    }
                }
                r6.A05 = Long.valueOf(j2);
                if (C18020vd.A05(C18040vf.A02, this.A0D, 11746)) {
                    Long l = r6.A06;
                    if (l != null) {
                        j = Long.valueOf(l.longValue() - j3);
                    }
                    r6.A04 = j;
                }
            } else {
                r6.A06 = 1L;
                int A052 = this.A0H.A05(this.A0F);
                if (A052 == 0) {
                    r6.A04 = 1L;
                } else if (A052 != 1) {
                    r6.A04 = 0L;
                } else {
                    r6.A04 = 1L;
                    r6.A05 = 1L;
                }
                r6.A05 = 0L;
            }
            if (C18020vd.A05(C18040vf.A02, this.A0D, 11746)) {
                r6.A0A = Long.valueOf(SystemClock.elapsedRealtime() - this.A02);
            }
            Log.i("GroupPresenceHelper/GroupChatClosed");
            this.A0J.CC7(r6);
        }
        this.A02 = 0;
    }

    public final void A01() {
        C199410f A072;
        C95684md r0 = this.A0E;
        GroupJid groupJid = this.A0F;
        if (!r0.A01(groupJid) && !this.A0B.A0R(groupJid)) {
            C63872tp A0A2 = this.A0C.A08.A04.A0A(groupJid);
            if (!(A0A2 == null || (A072 = A0A2.A07()) == null)) {
                C18030ve r1 = this.A0D;
                if (!AnonymousClass4W4.A01(r1, A072.size())) {
                    if (AnonymousClass4W4.A00(r1, A072.size())) {
                        C81833zs r12 = new C81833zs();
                        r12.A01 = C17880vN.A0n(A072.size());
                        r12.A00 = C17880vN.A0i();
                        r12.A0C = AnonymousClass3Ma.A14(this.A0K, groupJid);
                        r12.A0D = this.A0M.A03();
                        this.A0L.A00(r12, (Set) null);
                        this.A06.run();
                        return;
                    }
                    return;
                }
            }
            ((Handler) this.A0I.getValue()).removeCallbacks(this.A06);
            C26241Rj r10 = this.A0H;
            C85994Pt r9 = this.A0L;
            if (C26241Rj.A03(groupJid)) {
                AnonymousClass10I r13 = r10.A09;
                C18030ve r6 = r10.A05;
                AnonymousClass11S r3 = r10.A01;
                AnonymousClass1CJ r4 = r10.A03;
                C25431Oe r11 = r10.A08;
                r13.CGM(new AnonymousClass49V(r3, r4, (AnonymousClass1MZ) r10.A0B.get(), r6, r10.A06, groupJid, r9, r10, r11), new Void[0]);
            }
        }
    }

    public AnonymousClass4SY(C35751mk r3, AnonymousClass4LE r4, AnonymousClass11P r5, AnonymousClass1CJ r6, AnonymousClass1MZ r7, C18030ve r8, AnonymousClass18K r9, C25241Nl r10, C95684md r11, GroupJid groupJid, C26241Rj r13, C25431Oe r14) {
        C18070vi.A0w(r5, r8, r6, r9, r13);
        C18070vi.A0x(r11, r14, r3, r10, r7);
        C18070vi.A0d(groupJid, 11);
        this.A0A = r5;
        this.A0D = r8;
        this.A0B = r6;
        this.A0J = r9;
        this.A0H = r13;
        this.A0E = r11;
        this.A0M = r14;
        this.A08 = r3;
        this.A0K = r10;
        this.A0C = r7;
        this.A0F = groupJid;
        this.A09 = r4;
    }
}
