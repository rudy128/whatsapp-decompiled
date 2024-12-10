package X;

import android.os.Build;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Ck7  reason: case insensitive filesystem */
public class C25676Ck7 {
    public Handler A00;
    public LinkedList A01 = AnonymousClass8BR.A14();
    public final Object A02 = C17880vN.A0p();
    public final C27329Dc1 A03 = new C27329Dc1((C25676Ck7) null);
    public final C27329Dc1 A04 = new C27329Dc1(this);
    public final /* synthetic */ C23860BrH A05;

    public C25676Ck7(C23860BrH brH) {
        this.A05 = brH;
    }

    public static void A00(C25676Ck7 ck7) {
        IllegalStateException th;
        IllegalStateException th2;
        LinkedList linkedList;
        if (ck7.A00 != null) {
            try {
                AnonymousClass00H r2 = C25463CgH.A04;
                if (BE9.A1U(r2)) {
                    Object obj = C25463CgH.A01;
                    obj.getClass();
                    synchronized (obj) {
                        try {
                            if (BE9.A1U(r2)) {
                                Field field = C25463CgH.A03;
                                field.getClass();
                                linkedList = (LinkedList) field.get((Object) null);
                                C27329Dc1 dc1 = ck7.A04;
                                C27329Dc1 dc12 = ck7.A03;
                                if (BE9.A1U(r2)) {
                                    Object obj2 = C25463CgH.A01;
                                    obj2.getClass();
                                    synchronized (obj2) {
                                        try {
                                            Field field2 = C25463CgH.A03;
                                            field2.getClass();
                                            field2.set((Object) null, dc1);
                                            Field field3 = C25463CgH.A02;
                                            field3.getClass();
                                            field3.set((Object) null, dc12);
                                        } catch (Throwable th3) {
                                            while (true) {
                                                th2 = th3;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    th2 = AnonymousClass000.A0n("Check RefQueuedWork.isSupported() first");
                                }
                            } else {
                                th2 = AnonymousClass000.A0n("Check RefQueuedWork.isSupported() first");
                            }
                            throw th2;
                        } catch (Throwable th4) {
                            while (true) {
                                th = th4;
                                break;
                            }
                        }
                    }
                    if (linkedList != null) {
                        synchronized (ck7.A02) {
                            try {
                                ck7.A01.addAll(linkedList);
                                ck7.A00.sendEmptyMessageDelayed(1, 100);
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                        return;
                    }
                    return;
                }
                th = AnonymousClass000.A0n("Check RefQueuedWork.isSupported() first");
                throw th;
            } catch (IllegalAccessException e) {
                ck7.A05.A02(e);
            }
        }
    }

    public void A01() {
        AnonymousClass00H r1 = C25463CgH.A04;
        if (!BE9.A1U(r1)) {
            return;
        }
        if (BE9.A1U(r1)) {
            Handler handler = C25463CgH.A00;
            handler.getClass();
            this.A00 = new C22618BFz(handler.getLooper(), this, 4);
            A00(this);
            if (Build.VERSION.SDK_INT >= 31) {
                C23862BrJ brJ = new C23862BrJ(this, 1);
                List list = C24725CHm.A00;
                if (!list.contains(brJ)) {
                    list.add(brJ);
                }
                if (CGH.A00() == null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Fixie ");
                    A10.append("SharedPrefsANRFixer");
                    Log.w(AnonymousClass001.A1H(" Error message: ", "Unable to hijack ActivityThread", A10));
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass000.A0n("Check RefQueuedWork.isSupported() first");
    }
}
