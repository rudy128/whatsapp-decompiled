package X;

import com.whatsapp.ml.v2.scheduler.MLProcessScheduler$schedule$1;
import com.whatsapp.ml.v2.scheduler.SequentialTaskRunner$start$1$1;

/* renamed from: X.ClJ  reason: case insensitive filesystem */
public final class C25749ClJ {
    public C24489C6h A00;
    public final AnonymousClass4XD A01 = new AnonymousClass4XD(AnonymousClass00R.A00, new C27755Dkb(this));
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final C18100vl A0B = AnonymousClass1DF.A01(new C27756Dkc(this));
    public final C18100vl A0C = AnonymousClass1DF.A01(new C27757Dkd(this));
    public final C18600wl A0D;
    public final AnonymousClass1OX A0E;

    public static final void A00(C25749ClJ clJ, C24489C6h c6h) {
        synchronized (clJ) {
            clJ.A00 = c6h;
        }
    }

    public final void A01() {
        C24964CRo cRo = (C24964CRo) this.A0C.getValue();
        synchronized (cRo) {
            AnonymousClass1OB r0 = cRo.A00;
            if (r0 == null || !r0.Be2()) {
                cRo.A00 = AnonymousClass3MY.A0s(new SequentialTaskRunner$start$1$1(cRo, (C30391dr) null), cRo.A02);
            }
        }
    }

    public final void A02(C24489C6h c6h) {
        AnonymousClass3MW.A1X(this.A0D, new MLProcessScheduler$schedule$1(this, c6h, (C30391dr) null), this.A0E);
    }

    public C25749ClJ(AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, C18600wl r13, AnonymousClass1OX r14) {
        C18070vi.A0w(r4, r5, r6, r7, r8);
        C18070vi.A0x(r9, r14, r13, r10, r11);
        C18070vi.A0d(r12, 11);
        this.A0E = r14;
        this.A0D = r13;
        this.A03 = r4;
        this.A06 = r5;
        this.A07 = r6;
        this.A09 = r7;
        this.A08 = r8;
        this.A02 = r9;
        this.A04 = r10;
        this.A05 = r11;
        this.A0A = r12;
    }
}
