package X;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.util.SparseArray;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.Cmo  reason: case insensitive filesystem */
public final class C25835Cmo {
    public float A00 = 1.0f;
    public int A01 = -1;
    public int A02 = -1;
    public C26052CrM A03;
    public C26380Cyg A04;
    public CRV A05;
    public C131786lf A06;
    public CM3 A07;
    public CM4 A08;
    public boolean A09 = true;
    public final Context A0A;
    public final C28559E7l A0B;
    public final C25325CdW A0C;
    public final E7s A0D;
    public final CTK A0E;
    public final C18030ve A0F;
    public final C25176CaS A0G;
    public final Boolean A0H;
    public final String A0I;
    public final C18100vl A0J;

    public final void A01() {
        C26380Cyg cyg = this.A04;
        if (cyg != null) {
            C26380Cyg.A0A(cyg, "pause", BE6.A1Z());
            C26380Cyg.A09(cyg);
            C26380Cyg.A07(C24306Bz3.PLAY, cyg);
            C26380Cyg.A07(C24306Bz3.DO_WORK, cyg);
            cyg.A0L(C24306Bz3.PAUSE, (Object) null, 0);
            C131786lf r1 = this.A06;
            if (r1 != null) {
                r1.A00((C24302Byz) null, C24302Byz.PAUSED);
            }
        }
    }

