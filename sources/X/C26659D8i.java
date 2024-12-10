package X;

import android.os.SystemClock;
import android.util.Log;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;

/* renamed from: X.D8i  reason: case insensitive filesystem */
public abstract class C26659D8i implements ECg, E7M {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C25715Ckl A04;
    public C25935Cp0 A05;
    public E90 A06;
    public Integer A07 = AnonymousClass00R.A00;
    public boolean A08;
    public boolean A09;
    public D48[] A0A;
    public final int A0B;
    public final C24756CIt A0C;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.BOK A0D(X.D48 r10, java.lang.Throwable r11, int r12) {
        /*
            r9 = this;
            r1 = 0
            r2 = r10
            if (r10 == 0) goto L_0x001a
            boolean r0 = r9.A09
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r9.A09 = r0
            int r0 = r9.COo(r10)     // Catch:{ BOK -> 0x0018, all -> 0x0014 }
            r8 = r0 & 7
            r9.A09 = r1
            goto L_0x001b
        L_0x0014:
            r0 = move-exception
            r9.A09 = r1
            throw r0
        L_0x0018:
            r9.A09 = r1
        L_0x001a:
            r8 = 4
        L_0x001b:
            java.lang.String r3 = r9.getName()
            int r7 = r9.A00
            if (r10 != 0) goto L_0x0024
            r8 = 4
        L_0x0024:
            r5 = 1
            X.BOK r1 = new X.BOK
            r4 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26659D8i.A0D(X.D48, java.lang.Throwable, int):X.BOK");
    }

    public abstract void A0H();

    public abstract void A0I(long j, boolean z);

    public void A0J(boolean z, boolean z2) {
    }

    public final int A0C(C24756CIt cIt, C22765BOc bOc, int i) {
        E90 e90 = this.A06;
        C26056CrS.A01(e90);
        int CDP = e90.CDP(cIt, bOc, i);
        if (CDP == -4) {
            if (AnonymousClass000.A1T(bOc.A00 & 4, 4)) {
                this.A02 = Long.MIN_VALUE;
                if (!this.A08) {
                    return -3;
                }
                return -4;
            }
            long j = bOc.A00 + this.A03;
            bOc.A00 = j;
            this.A02 = Math.max(this.A02, j);
        } else if (CDP == -5) {
            D48 d48 = cIt.A00;
            C26056CrS.A01(d48);
            long j2 = d48.A0J;
            if (j2 != Long.MAX_VALUE) {
                C25702CkX ckX = new C25702CkX(d48);
                ckX.A0I = j2 + this.A03;
                cIt.A00 = new D48(ckX);
                return CDP;
            }
        }
        return CDP;
    }

    public void A0E() {
        DefaultAudioSink defaultAudioSink;
        if (this instanceof BOG) {
            defaultAudioSink = ((BOG) this).A0J;
        } else if (this instanceof C22775BOo) {
            C22775BOo bOo = (C22775BOo) this;
            if (bOo instanceof C22773BOm) {
                C22773BOm bOm = (C22773BOm) bOo;
                bOm.A06 = 0;
                bOm.A07 = 0;
                bOm.A08 = 0;
                bOm.A0F = SystemClock.elapsedRealtime();
                bOm.A0J = SystemClock.elapsedRealtime() * 1000;
                return;
            } else if (bOo instanceof C22774BOn) {
                defaultAudioSink = ((C22774BOn) bOo).A0F;
            } else {
                throw AnonymousClass04E.createAndThrow();
            }
        } else {
            return;
        }
        defaultAudioSink.A0N = true;
        if (defaultAudioSink.A0B != null) {
            C25592CiX ciX = defaultAudioSink.A0W.A0H;
            C26056CrS.A01(ciX);
            C25592CiX.A00(ciX, 0);
            defaultAudioSink.A0B.play();
        }
    }

    public void A0F() {
        DefaultAudioSink defaultAudioSink;
        if (this instanceof BOG) {
            BOG bog = (BOG) this;
            BOG.A04(bog);
            defaultAudioSink = bog.A0J;
        } else if (this instanceof C22775BOo) {
            C22775BOo bOo = (C22775BOo) this;
            if (bOo instanceof C22773BOm) {
                C22773BOm bOm = (C22773BOm) bOo;
                bOm.A0H = -9223372036854775807L;
                C22773BOm.A04(bOm);
                return;
            } else if (bOo instanceof C22774BOn) {
                C22774BOn bOn = (C22774BOn) bOo;
                C22774BOn.A01(bOn);
                defaultAudioSink = bOn.A0F;
            } else {
                throw AnonymousClass04E.createAndThrow();
            }
        } else {
            return;
        }
        defaultAudioSink.A0N = false;
        if (defaultAudioSink.A0B != null) {
            C25700CkV ckV = defaultAudioSink.A0W;
            ckV.A0D = 0;
            ckV.A03 = 0;
            ckV.A01 = 0;
            ckV.A08 = 0;
            if (ckV.A0F == -9223372036854775807L) {
                C25592CiX ciX = ckV.A0H;
                C26056CrS.A01(ciX);
                C25592CiX.A00(ciX, 0);
                defaultAudioSink.A0B.pause();
            }
        }
    }

    public void A0G(D48[] d48Arr, long j) {
        if (this instanceof C22773BOm) {
            C22773BOm bOm = (C22773BOm) this;
            if (bOm.A0L == -9223372036854775807L) {
                bOm.A0L = j;
                return;
            }
            int i = bOm.A09;
            long[] jArr = bOm.A0m;
            if (i == 10) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Too many stream changes, so dropping offset: ");
                Log.w("MediaCodecVideoRenderer", C17880vN.A0u(A10, jArr[9]));
            } else {
                bOm.A09 = i + 1;
            }
            int i2 = bOm.A09 - 1;
            jArr[i2] = j;
            bOm.A0n[i2] = bOm.A0I;
        } else if (this instanceof BOF) {
            BOF bof = (BOF) this;
            bof.A01 = j;
            bof.A02 = d48Arr[0];
            if (bof.A03 != null) {
                bof.A00 = 1;
            } else {
                BOF.A05(bof);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        if (r4.Bg8() == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a2, code lost:
        if (r10 != null) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BcJ(int r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.BOG
            if (r0 == 0) goto L_0x0033
            r1 = r8
            X.BOG r1 = (X.BOG) r1
            r0 = 2
            if (r9 == r0) goto L_0x0025
            r0 = 3
            if (r9 == r0) goto L_0x001f
            r0 = 6
            if (r9 != r0) goto L_0x001e
            X.C6D r10 = (X.C6D) r10
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r1.A0J
        L_0x0014:
            X.C6D r0 = r1.A0F
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x001e
            r1.A0F = r10
        L_0x001e:
            return
        L_0x001f:
            X.Ckq r10 = (X.C25720Ckq) r10
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r1.A0J
            goto L_0x0108
        L_0x0025:
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r2 = r1.A0J
            float r1 = X.AnonymousClass000.A04(r10)
            float r0 = r2.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
            goto L_0x0122
        L_0x0033:
            boolean r0 = r8 instanceof X.C22773BOm
            if (r0 == 0) goto L_0x00ee
            r4 = r8
            X.BOm r4 = (X.C22773BOm) r4
            r7 = 1
            if (r9 != r7) goto L_0x00d5
            android.view.Surface r10 = (android.view.Surface) r10
            if (r10 != 0) goto L_0x0046
            android.view.Surface r0 = r4.A0N
            if (r0 == 0) goto L_0x00a5
            r10 = r0
        L_0x0046:
            android.view.Surface r0 = r4.A0O
            if (r0 == r10) goto L_0x00ba
            r4.A0O = r10
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.A0K = r0
            int r6 = r4.A01
            boolean r0 = r4.A0X
            if (r0 == 0) goto L_0x005f
            boolean r0 = r4.Bg8()
            r5 = 1
            if (r0 != 0) goto L_0x0060
        L_0x005f:
            r5 = 0
        L_0x0060:
            r3 = 2
            if (r6 == r7) goto L_0x0065
            if (r6 != r3) goto L_0x00a2
        L_0x0065:
            X.EAe r2 = r4.A0C
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 23
            if (r1 < r0) goto L_0x009c
            if (r2 == 0) goto L_0x009c
            if (r10 == 0) goto L_0x009c
            boolean r0 = r4.A0U
            if (r0 != 0) goto L_0x009c
            X.C22773BOm.A02(r10, r2)
        L_0x0078:
            android.view.Surface r0 = r4.A0N
            if (r10 == r0) goto L_0x012c
            X.C22773BOm.A05(r4)
            X.C22773BOm.A03(r4)
            if (r6 == r3) goto L_0x0086
            if (r5 == 0) goto L_0x001e
        L_0x0086:
            long r5 = r4.A0h
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0096
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r5
        L_0x0093:
            r4.A0H = r0
            return
        L_0x0096:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0093
        L_0x009c:
            r4.A0O()
            r4.A0P()
        L_0x00a2:
            if (r10 == 0) goto L_0x012c
            goto L_0x0078
        L_0x00a5:
            X.Csn r2 = r4.A0D
            if (r2 == 0) goto L_0x0046
            boolean r0 = X.C22773BOm.A07(r2, r4)
            if (r0 == 0) goto L_0x0046
            android.content.Context r1 = r4.A0i
            boolean r0 = r2.A07
            X.BHD r10 = X.BHD.A01(r1, r0)
            r4.A0N = r10
            goto L_0x0046
        L_0x00ba:
            if (r10 == 0) goto L_0x001e
            android.view.Surface r0 = r4.A0N
            if (r10 == r0) goto L_0x001e
            X.C22773BOm.A05(r4)
            boolean r0 = r4.A0Y
            if (r0 == 0) goto L_0x001e
            X.CMq r3 = r4.A0k
            android.view.Surface r2 = r4.A0O
            android.os.Handler r1 = r3.A00
            if (r1 == 0) goto L_0x001e
            r0 = 44
            X.BE7.A19(r1, r3, r2, r0)
            return
        L_0x00d5:
            r0 = 4
            if (r9 != r0) goto L_0x00e6
            int r1 = X.AnonymousClass000.A0M(r10)
            r4.A0E = r1
            X.EAe r0 = r4.A0C
            if (r0 == 0) goto L_0x001e
            r0.CLO(r1)
            return
        L_0x00e6:
            r0 = 7
            if (r9 != r0) goto L_0x001e
            X.CKp r10 = (X.C24796CKp) r10
            r4.A0R = r10
            return
        L_0x00ee:
            boolean r0 = r8 instanceof X.C22774BOn
            if (r0 == 0) goto L_0x001e
            r1 = r8
            X.BOn r1 = (X.C22774BOn) r1
            r0 = 2
            if (r9 == r0) goto L_0x0116
            r0 = 3
            if (r9 == r0) goto L_0x0104
            r0 = 6
            if (r9 != r0) goto L_0x001e
            X.C6D r10 = (X.C6D) r10
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r1.A0F
            goto L_0x0014
        L_0x0104:
            X.Ckq r10 = (X.C25720Ckq) r10
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r1.A0F
        L_0x0108:
            X.Ckq r0 = r1.A0D
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x001e
            r1.A0D = r10
            r1.A0B()
            return
        L_0x0116:
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r2 = r1.A0F
            float r1 = X.AnonymousClass000.A04(r10)
            float r0 = r2.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
        L_0x0122:
            r2.A00 = r1
            android.media.AudioTrack r0 = r2.A0B
            if (r0 == 0) goto L_0x001e
            r0.setVolume(r1)
            return
        L_0x012c:
            r1 = -1
            r4.A0D = r1
            r4.A0B = r1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.A02 = r0
            r4.A0C = r1
            X.C22773BOm.A03(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26659D8i.BcJ(int, java.lang.Object):void");
    }

    public final boolean Bco() {
        return AnonymousClass000.A1P((this.A02 > Long.MIN_VALUE ? 1 : (this.A02 == Long.MIN_VALUE ? 0 : -1)));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.CIt, java.lang.Object] */
    public C26659D8i(int i) {
        this.A0B = i;
        this.A0C = new Object();
        this.A02 = Long.MIN_VALUE;
    }
}
