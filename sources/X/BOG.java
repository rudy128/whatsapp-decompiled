package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;
import com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.facebook.android.exoplayer2.ext.opus.OpusDecoder;
import com.facebook.android.exoplayer2.ext.opus.OpusLibrary;
import com.facebook.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

public class BOG extends C26659D8i implements C28572E8d {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public CU1 A06;
    public C22765BOc A07;
    public C26667D8q A08;
    public SimpleOutputBuffer A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public D48 A0F;
    public boolean A0G;
    public final C24756CIt A0H;
    public final C25047CVb A0I = new C25047CVb((Handler) null, (D9R) null);
    public final DefaultAudioSink A0J;
    public final C22765BOc A0K;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.CIt, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BOG() {
        super(1);
        DefaultAudioSink defaultAudioSink = new DefaultAudioSink(new C28627EBa[0]);
        this.A0J = defaultAudioSink;
        defaultAudioSink.A0E = new C26665D8o(this);
        this.A0H = new Object();
        this.A0K = new C22765BOc(0);
        this.A01 = 0;
        this.A0C = true;
    }

    private void A01() {
        this.A0G = true;
        try {
            this.A0J.A0C();
        } catch (C24402C1x e) {
            throw A0D(this.A0F, e, 5002);
        }
    }

    /* JADX INFO: finally extract failed */
    public void A0H() {
        this.A0F = null;
        this.A0C = true;
        try {
            A02();
            DefaultAudioSink defaultAudioSink = this.A0J;
            defaultAudioSink.A0B();
            for (C28627EBa reset : defaultAudioSink.A0g) {
                reset.reset();
            }
            for (C28627EBa reset2 : defaultAudioSink.A0f) {
                reset2.reset();
            }
            defaultAudioSink.A0N = false;
            synchronized (this.A06) {
            }
            this.A0I.A00(this.A06);
        } catch (Throwable th) {
            synchronized (this.A06) {
                this.A0I.A00(this.A06);
                throw th;
            }
        }
    }