    public final void A02() {
        C26380Cyg cyg;
        if (this.A0E.A02.getSurfaceTexture() != null && (cyg = this.A04) != null) {
            C26380Cyg.A0A(cyg, "play", BE6.A1Z());
            cyg.A0L(C24306Bz3.PLAY, (Object) null, 0);
            C131786lf r1 = this.A06;
            if (r1 != null) {
                r1.A00((C24302Byz) null, C24302Byz.PLAYING);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.DGt, X.E7q, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v0, types: [X.CAM, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.DHW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r16v0, types: [X.E7r, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, X.CAH] */
    public final void A03() {
        CRV crv;
        C26052CrM crM;
        long j;
        CTK ctk = this.A0E;
        if (ctk.A02.getSurfaceTexture() != null && (crv = this.A05) != null && (crM = crv.A01) != null) {
            C26052CrM A002 = A00(crM, this);
            C26380Cyg cyg = this.A04;
            if (cyg != null) {
                boolean z = this.A09;
                C25933Coy coy = cyg.A0b;
                HashMap A003 = C26380Cyg.A00(cyg);
                A003.put("loop", String.valueOf(z));
                C25933Coy.A00(coy, A003);
                cyg.A0s = z;
                C26243Cvh cvh = cyg.A0q;
                if (cvh != null) {
                    j = cvh.A0X * 1000;
                } else {
                    j = 0;
                }
                cyg.A0K(A002, j);
                int i = this.A02;
                if (!(i == -1 && this.A01 == -1)) {
                    cyg.A0J(new A5W(TimeUnit.MILLISECONDS, (long) i, (long) this.A01));
                }
                A02();
                return;
            }
            Context context = this.A0A;
            String str = this.A0I;
            ? obj = new Object();
            obj.A00 = new C26864DGv(context, false);
            DH6 dh6 = new DH6();
            ? obj2 = new Object();
            C26259Cw4 cw4 = new C26259Cw4();
            E7s e7s = this.A0D;
            ? obj3 = new Object();
            obj3.A00 = cw4;
            obj3.A01 = e7s;
            CRV crv2 = this.A05;
            if (crv2 != null) {
                C25325CdW cdW = this.A0C;
                ? obj4 = new Object();
                C26380Cyg cyg2 = new C26380Cyg(context, this.A0B, cdW, new Object(), obj, dh6, obj2, obj4, ctk, crv2, obj3, (File) this.A0J.getValue(), str);
                cyg2.A0S = true;
                boolean z2 = this.A09;
                C25933Coy coy2 = cyg2.A0b;
                HashMap A004 = C26380Cyg.A00(cyg2);
                A004.put("loop", String.valueOf(z2));
                C25933Coy.A00(coy2, A004);
                cyg2.A0s = z2;
                C24825CLt cLt = new C24825CLt(this);
                Handler handler = cyg2.A0Y;
                C27076DTa.A00(handler, cyg2, cLt, 37);
                handler.post(new AnonymousClass3C3(cyg2, new C24826CLu(this), 0, 50));
                C27076DTa.A00(handler, cyg2, new COY(cyg2, this), 36);
                Object[] A1a = AnonymousClass3MW.A1a();
                AnonymousClass3MX.A1S(A1a, 0, 0);
                C26380Cyg.A0A(cyg2, "prepareAndSeek: seekToPositionNs=%s", A1a);
                if (cyg2.A0I.A06 != null) {
                    cyg2.A0L(C24306Bz3.PREPARE, new Long(0), 0);
                }
                cyg2.A0J(new A5W(TimeUnit.MILLISECONDS, (long) this.A02, (long) this.A01));
                this.A04 = cyg2;
                CM4 cm4 = this.A08;
                if (cm4 != null) {
                    cm4.A00.A0A.invoke(A002);
                }
                this.A03 = A002;
                return;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
    }

    public final void A04() {
        int i;
        C26380Cyg cyg = this.A04;
        if (cyg != null) {
            C26380Cyg.A0A(cyg, "release", new Object[0]);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("removeAllMessages: ");
            C26380Cyg.A0A(cyg, C17890vO.A0V(C24306Bz3.values(), A10), new Object[0]);
            for (C24306Bz3 A072 : C24306Bz3.values()) {
                C26380Cyg.A07(A072, cyg);
            }
            C26243Cvh cvh = cyg.A0q;
            if (cvh != null) {
                C26380Cyg.A0A(cyg, "release multipleTrackCoordinatorRealtime.cancel", new Object[0]);
                cvh.A0Z = true;
                if (cvh.A0K.A08 instanceof BWA) {
                    CAF.A00("MultipleTrackCoordinatorRealtime", "cancel: mDemuxDecodeWrapperManager.cancel", new Object[0]);
                    C25664Cju cju = cvh.A0I;
                    CAF.A00("DemuxDecodeWrapperManager", "cancel", new Object[0]);
                    for (C24322BzJ bzJ : C24322BzJ.values()) {
                        SparseArray sparseArray = (SparseArray) cju.A01.get(bzJ);
                        if (sparseArray != null) {
                            int size = sparseArray.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                ((EAT) sparseArray.valueAt(i2)).cancel();
                            }
                        }
                    }
                    Iterator A15 = AnonymousClass000.A15(cvh.A0J.A07);
                    while (A15.hasNext()) {
                        EAR ear = BEB.A0O(A15).A01;
                        if (ear != null) {
                            ear.cancel();
                        }
                    }
                }
            }
            C26380Cyg.A09(cyg);
            if (cyg.A0p) {
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
                cyg.A0P = newScheduledThreadPool;
                cyg.A0Q = newScheduledThreadPool.schedule(new C27080DTf((Object) cyg, 1), 5000, TimeUnit.MILLISECONDS);
            }
            cyg.A0L(C24306Bz3.RELEASE, (Object) null, 0);
            ConditionVariable conditionVariable = cyg.A0W;
            if (cyg.A0I.A08 instanceof BWA) {
                i = 1000;
            } else {
                i = 5000;
            }
            conditionVariable.block((long) i);
            if (!cyg.A0T && !(cyg.A0I.A08 instanceof BWA)) {
                C26380Cyg.A0A(cyg, "release timed out", new Object[0]);
                C26380Cyg.A0B(cyg, new TimeoutException("release timed out"));
            }
        }
        this.A04 = null;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.E7l] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.CdW] */
    public /* synthetic */ C25835Cmo(Context context, E7s e7s, C18030ve r10, C25176CaS caS, C4Y c4y) {
        String A0f = C108985cd.A0f();
        ? obj = new Object();
        C18110vm A012 = AnonymousClass1DF.A01(new C27754Dka(context));
        Boolean A0h = AnonymousClass000.A0h();
        ? obj2 = new Object();
        C18070vi.A0d(A012, 10);
        this.A0F = r10;
        this.A0A = context;
        this.A0D = e7s;
        this.A0I = A0f;
        this.A0B = obj;
        this.A0G = caS;
        this.A0J = A012;
        this.A0H = A0h;
        this.A0C = obj2;
        C24021Bu7 bu7 = (C24021Bu7) c4y;
        this.A0E = new CTK(bu7.A00, bu7.A01);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, X.BW5] */
    public static final C26052CrM A00(C26052CrM crM, C25835Cmo cmo) {
        C25186Cac A022 = crM.A02();
        C24322BzJ bzJ = C24322BzJ.AUDIO;
        List list = (List) crM.A00.get(bzJ);
        if (list != null) {
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : list) {
                if (((C6M) next).A01 instanceof BW5) {
                    A13.add(next);
                }
            }
            for (Object next2 : A13) {
                List list2 = (List) A022.A00.get(bzJ);
                if (list2 != null) {
                    list2.remove(next2);
                }
                Log.w("VirtualVideoPlayerWrapper/A global volume effect was already applied");
            }
        }
        float f = cmo.A00;
        ? mediaEffect = new MediaEffect();
        mediaEffect.A00 = f;
        A022.A01(bzJ, mediaEffect);
        return new C26052CrM(A022);
    }
}
