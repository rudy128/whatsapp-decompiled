package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;

@Deprecated
/* renamed from: X.1aq  reason: invalid class name and case insensitive filesystem */
public class C28751aq implements C28741ap {
    public C18030ve A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public final AnonymousClass1KB A03;
    public final C25161Nd A04;
    public final AnonymousClass1NN A05;
    public final C24751Ln A06;
    public final AnonymousClass1RL A07;
    public final AnonymousClass1N5 A08;
    public final AnonymousClass1N9 A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final C18140vp A0D;
    public final C28721an A0E;
    public final AnonymousClass1M9 A0F;
    public final C28731ao A0G;
    public final AnonymousClass1CJ A0H;
    public final AnonymousClass10I A0I;
    public final AnonymousClass00H A0J;

    public /* synthetic */ void BoF(AnonymousClass1BI r1, Integer num) {
    }

    public /* synthetic */ void BoJ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoK() {
    }

    public /* synthetic */ void BoO(AnonymousClass1BI r1, C32961i2 r2) {
    }

    public /* synthetic */ void BoP(AnonymousClass1BI r1, AnonymousClass201 r2) {
    }

    public void BoQ(AnonymousClass1BI r9, Collection collection, int i, boolean z) {
        this.A0E.A01();
        this.A05.A02(r9);
        this.A0I.CGF(new C70843Cs((Object) this, (Object) collection, (Object) r9, i, 4, z));
    }

    public /* synthetic */ void BoS(AnonymousClass1BI r1, Collection collection) {
    }

    public /* synthetic */ void BoX(AnonymousClass1BI r1, Integer num) {
    }

    public /* synthetic */ void BoY(AnonymousClass1BI r1, C32961i2 r2) {
    }

    public void BoZ(AnonymousClass1BI r2) {
        BoG(r2, false);
    }

    public void BoD(AnonymousClass1BI r6) {
        AnonymousClass1CJ r1 = this.A0H;
        if (r1.A0P(r6)) {
            this.A04.A0H(r6, r1.A08(r6));
            this.A05.A00();
            C22941Dw r0 = UserJid.Companion;
            UserJid A012 = C22941Dw.A01(r6);
            if (A012 != null) {
                this.A0G.notifyAllObservers(new AnonymousClass35V(this.A0F.A0H(A012), 17));
                if (A012 instanceof AnonymousClass1E2) {
                    this.A0I.CGF(new C146497Pi(this, A012, 23));
                }
            }
        }
    }

    public void BoE(AnonymousClass1BI r2) {
        this.A05.A00();
        this.A0E.A01();
    }

    public void BoG(AnonymousClass1BI r4, boolean z) {
        AnonymousClass1NN r2;
        AnonymousClass1CJ r1 = this.A0H;
        boolean A0P = r1.A0P(r4);
        C25161Nd r22 = this.A04;
        if (A0P) {
            if (!r22.A0H(r4, r1.A08(r4))) {
                r2 = this.A05;
                r2.A02(r4);
            }
            r2 = this.A05;
            r2.A00();
        } else {
            r22.A0F(r4);
            this.A0E.A01();
            r2 = this.A05;
            r2.A00();
        }
        if (z) {
            C17960vV.A07(r4);
            r2.notifyAllObservers(new AnonymousClass35V(r4, 29));
        }
    }

    public void BoR(AnonymousClass1BI r4) {
        this.A04.A0F(r4);
        AnonymousClass1NN r2 = this.A05;
        r2.A00();
        C17960vV.A07(r4);
        r2.notifyAllObservers(new AnonymousClass35V(r4, 29));
    }

    public void BoW(AnonymousClass1BI r2) {
        this.A05.A00();
        this.A0E.A01();
    }

    public C28751aq(AnonymousClass1KB r2, C28721an r3, AnonymousClass1M9 r4, C28731ao r5, C25161Nd r6, AnonymousClass1CJ r7, AnonymousClass1NN r8, C24751Ln r9, AnonymousClass1RL r10, C18030ve r11, AnonymousClass1N5 r12, AnonymousClass1N9 r13, AnonymousClass10I r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19, C18140vp r20) {
        Boolean bool = C17960vV.A01;
        this.A03 = r2;
        this.A0I = r14;
        this.A0H = r7;
        this.A09 = r13;
        this.A0E = r3;
        this.A0F = r4;
        this.A0C = r15;
        this.A06 = r9;
        this.A08 = r12;
        this.A01 = r18;
        this.A0J = r17;
        this.A0G = r5;
        this.A0D = r20;
        this.A04 = r6;
        this.A05 = r8;
        this.A07 = r10;
        this.A0A = r16;
        this.A0B = r19;
        this.A00 = r11;
    }
}
