package X;

import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.8si  reason: invalid class name and case insensitive filesystem */
public final class C172058si extends C20081A6h {
    public final AnonymousClass00H A00;
    public final List A01 = AnonymousClass000.A13();
    public final List A02 = AnonymousClass000.A13();
    public final C196109uT A03;

    public final void A0E(int i, String str, String str2) {
        C18070vi.A0d(str, 1);
        A06(i, "error_type", str);
        if (str2 != null) {
            A06(i, "error_message", str2);
        }
    }

    public final void A0F(int i, short s) {
        A07(i, "bloks_cache_hit", true);
        A08(i, s);
    }

    public final void A0G(Jid jid, String str, String str2, String str3, String str4, String str5, boolean z) {
        C194419rh A012;
        Integer valueOf;
        String obj;
        String str6 = str;
        C18070vi.A0d(str, 0);
        int hashCode = str.hashCode();
        if (!((C222119a) this.A05.getValue()).A07.isMarkerOn(this.A00, hashCode)) {
            A04(hashCode, str4);
            A09(jid, str2, str3, str6, hashCode);
            C18030ve r3 = this.A02;
            C18040vf r2 = C18040vf.A02;
            if (!(!C18020vd.A05(r2, r3, 6551) || (A012 = ((C19958A0p) this.A00.get()).A01(str2)) == null || (valueOf = Integer.valueOf(A012.A00)) == null || (obj = valueOf.toString()) == null)) {
                A06(hashCode, "flow_entry_point", obj);
            }
            String str7 = str5;
            if (!(str5 == null || str7.length() == 0 || !C18020vd.A05(r2, r3, 7574))) {
                A06(hashCode, "rendering_stack", str7);
            }
            A07(hashCode, "is_response_flow", z);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C172058si(X.AnonymousClass11P r16, X.AnonymousClass118 r17, X.C196109uT r18, X.C19830z4 r19, X.C18030ve r20, X.AnonymousClass18K r21, X.C189399jB r22, X.AnonymousClass19V r23, X.AnonymousClass19Y r24, X.AnonymousClass19T r25, X.AnonymousClass198 r26, X.AnonymousClass10I r27, X.AnonymousClass00H r28) {
        /*
            r15 = this;
            r13 = r27
            r2 = r16
            r3 = r17
            r7 = r21
            r12 = r26
            X.C18070vi.A0w(r2, r3, r13, r7, r12)
            r5 = r19
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            X.C18070vi.A0x(r5, r11, r9, r10, r8)
            r0 = r28
            r4 = r18
            r6 = r20
            X.C18070vi.A0r(r6, r0, r4)
            r14 = 200750681(0xbf73659, float:9.522271E-32)
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A00 = r0
            r15.A03 = r4
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r15.A02 = r0
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r15.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172058si.<init>(X.11P, X.118, X.9uT, X.0z4, X.0ve, X.18K, X.9jB, X.19V, X.19Y, X.19T, X.198, X.10I, X.00H):void");
    }

    public final void A0H(boolean z, int i) {
        String str;
        if (z) {
            str = "encryption_1_end";
        } else {
            str = "encryption_end";
        }
        C20081A6h.A02(this, str, i);
    }

    public final void A0I(boolean z, int i) {
        String str;
        if (z) {
            str = "fetch_key_1_end";
        } else {
            str = "fetch_key_end";
        }
        C20081A6h.A02(this, str, i);
    }

    public static C172058si A00(AnonymousClass00H r1, int i, boolean z) {
        ((C172058si) r1.get()).A0I(z, i);
        ((C172058si) r1.get()).A0H(z, i);
        return (C172058si) r1.get();
    }
}
