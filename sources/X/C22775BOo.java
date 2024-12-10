package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;

/* renamed from: X.BOo  reason: case insensitive filesystem */
public abstract class C22775BOo extends C26659D8i {
    public static final byte[] A0m = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = -9223372036854775807L;
    public long A06;
    public long A07;
    public D48 A08;
    public CU1 A09;
    public E8V A0A;
    public E8V A0B;
    public C28610EAe A0C;
    public C26125Csn A0D;
    public C2Q A0E;
    public ByteBuffer A0F;
    public ArrayDeque A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R = false;
    public boolean A0S;
    public boolean A0T;
    public long A0U;
    public long A0V = -9223372036854775807L;
    public String A0W;
    public boolean A0X;
    public boolean A0Y;
    public final int A0Z;
    public final MediaCodec.BufferInfo A0a;
    public final C24756CIt A0b;
    public final C22765BOc A0c;
    public final C25744ClE A0d;
    public final EBU A0e;
    public final CPn A0f;
    public final C25626Cj6 A0g;
    public final List A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final int A0k;
    public final C22765BOc A0l;

    private void A09() {
        this.A03 = -1;
        this.A0c.A01 = null;
    }

    public void A0H() {
        this.A08 = null;
        this.A0G = null;
        try {
            A0O();
            try {
                E8V e8v = this.A0A;
                if (e8v != null) {
                    this.A0d.A02(e8v);
                }
                try {
                    A0B(this);
                } finally {
                    this.A0A = null;
                    this.A0B = null;
                }
            } catch (Throwable th) {
                A0B(this);
                throw th;
            } finally {
                this.A0A = null;
                this.A0B = null;
            }
        } catch (Throwable th2) {
            try {
                A0B(this);
                throw th2;
            } finally {
                this.A0A = null;
                this.A0B = null;
            }
        } finally {
        }
    }

