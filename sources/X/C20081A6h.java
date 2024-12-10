package X;

import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.A6h  reason: case insensitive filesystem */
public abstract class C20081A6h {
    public final int A00;
    public final AnonymousClass11P A01;
    public final C18030ve A02;
    public final C189399jB A03;
    public final AnonymousClass19T A04;
    public final C18100vl A05;
    public final C196109uT A06;
    public final C19830z4 A07;

    public C20081A6h(AnonymousClass11P r9, AnonymousClass118 r10, C196109uT r11, C19830z4 r12, C18030ve r13, AnonymousClass18K r14, C189399jB r15, AnonymousClass19V r16, AnonymousClass19Y r17, AnonymousClass19T r18, AnonymousClass198 r19, AnonymousClass10I r20, int i) {
        this.A00 = i;
        this.A01 = r9;
        this.A07 = r12;
        this.A04 = r18;
        this.A03 = r15;
        this.A02 = r13;
        this.A06 = r11;
        this.A05 = AnonymousClass1DF.A01(new C22044Awk(r10, r14, this, r16, r17, r19, r20));
    }

    public final void A05(int i, String str, long j) {
        String str2 = str;
        C18070vi.A0d(str, 1);
        if (C18020vd.A05(C18040vf.A02, this.A02, 4360)) {
            ((C222119a) this.A05.getValue()).A09(str2, i, j, true);
        }
    }

    public final void A07(int i, String str, boolean z) {
        C18070vi.A0d(str, 1);
        if (C18020vd.A05(C18040vf.A02, this.A02, 4360)) {
            C222119a r0 = (C222119a) this.A05.getValue();
            r0.A07.markerAnnotate(r0.A05.A06, i, str, z);
        }
    }

    public final void A0B(Integer num, String str) {
        C18070vi.A0d(str, 1);
        if (C18020vd.A05(C18040vf.A02, this.A02, 4360) && num != null) {
            ((C222119a) this.A05.getValue()).A03(num.intValue(), str);
        }
    }

    public final void A0D(List list, int i, String str) {
        C18070vi.A0d(list, 2);
        if (C18020vd.A05(C18040vf.A02, this.A02, 4360)) {
            C222119a r0 = (C222119a) this.A05.getValue();
            r0.A07.markerAnnotate(r0.A05.A06, i, str, C108955ca.A1b(list));
        }
    }

    public final void A04(int i, String str) {
        C18030ve r2 = this.A02;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 4360)) {
            return;
        }
        if (!C18020vd.A05(r1, r2, 5333) || !AnonymousClass8BS.A1N(r2)) {
            ((C222119a) this.A05.getValue()).A0E(str, true, i);
            A05(i, "timestamp_ms", AnonymousClass11P.A01(this.A01));
            A07(i, "is_debug_build", false);
            String A0h = this.A07.A0h();
            C18070vi.A0X(A0h);
            A07(i, "is_graphql_prod", C108975cc.A0d(A0h).equals("whatsapp.com"));
        }
    }

    public final void A08(int i, short s) {
        if (C18020vd.A05(C18040vf.A02, this.A02, 4360)) {
            ((C222119a) this.A05.getValue()).A04(i, s);
        }
    }

    public final void A09(Jid jid, String str, String str2, String str3, int i) {
        if (C18020vd.A05(C18040vf.A02, this.A02, 4360)) {
            if (!(str == null || str.length() == 0)) {
                A06(i, "extension_message_id", A4O.A00.A01(this.A06, str, true));
            }
            if (!(str2 == null || str2.length() == 0)) {
                String A1H = AnonymousClass001.A1H("wae", str2, AnonymousClass000.A10());
                C18070vi.A0d(A1H, 0);
                String A0Y = AnonymousClass8BY.A0Y(A1H);
                C18070vi.A0X(A0Y);
                A06(i, "session_id", A0Y);
            }
            if (jid != null) {
                A06(i, "biz_jid", this.A03.A00(jid));
            }
            if (str3 != null && str3.length() != 0) {
                A06(i, "extension_id", str3);
            }
        }
    }

    public final void A0A(Integer num) {
        if (num != null) {
            this.A04.markerDrop(this.A00, num.intValue());
        }
    }

    public final void A0C(String str, int i) {
        if (str == null) {
            str = "UNKNOWN";
        }
        A06(i, "extension_status", str);
    }

    public static void A01(C20081A6h a6h, int i) {
        a6h.A0A(Integer.valueOf(i));
    }

    public static void A02(C20081A6h a6h, String str, int i) {
        a6h.A0B(Integer.valueOf(i), str);
    }

    public static void A03(AnonymousClass00H r1, Short sh, int i) {
        ((C172048sh) r1.get()).A0G(Integer.valueOf(i), sh);
    }

    public final void A06(int i, String str, String str2) {
        C18070vi.A0j(str, str2);
        if (C18020vd.A05(C18040vf.A02, this.A02, 4360)) {
            C222119a r0 = (C222119a) this.A05.getValue();
            r0.A07.markerAnnotate(r0.A05.A06, i, str, str2);
        }
    }
}
