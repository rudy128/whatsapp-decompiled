package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.DVm  reason: case insensitive filesystem */
public class C27125DVm implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C27125DVm(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj4;
        this.A04 = obj;
        this.A02 = obj3;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r9v2, types: [X.CFu, java.lang.Object] */
    public final Object call() {
        CaptureRequest.Builder builder;
        C25011CTl cTl;
        Camera.ShutterCallback shutterCallback;
        C26348CyA cyA;
        E9K e9k;
        switch (this.A00) {
            case 0:
                C26810DEs dEs = (C26810DEs) this.A01;
                E9C e9c = (E9C) this.A03;
                C25729Ckz ckz = (C25729Ckz) this.A04;
                if (!((Boolean) this.A02).booleanValue()) {
                    C26175Cts.A01((Object) null, 20, BEA.A09(C25971Cpe.A0h, dEs.BZ5()));
                }
                int A05 = dEs.A0I.A05(dEs.A00, dEs.A0Z);
                int i = dEs.A00;
                C25202Cav cav = dEs.A0O;
                C22909BUu A002 = cav.A00(i);
                C26128Csq.A02(C25971Cpe.A0g, A002, A05);
                A002.A02();
                C25971Cpe A022 = cav.A02(dEs.A00);
                Rect rect = (Rect) BE7.A0b(C25971Cpe.A0p, A022);
                int A09 = BEA.A09(C25971Cpe.A0s, A022);
                dEs.A0S.A05(C27082DTh.A00(e9c, 24), dEs.A0R.A03);
                cTl = null;
                if (BEA.A1Y(C25729Ckz.A04, ckz)) {
                    shutterCallback = null;
                } else {
                    shutterCallback = C26810DEs.A0g;
                }
                CZR czr = new CZR((Rect) BE7.A0b(C25971Cpe.A0j, A022), rect, A05, dEs.A00);
                if (BEA.A1Y(C25729Ckz.A06, ckz)) {
                    cyA = new C26348CyA(dEs, e9c, ckz, czr);
                } else {
                    BE9.A1M(dEs.A0M.A00);
                    cyA = null;
                }
                C28111Yx.A02(dEs.A0a);
                dEs.A0a.takePicture(shutterCallback, (Camera.PictureCallback) null, cyA, new C26349CyB(rect, dEs, e9c, ckz, czr, A05, A09));
                CYE cye = dEs.A0K.A00;
                ReentrantLock reentrantLock = cye.A01;
                reentrantLock.lock();
                try {
                    cye.A00 = 0;
                    reentrantLock.unlock();
                    C26078Crs.A01("Some how photo taking call is happening on the UI Thread!!");
                    try {
                        CV9 cv9 = dEs.A0M;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        Object obj = cv9.A00.get();
                        C28111Yx.A02(obj);
                        ((CountDownLatch) obj).await(10000, timeUnit);
                    } catch (InterruptedException e) {
                        Log.e("Camera1Device", "Interrupted while waiting on Camera.takePicture", e);
                    }
                    CV9 cv92 = dEs.A0M;
                    Object obj2 = cv92.A00.get();
                    C28111Yx.A02(obj2);
                    if (((CountDownLatch) obj2).getCount() <= 0) {
                        boolean A1Y = BEA.A1Y(C25729Ckz.A07, ckz);
                        C26078Crs.A01("Performing post photo capture on UI thread");
                        if (dEs.isConnected()) {
                            if (A1Y) {
                                C26810DEs.A04(dEs);
                            }
                            cv92.A00(0);
                            return null;
                        }
                    } else {
                        dEs.A0T.set(true);
                        throw new C27207DZh();
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
                break;
            case 1:
                E9T e9t = (E9T) this.A03;
                if (e9t == null || (builder = (CaptureRequest.Builder) this.A04) == null) {
                    return this.A02;
                }
                BE7.A14(builder, CaptureRequest.CONTROL_AF_TRIGGER, 1);
                CaptureRequest build = builder.build();
                DEU deu = (DEU) this.A02;
                e9t.BEY(build, deu);
                return deu;
            default:
                DOZ doz = (DOZ) this.A01;
                CYO cyo = (CYO) this.A02;
                Map map = (Map) this.A03;
                C25011CTl cTl2 = (C25011CTl) this.A04;
                C25416CfO cfO = C25416CfO.A00;
                if (doz == null) {
                    e9k = null;
                } else {
                    e9k = (E9K) DOZ.A00(doz, 2131428175);
                }
                int andIncrement = CI4.A00.getAndIncrement();
                if (e9k != null) {
                    e9k.BKi(andIncrement);
                    e9k.BKf(andIncrement, andIncrement);
                }
                AnonymousClass0O7.A01("Bloks Bind");
                cTl = C26172Ctp.A00(doz, cyo.A00.A07(map), cTl2, cyo.A01, new Object(), cfO);
                CIG.A00.incrementAndGet();
                AnonymousClass0O7.A00();
                if (e9k != null) {
                    e9k.BKh(andIncrement);
                    break;
                }
                break;
        }
        return cTl;
    }
}
