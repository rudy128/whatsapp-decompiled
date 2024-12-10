package X;

import android.os.Handler;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import java.io.File;

/* renamed from: X.7Mv  reason: invalid class name and case insensitive filesystem */
public final class C145847Mv implements AnonymousClass862 {
    public C145827Mt A00;
    public C123326Tz A01;
    public AnonymousClass70T A02;
    public Runnable A03 = AnonymousClass7RC.A00(this, 9);
    public final Handler A04 = C17890vO.A0D();
    public final AnonymousClass1DS A05;
    public final AnonymousClass1DT A06;
    public final AnonymousClass1DT A07;
    public final AnonymousClass1DT A08;
    public final C22851Dl A09;
    public final C22851Dl A0A;
    public final AnonymousClass190 A0B;
    public final AnonymousClass1KB A0C;
    public final AnonymousClass118 A0D;
    public final C18030ve A0E;
    public final C32741hg A0F;
    public final C124206Xl A0G;
    public final AnonymousClass88G A0H;
    public final C136776uN A0I;
    public final AnonymousClass00H A0J;
    public final File A0K;

    public static final void A00(C145847Mv r3) {
        AnonymousClass70T r0 = r3.A02;
        if (r0 != null) {
            r0.A04();
        }
        AnonymousClass70T r02 = r3.A02;
        if (r02 != null) {
            r3.A07.A0F(Integer.valueOf(r02.A02()));
        }
        AnonymousClass70T r03 = r3.A02;
        if (r03 != null) {
            r03.A02();
            Number A1C = C108945cZ.A1C(r3.A07);
            if (A1C != null) {
                r3.A0H.setSeekbarContentDescription((long) A1C.intValue());
            }
        }
        r3.A08.A0F(new AnonymousClass6Iv(r3));
        r3.A0I.A00();
    }

    public static final void A01(C145847Mv r2) {
        AnonymousClass70T r0 = r2.A02;
        if (r0 != null) {
            r0.A09();
        }
        AnonymousClass70T r02 = r2.A02;
        if (r02 != null) {
            r02.A06();
        }
        r2.A02 = null;
        r2.A08.A0F(new AnonymousClass6Iu(r2));
        AnonymousClass3MX.A1J(r2.A07, 0);
        r2.A0I.A00();
    }

    public static final void A02(C145847Mv r3, int i, boolean z) {
        Number A1C;
        Number A1C2 = C108945cZ.A1C(r3.A06);
        if (A1C2 != null) {
            int intValue = A1C2.intValue();
            int A012 = C22339B3q.A01((((float) i) / 1000.0f) * ((float) intValue));
            int i2 = (intValue - 50) - 1;
            if (A012 > i2) {
                A012 = i2;
            }
            if (A012 < 0) {
                A012 = 0;
            }
            AnonymousClass1DT r0 = r3.A07;
            AnonymousClass3MX.A1J(r0, A012);
            if (z && (A1C = C108945cZ.A1C(r0)) != null) {
                r3.A0H.setSeekbarContentDescription((long) A1C.intValue());
            }
        }
    }

    public C145847Mv(AnonymousClass190 r7, AnonymousClass1KB r8, AnonymousClass118 r9, C18030ve r10, C32741hg r11, C124206Xl r12, AnonymousClass88G r13, C136776uN r14, AnonymousClass00H r15, File file) {
        C18070vi.A0s(r9, r10, r8, r7);
        C18070vi.A0q(r14, r11, r15);
        this.A0D = r9;
        this.A0E = r10;
        this.A0C = r8;
        this.A0B = r7;
        this.A0G = r12;
        this.A0I = r14;
        this.A0F = r11;
        this.A0J = r15;
        this.A0H = r13;
        File file2 = file;
        this.A0K = file2;
        AnonymousClass1DT A0M = AnonymousClass3MW.A0M(AnonymousClass3MY.A0f());
        this.A07 = A0M;
        AnonymousClass1DT A0D2 = C108965cb.A0D((int) C26511Sk.A05(file2));
        this.A06 = A0D2;
        AnonymousClass1DT A0M2 = AnonymousClass3MW.A0M(new AnonymousClass6Iu(this));
        this.A08 = A0M2;
        AnonymousClass7AP r3 = new AnonymousClass7AP(this, 21);
        this.A09 = r3;
        C22801Dg A012 = C25357CeG.A01(A0M, A0D2, new AnonymousClass7N6(2), false);
        this.A05 = A012;
        AnonymousClass7AP r1 = new AnonymousClass7AP(this, 22);
        this.A0A = r1;
        ((VoiceRecordingView) r13).A0B = this;
        A0M2.A0C(r3);
        A012.A0C(r1);
    }
}