    public void A0I(long j, boolean z) {
        this.A0M = false;
        this.A0N = false;
        if (this.A0C != null) {
            A0N();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r1 == 2) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0K(X.D48 r12, X.EBU r13) {
        /*
            r11 = this;
            r6 = r11
            X.BOn r6 = (X.C22774BOn) r6
            java.lang.String r3 = r12.A0S
            java.lang.String r0 = "audio"
            boolean r0 = X.BE8.A1Z(r3, r0)
            r5 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 0
            return r0
        L_0x0010:
            int r1 = r12.A06
            if (r1 == 0) goto L_0x0018
            r0 = 2
            r10 = 0
            if (r1 != r0) goto L_0x0019
        L_0x0018:
            r10 = 1
        L_0x0019:
            r9 = 4
            r8 = 8
            if (r10 == 0) goto L_0x002f
            int r0 = r12.A05
            boolean r0 = r6.A0T(r0, r3)
            if (r0 == 0) goto L_0x002f
            X.Csn r0 = r13.BWO()
            if (r0 == 0) goto L_0x002f
            r0 = 44
            return r0
        L_0x002f:
            java.lang.String r2 = "audio/raw"
            boolean r0 = r2.equals(r3)
            r7 = 1
            if (r0 == 0) goto L_0x0044
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r3 = r6.A0F
            int r1 = r12.A05
            int r0 = r12.A0B
            boolean r0 = r3.A0G(r1, r0)
            if (r0 == 0) goto L_0x0174
        L_0x0044:
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r6.A0F
            int r4 = r12.A05
            r0 = 2
            boolean r0 = r1.A0G(r4, r0)
            if (r0 == 0) goto L_0x0174
            java.util.List r1 = r6.A0L(r12, r13, r5)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x005c
            r0 = 129(0x81, float:1.81E-43)
            return r0
        L_0x005c:
            if (r10 != 0) goto L_0x0061
            r0 = 130(0x82, float:1.82E-43)
            return r0
        L_0x0061:
            java.lang.Object r3 = r1.get(r5)
            X.Csn r3 = (X.C26125Csn) r3
            int r5 = r12.A0F
            r1 = -1
            if (r5 == r1) goto L_0x0094
            android.media.MediaCodecInfo$CodecCapabilities r0 = r3.A00
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = "sampleRate.caps"
        L_0x0072:
            X.C26125Csn.A01(r3, r0)
            r9 = 3
        L_0x0076:
            r0 = r8 | 32
            r0 = r0 | r9
            return r0
        L_0x007a:
            android.media.MediaCodecInfo$AudioCapabilities r0 = r0.getAudioCapabilities()
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "sampleRate.aCaps"
            goto L_0x0072
        L_0x0083:
            boolean r0 = r0.isSampleRateSupported(r5)
            if (r0 != 0) goto L_0x0094
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sampleRate.support, "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r5)
            goto L_0x0072
        L_0x0094:
            if (r4 == r1) goto L_0x0159
            android.media.MediaCodecInfo$CodecCapabilities r0 = r3.A00
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "channelCount.caps"
            goto L_0x0072
        L_0x009d:
            android.media.MediaCodecInfo$AudioCapabilities r0 = r0.getAudioCapabilities()
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = "channelCount.aCaps"
            goto L_0x0072
        L_0x00a6:
            java.lang.String r6 = r3.A02
            java.lang.String r1 = r3.A01
            int r5 = r0.getMaxInputChannelCount()
            if (r5 > r7) goto L_0x00b8
            int r7 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 26
            if (r7 < r0) goto L_0x00c5
            if (r5 <= 0) goto L_0x00c5
        L_0x00b8:
            if (r5 >= r4) goto L_0x0159
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "channelCount.support, "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r4)
            goto L_0x0072
        L_0x00c5:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "audio/3gpp"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "audio/amr-wb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "audio/vorbis"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b8
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "audio/flac"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "audio/gsm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x014c
            r2 = 6
        L_0x0124:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AssumedMaxChannelAdjustment: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", ["
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.AnonymousClass000.A0z(r1)
            java.lang.String r0 = "MediaCodecInfo"
            android.util.Log.w(r0, r1)
            r5 = r2
            goto L_0x00b8
        L_0x014c:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r0.equals(r1)
            r2 = 30
            if (r0 == 0) goto L_0x0124
            r2 = 16
            goto L_0x0124
        L_0x0159:
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0165
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0076
        L_0x0161:
            r8 = 16
            goto L_0x0076
        L_0x0165:
            android.util.Pair r0 = X.C26283Cwe.A00(r12)
            if (r0 == 0) goto L_0x0076
            int r1 = X.C108965cb.A01(r0)
            r0 = 42
            if (r1 != r0) goto L_0x0076
            goto L_0x0161
        L_0x0174:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22775BOo.A0K(X.D48, X.EBU):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a9, code lost:
        if (r0 <= r8) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q(android.media.MediaCrypto r10, X.D48 r11, X.C28610EAe r12, X.C26125Csn r13) {
        /*
            r9 = this;
            r4 = r9
            X.BOn r4 = (X.C22774BOn) r4
            X.D48[] r0 = r4.A0A
            X.C26056CrS.A01(r0)
            int r6 = X.C22774BOn.A00(r11, r4, r13)
            r4.A00 = r6
            java.lang.String r1 = r13.A02
            int r5 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 24
            if (r5 >= r0) goto L_0x00ed
            java.lang.String r0 = "OMX.SEC.aac.dec"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            java.lang.String r1 = "samsung"
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ed
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A01
            java.lang.String r0 = "zeroflte"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "herolte"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "heroqlte"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00ed
        L_0x0042:
            r0 = 1
        L_0x0043:
            r4.A0B = r0
            boolean r0 = r13.A06
            r4.A0C = r0
            java.lang.String r0 = r13.A01
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "audio/raw"
        L_0x004f:
            android.media.MediaFormat r3 = new android.media.MediaFormat
            r3.<init>()
            java.lang.String r2 = "mime"
            r3.setString(r2, r0)
            java.lang.String r1 = "channel-count"
            int r0 = r11.A05
            r3.setInteger(r1, r0)
            java.lang.String r1 = "sample-rate"
            int r0 = r11.A0F
            r3.setInteger(r1, r0)
            java.util.List r0 = r11.A0T
            X.C89.A00(r3, r0)
            java.lang.String r1 = "max-input-size"
            r0 = -1
            if (r6 == r0) goto L_0x0074
            r3.setInteger(r1, r6)
        L_0x0074:
            r0 = 23
            if (r5 < r0) goto L_0x007e
            java.lang.String r1 = "priority"
            r0 = 0
            r3.setInteger(r1, r0)
        L_0x007e:
            java.lang.String r1 = r11.A0O
            if (r1 == 0) goto L_0x00dd
            java.lang.String r0 = "mp4a.40.42"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dd
            X.Cj6 r7 = r4.A0g
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x00dd
            java.lang.String r6 = "aac-drc-effect-type"
            int r5 = r7.A05
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x00d3
            int r5 = r7.A00
            int r8 = r7.A01
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r0 = 11
            int r0 = r1.get(r0)
            if (r0 >= r5) goto L_0x00ab
            r5 = 3
            if (r0 > r8) goto L_0x00ac
        L_0x00ab:
            r5 = 1
        L_0x00ac:
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x00d3
            android.media.AudioManager r1 = r4.A06
            if (r1 != 0) goto L_0x00c0
            android.content.Context r1 = r4.A0D
            java.lang.String r0 = "audio"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            r4.A06 = r1
        L_0x00c0:
            boolean r0 = r1.isWiredHeadsetOn()
            if (r0 != 0) goto L_0x00d2
            boolean r0 = r1.isBluetoothScoOn()
            if (r0 != 0) goto L_0x00d2
            boolean r0 = r1.isBluetoothA2dpOn()
            if (r0 == 0) goto L_0x00d3
        L_0x00d2:
            r5 = 5
        L_0x00d3:
            r3.setInteger(r6, r5)
            int r1 = r7.A06
            java.lang.String r0 = "aac-target-ref-level"
            r3.setInteger(r0, r1)
        L_0x00dd:
            r1 = 0
            r12.BFa(r10, r3, r1)
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x00f0
            r4.A07 = r3
            java.lang.String r0 = r11.A0S
            r3.setString(r2, r0)
            return
        L_0x00ed:
            r0 = 0
            goto L_0x0043
        L_0x00f0:
            r4.A07 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22775BOo.A0Q(android.media.MediaCrypto, X.D48, X.EAe, X.Csn):void");
    }

    public boolean A0S(C28610EAe eAe, ByteBuffer byteBuffer, int i, int i2, long j, long j2, long j3, boolean z) {
        D48 d48;
        int i3;
        C22774BOn bOn = (C22774BOn) this;
        if (bOn.A0C && (i2 & 2) != 0) {
            eAe.CEK(i);
            return true;
        } else if (z) {
            eAe.CEK(i);
            bOn.A09.A09++;
            bOn.A0F.A0P = true;
            return true;
        } else {
            if (bOn.A0H) {
                D48 d482 = bOn.A08;
                if ((!"audio/raw".equals(d482.A0S) || d482.A0B == 2) && i2 == 0 && bOn.A03 > 0 && byteBuffer.limit() - byteBuffer.position() >= 12) {
                    int position = byteBuffer.position();
                    int limit = byteBuffer.limit();
                    byteBuffer.position(10);
                    short s = byteBuffer.getShort();
                    byteBuffer.position(position);
                    byteBuffer.limit(limit);
                    int limit2 = bOn.A01 + (byteBuffer.limit() - byteBuffer.position());
                    bOn.A01 = limit2;
                    bOn.A02++;
                    bOn.A05 += (long) Math.abs(s);
                    if (limit2 >= bOn.A03 * 2) {
                        bOn.A01 = 0;
                        bOn.A02 = 0;
                        bOn.A05 = 0;
                    }
                }
            }
            if (bOn.A0G && byteBuffer.limit() > byteBuffer.position()) {
                int position2 = byteBuffer.position();
                int limit3 = byteBuffer.limit();
                ByteBuffer allocate = ByteBuffer.allocate(limit3 - position2);
                allocate.put(byteBuffer);
                allocate.flip();
                byteBuffer.position(position2);
                byteBuffer.limit(limit3);
            }
            try {
                if (!bOn.A0F.A0H(byteBuffer, j3)) {
                    return false;
                }
                eAe.CEK(i);
                bOn.A09.A07++;
                return true;
            } catch (C24401C1w e) {
                e = e;
                d48 = bOn.A08;
                i3 = 5001;
                throw bOn.A0D(d48, e, i3);
            } catch (C24402C1x e2) {
                e = e2;
                d48 = bOn.A08;
                i3 = 5002;
                throw bOn.A0D(d48, e, i3);
            }
        }
    }

    private void A08() {
        if (this.A02 == 2) {
            A0O();
            A0P();
            return;
        }
        this.A0N = true;
        A0M();
    }

    private void A0A(MediaCrypto mediaCrypto, C26125Csn csn) {
        boolean z;
        String str = csn.A02;
        C28610EAe eAe = null;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C25304Cd8.A01(AnonymousClass001.A1H("createCodec:", str, AnonymousClass000.A10()));
            C25626Cj6 cj6 = this.A0g;
            D96 d96 = new D96(cj6.A09, cj6.A0N);
            C26119Csh csh = C26119Csh.A04;
            boolean z2 = this instanceof C22773BOm;
            if (z2) {
                z = true;
            } else {
                z = false;
            }
            C28610EAe A022 = csh.A02(d96, cj6, str, z);
            this.A0W = str;
            C25304Cd8.A00();
            C25304Cd8.A01("configureCodec");
            A0Q(mediaCrypto, this.A08, A022, csn);
            C25304Cd8.A00();
            C25304Cd8.A01("startCodec");
            A022.start();
            C25304Cd8.A00();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.A0C = A022;
            this.A0D = csn;
            long j = elapsedRealtime2 - elapsedRealtime;
            if (z2) {
                C22773BOm bOm = (C22773BOm) this;
                C24847CMq cMq = bOm.A0k;
                Handler handler = cMq.A00;
                if (handler != null) {
                    handler.post(new DT9(cMq, str, 1, j));
                }
                bOm.A0U = bOm.A0W(str);
                return;
            }
            C25047CVb cVb = ((C22774BOn) this).A0E;
            Handler handler2 = cVb.A00;
            if (handler2 != null) {
                handler2.post(new DT9(cVb, str, 0, j));
            }
        } catch (Exception e) {
            if (eAe != null) {
                eAe.release();
            }
            throw e;
        }
    }

    public static void A0B(C22775BOo bOo) {
        E8V e8v = bOo.A0B;
        if (e8v != null && e8v != bOo.A0A) {
            bOo.A0d.A02(e8v);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CU1, java.lang.Object] */
    public void A0J(boolean z, boolean z2) {
        this.A09 = new Object();
        this.A07 = 0;
    }

    public List A0L(D48 d48, EBU ebu, boolean z) {
        List BQL;
        C26125Csn BWO;
        if (this instanceof C22773BOm) {
            String str = d48.A0S;
            if (str != null) {
                BQL = ebu.BQL(str, z);
            }
            return Collections.emptyList();
        }
        C22774BOn bOn = (C22774BOn) this;
        String str2 = d48.A0S;
        if (str2 != null) {
            if (bOn.A0T(d48.A05, str2) && (BWO = ebu.BWO()) != null) {
                return Collections.singletonList(BWO);
            }
            BQL = ebu.BQL(str2, z);
        }
        return Collections.emptyList();
        return Collections.unmodifiableList(BQL);
    }

    public void A0M() {
        if (this instanceof C22774BOn) {
            C22774BOn bOn = (C22774BOn) this;
            try {
                bOn.A0F.A0C();
            } catch (C24402C1x e) {
                throw bOn.A0D(bOn.A08, e, 5002);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0203, code lost:
        if ("OMX.rk.video_decoder.avc".equals(r6) == false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0213, code lost:
        if ("OMX.broadcom.video_decoder.tunnel.secure".equals(r6) == false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x021d, code lost:
        if ("Amazon".equals(com.facebook.android.exoplayer2.util.Util.A03) == false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0227, code lost:
        if ("AFTS".equals(com.facebook.android.exoplayer2.util.Util.A04) == false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x022b, code lost:
        if (r7.A07 == false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x023d, code lost:
        if ("OMX.google.vorbis.decoder".equals(r6) == false) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x024d, code lost:
        if ("OMX.google.aac.decoder".equals(r6) == false) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0284, code lost:
        if ("OMX.google.vorbis.decoder".equals(r6) == false) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0288, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x028c, code lost:
        if (r3 <= 29) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r3.requiresSecureDecoderComponent(r1) == false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x027b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0P() {
        /*
            r20 = this;
            r5 = r20
            X.EAe r0 = r5.A0C
            if (r0 != 0) goto L_0x0307
            X.D48 r0 = r5.A08
            if (r0 == 0) goto L_0x0307
            X.E8V r2 = r5.A0B
            r5.A0A = r2
            java.lang.String r1 = r0.A0S
            r4 = 0
            r9 = 1
            if (r2 == 0) goto L_0x0020
            X.CP9 r0 = r2.BPl()
            if (r0 != 0) goto L_0x0028
            X.BxB r0 = r2.BRM()
            if (r0 == 0) goto L_0x0307
        L_0x0020:
            r3 = r4
        L_0x0021:
            r2 = 0
        L_0x0022:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0032
        L_0x0028:
            android.media.MediaCrypto r3 = r0.A00
            boolean r0 = r3.requiresSecureDecoderComponent(r1)
            r2 = 1
            if (r0 != 0) goto L_0x0022
            goto L_0x0021
        L_0x0032:
            java.util.ArrayDeque r8 = r5.A0G     // Catch:{ C2Q -> 0x02cc }
            r10 = 0
            if (r8 != 0) goto L_0x00cd
            X.EBU r8 = r5.A0e     // Catch:{ C1L -> 0x00c1 }
            X.D48 r6 = r5.A08     // Catch:{ C1L -> 0x00c1 }
            java.util.List r11 = r5.A0L(r6, r8, r2)     // Catch:{ C1L -> 0x00c1 }
            boolean r6 = r11.isEmpty()     // Catch:{ C1L -> 0x00c1 }
            if (r6 == 0) goto L_0x0076
            if (r2 == 0) goto L_0x0076
            X.D48 r6 = r5.A08     // Catch:{ C1L -> 0x00c1 }
            java.util.List r11 = r5.A0L(r6, r8, r10)     // Catch:{ C1L -> 0x00c1 }
            boolean r6 = r11.isEmpty()     // Catch:{ C1L -> 0x00c1 }
            if (r6 != 0) goto L_0x0076
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ C1L -> 0x00c1 }
            java.lang.String r6 = "Drm session requires secure decoder for "
            r7.append(r6)     // Catch:{ C1L -> 0x00c1 }
            X.D48 r6 = r5.A08     // Catch:{ C1L -> 0x00c1 }
            java.lang.String r6 = r6.A0S     // Catch:{ C1L -> 0x00c1 }
            r7.append(r6)     // Catch:{ C1L -> 0x00c1 }
            java.lang.String r6 = ", but no secure decoder available. Trying to proceed with "
            r7.append(r6)     // Catch:{ C1L -> 0x00c1 }
            r7.append(r11)     // Catch:{ C1L -> 0x00c1 }
            java.lang.String r6 = "."
            java.lang.String r7 = X.AnonymousClass000.A0y(r6, r7)     // Catch:{ C1L -> 0x00c1 }
            java.lang.String r6 = "MediaCodecRenderer"
            android.util.Log.w(r6, r7)     // Catch:{ C1L -> 0x00c1 }
        L_0x0076:
            boolean r6 = r11.isEmpty()     // Catch:{ C1L -> 0x00c1 }
            if (r6 == 0) goto L_0x00a5
            boolean r6 = r5.A0Q     // Catch:{ C1L -> 0x00c1 }
            if (r6 == 0) goto L_0x00a5
            X.D48 r6 = r5.A08     // Catch:{ C1L -> 0x00c1 }
            java.lang.String r6 = X.C26283Cwe.A01(r6)     // Catch:{ C1L -> 0x00c1 }
            if (r6 == 0) goto L_0x00a5
            java.util.List r8 = r8.BQL(r6, r10)     // Catch:{ C1L -> 0x00c1 }
            int r7 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ C1L -> 0x00c1 }
            r6 = 26
            if (r7 < r6) goto L_0x00a5
            X.D48 r6 = r5.A08     // Catch:{ C1L -> 0x00c1 }
            java.lang.String r7 = r6.A0S     // Catch:{ C1L -> 0x00c1 }
            java.lang.String r6 = "video/dolby-vision"
            boolean r6 = r6.equals(r7)     // Catch:{ C1L -> 0x00c1 }
            if (r6 == 0) goto L_0x00a5
            boolean r6 = r8.isEmpty()     // Catch:{ C1L -> 0x00c1 }
            if (r6 != 0) goto L_0x00a5
            r11 = r8
        L_0x00a5:
            boolean r6 = r5.A0i     // Catch:{ C1L -> 0x00c1 }
            if (r6 == 0) goto L_0x00b3
            java.util.ArrayDeque r8 = new java.util.ArrayDeque     // Catch:{ C1L -> 0x00c1 }
            r8.<init>(r11)     // Catch:{ C1L -> 0x00c1 }
        L_0x00ae:
            r5.A0G = r8     // Catch:{ C1L -> 0x00c1 }
            r5.A0E = r4     // Catch:{ C1L -> 0x00c1 }
            goto L_0x00cd
        L_0x00b3:
            java.lang.Object r6 = r11.get(r10)     // Catch:{ C1L -> 0x00c1 }
            java.util.List r6 = java.util.Collections.singletonList(r6)     // Catch:{ C1L -> 0x00c1 }
            java.util.ArrayDeque r8 = new java.util.ArrayDeque     // Catch:{ C1L -> 0x00c1 }
            r8.<init>(r6)     // Catch:{ C1L -> 0x00c1 }
            goto L_0x00ae
        L_0x00c1:
            r8 = move-exception
            X.D48 r7 = r5.A08     // Catch:{ C2Q -> 0x02cc }
            r6 = -49998(0xffffffffffff3cb2, float:NaN)
            X.C2Q r3 = new X.C2Q     // Catch:{ C2Q -> 0x02cc }
            r3.<init>(r7, r8, r6, r2)     // Catch:{ C2Q -> 0x02cc }
            throw r3     // Catch:{ C2Q -> 0x02cc }
        L_0x00cd:
            X.D48 r7 = r5.A08     // Catch:{ C2Q -> 0x02cc }
            if (r7 == 0) goto L_0x00ed
            boolean r6 = r5.A0R     // Catch:{ C2Q -> 0x02cc }
            if (r6 == 0) goto L_0x00ed
            java.lang.String r6 = "video/av01"
            java.lang.String r7 = r7.A0S     // Catch:{ C2Q -> 0x02cc }
            boolean r6 = r6.equalsIgnoreCase(r7)     // Catch:{ C2Q -> 0x02cc }
            if (r6 == 0) goto L_0x00ed
            java.lang.String r11 = "meta.dav1d.av1.decoder"
            r15 = r10
            r12 = r7
            r13 = r10
            r14 = r9
            r10 = r4
            X.Csn r6 = X.C26125Csn.A00(r10, r11, r12, r13, r14, r15)     // Catch:{ C2Q -> 0x02cc }
            r8.addFirst(r6)     // Catch:{ C2Q -> 0x02cc }
        L_0x00ed:
            java.util.ArrayDeque r6 = r5.A0G     // Catch:{ C2Q -> 0x02cc }
            boolean r6 = r6.isEmpty()     // Catch:{ C2Q -> 0x02cc }
            if (r6 != 0) goto L_0x013d
            java.util.ArrayDeque r6 = r5.A0G     // Catch:{ C2Q -> 0x02cc }
            java.lang.Object r8 = r6.peekFirst()     // Catch:{ C2Q -> 0x02cc }
        L_0x00fb:
            java.util.ArrayDeque r6 = r5.A0G     // Catch:{ C2Q -> 0x02cc }
            java.lang.Object r10 = r6.peekFirst()     // Catch:{ C2Q -> 0x02cc }
            X.Csn r10 = (X.C26125Csn) r10     // Catch:{ C2Q -> 0x02cc }
            boolean r6 = r5 instanceof X.C22773BOm     // Catch:{ C2Q -> 0x02cc }
            if (r6 == 0) goto L_0x011e
            r11 = r5
            X.BOm r11 = (X.C22773BOm) r11     // Catch:{ C2Q -> 0x02cc }
            android.view.Surface r7 = r11.A0O     // Catch:{ C2Q -> 0x02cc }
            if (r7 == 0) goto L_0x0118
            boolean r6 = r11.A0S     // Catch:{ C2Q -> 0x02cc }
            if (r6 != 0) goto L_0x011e
            boolean r6 = r7.isValid()     // Catch:{ C2Q -> 0x02cc }
            if (r6 != 0) goto L_0x011e
        L_0x0118:
            boolean r6 = X.C22773BOm.A07(r10, r11)     // Catch:{ C2Q -> 0x02cc }
            if (r6 == 0) goto L_0x0307
        L_0x011e:
            X.CPn r6 = r5.A0f     // Catch:{ Exception -> 0x0148 }
            int r11 = r6.A00     // Catch:{ Exception -> 0x0148 }
            if (r11 <= 0) goto L_0x0139
            r5.A0A(r3, r10)     // Catch:{ Exception -> 0x0129 }
            goto L_0x01bb
        L_0x0129:
            r6 = move-exception
            if (r10 != r8) goto L_0x012d
            goto L_0x012e
        L_0x012d:
            throw r6     // Catch:{ Exception -> 0x0148 }
        L_0x012e:
            java.lang.String r7 = "MediaCodecRenderer"
            java.lang.String r6 = "Preferred decoder instantiation failed. Sleeping then retrying."
            android.util.Log.w(r7, r6)     // Catch:{ Exception -> 0x0148 }
            long r6 = (long) r11     // Catch:{ Exception -> 0x0148 }
            java.lang.Thread.sleep(r6)     // Catch:{ Exception -> 0x0148 }
        L_0x0139:
            r5.A0A(r3, r10)     // Catch:{ Exception -> 0x0148 }
            goto L_0x01bb
        L_0x013d:
            X.D48 r6 = r5.A08     // Catch:{ C2Q -> 0x02cc }
            r3 = -49999(0xffffffffffff3cb1, float:NaN)
            X.C2Q r7 = new X.C2Q     // Catch:{ C2Q -> 0x02cc }
            r7.<init>(r6, r4, r3, r2)     // Catch:{ C2Q -> 0x02cc }
            goto L_0x019d
        L_0x0148:
            r11 = move-exception
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ C2Q -> 0x02cc }
            java.lang.String r6 = "Failed to initialize decoder: "
            java.lang.String r7 = X.AnonymousClass001.A1E(r10, r6, r7)     // Catch:{ C2Q -> 0x02cc }
            java.lang.String r6 = "MediaCodecRenderer"
            android.util.Log.w(r6, r7, r11)     // Catch:{ C2Q -> 0x02cc }
            java.util.ArrayDeque r6 = r5.A0G     // Catch:{ C2Q -> 0x02cc }
            r6.removeFirst()     // Catch:{ C2Q -> 0x02cc }
            X.D48 r12 = r5.A08     // Catch:{ C2Q -> 0x02cc }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ C2Q -> 0x02cc }
            java.lang.String r6 = "Decoder init failed: "
            r7.append(r6)     // Catch:{ C2Q -> 0x02cc }
            java.lang.String r6 = r10.A02     // Catch:{ C2Q -> 0x02cc }
            r7.append(r6)     // Catch:{ C2Q -> 0x02cc }
            java.lang.String r6 = ", "
            java.lang.String r15 = X.AnonymousClass001.A1E(r12, r6, r7)     // Catch:{ C2Q -> 0x02cc }
            java.lang.String r7 = r12.A0S     // Catch:{ C2Q -> 0x02cc }
            boolean r6 = r11 instanceof android.media.MediaCodec.CodecException     // Catch:{ C2Q -> 0x02cc }
            if (r6 == 0) goto L_0x01b8
            r6 = r11
            android.media.MediaCodec$CodecException r6 = (android.media.MediaCodec.CodecException) r6     // Catch:{ C2Q -> 0x02cc }
            java.lang.String r17 = r6.getDiagnosticInfo()     // Catch:{ C2Q -> 0x02cc }
        L_0x0180:
            X.C2Q r12 = new X.C2Q     // Catch:{ C2Q -> 0x02cc }
            r13 = r10
            r14 = r4
            r16 = r7
            r18 = r11
            r19 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ C2Q -> 0x02cc }
            X.C2Q r7 = r5.A0E     // Catch:{ C2Q -> 0x02cc }
            if (r7 != 0) goto L_0x019e
            r5.A0E = r12     // Catch:{ C2Q -> 0x02cc }
        L_0x0193:
            java.util.ArrayDeque r6 = r5.A0G     // Catch:{ C2Q -> 0x02cc }
            boolean r6 = r6.isEmpty()     // Catch:{ C2Q -> 0x02cc }
            if (r6 == 0) goto L_0x00fb
            X.C2Q r7 = r5.A0E     // Catch:{ C2Q -> 0x02cc }
        L_0x019d:
            throw r7     // Catch:{ C2Q -> 0x02cc }
        L_0x019e:
            java.lang.String r13 = r7.getMessage()     // Catch:{ C2Q -> 0x02cc }
            java.lang.Throwable r16 = r7.getCause()     // Catch:{ C2Q -> 0x02cc }
            java.lang.String r14 = r7.mimeType     // Catch:{ C2Q -> 0x02cc }
            boolean r6 = r7.secureDecoderRequired     // Catch:{ C2Q -> 0x02cc }
            X.Csn r11 = r7.codecInfo     // Catch:{ C2Q -> 0x02cc }
            java.lang.String r15 = r7.diagnosticInfo     // Catch:{ C2Q -> 0x02cc }
            X.C2Q r10 = new X.C2Q     // Catch:{ C2Q -> 0x02cc }
            r17 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ C2Q -> 0x02cc }
            r5.A0E = r10     // Catch:{ C2Q -> 0x02cc }
            goto L_0x0193
        L_0x01b8:
            r17 = 0
            goto L_0x0180
        L_0x01bb:
            X.Cj6 r2 = r5.A0g
            boolean r8 = r2.A0Q
            X.Csn r7 = r5.A0D
            java.lang.String r6 = r7.A02
            int r3 = com.facebook.android.exoplayer2.util.Util.A00
            r2 = 25
            if (r3 > r2) goto L_0x02c9
            java.lang.String r2 = "OMX.Exynos.avc.dec.secure"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0290
            java.lang.String r10 = com.facebook.android.exoplayer2.util.Util.A04
            java.lang.String r2 = "SM-T585"
            boolean r2 = r10.startsWith(r2)
            if (r2 != 0) goto L_0x01f3
            java.lang.String r2 = "SM-A510"
            boolean r2 = r10.startsWith(r2)
            if (r2 != 0) goto L_0x01f3
            java.lang.String r2 = "SM-A520"
            boolean r2 = r10.startsWith(r2)
            if (r2 != 0) goto L_0x01f3
            java.lang.String r2 = "SM-J700"
            boolean r2 = r10.startsWith(r2)
            if (r2 == 0) goto L_0x0290
        L_0x01f3:
            r2 = 2
        L_0x01f4:
            r5.A00 = r2
            r2 = 0
            if (r8 == 0) goto L_0x022e
            r2 = 25
            if (r3 > r2) goto L_0x028a
            java.lang.String r2 = "OMX.rk.video_decoder.avc"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x022d
        L_0x0205:
            java.lang.String r2 = "OMX.broadcom.video_decoder.tunnel"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x022d
            java.lang.String r2 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x022d
        L_0x0215:
            java.lang.String r10 = "Amazon"
            java.lang.String r2 = com.facebook.android.exoplayer2.util.Util.A03
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x0288
            java.lang.String r10 = "AFTS"
            java.lang.String r2 = com.facebook.android.exoplayer2.util.Util.A04
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x0288
            boolean r2 = r7.A07
            if (r2 == 0) goto L_0x0288
        L_0x022d:
            r2 = 1
        L_0x022e:
            r5.A0J = r2
            r2 = 23
            if (r8 == 0) goto L_0x027b
            if (r3 > r2) goto L_0x023f
            java.lang.String r2 = "OMX.google.vorbis.decoder"
            boolean r2 = r2.equals(r6)
            r7 = 1
            if (r2 != 0) goto L_0x0240
        L_0x023f:
            r7 = 0
        L_0x0240:
            r5.A0X = r7
            r2 = 21
            if (r3 != r2) goto L_0x024f
            java.lang.String r2 = "OMX.google.aac.decoder"
            boolean r3 = r2.equals(r6)
            r2 = 1
            if (r3 != 0) goto L_0x0250
        L_0x024f:
            r2 = 0
        L_0x0250:
            r5.A0I = r2
            int r3 = r5.A01
            r2 = 2
            if (r3 != r2) goto L_0x0275
            long r6 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 + r2
        L_0x025e:
            r5.A0U = r6
            r5.A09()
            r2 = -1
            r5.A04 = r2
            r5.A0F = r4
            r5.A0V = r0
            r5.A0S = r9
            X.CU1 r1 = r5.A09
            int r0 = r1.A01
            int r0 = r0 + 1
            r1.A01 = r0
            return
        L_0x0275:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x025e
        L_0x027b:
            if (r3 > r2) goto L_0x0286
            java.lang.String r2 = "OMX.google.vorbis.decoder"
            boolean r2 = r2.equals(r6)
            r7 = 1
            if (r2 != 0) goto L_0x0240
        L_0x0286:
            r7 = 0
            goto L_0x0240
        L_0x0288:
            r2 = 0
            goto L_0x022e
        L_0x028a:
            r2 = 29
            if (r3 > r2) goto L_0x0215
            goto L_0x0205
        L_0x0290:
            r2 = 24
            if (r3 >= r2) goto L_0x02c9
            java.lang.String r2 = "OMX.Nvidia.h264.decode"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x02a4
            java.lang.String r2 = "OMX.Nvidia.h264.decode.secure"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x02c9
        L_0x02a4:
            java.lang.String r2 = "flounder"
            java.lang.String r10 = com.facebook.android.exoplayer2.util.Util.A01
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x02c6
            java.lang.String r2 = "flounder_lte"
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x02c6
            java.lang.String r2 = "grouper"
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x02c6
            java.lang.String r2 = "tilapia"
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x02c9
        L_0x02c6:
            r2 = 1
            goto L_0x01f4
        L_0x02c9:
            r2 = 0
            goto L_0x01f4
        L_0x02cc:
            r12 = move-exception
            int r3 = r5.A0k
            if (r3 <= 0) goto L_0x02fe
            long r6 = r5.A0V
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x02e0
            long r10 = X.AnonymousClass8BR.A04(r6)
            long r8 = (long) r3
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x02fe
        L_0x02e0:
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x02f1
            java.lang.String r1 = "MediaCodecRenderer"
            java.lang.String r0 = "Decoder initialization failed, retry"
            android.util.Log.w(r1, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r5.A0V = r0
        L_0x02f1:
            java.util.ArrayDeque r0 = r5.A0G
            if (r0 == 0) goto L_0x0307
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0307
            r5.A0G = r4
            return
        L_0x02fe:
            X.D48 r1 = r5.A08
            r0 = 4001(0xfa1, float:5.607E-42)
            X.BOK r0 = r5.A0D(r1, r12, r0)
            throw r0
        L_0x0307:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22775BOo.A0P():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0197, code lost:
        if (r4.A09 == r15.A09) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x020a, code lost:
        if (r15.A01(r7) != false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0066, code lost:
        if (r4 == r7) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d6, code lost:
        if (r6 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R(X.D48 r21) {
        /*
            r20 = this;
            r2 = r20
            X.D48 r15 = r2.A08
            r0 = r21
            r2.A08 = r0
            X.DUU r1 = r0.A0L
            r3 = 0
            if (r15 != 0) goto L_0x002b
            r0 = r3
        L_0x000e:
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r1, r0)
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0122
            X.D48 r4 = r2.A08
            X.DUU r0 = r4.A0L
            if (r0 == 0) goto L_0x010a
            X.ClE r9 = r2.A0d
            if (r9 == 0) goto L_0x00fc
            X.Cj6 r0 = r2.A0g
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x0058
            java.lang.Class<X.Cgr> r4 = X.C25496Cgr.class
            monitor-enter(r4)
            goto L_0x002e
        L_0x002b:
            X.DUU r0 = r15.A0L
            goto L_0x000e
        L_0x002e:
            X.Cgr r5 = X.C25496Cgr.A01     // Catch:{ all -> 0x0055 }
            monitor-exit(r4)
            X.D48 r0 = r2.A08
            X.DUU r4 = r0.A0L
            monitor-enter(r5)
            android.util.LruCache r0 = r5.A00     // Catch:{ all -> 0x0052 }
            r6 = 0
            if (r0 == 0) goto L_0x004b
            java.util.UUID r0 = X.C24736CHy.A04     // Catch:{ all -> 0x0052 }
            X.D3w r4 = X.C25744ClE.A00(r4, r0)     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x004b
            android.util.LruCache r0 = r5.A00     // Catch:{ all -> 0x0052 }
            java.lang.Object r6 = r0.get(r4)     // Catch:{ all -> 0x0052 }
            X.E8V r6 = (X.E8V) r6     // Catch:{ all -> 0x0052 }
        L_0x004b:
            monitor-exit(r5)
            if (r6 == 0) goto L_0x0058
            r2.A0B = r6
            goto L_0x011b
        L_0x0052:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0055:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0058:
            android.os.Looper r7 = android.os.Looper.myLooper()
            X.D48 r0 = r2.A08
            X.DUU r6 = r0.A0L
            android.os.Looper r4 = r9.A00
            r5 = 0
            if (r4 == 0) goto L_0x0068
            r0 = 0
            if (r4 != r7) goto L_0x0069
        L_0x0068:
            r0 = 1
        L_0x0069:
            X.C26056CrS.A03(r0)
            java.util.List r4 = r9.A06
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0081
            r9.A00 = r7
            X.BFx r0 = r9.A09
            if (r0 != 0) goto L_0x0081
            X.BFx r0 = new X.BFx
            r0.<init>(r7, r9)
            r9.A09 = r0
        L_0x0081:
            java.util.UUID r13 = r9.A07
            X.D3w r0 = X.C25744ClE.A00(r6, r13)
            if (r0 != 0) goto L_0x00a6
            X.C1J r5 = new X.C1J
            r5.<init>(r13)
            X.CIw r0 = r9.A02
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A00
            java.util.Iterator r4 = r0.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x010d
            r4.next()
            java.lang.String r0 = "listener"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00a6:
            byte[] r14 = r0.A04
            java.lang.String r12 = r0.A02
            int r6 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 26
            if (r6 >= r0) goto L_0x00ca
            java.util.UUID r0 = X.C24736CHy.A00
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00c8
            java.lang.String r0 = "audio/mp4"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00ca
        L_0x00c8:
            java.lang.String r12 = "cenc"
        L_0x00ca:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00d8
            java.lang.Object r6 = r4.get(r5)
            X.D8s r6 = (X.C26669D8s) r6
            if (r6 != 0) goto L_0x00e6
        L_0x00d8:
            X.CnE r10 = r9.A03
            X.CSV r11 = r9.A04
            X.CIw r8 = r9.A02
            X.D8s r6 = new X.D8s
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r4.add(r6)
        L_0x00e6:
            int r0 = r6.A00
            int r0 = r0 + 1
            r6.A00 = r0
            if (r0 != r1) goto L_0x0119
            int r0 = r6.A01
            if (r0 == r1) goto L_0x0119
            boolean r0 = X.C26669D8s.A04(r6, r1)
            if (r0 == 0) goto L_0x0119
            X.C26669D8s.A03(r6, r1)
            goto L_0x0119
        L_0x00fc:
            java.lang.String r0 = "Media requires a DrmSessionManager"
            X.C2n r1 = new X.C2n
            r1.<init>(r0)
            r0 = 4005(0xfa5, float:5.612E-42)
            X.BOK r0 = r2.A0D(r4, r1, r0)
            throw r0
        L_0x010a:
            r2.A0B = r3
            goto L_0x0122
        L_0x010d:
            r4 = 6003(0x1773, float:8.412E-42)
            X.BxB r0 = new X.BxB
            r0.<init>(r4, r5)
            X.D8r r6 = new X.D8r
            r6.<init>(r0)
        L_0x0119:
            r2.A0B = r6
        L_0x011b:
            X.E8V r0 = r2.A0A
            if (r6 != r0) goto L_0x0122
            r9.A02(r6)
        L_0x0122:
            X.E8V r4 = r2.A0B
            X.E8V r0 = r2.A0A
            if (r4 != r0) goto L_0x0295
            X.EAe r0 = r2.A0C
            if (r0 == 0) goto L_0x0295
            X.Csn r8 = r2.A0D
            X.D48 r7 = r2.A08
            boolean r0 = r2 instanceof X.C22773BOm
            if (r0 == 0) goto L_0x019e
            r6 = r2
            X.BOm r6 = (X.C22773BOm) r6
            X.D48 r5 = r6.A08
            if (r5 == 0) goto L_0x015a
            boolean r0 = r6.A0R
            if (r0 == 0) goto L_0x015a
            java.lang.String r4 = "video/av01"
            java.lang.String r0 = r5.A0S
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x015a
            java.lang.String r4 = r15.A0S
            java.lang.String r0 = r7.A0S
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x015a
            int r4 = r15.A0E
            int r0 = r7.A0E
            if (r4 != r0) goto L_0x015a
        L_0x0159:
            return
        L_0x015a:
            boolean r0 = r8.A03
            boolean r0 = X.C22773BOm.A06(r15, r7, r0)
            if (r0 == 0) goto L_0x0295
            int r4 = r7.A0I
            X.CPH r5 = r6.A0P
            int r0 = r5.A02
            if (r4 > r0) goto L_0x0295
            int r4 = r7.A09
            int r0 = r5.A00
            if (r4 > r0) goto L_0x0295
            int r4 = X.C22773BOm.A00(r7)
            X.CPH r0 = r6.A0P
            int r0 = r0.A01
            if (r4 > r0) goto L_0x0295
            boolean r0 = r15.A01(r7)
            if (r0 != 0) goto L_0x0159
            r2.A0Y = r1
            r2.A01 = r1
            int r3 = r2.A00
            r0 = 2
            if (r3 == r0) goto L_0x0199
            if (r3 != r1) goto L_0x019c
            X.D48 r4 = r2.A08
            int r3 = r4.A0I
            int r0 = r15.A0I
            if (r3 != r0) goto L_0x019c
            int r3 = r4.A09
            int r0 = r15.A09
            if (r3 != r0) goto L_0x019c
        L_0x0199:
            r2.A0H = r1
            return
        L_0x019c:
            r1 = 0
            goto L_0x0199
        L_0x019e:
            r5 = r2
            X.BOn r5 = (X.C22774BOn) r5
            X.Cj6 r0 = r5.A0g
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x0295
            int r4 = X.C22774BOn.A00(r7, r5, r8)
            int r0 = r5.A00
            if (r4 > r0) goto L_0x0295
            java.lang.String r4 = r15.A0S
            java.lang.String r0 = r7.A0S
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r4, r0)
            r6 = 0
            if (r0 != 0) goto L_0x01bc
            r6 = 8
        L_0x01bc:
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x0233
            int r4 = r15.A0E
            int r0 = r7.A0E
            if (r4 == r0) goto L_0x01c8
            r6 = r6 | 1024(0x400, float:1.435E-42)
        L_0x01c8:
            boolean r0 = r8.A03
            if (r0 != 0) goto L_0x01da
            int r4 = r15.A0I
            int r0 = r7.A0I
            if (r4 != r0) goto L_0x01d8
            int r4 = r15.A09
            int r0 = r7.A09
            if (r4 == r0) goto L_0x01da
        L_0x01d8:
            r6 = r6 | 512(0x200, float:7.175E-43)
        L_0x01da:
            X.D3h r4 = r15.A0N
            X.D3h r0 = r7.A0N
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r4, r0)
            if (r0 != 0) goto L_0x01e6
            r6 = r6 | 2048(0x800, float:2.87E-42)
        L_0x01e6:
            java.lang.String r4 = r8.A02
            java.lang.String r5 = com.facebook.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "SM-T230"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L_0x0202
            java.lang.String r0 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0202
            boolean r0 = r15.A01(r7)
            if (r0 != 0) goto L_0x0202
            r6 = r6 | 2
        L_0x0202:
            if (r6 != 0) goto L_0x028f
            boolean r0 = r15.A01(r7)
            r18 = 2
            if (r0 == 0) goto L_0x020e
        L_0x020c:
            r18 = 3
        L_0x020e:
            r6 = 0
        L_0x020f:
            X.CYz r14 = new X.CYz
            r16 = r7
            r17 = r4
            r19 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            int r4 = r14.A01
            r0 = 2
            if (r4 == r0) goto L_0x0222
            r0 = 3
            if (r4 != r0) goto L_0x0295
        L_0x0222:
            int r0 = r15.A07
            if (r0 != 0) goto L_0x0295
            int r0 = r15.A08
            if (r0 != 0) goto L_0x0295
            int r0 = r7.A07
            if (r0 != 0) goto L_0x0295
            int r0 = r7.A08
            if (r0 != 0) goto L_0x0295
            return
        L_0x0233:
            int r4 = r15.A05
            int r0 = r7.A05
            if (r4 == r0) goto L_0x023b
            r6 = r6 | 4096(0x1000, float:5.74E-42)
        L_0x023b:
            int r4 = r15.A0F
            int r0 = r7.A0F
            if (r4 == r0) goto L_0x0243
            r6 = r6 | 8192(0x2000, float:1.14794E-41)
        L_0x0243:
            int r4 = r15.A0B
            int r0 = r7.A0B
            if (r4 == r0) goto L_0x024b
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
        L_0x024b:
            if (r6 != 0) goto L_0x0274
            java.lang.String r4 = "audio/mp4a-latm"
            java.lang.String r0 = r8.A01
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0274
            android.util.Pair r4 = X.C26283Cwe.A00(r15)
            android.util.Pair r0 = X.C26283Cwe.A00(r7)
            if (r4 == 0) goto L_0x0274
            if (r0 == 0) goto L_0x0274
            int r5 = X.C108965cb.A01(r4)
            int r4 = X.C108965cb.A01(r0)
            r0 = 42
            if (r5 != r0) goto L_0x0274
            if (r4 != r0) goto L_0x0274
            java.lang.String r4 = r8.A02
            goto L_0x020c
        L_0x0274:
            boolean r0 = r15.A01(r7)
            if (r0 != 0) goto L_0x027c
            r6 = r6 | 32
        L_0x027c:
            java.lang.String r4 = r8.A01
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0288
            r6 = r6 | 2
        L_0x0288:
            if (r6 != 0) goto L_0x028f
            java.lang.String r4 = r8.A02
            r18 = 1
            goto L_0x020e
        L_0x028f:
            java.lang.String r4 = r8.A02
            r18 = 0
            goto L_0x020f
        L_0x0295:
            r2.A0G = r3
            boolean r0 = r2.A0K
            if (r0 == 0) goto L_0x029e
            r2.A02 = r1
            return
        L_0x029e:
            r2.A0O()
            r2.A0P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22775BOo.A0R(X.D48):void");
    }

    public boolean Bed() {
        if (!(this instanceof C22774BOn)) {
            return this.A0N;
        }
        C22774BOn bOn = (C22774BOn) this;
        if (!bOn.A0N) {
            return false;
        }
        DefaultAudioSink defaultAudioSink = bOn.A0F;
        if (defaultAudioSink.A0B == null) {
            return true;
        }
        if (!defaultAudioSink.A0M || defaultAudioSink.A0F()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bg8() {
        /*
            r5 = this;
            X.D48 r0 = r5.A08
            if (r0 != 0) goto L_0x003d
            java.lang.Integer r0 = X.AnonymousClass00R.A01
        L_0x0006:
            r5.A07 = r0
        L_0x0008:
            X.D48 r0 = r5.A08
            if (r0 == 0) goto L_0x005f
            boolean r0 = r5.A0T
            if (r0 != 0) goto L_0x005f
            boolean r0 = r5.Bco()
            if (r0 == 0) goto L_0x0033
            boolean r0 = r5.A08
        L_0x0018:
            if (r0 != 0) goto L_0x0031
            int r0 = r5.A04
            if (r0 >= 0) goto L_0x0031
            long r3 = r5.A0U
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005f
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
        L_0x0031:
            r0 = 1
            return r0
        L_0x0033:
            X.E90 r0 = r5.A06
            X.C26056CrS.A01(r0)
            boolean r0 = r0.Bg8()
            goto L_0x0018
        L_0x003d:
            boolean r0 = r5.A0T
            if (r0 == 0) goto L_0x0044
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x0006
        L_0x0044:
            boolean r0 = r5.Bco()
            if (r0 == 0) goto L_0x0055
            boolean r0 = r5.A08
        L_0x004c:
            if (r0 != 0) goto L_0x0008
            int r0 = r5.A04
            if (r0 >= 0) goto L_0x0008
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            goto L_0x0006
        L_0x0055:
            X.E90 r0 = r5.A06
            X.C26056CrS.A01(r0)
            boolean r0 = r0.Bg8()
            goto L_0x004c
        L_0x005f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22775BOo.Bg8():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c2, code lost:
        if (r1.A0N != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c4, code lost:
        A0O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0235, code lost:
        A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02f3, code lost:
        if (r1.A01 != 2) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02f5, code lost:
        r9.clear();
        r1.A01 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02fa, code lost:
        r1.A0M = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02fe, code lost:
        if (r1.A0K != false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0300, code lost:
        A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0307, code lost:
        if (r1.A0J != false) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0309, code lost:
        r1.A0L = true;
        r1.A0C.CDD(r1.A03, 0, 0, 4);
        A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x04c9, code lost:
        if (r11 != false) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0182, code lost:
        if (r1.A0J == false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0186, code lost:
        if (r1.A0M != false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018b, code lost:
        if (r1.A02 != 2) goto L_0x0238;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x01bd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:268:0x04c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CF7(long r28, long r30) {
        /*
            r27 = this;
            r4 = r28
            r1 = r27
            boolean r0 = r1.A0N
            if (r0 == 0) goto L_0x000c
            r1.A0M()
        L_0x000b:
            return
        L_0x000c:
            X.D48 r0 = r1.A08
            r8 = 1
            r9 = -4
            r10 = -5
            if (r0 != 0) goto L_0x0026
            X.BOc r3 = r1.A0l
            r3.clear()
            X.CIt r2 = r1.A0b
            r0 = 2
            int r0 = r1.A0C(r2, r3, r0)
            if (r0 != r10) goto L_0x002e
            X.D48 r0 = r2.A00
            r1.A0R(r0)
        L_0x0026:
            r1.A0P()
            X.EAe r0 = r1.A0C
            if (r0 == 0) goto L_0x04dd
            goto L_0x0042
        L_0x002e:
            if (r0 != r9) goto L_0x000b
            r2 = 4
            int r0 = r3.A00
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1T(r0, r2)
            X.C26056CrS.A03(r0)
            r1.A0M = r8
            r1.A08()
            return
        L_0x0042:
            java.lang.String r0 = "drainAndFeed"
            X.C25304Cd8.A01(r0)     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0047:
            int r0 = r1.A04     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 >= 0) goto L_0x0191
            r11 = 0
            boolean r0 = r1.A0I     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 == 0) goto L_0x005d
            boolean r0 = r1.A0L     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 == 0) goto L_0x005d
            X.EAe r0 = r1.A0C     // Catch:{ IllegalStateException -> 0x01bd }
            android.media.MediaCodec$BufferInfo r6 = r1.A0a     // Catch:{ IllegalStateException -> 0x01bd }
            int r2 = r0.BIT(r6)     // Catch:{ IllegalStateException -> 0x01bd }
            goto L_0x0065
        L_0x005d:
            X.EAe r0 = r1.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            android.media.MediaCodec$BufferInfo r6 = r1.A0a     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r0.BIT(r6)     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0065:
            if (r2 < 0) goto L_0x0073
            boolean r0 = r1.A0O     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 == 0) goto L_0x022b
            r1.A0O = r11     // Catch:{ IllegalStateException -> 0x0497 }
            X.EAe r0 = r1.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            r0.CEK(r2)     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0047
        L_0x0073:
            r0 = -2
            if (r2 != r0) goto L_0x017d
            X.EAe r0 = r1.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            android.media.MediaFormat r12 = r0.BVu()     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r1.A00     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = "width"
            int r0 = r12.getInteger(r0)     // Catch:{ IllegalStateException -> 0x0497 }
            r2 = 32
            if (r0 != r2) goto L_0x0095
            java.lang.String r0 = "height"
            int r0 = r12.getInteger(r0)     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 != r2) goto L_0x0095
            r1.A0O = r8     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0047
        L_0x0095:
            X.EAe r7 = r1.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r0 = r1 instanceof X.C22773BOm     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 == 0) goto L_0x010d
            r9 = r1
            X.BOm r9 = (X.C22773BOm) r9     // Catch:{ IllegalStateException -> 0x0497 }
            r9.A0M = r12     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.String r2 = "crop-right"
            boolean r0 = r12.containsKey(r2)     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.String r6 = "crop-top"
            java.lang.String r3 = "crop-bottom"
            java.lang.String r13 = "crop-left"
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r12.containsKey(r13)     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r12.containsKey(r3)     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r12.containsKey(r6)     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 == 0) goto L_0x00cf
            r11 = 1
            int r2 = r12.getInteger(r2)     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r12.getInteger(r13)     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r2 - r0
            int r0 = r2 + 1
        L_0x00cc:
            r9.A05 = r0     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x00d6
        L_0x00cf:
            java.lang.String r0 = "width"
            int r0 = r12.getInteger(r0)     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x00cc
        L_0x00d6:
            if (r11 == 0) goto L_0x00d9
            goto L_0x00e0
        L_0x00d9:
            java.lang.String r0 = "height"
            int r6 = r12.getInteger(r0)     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x00eb
        L_0x00e0:
            int r2 = r12.getInteger(r3)     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r12.getInteger(r6)     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r2 - r0
            int r6 = r2 + 1
        L_0x00eb:
            r9.A04 = r6     // Catch:{ IllegalStateException -> 0x0497 }
            float r3 = r9.A01     // Catch:{ IllegalStateException -> 0x0497 }
            r9.A00 = r3     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r9.A0A     // Catch:{ IllegalStateException -> 0x0497 }
            r0 = 90
            if (r2 == r0) goto L_0x00fb
            r0 = 270(0x10e, float:3.78E-43)
            if (r2 != r0) goto L_0x0106
        L_0x00fb:
            int r0 = r9.A05     // Catch:{ IllegalStateException -> 0x0497 }
            r9.A05 = r6     // Catch:{ IllegalStateException -> 0x0497 }
            r9.A04 = r0     // Catch:{ IllegalStateException -> 0x0497 }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r3
            r9.A00 = r0     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0106:
            int r0 = r9.A0E     // Catch:{ IllegalStateException -> 0x0497 }
            r7.CLO(r0)     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0047
        L_0x010d:
            r6 = r1
            X.BOn r6 = (X.C22774BOn) r6     // Catch:{ IllegalStateException -> 0x0497 }
            android.media.MediaFormat r2 = r6.A07     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 == 0) goto L_0x0134
            java.lang.String r0 = "mime"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ IllegalStateException -> 0x0497 }
            int r13 = X.C26233CvQ.A00(r0)     // Catch:{ IllegalStateException -> 0x0497 }
            android.media.MediaFormat r0 = r6.A07     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0120:
            java.lang.String r11 = "channel-count"
            int r2 = r0.getInteger(r11)     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.String r9 = "sample-rate"
            int r0 = r0.getInteger(r9)     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r0 * r2
            r6.A03 = r0     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r0 = r6.A0B     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 == 0) goto L_0x0159
            goto L_0x0146
        L_0x0134:
            X.D48 r3 = r6.A08     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.String r2 = "audio/raw"
            java.lang.String r0 = r3.A0S     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 == 0) goto L_0x0143
            int r13 = r3.A0B     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0144
        L_0x0143:
            r13 = 2
        L_0x0144:
            r0 = r12
            goto L_0x0120
        L_0x0146:
            r3 = 6
            if (r2 != r3) goto L_0x0159
            X.D48 r0 = r6.A08     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r0.A05     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 >= r3) goto L_0x0159
            int[] r7 = new int[r2]     // Catch:{ IllegalStateException -> 0x0497 }
            r0 = 0
        L_0x0152:
            if (r0 >= r2) goto L_0x015a
            r7[r0] = r0     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r0 + 1
            goto L_0x0152
        L_0x0159:
            r7 = 0
        L_0x015a:
            X.CkX r3 = new X.CkX     // Catch:{ IllegalStateException -> 0x0497 }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.String r0 = "audio/raw"
            r3.A0R = r0     // Catch:{ IllegalStateException -> 0x0497 }
            r3.A0A = r13     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r12.getInteger(r11)     // Catch:{ IllegalStateException -> 0x0497 }
            r3.A04 = r0     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r12.getInteger(r9)     // Catch:{ IllegalStateException -> 0x0497 }
            r3.A0E = r0     // Catch:{ IllegalStateException -> 0x0497 }
            X.D48 r2 = new X.D48     // Catch:{ IllegalStateException -> 0x0497 }
            r2.<init>(r3)     // Catch:{ IllegalStateException -> 0x0497 }
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r0 = r6.A0F     // Catch:{ C2J -> 0x0467 }
            r0.A0D(r2, r7)     // Catch:{ C2J -> 0x0467 }
            goto L_0x0047
        L_0x017d:
            r0 = -3
            if (r2 == r0) goto L_0x0047
            boolean r0 = r1.A0J     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 == 0) goto L_0x0238
            boolean r0 = r1.A0M     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 != 0) goto L_0x0235
            int r2 = r1.A02     // Catch:{ IllegalStateException -> 0x0497 }
            r0 = 2
            if (r2 != r0) goto L_0x0238
            goto L_0x0235
        L_0x018f:
            r1.A0P = r0     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0191:
            boolean r0 = r1.A0I     // Catch:{ IllegalStateException -> 0x0497 }
            r22 = r30
            if (r0 == 0) goto L_0x01c8
            boolean r0 = r1.A0L     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 == 0) goto L_0x01c8
            X.EAe r11 = r1.A0C     // Catch:{ IllegalStateException -> 0x01bd }
            java.nio.ByteBuffer r9 = r1.A0F     // Catch:{ IllegalStateException -> 0x01bd }
            int r7 = r1.A04     // Catch:{ IllegalStateException -> 0x01bd }
            android.media.MediaCodec$BufferInfo r14 = r1.A0a     // Catch:{ IllegalStateException -> 0x01bd }
            int r6 = r14.flags     // Catch:{ IllegalStateException -> 0x01bd }
            long r2 = r14.presentationTimeUs     // Catch:{ IllegalStateException -> 0x01bd }
            boolean r0 = r1.A0P     // Catch:{ IllegalStateException -> 0x01bd }
            r17 = r9
            r18 = r7
            r19 = r6
            r20 = r4
            r24 = r2
            r26 = r0
            r15 = r1
            r16 = r11
            boolean r0 = r15.A0S(r16, r17, r18, r19, r20, r22, r24, r26)     // Catch:{ IllegalStateException -> 0x01bd }
            goto L_0x01e9
        L_0x01bd:
            r1.A08()     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r0 = r1.A0N     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 == 0) goto L_0x0238
            r1.A0O()     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0238
        L_0x01c8:
            X.EAe r11 = r1.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            java.nio.ByteBuffer r9 = r1.A0F     // Catch:{ IllegalStateException -> 0x0497 }
            int r7 = r1.A04     // Catch:{ IllegalStateException -> 0x0497 }
            android.media.MediaCodec$BufferInfo r14 = r1.A0a     // Catch:{ IllegalStateException -> 0x0497 }
            int r6 = r14.flags     // Catch:{ IllegalStateException -> 0x0497 }
            long r2 = r14.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r0 = r1.A0P     // Catch:{ IllegalStateException -> 0x0497 }
            r17 = r9
            r18 = r7
            r19 = r6
            r20 = r4
            r24 = r2
            r26 = r0
            r15 = r1
            r16 = r11
            boolean r0 = r15.A0S(r16, r17, r18, r19, r20, r22, r24, r26)     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x01e9:
            if (r0 == 0) goto L_0x0238
            long r2 = r14.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r0 = r1 instanceof X.C22773BOm     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 == 0) goto L_0x0219
            r13 = r1
            X.BOm r13 = (X.C22773BOm) r13     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r13.A03     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r0 - r8
            r13.A03 = r0     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x01f9:
            int r15 = r13.A09     // Catch:{ IllegalStateException -> 0x0497 }
            if (r15 == 0) goto L_0x0219
            long[] r12 = r13.A0n     // Catch:{ IllegalStateException -> 0x0497 }
            r11 = 0
            r6 = r12[r11]     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0219
            long[] r9 = r13.A0m     // Catch:{ IllegalStateException -> 0x0497 }
            r6 = r9[r11]     // Catch:{ IllegalStateException -> 0x0497 }
            r13.A0L = r6     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r15 + -1
            r13.A09 = r0     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.System.arraycopy(r9, r8, r9, r11, r0)     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r13.A09     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.System.arraycopy(r12, r8, r12, r11, r0)     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x01f9
        L_0x0219:
            int r0 = r14.flags     // Catch:{ IllegalStateException -> 0x0497 }
            r0 = r0 & 4
            boolean r2 = X.AnonymousClass000.A1O(r0)
            r0 = -1
            r1.A04 = r0     // Catch:{ IllegalStateException -> 0x0497 }
            r0 = 0
            r1.A0F = r0     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 != 0) goto L_0x0235
            goto L_0x0047
        L_0x022b:
            int r0 = r6.size     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 != 0) goto L_0x0426
            int r0 = r6.flags     // Catch:{ IllegalStateException -> 0x0497 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0426
        L_0x0235:
            r1.A08()     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0238:
            X.EAe r4 = r1.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            r0 = 0
            if (r4 == 0) goto L_0x027a
            int r2 = r1.A02     // Catch:{ IllegalStateException -> 0x0497 }
            r3 = 2
            if (r2 == r3) goto L_0x027a
            boolean r2 = r1.A0M     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 != 0) goto L_0x027a
            int r2 = r1.A03     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 >= 0) goto L_0x025f
            int r5 = r4.BIQ()     // Catch:{ IllegalStateException -> 0x0497 }
            r1.A03 = r5     // Catch:{ IllegalStateException -> 0x0497 }
            if (r5 < 0) goto L_0x027a
            X.BOc r4 = r1.A0c     // Catch:{ IllegalStateException -> 0x0497 }
            X.EAe r2 = r1.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            java.nio.ByteBuffer r2 = r2.BT3(r5)     // Catch:{ IllegalStateException -> 0x0497 }
            r4.A01 = r2     // Catch:{ IllegalStateException -> 0x0497 }
            r4.clear()     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x025f:
            int r2 = r1.A02     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 != r8) goto L_0x0283
            boolean r2 = r1.A0J     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 != 0) goto L_0x0278
            r1.A0L = r8     // Catch:{ IllegalStateException -> 0x0497 }
            X.EAe r4 = r1.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r1.A03     // Catch:{ IllegalStateException -> 0x0497 }
            r7 = 0
            r9 = 4
            r5 = r2
            r6 = r0
            r4.CDD(r5, r6, r7, r9)     // Catch:{ IllegalStateException -> 0x0497 }
            r1.A09()     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0278:
            r1.A02 = r3     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x027a:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.A05 = r2     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x04cb
        L_0x0283:
            boolean r2 = r1.A0H     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 == 0) goto L_0x02a4
            r1.A0H = r0     // Catch:{ IllegalStateException -> 0x0497 }
            X.BOc r2 = r1.A0c     // Catch:{ IllegalStateException -> 0x0497 }
            java.nio.ByteBuffer r3 = r2.A01     // Catch:{ IllegalStateException -> 0x0497 }
            byte[] r2 = A0m     // Catch:{ IllegalStateException -> 0x0497 }
            r3.put(r2)     // Catch:{ IllegalStateException -> 0x0497 }
            X.EAe r2 = r1.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            int r3 = r1.A03     // Catch:{ IllegalStateException -> 0x0497 }
            r4 = 38
            r5 = 0
            r7 = r0
            r2.CDD(r3, r4, r5, r7)     // Catch:{ IllegalStateException -> 0x0497 }
            r1.A09()     // Catch:{ IllegalStateException -> 0x0497 }
            r1.A0K = r8     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0238
        L_0x02a4:
            boolean r2 = r1.A0T     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 == 0) goto L_0x02aa
            r7 = 0
            goto L_0x02e4
        L_0x02aa:
            int r2 = r1.A01     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 != r8) goto L_0x02cf
            r5 = 0
        L_0x02af:
            X.D48 r2 = r1.A08     // Catch:{ IllegalStateException -> 0x0497 }
            java.util.List r2 = r2.A0T     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r2.size()     // Catch:{ IllegalStateException -> 0x0497 }
            if (r5 >= r2) goto L_0x02cd
            X.D48 r2 = r1.A08     // Catch:{ IllegalStateException -> 0x0497 }
            java.util.List r2 = r2.A0T     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.Object r4 = r2.get(r5)     // Catch:{ IllegalStateException -> 0x0497 }
            byte[] r4 = (byte[]) r4     // Catch:{ IllegalStateException -> 0x0497 }
            X.BOc r2 = r1.A0c     // Catch:{ IllegalStateException -> 0x0497 }
            java.nio.ByteBuffer r2 = r2.A01     // Catch:{ IllegalStateException -> 0x0497 }
            r2.put(r4)     // Catch:{ IllegalStateException -> 0x0497 }
            int r5 = r5 + 1
            goto L_0x02af
        L_0x02cd:
            r1.A01 = r3     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x02cf:
            X.BOc r6 = r1.A0c     // Catch:{ IllegalStateException -> 0x0497 }
            java.nio.ByteBuffer r2 = r6.A01     // Catch:{ IllegalStateException -> 0x0497 }
            int r7 = r2.position()     // Catch:{ IllegalStateException -> 0x0497 }
            X.CIt r5 = r1.A0b     // Catch:{ IllegalStateException -> 0x0497 }
            int r4 = r1.A0C(r5, r6, r0)     // Catch:{ IllegalStateException -> 0x0497 }
            r2 = -3
            if (r4 == r2) goto L_0x027a
            if (r4 != r10) goto L_0x02e4
            goto L_0x0379
        L_0x02e4:
            X.BOc r9 = r1.A0c     // Catch:{ IllegalStateException -> 0x0497 }
            r4 = 4
            int r2 = r9.A00     // Catch:{ IllegalStateException -> 0x0497 }
            r2 = r2 & 4
            boolean r2 = X.AnonymousClass000.A1T(r2, r4)     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 == 0) goto L_0x031c
            int r2 = r1.A01     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 != r3) goto L_0x02fa
            r9.clear()     // Catch:{ IllegalStateException -> 0x0497 }
            r1.A01 = r8     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x02fa:
            r1.A0M = r8     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r2 = r1.A0K     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 != 0) goto L_0x0305
            r1.A08()     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x027a
        L_0x0305:
            boolean r2 = r1.A0J     // Catch:{ CryptoException -> 0x0471 }
            if (r2 != 0) goto L_0x027a
            r1.A0L = r8     // Catch:{ CryptoException -> 0x0471 }
            X.EAe r3 = r1.A0C     // Catch:{ CryptoException -> 0x0471 }
            int r2 = r1.A03     // Catch:{ CryptoException -> 0x0471 }
            r6 = 0
            r8 = 4
            r4 = r2
            r5 = r0
            r3.CDD(r4, r5, r6, r8)     // Catch:{ CryptoException -> 0x0471 }
            r1.A09()     // Catch:{ CryptoException -> 0x0471 }
            goto L_0x027a
        L_0x031c:
            boolean r2 = r1.A0S     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 == 0) goto L_0x0335
            int r2 = r9.A00     // Catch:{ IllegalStateException -> 0x0497 }
            r2 = r2 & 1
            boolean r2 = X.AnonymousClass000.A1T(r2, r8)     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 != 0) goto L_0x0335
            r9.clear()     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r1.A01     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 != r3) goto L_0x0238
            r1.A01 = r8     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0238
        L_0x0335:
            r1.A0S = r0     // Catch:{ IllegalStateException -> 0x0497 }
            r3 = 1073741824(0x40000000, float:2.0)
            int r2 = r9.A00     // Catch:{ IllegalStateException -> 0x0497 }
            r2 = r2 & r3
            boolean r16 = X.AnonymousClass000.A1T(r2, r3)     // Catch:{ IllegalStateException -> 0x0497 }
            X.CPn r2 = r1.A0f     // Catch:{ IllegalStateException -> 0x0497 }
            boolean r2 = r2.A02     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 == 0) goto L_0x035d
            if (r16 == 0) goto L_0x035d
            X.CTs r2 = r9.A03     // Catch:{ IllegalStateException -> 0x0497 }
            if (r7 == 0) goto L_0x035d
            int[] r3 = r2.A06     // Catch:{ IllegalStateException -> 0x0497 }
            if (r3 != 0) goto L_0x0358
            int[] r3 = new int[r8]     // Catch:{ IllegalStateException -> 0x0497 }
            r2.A06 = r3     // Catch:{ IllegalStateException -> 0x0497 }
            android.media.MediaCodec$CryptoInfo r2 = r2.A08     // Catch:{ IllegalStateException -> 0x0497 }
            r2.numBytesOfClearData = r3     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0358:
            r2 = r3[r0]     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r2 + r7
            r3[r0] = r2     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x035d:
            X.E8V r5 = r1.A0A     // Catch:{ IllegalStateException -> 0x0497 }
            r4 = 0
            if (r5 == 0) goto L_0x0368
            if (r16 != 0) goto L_0x036b
            boolean r2 = r1.A0j     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 == 0) goto L_0x036b
        L_0x0368:
            r1.A0T = r4     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0376
        L_0x036b:
            int r3 = r5.BZa()     // Catch:{ IllegalStateException -> 0x0497 }
            if (r3 == r8) goto L_0x0481
            r2 = 4
            if (r3 == r2) goto L_0x0368
            r4 = 1
            goto L_0x0368
        L_0x0376:
            if (r4 != 0) goto L_0x027a
            goto L_0x0389
        L_0x0379:
            int r0 = r1.A01     // Catch:{ IllegalStateException -> 0x0497 }
            if (r0 != r3) goto L_0x0382
            r6.clear()     // Catch:{ IllegalStateException -> 0x0497 }
            r1.A01 = r8     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0382:
            X.D48 r0 = r5.A00     // Catch:{ IllegalStateException -> 0x0497 }
            r1.A0R(r0)     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0238
        L_0x0389:
            long r4 = r9.A00     // Catch:{ CryptoException -> 0x0471 }
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = r9.A00     // Catch:{ CryptoException -> 0x0471 }
            r2 = r2 & r3
            boolean r2 = X.AnonymousClass000.A1T(r2, r3)     // Catch:{ CryptoException -> 0x0471 }
            if (r2 == 0) goto L_0x039b
            java.util.List r2 = r1.A0h     // Catch:{ CryptoException -> 0x0471 }
            X.BE7.A1S(r2, r4)     // Catch:{ CryptoException -> 0x0471 }
        L_0x039b:
            long r2 = r1.A06     // Catch:{ CryptoException -> 0x0471 }
            long r2 = java.lang.Math.max(r2, r4)     // Catch:{ CryptoException -> 0x0471 }
            r1.A06 = r2     // Catch:{ CryptoException -> 0x0471 }
            java.nio.ByteBuffer r2 = r9.A01     // Catch:{ CryptoException -> 0x0471 }
            if (r2 == 0) goto L_0x03aa
            r2.flip()     // Catch:{ CryptoException -> 0x0471 }
        L_0x03aa:
            boolean r2 = r1 instanceof X.C22773BOm     // Catch:{ CryptoException -> 0x0471 }
            if (r2 == 0) goto L_0x03cf
            r11 = r1
            X.BOm r11 = (X.C22773BOm) r11     // Catch:{ CryptoException -> 0x0471 }
            int r2 = r11.A03     // Catch:{ CryptoException -> 0x0471 }
            int r2 = r2 + 1
            r11.A03 = r2     // Catch:{ CryptoException -> 0x0471 }
            long r6 = r9.A00     // Catch:{ CryptoException -> 0x0471 }
            long r2 = r11.A0I     // Catch:{ CryptoException -> 0x0471 }
            long r2 = java.lang.Math.max(r6, r2)     // Catch:{ CryptoException -> 0x0471 }
            r11.A0I = r2     // Catch:{ CryptoException -> 0x0471 }
            int r3 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ CryptoException -> 0x0471 }
            r2 = 23
            if (r3 >= r2) goto L_0x03f6
            boolean r2 = r11.A0Z     // Catch:{ CryptoException -> 0x0471 }
            if (r2 == 0) goto L_0x03f6
            r11.A0T()     // Catch:{ CryptoException -> 0x0471 }
            goto L_0x03f6
        L_0x03cf:
            r13 = r1
            X.BOn r13 = (X.C22774BOn) r13     // Catch:{ CryptoException -> 0x0471 }
            boolean r2 = r13.A09     // Catch:{ CryptoException -> 0x0471 }
            if (r2 == 0) goto L_0x03f6
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = r9.A00     // Catch:{ CryptoException -> 0x0471 }
            r2 = r2 & r3
            boolean r2 = X.AnonymousClass000.A1T(r2, r3)     // Catch:{ CryptoException -> 0x0471 }
            if (r2 != 0) goto L_0x03f6
            long r6 = r9.A00     // Catch:{ CryptoException -> 0x0471 }
            long r2 = r13.A04     // Catch:{ CryptoException -> 0x0471 }
            long r11 = r6 - r2
            long r14 = java.lang.Math.abs(r11)     // Catch:{ CryptoException -> 0x0471 }
            r11 = 500000(0x7a120, double:2.47033E-318)
            int r2 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x03f4
            r13.A04 = r6     // Catch:{ CryptoException -> 0x0471 }
        L_0x03f4:
            r13.A09 = r0     // Catch:{ CryptoException -> 0x0471 }
        L_0x03f6:
            if (r16 == 0) goto L_0x03f9
            goto L_0x040c
        L_0x03f9:
            X.EAe r6 = r1.A0C     // Catch:{ CryptoException -> 0x0471 }
            int r3 = r1.A03     // Catch:{ CryptoException -> 0x0471 }
            java.nio.ByteBuffer r2 = r9.A01     // Catch:{ CryptoException -> 0x0471 }
            int r13 = r2.limit()     // Catch:{ CryptoException -> 0x0471 }
            r11 = r6
            r12 = r3
            r14 = r4
            r16 = r0
            r11.CDD(r12, r13, r14, r16)     // Catch:{ CryptoException -> 0x0471 }
            goto L_0x0415
        L_0x040c:
            X.EAe r6 = r1.A0C     // Catch:{ CryptoException -> 0x0471 }
            int r3 = r1.A03     // Catch:{ CryptoException -> 0x0471 }
            X.CTs r2 = r9.A03     // Catch:{ CryptoException -> 0x0471 }
            r6.CDE(r2, r3, r4)     // Catch:{ CryptoException -> 0x0471 }
        L_0x0415:
            r1.A09()     // Catch:{ CryptoException -> 0x0471 }
            r1.A0K = r8     // Catch:{ CryptoException -> 0x0471 }
            r1.A01 = r0     // Catch:{ CryptoException -> 0x0471 }
            X.CU1 r2 = r1.A09     // Catch:{ CryptoException -> 0x0471 }
            int r0 = r2.A06     // Catch:{ CryptoException -> 0x0471 }
            int r0 = r0 + 1
            r2.A06 = r0     // Catch:{ CryptoException -> 0x0471 }
            goto L_0x0238
        L_0x0426:
            r1.A04 = r2     // Catch:{ IllegalStateException -> 0x0497 }
            X.EAe r0 = r1.A0C     // Catch:{ IllegalStateException -> 0x0497 }
            java.nio.ByteBuffer r2 = r0.BVs(r2)     // Catch:{ IllegalStateException -> 0x0497 }
            r1.A0F = r2     // Catch:{ IllegalStateException -> 0x0497 }
            if (r2 == 0) goto L_0x0441
            int r0 = r6.offset     // Catch:{ IllegalStateException -> 0x0497 }
            r2.position(r0)     // Catch:{ IllegalStateException -> 0x0497 }
            java.nio.ByteBuffer r3 = r1.A0F     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r6.offset     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r6.size     // Catch:{ IllegalStateException -> 0x0497 }
            int r2 = r2 + r0
            r3.limit(r2)     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0441:
            long r2 = r6.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0497 }
            java.util.List r12 = r1.A0h     // Catch:{ IllegalStateException -> 0x0497 }
            int r11 = r12.size()     // Catch:{ IllegalStateException -> 0x0497 }
            r9 = 0
        L_0x044a:
            if (r9 >= r11) goto L_0x0464
            java.lang.Object r0 = r12.get(r9)     // Catch:{ IllegalStateException -> 0x0497 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ IllegalStateException -> 0x0497 }
            long r6 = r0.longValue()     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x045e
            r12.remove(r9)     // Catch:{ IllegalStateException -> 0x0497 }
            goto L_0x0461
        L_0x045e:
            int r9 = r9 + 1
            goto L_0x044a
        L_0x0461:
            r0 = 1
            goto L_0x018f
        L_0x0464:
            r0 = 0
            goto L_0x018f
        L_0x0467:
            r3 = move-exception
            X.D48 r2 = r6.A08     // Catch:{ IllegalStateException -> 0x0497 }
            r0 = 5001(0x1389, float:7.008E-42)
            X.BOK r0 = r6.A0D(r2, r3, r0)     // Catch:{ IllegalStateException -> 0x0497 }
            throw r0     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0471:
            r3 = move-exception
            X.D48 r2 = r1.A08     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r3.getErrorCode()     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = com.facebook.android.exoplayer2.util.Util.A01(r0)     // Catch:{ IllegalStateException -> 0x0497 }
            X.BOK r0 = r1.A0D(r2, r3, r0)     // Catch:{ IllegalStateException -> 0x0497 }
            throw r0     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0481:
            X.BxB r4 = r5.BRM()     // Catch:{ IllegalStateException -> 0x0497 }
            X.C26056CrS.A01(r4)     // Catch:{ IllegalStateException -> 0x0497 }
            X.E8V r0 = r1.A0A     // Catch:{ IllegalStateException -> 0x0497 }
            X.BxB r3 = r0.BRM()     // Catch:{ IllegalStateException -> 0x0497 }
            X.D48 r2 = r1.A08     // Catch:{ IllegalStateException -> 0x0497 }
            int r0 = r4.errorCode     // Catch:{ IllegalStateException -> 0x0497 }
            X.BOK r0 = r1.A0D(r2, r3, r0)     // Catch:{ IllegalStateException -> 0x0497 }
            throw r0     // Catch:{ IllegalStateException -> 0x0497 }
        L_0x0497:
            r8 = move-exception
            int r2 = r1.A0Z     // Catch:{ all -> 0x04d8 }
            r11 = 0
            if (r2 <= 0) goto L_0x04cf
            long r6 = r1.A05     // Catch:{ all -> 0x04d8 }
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x04b1
            long r4 = X.AnonymousClass8BR.A04(r6)     // Catch:{ all -> 0x04d8 }
            long r2 = (long) r2     // Catch:{ all -> 0x04d8 }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x04b2
        L_0x04b1:
            r11 = 1
        L_0x04b2:
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x04c9
            java.lang.String r2 = "MediaCodecRenderer"
            java.lang.String r0 = "Dequeue failed, retry"
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x04d8 }
            r0 = 0
            r1.A0G = r0     // Catch:{ IllegalStateException -> 0x04c3 }
            r1.A0O()     // Catch:{ IllegalStateException -> 0x04c3 }
        L_0x04c3:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04d8 }
            r1.A05 = r2     // Catch:{ all -> 0x04d8 }
        L_0x04c9:
            if (r11 == 0) goto L_0x04cf
        L_0x04cb:
            X.C25304Cd8.A00()
            goto L_0x0504
        L_0x04cf:
            X.D48 r2 = r1.A08     // Catch:{ all -> 0x04d8 }
            r0 = 4003(0xfa3, float:5.61E-42)
            X.BOK r0 = r1.A0D(r2, r8, r0)     // Catch:{ all -> 0x04d8 }
            throw r0     // Catch:{ all -> 0x04d8 }
        L_0x04d8:
            r0 = move-exception
            X.C25304Cd8.A00()
            throw r0
        L_0x04dd:
            X.CU1 r7 = r1.A09
            int r6 = r7.A08
            X.E90 r0 = r1.A06
            X.C26056CrS.A01(r0)
            long r2 = r1.A03
            long r4 = r28 - r2
            int r0 = r0.CNQ(r4)
            int r6 = r6 + r0
            r7.A08 = r6
            X.BOc r3 = r1.A0l
            r3.clear()
            X.CIt r2 = r1.A0b
            r0 = 0
            int r0 = r1.A0C(r2, r3, r0)
            if (r0 != r10) goto L_0x0509
            X.D48 r0 = r2.A00
            r1.A0R(r0)
        L_0x0504:
            X.CU1 r0 = r1.A09
            monitor-enter(r0)
            monitor-exit(r0)
            return
        L_0x0509:
            if (r0 != r9) goto L_0x0504
            r2 = 4
            int r0 = r3.A00
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1T(r0, r2)
            X.C26056CrS.A03(r0)
            r1.A0M = r8
            r1.A08()
            goto L_0x0504
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22775BOo.CF7(long, long):void");
    }

    public final int COo(D48 d48) {
        try {
            return A0K(d48, this.A0e);
        } catch (C1L e) {
            throw A0D(d48, e, 4002);
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.CIt, java.lang.Object] */
    public C22775BOo(C25744ClE clE, EBU ebu, CPn cPn, C25626Cj6 cj6, int i, int i2, int i3, boolean z, boolean z2) {
        super(i);
        C26056CrS.A01(cj6);
        this.A0g = cj6;
        this.A0f = cPn;
        C26056CrS.A01(ebu);
        this.A0e = ebu;
        this.A0d = clE;
        this.A0j = z;
        this.A0i = z2;
        this.A0k = i2;
        this.A0Z = i3;
        this.A0c = new C22765BOc(0);
        this.A0l = new C22765BOc(0);
        this.A0b = new Object();
        this.A0h = AnonymousClass000.A13();
        this.A0a = new MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
        this.A06 = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if ((android.os.SystemClock.elapsedRealtime() - r1.A0K) < 500) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N() {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.A0U = r0
            r7.A09()
            r0 = -1
            r7.A04 = r0
            r0 = 0
            r7.A0F = r0
            r5 = 1
            r7.A0S = r5
            r6 = 0
            r7.A0T = r6
            r7.A0P = r6
            java.util.List r0 = r7.A0h
            r0.clear()
            r7.A0H = r6
            r7.A0O = r6
            boolean r0 = r7.A0X
            if (r0 == 0) goto L_0x0029
            boolean r0 = r7.A0L
            if (r0 != 0) goto L_0x0057
        L_0x0029:
            r1 = r7
            boolean r0 = r7 instanceof X.C22773BOm
            if (r0 == 0) goto L_0x0041
            X.BOm r1 = (X.C22773BOm) r1
            boolean r0 = r1.A0T
            if (r0 == 0) goto L_0x0041
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.A0K
            long r3 = r3 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0057
        L_0x0041:
            int r0 = r7.A02
            if (r0 != 0) goto L_0x0057
            X.EAe r0 = r7.A0C
            r0.flush()
            r7.A0K = r6
        L_0x004c:
            boolean r0 = r7.A0Y
            if (r0 == 0) goto L_0x0056
            X.D48 r0 = r7.A08
            if (r0 == 0) goto L_0x0056
            r7.A01 = r5
        L_0x0056:
            return
        L_0x0057:
            r7.A0O()
            r7.A0P()
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22775BOo.A0N():void");
    }

    public void A0O() {
        boolean z;
        this.A0U = -9223372036854775807L;
        this.A0V = -9223372036854775807L;
        this.A05 = -9223372036854775807L;
        A09();
        this.A04 = -1;
        this.A0F = null;
        this.A0T = false;
        this.A0P = false;
        this.A0h.clear();
        this.A0D = null;
        this.A0Y = false;
        this.A0K = false;
        this.A00 = 0;
        this.A0J = false;
        this.A0X = false;
        this.A0H = false;
        this.A0O = false;
        this.A0L = false;
        this.A01 = 0;
        this.A02 = 0;
        C28610EAe eAe = this.A0C;
        if (eAe != null) {
            this.A09.A02++;
            try {
                C26119Csh csh = C26119Csh.A04;
                if (this instanceof C22773BOm) {
                    z = true;
                } else {
                    z = false;
                }
                csh.A03(eAe, this.A0g, AnonymousClass00R.A01, this.A0W, z);
                this.A0C = null;
                E8V e8v = this.A0A;
                if (e8v != null && this.A0B != e8v) {
                    try {
                        this.A0d.A02(e8v);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                this.A0C = null;
                E8V e8v2 = this.A0A;
                if (!(e8v2 == null || this.A0B == e8v2)) {
                    this.A0d.A02(e8v2);
                }
                throw th;
            } finally {
                this.A0A = null;
                this.A0W = null;
            }
        }
    }
}
