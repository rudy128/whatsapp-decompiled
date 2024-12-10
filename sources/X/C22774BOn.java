package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.os.Handler;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.BOn  reason: case insensitive filesystem */
public class C22774BOn extends C22775BOo implements C28572E8d {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03;
    public long A04;
    public long A05 = 0;
    public AudioManager A06;
    public MediaFormat A07;
    public D48 A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Context A0D;
    public final C25047CVb A0E;
    public final DefaultAudioSink A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22774BOn(android.content.Context r14, android.os.Handler r15, X.C25744ClE r16, X.EBU r17, X.CPn r18, X.C25626Cj6 r19, X.D9R r20, X.C28627EBa[] r21, boolean r22, boolean r23) {
        /*
            r13 = this;
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r2 = new com.facebook.android.exoplayer2.audio.DefaultAudioSink
            r0 = r21
            r2.<init>(r0)
            r9 = 0
            r8 = 1
            r3 = r13
            r12 = r9
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r10 = r9
            r11 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A01 = r9
            r13.A02 = r9
            r0 = 0
            r13.A05 = r0
            android.content.Context r0 = r14.getApplicationContext()
            r13.A0D = r0
            r13.A0F = r2
            r0 = r22
            r13.A0G = r0
            r0 = r23
            r13.A0H = r0
            X.CVb r0 = new X.CVb
            r1 = r20
            r0.<init>(r15, r1)
            r13.A0E = r0
            X.D8n r0 = new X.D8n
            r0.<init>(r13)
            r2.A0E = r0
            boolean r0 = r7.A0A
            r2.A0L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22774BOn.<init>(android.content.Context, android.os.Handler, X.ClE, X.EBU, X.CPn, X.Cj6, X.D9R, X.EBa[], boolean, boolean):void");
    }

    public static int A00(D48 d48, C22774BOn bOn, C26125Csn csn) {
        PackageManager packageManager;
        int i = Util.A00;
        if (i >= 24 || !"OMX.google.raw.decoder".equals(csn.A02) || (i == 23 && (packageManager = bOn.A0D.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) {
            return d48.A0A;
        }
        return -1;
    }

    public static void A01(C22774BOn bOn) {
        long A0A2 = bOn.A0F.A0A(bOn.Bed());
        if (A0A2 != Long.MIN_VALUE) {
            if (!bOn.A0A) {
                A0A2 = Math.max(bOn.A04, A0A2);
            }
            bOn.A04 = A0A2;
            bOn.A0A = false;
        }
    }

    public void A0H() {
        try {
            this.A0F.A0B();
            super.A0H();
            synchronized (this.A09) {
            }
            this.A0E.A00(this.A09);
        } catch (Throwable th) {
            synchronized (this.A09) {
                this.A0E.A00(this.A09);
                throw th;
            }
        }
    }

    public boolean A0T(int i, String str) {
        if ("audio/eac3-joc".equals(str)) {
            if (this.A0F.A0G(-1, 18)) {
                return true;
            }
            str = "audio/eac3";
        }
        int A002 = C26233CvQ.A00(str);
        if (!this.A0F.A0G(i, A002) || A002 == 0) {
            return false;
        }
        return true;
    }

    public C25732Cl2 BXC() {
        return DefaultAudioSink.A03(this.A0F).A02;
    }

    public long BXM() {
        if (this.A01 == 2) {
            A01(this);
        }
        return this.A04;
    }

    public boolean Bg8() {
        if (this.A0F.A0F() || super.Bg8()) {
            return true;
        }
        return false;
    }

    public C25732Cl2 CK1(C25732Cl2 cl2) {
        this.A0F.A0E(cl2);
        return cl2;
    }

    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    public void A0I(long j, boolean z) {
        super.A0I(j, z);
        this.A0F.A0B();
        this.A04 = j;
        this.A09 = true;
        this.A0A = true;
    }

    public void A0J(boolean z, boolean z2) {
        super.A0J(z, z2);
        C25047CVb cVb = this.A0E;
        CU1 cu1 = this.A09;
        Handler handler = cVb.A00;
        if (handler != null) {
            BE7.A19(handler, cVb, cu1, 38);
        }
        C25715Ckl ckl = this.A04;
        C26056CrS.A01(ckl);
        if (ckl.A00 != 0) {
            throw BE6.A0k();
        }
    }

    public void A0R(D48 d48) {
        super.A0R(d48);
        this.A08 = d48;
        C25047CVb cVb = this.A0E;
        Handler handler = cVb.A00;
        if (handler != null) {
            BE7.A19(handler, cVb, d48, 37);
        }
    }
}
