package X;

import android.app.Activity;
import com.whatsapp.util.Log;

/* renamed from: X.1pJ  reason: invalid class name and case insensitive filesystem */
public final class C37311pJ implements AnonymousClass12D {
    public final int A00;
    public final AnonymousClass1KB A01;
    public final C26811To A02;
    public final C33821jR A03;
    public final AnonymousClass11C A04;
    public final AnonymousClass11P A05;
    public final C219217x A06;
    public final C19830z4 A07;
    public final C18030ve A08;
    public final C37291pH A09;
    public final C33501iv A0A;
    public final C37301pI A0B;
    public final C18100vl A0C = new C18110vm(new C37321pK(this));
    public final C18600wl A0D;
    public final AnonymousClass1OX A0E;
    public final AnonymousClass11S A0F;
    public final AnonymousClass12E A0G;
    public final AnonymousClass10I A0H;

    public C37311pJ(AnonymousClass1KB r18, AnonymousClass11S r19, C26811To r20, AnonymousClass12E r21, C33821jR r22, AnonymousClass11C r23, AnonymousClass11P r24, C219217x r25, C19830z4 r26, C18030ve r27, C37291pH r28, C33501iv r29, C37301pI r30, AnonymousClass10I r31, C18600wl r32, AnonymousClass1OX r33) {
        C37291pH r6 = r28;
        C18070vi.A0d(r6, 1);
        C33501iv r0 = r29;
        C18070vi.A0d(r0, 2);
        AnonymousClass11P r15 = r24;
        C18070vi.A0d(r15, 3);
        AnonymousClass1KB r16 = r18;
        C18070vi.A0d(r16, 4);
        C18030ve r7 = r27;
        C18070vi.A0d(r7, 5);
        C19830z4 r8 = r26;
        C18070vi.A0d(r8, 6);
        C33821jR r11 = r22;
        C18070vi.A0d(r11, 7);
        AnonymousClass12E r12 = r21;
        C18070vi.A0d(r12, 8);
        AnonymousClass10I r4 = r31;
        C18070vi.A0d(r4, 9);
        AnonymousClass11C r10 = r23;
        C18070vi.A0d(r10, 10);
        C26811To r13 = r20;
        C18070vi.A0d(r13, 11);
        C219217x r9 = r25;
        C18070vi.A0d(r9, 12);
        C18600wl r3 = r32;
        C18070vi.A0d(r3, 13);
        AnonymousClass1OX r2 = r33;
        C18070vi.A0d(r2, 14);
        C37301pI r5 = r30;
        C18070vi.A0d(r5, 15);
        AnonymousClass11S r14 = r19;
        C18070vi.A0d(r14, 16);
        this.A09 = r6;
        this.A0A = r0;
        this.A05 = r15;
        this.A01 = r16;
        this.A08 = r7;
        this.A07 = r8;
        this.A03 = r11;
        this.A0G = r12;
        this.A0H = r4;
        this.A04 = r10;
        this.A02 = r13;
        this.A06 = r9;
        this.A0D = r3;
        this.A0E = r2;
        this.A0B = r5;
        this.A0F = r14;
        this.A00 = C18020vd.A00(C18040vf.A02, r7, 11103);
    }

    public final void A01(Activity activity, C72093Kp r10, int i) {
        String str;
        Activity activity2 = activity;
        C18070vi.A0d(activity, 0);
        C72093Kp r4 = r10;
        if (!C18020vd.A05(C18040vf.A02, this.A08, 5868)) {
            str = "NativeContactsLauncher: native contacts is not enabled, stop";
        } else if (this.A0F.A0N()) {
            str = "NativeContactsLauncher: native contacts is not enabled for companion mode, stop";
        } else if (this.A07.A2K()) {
            this.A01.A0J(new C70563Bp(r10, 27));
            return;
        } else {
            this.A0H.CGO(new C21365Aiu(this, r4, activity2, i, 12), "Check if NUX has been shown or not");
            return;
        }
        Log.w(str);
        r10.CC1();
    }

    public void Bp4(C49642Rh r4) {
        C18070vi.A0d(r4, 0);
        if (!r4.equals(C46092Cw.A00) && (r4 instanceof AnonymousClass8nK)) {
            boolean A052 = C18020vd.A05(C18040vf.A02, this.A08, 12767);
            AnonymousClass12E r1 = this.A0G;
            if (A052) {
                r1.A0C(AnonymousClass00R.A0N);
            } else {
                r1.A0A();
            }
        }
    }

    public final void A00() {
        this.A0H.CGL(new C70563Bp(this, 24), "generate HSM key");
    }

    public final boolean A02() {
        if (!C18020vd.A05(C18040vf.A02, this.A08, 5868) || !this.A07.A2K()) {
            return false;
        }
        return true;
    }
}
