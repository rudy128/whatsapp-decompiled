package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cyc  reason: case insensitive filesystem */
public class C26376Cyc implements Handler.Callback {
    public EDG A00;
    public final Handler A01;
    public final SparseArray A02 = BE6.A0Q();
    public final C25639CjS A03;
    public final C26045Cr9 A04;
    public final EAL A05;
    public final boolean A06;

    private void A00(EDG edg) {
        EDG edg2 = this.A00;
        if (edg2 != edg) {
            if (edg2 != null) {
                this.A04.A04(edg2);
            }
            this.A00 = edg;
            if (edg != null) {
                this.A04.A03(edg);
            }
            EDG edg3 = this.A00;
            if (edg3 != null) {
                SparseArray sparseArray = this.A02;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    Object valueAt = sparseArray.valueAt(i);
                    C28111Yx.A02(valueAt);
                    C24462C5c c5c = (C24462C5c) valueAt;
                    edg3.CRE(keyAt, c5c.A01, c5c.A00, c5c.A03, c5c.A02, c5c.A04);
                }
            }
        }
    }

    public void A01(EDG edg) {
        Handler handler = this.A01;
        if (handler.getLooper() != Looper.myLooper()) {
            handler.sendMessage(Message.obtain(this.A04.A00, 4, edg));
        } else {
            A00(edg);
        }
    }

    public boolean handleMessage(Message message) {
        int i;
        Message message2 = message;
        int i2 = message2.what;
        if (i2 == 1) {
            C26045Cr9 cr9 = this.A04;
            synchronized (cr9.A09) {
                C26159CtX.A01(cr9.A0D);
                if (cr9.A0E == null) {
                    Map map = C26045Cr9.A0H;
                    Handler handler = cr9.A00;
                    C26045Cr9 cr92 = (C26045Cr9) map.get(handler.getLooper());
                    if (cr92 != null) {
                        C26045Cr9.A00(cr92);
                    }
                    C26159CtX.A01(cr9.A0D);
                    if (cr9.A0E == null) {
                        try {
                            Context context = cr9.A02;
                            C25517ChF chF = cr9.A06;
                            C26140Ct3 ct3 = cr9.A04;
                            C26140Ct3 ct32 = cr9.A05;
                            C18070vi.A0e(context, 1, chF);
                            C26778DDi dDi = new C26778DDi(context, ct3, ct32, chF, cr9);
                            cr9.A0E = dDi;
                            List list = cr9.A08.A00;
                            int size = list.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                ((E98) list.get(i3)).BCi(dDi);
                            }
                            int i4 = ct3.A01;
                            if (cr9.A0A && i4 != (i = cr9.A01)) {
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append("Unsupported OpenGL version. Expected is ");
                                A10.append(i);
                                throw AnonymousClass8BX.A0W(" but got ", A10, i4);
                            }
                        } catch (Throwable th) {
                            try {
                                StringBuilder A102 = AnonymousClass000.A10();
                                A102.append("GlHostImpl.attachGlContext() failed. Current looper: ");
                                C27222Da1.A00(cr9, C17890vO.A0V(Looper.myLooper(), A102), th);
                            } catch (Throwable th2) {
                                cr9.A0G = false;
                                cr9.A0F = false;
                                map.put(handler.getLooper(), cr9);
                                throw th2;
                            }
                        }
                        cr9.A0G = false;
                        cr9.A0F = false;
                        map.put(handler.getLooper(), cr9);
                    }
                }
            }
            this.A05.Bxv(this);
            return false;
        } else if (i2 == 2) {
            this.A05.Bxm(this);
            C26045Cr9 cr93 = this.A04;
            if (cr93.A0F) {
                cr93.A0F = false;
                cr93.A02();
            }
            synchronized (cr93.A09) {
                if (cr93.A0B) {
                    C26045Cr9.A00(cr93);
                }
            }
            return false;
        } else if (i2 == 3) {
            EAL eal = this.A05;
            eal.Bxo(this);
            C26045Cr9 cr94 = this.A04;
            synchronized (cr94.A09) {
                C26045Cr9.A00(cr94);
                C25132CZh cZh = cr94.A08;
                List list2 = cZh.A00;
                cZh.A00();
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((E98) list2.get(i5)).release();
                }
            }
            this.A00 = null;
            eal.Bxn();
            return false;
        } else if (i2 != 4) {
            return false;
        } else {
            A00((EDG) message2.obj);
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Thread$UncaughtExceptionHandler, X.DTo, java.lang.Object] */
    public C26376Cyc(C25639CjS cjS, C26045Cr9 cr9, EAL eal, boolean z) {
        Handler handler = new Handler(cr9.A00.getLooper(), this);
        this.A01 = handler;
        this.A04 = cr9;
        this.A05 = eal;
        eal.Bxk(this);
        this.A03 = cjS;
        this.A06 = z;
        Thread thread = handler.getLooper().getThread();
        WeakReference A0z = AnonymousClass3MW.A0z(this);
        ? obj = new Object();
        obj.A00 = A0z;
        thread.setUncaughtExceptionHandler(obj);
    }
}
