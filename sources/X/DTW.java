package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class DTW implements Runnable {
    public final TaskCompletionSource A00;

    public DTW() {
        this.A00 = null;
    }

    public DTW(TaskCompletionSource taskCompletionSource) {
        this.A00 = taskCompletionSource;
    }

    public final void run() {
        IInterface iInterface;
        Map map;
        try {
            if (this instanceof Bj7) {
                Bj7 bj7 = (Bj7) this;
                C25994CqA cqA = bj7.A02;
                synchronized (cqA.A07) {
                    try {
                        TaskCompletionSource taskCompletionSource = bj7.A00;
                        cqA.A0A.add(taskCompletionSource);
                        taskCompletionSource.zza.addOnCompleteListener(new C26945DKa(taskCompletionSource, cqA));
                        if (cqA.A0B.getAndIncrement() > 0) {
                            cqA.A06.A01("Already connected to the service.", BE6.A1Z());
                        }
                        DTW dtw = bj7.A01;
                        if (cqA.A01 == null && !cqA.A02) {
                            C25712Cki cki = cqA.A06;
                            cki.A01("Initiate binding to the service.", new Object[0]);
                            List<DTW> list = cqA.A09;
                            list.add(dtw);
                            C26336Cxt cxt = new C26336Cxt(cqA);
                            cqA.A00 = cxt;
                            cqA.A02 = true;
                            if (!cqA.A03.bindService(cqA.A04, cxt, 1)) {
                                cki.A01("Failed to bind to the service.", new Object[0]);
                                cqA.A02 = false;
                                for (DTW dtw2 : list) {
                                    C27214DZp dZp = new C27214DZp();
                                    TaskCompletionSource taskCompletionSource2 = dtw2.A00;
                                    if (taskCompletionSource2 != null) {
                                        taskCompletionSource2.trySetException(dZp);
                                    }
                                }
                                list.clear();
                            }
                        } else if (cqA.A02) {
                            cqA.A06.A01("Waiting to bind to the service.", new Object[0]);
                            cqA.A09.add(dtw);
                        } else {
                            dtw.run();
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } else if (this instanceof C23523Bj8) {
                C23523Bj8 bj8 = (C23523Bj8) this;
                if (bj8.A00 != 0) {
                    try {
                        C25542Chf chf = (C25542Chf) bj8.A02;
                        ECD ecd = (ECD) chf.A00.A01;
                        String str = chf.A01;
                        Bundle A0D = C17880vN.A0D();
                        synchronized (CFL.class) {
                            try {
                                map = CFL.A00;
                                C17880vN.A1P("java", map, 20002);
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        A0D.putInt("playcore_version_code", BE9.A0F("java", map));
                        if (map.containsKey("native")) {
                            A0D.putInt("playcore_native_version", BE9.A0F("native", map));
                        }
                        if (map.containsKey("unity")) {
                            A0D.putInt("playcore_unity_version", BE9.A0F("unity", map));
                        }
                        Bj4 bj4 = new Bj4((TaskCompletionSource) bj8.A01, chf);
                        C26402Cz2 cz2 = (C26402Cz2) ecd;
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                        obtain.writeString(str);
                        obtain.writeInt(1);
                        A0D.writeToParcel(obtain, 0);
                        obtain.writeStrongBinder(bj4);
                        try {
                            cz2.A00.transact(2, obtain, (Parcel) null, 1);
                            obtain.recycle();
                        } catch (Throwable th3) {
                            th = th3;
                            obtain.recycle();
                            throw th;
                        }
                    } catch (RemoteException e) {
                        C25712Cki cki2 = C25542Chf.A02;
                        Object[] A1a = AnonymousClass3MW.A1a();
                        A1a[0] = ((C25542Chf) bj8.A02).A01;
                        if (Log.isLoggable("PlayCore", 6)) {
                            Log.e("PlayCore", C25712Cki.A00(cki2.A00, "error requesting in-app review for %s", A1a), e);
                        }
                        ((TaskCompletionSource) bj8.A01).trySetException(AnonymousClass8BR.A0x(e));
                    }
                } else {
                    IBinder iBinder = (IBinder) bj8.A01;
                    if (iBinder == null) {
                        iInterface = null;
                    } else {
                        iInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                        if (!(iInterface instanceof ECD)) {
                            iInterface = new C26402Cz2(iBinder);
                        }
                    }
                    C25994CqA cqA2 = ((C26336Cxt) bj8.A02).A00;
                    cqA2.A01 = iInterface;
                    C25712Cki cki3 = cqA2.A06;
                    cki3.A01("linkToDeath", new Object[0]);
                    try {
                        cqA2.A01.asBinder().linkToDeath(cqA2.A05, 0);
                    } catch (RemoteException e2) {
                        Object[] objArr = new Object[0];
                        if (Log.isLoggable("PlayCore", 6)) {
                            Log.e("PlayCore", C25712Cki.A00(cki3.A00, "linkToDeath failed", objArr), e2);
                        }
                    }
                    cqA2.A02 = false;
                    List<Object> list2 = cqA2.A09;
                    for (Object A1P : list2) {
                        C108945cZ.A1P(A1P);
                    }
                    list2.clear();
                }
            } else {
                Bj6 bj6 = (Bj6) this;
                if (bj6.A00 != 0) {
                    C25994CqA cqA3 = ((C26336Cxt) bj6.A01).A00;
                    cqA3.A06.A01("unlinkToDeath", new Object[0]);
                    cqA3.A01.asBinder().unlinkToDeath(cqA3.A05, 0);
                    cqA3.A01 = null;
                    cqA3.A02 = false;
                    return;
                }
                C25994CqA cqA4 = (C25994CqA) bj6.A01;
                synchronized (cqA4.A07) {
                    try {
                        AtomicInteger atomicInteger = cqA4.A0B;
                        if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() <= 0) {
                            if (cqA4.A01 != null) {
                                cqA4.A06.A01("Unbind from service.", new Object[0]);
                                cqA4.A03.unbindService(cqA4.A00);
                                cqA4.A02 = false;
                                cqA4.A01 = null;
                                cqA4.A00 = null;
                            }
                            C25994CqA.A00(cqA4);
                        } else {
                            cqA4.A06.A01("Leaving the connection open for other ongoing calls.", new Object[0]);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
            }
        } catch (Exception e3) {
            TaskCompletionSource taskCompletionSource3 = this.A00;
            if (taskCompletionSource3 != null) {
                taskCompletionSource3.trySetException(e3);
            }
        }
    }
}
