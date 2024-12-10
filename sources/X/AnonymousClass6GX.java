package X;

import android.media.AudioManager;
import android.os.Handler;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6GX  reason: invalid class name */
public final class AnonymousClass6GX extends AnonymousClass70O implements AnonymousClass89N {
    public float A00;
    public C109645dm A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C441822l A08;
    public final C110475fj A09;
    public final C1409373q A0A;
    public final AnonymousClass7MH A0B;
    public final C125276ao A0C;
    public final C136776uN A0D;

    public void A0F() {
        C62572rc r0;
        File file;
        this.A06 = false;
        this.A05 = false;
        this.A00 = 0.0f;
        this.A03 = false;
        C1409373q r1 = this.A0A;
        List list = r1.A02;
        if (list == null) {
            list = AnonymousClass000.A13();
            r1.A02 = list;
        }
        list.add(this);
        if (!(this.A01 != null || (r0 = this.A08.A02) == null || (file = r0.A0G) == null)) {
            AnonymousClass10E r2 = this.A0C.A00.A00;
            AnonymousClass118 A0l = AnonymousClass3MZ.A0l(r2);
            C18030ve A8r = AnonymousClass10E.A8r(r2);
            AnonymousClass190 A0N = AnonymousClass3MY.A0N(r2);
            AnonymousClass11P A6O = AnonymousClass10E.A6O(r2);
            new Object();
            C109645dm r3 = new C109645dm(A0N, A6O, A0l, A8r, this, C000200d.A00(r2.A00.A2V), file);
            this.A01 = r3;
            if (r3.A02 == null) {
                r3.start();
                Handler handler = new Handler(r3.getLooper());
                AnonymousClass7RH.A00(handler, r3, 32);
                AnonymousClass7RH.A00(handler, r3, 33);
                r3.A02 = handler;
            }
        }
        if (!this.A02 && this.A05.A00.A07) {
            this.A02 = true;
            r1.A07(this);
        }
        C136776uN r32 = this.A0D;
        AudioManager A0D2 = r32.A02.A0D();
        if (A0D2 != null && A0D2.getStreamVolume(3) == 0) {
            r32.A03(2131897160);
        }
    }

    public void Blq(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.widget.FrameLayout, android.view.View, X.5fj, android.view.ViewGroup] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6GX(X.AnonymousClass1L8 r14, X.C125276ao r15, X.AnonymousClass1KB r16, X.C37451pZ r17, X.AnonymousClass11C r18, X.C18000vb r19, X.AnonymousClass168 r20, X.AnonymousClass206 r21, X.C133426oj r22, X.C1409373q r23, X.C136776uN r24) {
        /*
            r13 = this;
            r3 = r21
            r0 = 4
            r11 = r20
            r1 = r23
            X.C108965cb.A1P(r11, r0, r1)
            r6 = r13
            r7 = r14
            r8 = r16
            r9 = r18
            r10 = r19
            r12 = r22
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.A0A = r1
            r13.A0C = r15
            r0 = r24
            r13.A0D = r0
            X.C17960vV.A07(r3)
            X.22l r3 = (X.C441822l) r3
            r13.A08 = r3
            android.content.Context r5 = X.AnonymousClass70K.A0B(r13)
            r1 = 1
            X.C18070vi.A0d(r3, r1)
            X.5fj r4 = new X.5fj
            r4.<init>(r5)
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0047
            r4.A04 = r1
            java.lang.Object r0 = r4.generatedComponent()
            X.10E r0 = X.AnonymousClass3MW.A0O(r0)
            X.0ve r0 = X.AnonymousClass10E.A8r(r0)
            r4.A00 = r0
        L_0x0047:
            X.0ve r2 = r4.getAbProps()
            r1 = 3229(0xc9d, float:4.525E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r2 = 0
            if (r0 == 0) goto L_0x0072
            r0 = 2131627051(0x7f0e0c2b, float:1.8881356E38)
            android.view.View.inflate(r5, r0, r4)
            r1 = r2
        L_0x005d:
            r4.A01 = r1
            r0 = 2131432692(0x7f0b14f4, float:1.8487149E38)
            android.view.View r1 = X.C18070vi.A05(r4, r0)
            com.whatsapp.status.playback.widget.VoiceStatusContentView r1 = (com.whatsapp.status.playback.widget.VoiceStatusContentView) r1
            r4.A02 = r1
            if (r1 != 0) goto L_0x0087
            java.lang.String r0 = "voiceStatusContentView"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0072:
            r0 = 2131627050(0x7f0e0c2a, float:1.8881353E38)
            android.view.View.inflate(r5, r0, r4)
            r0 = 2131428262(0x7f0b03a6, float:1.8478164E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r4, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.status.playback.content.BlurFrameLayout"
            X.C18070vi.A0z(r1, r0)
            com.whatsapp.status.playback.content.BlurFrameLayout r1 = (com.whatsapp.status.playback.content.BlurFrameLayout) r1
            goto L_0x005d
        L_0x0087:
            X.7MG r0 = new X.7MG
            r0.<init>(r4)
            r1.A03 = r0
            r0 = r17
            r4.setMessage(r3, r0)
            r13.A09 = r4
            X.882 r1 = r4.getWavesView()
            X.7MH r0 = new X.7MH
            r0.<init>(r3, r1)
            r13.A0B = r0
            r0 = 2131435671(0x7f0b2097, float:1.849319E38)
            r4.setId(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6GX.<init>(X.1L8, X.6ao, X.1KB, X.1pZ, X.11C, X.0vb, X.168, X.206, X.6oj, X.73q, X.6uN):void");
    }

    public static final void A00(AnonymousClass6GX r3, boolean z) {
        C109645dm r2;
        C109645dm r22;
        Handler handler;
        int i;
        Handler handler2;
        if (r3.A03 && (r2 = r3.A01) != null) {
            if (z) {
                r3.A0D.A03(2131897160);
                r22 = r3.A01;
                if (!(r22 == null || (handler = r22.A02) == null)) {
                    i = 35;
                }
            } else {
                if (r3.A07 && (handler2 = r2.A02) != null) {
                    AnonymousClass7RH.A00(handler2, r2, 30);
                }
                r22 = r3.A01;
                if (!(r22 == null || (handler = r22.A02) == null)) {
                    i = 34;
                }
            }
            AnonymousClass7RH.A00(handler, r22, i);
        }
        r3.A07 = z;
    }

    public long A0A() {
        return TimeUnit.SECONDS.toMillis((long) this.A08.A0D);
    }

    public void A0E() {
        Handler handler;
        C109645dm r2 = this.A01;
        if (!(r2 == null || (handler = r2.A02) == null)) {
            AnonymousClass7RH.A00(handler, r2, 29);
        }
        this.A0A.A06(this);
        this.A02 = false;
    }

    public void A0G() {
        Handler handler;
        C109645dm r2 = this.A01;
        if (!(r2 == null || (handler = r2.A02) == null)) {
            AnonymousClass7RH.A00(handler, r2, 28);
        }
        this.A01 = null;
        C1409373q r1 = this.A0A;
        r1.A06(this);
        this.A02 = false;
        List list = r1.A02;
        if (list != null) {
            list.remove(this);
        }
        this.A06 = true;
    }

    public void Blo(boolean z) {
        A00(this, z);
    }
}
