package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BwG  reason: case insensitive filesystem */
public final class C24150BwG extends AnonymousClass70X implements TextureView.SurfaceTextureListener {
    public C24302Byz A00;
    public C25835Cmo A01;
    public final Activity A02;
    public final C26052CrM A03;
    public final AnonymousClass190 A04;
    public final C18030ve A05;
    public final C135056ra A06;
    public final C25790Cm1 A07;
    public final C122116Mv A08;
    public final File A09;
    public final C22821Di A0A;
    public final AnonymousClass1OS A0B;

    public boolean A0c() {
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public int A05() {
        long j;
        C26243Cvh cvh;
        C25835Cmo cmo = this.A01;
        if (cmo == null) {
            return 0;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        C26380Cyg cyg = cmo.A04;
        if (cyg == null || (cvh = cyg.A0q) == null) {
            j = 0;
        } else {
            j = cvh.A0X * 1000;
        }
        return (int) timeUnit.toMillis(j);
    }

    public int A06() {
        long j;
        C25835Cmo cmo = this.A01;
        if (cmo == null) {
            return 0;
        }
        C26380Cyg cyg = cmo.A04;
        if (cyg == null || cyg.A0q == null) {
            j = 0;
        } else {
            C26243Cvh cvh = cyg.A0q;
            C199610h.A04(cvh);
            j = cvh.A0Y * 1000;
        }
        return (int) C17880vN.A04(j);
    }

    public View A09() {
        return this.A08;
    }

    public void A0B() {
        C25835Cmo cmo = this.A01;
        if (cmo != null) {
            cmo.A01();
        }
    }

    public void A0D() {
        Log.i("VirtualVideoPlayer/release");
        C25835Cmo cmo = this.A01;
        if (cmo != null) {
            cmo.A04();
        }
        this.A01 = null;
    }

    public void A0E() {
        C25835Cmo cmo = this.A01;
        if (cmo != null) {
            cmo.A02();
        }
    }

    public void A0F() {
        String str;
        C26380Cyg cyg;
        if (this.A01 == null) {
            str = "VirtualVideoPlayer/stop/Already stopped";
        } else {
            str = "VirtualVideoPlayer/stop";
        }
        Log.i(str);
        C25835Cmo cmo = this.A01;
        if (cmo != null) {
            cmo.A01();
        }
        C25835Cmo cmo2 = this.A01;
        if (!(cmo2 == null || (cyg = cmo2.A04) == null)) {
            C26380Cyg.A0A(cyg, "stop", BE6.A1Z());
            C26380Cyg.A09(cyg);
            C25933Coy.A00(cyg.A0b, C26380Cyg.A00(cyg));
            C26380Cyg.A07(C24306Bz3.PLAY, cyg);
            cyg.A0L(C24306Bz3.STOP, (Object) null, 0);
            C131786lf r1 = cmo2.A06;
            if (r1 != null) {
                r1.A00((C24302Byz) null, C24302Byz.PAUSED);
            }
        }
        C25835Cmo cmo3 = this.A01;
        if (cmo3 != null) {
            cmo3.A04();
        }
        this.A01 = null;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [X.DGt, java.lang.Object] */
    public void A0G() {
        if (this.A01 == null) {
            Log.i("VirtualVideoPlayer/initialize/Creating virtualVideoPlayerWrapper");
            View view = this.A08.A06;
            C18070vi.A0W(view);
            TextureView textureView = (TextureView) view;
            textureView.setSurfaceTextureListener(this);
            C24021Bu7 bu7 = new C24021Bu7(textureView);
            C18030ve r9 = this.A05;
            Activity activity = this.A02;
            C25176CaS caS = new C25176CaS(r9);
            C24806CKz cKz = new C24806CKz();
            CAL cal = C25516ChE.A08;
            C24824CLs cLs = new C24824CLs(activity);
            Map map = cKz.A00;
            map.put(cal, cLs);
            if (C18020vd.A05(C18040vf.A02, r9, 12789)) {
                C17880vN.A1P(C25516ChE.A05, map, 100);
                C17880vN.A1P(C25516ChE.A04, map, 1000);
                BE7.A1J(C25516ChE.A0D, map, false);
                map.put(C25516ChE.A0B, true);
                map.put(C25516ChE.A0A, true);
                CAL cal2 = C25516ChE.A06;
                ? obj = new Object();
                obj.A00 = new C26864DGv(activity, false);
                map.put(cal2, obj);
            }
            C25835Cmo cmo = new C25835Cmo(activity, new DHG(new C25516ChE(cKz)), r9, caS, bu7);
            this.A01 = cmo;
            C26052CrM crM = this.A03;
            cmo.A09 = false;
            HashSet A12 = C17880vN.A12();
            CRU cru = new CRU();
            cru.A00 = C25835Cmo.A00(crM, cmo);
            cru.A01 = cmo.A0G.A01;
            cru.A03 = C18070vi.A19(cmo.A0H, true);
            cru.A02 = A12;
            CRV crv = new CRV(cru);
            cmo.A05 = crv;
            cmo.A03 = crv.A01;
            cmo.A02 = -1;
            cmo.A01 = -1;
            cmo.A03();
            C25835Cmo cmo2 = this.A01;
            if (cmo2 != null) {
                cmo2.A06 = new C131786lf(this);
                cmo2.A07 = new CM3(this);
                cmo2.A08 = new CM4(this);
            }
            this.A06.A00();
            Log.i("VirtualVideoPlayer/initialize");
        }
    }

    public void A0M(int i) {
        C26380Cyg cyg;
        C25835Cmo cmo = this.A01;
        if (cmo != null && (cyg = cmo.A04) != null) {
            CL3 cl3 = new CL3(Long.valueOf(TimeUnit.NANOSECONDS.toMicros(TimeUnit.MILLISECONDS.toNanos((long) i))));
            C26380Cyg.A0A(cyg, "seekTo: %s", AnonymousClass8BV.A1b(cl3));
            C24306Bz3 bz3 = C24306Bz3.SEEK;
            C26380Cyg.A07(bz3, cyg);
            cyg.A0L(bz3, cl3, 0);
        }
    }

    public void A0W(boolean z) {
        long j;
        C25835Cmo cmo = this.A01;
        if (cmo != null) {
            float f = 1.0f;
            if (z) {
                f = 0.0f;
            }
            if (Float.compare(f, cmo.A00) != 0) {
                cmo.A00 = f;
                C26380Cyg cyg = cmo.A04;
                C26052CrM crM = cmo.A03;
                if (cyg != null && crM != null) {
                    C26052CrM A002 = C25835Cmo.A00(crM, cmo);
                    if (CAK.A00(crM, A002)) {
                        C24322BzJ bzJ = C24322BzJ.AUDIO;
                        if (!(!crM.A05(bzJ).equals(A002.A05(bzJ)))) {
                            return;
                        }
                    }
                    C26243Cvh cvh = cyg.A0q;
                    if (cvh != null) {
                        j = cvh.A0X * 1000;
                    } else {
                        j = 0;
                    }
                    cyg.A0K(A002, j);
                    CM4 cm4 = cmo.A08;
                    if (cm4 != null) {
                        cm4.A00.A0A.invoke(A002);
                    }
                    cmo.A03 = A002;
                }
            }
        }
    }

    public boolean A0a() {
        C26380Cyg cyg;
        C25835Cmo cmo = this.A01;
        if (cmo == null || (cyg = cmo.A04) == null || cyg.A0r != C24302Byz.PLAYING) {
            return false;
        }
        return true;
    }

    public boolean A0b() {
        int ordinal;
        C24302Byz byz = this.A00;
        if (byz == null || (ordinal = byz.ordinal()) == -1 || ordinal == 0 || ordinal == 1) {
            return false;
        }
        return true;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C25835Cmo cmo = this.A01;
        if (cmo != null) {
            cmo.A03();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.6Mk, X.6Mv] */
    public C24150BwG(Activity activity, C26052CrM crM, AnonymousClass190 r6, AnonymousClass11C r7, C18030ve r8, C135056ra r9, C25790Cm1 cm1, File file, C22821Di r12, AnonymousClass1OS r13) {
        this.A05 = r8;
        this.A04 = r6;
        this.A09 = file;
        this.A02 = activity;
        this.A06 = r9;
        this.A07 = cm1;
        this.A0B = r13;
        this.A0A = r12;
        this.A03 = crM;
        ? r2 = new C122006Mk(activity, 2131627531, false);
        r2.setLayoutResizeMode(0);
        r2.A07.setAspectRatio(((float) cm1.A01) / ((float) cm1.A00));
        this.A08 = r2;
        this.A0C = true;
        this.A05 = r7;
        this.A02 = activity;
    }

    public int A07() {
        return A05();
    }

    public Bitmap A08() {
        if (!(!A0b())) {
            return null;
        }
        return this.A08.getCurrentFrame();
    }

    public boolean A0Z() {
        return !A0b();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        A0F();
        return true;
    }
}
