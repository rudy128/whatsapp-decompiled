package X;

import android.content.Context;
import android.media.MediaFormat;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.DHe  reason: case insensitive filesystem */
public class C26873DHe implements EAX {
    public C25092CXd A00;
    public final Context A01;
    public final MediaFormat A02;
    public final E7q A03;
    public final C25820CmX A04;
    public final DHA A05;
    public final CUT A06;
    public final E7t A07;
    public final ExecutorService A08;
    public volatile EAb A09;
    public volatile boolean A0A;
    public volatile Future A0B;

    public void CNe(C25674Ck5 ck5, int i) {
        if (!this.A0A || !this.A06.A08.A01()) {
            C24322BzJ bzJ = C24322BzJ.VIDEO;
            this.A0B = this.A08.submit(new C27124DVl(ck5, this, i, 1, C25327CdY.A00(this.A01, this.A03, bzJ, this.A06)));
        }
    }

    public void cancel() {
        this.A0A = true;
        if (this.A0B != null) {
            if (!this.A0B.isDone() && !this.A06.A08.A01()) {
                this.A0B.cancel(true);
            }
            try {
                this.A0B.get();
            } catch (Throwable unused) {
            }
        }
        release();
    }

    public static void A00(C26873DHe dHe) {
        if (dHe.A09 != null) {
            MediaFormat BVu = dHe.A09.BVu();
            DHA dha = dHe.A05;
            dha.A03 = BVu;
            dha.A00 = dHe.A09.BVy();
            C25820CmX cmX = dHe.A04;
            cmX.A0O = true;
            cmX.A0D = BVu;
        }
    }

    public void BBA(MediaEffect mediaEffect) {
        EAb eAb = this.A09;
        C26159CtX.A01(eAb);
        eAb.BB9(mediaEffect);
    }

    public void BBq(int i) {
        EAb eAb = this.A09;
        C26159CtX.A01(eAb);
        eAb.BBq(i);
    }

    public void BJ1(long j) {
        if (j >= 0) {
            EAb eAb = this.A09;
            C26159CtX.A01(eAb);
            eAb.BJ1(j);
        }
    }

    public boolean BeK() {
        if (this.A0B == null || !this.A0B.isDone()) {
            return false;
        }
        this.A0B.get();
        return true;
    }

    public void CEh(MediaEffect mediaEffect) {
        EAb eAb = this.A09;
        C26159CtX.A01(eAb);
        eAb.CEg(mediaEffect);
    }

    public void CF6() {
        EAb eAb = this.A09;
        C26159CtX.A01(eAb);
        eAb.CF5();
    }

    public void CFD(long j) {
        if (j >= 0) {
            EAb eAb = this.A09;
            C26159CtX.A01(eAb);
            eAb.CFD(j);
        }
    }

    public boolean CNM() {
        EAb eAb = this.A09;
        C26159CtX.A01(eAb);
        eAb.CNL();
        return true;
    }

    public void CRz() {
        if (this.A0B != null) {
            this.A0B.get();
        }
    }

    public void flush() {
        EAb eAb = this.A09;
        C26159CtX.A01(eAb);
        eAb.flush();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Cjg, java.lang.Object] */
    public void release() {
        ? obj = new Object();
        try {
            if (this.A09 != null) {
                this.A09.finish();
                this.A09 = null;
            }
        } catch (Throwable th) {
            C25650Cjg.A00(obj, th);
        }
        Throwable th2 = obj.A01;
        if (th2 != null) {
            throw th2;
        }
    }

    public C26873DHe(Context context, MediaFormat mediaFormat, C25092CXd cXd, E7q e7q, C25820CmX cmX, DHA dha, CUT cut, E7t e7t, ExecutorService executorService) {
        this.A04 = cmX;
        this.A06 = cut;
        this.A02 = mediaFormat;
        this.A08 = executorService;
        this.A03 = e7q;
        this.A01 = context;
        this.A05 = dha;
        this.A07 = e7t;
        this.A00 = cXd;
    }
}
