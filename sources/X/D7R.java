package X;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

public final class D7R implements E7E {
    public static final ReentrantLock A02 = new ReentrantLock();
    public static volatile D7R A03;
    public E7F A00;
    public final CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();

    public void CDy(Context context, AnonymousClass1GV r10, Executor executor) {
        Activity activity;
        Object obj;
        C192929pG r3;
        C18070vi.A0d(context, 0);
        if (!(context instanceof Activity) || (activity = (Activity) context) == null) {
            r10.accept(new C192929pG(C18460wS.A00));
            return;
        }
        ReentrantLock reentrantLock = A02;
        reentrantLock.lock();
        try {
            E7F e7f = this.A00;
            if (e7f == null) {
                r10.accept(new C192929pG(C18460wS.A00));
            } else {
                CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
                boolean z = false;
                if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C18070vi.A18(((C24944CQu) it.next()).A01, activity)) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                C24944CQu cQu = new C24944CQu(activity, r10, executor);
                copyOnWriteArrayList.add(cQu);
                if (!z) {
                    D7U d7u = (D7U) e7f;
                    IBinder A002 = C24511C7f.A00(activity);
                    if (A002 != null) {
                        d7u.A02(activity, A002);
                    } else {
                        AnonymousClass3MZ.A0F(activity).addOnAttachStateChangeListener(new C26570D4k(activity, d7u));
                    }
                } else {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (activity.equals(((C24944CQu) obj).A01)) {
                            break;
                        }
                    }
                    C24944CQu cQu2 = (C24944CQu) obj;
                    if (!(cQu2 == null || (r3 = cQu2.A00) == null)) {
                        cQu.A00 = r3;
                        cQu.A03.execute(new C21471Akc((Object) cQu, (Object) r3, 16));
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void CQC(AnonymousClass1GV r8) {
        C18070vi.A0d(r8, 0);
        synchronized (A02) {
            E7F e7f = this.A00;
            if (e7f != null) {
                ArrayList A13 = AnonymousClass000.A13();
                CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C24944CQu cQu = (C24944CQu) it.next();
                    if (cQu.A02 == r8) {
                        A13.add(cQu);
                    }
                }
                copyOnWriteArrayList.removeAll(A13);
                Iterator it2 = A13.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((C24944CQu) it2.next()).A01;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (C18070vi.A18(((C24944CQu) it3.next()).A01, activity)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    e7f.CAb(activity);
                }
            }
        }
    }

    public D7R(E7F e7f) {
        this.A00 = e7f;
        E7F e7f2 = this.A00;
        if (e7f2 != null) {
            e7f2.CIp(new D7S(this));
        }
    }
}
