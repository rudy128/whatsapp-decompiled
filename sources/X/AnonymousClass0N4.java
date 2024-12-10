package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0N4  reason: invalid class name */
public final class AnonymousClass0N4 {
    public Object A00;
    public final Object A01 = new Object();
    public final AtomicReference A02 = new AtomicReference(AnonymousClass0G9.A00);

    public static void A00(Object obj) {
        C05200Qx.A05.A02(obj);
    }

    public final Object A01() {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getId() == AnonymousClass0GU.A00) {
            return this.A00;
        }
        C04200Mg r2 = (C04200Mg) this.A02.get();
        int A002 = C04200Mg.A00(r2, currentThread.getId());
        if (A002 >= 0) {
            return r2.A02[A002];
        }
        return null;
    }

    public final void A02(Object obj) {
        long id = Thread.currentThread().getId();
        Object obj2 = obj;
        if (id == AnonymousClass0GU.A00) {
            this.A00 = obj2;
            return;
        }
        synchronized (this.A01) {
            AtomicReference atomicReference = this.A02;
            C04200Mg r11 = (C04200Mg) atomicReference.get();
            int A002 = C04200Mg.A00(r11, id);
            if (A002 < 0) {
                int i = r11.A00;
                Object[] objArr = r11.A02;
                int i2 = 0;
                int i3 = 0;
                for (Object obj3 : objArr) {
                    if (obj3 != null) {
                        i3++;
                    }
                }
                int i4 = i3 + 1;
                long[] jArr = new long[i4];
                Object[] objArr2 = new Object[i4];
                if (i4 > 1) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i) {
                            break;
                        }
                        long j = r11.A01[i5];
                        Object obj4 = objArr[i5];
                        if (j <= id) {
                            if (obj4 != null) {
                                jArr[i2] = j;
                                objArr2[i2] = obj4;
                                i2++;
                            }
                            i5++;
                            if (i2 >= i4) {
                                break;
                            }
                        } else {
                            jArr[i2] = id;
                            objArr2[i2] = obj;
                            i2++;
                            break;
                        }
                    }
                    if (i5 == i) {
                        int i6 = i4 - 1;
                        jArr[i6] = id;
                        objArr2[i6] = obj;
                    } else {
                        while (i2 < i4) {
                            long j2 = r11.A01[i5];
                            Object obj5 = objArr[i5];
                            if (obj5 != null) {
                                jArr[i2] = j2;
                                objArr2[i2] = obj5;
                                i2++;
                            }
                            i5++;
                        }
                    }
                } else {
                    jArr[0] = id;
                    objArr2[0] = obj;
                }
                atomicReference.set(new C04200Mg(jArr, objArr2, i4));
            } else {
                r11.A02[A002] = obj;
            }
        }
    }
}
