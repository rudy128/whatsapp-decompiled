package X;

import android.os.Handler;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.2n7  reason: invalid class name and case insensitive filesystem */
public final class C59932n7 {
    public String A00;
    public boolean A01;
    public final Handler A02 = C17890vO.A0D();
    public final AnonymousClass190 A03;
    public final C19830z4 A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass11S A07;
    public final C23651Hc A08;
    public final C25111Mx A09;
    public final AnonymousClass118 A0A;
    public final C18030ve A0B;
    public final AnonymousClass1PX A0C;
    public final AnonymousClass10I A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;

    public final String A00() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        A01((C22548BCf) null);
        String string = C17890vO.A0B(this.A04).getString("my_current_status", (String) null);
        if (string == null) {
            return C18070vi.A0F(this.A0A.A00, 2131891345);
        }
        return string;
    }

    public final void A01(C22548BCf bCf) {
        AnonymousClass11S r1 = this.A07;
        if (AnonymousClass11S.A00(r1) != null && !this.A01) {
            C18030ve r6 = this.A0B;
            AnonymousClass118 r5 = this.A0A;
            AnonymousClass10I r12 = this.A0D;
            AnonymousClass1PY r7 = (AnonymousClass1PY) C18070vi.A0E(this.A0E);
            C25111Mx r4 = this.A09;
            AnonymousClass37N r11 = new AnonymousClass37N(this, bCf);
            C56072gr r2 = new C56072gr(this.A03, r4, r5, r6, r7, (C191019lt) C18070vi.A0E(this.A0F), this.A0C, (AnonymousClass1OZ) C18070vi.A0E(this.A05), r11, r12);
            PhoneUserJid A012 = AnonymousClass11S.A01(r1);
            C18070vi.A0X(A012);
            r2.A09.CGF(new AnonymousClass3C3(r2, A012, 16, 0));
            this.A01 = true;
        }
    }

    public final void A02(String str, String str2) {
        this.A00 = str;
        this.A01 = false;
        this.A04.A1r(str, str2);
        this.A02.post(new C27080DTf((Object) this, 43));
    }

    public C59932n7(AnonymousClass190 r2, AnonymousClass11S r3, C23651Hc r4, C25111Mx r5, AnonymousClass118 r6, C19830z4 r7, C18030ve r8, AnonymousClass1PX r9, AnonymousClass10I r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14) {
        C18070vi.A0w(r8, r6, r10, r2, r3);
        C18070vi.A0x(r11, r12, r4, r5, r7);
        C18070vi.A0r(r13, r9, r14);
        this.A0B = r8;
        this.A0A = r6;
        this.A0D = r10;
        this.A03 = r2;
        this.A07 = r3;
        this.A05 = r11;
        this.A0E = r12;
        this.A08 = r4;
        this.A09 = r5;
        this.A04 = r7;
        this.A0F = r13;
        this.A0C = r9;
        this.A06 = r14;
    }
}
