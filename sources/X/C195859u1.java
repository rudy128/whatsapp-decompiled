package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9u1  reason: invalid class name and case insensitive filesystem */
public class C195859u1 {
    public final AnonymousClass190 A00;
    public final AnonymousClass1KB A01;
    public final C24751Ln A02;
    public final C18030ve A03;
    public final AXS A04;
    public final AnonymousClass1QL A05;
    public final AnonymousClass1QS A06;
    public final AZ6 A07;
    public final AnonymousClass90Z A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass11S A0B;
    public final AnonymousClass1KI A0C;
    public final C196199uc A0D;
    public final A7U A0E;
    public final C31061ex A0F;
    public final C30931ek A0G;
    public final AnonymousClass10I A0H;

    public void A01(Context context, UserJid userJid, C196259ui r12, BCC bcc, Boolean bool) {
        this.A0H.CGF(new C21472Akd(this, context, userJid, bool, r12, bcc, 15));
    }

    public void A02(Context context, C196259ui r9, BCC bcc) {
        A01(context, AnonymousClass11S.A00(this.A0B), r9, new AYA(bcc, this, 0), (Boolean) null);
    }

    public void A00(Context context, UserJid userJid, AnonymousClass8pF r22, BCC bcc) {
        AnonymousClass1KB r10 = this.A01;
        AnonymousClass1OZ A0U = C17880vN.A0U(this.A09);
        C30931ek r2 = this.A0G;
        Context context2 = context;
        C175788zH r8 = new C175788zH(context2, r10, this.A0C, A0U, this.A0D, this.A0E, AnonymousClass8BR.A0a(this.A0A), this.A0F, this.A08, r2);
        BCC bcc2 = bcc;
        try {
            r8.A01((C1418477e) null, AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, String.valueOf(C42771yi.A00().A0H(AnonymousClass17K.A05(C60432o1.A00(this.A02, userJid)), (String) null).nationalNumber_), "upiAlias"), new AXV(r22, bcc2));
        } catch (C24931Mf e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Error parsing the number");
            C17890vO.A19(A10, e.message);
            if (bcc != null) {
                bcc2.Bss(A7B.A00());
            }
        }
    }

    public C195859u1(AnonymousClass190 r2, AnonymousClass1KB r3, AnonymousClass11S r4, C24751Ln r5, AnonymousClass1KI r6, C18030ve r7, C196199uc r8, A7U a7u, AXS axs, AnonymousClass1QL r11, C31061ex r12, AnonymousClass1QS r13, AZ6 az6, AnonymousClass90Z r15, C30931ek r16, AnonymousClass10I r17, AnonymousClass00H r18, AnonymousClass00H r19) {
        this.A03 = r7;
        this.A01 = r3;
        this.A0B = r4;
        this.A0H = r17;
        this.A00 = r2;
        this.A09 = r18;
        this.A06 = r13;
        this.A0G = r16;
        this.A02 = r5;
        this.A05 = r11;
        this.A0E = a7u;
        this.A0F = r12;
        this.A0C = r6;
        this.A0D = r8;
        this.A07 = az6;
        this.A0A = r19;
        this.A04 = axs;
        this.A08 = r15;
    }
}