    private void A00() {
        if (this.A08 == null) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C25304Cd8.A01("createAudioDecoder");
                D48 d48 = this.A0F;
                int i = d48.A0A;
                if (i == -1) {
                    i = 5760;
                }
                OpusDecoder opusDecoder = new OpusDecoder(d48.A0T, i);
                this.A00 = opusDecoder.A01;
                this.A04 = 48000;
                this.A08 = opusDecoder;
                C25304Cd8.A00();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                C25047CVb cVb = this.A0I;
                String name = this.A08.getName();
                long j = elapsedRealtime2 - elapsedRealtime;
                Handler handler = cVb.A00;
                if (handler != null) {
                    handler.post(new DT9(cVb, name, 0, j));
                }
                this.A06.A01++;
            } catch (C22763BOa e) {
                throw A0D(this.A0F, e, 5001);
            }
        }
    }

    private void A02() {
        C26667D8q d8q = this.A08;
        if (d8q != null) {
            this.A07 = null;
            this.A09 = null;
            d8q.release();
            this.A08 = null;
            this.A06.A02++;
            this.A01 = 0;
            this.A0D = false;
        }
    }

    private void A03(D48 d48) {
        D48 d482 = this.A0F;
        this.A0F = d48;
        DUU duu = d48.A0L;
        DUU duu2 = null;
        if (d482 != null) {
            duu2 = d482.A0L;
        }
        if (!Util.A0D(duu, duu2)) {
            D48 d483 = this.A0F;
            if (d483.A0L != null) {
                throw A0D(d483, new C24414C2n("Media requires a DrmSessionManager"), 5002);
            }
        }
        if (this.A0D) {
            this.A01 = 1;
        } else {
            A02();
            A00();
            this.A0C = true;
        }
        this.A02 = d48.A07;
        this.A03 = d48.A08;
        C25047CVb cVb = this.A0I;
        Handler handler = cVb.A00;
        if (handler != null) {
            BE7.A19(handler, cVb, d48, 37);
        }
    }

    public static void A04(BOG bog) {
        long A0A2 = bog.A0J.A0A(bog.Bed());
        if (A0A2 != Long.MIN_VALUE) {
            if (!bog.A0B) {
                A0A2 = Math.max(bog.A05, A0A2);
            }
            bog.A05 = A0A2;
            bog.A0B = false;
        }
    }

    public void A0I(long j, boolean z) {
        this.A0J.A0B();
        this.A05 = j;
        this.A0A = true;
        this.A0B = true;
        this.A0E = false;
        this.A0G = false;
        if (this.A08 == null) {
            return;
        }
        if (this.A01 != 0) {
            A02();
            A00();
            return;
        }
        this.A07 = null;
        SimpleOutputBuffer simpleOutputBuffer = this.A09;
        if (simpleOutputBuffer != null) {
            simpleOutputBuffer.release();
            this.A09 = null;
        }
        this.A08.flush();
        this.A0D = false;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.CU1, java.lang.Object] */
    public void A0J(boolean z, boolean z2) {
        ? obj = new Object();
        this.A06 = obj;
        C25047CVb cVb = this.A0I;
        Handler handler = cVb.A00;
        if (handler != null) {
            BE7.A19(handler, cVb, obj, 38);
        }
        C25715Ckl ckl = this.A04;
        C26056CrS.A01(ckl);
        if (ckl.A00 != 0) {
            throw BE6.A0k();
        }
    }

    public C25732Cl2 BXC() {
        return DefaultAudioSink.A03(this.A0J).A02;
    }

    public long BXM() {
        if (this.A01 == 2) {
            A04(this);
        }
        return this.A05;
    }

    public boolean Bed() {
        if (!this.A0G) {
            return false;
        }
        DefaultAudioSink defaultAudioSink = this.A0J;
        if (defaultAudioSink.A0B == null) {
            return true;
        }
        if (!defaultAudioSink.A0M || defaultAudioSink.A0F()) {
            return false;
        }
        return true;
    }

    public boolean Bg8() {
        boolean Bg8;
        if (this.A0J.A0F()) {
            return true;
        }
        if (this.A0F == null) {
            return false;
        }
        if (Bco()) {
            Bg8 = this.A08;
        } else {
            E90 e90 = this.A06;
            C26056CrS.A01(e90);
            Bg8 = e90.Bg8();
        }
        if (Bg8 || this.A09 != null) {
            return true;
        }
        return false;
    }

    public void CF7(long j, long j2) {
        if (this.A0G) {
            try {
                this.A0J.A0C();
            } catch (C24402C1x e) {
                throw A0D(this.A0F, e, 5002);
            }
        } else {
            if (this.A0F == null) {
                C22765BOc bOc = this.A0K;
                bOc.clear();
                C24756CIt cIt = this.A0H;
                int A0C2 = A0C(cIt, bOc, 2);
                if (A0C2 == -5) {
                    A03(cIt.A00);
                } else if (A0C2 == -4) {
                    C26056CrS.A03(AnonymousClass000.A1T(bOc.A00 & 4, 4));
                    this.A0E = true;
                    A01();
                    return;
                } else {
                    return;
                }
            }
            A00();
            if (this.A08 != null) {
                try {
                    C25304Cd8.A01("drainAndFeed");
                    while (true) {
                        SimpleOutputBuffer simpleOutputBuffer = this.A09;
                        if (simpleOutputBuffer == null) {
                            simpleOutputBuffer = (SimpleOutputBuffer) this.A08.A03();
                            this.A09 = simpleOutputBuffer;
                            if (simpleOutputBuffer == null) {
                                break;
                            }
                            this.A06.A09 += simpleOutputBuffer.A00;
                        }
                        if (!AnonymousClass000.A1T(simpleOutputBuffer.A00 & 4, 4)) {
                            if (this.A0C) {
                                int i = this.A00;
                                int i2 = this.A04;
                                E0X e0x = D48.CREATOR;
                                C25702CkX ckX = new C25702CkX();
                                ckX.A0P = null;
                                ckX.A0R = "audio/raw";
                                ckX.A0N = null;
                                ckX.A03 = -1;
                                ckX.A09 = -1;
                                ckX.A04 = i;
                                ckX.A0E = i2;
                                ckX.A0A = 2;
                                ckX.A0S = null;
                                ckX.A0K = null;
                                ckX.A0F = 0;
                                ckX.A0Q = null;
                                C25702CkX ckX2 = new C25702CkX(new D48(ckX));
                                ckX2.A06 = this.A02;
                                ckX2.A07 = this.A03;
                                this.A0J.A0D(new D48(ckX2), (int[]) null);
                                this.A0C = false;
                            }
                            DefaultAudioSink defaultAudioSink = this.A0J;
                            SimpleOutputBuffer simpleOutputBuffer2 = this.A09;
                            if (!defaultAudioSink.A0H(simpleOutputBuffer2.data, simpleOutputBuffer2.A01)) {
                                break;
                            }
                            this.A06.A07++;
                            this.A09.release();
                            this.A09 = null;
                        } else if (this.A01 == 2) {
                            A02();
                            A00();
                            this.A0C = true;
                        } else {
                            simpleOutputBuffer.release();
                            this.A09 = null;
                            A01();
                        }
                    }
                    while (true) {
                        C26667D8q d8q = this.A08;
                        if (d8q == null || this.A01 == 2 || this.A0E) {
                            break;
                        }
                        C22765BOc bOc2 = this.A07;
                        if (bOc2 == null) {
                            bOc2 = d8q.A02();
                            this.A07 = bOc2;
                            if (bOc2 == null) {
                                break;
                            }
                        }
                        if (this.A01 == 1) {
                            bOc2.A00 = 4;
                            this.A08.A04(bOc2);
                            this.A07 = null;
                            this.A01 = 2;
                            break;
                        }
                        C24756CIt cIt2 = this.A0H;
                        int A0C3 = A0C(cIt2, bOc2, 0);
                        if (A0C3 == -3) {
                            break;
                        } else if (A0C3 == -5) {
                            A03(cIt2.A00);
                        } else {
                            C22765BOc bOc3 = this.A07;
                            if (AnonymousClass000.A1T(bOc3.A00 & 4, 4)) {
                                this.A0E = true;
                                this.A08.A04(bOc3);
                                this.A07 = null;
                                break;
                            }
                            ByteBuffer byteBuffer = bOc3.A01;
                            if (byteBuffer != null) {
                                byteBuffer.flip();
                            }
                            C22765BOc bOc4 = this.A07;
                            if (this.A0A && !AnonymousClass000.A1T(bOc4.A00 & Integer.MIN_VALUE, Integer.MIN_VALUE)) {
                                long j3 = bOc4.A00;
                                if (Math.abs(j3 - this.A05) > 500000) {
                                    this.A05 = j3;
                                }
                                this.A0A = false;
                            }
                            this.A08.A04(bOc4);
                            this.A0D = true;
                            this.A06.A06++;
                            this.A07 = null;
                        }
                    }
                    C25304Cd8.A00();
                    synchronized (this.A06) {
                    }
                } catch (C22763BOa | C24401C1w | C2J e2) {
                    throw A0D(this.A0F, e2, 5001);
                }
            }
        }
    }

    public C25732Cl2 CK1(C25732Cl2 cl2) {
        this.A0J.A0E(cl2);
        return cl2;
    }

    public final int COo(D48 d48) {
        int i = d48.A06;
        OpusLibrary opusLibrary = OpusLibrary.$redex_init_class;
        boolean z = true;
        if (i != 0) {
            z = false;
        }
        if (!"audio/opus".equalsIgnoreCase(d48.A0S)) {
            return 0;
        }
        if (!this.A0J.A0G(d48.A05, 2)) {
            return 1;
        }
        if (z) {
            return 44;
        }
        return 2;
    }

    public String getName() {
        return "LibopusAudioRenderer";
    }
}
