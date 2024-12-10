package X;

import android.content.Context;
import android.media.MediaCodec;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cyg  reason: case insensitive filesystem */
public class C26380Cyg implements Handler.Callback {
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
    public long A0B;
    public Handler A0C;
    public C28559E7l A0D;
    public C25820CmX A0E;
    public C25674Ck5 A0F = null;
    public A5W A0G;
    public C25001CTb A0H;
    public CUT A0I;
    public E7t A0J;
    public C24825CLt A0K;
    public C24826CLu A0L;
    public COY A0M;
    public String A0N;
    public List A0O;
    public ScheduledExecutorService A0P = null;
    public ScheduledFuture A0Q = null;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public C26117Csf A0U;
    public final Context A0V;
    public final ConditionVariable A0W = new ConditionVariable();
    public final Handler.Callback A0X;
    public final Handler A0Y;
    public final HandlerThread A0Z;
    public final C25325CdW A0a;
    public final C25933Coy A0b;
    public final CAH A0c;
    public final E7q A0d;
    public final E55 A0e;
    public final CAM A0f;
    public final C28564E7r A0g;
    public final CVH A0h;
    public final CTK A0i;
    public final C25068CWa A0j;
    public final E56 A0k;
    public final C25061CVt A0l;
    public final File A0m;
    public final String A0n;
    public final Thread.UncaughtExceptionHandler A0o;
    public final boolean A0p;
    public volatile C26243Cvh A0q;
    public volatile C24302Byz A0r;
    public volatile boolean A0s;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Cjg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.Cjg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [X.Cjg, java.lang.Object] */
    private void A02() {
        A0A(this, "cleanupCodecState", new Object[0]);
        ? obj = new Object();
        try {
            A0A(this, "cleanupVideoEncoderSafely", new Object[0]);
            C25001CTb cTb = this.A0H;
            if (cTb != null) {
                Iterator A15 = AnonymousClass000.A15(cTb.A07);
                while (A15.hasNext()) {
                    BEB.A0O(A15).finish();
                }
                this.A0H = null;
            }
        } catch (Throwable th) {
            C25650Cjg.A00(obj, th);
            A0G("cleanupVideoEncoderSafely", th);
        }
        this.A0J = null;
        this.A0H = null;
        if (this.A0q != null) {
            try {
                C26243Cvh cvh = this.A0q;
                CAF.A00("MultipleTrackCoordinatorRealtime", "releasePlayer", new Object[0]);
                try {
                    C25635CjM.A01(new Object(), cvh.A06, 7);
                    C24322BzJ bzJ = C24322BzJ.VIDEO;
                    ? obj2 = new Object();
                    C25664Cju cju = cvh.A0I;
                    C25664Cju.A00(cju);
                    ArrayList A13 = AnonymousClass000.A13();
                    Map map = cju.A00;
                    SparseArray sparseArray = (SparseArray) map.get(bzJ);
                    if (sparseArray != null) {
                        int size = sparseArray.size();
                        for (int i = 0; i < size; i++) {
                            C17890vO.A1D(A13, sparseArray.keyAt(i));
                        }
                    }
                    Iterator it = A13.iterator();
                    while (it.hasNext()) {
                        Future A012 = cju.A01(bzJ, BE6.A0F(it.next()));
                        if (A012 != null && !A012.isCancelled()) {
                            obj2.A01((EAT) A012.get()).A00();
                        }
                    }
                    C25664Cju.A00(cju);
                    map.remove(bzJ);
                    List<Future> list = cvh.A0N;
                    for (Future future : list) {
                        try {
                            future.get();
                        } catch (Throwable th2) {
                            CAF.A00("MultipleTrackCoordinatorRealtime", "releaseAllDemuxDecoderWrappersRealtime: releaseCallable Exception=%s", th2);
                        }
                    }
                    list.clear();
                    Throwable th3 = obj2.A01;
                    if (th3 == null) {
                        th = null;
                        C25832Cml cml = cvh.A09;
                        if (cml != null) {
                            cml.A00();
                            cvh.A09 = null;
                        }
                        C25832Cml cml2 = cvh.A08;
                        if (cml2 != null) {
                            cml2.A00();
                            cvh.A08 = null;
                        }
                        ExecutorService executorService = cvh.A0R;
                        if (executorService != null) {
                            executorService.shutdown();
                        }
                        cvh.A0Q.shutdown();
                        if (th != null) {
                            CAF.A00("MultipleTrackCoordinatorRealtime", "releasePlayer: releaseException=%s", th);
                            throw th;
                        }
                    } else {
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                A0A(this, "cleanupCodecState: mMultipleTrackCoordinatorRealtime.releasePlayer Exception=%s", th5);
                C25650Cjg.A00(obj, th5);
                A0G("cleanup", th5);
            }
        }
        this.A0q = null;
        try {
            Throwable th6 = obj.A01;
            if (th6 != null) {
                throw th6;
            }
        } catch (Throwable th7) {
            A0A(this, "cleanupCodecState: context Exception=%s", th7);
            A0B(this, th7);
        }
    }

    public static void A0D(C26380Cyg cyg, Throwable th) {
        Handler handler;
        Throwable th2 = th;
        C26380Cyg cyg2 = cyg;
        A0A(cyg, "onPlaybackException: e=%s", AnonymousClass8BV.A1b(th));
        C24302Byz byz = cyg.A0r;
        cyg.A04();
        if (!(th instanceof CancellationException)) {
            A0B(cyg, th);
            cyg.A0E(C24302Byz.ERROR);
            COY coy = cyg.A0M;
            if (coy != null && (handler = cyg.A0C) != null) {
                handler.post(new C21368Aix(cyg2, byz, coy, th2, 10));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(X.C26052CrM r10, long r11) {
        /*
            r9 = this;
            r5 = 2
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = r10.toString()
            r4 = 0
            r1[r4] = r0
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r2 = 1
            r1[r2] = r3
            java.lang.String r0 = "updateMediaComposition: mediaComposition=%s, seekToPositionNs=%s"
            A0A(r9, r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            X.BE6.A1H(r10, r1, r4)
            java.lang.String r0 = "updateAudioVolume: mediaComposition=%s"
            A0A(r9, r0, r1)
            X.BzJ r6 = X.C24322BzJ.AUDIO
            java.util.HashMap r0 = r10.A00
            java.lang.Object r1 = r0.get(r6)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x010a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x010a
            int r0 = r1.size()
            if (r0 <= r2) goto L_0x00f8
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x003a:
            r9.A00 = r0
        L_0x003c:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            X.BE6.A1H(r10, r1, r4)
            java.lang.String r0 = "updateSegmentNumbers: mediaComposition=%s"
            A0A(r9, r0, r1)
            X.BzJ r0 = X.C24322BzJ.VIDEO
            java.util.HashMap r0 = r10.A06(r0)
            if (r0 == 0) goto L_0x00f5
            int r0 = r0.size()
        L_0x0052:
            r9.A04 = r0
            java.util.HashMap r0 = r10.A06(r6)
            if (r0 == 0) goto L_0x00f2
            int r0 = r0.size()
        L_0x005e:
            r9.A01 = r0
            X.BzJ r0 = X.C24322BzJ.MIXED
            java.util.HashMap r0 = r10.A06(r0)
            if (r0 == 0) goto L_0x00ef
            int r0 = r0.size()
        L_0x006c:
            r9.A03 = r0
            java.lang.Object[] r8 = new java.lang.Object[r2]
            X.CUT r0 = r9.A0I
            X.CrM r1 = r0.A06
            r7 = 0
            if (r1 == 0) goto L_0x008e
            boolean r0 = X.CAK.A00(r1, r10)
            if (r0 == 0) goto L_0x008e
            java.util.HashMap r1 = r1.A05(r6)
            java.util.HashMap r0 = r10.A05(r6)
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008e
            r7 = 1
        L_0x008e:
            X.AnonymousClass8BR.A1L(r8, r4, r7)
            java.lang.String r0 = "updateMediaComposition: mediaCompositionDeltaUtil.isOnlyAudioEffectChanged=%s"
            A0A(r9, r0, r8)
            X.CUT r0 = r9.A0I
            X.CrM r1 = r0.A06
            r7 = 0
            if (r1 == 0) goto L_0x00b4
            boolean r0 = X.CAK.A00(r1, r10)
            if (r0 == 0) goto L_0x00b4
            java.util.HashMap r1 = r1.A05(r6)
            java.util.HashMap r0 = r10.A05(r6)
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b4
            r7 = 1
        L_0x00b4:
            r0 = 0
            if (r7 == 0) goto L_0x010d
            java.lang.Object[] r5 = new java.lang.Object[r5]
            X.BE6.A1H(r10, r5, r4)
            java.util.HashMap r3 = A00(r9)
            r5[r2] = r3
            java.lang.String r2 = "logUpdateAudioEffects: mediaComposition=%s, getCurPlaybackStatusParams=%s"
            A0A(r9, r2, r5)
            X.Coy r5 = r9.A0b
            java.util.HashMap r4 = A00(r9)
            java.lang.String r3 = X.C18070vi.A0H(r10)
            java.lang.String r2 = "media_composition"
            r4.put(r2, r3)
            java.lang.String r3 = r10.A04()
            X.C18070vi.A0X(r3)
            java.lang.String r2 = "media_composition_hash"
            r4.put(r2, r3)
            X.C25933Coy.A00(r5, r4)
            X.Bz3 r2 = X.C24306Bz3.UPDATE_AUDIO_EFFECTS
            A07(r2, r9)
            r9.A0L(r2, r10, r0)
            return
        L_0x00ef:
            r0 = 0
            goto L_0x006c
        L_0x00f2:
            r0 = 0
            goto L_0x005e
        L_0x00f5:
            r0 = 0
            goto L_0x0052
        L_0x00f8:
            java.lang.Object r0 = r1.get(r4)
            X.C6M r0 = (X.C6M) r0
            com.facebook.videolite.transcoder.base.composition.MediaEffect r1 = r0.A01
            boolean r0 = r1 instanceof X.BW5
            if (r0 == 0) goto L_0x003c
            X.BW5 r1 = (X.BW5) r1
            float r0 = r1.A00
            goto L_0x003a
        L_0x010a:
            r0 = 0
            goto L_0x003a
        L_0x010d:
            X.Bz3 r4 = X.C24306Bz3.UPDATE_MEDIA_COMPOSITION
            A07(r4, r9)
            java.lang.Object[] r2 = X.C108945cZ.A1a(r10, r3, r5, r2)
            r9.A0L(r4, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26380Cyg.A0K(X.CrM, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r1 == r3) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03() {
        /*
            r12 = this;
            X.Byz r1 = r12.A0r
            X.Byz r0 = X.C24302Byz.PLAYING
            if (r1 != r0) goto L_0x005e
            X.A5W r0 = r12.A0G
            X.C199610h.A04(r0)
            X.Cvh r0 = r12.A0q
            X.C199610h.A04(r0)
            X.A5W r1 = r12.A0G
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r3 = r1.A02(r0)
            X.Cvh r0 = r12.A0q
            r10 = 0
            long r1 = r0.A05(r3, r10)
            X.Ck5 r9 = r12.A0F
            if (r9 == 0) goto L_0x003a
            X.Cvh r11 = r12.A0q
            long r5 = r11.A0Y
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0078
            r0 = 0
        L_0x002e:
            double r7 = (double) r0
            X.Cvh r0 = r12.A0q
            long r5 = r0.A0X
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r9.A00(r0, r7)
        L_0x003a:
            X.A5W r0 = r12.A0G
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MICROSECONDS
            boolean r0 = r0.A05(r1, r6)
            if (r0 == 0) goto L_0x0049
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r0 = 0
            if (r5 != 0) goto L_0x004a
        L_0x0049:
            r0 = 1
        L_0x004a:
            X.Bz3 r3 = X.C24306Bz3.DO_WORK
            A07(r3, r12)
            r2 = 0
            if (r0 != 0) goto L_0x005f
            X.Cvh r0 = r12.A0q
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x005a
            r10 = 10
        L_0x005a:
            long r0 = (long) r10
        L_0x005b:
            r12.A0L(r3, r2, r0)
        L_0x005e:
            return
        L_0x005f:
            boolean r0 = r12.A0s
            if (r0 == 0) goto L_0x0086
            X.A5W r0 = r12.A0G
            long r0 = r0.A03(r6)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.CL3 r0 = new X.CL3
            r0.<init>(r1)
            r12.A08(r0)
            r0 = 10
            goto L_0x005b
        L_0x0078:
            long r5 = r11.A0X
            float r7 = (float) r5
            long r5 = r11.A0Y
            float r0 = (float) r5
            float r7 = r7 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r7, r0)
            goto L_0x002e
        L_0x0086:
            java.lang.String r1 = "doWork setPlaybackState PLAYBACK_COMPLETE"
            java.lang.Object[] r0 = new java.lang.Object[r10]
            A0A(r12, r1, r0)
            X.Byz r0 = X.C24302Byz.PLAYBACK_COMPLETE
            r12.A0E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26380Cyg.A03():void");
    }

    private void A05() {
        String str;
        C24302Byz byz;
        A0A(this, "playInternal", new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (A0I() && this.A0r != (byz = C24302Byz.PLAYING)) {
                this.A0R = true;
                A0A(this, "onPlaybackStarted", new Object[0]);
                this.A0A = System.currentTimeMillis();
                A0E(byz);
                A03();
            }
        } finally {
            HashMap A012 = A01(this, "media_player_start_time_ms", currentTimeMillis);
            C25820CmX cmX = this.A0E;
            if (!(cmX == null || (str = cmX.A0F) == null)) {
                A012.put("decoder_debug_info", str);
            }
            A0A(this, "playInternal logPlay params=%s", A012);
            C25933Coy.A00(this.A0b, A012);
        }
    }

    private void A06(C26052CrM crM, int i, long j) {
        C25933Coy coy = this.A0b;
        long millis = TimeUnit.NANOSECONDS.toMillis(j);
        HashMap A002 = A00(this);
        C18070vi.A0d(crM, 0);
        A002.put("media_composition", C18070vi.A0H(crM));
        BE7.A1I("target_position_ms", A002, millis);
        A002.put("media_composition_update_time_ms", String.valueOf(i));
        String A042 = crM.A04();
        C18070vi.A0X(A042);
        A002.put("media_composition_hash", A042);
        C25933Coy.A00(coy, A002);
    }

    public static void A07(C24306Bz3 bz3, C26380Cyg cyg) {
        cyg.A0Y.removeMessages(bz3.ordinal());
    }

    private void A08(CL3 cl3) {
        long j;
        C24302Byz byz;
        boolean z = false;
        CL3 cl32 = cl3;
        A0A(this, "doSeek: seekInfo=%s", cl3);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (A0I()) {
                C24302Byz byz2 = this.A0r;
                C24302Byz byz3 = C24302Byz.PLAYING;
                if (byz2 == byz3) {
                    z = true;
                }
                A0E(C24302Byz.SEEKING);
                Long l = cl32.A00;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                C199610h.A04(this.A0q);
                C199610h.A04(this.A0G);
                A5W a5w = this.A0G;
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                long min = Math.min(Math.max(j, a5w.A03(timeUnit)), this.A0G.A02(timeUnit));
                C26243Cvh cvh = this.A0q;
                Object[] objArr = new Object[1];
                BE8.A1N(objArr, min);
                CAF.A00("MultipleTrackCoordinatorRealtime", "seekPlayer: playbackPositionUs=%s", objArr);
                cvh.A0X = Math.max(Math.min(min, cvh.A0Y - 1), 0);
                long j2 = cvh.A0X;
                CAF.A00("MultipleTrackCoordinatorRealtime", "resetPlayer", new Object[0]);
                cvh.A0D = false;
                cvh.A01 = -1;
                cvh.A00 = j2;
                cvh.A0A = false;
                if (cvh.A0J != null) {
                    C24322BzJ bzJ = C24322BzJ.VIDEO;
                    long j3 = cvh.A0X;
                    Map map = cvh.A0P;
                    ArrayList A022 = C26060CrZ.A02(bzJ, map, j3);
                    C26243Cvh.A02(bzJ, cvh, cvh.A0X);
                    C26243Cvh.A03(bzJ, cvh, A022, true);
                    cvh.A0O.put(bzJ, AnonymousClass8BR.A12(A022));
                    Iterator it = A022.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        long j4 = cvh.A0X;
                        Object[] A1b = AnonymousClass000.A1b(bzJ, 3);
                        AnonymousClass3MX.A1S(A1b, 1, j4);
                        A1b[2] = num;
                        CAF.A00("MultipleTrackCoordinatorRealtime", "seekTrackTo: trackType=%s, targetPtsUs=%s, presentationTrackIndex=%s", A1b);
                        int intValue = num.intValue();
                        EAT A062 = cvh.A06(bzJ, intValue);
                        Object obj = ((SparseArray) C26159CtX.A00(bzJ, map)).get(intValue);
                        C26159CtX.A01(obj);
                        long A032 = ((A5W) obj).A03(timeUnit);
                        if (A032 < 0) {
                            A032 = 0;
                        }
                        HashMap hashMap = cvh.A0M;
                        if (hashMap.containsKey(num)) {
                            A062.CRW((A5W) hashMap.get(num));
                        }
                        A062.CHA(j4 - A032);
                    }
                }
                C26236CvW cvW = cvh.A06;
                if (cvW != null) {
                    BE7.A18(cvW.A0D, Long.valueOf(cvh.A0X), 4);
                }
                if (z) {
                    byz = byz3;
                } else {
                    byz = C24302Byz.PAUSED;
                }
                A0E(byz);
                if (this.A0r != byz3) {
                    this.A0q.A05(this.A0G.A02(timeUnit), true);
                    this.A0q.A07();
                }
            }
        } finally {
            C25933Coy.A00(this.A0b, A01(this, "media_player_seek_time_ms", currentTimeMillis));
        }
    }

    public static void A09(C26380Cyg cyg) {
        if (cyg.A0U != null) {
            A0A(cyg, "maybeCancelReverse mMediaCompositionNormalizationUtil.cancel", BE6.A1Z());
            cyg.A0U.A03();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v179, resolved type: X.DHW} */
    /* JADX WARNING: type inference failed for: r47v0, types: [X.DHX, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v7, types: [X.CXE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v63, types: [java.lang.Object, X.E7l] */
    /* JADX WARNING: type inference failed for: r4v26, types: [X.E7q, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r41v1, types: [java.lang.Object, X.CAH] */
    /* JADX WARNING: type inference failed for: r49v2, types: [X.E56] */
    /* JADX WARNING: type inference failed for: r5v33, types: [X.E7s, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r41v2, types: [java.lang.Object, X.CAH] */
    /* JADX WARNING: CFG modification limit reached, blocks count: 445 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:192|193|194|151) */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x051f, code lost:
        if (r1.A06 != null) goto L_0x0522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0521, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0522, code lost:
        r1 = X.AnonymousClass000.A0k("url cannot be null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0528, code lost:
        if (r3 != false) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x052a, code lost:
        r3 = new X.C27210DZk("media track segment validation error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0531, code lost:
        r1 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0537, code lost:
        if (r10.contains(r1) == false) goto L_0x0546;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0539, code lost:
        r3 = new X.C27210DZk("media composition validation error", X.AnonymousClass000.A0n("duplicate track name"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x055a, code lost:
        if (r8 != null) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x055c, code lost:
        r10 = android.graphics.Bitmap.createBitmap(360, 640, android.graphics.Bitmap.Config.ARGB_8888);
        X.C18070vi.A0d(r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r9 = java.io.File.createTempFile("dummy", ".jpg");
        r4 = X.C108945cZ.A19(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        r10.compress(android.graphics.Bitmap.CompressFormat.JPEG, 60, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x057e, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0587, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        r10.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x058d, code lost:
        r10.recycle();
        r1 = new X.CXD(r9);
        r1.A02 = X.C26162Ctb.A00(r57, r5, r6, false);
        r3 = r1.A00();
        r1 = r6.A02();
        r1.A02.remove(r7);
        r1.A00.remove(r7);
        X.C25833Cmm.A00(r1, new X.C26010CqR(r7), r3);
        r6 = new X.C26052CrM(r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:190:0x0583 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:193:0x0588 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x04cb A[Catch:{ all -> 0x09a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0555 A[Catch:{ all -> 0x09a2 }, EDGE_INSN: B:179:0x0555->B:180:0x055a ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0688 A[Catch:{ all -> 0x09a2 }, LOOP:13: B:220:0x0682->B:222:0x0688, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x069e A[Catch:{ all -> 0x09a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x07c0 A[Catch:{ all -> 0x09a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0819 A[Catch:{ all -> 0x09a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0864 A[Catch:{ all -> 0x09a2 }, LOOP:18: B:303:0x0862->B:304:0x0864, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0875 A[Catch:{ all -> 0x09a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0877 A[Catch:{ all -> 0x09a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0909 A[Catch:{ all -> 0x09a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0936 A[Catch:{ all -> 0x09a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0941 A[Catch:{ all -> 0x09a2 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:193:0x0588=Splitter:B:193:0x0588, B:240:0x06cd=Splitter:B:240:0x06cd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0F(java.lang.Long r60) {
        /*
            r59 = this;
            java.lang.String r24 = "logPrepare mMediaComposition=%s, params=%s"
            java.lang.String r23 = "media_player_prepare_time_ms"
            r19 = 1
            r0 = r19
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r60
            java.lang.String r1 = "doPrepare: seekToPositionNs=%d"
            r0 = r59
            A0A(r0, r1, r3)
            long r20 = java.lang.System.currentTimeMillis()
            java.util.HashMap r18 = X.C17880vN.A11()
            X.Byz r1 = X.C24302Byz.PREPARING     // Catch:{ all -> 0x09a2 }
            r0.A0E(r1)     // Catch:{ all -> 0x09a2 }
            java.lang.String r1 = "FbMediaCompositionPlayer.reversal"
            android.os.Trace.beginSection(r1)     // Catch:{ all -> 0x09a2 }
            android.content.Context r1 = r0.A0V     // Catch:{ all -> 0x09a2 }
            r58 = r1
            X.E7q r1 = r0.A0d     // Catch:{ all -> 0x09a2 }
            r57 = r1
            X.E7r r3 = r0.A0g     // Catch:{ all -> 0x09a2 }
            X.E55 r1 = r0.A0e     // Catch:{ all -> 0x09a2 }
            r56 = r1
            X.CAM r1 = r0.A0f     // Catch:{ all -> 0x09a2 }
            r55 = r1
            X.DHX r47 = new X.DHX     // Catch:{ all -> 0x09a2 }
            r47.<init>()     // Catch:{ all -> 0x09a2 }
            X.CUT r4 = r0.A0I     // Catch:{ all -> 0x09a2 }
            r22 = 0
            X.CdW r1 = r0.A0a     // Catch:{ all -> 0x09a2 }
            r54 = r1
            java.io.File r5 = r0.A0m     // Catch:{ all -> 0x09a2 }
            java.lang.Integer r50 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x09a2 }
            X.Csf r1 = new X.Csf     // Catch:{ all -> 0x09a2 }
            r40 = r1
            r41 = r58
            r42 = r54
            r43 = r57
            r44 = r56
            r45 = r55
            r46 = r3
            r48 = r4
            r49 = r5
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x09a2 }
            r0.A0U = r1     // Catch:{ all -> 0x09a2 }
            java.util.List r3 = r1.A01     // Catch:{ all -> 0x0480 }
            r53 = r3
            boolean r3 = r53.isEmpty()     // Catch:{ all -> 0x0480 }
            if (r3 == 0) goto L_0x0079
            java.util.List r3 = r1.A02     // Catch:{ all -> 0x0480 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0480 }
            if (r3 == 0) goto L_0x0079
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.A0F     // Catch:{ all -> 0x0480 }
            r3.set(r2)     // Catch:{ all -> 0x0480 }
        L_0x0079:
            X.CdW r3 = r1.A05     // Catch:{ all -> 0x0480 }
            r52 = r3
            java.lang.Integer r4 = r1.A00     // Catch:{ all -> 0x0480 }
            java.lang.Integer r3 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0480 }
            if (r4 != r3) goto L_0x00bc
            java.lang.Integer r3 = X.AnonymousClass00R.A18     // Catch:{ all -> 0x0480 }
        L_0x0085:
            X.DTn r6 = new X.DTn     // Catch:{ all -> 0x0480 }
            r6.<init>()     // Catch:{ all -> 0x0480 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0480 }
            int r3 = 8 - r3
            if (r3 == 0) goto L_0x00b9
            java.lang.String r5 = "PLAYER_TRANSCODER_REVERSAL_QUEUE"
        L_0x0094:
            r4 = 4
            r3 = r19
            java.util.concurrent.ThreadPoolExecutor r3 = X.C25325CdW.A00(r5, r6, r4, r3)     // Catch:{ all -> 0x0480 }
            r1.A03 = r3     // Catch:{ all -> 0x0480 }
            X.CUT r10 = r1.A0B     // Catch:{ all -> 0x0480 }
            boolean r3 = r10.A0F     // Catch:{ all -> 0x0480 }
            if (r3 != 0) goto L_0x0466
            X.CrM r4 = r10.A06     // Catch:{ all -> 0x0480 }
            X.C26171Ctn.A02(r4)     // Catch:{ all -> 0x0480 }
            X.BzJ r35 = X.C24322BzJ.VIDEO     // Catch:{ all -> 0x0480 }
            r3 = r35
            java.util.HashMap r5 = r4.A06(r3)     // Catch:{ all -> 0x0480 }
            if (r5 == 0) goto L_0x0466
            boolean r3 = r5.isEmpty()     // Catch:{ all -> 0x0480 }
            if (r3 != 0) goto L_0x0466
            goto L_0x00bf
        L_0x00b9:
            java.lang.String r5 = "TRANSCODER_REVERSAL_QUEUE"
            goto L_0x0094
        L_0x00bc:
            java.lang.Integer r3 = X.AnonymousClass00R.A19     // Catch:{ all -> 0x0480 }
            goto L_0x0085
        L_0x00bf:
            java.io.File r3 = r1.A0D     // Catch:{ IOException -> 0x0455 }
            r34 = r3
            if (r3 == 0) goto L_0x00e2
            boolean r3 = r34.exists()     // Catch:{ IOException -> 0x0455 }
            if (r3 != 0) goto L_0x00e9
            boolean r3 = r34.mkdirs()     // Catch:{ IOException -> 0x0455 }
            if (r3 != 0) goto L_0x00e9
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0455 }
            java.lang.String r4 = "unable to create folder="
            r3 = r34
            java.lang.String r3 = X.BEA.A0j(r3, r4, r5)     // Catch:{ IOException -> 0x0455 }
            java.io.IOException r3 = X.C17880vN.A0f(r3)     // Catch:{ IOException -> 0x0455 }
        L_0x00e1:
            throw r3     // Catch:{ IOException -> 0x0455 }
        L_0x00e2:
            java.lang.String r3 = "mTranscodeCacheFolder cannot be null"
            java.io.IOException r3 = X.C17880vN.A0f(r3)     // Catch:{ IOException -> 0x0455 }
            goto L_0x00e1
        L_0x00e9:
            java.util.concurrent.ExecutorService r4 = r1.A03     // Catch:{ all -> 0x0480 }
            X.C26159CtX.A01(r4)     // Catch:{ all -> 0x0480 }
            X.CKw r33 = new X.CKw     // Catch:{ all -> 0x0480 }
            r3 = r33
            r3.<init>(r4)     // Catch:{ all -> 0x0480 }
            java.util.Iterator r32 = X.C17890vO.A0i(r5)     // Catch:{ all -> 0x0480 }
        L_0x00f9:
            boolean r3 = r32.hasNext()     // Catch:{ all -> 0x0480 }
            if (r3 == 0) goto L_0x0441
            java.lang.Object r9 = X.C17890vO.A0P(r32)     // Catch:{ all -> 0x0480 }
            X.Cmm r9 = (X.C25833Cmm) r9     // Catch:{ all -> 0x0480 }
            java.util.List r4 = r9.A07     // Catch:{ all -> 0x0480 }
            java.util.ArrayList r3 = X.C17880vN.A10(r4)     // Catch:{ all -> 0x0480 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0480 }
            if (r3 != 0) goto L_0x00f9
            java.util.ArrayList r3 = X.C17880vN.A10(r4)     // Catch:{ all -> 0x0480 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0480 }
            X.Cll r3 = (X.C25774Cll) r3     // Catch:{ all -> 0x0480 }
            float r3 = r3.A00     // Catch:{ all -> 0x0480 }
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x00f9
            r31 = r9
            boolean r3 = r10.A0K     // Catch:{ all -> 0x0480 }
            if (r3 == 0) goto L_0x0197
            java.util.Iterator r5 = X.AnonymousClass8BV.A0y(r4)     // Catch:{ all -> 0x0480 }
        L_0x012c:
            boolean r3 = r5.hasNext()     // Catch:{ all -> 0x0480 }
            if (r3 == 0) goto L_0x0197
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x0480 }
            X.Cll r3 = (X.C25774Cll) r3     // Catch:{ all -> 0x0480 }
            float r4 = r3.A00     // Catch:{ all -> 0x0480 }
            r3 = 0
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x012c
            X.BzJ r6 = r9.A01     // Catch:{ all -> 0x0480 }
            java.lang.String r5 = "normalized_media_track_composition"
            r3 = 0
            X.CqR r11 = new X.CqR     // Catch:{ all -> 0x0480 }
            r11.<init>(r6, r5, r3)     // Catch:{ all -> 0x0480 }
            java.util.List r5 = r9.A04     // Catch:{ all -> 0x0480 }
            java.util.Iterator r14 = X.AnonymousClass8BV.A0y(r5)     // Catch:{ all -> 0x0480 }
        L_0x0150:
            boolean r5 = r14.hasNext()     // Catch:{ all -> 0x0480 }
            if (r5 == 0) goto L_0x018b
            java.lang.Object r8 = r14.next()     // Catch:{ all -> 0x0480 }
            X.CcJ r8 = (X.C25271CcJ) r8     // Catch:{ all -> 0x0480 }
            X.A5W r6 = r8.A03     // Catch:{ all -> 0x0480 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0480 }
            long r12 = r6.A03(r5)     // Catch:{ all -> 0x0480 }
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0172
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0480 }
            long r6 = r6.A02(r5)     // Catch:{ all -> 0x0480 }
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0185
        L_0x0172:
            java.io.File r5 = r8.A05     // Catch:{ all -> 0x0480 }
            X.CXD r7 = new X.CXD     // Catch:{ all -> 0x0480 }
            r7.<init>(r5)     // Catch:{ all -> 0x0480 }
            long r5 = r8.A01     // Catch:{ all -> 0x0480 }
            r7.A01 = r5     // Catch:{ all -> 0x0480 }
            java.net.URL r5 = r8.A06     // Catch:{ all -> 0x0480 }
            r7.A06 = r5     // Catch:{ all -> 0x0480 }
            X.CcJ r8 = r7.A00()     // Catch:{ all -> 0x0480 }
        L_0x0185:
            java.util.List r5 = r11.A04     // Catch:{ all -> 0x0480 }
            r5.add(r8)     // Catch:{ all -> 0x0480 }
            goto L_0x0150
        L_0x018b:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.A00(r3)     // Catch:{ all -> 0x0480 }
            X.Cmm r31 = new X.Cmm     // Catch:{ all -> 0x0480 }
            r3 = r31
            r3.<init>(r11)     // Catch:{ all -> 0x0480 }
        L_0x0197:
            r4 = r31
            r3 = r34
            java.io.File r30 = X.C26117Csf.A01(r4, r3)     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x0438 }
            boolean r3 = r30.exists()     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x0438 }
            if (r3 == 0) goto L_0x01ae
            java.util.HashMap r4 = r1.A0E     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x0438 }
            r3 = r30
            r4.put(r9, r3)     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x0438 }
            goto L_0x00f9
        L_0x01ae:
            java.util.List r3 = r4.A07     // Catch:{ all -> 0x0480 }
            java.util.ArrayList r3 = X.C17880vN.A10(r3)     // Catch:{ all -> 0x0480 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0480 }
            X.Cll r3 = (X.C25774Cll) r3     // Catch:{ all -> 0x0480 }
            float r3 = r3.A00     // Catch:{ all -> 0x0480 }
            r51 = r3
            java.util.List r3 = r4.A04     // Catch:{ all -> 0x0480 }
            java.util.Iterator r29 = X.AnonymousClass8BV.A0y(r3)     // Catch:{ all -> 0x0480 }
            r28 = 0
        L_0x01c6:
            boolean r3 = r29.hasNext()     // Catch:{ all -> 0x0480 }
            if (r3 == 0) goto L_0x00f9
            java.lang.Object r6 = r29.next()     // Catch:{ all -> 0x0480 }
            X.CcJ r6 = (X.C25271CcJ) r6     // Catch:{ all -> 0x0480 }
            X.E7q r3 = r1.A06     // Catch:{ IOException | NullPointerException -> 0x041c }
            r43 = r3
            java.io.File r3 = r6.A05     // Catch:{ IOException | NullPointerException -> 0x041c }
            r42 = r3
            X.C26159CtX.A01(r42)     // Catch:{ IOException | NullPointerException -> 0x041c }
            r4 = r43
            X.CXd r27 = X.BE7.A0I(r4, r3)     // Catch:{ IOException | NullPointerException -> 0x041c }
            X.C26159CtX.A01(r27)     // Catch:{ IOException | NullPointerException -> 0x041c }
            X.CZT r3 = r10.A08     // Catch:{ all -> 0x0480 }
            boolean r3 = r3 instanceof X.BWA     // Catch:{ all -> 0x0480 }
            if (r3 == 0) goto L_0x038b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0480 }
            r3 = 2500(0x9c4, double:1.235E-320)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0480 }
            long r7 = r5.convert(r3, r11)     // Catch:{ all -> 0x0480 }
            long r14 = r6.A01     // Catch:{ all -> 0x0480 }
            long r11 = r5.convert(r14, r11)     // Catch:{ all -> 0x0480 }
            X.A5W r13 = r6.A03     // Catch:{ all -> 0x0480 }
            long r5 = r13.A03(r5)     // Catch:{ all -> 0x0480 }
            r3 = 0
            long r25 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x0480 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0480 }
            long r16 = r13.A02(r5)     // Catch:{ all -> 0x0480 }
            int r5 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0214
            r11 = r16
        L_0x0214:
            long r3 = r11 - r25
            long r5 = java.lang.Math.min(r3, r7)     // Catch:{ all -> 0x0480 }
            java.util.ArrayList r17 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0480 }
            double r7 = (double) r3     // Catch:{ all -> 0x0480 }
            double r3 = (double) r5     // Catch:{ all -> 0x0480 }
            int r8 = X.BE7.A03(r7, r3)     // Catch:{ all -> 0x0480 }
            r7 = 0
        L_0x0225:
            if (r7 >= r8) goto L_0x0251
            long r3 = (long) r7     // Catch:{ all -> 0x0480 }
            long r3 = r3 * r5
            long r38 = r25 + r3
            long r3 = r38 + r5
            long r40 = java.lang.Math.min(r11, r3)     // Catch:{ all -> 0x0480 }
            X.CXD r3 = new X.CXD     // Catch:{ all -> 0x0480 }
            r4 = r42
            r3.<init>(r4)     // Catch:{ all -> 0x0480 }
            r3.A01 = r14     // Catch:{ all -> 0x0480 }
            java.util.concurrent.TimeUnit r37 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0480 }
            X.A5W r4 = new X.A5W     // Catch:{ all -> 0x0480 }
            r36 = r4
            r36.<init>(r37, r38, r40)     // Catch:{ all -> 0x0480 }
            r3.A03 = r4     // Catch:{ all -> 0x0480 }
            X.CcJ r4 = r3.A00()     // Catch:{ all -> 0x0480 }
            r3 = r17
            r3.add(r4)     // Catch:{ all -> 0x0480 }
            int r7 = r7 + 1
            goto L_0x0225
        L_0x0251:
            java.util.Collections.reverse(r17)     // Catch:{ all -> 0x0480 }
            r3 = r31
            java.lang.String r15 = r3.A02     // Catch:{ all -> 0x0480 }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0480 }
            r5 = 0
        L_0x025d:
            int r3 = r17.size()     // Catch:{ all -> 0x0480 }
            if (r5 >= r3) goto L_0x0330
            r3 = r17
            java.lang.Object r12 = r3.get(r5)     // Catch:{ all -> 0x0480 }
            X.CcJ r12 = (X.C25271CcJ) r12     // Catch:{ all -> 0x0480 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r15)     // Catch:{ all -> 0x0480 }
            java.lang.String r3 = "_split_"
            java.lang.String r11 = X.AnonymousClass001.A1I(r3, r4, r5)     // Catch:{ all -> 0x0480 }
            r3 = 0
            X.CqR r8 = new X.CqR     // Catch:{ all -> 0x0480 }
            r7 = r35
            r8.<init>(r7, r11, r3)     // Catch:{ all -> 0x0480 }
            java.util.List r3 = r8.A04     // Catch:{ all -> 0x0480 }
            r3.add(r12)     // Catch:{ all -> 0x0480 }
            float r3 = java.lang.Math.abs(r51)     // Catch:{ all -> 0x0480 }
            r8.A00(r3)     // Catch:{ all -> 0x0480 }
            X.Cmm r4 = new X.Cmm     // Catch:{ all -> 0x0480 }
            r4.<init>(r8)     // Catch:{ all -> 0x0480 }
            X.Cac r3 = new X.Cac     // Catch:{ all -> 0x0480 }
            r3.<init>()     // Catch:{ all -> 0x0480 }
            r3.A02(r4)     // Catch:{ all -> 0x0480 }
            X.CrM r8 = new X.CrM     // Catch:{ all -> 0x0480 }
            r8.<init>(r3)     // Catch:{ all -> 0x0480 }
            X.E9F r3 = r1.A07     // Catch:{ all -> 0x0480 }
            X.BVy r7 = new X.BVy     // Catch:{ all -> 0x0480 }
            r7.<init>(r3, r4, r1)     // Catch:{ all -> 0x0480 }
            r3 = r27
            X.CUT r48 = X.C26117Csf.A00(r3, r7, r8, r1)     // Catch:{ all -> 0x0480 }
            r3 = r34
            java.io.File r8 = X.C26117Csf.A01(r4, r3)     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x0413 }
            boolean r3 = r8.exists()     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x0413 }
            if (r3 == 0) goto L_0x02be
            java.util.HashMap r3 = r1.A0E     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x0413 }
            r3.put(r4, r8)     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x0413 }
            r6.add(r8)     // Catch:{ NoSuchAlgorithmException | JSONException -> 0x0413 }
            goto L_0x032c
        L_0x02be:
            android.content.Context r14 = r1.A04     // Catch:{ all -> 0x0480 }
            X.E7r r13 = r1.A0A     // Catch:{ all -> 0x0480 }
            X.C26159CtX.A01(r13)     // Catch:{ all -> 0x0480 }
            X.E55 r12 = r1.A08     // Catch:{ all -> 0x0480 }
            X.CAM r11 = r1.A09     // Catch:{ all -> 0x0480 }
            X.E56 r7 = r1.A0C     // Catch:{ all -> 0x0480 }
            X.CAH r41 = new X.CAH     // Catch:{ all -> 0x0480 }
            r41.<init>()     // Catch:{ all -> 0x0480 }
            r16 = 0
            X.DGx r4 = new X.DGx     // Catch:{ all -> 0x0480 }
            r4.<init>(r8)     // Catch:{ all -> 0x0480 }
            X.E7l r39 = X.C24667CEh.A00     // Catch:{ all -> 0x0480 }
            X.Cj7 r3 = new X.Cj7     // Catch:{ all -> 0x0480 }
            r36 = r3
            r37 = r14
            r38 = r22
            r40 = r52
            r42 = r27
            r44 = r4
            r45 = r12
            r46 = r11
            r47 = r13
            r49 = r7
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ all -> 0x0480 }
            java.util.concurrent.atomic.AtomicBoolean r4 = r1.A0F     // Catch:{ all -> 0x0480 }
            boolean r4 = r4.get()     // Catch:{ all -> 0x0480 }
            if (r4 != 0) goto L_0x0332
            X.DGq r13 = new X.DGq     // Catch:{ all -> 0x0480 }
            r13.<init>(r3)     // Catch:{ all -> 0x0480 }
            r4 = r33
            java.util.concurrent.ExecutorService r12 = r4.A00     // Catch:{ all -> 0x0480 }
            r11 = 27
            X.DTg r7 = new X.DTg     // Catch:{ all -> 0x0480 }
            r7.<init>(r13, r4, r3, r11)     // Catch:{ all -> 0x0480 }
            r12.execute(r7)     // Catch:{ all -> 0x0480 }
            java.util.List r4 = r1.A02     // Catch:{ all -> 0x0480 }
            r4.add(r13)     // Catch:{ all -> 0x0480 }
            java.util.Iterator r7 = r4.iterator()     // Catch:{ all -> 0x0480 }
        L_0x0316:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x0480 }
            if (r3 == 0) goto L_0x0326
            java.lang.Object r3 = r7.next()     // Catch:{ all -> 0x0480 }
            X.E7p r3 = (X.C28563E7p) r3     // Catch:{ all -> 0x0480 }
            r3.CS0()     // Catch:{ InterruptedException | ExecutionException -> 0x0316 }
            goto L_0x0316
        L_0x0326:
            r4.clear()     // Catch:{ all -> 0x0480 }
            r6.add(r8)     // Catch:{ all -> 0x0480 }
        L_0x032c:
            int r5 = r5 + 1
            goto L_0x025d
        L_0x0330:
            r16 = r6
        L_0x0332:
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.A0F     // Catch:{ all -> 0x0480 }
            boolean r3 = r3.get()     // Catch:{ all -> 0x0480 }
            if (r3 != 0) goto L_0x0466
            if (r16 == 0) goto L_0x045e
            int r4 = r16.size()     // Catch:{ all -> 0x0480 }
            int r3 = r17.size()     // Catch:{ all -> 0x0480 }
            if (r4 != r3) goto L_0x045e
            X.CqR r3 = new X.CqR     // Catch:{ all -> 0x0480 }
            r4 = r35
            r3.<init>(r4)     // Catch:{ all -> 0x0480 }
            java.util.Iterator r6 = r16.iterator()     // Catch:{ all -> 0x0480 }
        L_0x0351:
            boolean r4 = r6.hasNext()     // Catch:{ all -> 0x0480 }
            if (r4 == 0) goto L_0x036c
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0480 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x0480 }
            X.CXD r4 = new X.CXD     // Catch:{ all -> 0x0480 }
            r4.<init>(r5)     // Catch:{ all -> 0x0480 }
            X.CcJ r5 = r4.A00()     // Catch:{ all -> 0x0480 }
            java.util.List r4 = r3.A04     // Catch:{ all -> 0x0480 }
            r4.add(r5)     // Catch:{ all -> 0x0480 }
            goto L_0x0351
        L_0x036c:
            X.Cmm r4 = new X.Cmm     // Catch:{ all -> 0x0480 }
            r4.<init>(r3)     // Catch:{ all -> 0x0480 }
            if (r28 != 0) goto L_0x0388
            X.Cw4 r6 = new X.Cw4     // Catch:{ all -> 0x0480 }
            r6.<init>()     // Catch:{ all -> 0x0480 }
            X.DHF r5 = new X.DHF     // Catch:{ all -> 0x0480 }
            r5.<init>()     // Catch:{ all -> 0x0480 }
            X.DHW r28 = new X.DHW     // Catch:{ all -> 0x0480 }
            r28.<init>()     // Catch:{ all -> 0x0480 }
            r3 = r28
            r3.A00 = r6     // Catch:{ all -> 0x0480 }
            r3.A01 = r5     // Catch:{ all -> 0x0480 }
        L_0x0388:
            r11 = r28
            goto L_0x03a5
        L_0x038b:
            X.CqR r3 = new X.CqR     // Catch:{ all -> 0x0480 }
            r4 = r35
            r3.<init>(r4)     // Catch:{ all -> 0x0480 }
            java.util.List r4 = r3.A04     // Catch:{ all -> 0x0480 }
            r4.add(r6)     // Catch:{ all -> 0x0480 }
            float r4 = java.lang.Math.abs(r51)     // Catch:{ all -> 0x0480 }
            r3.A00(r4)     // Catch:{ all -> 0x0480 }
            X.Cmm r4 = new X.Cmm     // Catch:{ all -> 0x0480 }
            r4.<init>(r3)     // Catch:{ all -> 0x0480 }
            X.E56 r11 = r1.A0C     // Catch:{ all -> 0x0480 }
        L_0x03a5:
            X.Cac r3 = new X.Cac     // Catch:{ all -> 0x0480 }
            r3.<init>()     // Catch:{ all -> 0x0480 }
            r3.A02(r4)     // Catch:{ all -> 0x0480 }
            X.CrM r5 = new X.CrM     // Catch:{ all -> 0x0480 }
            r5.<init>(r3)     // Catch:{ all -> 0x0480 }
            X.E9F r3 = r10.A05     // Catch:{ all -> 0x0480 }
            X.BVy r4 = new X.BVy     // Catch:{ all -> 0x0480 }
            r4.<init>(r3, r9, r1)     // Catch:{ all -> 0x0480 }
            r3 = r27
            X.CUT r48 = X.C26117Csf.A00(r3, r4, r5, r1)     // Catch:{ all -> 0x0480 }
            android.content.Context r8 = r1.A04     // Catch:{ all -> 0x0480 }
            X.E7r r7 = r1.A0A     // Catch:{ all -> 0x0480 }
            X.C26159CtX.A01(r7)     // Catch:{ all -> 0x0480 }
            X.E55 r6 = r1.A08     // Catch:{ all -> 0x0480 }
            X.CAM r5 = r1.A09     // Catch:{ all -> 0x0480 }
            X.CAH r41 = new X.CAH     // Catch:{ all -> 0x0480 }
            r41.<init>()     // Catch:{ all -> 0x0480 }
            X.DGx r4 = new X.DGx     // Catch:{ all -> 0x0480 }
            r3 = r30
            r4.<init>(r3)     // Catch:{ all -> 0x0480 }
            X.E7l r39 = X.C24667CEh.A00     // Catch:{ all -> 0x0480 }
            X.Cj7 r3 = new X.Cj7     // Catch:{ all -> 0x0480 }
            r36 = r3
            r37 = r8
            r38 = r22
            r40 = r52
            r42 = r27
            r44 = r4
            r45 = r6
            r46 = r5
            r47 = r7
            r49 = r11
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ all -> 0x0480 }
            java.util.concurrent.atomic.AtomicBoolean r4 = r1.A0F     // Catch:{ all -> 0x0480 }
            boolean r4 = r4.get()     // Catch:{ all -> 0x0480 }
            if (r4 != 0) goto L_0x0466
            X.DGq r8 = new X.DGq     // Catch:{ all -> 0x0480 }
            r8.<init>(r3)     // Catch:{ all -> 0x0480 }
            r4 = r33
            java.util.concurrent.ExecutorService r7 = r4.A00     // Catch:{ all -> 0x0480 }
            r6 = 27
            X.DTg r5 = new X.DTg     // Catch:{ all -> 0x0480 }
            r5.<init>(r8, r4, r3, r6)     // Catch:{ all -> 0x0480 }
            r7.execute(r5)     // Catch:{ all -> 0x0480 }
            r3 = r53
            r3.add(r8)     // Catch:{ all -> 0x0480 }
            goto L_0x01c6
        L_0x0413:
            r4 = move-exception
            java.lang.String r3 = "Error creating hash of mediaTrackComposition"
            X.C2Z r5 = new X.C2Z     // Catch:{ all -> 0x0480 }
            r5.<init>(r3, r4)     // Catch:{ all -> 0x0480 }
            goto L_0x0462
        L_0x041c:
            r7 = move-exception
            java.io.File r3 = r6.A05     // Catch:{ all -> 0x0480 }
            if (r3 == 0) goto L_0x0435
            java.lang.String r5 = r3.getName()     // Catch:{ all -> 0x0480 }
        L_0x0425:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0480 }
            java.lang.String r3 = "Error extracting meta data from "
            java.lang.String r3 = X.AnonymousClass001.A1H(r3, r5, r4)     // Catch:{ all -> 0x0480 }
            X.C2Z r5 = new X.C2Z     // Catch:{ all -> 0x0480 }
            r5.<init>(r3, r7)     // Catch:{ all -> 0x0480 }
            goto L_0x0462
        L_0x0435:
            java.lang.String r5 = "unknown file"
            goto L_0x0425
        L_0x0438:
            r4 = move-exception
            java.lang.String r3 = "Error creating hash of mediaTrackComposition"
            X.C2Z r5 = new X.C2Z     // Catch:{ all -> 0x0480 }
            r5.<init>(r3, r4)     // Catch:{ all -> 0x0480 }
            goto L_0x0462
        L_0x0441:
            java.util.Iterator r4 = r53.iterator()     // Catch:{ all -> 0x0480 }
        L_0x0445:
            boolean r3 = r4.hasNext()     // Catch:{ all -> 0x0480 }
            if (r3 == 0) goto L_0x0463
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0480 }
            X.E7p r3 = (X.C28563E7p) r3     // Catch:{ all -> 0x0480 }
            r3.CS0()     // Catch:{ InterruptedException | ExecutionException -> 0x0445 }
            goto L_0x0445
        L_0x0455:
            r4 = move-exception
            java.lang.String r3 = "Unable to create transcode cache folder"
            X.C2Z r5 = new X.C2Z     // Catch:{ all -> 0x0480 }
            r5.<init>(r3, r4)     // Catch:{ all -> 0x0480 }
            goto L_0x0462
        L_0x045e:
            java.lang.IllegalArgumentException r5 = X.BE6.A0j()     // Catch:{ all -> 0x0480 }
        L_0x0462:
            throw r5     // Catch:{ all -> 0x0480 }
        L_0x0463:
            r53.clear()     // Catch:{ all -> 0x0480 }
        L_0x0466:
            X.CrM r4 = r10.A06     // Catch:{ all -> 0x0480 }
            X.C26171Ctn.A02(r4)     // Catch:{ all -> 0x0480 }
            X.Cac r3 = new X.Cac     // Catch:{ all -> 0x0480 }
            r3.<init>()     // Catch:{ all -> 0x0480 }
            X.BzJ r7 = X.C24322BzJ.VIDEO     // Catch:{ all -> 0x0480 }
            X.C26117Csf.A02(r7, r3, r4, r1)     // Catch:{ all -> 0x0480 }
            X.BzJ r5 = X.C24322BzJ.AUDIO     // Catch:{ all -> 0x0480 }
            X.C26117Csf.A02(r5, r3, r4, r1)     // Catch:{ all -> 0x0480 }
            X.CrM r6 = new X.CrM     // Catch:{ all -> 0x0480 }
            r6.<init>(r3)     // Catch:{ all -> 0x0480 }
            goto L_0x04a7
        L_0x0480:
            r3 = move-exception
            java.util.concurrent.ExecutorService r1 = r1.A03     // Catch:{ all -> 0x09a2 }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x09a2 }
            r1.shutdown()     // Catch:{ all -> 0x09a2 }
            goto L_0x04a6
        L_0x048a:
            boolean r12 = r11.canRead()     // Catch:{ all -> 0x09a2 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x09a2 }
            java.lang.String r1 = "source file cannot be read. path="
            r3.append(r1)     // Catch:{ all -> 0x09a2 }
            java.lang.String r1 = r11.getPath()     // Catch:{ all -> 0x09a2 }
            java.io.IOException r1 = X.BE9.A0e(r1, r3)     // Catch:{ all -> 0x09a2 }
            if (r12 != 0) goto L_0x04ef
            X.DZk r3 = new X.DZk     // Catch:{ all -> 0x09a2 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x09a2 }
        L_0x04a6:
            throw r3     // Catch:{ all -> 0x09a2 }
        L_0x04a7:
            java.util.concurrent.ExecutorService r1 = r1.A03     // Catch:{ all -> 0x09a2 }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x09a2 }
            r1.shutdown()     // Catch:{ all -> 0x09a2 }
            java.util.HashMap r3 = r6.A02     // Catch:{ all -> 0x09a2 }
            boolean r1 = r3.isEmpty()     // Catch:{ all -> 0x09a2 }
            r4 = r1 ^ 1
            java.lang.String r1 = "type to track map is empty"
            java.lang.RuntimeException r1 = X.AnonymousClass8BR.A0w(r1)     // Catch:{ all -> 0x09a2 }
            java.lang.String r9 = "media composition validation error"
            if (r4 == 0) goto L_0x0784
            java.util.Iterator r15 = X.C17890vO.A0j(r3)     // Catch:{ all -> 0x09a2 }
        L_0x04c5:
            boolean r1 = r15.hasNext()     // Catch:{ all -> 0x09a2 }
            if (r1 == 0) goto L_0x0555
            java.lang.Object r1 = r15.next()     // Catch:{ all -> 0x09a2 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x09a2 }
            int r3 = r1.size()     // Catch:{ all -> 0x09a2 }
            java.util.ArrayList r10 = X.C17880vN.A0z(r3)     // Catch:{ all -> 0x09a2 }
            java.util.Iterator r14 = X.C17890vO.A0j(r1)     // Catch:{ all -> 0x09a2 }
        L_0x04dd:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x09a2 }
            if (r1 == 0) goto L_0x04c5
            java.lang.Object r8 = r14.next()     // Catch:{ all -> 0x09a2 }
            X.Cmm r8 = (X.C25833Cmm) r8     // Catch:{ all -> 0x09a2 }
            java.util.List r1 = r8.A04     // Catch:{ all -> 0x09a2 }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x09a2 }
        L_0x04ef:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x09a2 }
            if (r1 == 0) goto L_0x0531
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x09a2 }
            X.CcJ r1 = (X.C25271CcJ) r1     // Catch:{ all -> 0x09a2 }
            java.io.File r11 = r1.A05     // Catch:{ all -> 0x09a2 }
            r3 = 1
            java.lang.String r4 = "media track segment validation error"
            if (r11 == 0) goto L_0x051d
            boolean r12 = r11.exists()     // Catch:{ all -> 0x09a2 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x09a2 }
            java.lang.String r1 = "source file not exist. path="
            r3.append(r1)     // Catch:{ all -> 0x09a2 }
            java.lang.String r1 = r11.getPath()     // Catch:{ all -> 0x09a2 }
            java.lang.String r3 = X.AnonymousClass000.A0y(r1, r3)     // Catch:{ all -> 0x09a2 }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x09a2 }
            r1.<init>(r3)     // Catch:{ all -> 0x09a2 }
            goto L_0x054a
        L_0x051d:
            java.net.URL r1 = r1.A06     // Catch:{ all -> 0x09a2 }
            if (r1 != 0) goto L_0x0522
            r3 = 0
        L_0x0522:
            java.lang.String r1 = "url cannot be null"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r1)     // Catch:{ all -> 0x09a2 }
            if (r3 != 0) goto L_0x04ef
            X.DZk r3 = new X.DZk     // Catch:{ all -> 0x09a2 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x09a2 }
            goto L_0x04a6
        L_0x0531:
            java.lang.String r1 = r8.A02     // Catch:{ all -> 0x09a2 }
            boolean r3 = r10.contains(r1)     // Catch:{ all -> 0x09a2 }
            if (r3 == 0) goto L_0x0546
            java.lang.String r1 = "duplicate track name"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r1)     // Catch:{ all -> 0x09a2 }
            X.DZk r3 = new X.DZk     // Catch:{ all -> 0x09a2 }
            r3.<init>(r9, r1)     // Catch:{ all -> 0x09a2 }
            goto L_0x04a6
        L_0x0546:
            r10.add(r1)     // Catch:{ all -> 0x09a2 }
            goto L_0x04dd
        L_0x054a:
            if (r12 == 0) goto L_0x054e
            goto L_0x048a
        L_0x054e:
            X.DZk r3 = new X.DZk     // Catch:{ all -> 0x09a2 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x09a2 }
            goto L_0x04a6
        L_0x0555:
            android.os.Trace.endSection()     // Catch:{ all -> 0x09a2 }
            X.CTK r8 = r0.A0i     // Catch:{ all -> 0x09a2 }
            if (r8 != 0) goto L_0x05bc
            r4 = 640(0x280, float:8.97E-43)
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x09a2 }
            r1 = 360(0x168, float:5.04E-43)
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r1, r4, r3)     // Catch:{ all -> 0x09a2 }
            X.C18070vi.A0d(r10, r2)     // Catch:{ all -> 0x09a2 }
            r9 = 0
            java.lang.String r3 = "dummy"
            java.lang.String r1 = ".jpg"
            java.io.File r9 = java.io.File.createTempFile(r3, r1)     // Catch:{ all -> 0x0587 }
            java.io.FileOutputStream r4 = X.C108945cZ.A19(r9)     // Catch:{ all -> 0x0587 }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0583, all -> 0x057e }
            r1 = 60
            r10.compress(r3, r1, r4)     // Catch:{ Exception -> 0x0583, all -> 0x057e }
            goto L_0x0583
        L_0x057e:
            r3 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0588 }
            goto L_0x0588
        L_0x0583:
            r4.close()     // Catch:{ Exception -> 0x058d }
            goto L_0x058d
        L_0x0587:
            r3 = move-exception
        L_0x0588:
            r10.recycle()     // Catch:{ all -> 0x09a2 }
            goto L_0x04a6
        L_0x058d:
            r10.recycle()     // Catch:{ all -> 0x09a2 }
            X.CXD r1 = new X.CXD     // Catch:{ all -> 0x09a2 }
            r1.<init>(r9)     // Catch:{ all -> 0x09a2 }
            r3 = r57
            long r3 = X.C26162Ctb.A00(r3, r5, r6, r2)     // Catch:{ all -> 0x09a2 }
            r1.A02 = r3     // Catch:{ all -> 0x09a2 }
            X.CcJ r3 = r1.A00()     // Catch:{ all -> 0x09a2 }
            X.Cac r1 = r6.A02()     // Catch:{ all -> 0x09a2 }
            java.util.HashMap r4 = r1.A02     // Catch:{ all -> 0x09a2 }
            r4.remove(r7)     // Catch:{ all -> 0x09a2 }
            java.util.HashMap r4 = r1.A00     // Catch:{ all -> 0x09a2 }
            r4.remove(r7)     // Catch:{ all -> 0x09a2 }
            X.CqR r4 = new X.CqR     // Catch:{ all -> 0x09a2 }
            r4.<init>(r7)     // Catch:{ all -> 0x09a2 }
            X.C25833Cmm.A00(r1, r4, r3)     // Catch:{ all -> 0x09a2 }
            X.CrM r6 = new X.CrM     // Catch:{ all -> 0x09a2 }
            r6.<init>(r1)     // Catch:{ all -> 0x09a2 }
        L_0x05bc:
            X.CUT r1 = r0.A0I     // Catch:{ all -> 0x09a2 }
            X.CpX r3 = new X.CpX     // Catch:{ all -> 0x09a2 }
            r3.<init>(r1)     // Catch:{ all -> 0x09a2 }
            r3.A06 = r6     // Catch:{ all -> 0x09a2 }
            X.CUT r1 = new X.CUT     // Catch:{ all -> 0x09a2 }
            r1.<init>(r3)     // Catch:{ all -> 0x09a2 }
            r0.A0I = r1     // Catch:{ all -> 0x09a2 }
            X.CZT r1 = r1.A08     // Catch:{ all -> 0x09a2 }
            boolean r3 = r1.A02()     // Catch:{ all -> 0x09a2 }
            r1 = r57
            long r3 = X.C26162Ctb.A00(r1, r7, r6, r3)     // Catch:{ all -> 0x09a2 }
            r0.A05 = r3     // Catch:{ all -> 0x09a2 }
            r16 = 0
            int r1 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x076a
            X.A5W r1 = r0.A0G     // Catch:{ all -> 0x09a2 }
            if (r1 != 0) goto L_0x05f1
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x09a2 }
            X.A5W r1 = new X.A5W     // Catch:{ all -> 0x09a2 }
            r9 = r1
            r11 = r16
            r13 = r3
            r9.<init>(r10, r11, r13)     // Catch:{ all -> 0x09a2 }
            r0.A0G = r1     // Catch:{ all -> 0x09a2 }
        L_0x05f1:
            java.lang.String r3 = "doPrepare initialize"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x09a2 }
            A0A(r0, r3, r1)     // Catch:{ all -> 0x09a2 }
            X.CUT r1 = r0.A0I     // Catch:{ Exception -> 0x0620 }
            X.CrM r6 = r1.A06     // Catch:{ Exception -> 0x0620 }
            X.C199610h.A04(r6)     // Catch:{ Exception -> 0x0620 }
            X.DGu r4 = new X.DGu     // Catch:{ Exception -> 0x0620 }
            r4.<init>()     // Catch:{ Exception -> 0x0620 }
            X.CUT r1 = r0.A0I     // Catch:{ Exception -> 0x0620 }
            X.CZT r1 = r1.A08     // Catch:{ Exception -> 0x0620 }
            boolean r3 = r1.A02()     // Catch:{ Exception -> 0x0620 }
            r1 = r57
            X.CXd r11 = X.C25328CdZ.A00(r4, r1, r6, r2, r3)     // Catch:{ Exception -> 0x0620 }
            java.lang.String r3 = "media_metadata"
            java.lang.String r1 = r11.toString()     // Catch:{ Exception -> 0x061e }
            r4 = r18
            r4.put(r3, r1)     // Catch:{ Exception -> 0x061e }
            goto L_0x062e
        L_0x061e:
            r4 = move-exception
            goto L_0x0623
        L_0x0620:
            r4 = move-exception
            r11 = r22
        L_0x0623:
            java.lang.String r3 = "doPrepare: Exception=%s"
            r1 = r19
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x09a2 }
            r1[r2] = r4     // Catch:{ all -> 0x09a2 }
            A0A(r0, r3, r1)     // Catch:{ all -> 0x09a2 }
        L_0x062e:
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x09a2 }
            java.lang.String r1 = "initialize"
            A0A(r0, r1, r3)     // Catch:{ all -> 0x09a2 }
            r0.A02()     // Catch:{ all -> 0x09a2 }
            X.CUT r1 = r0.A0I     // Catch:{ all -> 0x09a2 }
            X.CrM r1 = r1.A06     // Catch:{ all -> 0x09a2 }
            X.C199610h.A04(r1)     // Catch:{ all -> 0x09a2 }
            X.E56 r13 = r0.A0k     // Catch:{ all -> 0x09a2 }
            X.CUT r1 = r0.A0I     // Catch:{ all -> 0x09a2 }
            X.CrM r1 = r1.A06     // Catch:{ all -> 0x09a2 }
            X.E7t r10 = r13.BGt(r1, r2)     // Catch:{ all -> 0x09a2 }
            r0.A0J = r10     // Catch:{ all -> 0x09a2 }
            X.CUT r9 = r0.A0I     // Catch:{ all -> 0x09a2 }
            X.ClM r6 = r9.A04     // Catch:{ all -> 0x09a2 }
            X.CZT r4 = r9.A08     // Catch:{ all -> 0x09a2 }
            X.CAP r3 = r9.A07     // Catch:{ all -> 0x09a2 }
            X.CTb r1 = new X.CTb     // Catch:{ all -> 0x09a2 }
            r25 = r1
            r26 = r58
            r27 = r6
            r28 = r8
            r29 = r3
            r30 = r4
            r31 = r10
            r25.<init>(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x09a2 }
            r0.A0H = r1     // Catch:{ all -> 0x09a2 }
            X.CrM r4 = r9.A06     // Catch:{ all -> 0x09a2 }
            X.ClM r1 = r1.A02     // Catch:{ all -> 0x09a2 }
            r6 = 0
            if (r1 == 0) goto L_0x0676
            boolean r3 = r1.A0I     // Catch:{ all -> 0x09a2 }
            r1 = r19
            if (r3 != r1) goto L_0x0676
            r6 = 1
        L_0x0676:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x09a2 }
            java.util.ArrayList r1 = X.C25329Cda.A01(r11, r4, r1)     // Catch:{ all -> 0x09a2 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x09a2 }
        L_0x0682:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x09a2 }
            if (r1 == 0) goto L_0x068c
            r3.next()     // Catch:{ all -> 0x09a2 }
            goto L_0x0682
        L_0x068c:
            X.CTb r12 = r0.A0H     // Catch:{ all -> 0x09a2 }
            X.E7t r3 = r12.A06     // Catch:{ all -> 0x09a2 }
            android.content.Context r15 = r12.A01     // Catch:{ all -> 0x09a2 }
            if (r15 == 0) goto L_0x07b7
            X.ClM r11 = r12.A02     // Catch:{ all -> 0x09a2 }
            if (r11 == 0) goto L_0x07b7
            X.CZT r10 = r12.A05     // Catch:{ all -> 0x09a2 }
            X.CAP r1 = r12.A04     // Catch:{ all -> 0x09a2 }
            if (r1 == 0) goto L_0x07b7
            X.CTK r9 = r12.A03     // Catch:{ all -> 0x09a2 }
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.videolite.transcoder.resizer.VideoTranscoderJBMR2.VideoEncoderJBMR2"
            X.EAb r6 = r3.BHL()     // Catch:{ all -> 0x09a2 }
            X.C18070vi.A0z(r6, r1)     // Catch:{ all -> 0x09a2 }
            X.DHS r6 = (X.DHS) r6     // Catch:{ all -> 0x09a2 }
            if (r9 == 0) goto L_0x06f7
            r9.A01 = r10     // Catch:{ all -> 0x09a2 }
            boolean r4 = r9.A05     // Catch:{ all -> 0x09a2 }
            if (r4 == 0) goto L_0x06be
            android.view.TextureView r14 = r9.A02     // Catch:{ all -> 0x09a2 }
            r3 = 2
            X.D4h r1 = new X.D4h     // Catch:{ all -> 0x09a2 }
            r1.<init>(r9, r3)     // Catch:{ all -> 0x09a2 }
            r14.setSurfaceTextureListener(r1)     // Catch:{ all -> 0x09a2 }
        L_0x06be:
            android.view.TextureView r14 = r9.A02     // Catch:{ all -> 0x09a2 }
            android.graphics.SurfaceTexture r1 = r14.getSurfaceTexture()     // Catch:{ all -> 0x09a2 }
            if (r4 == 0) goto L_0x06ed
            if (r1 != 0) goto L_0x078b
            java.lang.Object r1 = r9.A04     // Catch:{ all -> 0x09a2 }
            if (r1 == 0) goto L_0x06e7
            monitor-enter(r1)     // Catch:{ all -> 0x09a2 }
        L_0x06cd:
            boolean r3 = r9.A06     // Catch:{ all -> 0x06e3 }
            if (r3 != 0) goto L_0x06dd
            r3 = 2000(0x7d0, double:9.88E-321)
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x06d7 }
            goto L_0x06cd
        L_0x06d7:
            r3 = move-exception
            java.lang.RuntimeException r3 = X.AnonymousClass8BR.A0x(r3)     // Catch:{ all -> 0x06e3 }
            throw r3     // Catch:{ all -> 0x06e3 }
        L_0x06dd:
            monitor-exit(r1)     // Catch:{ all -> 0x09a2 }
            android.graphics.SurfaceTexture r1 = r14.getSurfaceTexture()     // Catch:{ all -> 0x09a2 }
            goto L_0x06ed
        L_0x06e3:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x09a2 }
            goto L_0x04a6
        L_0x06e7:
            java.lang.IllegalStateException r3 = X.C17880vN.A0g()     // Catch:{ all -> 0x09a2 }
            goto L_0x04a6
        L_0x06ed:
            if (r1 != 0) goto L_0x078b
            java.lang.String r1 = "TextureView's SurfaceTexture is null. The TextureView either hasn't been attached to a window yet or it hasn't been initialized."
            java.lang.IllegalStateException r3 = X.AnonymousClass000.A0n(r1)     // Catch:{ all -> 0x09a2 }
            goto L_0x04a6
        L_0x06f7:
            X.BGA r4 = new X.BGA     // Catch:{ all -> 0x09a2 }
            r4.<init>()     // Catch:{ all -> 0x09a2 }
            X.BHC.A02 = r10     // Catch:{ all -> 0x09a2 }
            android.os.Looper r1 = X.BE7.A0G(r4)     // Catch:{ all -> 0x09a2 }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x09a2 }
            r3.<init>(r1, r4)     // Catch:{ all -> 0x09a2 }
            r4.A00 = r3     // Catch:{ all -> 0x09a2 }
            X.DTj r1 = new X.DTj     // Catch:{ all -> 0x09a2 }
            r1.<init>(r3)     // Catch:{ all -> 0x09a2 }
            r4.A02 = r1     // Catch:{ all -> 0x09a2 }
            monitor-enter(r4)     // Catch:{ all -> 0x09a2 }
            android.os.Handler r3 = r4.A00     // Catch:{ all -> 0x0766 }
            r1 = r19
            X.AnonymousClass8BT.A17(r3, r1)     // Catch:{ all -> 0x0766 }
            r3 = 0
        L_0x0719:
            X.BHC r1 = r4.A01     // Catch:{ all -> 0x0766 }
            if (r1 != 0) goto L_0x072b
            java.lang.RuntimeException r1 = r4.A04     // Catch:{ all -> 0x0766 }
            if (r1 != 0) goto L_0x072b
            java.lang.Error r1 = r4.A03     // Catch:{ all -> 0x0766 }
            if (r1 != 0) goto L_0x072b
            r4.wait()     // Catch:{ InterruptedException -> 0x0729 }
            goto L_0x0719
        L_0x0729:
            r3 = 1
            goto L_0x0719
        L_0x072b:
            monitor-exit(r4)     // Catch:{ all -> 0x0766 }
            if (r3 == 0) goto L_0x0731
            X.AnonymousClass8BS.A0x()     // Catch:{ all -> 0x09a2 }
        L_0x0731:
            java.lang.RuntimeException r3 = r4.A04     // Catch:{ all -> 0x09a2 }
            if (r3 != 0) goto L_0x04a6
            java.lang.Error r3 = r4.A03     // Catch:{ all -> 0x09a2 }
            if (r3 != 0) goto L_0x04a6
            X.BHC r4 = r4.A01     // Catch:{ all -> 0x09a2 }
            X.C221718w.A00(r4)     // Catch:{ all -> 0x09a2 }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x09a2 }
            r12.A00 = r4     // Catch:{ all -> 0x09a2 }
            X.DHT r1 = r6.A03     // Catch:{ all -> 0x09a2 }
            X.CVl r9 = r1.A00     // Catch:{ all -> 0x09a2 }
            X.E7s r3 = r1.A03     // Catch:{ all -> 0x09a2 }
            X.CrM r1 = r1.A01     // Catch:{ all -> 0x09a2 }
            r32 = r22
            r25 = r9
            r26 = r15
            r27 = r4
            r28 = r22
            r29 = r11
            r30 = r1
            r31 = r3
            r33 = r10
            X.EAR r1 = r25.A00(r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x09a2 }
            r6.A01 = r1     // Catch:{ all -> 0x09a2 }
            r6.A00 = r11     // Catch:{ all -> 0x09a2 }
            goto L_0x07b2
        L_0x0766:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0766 }
            goto L_0x04a6
        L_0x076a:
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x09a2 }
            java.lang.String r7 = "media composition duration is invalid: %d, normalized media composition is %s"
            java.lang.Object[] r5 = X.AnonymousClass3MW.A1b()     // Catch:{ all -> 0x09a2 }
            X.AnonymousClass3MX.A1S(r5, r2, r3)     // Catch:{ all -> 0x09a2 }
            r1 = r19
            X.BE6.A1H(r6, r5, r1)     // Catch:{ all -> 0x09a2 }
            java.lang.String r1 = java.lang.String.format(r8, r7, r5)     // Catch:{ all -> 0x09a2 }
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r1)     // Catch:{ all -> 0x09a2 }
            goto L_0x04a6
        L_0x0784:
            X.DZk r3 = new X.DZk     // Catch:{ all -> 0x09a2 }
            r3.<init>(r9, r1)     // Catch:{ all -> 0x09a2 }
            goto L_0x04a6
        L_0x078b:
            android.view.Surface r3 = new android.view.Surface     // Catch:{ all -> 0x09a2 }
            r3.<init>(r1)     // Catch:{ all -> 0x09a2 }
            X.DHT r1 = r6.A03     // Catch:{ all -> 0x09a2 }
            X.CVl r14 = r1.A00     // Catch:{ all -> 0x09a2 }
            X.E7s r4 = r1.A03     // Catch:{ all -> 0x09a2 }
            X.CrM r1 = r1.A01     // Catch:{ all -> 0x09a2 }
            r25 = r14
            r26 = r15
            r27 = r3
            r28 = r22
            r29 = r11
            r30 = r1
            r31 = r4
            r32 = r9
            r33 = r10
            X.EAR r1 = r25.A00(r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x09a2 }
            r6.A01 = r1     // Catch:{ all -> 0x09a2 }
            r6.A00 = r11     // Catch:{ all -> 0x09a2 }
        L_0x07b2:
            java.util.Map r1 = r12.A07     // Catch:{ all -> 0x09a2 }
            X.C17880vN.A1O(r6, r1, r2)     // Catch:{ all -> 0x09a2 }
        L_0x07b7:
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x09a2 }
            java.lang.String r1 = "initializeMediaAccuracyCapturer"
            A0A(r0, r1, r3)     // Catch:{ all -> 0x09a2 }
            if (r8 != 0) goto L_0x07c7
            X.DGY r1 = new X.DGY     // Catch:{ all -> 0x09a2 }
            r1.<init>()     // Catch:{ all -> 0x09a2 }
            r0.A0D = r1     // Catch:{ all -> 0x09a2 }
        L_0x07c7:
            X.CmX r8 = new X.CmX     // Catch:{ all -> 0x09a2 }
            r8.<init>()     // Catch:{ all -> 0x09a2 }
            r0.A0E = r8     // Catch:{ all -> 0x09a2 }
            X.E7l r3 = r0.A0D     // Catch:{ all -> 0x09a2 }
            X.CXE r6 = new X.CXE     // Catch:{ all -> 0x09a2 }
            r6.<init>()     // Catch:{ all -> 0x09a2 }
            r1 = r58
            r6.A00 = r1     // Catch:{ all -> 0x09a2 }
            r6.A06 = r13     // Catch:{ all -> 0x09a2 }
            r1 = r56
            r6.A04 = r1     // Catch:{ all -> 0x09a2 }
            r1 = r57
            r6.A03 = r1     // Catch:{ all -> 0x09a2 }
            r1 = r55
            r6.A05 = r1     // Catch:{ all -> 0x09a2 }
            r6.A02 = r3     // Catch:{ all -> 0x09a2 }
            r1 = r22
            r6.A01 = r1     // Catch:{ all -> 0x09a2 }
            X.CAH r11 = r0.A0c     // Catch:{ all -> 0x09a2 }
            X.CUT r9 = r0.A0I     // Catch:{ all -> 0x09a2 }
            X.CTb r4 = r0.A0H     // Catch:{ all -> 0x09a2 }
            X.C199610h.A04(r4)     // Catch:{ all -> 0x09a2 }
            X.E7t r3 = r0.A0J     // Catch:{ all -> 0x09a2 }
            X.Coy r10 = r0.A0b     // Catch:{ all -> 0x09a2 }
            X.Cvh r1 = new X.Cvh     // Catch:{ all -> 0x09a2 }
            r25 = r1
            r26 = r54
            r27 = r10
            r28 = r11
            r29 = r57
            r30 = r8
            r31 = r4
            r32 = r9
            r33 = r3
            r34 = r6
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x09a2 }
            r0.A0q = r1     // Catch:{ all -> 0x09a2 }
            boolean r1 = r0.A0S     // Catch:{ all -> 0x09a2 }
            if (r1 == 0) goto L_0x081d
            X.Cvh r1 = r0.A0q     // Catch:{ all -> 0x09a2 }
            r1.A0B = r2     // Catch:{ all -> 0x09a2 }
        L_0x081d:
            java.lang.String r3 = "initialize mMultipleTrackCoordinatorRealtime.preparePlayer"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x09a2 }
            A0A(r0, r3, r1)     // Catch:{ all -> 0x09a2 }
            X.Cvh r1 = r0.A0q     // Catch:{ all -> 0x09a2 }
            X.CVH r3 = r0.A0h     // Catch:{ all -> 0x09a2 }
            r1.A07 = r3     // Catch:{ all -> 0x09a2 }
            java.util.Map r3 = r1.A0P     // Catch:{ all -> 0x09a2 }
            r3.clear()     // Catch:{ all -> 0x09a2 }
            java.util.Map r4 = r1.A0O     // Catch:{ all -> 0x09a2 }
            r4.clear()     // Catch:{ all -> 0x09a2 }
            X.CUT r9 = r1.A0K     // Catch:{ all -> 0x09a2 }
            X.E7q r11 = r1.A0H     // Catch:{ all -> 0x09a2 }
            X.C26060CrZ.A03(r11, r7, r9, r3)     // Catch:{ all -> 0x09a2 }
            X.CrM r8 = r9.A06     // Catch:{ all -> 0x09a2 }
            X.C26159CtX.A01(r8)     // Catch:{ all -> 0x09a2 }
            java.util.HashMap r4 = r8.A06(r5)     // Catch:{ all -> 0x09a2 }
            if (r4 == 0) goto L_0x08b5
            boolean r3 = r4.isEmpty()     // Catch:{ all -> 0x09a2 }
            if (r3 != 0) goto L_0x08b5
            X.CpL r6 = new X.CpL     // Catch:{ all -> 0x09a2 }
            r6.<init>()     // Catch:{ all -> 0x09a2 }
            X.CAG r3 = X.CAG.$redex_init_class     // Catch:{ all -> 0x09a2 }
            int r12 = r4.size()     // Catch:{ all -> 0x09a2 }
            X.CZT r5 = r9.A08     // Catch:{ all -> 0x09a2 }
            boolean[] r3 = new boolean[r12]     // Catch:{ all -> 0x09a2 }
            r6.A03 = r3     // Catch:{ all -> 0x09a2 }
            java.util.List[] r4 = new java.util.List[r12]     // Catch:{ all -> 0x09a2 }
            r6.A02 = r4     // Catch:{ all -> 0x09a2 }
            r3 = 0
        L_0x0862:
            if (r3 >= r12) goto L_0x086d
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x09a2 }
            r4[r3] = r13     // Catch:{ all -> 0x09a2 }
            int r3 = r3 + 1
            goto L_0x0862
        L_0x086d:
            r3 = 4096(0x1000, float:5.74E-42)
            r6.A00 = r3     // Catch:{ all -> 0x09a2 }
            boolean r3 = r5 instanceof X.BWA     // Catch:{ all -> 0x09a2 }
            if (r3 == 0) goto L_0x0877
            r3 = 2
            goto L_0x0878
        L_0x0877:
            r3 = 1
        L_0x0878:
            X.DGs r5 = new X.DGs     // Catch:{ all -> 0x09a2 }
            r5.<init>(r3)     // Catch:{ all -> 0x09a2 }
            r1.A04 = r5     // Catch:{ all -> 0x09a2 }
            X.CXE r12 = r1.A0L     // Catch:{ all -> 0x09a2 }
            X.CSu r4 = new X.CSu     // Catch:{ all -> 0x09a2 }
            r3 = r22
            r4.<init>(r6, r5, r3, r9)     // Catch:{ all -> 0x09a2 }
            X.CVH r6 = r1.A07     // Catch:{ all -> 0x09a2 }
            X.Coy r5 = r1.A0G     // Catch:{ all -> 0x09a2 }
            X.BVv r3 = new X.BVv     // Catch:{ all -> 0x09a2 }
            r42 = r3
            r43 = r5
            r44 = r4
            r45 = r11
            r46 = r6
            r47 = r1
            r48 = r9
            r49 = r12
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x09a2 }
            r1.A06 = r3     // Catch:{ all -> 0x09a2 }
            android.os.Handler r4 = r3.A0D     // Catch:{ all -> 0x09a2 }
            r3 = 3
            X.AnonymousClass8BT.A17(r4, r3)     // Catch:{ all -> 0x09a2 }
            X.CvW r3 = r1.A06     // Catch:{ all -> 0x09a2 }
            X.CSu r3 = r3.A0F     // Catch:{ all -> 0x09a2 }
            X.E9k r3 = r3.A02     // Catch:{ all -> 0x09a2 }
            X.DGs r3 = r3.BY2()     // Catch:{ all -> 0x09a2 }
            r1.A05 = r3     // Catch:{ all -> 0x09a2 }
        L_0x08b5:
            X.CZT r9 = r9.A08     // Catch:{ all -> 0x09a2 }
            boolean r3 = r9.A02()     // Catch:{ all -> 0x09a2 }
            long r3 = X.C26162Ctb.A00(r11, r7, r8, r3)     // Catch:{ all -> 0x09a2 }
            r1.A0Y = r3     // Catch:{ all -> 0x09a2 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x09a2 }
            r3 = 2
            long r5 = r5.toMicros(r3)     // Catch:{ all -> 0x09a2 }
            long r3 = r1.A0Y     // Catch:{ all -> 0x09a2 }
            long r3 = java.lang.Math.min(r5, r3)     // Catch:{ all -> 0x09a2 }
            r1.A02 = r3     // Catch:{ all -> 0x09a2 }
            java.lang.String r3 = "MultipleTrackCoordinator.decoderPreloading"
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x09a2 }
            long r5 = r1.A0Y     // Catch:{ all -> 0x09a2 }
            long r3 = r1.A02     // Catch:{ all -> 0x09a2 }
            long r29 = java.lang.Math.min(r5, r3)     // Catch:{ all -> 0x09a2 }
            r25 = r7
            r26 = r1
            r27 = r16
            java.util.ArrayList r3 = X.C26243Cvh.A00(r25, r26, r27, r29)     // Catch:{ all -> 0x09a2 }
            r4 = r19
            X.C26243Cvh.A03(r7, r1, r3, r4)     // Catch:{ all -> 0x09a2 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x09a2 }
            r1.A0D = r2     // Catch:{ all -> 0x09a2 }
            r3 = -1
            r1.A01 = r3     // Catch:{ all -> 0x09a2 }
            r3 = r16
            r1.A00 = r3     // Catch:{ all -> 0x09a2 }
            r1.A0A = r2     // Catch:{ all -> 0x09a2 }
            r3 = r19
            r1.A0C = r3     // Catch:{ all -> 0x09a2 }
            java.util.HashMap r3 = r1.A0M     // Catch:{ all -> 0x09a2 }
            r3.clear()     // Catch:{ all -> 0x09a2 }
            X.CTb r3 = r1.A0J     // Catch:{ all -> 0x09a2 }
            if (r3 == 0) goto L_0x092f
            X.C26243Cvh.A04(r1)     // Catch:{ all -> 0x09a2 }
            X.Cml r3 = r1.A08     // Catch:{ all -> 0x09a2 }
            if (r3 == 0) goto L_0x0915
            r3.A00()     // Catch:{ all -> 0x09a2 }
            r6 = 1
            goto L_0x0916
        L_0x0915:
            r6 = 0
        L_0x0916:
            X.DHK r4 = new X.DHK     // Catch:{ all -> 0x09a2 }
            r3 = r19
            r4.<init>(r1, r3)     // Catch:{ all -> 0x09a2 }
            X.DHJ r5 = new X.DHJ     // Catch:{ all -> 0x09a2 }
            r5.<init>(r1, r3)     // Catch:{ all -> 0x09a2 }
            X.BW9 r5 = X.C26060CrZ.A01(r8, r5, r4, r9)     // Catch:{ all -> 0x09a2 }
            r1.A08 = r5     // Catch:{ all -> 0x09a2 }
            if (r6 == 0) goto L_0x092f
            long r3 = r1.A0X     // Catch:{ all -> 0x09a2 }
            r5.A01(r3)     // Catch:{ all -> 0x09a2 }
        L_0x092f:
            X.Byz r1 = X.C24302Byz.READY     // Catch:{ all -> 0x09a2 }
            r0.A0E(r1)     // Catch:{ all -> 0x09a2 }
            if (r60 == 0) goto L_0x0941
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x09a2 }
            long r3 = r60.longValue()     // Catch:{ all -> 0x09a2 }
            long r3 = X.BE6.A0N(r3, r1)     // Catch:{ all -> 0x09a2 }
            goto L_0x0949
        L_0x0941:
            X.A5W r3 = r0.A0G     // Catch:{ all -> 0x09a2 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x09a2 }
            long r3 = r3.A03(r1)     // Catch:{ all -> 0x09a2 }
        L_0x0949:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x09a2 }
            X.CL3 r1 = new X.CL3     // Catch:{ all -> 0x09a2 }
            r1.<init>(r3)     // Catch:{ all -> 0x09a2 }
            r0.A08(r1)     // Catch:{ all -> 0x09a2 }
            long r4 = X.AnonymousClass8BR.A04(r20)
            java.util.HashMap r3 = A00(r0)
            r1 = r18
            r1.putAll(r3)
            java.lang.String r4 = java.lang.Long.toString(r4)
            r3 = r1
            r1 = r23
            r3.put(r1, r4)
            java.lang.Object[] r3 = X.AnonymousClass3MW.A1b()
            X.CUT r1 = r0.A0I
            X.CrM r1 = r1.A06
            r3[r2] = r1
            r3[r19] = r18
            r1 = r24
            A0A(r0, r1, r3)
            X.CUT r0 = r0.A0I
            X.CrM r3 = r0.A06
            X.C199610h.A04(r3)
            X.C18070vi.A0d(r3, r2)
            java.lang.String r2 = X.C18070vi.A0H(r3)
            java.lang.String r1 = "media_composition"
            r0 = r18
            r0.put(r1, r2)
            java.lang.String r2 = r3.A04()
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "media_composition_hash"
            r0.put(r1, r2)
            X.C25933Coy.A00(r10, r0)
            return
        L_0x09a2:
            r6 = move-exception
            long r4 = X.AnonymousClass8BR.A04(r20)
            java.util.HashMap r3 = A00(r0)
            r1 = r18
            r1.putAll(r3)
            java.lang.String r4 = java.lang.Long.toString(r4)
            r3 = r1
            r1 = r23
            r3.put(r1, r4)
            java.lang.Object[] r3 = X.AnonymousClass3MW.A1b()
            X.CUT r1 = r0.A0I
            X.CrM r1 = r1.A06
            r3[r2] = r1
            r3[r19] = r18
            r1 = r24
            A0A(r0, r1, r3)
            X.Coy r4 = r0.A0b
            X.CUT r0 = r0.A0I
            X.CrM r3 = r0.A06
            X.C199610h.A04(r3)
            X.C18070vi.A0d(r3, r2)
            java.lang.String r2 = X.C18070vi.A0H(r3)
            java.lang.String r1 = "media_composition"
            r0 = r18
            r0.put(r1, r2)
            java.lang.String r2 = r3.A04()
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "media_composition_hash"
            r0 = r0
            r0.put(r1, r2)
            r0 = r0
            X.C25933Coy.A00(r4, r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26380Cyg.A0F(java.lang.Long):void");
    }

    public static void A0G(String str, Throwable th) {
        while (th != null && th != th.getCause()) {
            if (th instanceof MediaCodec.CodecException) {
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                Object[] objArr = new Object[5];
                objArr[0] = str;
                BE6.A1M(codecException, objArr, 1);
                objArr[2] = codecException.getDiagnosticInfo();
                BE8.A1P(objArr, codecException.isRecoverable());
                BE8.A1Q(objArr, codecException.isTransient());
                C26294Cx6.A0D("FBMediaCompositionPlayer", "%s::%s::diagnosticInfo=%s::isRecoverable=%s::isTransient=%s", codecException, objArr);
            } else {
                Object[] objArr2 = new Object[2];
                objArr2[0] = str;
                BE6.A1M(th, objArr2, 1);
                C26294Cx6.A0D("FBMediaCompositionPlayer", "%s::%s", th, objArr2);
            }
            th = th.getCause();
        }
    }

    private boolean A0I() {
        if (this.A0r == C24302Byz.READY || this.A0r == C24302Byz.PLAYING || this.A0r == C24302Byz.PAUSED || this.A0r == C24302Byz.SEEKING || this.A0r == C24302Byz.PLAYBACK_COMPLETE) {
            return true;
        }
        return false;
    }

    public void A0L(C24306Bz3 bz3, Object obj, long j) {
        if (this.A0r == C24302Byz.RELEASED) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("sendMessage player already released. ");
            String name = bz3.name();
            A10.append(name);
            A0A(this, AnonymousClass000.A0y(" failed.", A10), BE6.A1Z());
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Player already released. ");
            A102.append(name);
            A0C(this, AnonymousClass000.A0o(" failed.", A102));
            return;
        }
        Handler handler = this.A0Y;
        handler.sendMessageDelayed(handler.obtainMessage(bz3.ordinal(), obj), j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x055a, code lost:
        r0 = new X.CL3(java.lang.Long.valueOf(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0563, code lost:
        A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x056a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r30) {
        /*
            r29 = this;
            r4 = r30
            int r14 = r4.what
            r3 = 1
            r2 = 0
            r17 = 0
            r1 = r29
            if (r14 < 0) goto L_0x05ba
            X.Bz3[] r0 = X.C24306Bz3.values()     // Catch:{ all -> 0x05cf }
            int r0 = r0.length     // Catch:{ all -> 0x05cf }
            if (r14 >= r0) goto L_0x05ba
            X.Bz3[] r0 = X.C24306Bz3.values()     // Catch:{ all -> 0x05cf }
            r17 = r0[r14]     // Catch:{ all -> 0x05cf }
            java.lang.Object r0 = r4.obj     // Catch:{ all -> 0x05cf }
            int r4 = r17.ordinal()     // Catch:{ all -> 0x05cf }
            switch(r4) {
                case 1: goto L_0x0253;
                case 2: goto L_0x0274;
                case 3: goto L_0x024a;
                case 4: goto L_0x0257;
                case 5: goto L_0x0246;
                case 6: goto L_0x0242;
                case 7: goto L_0x023b;
                case 8: goto L_0x04da;
                case 9: goto L_0x0187;
                case 10: goto L_0x014a;
                case 11: goto L_0x00d9;
                case 12: goto L_0x0328;
                case 13: goto L_0x002a;
                case 14: goto L_0x00b1;
                default: goto L_0x0022;
            }     // Catch:{ all -> 0x05cf }
        L_0x0022:
            java.lang.String r0 = "unknown message"
            java.lang.IllegalStateException r4 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x05cf }
            goto L_0x05ce
        L_0x002a:
            X.C199610h.A04(r0)     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x05cf }
            java.lang.String r4 = "processUpdateMediaEffect"
            A0A(r1, r4, r5)     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x05cf }
            r8 = r0[r2]     // Catch:{ all -> 0x05cf }
            X.BzJ r8 = (X.C24322BzJ) r8     // Catch:{ all -> 0x05cf }
            r6 = r0[r3]     // Catch:{ all -> 0x05cf }
            com.facebook.videolite.transcoder.base.composition.MediaEffect r6 = (com.facebook.videolite.transcoder.base.composition.MediaEffect) r6     // Catch:{ all -> 0x05cf }
            r4 = 2
            r7 = r0[r4]     // Catch:{ all -> 0x05cf }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = "doUpdateEffect"
            A0A(r1, r0, r4)     // Catch:{ all -> 0x05cf }
            X.CUT r0 = r1.A0I     // Catch:{ all -> 0x05cf }
            X.CrM r5 = r0.A06     // Catch:{ all -> 0x05cf }
            if (r5 == 0) goto L_0x05e5
            java.util.HashMap r0 = r5.A01     // Catch:{ all -> 0x05cf }
            java.lang.Object r4 = r0.get(r8)     // Catch:{ all -> 0x05cf }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x05cf }
            if (r4 == 0) goto L_0x0084
            boolean r0 = r4.containsKey(r7)     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r4.get(r7)     // Catch:{ all -> 0x05cf }
            X.C6M r0 = (X.C6M) r0     // Catch:{ all -> 0x05cf }
            r0.getClass()     // Catch:{ all -> 0x05cf }
        L_0x0069:
            com.facebook.videolite.transcoder.base.composition.MediaEffect r4 = r0.A01     // Catch:{ all -> 0x05cf }
            boolean r0 = r4.equals(r6)     // Catch:{ all -> 0x05cf }
            if (r0 != 0) goto L_0x05e5
            boolean r0 = r4 instanceof X.BW5     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x05e5
            X.BW5 r4 = (X.BW5) r4     // Catch:{ all -> 0x05cf }
            boolean r0 = r4.equals(r6)     // Catch:{ all -> 0x05cf }
            if (r0 != 0) goto L_0x05e5
            X.BW5 r6 = (X.BW5) r6     // Catch:{ all -> 0x05cf }
            float r0 = r6.A00     // Catch:{ all -> 0x05cf }
            r4.A00 = r0     // Catch:{ all -> 0x05cf }
            goto L_0x00b0
        L_0x0084:
            java.util.HashMap r0 = r5.A02     // Catch:{ all -> 0x05cf }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x05cf }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x05e5
            java.util.Iterator r5 = X.C17890vO.A0i(r0)     // Catch:{ all -> 0x05cf }
        L_0x0092:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x05e5
            java.lang.Object r0 = X.C17890vO.A0P(r5)     // Catch:{ all -> 0x05cf }
            X.Cmm r0 = (X.C25833Cmm) r0     // Catch:{ all -> 0x05cf }
            java.util.HashMap r4 = r0.A03     // Catch:{ all -> 0x05cf }
            boolean r0 = r4.containsKey(r7)     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r4.get(r7)     // Catch:{ all -> 0x05cf }
            X.C26159CtX.A01(r0)     // Catch:{ all -> 0x05cf }
            X.C6M r0 = (X.C6M) r0     // Catch:{ all -> 0x05cf }
            goto L_0x0069
        L_0x00b0:
            return r2
        L_0x00b1:
            X.C199610h.A04(r0)     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x05cf }
            X.CTb r4 = r1.A0H     // Catch:{ all -> 0x05cf }
            if (r4 == 0) goto L_0x05e5
            r5 = r0[r2]     // Catch:{ all -> 0x05cf }
            android.view.Surface r5 = (android.view.Surface) r5     // Catch:{ all -> 0x05cf }
            X.C18070vi.A0d(r5, r2)     // Catch:{ all -> 0x05cf }
            java.util.Map r0 = r4.A07     // Catch:{ all -> 0x05cf }
            java.util.Iterator r4 = X.AnonymousClass000.A15(r0)     // Catch:{ all -> 0x05cf }
        L_0x00c7:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x05e5
            X.DHS r0 = X.BEB.A0O(r4)     // Catch:{ all -> 0x05cf }
            X.EAR r0 = r0.A01     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x00c7
            r0.CQg(r5)     // Catch:{ all -> 0x05cf }
            goto L_0x00c7
        L_0x00d9:
            X.C199610h.A04(r0)     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x05cf }
            r6 = r0[r3]     // Catch:{ all -> 0x05cf }
            r5 = 0
            if (r6 == 0) goto L_0x0148
            X.E7n r6 = (X.C28561E7n) r6     // Catch:{ all -> 0x05cf }
        L_0x00e5:
            r4 = 2
            r4 = r0[r4]     // Catch:{ all -> 0x05cf }
            if (r4 == 0) goto L_0x00ed
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x05cf }
        L_0x00ed:
            r7 = r0[r2]     // Catch:{ all -> 0x05cf }
            X.E7m r7 = (X.C28560E7m) r7     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = "doSendRendererEvent"
            A0A(r1, r0, r4)     // Catch:{ all -> 0x05cf }
            X.CTb r0 = r1.A0H     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x05e5
            r1.A0N = r5     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x05cf }
            r4[r2] = r7     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = "doSendRendererEvent: rendererEvent=%s"
            A0A(r1, r0, r4)     // Catch:{ all -> 0x05cf }
            X.Coy r8 = r1.A0b     // Catch:{ all -> 0x05cf }
            X.C0O r0 = r7.Bap()     // Catch:{ all -> 0x05cf }
            java.lang.String r5 = r0.name()     // Catch:{ all -> 0x05cf }
            java.util.HashMap r4 = A00(r1)     // Catch:{ all -> 0x05cf }
            X.C18070vi.A0d(r5, r2)     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = "render_event"
            r4.put(r0, r5)     // Catch:{ all -> 0x05cf }
            X.C25933Coy.A00(r8, r4)     // Catch:{ all -> 0x05cf }
            X.CTb r0 = r1.A0H     // Catch:{ all -> 0x05cf }
            java.util.Map r0 = r0.A07     // Catch:{ all -> 0x05cf }
            java.util.Iterator r4 = X.AnonymousClass000.A15(r0)     // Catch:{ all -> 0x05cf }
        L_0x0128:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x05e5
            java.lang.Object r0 = X.C17890vO.A0P(r4)     // Catch:{ all -> 0x05cf }
            X.DHS r0 = (X.DHS) r0     // Catch:{ all -> 0x05cf }
            if (r6 == 0) goto L_0x013f
            X.EAR r0 = r0.A01     // Catch:{ all -> 0x05cf }
            X.C26159CtX.A01(r0)     // Catch:{ all -> 0x05cf }
            r0.CHb(r7, r6)     // Catch:{ all -> 0x05cf }
            goto L_0x0128
        L_0x013f:
            X.EAR r0 = r0.A01     // Catch:{ all -> 0x05cf }
            X.C26159CtX.A01(r0)     // Catch:{ all -> 0x05cf }
            r0.CHa(r7)     // Catch:{ all -> 0x05cf }
            goto L_0x0128
        L_0x0148:
            r6 = r5
            goto L_0x00e5
        L_0x014a:
            X.C199610h.A04(r0)     // Catch:{ all -> 0x05cf }
            X.CrM r0 = (X.C26052CrM) r0     // Catch:{ all -> 0x05cf }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05cf }
            java.lang.String r4 = "doUpdateAudioEffects: "
            java.lang.String r5 = X.BEA.A0j(r0, r4, r5)     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x05cf }
            A0A(r1, r5, r4)     // Catch:{ all -> 0x05cf }
            X.CUT r4 = r1.A0I     // Catch:{ all -> 0x05cf }
            X.CpX r5 = new X.CpX     // Catch:{ all -> 0x05cf }
            r5.<init>(r4)     // Catch:{ all -> 0x05cf }
            r5.A06 = r0     // Catch:{ all -> 0x05cf }
            X.CUT r4 = new X.CUT     // Catch:{ all -> 0x05cf }
            r4.<init>(r5)     // Catch:{ all -> 0x05cf }
            r1.A0I = r4     // Catch:{ all -> 0x05cf }
            X.Cvh r4 = r1.A0q     // Catch:{ all -> 0x05cf }
            if (r4 == 0) goto L_0x05e5
            X.Cvh r4 = r1.A0q     // Catch:{ all -> 0x05cf }
            X.CvW r6 = r4.A06     // Catch:{ all -> 0x05cf }
            if (r6 == 0) goto L_0x05e5
            java.lang.String r5 = "doUpdateAudioEffects audioTranscodePipeline.updateAudioEffects"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x05cf }
            A0A(r1, r5, r4)     // Catch:{ all -> 0x05cf }
            android.os.Handler r5 = r6.A0D     // Catch:{ all -> 0x05cf }
            r4 = 8
            X.BE7.A18(r5, r0, r4)     // Catch:{ all -> 0x05cf }
            return r2
        L_0x0187:
            X.C199610h.A04(r0)     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x05cf }
            r9 = r0[r2]     // Catch:{ all -> 0x05cf }
            X.CrM r9 = (X.C26052CrM) r9     // Catch:{ all -> 0x05cf }
            r0 = r0[r3]     // Catch:{ all -> 0x05cf }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x05cf }
            long r4 = r0.longValue()     // Catch:{ all -> 0x05cf }
            java.lang.String r10 = "logUpdateMediaComposition: seekToPositionNs=%s, mediaCompositionUpdateTimeMs=%s"
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x05cf }
            r12 = 2
            X.Byz r8 = r1.A0r     // Catch:{ all -> 0x0220 }
            java.lang.String r6 = "doUpdateMediaComposition: mediaComposition=%s, oldState=%s"
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ all -> 0x0220 }
            X.BE6.A1H(r9, r0, r2)     // Catch:{ all -> 0x0220 }
            r0[r3] = r8     // Catch:{ all -> 0x0220 }
            A0A(r1, r6, r0)     // Catch:{ all -> 0x0220 }
            r1.A0H(r2)     // Catch:{ all -> 0x0220 }
            X.CUT r0 = r1.A0I     // Catch:{ all -> 0x0220 }
            X.CpX r6 = new X.CpX     // Catch:{ all -> 0x0220 }
            r6.<init>(r0)     // Catch:{ all -> 0x0220 }
            r6.A06 = r9     // Catch:{ all -> 0x0220 }
            X.CUT r0 = new X.CUT     // Catch:{ all -> 0x0220 }
            r0.<init>(r6)     // Catch:{ all -> 0x0220 }
            r1.A0I = r0     // Catch:{ all -> 0x0220 }
            r7 = 0
            r1.A0G = r7     // Catch:{ all -> 0x0220 }
            X.CZT r0 = r0.A08     // Catch:{ all -> 0x0220 }
            boolean r0 = r0 instanceof X.BWA     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x01df
            java.lang.String r6 = "doUpdateMediaComposition shouldSeekOnceWhenUpdateMediaComposition doPrepare"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0220 }
            A0A(r1, r6, r0)     // Catch:{ all -> 0x0220 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0220 }
            r1.A0F(r0)     // Catch:{ all -> 0x0220 }
        L_0x01d7:
            X.Byz r0 = X.C24302Byz.PLAYING     // Catch:{ all -> 0x0220 }
            if (r8 != r0) goto L_0x0201
            r1.A05()     // Catch:{ all -> 0x0220 }
            goto L_0x0206
        L_0x01df:
            java.lang.String r6 = "doUpdateMediaComposition doPrepare doSeek"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0220 }
            A0A(r1, r6, r0)     // Catch:{ all -> 0x0220 }
            r1.A0F(r7)     // Catch:{ all -> 0x0220 }
            X.A5W r6 = r1.A0G     // Catch:{ all -> 0x0220 }
            X.C199610h.A04(r6)     // Catch:{ all -> 0x0220 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0220 }
            long r6 = r6.A03(r0)     // Catch:{ all -> 0x0220 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0220 }
            X.CL3 r0 = new X.CL3     // Catch:{ all -> 0x0220 }
            r0.<init>(r6)     // Catch:{ all -> 0x0220 }
            r1.A08(r0)     // Catch:{ all -> 0x0220 }
            goto L_0x01d7
        L_0x0201:
            X.Byz r0 = X.C24302Byz.PAUSED     // Catch:{ all -> 0x0220 }
            r1.A0E(r0)     // Catch:{ all -> 0x0220 }
        L_0x0206:
            long r6 = X.AnonymousClass8BR.A04(r15)     // Catch:{ all -> 0x05cf }
            int r8 = (int) r6     // Catch:{ all -> 0x05cf }
            X.CWa r0 = r1.A0j     // Catch:{ all -> 0x05cf }
            r0.A00(r8)     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x05cf }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x05cf }
            X.BE8.A1A(r0, r6, r2, r8, r3)     // Catch:{ all -> 0x05cf }
            A0A(r1, r10, r6)     // Catch:{ all -> 0x05cf }
            r1.A06(r9, r8, r4)     // Catch:{ all -> 0x05cf }
            return r2
        L_0x0220:
            r11 = move-exception
            long r6 = X.AnonymousClass8BR.A04(r15)     // Catch:{ all -> 0x05cf }
            int r8 = (int) r6     // Catch:{ all -> 0x05cf }
            X.CWa r0 = r1.A0j     // Catch:{ all -> 0x05cf }
            r0.A00(r8)     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x05cf }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x05cf }
            X.BE8.A1A(r0, r6, r2, r8, r3)     // Catch:{ all -> 0x05cf }
            A0A(r1, r10, r6)     // Catch:{ all -> 0x05cf }
            r1.A06(r9, r8, r4)     // Catch:{ all -> 0x05cf }
            throw r11     // Catch:{ all -> 0x05cf }
        L_0x023b:
            X.C199610h.A04(r0)     // Catch:{ all -> 0x05cf }
            X.CL3 r0 = (X.CL3) r0     // Catch:{ all -> 0x05cf }
            goto L_0x0563
        L_0x0242:
            r1.A03()     // Catch:{ all -> 0x05cf }
            return r2
        L_0x0246:
            r1.A0H(r3)     // Catch:{ all -> 0x05cf }
            return r2
        L_0x024a:
            X.C199610h.A04(r0)     // Catch:{ all -> 0x05cf }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x05cf }
            r1.A0F(r0)     // Catch:{ all -> 0x05cf }
            return r2
        L_0x0253:
            r1.A05()     // Catch:{ all -> 0x05cf }
            return r2
        L_0x0257:
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = "doStop"
            A0A(r1, r0, r4)     // Catch:{ all -> 0x05cf }
            boolean r0 = r1.A0I()     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x05e5
            r1.A0H(r2)     // Catch:{ all -> 0x05cf }
            X.A5W r4 = r1.A0G     // Catch:{ all -> 0x05cf }
            X.C199610h.A04(r4)     // Catch:{ all -> 0x05cf }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x05cf }
            long r4 = r4.A03(r0)     // Catch:{ all -> 0x05cf }
            goto L_0x055a
        L_0x0274:
            java.lang.String r8 = "doRelease complete"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = "doRelease"
            A0A(r1, r0, r4)     // Catch:{ all -> 0x05cf }
            android.os.HandlerThread r9 = r1.A0Z     // Catch:{ all -> 0x030e }
            r9.isInterrupted()     // Catch:{ all -> 0x030e }
            r1.A0H(r2)     // Catch:{ all -> 0x030e }
            r7 = 0
            java.util.HashMap r6 = X.C17880vN.A11()     // Catch:{ all -> 0x030e }
            java.util.HashMap r0 = A00(r1)     // Catch:{ all -> 0x030e }
            r6.putAll(r0)     // Catch:{ all -> 0x030e }
            java.util.HashMap r0 = X.C17880vN.A11()     // Catch:{ all -> 0x030e }
            long r4 = r1.A07     // Catch:{ all -> 0x030e }
            java.lang.String r5 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x030e }
            java.lang.String r4 = "overall_playback_time_ms"
            r0.put(r4, r5)     // Catch:{ all -> 0x030e }
            long r4 = r1.A09     // Catch:{ all -> 0x030e }
            java.lang.String r5 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x030e }
            java.lang.String r4 = "overall_stuck_time_ms"
            r0.put(r4, r5)     // Catch:{ all -> 0x030e }
            long r4 = r1.A08     // Catch:{ all -> 0x030e }
            java.lang.String r5 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x030e }
            java.lang.String r4 = "overall_rendered_frames"
            r0.put(r4, r5)     // Catch:{ all -> 0x030e }
            java.util.List r4 = r1.A0O     // Catch:{ all -> 0x030e }
            java.lang.String r5 = r4.toString()     // Catch:{ all -> 0x030e }
            java.lang.String r4 = "stuck_times_list"
            r0.put(r4, r5)     // Catch:{ all -> 0x030e }
            long r4 = r1.A0B     // Catch:{ all -> 0x030e }
            java.lang.String r5 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x030e }
            java.lang.String r4 = "stuck_frames_count"
            r0.put(r4, r5)     // Catch:{ all -> 0x030e }
            X.Cvh r4 = r1.A0q     // Catch:{ all -> 0x030e }
            if (r4 == 0) goto L_0x02dd
            X.Cvh r4 = r1.A0q     // Catch:{ all -> 0x030e }
            long r4 = r4.A03     // Catch:{ all -> 0x030e }
            java.lang.String r5 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x030e }
            java.lang.String r4 = "frame_redraw_count"
            r0.put(r4, r5)     // Catch:{ all -> 0x030e }
        L_0x02dd:
            r6.putAll(r0)     // Catch:{ all -> 0x030e }
            X.Coy r0 = r1.A0b     // Catch:{ all -> 0x030e }
            X.C25933Coy.A00(r0, r6)     // Catch:{ all -> 0x030e }
            X.Byz r0 = X.C24302Byz.RELEASED     // Catch:{ all -> 0x030e }
            r1.A0E(r0)     // Catch:{ all -> 0x030e }
            r1.A0K = r7     // Catch:{ all -> 0x030e }
            r1.A0L = r7     // Catch:{ all -> 0x030e }
            r1.A0C = r7     // Catch:{ all -> 0x030e }
            r9.quit()     // Catch:{ all -> 0x030e }
            r1.A02()     // Catch:{ all -> 0x030e }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x05cf }
            A0A(r1, r8, r0)     // Catch:{ all -> 0x05cf }
            r1.A0T = r3     // Catch:{ all -> 0x05cf }
            android.os.ConditionVariable r0 = r1.A0W     // Catch:{ all -> 0x05cf }
            r0.open()     // Catch:{ all -> 0x05cf }
            boolean r0 = r1.A0p     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x05e5
            java.util.concurrent.ScheduledFuture r0 = r1.A0Q     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x05e5
            r0.cancel(r3)     // Catch:{ all -> 0x05cf }
            return r2
        L_0x030e:
            r4 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x05cf }
            A0A(r1, r8, r0)     // Catch:{ all -> 0x05cf }
            r1.A0T = r3     // Catch:{ all -> 0x05cf }
            android.os.ConditionVariable r0 = r1.A0W     // Catch:{ all -> 0x05cf }
            r0.open()     // Catch:{ all -> 0x05cf }
            boolean r0 = r1.A0p     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x05ce
            java.util.concurrent.ScheduledFuture r0 = r1.A0Q     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x05ce
            r0.cancel(r3)     // Catch:{ all -> 0x05cf }
            goto L_0x05ce
        L_0x0328:
            X.C199610h.A04(r0)     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x05cf }
            java.lang.String r4 = "processUpdateTrim"
            A0A(r1, r4, r5)     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x05cf }
            r5 = r0[r2]     // Catch:{ all -> 0x05cf }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x05cf }
            r7 = r0[r3]     // Catch:{ all -> 0x05cf }
            X.A5W r7 = (X.A5W) r7     // Catch:{ all -> 0x05cf }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = "doUpdateTrim "
            java.lang.String r4 = X.AnonymousClass001.A1H(r0, r5, r4)     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x05cf }
            A0A(r1, r4, r0)     // Catch:{ all -> 0x05cf }
            X.Cvh r0 = r1.A0q     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x05e5
            X.CUT r0 = r1.A0I     // Catch:{ all -> 0x05cf }
            X.CrM r0 = r0.A06     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x05e5
            r1.A0H(r2)     // Catch:{ all -> 0x05cf }
            X.CUT r0 = r1.A0I     // Catch:{ all -> 0x05cf }
            X.CrM r0 = r0.A06     // Catch:{ all -> 0x05cf }
            X.BzJ r4 = X.C24322BzJ.VIDEO     // Catch:{ all -> 0x05cf }
            X.C26052CrM.A01(r0)     // Catch:{ all -> 0x05cf }
            java.util.HashMap r0 = r0.A02     // Catch:{ all -> 0x05cf }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x05cf }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x04cb
            java.util.Iterator r8 = X.C17890vO.A0i(r0)     // Catch:{ all -> 0x05cf }
        L_0x036f:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x04cb
            java.util.Map$Entry r6 = X.AnonymousClass000.A16(r8)     // Catch:{ all -> 0x05cf }
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x05cf }
            X.Cmm r0 = (X.C25833Cmm) r0     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x05cf }
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x036f
            java.lang.Object r10 = r6.getKey()     // Catch:{ all -> 0x05cf }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x05cf }
            int r8 = r10.intValue()     // Catch:{ all -> 0x05cf }
            if (r8 < 0) goto L_0x04cb
            X.Cvh r0 = r1.A0q     // Catch:{ all -> 0x05cf }
            X.C199610h.A04(r0)     // Catch:{ all -> 0x05cf }
            X.Cvh r5 = r1.A0q     // Catch:{ all -> 0x05cf }
            java.util.HashMap r0 = r5.A0M     // Catch:{ all -> 0x05cf }
            java.lang.Object r6 = r0.get(r10)     // Catch:{ all -> 0x05cf }
            if (r6 != 0) goto L_0x03bb
            java.util.Map r0 = r5.A0P     // Catch:{ all -> 0x05cf }
            java.lang.Object r9 = X.C26159CtX.A00(r4, r0)     // Catch:{ all -> 0x05cf }
            android.util.SparseArray r9 = (android.util.SparseArray) r9     // Catch:{ all -> 0x05cf }
            r5 = 0
        L_0x03ab:
            int r0 = r9.size()     // Catch:{ all -> 0x05cf }
            if (r5 >= r0) goto L_0x03bb
            int r0 = r9.keyAt(r5)     // Catch:{ all -> 0x05cf }
            if (r0 != r8) goto L_0x0477
            java.lang.Object r6 = r9.valueAt(r5)     // Catch:{ all -> 0x05cf }
        L_0x03bb:
            X.C26159CtX.A01(r6)     // Catch:{ all -> 0x05cf }
            X.A5W r6 = (X.A5W) r6     // Catch:{ all -> 0x05cf }
            X.Cvh r5 = r1.A0q     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = "updateTrim"
            java.lang.String r12 = "MultipleTrackCoordinatorRealtime"
            X.CAF.A00(r12, r0, r9)     // Catch:{ all -> 0x05cf }
            java.util.HashMap r0 = r5.A0M     // Catch:{ all -> 0x05cf }
            r0.put(r10, r7)     // Catch:{ all -> 0x05cf }
            X.Cju r0 = r5.A0I     // Catch:{ all -> 0x05cf }
            java.util.concurrent.Future r22 = r0.A01(r4, r8)     // Catch:{ all -> 0x05cf }
            java.util.Map r0 = r5.A0P     // Catch:{ all -> 0x05cf }
            java.lang.Object r4 = X.C26159CtX.A00(r4, r0)     // Catch:{ all -> 0x05cf }
            android.util.SparseArray r4 = (android.util.SparseArray) r4     // Catch:{ all -> 0x05cf }
            r9 = 0
            r20 = 0
            r0 = 0
        L_0x03e3:
            int r11 = r4.size()     // Catch:{ all -> 0x05cf }
            if (r0 >= r11) goto L_0x047b
            int r11 = r4.keyAt(r0)     // Catch:{ all -> 0x05cf }
            if (r11 != r8) goto L_0x0449
            java.lang.Object r13 = r4.valueAt(r0)     // Catch:{ all -> 0x05cf }
            X.C26159CtX.A01(r13)     // Catch:{ all -> 0x05cf }
            X.A5W r13 = (X.A5W) r13     // Catch:{ all -> 0x05cf }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x05cf }
            long r18 = r13.A02(r11)     // Catch:{ all -> 0x05cf }
            long r15 = r13.A03(r11)     // Catch:{ all -> 0x05cf }
            long r18 = r18 - r15
            long r20 = r7.A02(r11)     // Catch:{ all -> 0x05cf }
            long r15 = r7.A03(r11)     // Catch:{ all -> 0x05cf }
            long r20 = r20 - r15
            long r20 = r20 - r18
            java.lang.Object r13 = r4.valueAt(r0)     // Catch:{ all -> 0x05cf }
            X.C26159CtX.A01(r13)     // Catch:{ all -> 0x05cf }
            X.A5W r13 = (X.A5W) r13     // Catch:{ all -> 0x05cf }
            long r25 = r13.A03(r11)     // Catch:{ all -> 0x05cf }
            long r27 = r13.A02(r11)     // Catch:{ all -> 0x05cf }
            long r27 = r27 + r20
            X.A5W r13 = new X.A5W     // Catch:{ all -> 0x05cf }
            r23 = r13
            r24 = r11
            r23.<init>(r24, r25, r27)     // Catch:{ all -> 0x05cf }
            r4.put(r8, r13)     // Catch:{ all -> 0x05cf }
        L_0x042f:
            java.lang.Object r13 = r4.valueAt(r0)     // Catch:{ all -> 0x05cf }
            X.C26159CtX.A01(r13)     // Catch:{ all -> 0x05cf }
            X.A5W r13 = (X.A5W) r13     // Catch:{ all -> 0x05cf }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x05cf }
            long r18 = r13.A02(r11)     // Catch:{ all -> 0x05cf }
            long r15 = r13.A03(r11)     // Catch:{ all -> 0x05cf }
            long r18 = r18 - r15
            long r9 = r9 + r18
            int r0 = r0 + 1
            goto L_0x03e3
        L_0x0449:
            int r11 = r4.keyAt(r0)     // Catch:{ all -> 0x05cf }
            if (r11 < r8) goto L_0x042f
            java.lang.Object r13 = r4.valueAt(r0)     // Catch:{ all -> 0x05cf }
            X.C26159CtX.A01(r13)     // Catch:{ all -> 0x05cf }
            X.A5W r13 = (X.A5W) r13     // Catch:{ all -> 0x05cf }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x05cf }
            long r25 = r13.A03(r11)     // Catch:{ all -> 0x05cf }
            long r25 = r25 + r20
            long r27 = r13.A02(r11)     // Catch:{ all -> 0x05cf }
            long r27 = r27 + r20
            X.A5W r13 = new X.A5W     // Catch:{ all -> 0x05cf }
            r23 = r13
            r24 = r11
            r23.<init>(r24, r25, r27)     // Catch:{ all -> 0x05cf }
            int r11 = r4.keyAt(r0)     // Catch:{ all -> 0x05cf }
            r4.put(r11, r13)     // Catch:{ all -> 0x05cf }
            goto L_0x042f
        L_0x0477:
            int r5 = r5 + 1
            goto L_0x03ab
        L_0x047b:
            r5.A0Y = r9     // Catch:{ all -> 0x05cf }
            X.Cml r0 = r5.A09     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x0484
            r0.A00()     // Catch:{ all -> 0x05cf }
        L_0x0484:
            X.C26243Cvh.A04(r5)     // Catch:{ all -> 0x05cf }
            X.Cml r0 = r5.A08     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x048e
            r0.A00()     // Catch:{ all -> 0x05cf }
        L_0x048e:
            r0 = 0
            r5.A08 = r0     // Catch:{ all -> 0x05cf }
            if (r22 == 0) goto L_0x04a5
            java.lang.Object r5 = r22.get()     // Catch:{ all -> 0x05cf }
            X.EAT r5 = (X.EAT) r5     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x05cf }
            r4[r2] = r7     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = "demuxDecodeWrapper.updateTrim timeRange=%s"
            X.CAF.A00(r12, r0, r4)     // Catch:{ all -> 0x05cf }
            r5.CRW(r7)     // Catch:{ all -> 0x05cf }
        L_0x04a5:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x05cf }
            long r10 = r7.A02(r9)     // Catch:{ all -> 0x05cf }
            long r4 = r7.A03(r9)     // Catch:{ all -> 0x05cf }
            long r10 = r10 - r4
            long r7 = r6.A02(r9)     // Catch:{ all -> 0x05cf }
            long r4 = r6.A03(r9)     // Catch:{ all -> 0x05cf }
            long r7 = r7 - r4
            long r10 = r10 - r7
            long r4 = r1.A05     // Catch:{ all -> 0x05cf }
            long r4 = r4 + r10
            r1.A05 = r4     // Catch:{ all -> 0x05cf }
            r10 = 0
            X.A5W r0 = new X.A5W     // Catch:{ all -> 0x05cf }
            r8 = r0
            r12 = r4
            r8.<init>(r9, r10, r12)     // Catch:{ all -> 0x05cf }
            r1.A0G = r0     // Catch:{ all -> 0x05cf }
            return r2
        L_0x04cb:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = "Can Not Find Track: "
            r4.append(r0)     // Catch:{ all -> 0x05cf }
            java.lang.IllegalArgumentException r4 = X.AnonymousClass001.A12(r5, r4)     // Catch:{ all -> 0x05cf }
            goto L_0x05ce
        L_0x04da:
            X.C199610h.A04(r0)     // Catch:{ all -> 0x05cf }
            X.A5W r0 = (X.A5W) r0     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x05cf }
            r5[r2] = r0     // Catch:{ all -> 0x05cf }
            java.lang.String r4 = "doSetPlayTimeRange: timeRange=%s"
            A0A(r1, r4, r5)     // Catch:{ all -> 0x05cf }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x05cf }
            long r5 = r0.A03(r4)     // Catch:{ all -> 0x05cf }
            r7 = 0
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x0528
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x05cf }
            long r20 = r0.A03(r4)     // Catch:{ all -> 0x05cf }
        L_0x04fa:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x05cf }
            long r5 = r0.A02(r4)     // Catch:{ all -> 0x05cf }
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x0525
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x05cf }
            long r6 = r0.A02(r4)     // Catch:{ all -> 0x05cf }
            long r4 = r1.A05     // Catch:{ all -> 0x05cf }
            long r4 = java.lang.Math.min(r6, r4)     // Catch:{ all -> 0x05cf }
        L_0x0510:
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x05cf }
            java.lang.Long r10 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x05cf }
            r9[r2] = r10     // Catch:{ all -> 0x05cf }
            java.lang.Long r6 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x05cf }
            r9[r3] = r6     // Catch:{ all -> 0x05cf }
            java.lang.String r7 = "doSetPlayTimeRange: adjustedStartTime=%d, adjustedEndTime=%d"
            A0A(r1, r7, r9)     // Catch:{ all -> 0x05cf }
            goto L_0x052b
        L_0x0525:
            long r4 = r1.A05     // Catch:{ all -> 0x05cf }
            goto L_0x0510
        L_0x0528:
            r20 = 0
            goto L_0x04fa
        L_0x052b:
            int r7 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x056b
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x05cf }
            X.A5W r6 = new X.A5W     // Catch:{ all -> 0x05cf }
            r18 = r6
            r19 = r7
            r22 = r4
            r18.<init>(r19, r20, r22)     // Catch:{ all -> 0x05cf }
            r1.A0G = r6     // Catch:{ all -> 0x05cf }
            X.Cvh r0 = r1.A0q     // Catch:{ all -> 0x05cf }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0567
            long r4 = r0.A0X     // Catch:{ all -> 0x05cf }
            long r4 = r4 * r8
        L_0x0547:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x05cf }
            boolean r0 = r6.A05(r4, r0)     // Catch:{ all -> 0x05cf }
            if (r0 != 0) goto L_0x05e5
            java.lang.String r4 = "doSetPlayTimeRange: doSeek"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x05cf }
            A0A(r1, r4, r0)     // Catch:{ all -> 0x05cf }
            long r4 = r6.A03(r7)     // Catch:{ all -> 0x05cf }
        L_0x055a:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x05cf }
            X.CL3 r0 = new X.CL3     // Catch:{ all -> 0x05cf }
            r0.<init>(r4)     // Catch:{ all -> 0x05cf }
        L_0x0563:
            r1.A08(r0)     // Catch:{ all -> 0x05cf }
            goto L_0x056a
        L_0x0567:
            r4 = 0
            goto L_0x0547
        L_0x056a:
            return r2
        L_0x056b:
            r12 = 5
            java.lang.Object[] r7 = X.C108945cZ.A1a(r10, r6, r12, r3)     // Catch:{ all -> 0x05cf }
            long r4 = r1.A05     // Catch:{ all -> 0x05cf }
            X.AnonymousClass3MX.A1S(r7, r8, r4)     // Catch:{ all -> 0x05cf }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x05cf }
            long r4 = r0.A03(r4)     // Catch:{ all -> 0x05cf }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x05cf }
            r11 = 3
            r7[r11] = r4     // Catch:{ all -> 0x05cf }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x05cf }
            long r4 = r0.A02(r4)     // Catch:{ all -> 0x05cf }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x05cf }
            r9 = 4
            r7[r9] = r4     // Catch:{ all -> 0x05cf }
            java.lang.String r4 = "doSetPlayTimeRange: play time range start time bigger than end time. adjustedStartTime: %d, adjustedEndTime: %d, totalDuration: %d, timeRange.start: %d, timeRange.end: %d"
            A0A(r1, r4, r7)     // Catch:{ all -> 0x05cf }
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x05cf }
            java.lang.Object[] r6 = X.C108945cZ.A1a(r10, r6, r12, r3)     // Catch:{ all -> 0x05cf }
            long r4 = r1.A05     // Catch:{ all -> 0x05cf }
            X.AnonymousClass3MX.A1S(r6, r8, r4)     // Catch:{ all -> 0x05cf }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x05cf }
            long r4 = r0.A03(r8)     // Catch:{ all -> 0x05cf }
            X.AnonymousClass3MX.A1S(r6, r11, r4)     // Catch:{ all -> 0x05cf }
            long r4 = r0.A02(r8)     // Catch:{ all -> 0x05cf }
            X.AnonymousClass3MX.A1S(r6, r9, r4)     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = "play time range start time bigger than end time. adjustedStartTime: %d, adjustedEndTime: %d, totalDuration: %d, timeRange.start: %d, timeRange.end: %d"
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)     // Catch:{ all -> 0x05cf }
            java.lang.IllegalArgumentException r4 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x05cf }
            goto L_0x05ce
        L_0x05ba:
            java.lang.String r4 = "handleMessage: unknown message=%s"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x05cf }
            X.C17880vN.A1T(r0, r14, r2)     // Catch:{ all -> 0x05cf }
            A0A(r1, r4, r0)     // Catch:{ all -> 0x05cf }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = "unknown message "
            java.lang.IllegalStateException r4 = X.AnonymousClass8BX.A0W(r0, r4, r14)     // Catch:{ all -> 0x05cf }
        L_0x05ce:
            throw r4     // Catch:{ all -> 0x05cf }
        L_0x05cf:
            r4 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r4
            java.lang.String r0 = "handleMessage: onPlaybackException=%s"
            A0A(r1, r0, r3)
            if (r17 == 0) goto L_0x05e6
            java.lang.String r0 = r17.name()
        L_0x05df:
            A0G(r0, r4)
            A0D(r1, r4)
        L_0x05e5:
            return r2
        L_0x05e6:
            java.lang.String r0 = java.lang.String.valueOf(r14)
            goto L_0x05df
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26380Cyg.handleMessage(android.os.Message):boolean");
    }

    public static HashMap A00(C26380Cyg cyg) {
        long j;
        int i;
        HashMap A11 = C17880vN.A11();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        C26243Cvh cvh = cyg.A0q;
        if (cvh != null) {
            j = cvh.A0X * 1000;
        } else {
            j = 0;
        }
        A11.put("current_position_ms", Long.toString(timeUnit.toMillis(j)));
        A11.put("current_state", cyg.A0r.toString());
        C25068CWa cWa = cyg.A0j;
        int i2 = cWa.A00;
        if (i2 == -1) {
            i = 0;
        } else {
            i = (int) (cWa.A02 / ((long) ((((i2 + 10) - cWa.A01) % 10) + 1)));
        }
        A11.put("avg_media_composition_update_time_ms", Integer.toString(i));
        A11.put("overall_audio_volume", Float.toString(cyg.A00));
        A11.put("number_of_video_segments", Integer.toString(cyg.A04));
        A11.put("number_of_audio_segments", Integer.toString(cyg.A01));
        A11.put("number_of_mixed_segments", Integer.toString(cyg.A03));
        String str = cyg.A0N;
        if (str != null) {
            A11.put("applied_effect_id", str);
        }
        A11.put("number_of_frames_dropped", Integer.toString(cyg.A02));
        return A11;
    }

    public static HashMap A01(C26380Cyg cyg, Object obj, long j) {
        HashMap A002 = A00(cyg);
        A002.put(obj, Long.toString(System.currentTimeMillis() - j));
        return A002;
    }

    private void A04() {
        A0A(this, "onPlaybackStopped", BE6.A1Z());
        long j = this.A0A;
        if (j > 0) {
            this.A07 += AnonymousClass8BR.A04(j);
            this.A0A = 0;
        }
        this.A06 = 0;
    }

    public static void A0A(C26380Cyg cyg, String str, Object... objArr) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("mPlayerSessionId: ");
        A10.append(cyg.A0n);
        CAF.A00("FBMediaCompositionPlayer", AnonymousClass001.A1H(" ", str, A10), objArr);
    }

    public static void A0B(C26380Cyg cyg, Throwable th) {
        String stackTraceString;
        HashMap A002 = A00(cyg);
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass001.A1Q(th, A002, A1b);
        A0A(cyg, "logPlayerError: Exception=%s, map=%s", A1b);
        C25933Coy coy = cyg.A0b;
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = Log.getStackTraceString(th);
            C18070vi.A0b(stackTraceString);
        }
        A002.put("error_trace", stackTraceString);
        C25933Coy.A00(coy, A002);
    }

    public static void A0C(C26380Cyg cyg, Throwable th) {
        String stackTraceString;
        HashMap A002 = A00(cyg);
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass001.A1Q(th, A002, A1b);
        A0A(cyg, "logPlayerWarning: Exception=%s, map=%s", A1b);
        C25933Coy coy = cyg.A0b;
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = Log.getStackTraceString(th);
            C18070vi.A0b(stackTraceString);
        }
        A002.put("error_trace", stackTraceString);
        C25933Coy.A00(coy, A002);
    }

    private void A0E(C24302Byz byz) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("setPlaybackState state: ");
        C24302Byz byz2 = byz;
        A10.append(byz);
        A10.append(" mState: ");
        A0A(this, C17890vO.A0V(this.A0r, A10), BE6.A1Z());
        if (this.A0r != byz) {
            C24302Byz byz3 = this.A0r;
            this.A0r = byz;
            C24825CLt cLt = this.A0K;
            if (cLt != null) {
                Handler handler = this.A0C;
                C199610h.A04(handler);
                handler.post(new C21368Aix(this, byz3, cLt, byz2, 11));
            }
        }
    }

    private void A0H(boolean z) {
        C24302Byz byz;
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass8BR.A1L(A1a, 0, z);
        A0A(this, "doPause: isUserTriggeredPause=%s", A1a);
        if (A0I() && this.A0r != (byz = C24302Byz.PAUSED)) {
            C26243Cvh cvh = this.A0q;
            C199610h.A04(cvh);
            cvh.A07();
            A04();
            A0E(byz);
            if (z) {
                C25933Coy.A00(this.A0b, A00(this));
            }
        }
    }

    public void A0J(A5W a5w) {
        A0A(this, "setPlayTimeRange: timeRange=%s", AnonymousClass8BV.A1b(a5w));
        C25933Coy coy = this.A0b;
        HashMap A002 = A00(this);
        A002.put("time_range", C18070vi.A0H(a5w));
        C25933Coy.A00(coy, A002);
        C24306Bz3 bz3 = C24306Bz3.SET_RANGE;
        A07(bz3, this);
        A07(C24306Bz3.SEEK, this);
        A0L(bz3, a5w, 0);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.CVt, X.Blx] */
    public C26380Cyg(Context context, C28559E7l e7l, C25325CdW cdW, CAH cah, E7q e7q, E55 e55, CAM cam, C28564E7r e7r, CTK ctk, CRV crv, E56 e56, File file, String str) {
        long j;
        double d;
        Looper mainLooper;
        boolean z;
        C25752ClM clM = new C25752ClM();
        clM.A0A = VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT;
        clM.A08 = VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH;
        clM.A00 = 3000000;
        clM.A09 = 0;
        clM.A0K = true;
        clM.A02 = 5;
        clM.A0E = null;
        C25965CpX cpX = new C25965CpX();
        cpX.A04 = clM;
        CRV crv2 = crv;
        cpX.A06 = crv2.A01;
        cpX.A05 = null;
        cpX.A08 = crv2.A02;
        cpX.A0K = crv2.A03;
        cpX.A0D = crv2.A00;
        CUT cut = new CUT(cpX);
        boolean z2 = false;
        this.A0S = false;
        this.A00 = 1.0f;
        this.A02 = 0;
        this.A0j = new C25068CWa();
        ? cVt = new C25061CVt(new CLS());
        cVt.A03 = 0;
        if (!Double.isNaN(10.0d) ? true : z2) {
            Object obj = cVt.A01;
            if (obj == null) {
                synchronized (cVt) {
                    obj = cVt.A01;
                    if (obj == null) {
                        obj = C17880vN.A0p();
                        cVt.A01 = obj;
                    }
                }
            }
            synchronized (obj) {
                CWF cwf = cVt.A00.A00;
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                if (cwf.A01) {
                    j = System.nanoTime() - cwf.A00;
                } else {
                    j = 0;
                }
                long A0N2 = BE6.A0N(j, timeUnit);
                long j2 = cVt.A03;
                if (A0N2 > j2) {
                    cVt.A02 = Math.min(cVt.A00, cVt.A02 + (((double) (A0N2 - j2)) / cVt.A01));
                    cVt.A03 = A0N2;
                }
                cVt.A01 = ((double) TimeUnit.SECONDS.toMicros(1)) / 10.0d;
                double d2 = cVt.A00;
                double d3 = 1.0d * 10.0d;
                cVt.A00 = d3;
                if (d2 == Double.POSITIVE_INFINITY) {
                    d = d3;
                } else {
                    d = 0.0d;
                    if (d2 != 0.0d) {
                        d = (cVt.A02 * d3) / d2;
                    }
                }
                cVt.A02 = d;
            }
            this.A0l = cVt;
            this.A0r = C24302Byz.UNPREPARED;
            C26370CyW cyW = new C26370CyW(this, 3);
            this.A0X = cyW;
            C27090DTp dTp = new C27090DTp(this, 1);
            this.A0o = dTp;
            this.A0h = new CVH(this);
            this.A0V = context;
            this.A0i = ctk;
            this.A0d = e7q;
            this.A0k = e56;
            this.A0I = cut;
            this.A0e = e55;
            this.A0f = cam;
            this.A0a = cdW;
            this.A0m = file;
            this.A0g = e7r;
            this.A0c = cah;
            this.A0D = e7l;
            String A0Q2 = C17890vO.A0Q();
            this.A0n = A0Q2;
            this.A0b = new C25933Coy(str, A0Q2);
            this.A0O = AnonymousClass000.A13();
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            this.A0C = new Handler(mainLooper, cyW);
            HandlerThread handlerThread = new HandlerThread("mediacomposition-player", -16);
            this.A0Z = handlerThread;
            Looper A0G2 = BE7.A0G(handlerThread);
            C199610h.A04(A0G2);
            this.A0Y = new C22617BFy(this, A0G2, dTp);
            if (cut.A08 instanceof BWA) {
                z = true;
            } else {
                z = false;
            }
            this.A0p = z;
            A0A(this, "logPlayerCreated", BE6.A1Z());
            C25933Coy.A00(this.A0b, C17880vN.A11());
            return;
        }
        throw BE8.A0W("rate must be positive");
    }
}
