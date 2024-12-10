package com.facebook.android.exoplayer2.audio;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.BE7;
import X.BE8;
import X.BEB;
import X.BOU;
import X.BOV;
import X.C17880vN;
import X.C17890vO;
import X.C24401C1w;
import X.C24402C1x;
import X.C24757CIu;
import X.C24758CIv;
import X.C25048CVc;
import X.C25615Civ;
import X.C25700CkV;
import X.C25717Ckn;
import X.C25720Ckq;
import X.C25732Cl2;
import X.C25771Cli;
import X.C26056CrS;
import X.C26663D8m;
import X.C27241DaL;
import X.C28616EAo;
import X.C28627EBa;
import X.C6D;
import X.CR2;
import X.CR3;
import X.CYX;
import X.E7N;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.google.common.base.Strings;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public final class DefaultAudioSink {
    public static AtomicInteger A0h = BE7.A0v();
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public AudioTrack A0B;
    public C25732Cl2 A0C;
    public C25720Ckq A0D;
    public E7N A0E;
    public C6D A0F;
    public C25615Civ A0G;
    public CR3 A0H;
    public CR3 A0I;
    public ByteBuffer A0J;
    public ByteBuffer A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public C28627EBa[] A0R;
    public ByteBuffer[] A0S;
    public C25615Civ A0T;
    public CYX A0U;
    public final C25771Cli A0V;
    public final C25700CkV A0W = new C25700CkV(new C24758CIv(this));
    public final BOU A0X;
    public final C28616EAo A0Y;
    public final CR2 A0Z;
    public final C25048CVc A0a;
    public final C25048CVc A0b;
    public final BOV A0c;
    public final C25717Ckn A0d;
    public final ArrayDeque A0e;
    public final C28627EBa[] A0f;
    public final C28627EBa[] A0g;

    public static int A00(long j) {
        int i = (int) j;
        if (AnonymousClass000.A1P((((long) i) > j ? 1 : (((long) i) == j ? 0 : -1)))) {
            return i;
        }
        Object[] A1a = AnonymousClass3MW.A1a();
        BE8.A1N(A1a, j);
        throw AnonymousClass000.A0k(Strings.A00("Out of range: %s", A1a));
    }

    /* JADX WARNING: type inference failed for: r15v12, types: [X.Ckw, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02e1, code lost:
        if (r5 == 11) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02e9, code lost:
        if (r5 != 11) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02ee, code lost:
        if (r5 != 8) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0352, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r9 == r1) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H(java.nio.ByteBuffer r30, long r31) {
        /*
            r29 = this;
            r8 = 1
            r7 = r29
            java.nio.ByteBuffer r1 = r7.A0J
            r17 = 0
            r9 = r30
            if (r1 == 0) goto L_0x000e
            r0 = 0
            if (r9 != r1) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C26056CrS.A02(r0)
            X.Civ r0 = r7.A0T
            r18 = 0
            r2 = r31
            if (r0 == 0) goto L_0x0074
            boolean r0 = r7.A09()
            if (r0 == 0) goto L_0x0509
            X.Civ r4 = r7.A0T
            X.Civ r5 = r7.A0G
            int r1 = r5.A04
            int r0 = r4.A04
            if (r1 != r0) goto L_0x0079
            int r1 = r5.A03
            int r0 = r4.A03
            if (r1 != r0) goto L_0x0079
            int r1 = r5.A06
            int r0 = r4.A06
            if (r1 != r0) goto L_0x0079
            int r1 = r5.A02
            int r0 = r4.A02
            if (r1 != r0) goto L_0x0079
            int r1 = r5.A05
            int r0 = r4.A05
            if (r1 != r0) goto L_0x0079
            r7.A0G = r4
            r0 = r18
            r7.A0T = r0
            android.media.AudioTrack r4 = r7.A0B
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 29
            if (r1 < r0) goto L_0x0071
            boolean r0 = r4.isOffloadedPlayback()
            if (r0 == 0) goto L_0x0071
            r1 = 3
            android.media.AudioTrack r0 = r7.A0B
            int r0 = r0.getPlayState()
            if (r0 != r1) goto L_0x0064
            android.media.AudioTrack r0 = r7.A0B
            r0.setOffloadEndOfStream()
        L_0x0064:
            android.media.AudioTrack r4 = r7.A0B
            X.Civ r0 = r7.A0G
            X.D48 r0 = r0.A07
            int r1 = r0.A07
            int r0 = r0.A08
            r4.setOffloadDelayPadding(r1, r0)
        L_0x0071:
            r7.A05(r2)
        L_0x0074:
            android.media.AudioTrack r0 = r7.A0B
            if (r0 != 0) goto L_0x0180
            goto L_0x0086
        L_0x0079:
            r7.A04()
            boolean r0 = r7.A0F()
            if (r0 != 0) goto L_0x0509
            r7.A0B()
            goto L_0x0071
        L_0x0086:
            X.Ckn r1 = r7.A0d     // Catch:{ C1w -> 0x0174 }
            monitor-enter(r1)     // Catch:{ C1w -> 0x0174 }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0171 }
            monitor-exit(r1)     // Catch:{ C1w -> 0x0174 }
            if (r0 == 0) goto L_0x0509
            boolean r0 = r7.A0L     // Catch:{ C1w -> 0x0174 }
            if (r0 == 0) goto L_0x00db
            X.Civ r0 = r7.A0G     // Catch:{ C1w -> 0x009c }
            X.C26056CrS.A01(r0)     // Catch:{ C1w -> 0x009c }
            android.media.AudioTrack r1 = r7.A02(r0)     // Catch:{ C1w -> 0x009c }
            goto L_0x00e1
        L_0x009c:
            r14 = move-exception
            X.Civ r0 = r7.A0G     // Catch:{ C1w -> 0x0174 }
            int r1 = r0.A00     // Catch:{ C1w -> 0x0174 }
            r15 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 <= r15) goto L_0x00da
            X.D48 r13 = r0.A07     // Catch:{ C1w -> 0x0174 }
            int r12 = r0.A01     // Catch:{ C1w -> 0x0174 }
            int r11 = r0.A04     // Catch:{ C1w -> 0x0174 }
            int r10 = r0.A05     // Catch:{ C1w -> 0x0174 }
            int r6 = r0.A06     // Catch:{ C1w -> 0x0174 }
            int r5 = r0.A02     // Catch:{ C1w -> 0x0174 }
            int r4 = r0.A03     // Catch:{ C1w -> 0x0174 }
            X.EBa[] r1 = r0.A08     // Catch:{ C1w -> 0x0174 }
            X.Civ r0 = new X.Civ     // Catch:{ C1w -> 0x0174 }
            r20 = r13
            r21 = r1
            r22 = r12
            r23 = r11
            r24 = r10
            r25 = r6
            r26 = r5
            r27 = r4
            r28 = r15
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ C1w -> 0x0174 }
            android.media.AudioTrack r1 = r7.A02(r0)     // Catch:{ C1w -> 0x00d6 }
            r7.A0G = r0     // Catch:{ C1w -> 0x00d6 }
            goto L_0x00e1
        L_0x00d6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r14, r0)     // Catch:{ C1w -> 0x0174 }
        L_0x00da:
            throw r14     // Catch:{ C1w -> 0x0174 }
        L_0x00db:
            X.Civ r0 = r7.A0G     // Catch:{ C1w -> 0x0174 }
            android.media.AudioTrack r1 = r7.A02(r0)     // Catch:{ C1w -> 0x0174 }
        L_0x00e1:
            r7.A0B = r1     // Catch:{ C1w -> 0x0174 }
            int r11 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ C1w -> 0x0174 }
            r0 = 29
            if (r11 < r0) goto L_0x0101
            boolean r0 = r1.isOffloadedPlayback()     // Catch:{ C1w -> 0x0174 }
            if (r0 == 0) goto L_0x0101
            android.media.AudioTrack r0 = r7.A0B     // Catch:{ C1w -> 0x0174 }
            r7.A07(r0)     // Catch:{ C1w -> 0x0174 }
            android.media.AudioTrack r4 = r7.A0B     // Catch:{ C1w -> 0x0174 }
            X.Civ r0 = r7.A0G     // Catch:{ C1w -> 0x0174 }
            X.D48 r0 = r0.A07     // Catch:{ C1w -> 0x0174 }
            int r1 = r0.A07     // Catch:{ C1w -> 0x0174 }
            int r0 = r0.A08     // Catch:{ C1w -> 0x0174 }
            r4.setOffloadDelayPadding(r1, r0)     // Catch:{ C1w -> 0x0174 }
        L_0x0101:
            android.media.AudioTrack r0 = r7.A0B     // Catch:{ C1w -> 0x0174 }
            int r0 = r0.getAudioSessionId()     // Catch:{ C1w -> 0x0174 }
            r7.A01 = r0     // Catch:{ C1w -> 0x0174 }
            X.CkV r12 = r7.A0W     // Catch:{ C1w -> 0x0174 }
            android.media.AudioTrack r5 = r7.A0B     // Catch:{ C1w -> 0x0174 }
            X.Civ r0 = r7.A0G     // Catch:{ C1w -> 0x0174 }
            int r4 = r0.A03     // Catch:{ C1w -> 0x0174 }
            int r10 = r0.A05     // Catch:{ C1w -> 0x0174 }
            int r1 = r0.A00     // Catch:{ C1w -> 0x0174 }
            r12.A0G = r5     // Catch:{ C1w -> 0x0174 }
            r12.A00 = r1     // Catch:{ C1w -> 0x0174 }
            X.CiX r0 = new X.CiX     // Catch:{ C1w -> 0x0174 }
            r0.<init>(r5)     // Catch:{ C1w -> 0x0174 }
            r12.A0H = r0     // Catch:{ C1w -> 0x0174 }
            int r6 = r5.getSampleRate()     // Catch:{ C1w -> 0x0174 }
            r12.A02 = r6     // Catch:{ C1w -> 0x0174 }
            r0 = 23
            if (r11 >= r0) goto L_0x0132
            r0 = 5
            if (r4 == r0) goto L_0x0130
            r0 = 6
            if (r4 != r0) goto L_0x0132
        L_0x0130:
            r0 = 1
            goto L_0x0133
        L_0x0132:
            r0 = 0
        L_0x0133:
            r12.A0L = r0     // Catch:{ C1w -> 0x0174 }
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0C(r4)     // Catch:{ C1w -> 0x0174 }
            r12.A0K = r0     // Catch:{ C1w -> 0x0174 }
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0143
            goto L_0x0149
        L_0x0143:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0151
        L_0x0149:
            int r1 = r1 / r10
            long r0 = (long) r1     // Catch:{ C1w -> 0x0174 }
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r10
            long r10 = (long) r6     // Catch:{ C1w -> 0x0174 }
            long r0 = r0 / r10
        L_0x0151:
            r12.A04 = r0     // Catch:{ C1w -> 0x0174 }
            r0 = 0
            r12.A09 = r0     // Catch:{ C1w -> 0x0174 }
            r12.A0C = r0     // Catch:{ C1w -> 0x0174 }
            r12.A0B = r0     // Catch:{ C1w -> 0x0174 }
            r6 = r17
            r12.A0J = r6     // Catch:{ C1w -> 0x0174 }
            r12.A0F = r4     // Catch:{ C1w -> 0x0174 }
            r12.A06 = r4     // Catch:{ C1w -> 0x0174 }
            r12.A0A = r0     // Catch:{ C1w -> 0x0174 }
            android.media.AudioTrack r1 = r7.A0B     // Catch:{ C1w -> 0x0174 }
            if (r1 == 0) goto L_0x016e
            float r0 = r7.A00     // Catch:{ C1w -> 0x0174 }
            r1.setVolume(r0)     // Catch:{ C1w -> 0x0174 }
        L_0x016e:
            r7.A0O = r8     // Catch:{ C1w -> 0x0174 }
            goto L_0x0180
        L_0x0171:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ C1w -> 0x0174 }
            throw r0     // Catch:{ C1w -> 0x0174 }
        L_0x0174:
            r1 = move-exception
            boolean r0 = r1.isRecoverable
            if (r0 != 0) goto L_0x017f
            X.CVc r0 = r7.A0a
            r0.A00(r1)
            return r17
        L_0x017f:
            throw r1
        L_0x0180:
            X.CVc r1 = r7.A0a
            r0 = r18
            r1.A00 = r0
            boolean r0 = r7.A0O
            r10 = 0
            if (r0 == 0) goto L_0x01b6
            long r0 = java.lang.Math.max(r10, r2)
            r7.A06 = r0
            r0 = r17
            r7.A0P = r0
            r7.A0O = r0
            r7.A05(r2)
            boolean r0 = r7.A0N
            if (r0 == 0) goto L_0x01b6
            r7.A0N = r8
            android.media.AudioTrack r0 = r7.A0B
            if (r0 == 0) goto L_0x01b6
            X.CkV r0 = r7.A0W
            X.CiX r1 = r0.A0H
            X.C26056CrS.A01(r1)
            r0 = r17
            X.C25592CiX.A00(r1, r0)
            android.media.AudioTrack r0 = r7.A0B
            r0.play()
        L_0x01b6:
            X.CkV r6 = r7.A0W
            long r0 = A01(r7)
            android.media.AudioTrack r4 = r6.A0G
            X.C26056CrS.A01(r4)
            int r5 = r4.getPlayState()
            boolean r4 = r6.A0L
            if (r4 == 0) goto L_0x01dc
            r4 = 2
            if (r5 != r4) goto L_0x01d1
            r0 = r17
            r6.A0J = r0
            return r17
        L_0x01d1:
            if (r5 != r8) goto L_0x01dc
            long r12 = X.C25700CkV.A00(r6)
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x01dc
            return r17
        L_0x01dc:
            boolean r4 = r6.A0J
            boolean r0 = r6.A01(r0)
            r6.A0J = r0
            if (r4 == 0) goto L_0x020b
            if (r0 != 0) goto L_0x020b
            if (r5 == r8) goto L_0x020b
            X.CIv r12 = r6.A0M
            int r4 = r6.A00
            long r0 = r6.A04
            java.util.UUID r5 = X.C24736CHy.A04
            long r20 = com.facebook.android.exoplayer2.util.Util.A05(r0)
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r0 = r12.A00
            X.E7N r5 = r0.A0E
            if (r5 == 0) goto L_0x020b
            long r23 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0.A05
            long r23 = r23 - r0
            r22 = r4
            r19 = r5
            r19.C9T(r20, r22, r23)
        L_0x020b:
            java.nio.ByteBuffer r0 = r7.A0J
            if (r0 != 0) goto L_0x04c0
            java.nio.ByteOrder r1 = r9.order()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            X.C26056CrS.A02(r0)
            boolean r0 = r9.hasRemaining()
            if (r0 == 0) goto L_0x0508
            X.Civ r1 = r7.A0G
            int r0 = r1.A04
            if (r0 == 0) goto L_0x0446
            int r0 = r7.A03
            if (r0 != 0) goto L_0x0446
            int r4 = r1.A03
            r13 = -1
            switch(r4) {
                case 5: goto L_0x03b6;
                case 6: goto L_0x03b6;
                case 7: goto L_0x035d;
                case 8: goto L_0x035d;
                case 9: goto L_0x03f0;
                case 10: goto L_0x0359;
                case 11: goto L_0x0355;
                case 12: goto L_0x0355;
                case 13: goto L_0x0232;
                case 14: goto L_0x02f8;
                case 15: goto L_0x02f4;
                case 16: goto L_0x0359;
                case 17: goto L_0x023d;
                case 18: goto L_0x03b6;
                default: goto L_0x0232;
            }
        L_0x0232:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected audio encoding: "
            java.lang.IllegalStateException r0 = X.AnonymousClass8BX.A0W(r0, r1, r4)
            throw r0
        L_0x023d:
            r0 = 16
            byte[] r1 = new byte[r0]
            int r0 = r9.position()
            r9.get(r1)
            r9.position(r0)
            r0 = 16
            X.Ckw r15 = new X.Ckw
            r15.<init>()
            r15.A03 = r1
            r15.A01 = r0
            r15.A01(r0)
            r14 = 2
            int r1 = r15.A01(r0)
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L_0x0268
            r0 = 24
            r15.A01(r0)
        L_0x0268:
            int r0 = r15.A01(r14)
            r13 = 3
            if (r0 != r13) goto L_0x0278
        L_0x026f:
            r15.A01(r14)
            boolean r0 = r15.A02()
            if (r0 != 0) goto L_0x026f
        L_0x0278:
            r0 = 10
            int r16 = r15.A01(r0)
            boolean r0 = r15.A02()
            if (r0 == 0) goto L_0x02a2
            int r0 = r15.A01(r13)
            if (r0 <= 0) goto L_0x02a2
            int r4 = r15.A02
            r15.A02 = r4
            int r0 = r15.A00
            int r1 = r0 + 2
            r15.A00 = r1
            r0 = 7
            if (r1 <= r0) goto L_0x029f
            int r0 = r4 + 1
            r15.A02 = r0
            int r0 = r1 + -8
            r15.A00 = r0
        L_0x029f:
            X.C25726Ckw.A00(r15)
        L_0x02a2:
            boolean r5 = r15.A02()
            r4 = 48000(0xbb80, float:6.7262E-41)
            r1 = 44100(0xac44, float:6.1797E-41)
            r0 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L_0x02b4
            r0 = 48000(0xbb80, float:6.7262E-41)
        L_0x02b4:
            r12 = 4
            int r5 = r15.A01(r12)
            if (r0 != r1) goto L_0x02c5
            r0 = 13
            if (r5 != r0) goto L_0x02f1
            int[] r0 = X.CEO.A00
            r15 = r0[r5]
            goto L_0x0432
        L_0x02c5:
            if (r0 != r4) goto L_0x02f1
            int[] r1 = X.CEO.A00
            r0 = 14
            if (r5 >= r0) goto L_0x02f1
            r15 = r1[r5]
            int r4 = r16 % 5
            r1 = 8
            if (r4 == r8) goto L_0x02ec
            r0 = 11
            if (r4 == r14) goto L_0x02e7
            if (r4 == r13) goto L_0x02ec
            if (r4 != r12) goto L_0x0432
            if (r5 == r13) goto L_0x02e3
            if (r5 == r1) goto L_0x02e3
            if (r5 != r0) goto L_0x0432
        L_0x02e3:
            int r15 = r15 + 1
            goto L_0x0432
        L_0x02e7:
            if (r5 == r1) goto L_0x02e3
            if (r5 != r0) goto L_0x0432
            goto L_0x02e3
        L_0x02ec:
            if (r5 == r13) goto L_0x02e3
            if (r5 != r1) goto L_0x0432
            goto L_0x02e3
        L_0x02f1:
            r15 = 0
            goto L_0x0432
        L_0x02f4:
            r15 = 512(0x200, float:7.175E-43)
            goto L_0x0432
        L_0x02f8:
            int r14 = r9.position()
            int r0 = r9.limit()
            int r12 = r0 + -10
            r5 = r14
        L_0x0303:
            if (r5 > r12) goto L_0x0352
            int r0 = r5 + 4
            int r4 = r9.getInt(r0)
            java.nio.ByteOrder r1 = r9.order()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 == r0) goto L_0x0317
            int r4 = java.lang.Integer.reverseBytes(r4)
        L_0x0317:
            r1 = r4 & -2
            r0 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r1 != r0) goto L_0x034f
            int r5 = r5 - r14
            if (r5 == r13) goto L_0x0352
            int r0 = r9.position()
            int r0 = r0 + r5
            int r0 = r0 + 7
            byte r0 = r9.get(r0)
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 187(0xbb, float:2.62E-43)
            boolean r4 = X.AnonymousClass000.A1T(r1, r0)
            int r1 = r9.position()
            int r1 = r1 + r5
            r0 = 8
            if (r4 == 0) goto L_0x033f
            r0 = 9
        L_0x033f:
            int r1 = r1 + r0
            byte r0 = r9.get(r1)
            int r0 = r0 >> 4
            r1 = r0 & 7
            r0 = 40
            int r0 = r0 << r1
            int r15 = r0 * 16
            goto L_0x0432
        L_0x034f:
            int r5 = r5 + 1
            goto L_0x0303
        L_0x0352:
            r15 = 0
            goto L_0x0432
        L_0x0355:
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x0432
        L_0x0359:
            r15 = 1024(0x400, float:1.435E-42)
            goto L_0x0432
        L_0x035d:
            int r1 = r9.position()
            byte r4 = r9.get(r1)
            r0 = -2
            if (r4 == r0) goto L_0x03a9
            if (r4 == r13) goto L_0x0389
            r0 = 31
            if (r4 == r0) goto L_0x0396
            int r0 = r1 + 4
            byte r0 = r9.get(r0)
            r0 = r0 & 1
            int r4 = r0 << 6
            int r0 = r1 + 5
        L_0x037a:
            byte r0 = r9.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
        L_0x0380:
            int r0 = r0 >> 2
            r0 = r0 | r4
            int r0 = r0 + 1
            int r15 = r0 * 32
            goto L_0x0432
        L_0x0389:
            int r0 = r1 + 4
            byte r0 = r9.get(r0)
            r0 = r0 & 7
            int r4 = r0 << 4
            int r0 = r1 + 7
            goto L_0x03a2
        L_0x0396:
            int r0 = r1 + 5
            byte r0 = r9.get(r0)
            r0 = r0 & 7
            int r4 = r0 << 4
            int r0 = r1 + 6
        L_0x03a2:
            byte r0 = r9.get(r0)
            r0 = r0 & 60
            goto L_0x0380
        L_0x03a9:
            int r0 = r1 + 5
            byte r0 = r9.get(r0)
            r0 = r0 & 1
            int r4 = r0 << 6
            int r0 = r1 + 4
            goto L_0x037a
        L_0x03b6:
            int r0 = r9.position()
            int r0 = r0 + 5
            byte r0 = r9.get(r0)
            r4 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 3
            int r4 = r4 >> r1
            r0 = 10
            if (r4 <= r0) goto L_0x03ed
            int r0 = r9.position()
            int r0 = r0 + 4
            byte r0 = r9.get(r0)
            r0 = r0 & 192(0xc0, float:2.69E-43)
            int r0 = r0 >> 6
            if (r0 == r1) goto L_0x03e6
            int r0 = r9.position()
            int r0 = r0 + 4
            byte r0 = r9.get(r0)
            r0 = r0 & 48
            int r1 = r0 >> 4
        L_0x03e6:
            int[] r0 = X.C24716CHd.A00
            r0 = r0[r1]
            int r15 = r0 * 256
            goto L_0x0432
        L_0x03ed:
            r15 = 1536(0x600, float:2.152E-42)
            goto L_0x0432
        L_0x03f0:
            int r0 = r9.position()
            int r14 = r9.getInt(r0)
            java.nio.ByteOrder r1 = r9.order()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 == r0) goto L_0x0404
            int r14 = java.lang.Integer.reverseBytes(r14)
        L_0x0404:
            r1 = -2097152(0xffffffffffe00000, float:NaN)
            r0 = r14 & r1
            if (r0 != r1) goto L_0x0441
            int r0 = r14 >>> 19
            r12 = 3
            r13 = r0 & 3
            if (r13 == r8) goto L_0x0441
            int r0 = r14 >>> 17
            r5 = r0 & 3
            if (r5 == 0) goto L_0x0441
            int r0 = r14 >>> 12
            r4 = 15
            r1 = r0 & 15
            int r0 = r14 >>> 10
            r0 = r0 & 3
            if (r1 == 0) goto L_0x0441
            if (r1 == r4) goto L_0x0441
            if (r0 == r12) goto L_0x0441
            r15 = 1152(0x480, float:1.614E-42)
            if (r5 == r8) goto L_0x0437
            r0 = 2
            if (r5 == r0) goto L_0x0432
            if (r5 != r12) goto L_0x043c
            r15 = 384(0x180, float:5.38E-43)
        L_0x0432:
            r7.A03 = r15
            if (r15 != 0) goto L_0x0446
            return r8
        L_0x0437:
            if (r13 == r12) goto L_0x0432
            r15 = 576(0x240, float:8.07E-43)
            goto L_0x0432
        L_0x043c:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()
            throw r0
        L_0x0441:
            java.lang.IllegalArgumentException r0 = X.BE6.A0j()
            throw r0
        L_0x0446:
            X.CR3 r0 = r7.A0H
            if (r0 == 0) goto L_0x0457
            boolean r0 = r7.A09()
            if (r0 == 0) goto L_0x0509
            r7.A05(r2)
            r0 = r18
            r7.A0H = r0
        L_0x0457:
            long r4 = r7.A06
            X.Civ r14 = r7.A0G
            int r0 = r14.A04
            if (r0 != 0) goto L_0x04dd
            long r0 = r7.A08
            int r12 = r14.A01
            long r12 = (long) r12
            long r0 = r0 / r12
        L_0x0465:
            X.BOV r12 = r7.A0c
            long r12 = r12.A04
            long r0 = r0 - r12
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r12
            X.D48 r12 = r14.A07
            int r12 = r12.A0F
            long r12 = (long) r12
            long r0 = r0 / r12
            long r4 = r4 + r0
            boolean r0 = r7.A0P
            if (r0 != 0) goto L_0x048d
            long r0 = r4 - r31
            long r14 = java.lang.Math.abs(r0)
            r12 = 200000(0x30d40, double:9.8813E-319)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04ac
            X.C1v r0 = new X.C1v
            r0.<init>(r2, r4)
            r7.A0P = r8
        L_0x048d:
            boolean r0 = r7.A09()
            if (r0 == 0) goto L_0x0509
            long r12 = r31 - r4
            long r0 = r7.A06
            long r0 = r0 + r12
            r7.A06 = r0
            r0 = r17
            r7.A0P = r0
            r7.A05(r2)
            X.E7N r1 = r7.A0E
            if (r1 == 0) goto L_0x04ac
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x04ac
            r1.C0y()
        L_0x04ac:
            X.Civ r0 = r7.A0G
            int r0 = r0.A04
            if (r0 != 0) goto L_0x04d4
            long r0 = r7.A08
            int r4 = r9.remaining()
            long r4 = (long) r4
            long r0 = r0 + r4
            r7.A08 = r0
        L_0x04bc:
            r7.A0J = r9
            r7.A04 = r8
        L_0x04c0:
            r7.A06(r2)
            java.nio.ByteBuffer r0 = r7.A0J
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x04e0
            r0 = r18
            r7.A0J = r0
            r0 = r17
            r7.A04 = r0
            return r8
        L_0x04d4:
            long r0 = r7.A07
            int r4 = r7.A03
            long r4 = (long) r4
            long r0 = r0 + r4
            r7.A07 = r0
            goto L_0x04bc
        L_0x04dd:
            long r0 = r7.A07
            goto L_0x0465
        L_0x04e0:
            long r12 = A01(r7)
            long r1 = r6.A06
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0509
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0509
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            r1 = 200(0xc8, double:9.9E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0509
            java.lang.String r1 = "DefaultAudioSink"
            java.lang.String r0 = "Resetting stalled audio track"
            android.util.Log.w(r1, r0)
            r7.A0B()
        L_0x0508:
            return r8
        L_0x0509:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.audio.DefaultAudioSink.A0H(java.nio.ByteBuffer, long):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.D8l[]} */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.D8l, X.BOU] */
    /* JADX WARNING: type inference failed for: r0v15, types: [X.C6D, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v20, types: [X.CVc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v21, types: [X.CVc, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DefaultAudioSink(X.C28627EBa[] r9) {
        /*
            r8 = this;
            X.CP8 r1 = new X.CP8
            r1.<init>()
            X.Cli r0 = X.C25771Cli.A01
            X.C26056CrS.A01(r0)
            r1.A00 = r0
            X.C26056CrS.A01(r9)
            X.CR2 r6 = new X.CR2
            r6.<init>(r9)
            r1.A02 = r6
            r8.<init>()
            X.Cli r0 = r1.A00
            r8.A0V = r0
            r8.A0Z = r6
            r5 = 1
            r7 = 0
            X.EAo r0 = r1.A01
            r8.A0Y = r0
            X.EAp r1 = X.C28617EAp.A00
            X.Ckn r0 = new X.Ckn
            r0.<init>(r1)
            r8.A0d = r0
            r0.A01()
            X.CIv r1 = new X.CIv
            r1.<init>(r8)
            X.CkV r0 = new X.CkV
            r0.<init>(r1)
            r8.A0W = r0
            X.BOU r4 = new X.BOU
            r4.<init>()
            r8.A0X = r4
            X.BOV r3 = new X.BOV
            r3.<init>()
            r8.A0c = r3
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            r0 = 3
            X.D8l[] r1 = new X.C26662D8l[r0]
            X.BOR r0 = new X.BOR
            r0.<init>()
            r1[r7] = r0
            r1[r5] = r4
            r0 = 2
            r1[r0] = r3
            java.util.Collections.addAll(r2, r1)
            X.EBa[] r0 = r6.A03
            java.util.Collections.addAll(r2, r0)
            X.EBa[] r0 = new X.C28627EBa[r7]
            java.lang.Object[] r0 = r2.toArray(r0)
            X.EBa[] r0 = (X.C28627EBa[]) r0
            r8.A0g = r0
            X.EBa[] r1 = new X.C28627EBa[r5]
            X.BOW r0 = new X.BOW
            r0.<init>()
            r1[r7] = r0
            r8.A0f = r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.A00 = r0
            X.Ckq r0 = X.C25720Ckq.A02
            r8.A0D = r0
            r8.A01 = r7
            X.C6D r0 = new X.C6D
            r0.<init>()
            r8.A0F = r0
            X.Cl2 r2 = X.C25732Cl2.A05
            r3 = 0
            X.CR3 r1 = new X.CR3
            r5 = r3
            r1.<init>(r2, r3, r5, r7)
            r8.A0I = r1
            r8.A0C = r2
            r0 = -1
            r8.A02 = r0
            X.EBa[] r0 = new X.C28627EBa[r7]
            r8.A0R = r0
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[r7]
            r8.A0S = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r8.A0e = r0
            X.CVc r0 = new X.CVc
            r0.<init>()
            r8.A0a = r0
            X.CVc r0 = new X.CVc
            r0.<init>()
            r8.A0b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.audio.DefaultAudioSink.<init>(X.EBa[]):void");
    }

    public static long A01(DefaultAudioSink defaultAudioSink) {
        C25615Civ civ = defaultAudioSink.A0G;
        if (civ.A04 == 0) {
            return defaultAudioSink.A0A / ((long) civ.A05);
        }
        return defaultAudioSink.A09;
    }

    private AudioTrack A02(C25615Civ civ) {
        AudioTrack audioTrack;
        try {
            C25720Ckq ckq = this.A0D;
            int i = this.A01;
            if (Util.A00 >= 29) {
                audioTrack = C25615Civ.A00(ckq, civ, i);
            } else {
                C24757CIu cIu = ckq.A00;
                if (cIu == null) {
                    cIu = new C24757CIu(ckq);
                    ckq.A00 = cIu;
                }
                audioTrack = new AudioTrack(cIu.A00, BEB.A0I(civ.A06, civ.A02, civ.A03), civ.A00, 1, i);
            }
            AtomicInteger atomicInteger = A0h;
            atomicInteger.incrementAndGet();
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
                atomicInteger.decrementAndGet();
            } catch (Exception e) {
                Object[] A1b = AnonymousClass3MW.A1b();
                C17880vN.A1T(A1b, state, 0);
                C17880vN.A1T(A1b, atomicInteger.get(), 1);
                Log.e("DefaultAudioSink", String.format("buildAudioTrack: state=%d, audioTrackAllocated.get()=%d", A1b), e);
            }
            int i2 = civ.A06;
            int i3 = civ.A02;
            int i4 = civ.A00;
            throw new C24401C1w(civ.A07, state, i2, i3, i4, atomicInteger.get(), BE8.A1T(civ.A04));
        } catch (IllegalArgumentException | UnsupportedOperationException unused) {
            int i5 = civ.A06;
            int i6 = civ.A02;
            int i7 = civ.A00;
            throw new C24401C1w(civ.A07, 0, i5, i6, i7, A0h.get(), C17890vO.A1R(civ.A04));
        } catch (C24401C1w e2) {
            throw e2;
        }
    }

    public static CR3 A03(DefaultAudioSink defaultAudioSink) {
        CR3 cr3 = defaultAudioSink.A0H;
        if (cr3 != null) {
            return cr3;
        }
        ArrayDeque arrayDeque = defaultAudioSink.A0e;
        if (!arrayDeque.isEmpty()) {
            return (CR3) arrayDeque.getLast();
        }
        return defaultAudioSink.A0I;
    }

    private void A04() {
        if (!this.A0Q) {
            this.A0Q = true;
            C25700CkV ckV = this.A0W;
            long A012 = A01(this);
            ckV.A0E = C25700CkV.A00(ckV);
            ckV.A0F = SystemClock.elapsedRealtime() * 1000;
            ckV.A05 = A012;
            this.A0B.stop();
        }
    }

    private void A05(long j) {
        C25732Cl2 cl2;
        boolean z;
        if ("audio/raw".equals(this.A0G.A07.A0S)) {
            CR2 cr2 = this.A0Z;
            cl2 = A03(this).A02;
            C26663D8m d8m = cr2.A01;
            float f = cl2.A01;
            if (d8m.A01 != f) {
                d8m.A01 = f;
                d8m.A07 = true;
            }
            float f2 = cl2.A00;
            if (d8m.A00 != f2) {
                d8m.A00 = f2;
                d8m.A07 = true;
            }
            cr2.A02.A00 = cl2.A03;
        } else {
            cl2 = C25732Cl2.A05;
        }
        if ("audio/raw".equals(this.A0G.A07.A0S)) {
            CR2 cr22 = this.A0Z;
            z = A03(this).A03;
            cr22.A00.A05 = z;
        } else {
            z = false;
        }
        this.A0e.add(new CR3(cl2, Math.max(0, j), (A01(this) * SearchActionVerificationClientService.MS_TO_NS) / ((long) this.A0G.A06), z));
        C28627EBa[] eBaArr = this.A0G.A08;
        ArrayList A13 = AnonymousClass000.A13();
        for (C28627EBa eBa : eBaArr) {
            if (eBa.Be2()) {
                A13.add(eBa);
            } else {
                eBa.flush();
            }
        }
        int size = A13.size();
        this.A0R = (C28627EBa[]) A13.toArray(new C28627EBa[size]);
        this.A0S = new ByteBuffer[size];
        int i = 0;
        while (true) {
            C28627EBa[] eBaArr2 = this.A0R;
            if (i < eBaArr2.length) {
                C28627EBa eBa2 = eBaArr2[i];
                eBa2.flush();
                this.A0S[i] = eBa2.BVr();
                i++;
            } else {
                return;
            }
        }
    }

    private void A06(long j) {
        ByteBuffer byteBuffer;
        int length = this.A0R.length;
        int i = length;
        do {
            if (i <= 0) {
                byteBuffer = this.A0J;
                if (byteBuffer == null) {
                    byteBuffer = C28627EBa.A00;
                }
            } else {
                byteBuffer = this.A0S[i - 1];
            }
            if (i == length) {
                A08(byteBuffer, j);
            } else {
                C28627EBa eBa = this.A0R[i];
                if (i > this.A02) {
                    eBa.CDB(byteBuffer);
                }
                ByteBuffer BVr = eBa.BVr();
                this.A0S[i] = BVr;
                if (BVr.hasRemaining()) {
                    i++;
                    continue;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
                continue;
            } else {
                return;
            }
        } while (i >= 0);
    }

    private void A07(AudioTrack audioTrack) {
        CYX cyx = this.A0U;
        if (cyx == null) {
            cyx = new CYX(this);
            this.A0U = cyx;
        }
        cyx.A00(audioTrack);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r9.A0K != null) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A09() {
        /*
            r9 = this;
            int r8 = r9.A02
            r7 = 1
            r6 = 0
            r5 = -1
            if (r8 != r5) goto L_0x002c
            r9.A02 = r6
            r8 = 0
        L_0x000a:
            r4 = 1
        L_0x000b:
            X.EBa[] r3 = r9.A0R
            int r0 = r3.length
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 >= r0) goto L_0x002e
            r0 = r3[r8]
            if (r4 == 0) goto L_0x001c
            r0.CDA()
        L_0x001c:
            r9.A06(r1)
            boolean r0 = r0.Bed()
            if (r0 == 0) goto L_0x0039
            int r0 = r9.A02
            int r8 = r0 + 1
            r9.A02 = r8
            goto L_0x000a
        L_0x002c:
            r4 = 0
            goto L_0x000b
        L_0x002e:
            java.nio.ByteBuffer r0 = r9.A0K
            if (r0 == 0) goto L_0x003a
            r9.A08(r0, r1)
            java.nio.ByteBuffer r0 = r9.A0K
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            return r6
        L_0x003a:
            r9.A02 = r5
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.audio.DefaultAudioSink.A09():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00aa, code lost:
        if (r17 != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        if (r17 != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        if (r17 == false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0A(boolean r20) {
        /*
            r19 = this;
            r12 = r19
            android.media.AudioTrack r0 = r12.A0B
            if (r0 == 0) goto L_0x02c8
            boolean r0 = r12.A0O
            if (r0 != 0) goto L_0x02c8
            X.CkV r9 = r12.A0W
            android.media.AudioTrack r0 = r9.A0G
            X.C26056CrS.A01(r0)
            int r0 = r0.getPlayState()
            r14 = 3
            if (r0 != r14) goto L_0x01c3
            long r4 = X.C25700CkV.A00(r9)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r0
            int r0 = r9.A02
            long r0 = (long) r0
            long r4 = r4 / r0
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01c3
            long r0 = java.lang.System.nanoTime()
            long r2 = X.C17880vN.A04(r0)
            long r0 = r9.A08
            long r15 = r2 - r0
            r10 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0064
            long[] r11 = r9.A0N
            int r8 = r9.A01
            long r0 = r4 - r2
            r11[r8] = r0
            int r1 = r8 + 1
            r0 = 10
            int r1 = r1 % r0
            r9.A01 = r1
            int r10 = r9.A03
            if (r10 >= r0) goto L_0x0053
            int r10 = r10 + 1
            r9.A03 = r10
        L_0x0053:
            r9.A08 = r2
            r9.A0D = r6
            r8 = 0
        L_0x0058:
            if (r8 >= r10) goto L_0x0064
            r15 = r11[r8]
            long r0 = (long) r10
            long r15 = r15 / r0
            long r6 = r6 + r15
            r9.A0D = r6
            int r8 = r8 + 1
            goto L_0x0058
        L_0x0064:
            boolean r0 = r9.A0L
            if (r0 != 0) goto L_0x01c3
            X.CiX r8 = r9.A0H
            X.C26056CrS.A01(r8)
            X.CSE r10 = r8.A05
            long r0 = r8.A03
            long r15 = r2 - r0
            long r0 = r8.A04
            int r6 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x00b2
            r8.A03 = r2
            android.media.AudioTrack r0 = r10.A04
            android.media.AudioTimestamp r11 = r10.A03
            boolean r17 = r0.getTimestamp(r11)
            if (r17 == 0) goto L_0x009e
            long r6 = r11.framePosition
            long r0 = r10.A01
            int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x0094
            long r0 = r10.A02
            r15 = 1
            long r0 = r0 + r15
            r10.A02 = r0
        L_0x0094:
            r10.A01 = r6
            long r0 = r10.A02
            r13 = 32
            long r0 = r0 << r13
            long r6 = r6 + r0
            r10.A00 = r6
        L_0x009e:
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x00ca
            r13 = 2
            if (r0 == r6) goto L_0x00e0
            if (r0 == r13) goto L_0x00c7
            if (r0 != r14) goto L_0x00b0
            if (r17 == 0) goto L_0x00b2
        L_0x00ac:
            r0 = 0
            X.C25592CiX.A00(r8, r0)
        L_0x00b0:
            if (r17 != 0) goto L_0x00ed
        L_0x00b2:
            boolean r0 = r9.A0K
            if (r0 == 0) goto L_0x01c3
            java.lang.reflect.Method r8 = r9.A0I
            if (r8 == 0) goto L_0x01c3
            long r0 = r9.A07
            long r6 = r2 - r0
            r4 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01c3
            goto L_0x0183
        L_0x00c7:
            if (r17 != 0) goto L_0x00ed
            goto L_0x00ac
        L_0x00ca:
            if (r17 == 0) goto L_0x0173
            long r0 = r11.nanoTime
            long r13 = X.C17880vN.A04(r0)
            long r0 = r8.A02
            int r7 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x00b2
            long r0 = r10.A00
            r8.A01 = r0
            X.C25592CiX.A00(r8, r6)
            goto L_0x00ed
        L_0x00e0:
            if (r17 == 0) goto L_0x00ac
            long r6 = r10.A00
            long r0 = r8.A01
            int r14 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x00ed
            X.C25592CiX.A00(r8, r13)
        L_0x00ed:
            long r0 = r11.nanoTime
            long r6 = X.C17880vN.A04(r0)
            long r0 = r10.A00
            long r10 = r6 - r2
            long r13 = java.lang.Math.abs(r10)
            r15 = 5000000(0x4c4b40, double:2.470328E-317)
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x0151
            X.CIv r13 = r9.A0M
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r11 = "Spurious audio timestamp (system clock mismatch): "
        L_0x010a:
            r10.append(r11)
            r10.append(r0)
            java.lang.String r11 = ", "
            r10.append(r11)
            r10.append(r6)
            r10.append(r11)
            r10.append(r2)
            r10.append(r11)
            r10.append(r4)
            r10.append(r11)
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r6 = r13.A00
            X.Civ r4 = r6.A0G
            int r0 = r4.A04
            if (r0 != 0) goto L_0x014e
            long r0 = r6.A08
            int r4 = r4.A01
            long r4 = (long) r4
            long r0 = r0 / r4
        L_0x0135:
            r10.append(r0)
            r10.append(r11)
            long r0 = A01(r6)
            java.lang.String r1 = X.C17880vN.A0u(r10, r0)
            java.lang.String r0 = "DefaultAudioSink"
            android.util.Log.w(r0, r1)
            r0 = 4
        L_0x0149:
            X.C25592CiX.A00(r8, r0)
            goto L_0x00b2
        L_0x014e:
            long r0 = r6.A07
            goto L_0x0135
        L_0x0151:
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r0 * r10
            int r10 = r9.A02
            long r10 = (long) r10
            long r13 = r13 / r10
            long r13 = r13 - r4
            long r13 = java.lang.Math.abs(r13)
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x016c
            X.CIv r13 = r9.A0M
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r11 = "Spurious audio timestamp (frame position mismatch): "
            goto L_0x010a
        L_0x016c:
            int r1 = r8.A00
            r0 = 4
            if (r1 != r0) goto L_0x00b2
            r0 = 0
            goto L_0x0149
        L_0x0173:
            long r0 = r8.A02
            long r6 = r2 - r0
            r4 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
            X.C25592CiX.A00(r8, r14)
            goto L_0x00b2
        L_0x0183:
            android.media.AudioTrack r1 = r9.A0G     // Catch:{ Exception -> 0x01be }
            X.C26056CrS.A01(r1)     // Catch:{ Exception -> 0x01be }
            java.lang.Object[] r0 = X.BE6.A1Z()     // Catch:{ Exception -> 0x01be }
            java.lang.Object r0 = r8.invoke(r1, r0)     // Catch:{ Exception -> 0x01be }
            int r0 = X.BE6.A0F(r0)     // Catch:{ Exception -> 0x01be }
            long r0 = X.C17890vO.A03(r0)     // Catch:{ Exception -> 0x01be }
            long r4 = r9.A04     // Catch:{ Exception -> 0x01be }
            long r0 = r0 - r4
            r9.A0A = r0     // Catch:{ Exception -> 0x01be }
            r4 = 0
            long r0 = java.lang.Math.max(r0, r4)     // Catch:{ Exception -> 0x01be }
            r9.A0A = r0     // Catch:{ Exception -> 0x01be }
            r7 = 5000000(0x4c4b40, double:2.470328E-317)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x01c1
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x01be }
            java.lang.String r6 = "Ignoring impossibly large audio latency: "
            java.lang.String r1 = X.C17890vO.A0a(r6, r7, r0)     // Catch:{ Exception -> 0x01be }
            java.lang.String r0 = "DefaultAudioSink"
            android.util.Log.w(r0, r1)     // Catch:{ Exception -> 0x01be }
            r9.A0A = r4     // Catch:{ Exception -> 0x01be }
            goto L_0x01c1
        L_0x01be:
            r0 = 0
            r9.A0I = r0
        L_0x01c1:
            r9.A07 = r2
        L_0x01c3:
            long r0 = java.lang.System.nanoTime()
            long r6 = X.C17880vN.A04(r0)
            X.CiX r1 = r9.A0H
            X.C26056CrS.A01(r1)
            int r5 = r1.A00
            r0 = 1
            if (r5 == r0) goto L_0x0221
            r0 = 2
            if (r5 == r0) goto L_0x0221
            int r0 = r9.A03
            if (r0 != 0) goto L_0x021c
            long r2 = X.C25700CkV.A00(r9)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            int r0 = r9.A02
            long r0 = (long) r0
            long r2 = r2 / r0
        L_0x01e8:
            if (r20 != 0) goto L_0x01ed
            long r0 = r9.A0A
            long r2 = r2 - r0
        L_0x01ed:
            X.Civ r6 = r12.A0G
            long r4 = A01(r12)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r0
            int r0 = r6.A06
            long r0 = (long) r0
            long r4 = r4 / r0
            long r7 = java.lang.Math.min(r2, r4)
        L_0x01ff:
            java.util.ArrayDeque r3 = r12.A0e
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x023b
            java.lang.Object r0 = r3.getFirst()
            X.CR3 r0 = (X.CR3) r0
            long r1 = r0.A00
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x023b
            java.lang.Object r0 = r3.remove()
            X.CR3 r0 = (X.CR3) r0
            r12.A0I = r0
            goto L_0x01ff
        L_0x021c:
            long r0 = r9.A0D
            long r2 = r6 + r0
            goto L_0x01e8
        L_0x0221:
            X.CSE r4 = r1.A05
            long r2 = r4.A00
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            int r0 = r9.A02
            long r0 = (long) r0
            long r2 = r2 / r0
            r0 = 2
            if (r5 != r0) goto L_0x01ed
            android.media.AudioTimestamp r0 = r4.A03
            long r0 = r0.nanoTime
            long r0 = X.C17880vN.A04(r0)
            long r6 = r6 - r0
            long r2 = r2 + r6
            goto L_0x01ed
        L_0x023b:
            X.CR3 r2 = r12.A0I
            long r0 = r2.A00
            long r13 = r7 - r0
            X.Cl2 r1 = r2.A02
            X.Cl2 r0 = X.C25732Cl2.A05
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0260
            long r2 = r2.A01
            long r2 = r2 + r13
        L_0x024e:
            X.Civ r6 = r12.A0G
            X.CR2 r0 = r12.A0Z
            X.BOX r0 = r0.A00
            long r4 = r0.A04
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r0
            int r0 = r6.A06
            long r0 = (long) r0
            long r4 = r4 / r0
            long r2 = r2 + r4
            return r2
        L_0x0260:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x02a8
            X.CR2 r0 = r12.A0Z
            X.D8m r2 = r0.A01
            long r5 = r2.A03
            r3 = 1024(0x400, double:5.06E-321)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x02a1
            long r15 = r2.A02
            X.Cv1 r0 = r2.A06
            X.C26056CrS.A01(r0)
            int r1 = r0.A00
            int r0 = r0.A0G
            int r1 = r1 * r0
            int r0 = r1 * 2
            long r0 = (long) r0
            long r15 = r15 - r0
            X.Cm9 r0 = r2.A05
            int r1 = r0.A03
            X.Cm9 r0 = r2.A04
            int r4 = r0.A03
            if (r1 != r4) goto L_0x029a
            long r2 = r2.A03
        L_0x028e:
            r17 = r2
            long r4 = com.facebook.android.exoplayer2.util.Util.A06(r13, r15, r17)
        L_0x0294:
            X.CR3 r0 = r12.A0I
            long r2 = r0.A01
            long r2 = r2 + r4
            goto L_0x024e
        L_0x029a:
            long r0 = (long) r1
            long r15 = r15 * r0
            long r2 = r2.A03
            long r0 = (long) r4
            long r2 = r2 * r0
            goto L_0x028e
        L_0x02a1:
            float r0 = r2.A01
            double r2 = (double) r0
            double r0 = (double) r13
            double r2 = r2 * r0
            long r4 = (long) r2
            goto L_0x0294
        L_0x02a8:
            java.lang.Object r6 = r3.getFirst()
            X.CR3 r6 = (X.CR3) r6
            long r4 = r6.A00
            long r4 = r4 - r7
            X.CR3 r0 = r12.A0I
            X.Cl2 r0 = r0.A02
            float r1 = r0.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x02c4
            double r2 = (double) r4
            double r0 = (double) r1
            double r2 = r2 * r0
            long r4 = java.lang.Math.round(r2)
        L_0x02c4:
            long r2 = r6.A01
            long r2 = r2 - r4
            goto L_0x024e
        L_0x02c8:
            r2 = -9223372036854775808
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.audio.DefaultAudioSink.A0A(boolean):long");
    }

    public void A0B() {
        if (this.A0B != null) {
            this.A08 = 0;
            this.A07 = 0;
            this.A0A = 0;
            this.A09 = 0;
            int i = 0;
            this.A03 = 0;
            this.A0I = new CR3(A03(this).A02, 0, 0, A03(this).A03);
            this.A06 = 0;
            this.A0H = null;
            this.A0e.clear();
            this.A0J = null;
            this.A04 = 0;
            this.A0K = null;
            this.A0Q = false;
            this.A0M = false;
            this.A02 = -1;
            this.A0c.A04 = 0;
            while (true) {
                C28627EBa[] eBaArr = this.A0R;
                if (i >= eBaArr.length) {
                    break;
                }
                C28627EBa eBa = eBaArr[i];
                eBa.flush();
                this.A0S[i] = eBa.BVr();
                i++;
            }
            C25700CkV ckV = this.A0W;
            AudioTrack audioTrack = ckV.A0G;
            C26056CrS.A01(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.A0B.pause();
            }
            AudioTrack audioTrack2 = this.A0B;
            if (Util.A00 >= 29 && audioTrack2.isOffloadedPlayback()) {
                CYX cyx = this.A0U;
                C26056CrS.A01(cyx);
                cyx.A01(this.A0B);
            }
            AudioTrack audioTrack3 = this.A0B;
            this.A0B = null;
            C25615Civ civ = this.A0T;
            if (civ != null) {
                this.A0G = civ;
                this.A0T = null;
            }
            ckV.A0D = 0;
            ckV.A03 = 0;
            ckV.A01 = 0;
            ckV.A08 = 0;
            ckV.A0G = null;
            ckV.A0H = null;
            this.A0d.A00();
            new C27241DaL(audioTrack3, this).start();
        }
        this.A0b.A00 = null;
        this.A0a.A00 = null;
    }

    public void A0C() {
        if (!this.A0M && this.A0B != null && A09()) {
            A04();
            this.A0M = true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        r5 = X.C25771Cli.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r5.containsKey(java.lang.Integer.valueOf(r4)) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        if (r4 != 18) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        if (java.util.Arrays.binarySearch(r2.A00, 18) >= 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        r4 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        if (java.util.Arrays.binarySearch(r2.A00, r4) < 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        r2 = r9.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        if (r2 == -1) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        if (r4 == 18) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r2 <= 8) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        throw new X.C2J(r9, X.AnonymousClass001.A1E(r9, "Unable to configure passthrough for: ", X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r6 != -1) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        r2 = 48000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if (com.facebook.android.exoplayer2.util.Util.A00 < 29) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ad, code lost:
        r2 = X.C25373CeY.A00(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        r1 = com.facebook.android.exoplayer2.util.Util.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        if (r1 > 28) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        if (r2 != 7) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ba, code lost:
        r2 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00be, code lost:
        if (r1 > 26) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c8, code lost:
        if ("fugu".equals(com.facebook.android.exoplayer2.util.Util.A01) == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cb, code lost:
        if (r2 != 1) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cd, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ce, code lost:
        r0 = com.facebook.android.exoplayer2.util.Util.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d2, code lost:
        if (r0 == 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d4, code lost:
        r0 = android.util.Pair.create(java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e0, code lost:
        if (r0 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e2, code lost:
        r7 = X.C108965cb.A01(r0);
        r11 = X.C108965cb.A00(r0);
        r4 = 2;
        r21 = -1;
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f1, code lost:
        if (r2 == 3) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f4, code lost:
        if (r2 == 4) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f7, code lost:
        if (r2 != 5) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f9, code lost:
        r2 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fb, code lost:
        r0 = r5.getOrDefault(java.lang.Integer.valueOf(r4), 0);
        X.C26056CrS.A01(r0);
        r2 = X.AnonymousClass000.A0M(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0111, code lost:
        if (r4 != 8) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0119, code lost:
        if (java.util.Arrays.binarySearch(r2.A00, 8) >= 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011b, code lost:
        r4 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x017f, code lost:
        if (r1 != 23) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b7, code lost:
        if (r0 == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.D48 r29, int[] r30) {
        /*
            r28 = this;
            java.lang.String r0 = "audio/raw"
            r9 = r29
            java.lang.String r1 = r9.A0S
            boolean r0 = r0.equals(r1)
            r3 = 0
            r8 = r28
            if (r0 == 0) goto L_0x0052
            int r5 = r9.A0B
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0C(r5)
            X.C26056CrS.A02(r0)
            int r3 = r9.A05
            int r21 = com.facebook.android.exoplayer2.util.Util.A02(r5, r3)
            X.EBa[] r12 = r8.A0g
            X.BOV r2 = r8.A0c
            int r1 = r9.A07
            int r0 = r9.A08
            r2.A03 = r1
            r2.A02 = r0
            X.BOU r0 = r8.A0X
            r1 = r30
            r0.A01 = r1
            int r0 = r9.A0F
            X.Cm9 r4 = new X.Cm9
            r4.<init>(r0, r3, r5)
            int r3 = r12.length
            r2 = 0
        L_0x0039:
            if (r2 >= r3) goto L_0x01bb
            r0 = r12[r2]
            X.Cm9 r1 = r0.BFW(r4)     // Catch:{ C1I -> 0x004b }
            boolean r0 = r0.Be2()     // Catch:{ C1I -> 0x004b }
            if (r0 == 0) goto L_0x0048
            r4 = r1
        L_0x0048:
            int r2 = r2 + 1
            goto L_0x0039
        L_0x004b:
            r1 = move-exception
            X.C2J r0 = new X.C2J
            r0.<init>((X.D48) r9, (java.lang.Throwable) r1)
            throw r0
        L_0x0052:
            X.EBa[] r12 = new X.C28627EBa[r3]
            int r6 = r9.A0F
            X.Cli r2 = r8.A0V
            X.C26056CrS.A01(r1)
            java.lang.String r4 = r9.A0O
            int r0 = r1.hashCode()
            switch(r0) {
                case -2123537834: goto L_0x011e;
                case -1095064472: goto L_0x0128;
                case -53558318: goto L_0x0131;
                case 187078296: goto L_0x0184;
                case 187078297: goto L_0x018c;
                case 1504578661: goto L_0x0195;
                case 1504831518: goto L_0x019d;
                case 1505942594: goto L_0x01a6;
                case 1556697186: goto L_0x01af;
                default: goto L_0x0064;
            }
        L_0x0064:
            r4 = 0
        L_0x0065:
            X.10w r5 = X.C25771Cli.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0091
            r7 = 18
            if (r4 != r7) goto L_0x010f
            int[] r0 = r2.A00
            int r0 = java.util.Arrays.binarySearch(r0, r7)
            if (r0 >= 0) goto L_0x007e
            r4 = 6
        L_0x007e:
            int[] r0 = r2.A00
            int r0 = java.util.Arrays.binarySearch(r0, r4)
            if (r0 < 0) goto L_0x0091
            int r2 = r9.A05
            r0 = -1
            if (r2 == r0) goto L_0x00a1
            if (r4 == r7) goto L_0x00a1
            r0 = 8
            if (r2 <= r0) goto L_0x00b1
        L_0x0091:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unable to configure passthrough for: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r9, r0, r1)
            X.C2J r0 = new X.C2J
            r0.<init>((X.D48) r9, (java.lang.String) r1)
            throw r0
        L_0x00a1:
            r2 = r6
            if (r6 != r0) goto L_0x00a7
            r2 = 48000(0xbb80, float:6.7262E-41)
        L_0x00a7:
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 29
            if (r1 < r0) goto L_0x00fb
            int r2 = X.C25373CeY.A00(r4, r2)
        L_0x00b1:
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 28
            if (r1 > r0) goto L_0x00ce
            r0 = 7
            if (r2 != r0) goto L_0x00f0
            r2 = 8
        L_0x00bc:
            r0 = 26
            if (r1 > r0) goto L_0x00ce
            java.lang.String r1 = "fugu"
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ce
            r0 = 1
            if (r2 != r0) goto L_0x00ce
            r2 = 2
        L_0x00ce:
            int r0 = com.facebook.android.exoplayer2.util.Util.A00(r2)
            if (r0 == 0) goto L_0x0091
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            if (r0 == 0) goto L_0x0091
            int r7 = X.C108965cb.A01(r0)
            int r11 = X.C108965cb.A00(r0)
            r4 = 2
            r21 = -1
            r5 = -1
            goto L_0x01ca
        L_0x00f0:
            r0 = 3
            if (r2 == r0) goto L_0x00f9
            r0 = 4
            if (r2 == r0) goto L_0x00f9
            r0 = 5
            if (r2 != r0) goto L_0x00bc
        L_0x00f9:
            r2 = 6
            goto L_0x00bc
        L_0x00fb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r5.getOrDefault(r1, r0)
            X.C26056CrS.A01(r0)
            int r2 = X.AnonymousClass000.A0M(r0)
            goto L_0x00b1
        L_0x010f:
            r1 = 8
            if (r4 != r1) goto L_0x007e
            int[] r0 = r2.A00
            int r0 = java.util.Arrays.binarySearch(r0, r1)
            if (r0 >= 0) goto L_0x007e
            r4 = 7
            goto L_0x007e
        L_0x011e:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r0 = r1.equals(r0)
            r4 = 18
            goto L_0x01b7
        L_0x0128:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r0 = r1.equals(r0)
            r4 = 7
            goto L_0x01b7
        L_0x0131:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0064
            if (r4 == 0) goto L_0x0064
            java.util.regex.Pattern r0 = X.C26233CvQ.A01
            java.util.regex.Matcher r1 = r0.matcher(r4)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x0064
            r0 = 1
            java.lang.String r4 = r1.group(r0)
            X.C26056CrS.A01(r4)
            r0 = 2
            java.lang.String r1 = r1.group(r0)
            r0 = 16
            java.lang.Integer.parseInt(r4, r0)     // Catch:{ NumberFormatException -> 0x0064 }
            if (r1 == 0) goto L_0x0181
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0064 }
            r0 = 2
            r4 = 10
            if (r1 == r0) goto L_0x0065
            r0 = 5
            r4 = 11
            if (r1 == r0) goto L_0x0065
            r0 = 29
            r4 = 12
            if (r1 == r0) goto L_0x0065
            r0 = 42
            r4 = 16
            if (r1 == r0) goto L_0x0065
            r0 = 22
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 == r0) goto L_0x0065
            r0 = 23
            r4 = 15
            if (r1 == r0) goto L_0x0065
        L_0x0181:
            r4 = 0
            goto L_0x0065
        L_0x0184:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r1.equals(r0)
            r4 = 5
            goto L_0x01b7
        L_0x018c:
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r1.equals(r0)
            r4 = 17
            goto L_0x01b7
        L_0x0195:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r1.equals(r0)
            r4 = 6
            goto L_0x01b7
        L_0x019d:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r1.equals(r0)
            r4 = 9
            goto L_0x01b7
        L_0x01a6:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r0 = r1.equals(r0)
            r4 = 8
            goto L_0x01b7
        L_0x01af:
            java.lang.String r0 = "audio/true-hd"
            boolean r0 = r1.equals(r0)
            r4 = 14
        L_0x01b7:
            if (r0 != 0) goto L_0x0065
            goto L_0x0064
        L_0x01bb:
            int r7 = r4.A02
            int r6 = r4.A03
            int r0 = r4.A01
            int r11 = com.facebook.android.exoplayer2.util.Util.A00(r0)
            int r5 = com.facebook.android.exoplayer2.util.Util.A02(r7, r0)
            r4 = 0
        L_0x01ca:
            int r10 = android.media.AudioTrack.getMinBufferSize(r6, r11, r7)
            r0 = -2
            boolean r0 = X.AnonymousClass000.A1S(r10, r0)
            X.C26056CrS.A03(r0)
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r4 == 0) goto L_0x022d
            r0 = 1
            if (r4 == r0) goto L_0x0225
            r1 = 250000(0x3d090, float:3.50325E-40)
            r0 = 5
            if (r7 != r0) goto L_0x01e6
            r1 = 500000(0x7a120, float:7.00649E-40)
        L_0x01e6:
            int r2 = X.C26666D8p.A00(r7)
            long r0 = (long) r1
        L_0x01eb:
            long r2 = (long) r2
            long r0 = X.BE8.A0F(r0, r2)
            int r0 = A00(r0)
        L_0x01f4:
            double r0 = (double) r0
            double r0 = r0 * r19
            int r2 = (int) r0
            int r0 = java.lang.Math.max(r10, r2)
            int r0 = r0 + r5
            int r27 = r0 + -1
            int r27 = r27 / r5
            int r27 = r27 * r5
            java.lang.String r2 = ") for: "
            if (r7 == 0) goto L_0x0265
            if (r11 == 0) goto L_0x0252
            X.Civ r1 = new X.Civ
            r22 = r4
            r23 = r5
            r24 = r6
            r25 = r11
            r26 = r7
            r18 = r1
            r19 = r9
            r20 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            android.media.AudioTrack r0 = r8.A0B
            if (r0 == 0) goto L_0x024f
            r8.A0T = r1
            return
        L_0x0225:
            int r2 = X.C26666D8p.A00(r7)
            r0 = 50000000(0x2faf080, double:2.47032823E-316)
            goto L_0x01eb
        L_0x022d:
            int r14 = r10 * 4
            r15 = 250000(0x3d090, double:1.235164E-318)
            long r2 = (long) r6
            long r15 = r15 * r2
            long r0 = (long) r5
            long r15 = r15 * r0
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r15 = r15 / r17
            int r13 = A00(r15)
            r15 = 750000(0xb71b0, double:3.70549E-318)
            long r15 = r15 * r2
            long r15 = r15 * r0
            long r15 = r15 / r17
            int r0 = A00(r15)
            int r0 = X.BE8.A07(r14, r0, r13)
            goto L_0x01f4
        L_0x024f:
            r8.A0G = r1
            return
        L_0x0252:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid output channel config (mode="
            X.AnonymousClass000.A1E(r0, r2, r1, r4)
            java.lang.String r1 = X.C17890vO.A0V(r9, r1)
            X.C2J r0 = new X.C2J
            r0.<init>((X.D48) r9, (java.lang.String) r1)
            throw r0
        L_0x0265:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid output encoding (mode="
            X.AnonymousClass000.A1E(r0, r2, r1, r4)
            java.lang.String r1 = X.C17890vO.A0V(r9, r1)
            X.C2J r0 = new X.C2J
            r0.<init>((X.D48) r9, (java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.audio.DefaultAudioSink.A0D(X.D48, int[]):void");
    }

    public void A0E(C25732Cl2 cl2) {
        C25732Cl2 cl22 = C25732Cl2.A05;
        C25732Cl2 cl23 = new C25732Cl2(BE8.A01(cl2.A01, 8.0f, 0.1f), BE8.A01(cl2.A00, 8.0f, 0.1f), false, false);
        boolean z = A03(this).A03;
        CR3 A032 = A03(this);
        if (!cl23.equals(A032.A02) || z != A032.A03) {
            CR3 cr3 = new CR3(cl23, -9223372036854775807L, -9223372036854775807L, z);
            if (this.A0B != null) {
                this.A0H = cr3;
            } else {
                this.A0I = cr3;
            }
        }
    }

    public boolean A0F() {
        if (this.A0B == null || !this.A0W.A01(A01(this))) {
            return false;
        }
        return true;
    }

    private void A08(ByteBuffer byteBuffer, long j) {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.A0K;
            boolean z = true;
            boolean z2 = false;
            if (byteBuffer2 != null) {
                C26056CrS.A02(AnonymousClass000.A1Z(byteBuffer2, byteBuffer));
            } else {
                this.A0K = byteBuffer;
            }
            int remaining = byteBuffer.remaining();
            int write = this.A0B.write(byteBuffer, remaining, 1);
            this.A05 = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((Util.A00 >= 24 && write == -6) || write == -32) {
                    z2 = true;
                }
                C24402C1x c1x = new C24402C1x(this.A0G.A07, write, z2);
                if (!c1x.isRecoverable) {
                    this.A0b.A00(c1x);
                    return;
                }
                throw c1x;
            }
            this.A0b.A00 = null;
            AudioTrack audioTrack = this.A0B;
            if (Util.A00 >= 29) {
                audioTrack.isOffloadedPlayback();
            }
            int i = this.A0G.A04;
            if (i == 0) {
                this.A0A += (long) write;
            }
            if (write == remaining) {
                if (i != 0) {
                    if (byteBuffer != this.A0J) {
                        z = false;
                    }
                    C26056CrS.A03(z);
                    this.A09 += ((long) this.A03) * ((long) this.A04);
                }
                this.A0K = null;
            }
        }
    }

    public boolean A0G(int i, int i2) {
        if (!Util.A0C(i2)) {
            if (Arrays.binarySearch(this.A0V.A00, i2) < 0) {
                return false;
            }
            if (i == -1 || i <= 8) {
                return true;
            }
            return false;
        }
        return true;
    }
}
