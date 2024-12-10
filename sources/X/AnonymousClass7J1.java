package X;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import java.util.List;

/* renamed from: X.7J1  reason: invalid class name */
public final class AnonymousClass7J1 implements B8E, AnonymousClass860 {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public long A04;
    public AnonymousClass1FU A05;
    public TextStatusComposerFragment A06;
    public C131706lX A07;
    public AnonymousClass72I A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final C18000vb A0E;
    public final C18030ve A0F;
    public final AnonymousClass8AQ A0G;
    public final AnonymousClass70C A0H;
    public final C32741hg A0I;
    public final AnonymousClass8AJ A0J;
    public final C18100vl A0K = AnonymousClass1DF.A01(new C154187qj(this));
    public final View A0L;
    public final AnonymousClass1DS A0M;
    public final C125036aO A0N;
    public final AnonymousClass11P A0O;
    public final AnonymousClass118 A0P;
    public final C24641Lc A0Q;
    public final boolean A0R;

    public AnonymousClass7J1(View view, AnonymousClass1DS r8, C125036aO r9, AnonymousClass1FU r10, AnonymousClass11P r11, AnonymousClass118 r12, C18000vb r13, C18030ve r14, AnonymousClass8AQ r15, AnonymousClass70C r16, C24641Lc r17, C32741hg r18, AnonymousClass8AJ r19, boolean z) {
        int i;
        C131706lX r0;
        AnonymousClass8AJ r1 = r19;
        C18070vi.A0d(r11, 1);
        C24641Lc r4 = r17;
        C18070vi.A0p(r14, r12, r4);
        C18070vi.A0d(r13, 5);
        C32741hg r3 = r18;
        AnonymousClass70C r5 = r16;
        C18070vi.A0q(r3, r9, r5);
        C108975cc.A10(r10, 9, r15);
        this.A0O = r11;
        this.A0F = r14;
        this.A0P = r12;
        this.A0Q = r4;
        this.A0E = r13;
        this.A0I = r3;
        this.A0N = r9;
        this.A0H = r5;
        this.A05 = r10;
        this.A0L = view;
        this.A0R = z;
        this.A0G = r15;
        this.A0J = r1;
        this.A0M = r8;
        List A0M2 = C18070vi.A0M(C29671cg.A00);
        this.A0A = A0M2;
        boolean A1a = AnonymousClass000.A1a(A0M2);
        C18070vi.A0d(this.A0F, 0);
        if (!A1a) {
            i = 2131231806;
        } else {
            i = 2131232506;
            if (z) {
                i = 2131231900;
            }
        }
        this.A03 = i;
        this.A09 = A00(AnonymousClass000.A1a(this.A0A));
        C36241nZ r32 = r9.A00.A01;
        AnonymousClass72I r02 = new AnonymousClass72I(view, r1);
        C36241nZ.A24(r32, r02);
        this.A08 = r02;
        if (C72453Mb.A1a(this.A0K)) {
            r0 = new C121226Iq(this);
        } else {
            r0 = new AnonymousClass6Im(this);
        }
        this.A07 = r0;
        ((CreationModeBottomBar) r1).A08 = this;
        r0.A00();
        AnonymousClass77K r110 = (AnonymousClass77K) r8.A06();
        if (r110 != null) {
            r15.CKJ(r110, this.A0A, true);
        }
    }

    private final String A00(boolean z) {
        if (!z) {
            return C18070vi.A0G(this.A0P, 2131898925);
        }
        boolean A052 = C18020vd.A05(C18040vf.A01, this.A0Q.A01, 7436);
        AnonymousClass118 r1 = this.A0P;
        int i = 2131899381;
        if (A052) {
            i = 2131899268;
        }
        String A012 = r1.A01(i);
        C18070vi.A0b(A012);
        return A012;
    }

    public static final void A01(AnonymousClass7J1 r2) {
        if (r2.A07.A00 == AnonymousClass00R.A01) {
            r2.A07 = new C121226Iq(r2);
            r2.A0B = false;
            AnonymousClass72I r1 = r2.A08;
            r1.A05(r2, false);
            r1.A04((ViewGroup) r2.A0J);
        }
    }

    public final void A02(Intent intent) {
        int i;
        this.A0A = C72463Mc.A0r(intent, AnonymousClass1BI.class);
        AnonymousClass77K r3 = (AnonymousClass77K) this.A0M.A06();
        if (r3 != null) {
            this.A0G.CKJ(r3, this.A0A, false);
        }
        boolean A1a = AnonymousClass000.A1a(this.A0A);
        boolean z = this.A0R;
        C18070vi.A0d(this.A0F, 0);
        if (!A1a) {
            i = 2131231806;
        } else {
            i = 2131232506;
            if (z) {
                i = 2131231900;
            }
        }
        this.A03 = i;
        this.A09 = A00(A1a);
        this.A07.A00();
    }

    public void C2i(boolean z) {
        TextStatusComposerFragment textStatusComposerFragment = this.A06;
        if (textStatusComposerFragment != null) {
            textStatusComposerFragment.C2i(z);
        }
    }
}
