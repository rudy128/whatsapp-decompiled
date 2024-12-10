package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1DS  reason: invalid class name */
public abstract class AnonymousClass1DS {
    public static final Object A0A = new Object();
    public int A00;
    public int A01;
    public C001200q A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Object A06;
    public final Runnable A07;
    public volatile Object A08;
    public volatile Object A09;

    public void A07() {
    }

    public void A08() {
    }

    private void A04(AnonymousClass1J6 r3) {
        if (!r3.A01) {
            return;
        }
        if (!(r3 instanceof AnonymousClass1J7) || ((C23391Fw) ((AnonymousClass1J7) r3).A00.getLifecycle()).A02.A00(C23401Fx.STARTED)) {
            int i = r3.A00;
            int i2 = this.A01;
            if (i < i2) {
                r3.A00 = i2;
                r3.A02.Bo9(this.A08);
                return;
            }
            return;
        }
        r3.A00(false);
    }

    public Object A06() {
        Object obj = this.A08;
        if (obj == A0A) {
            return null;
        }
        return obj;
    }

    public void A09(AnonymousClass1F9 r5) {
        A05("removeObservers");
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AnonymousClass1J6 r1 = (AnonymousClass1J6) entry.getValue();
            if ((r1 instanceof AnonymousClass1J7) && ((AnonymousClass1J7) r1).A00 == r5) {
                A0D((C22851Dl) entry.getKey());
            }
        }
    }

    public void A0A(AnonymousClass1F9 r4, C22851Dl r5) {
        A05("observe");
        if (((C23391Fw) r4.getLifecycle()).A02 != C23401Fx.DESTROYED) {
            AnonymousClass1J7 r2 = new AnonymousClass1J7(r4, this, r5);
            AnonymousClass1J6 r1 = (AnonymousClass1J6) this.A02.A02(r5, r2);
            if (r1 == null) {
                r4.getLifecycle().A05(r2);
            } else if (!(r1 instanceof AnonymousClass1J7) || ((AnonymousClass1J7) r1).A00 != r4) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
        }
    }

    public void A0B(AnonymousClass1J6 r5) {
        if (this.A05) {
            this.A04 = true;
            return;
        }
        this.A05 = true;
        do {
            this.A04 = false;
            if (r5 == null) {
                C001200q r0 = this.A02;
                C006702y r2 = new C006702y(r0);
                r0.A03.put(r2, false);
                while (r2.hasNext()) {
                    A04((AnonymousClass1J6) ((Map.Entry) r2.next()).getValue());
                    if (this.A04) {
                        break;
                    }
                }
            } else {
                A04(r5);
                r5 = null;
            }
        } while (this.A04);
        this.A05 = false;
    }

    public void A0C(C22851Dl r4) {
        A05("observeForever");
        AnonymousClass27w r2 = new AnonymousClass27w(this, r4);
        Object A022 = this.A02.A02(r4, r2);
        if (A022 instanceof AnonymousClass1J7) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (A022 == null) {
            r2.A00(true);
        }
    }

    public void A0D(C22851Dl r4) {
        A05("removeObserver");
        AnonymousClass1J6 r2 = (AnonymousClass1J6) this.A02.A01(r4);
        if (r2 != null) {
            if (r2 instanceof AnonymousClass1J7) {
                AnonymousClass1J7 r1 = (AnonymousClass1J7) r2;
                r1.A00.getLifecycle().A06(r1);
            }
            r2.A00(false);
        }
    }

    public void A0E(Object obj) {
        boolean z;
        synchronized (this.A06) {
            z = false;
            if (this.A09 == A0A) {
                z = true;
            }
            this.A09 = obj;
        }
        if (z) {
            C001600u.A00().A02(this.A07);
        }
    }

    public AnonymousClass1DS(Object obj) {
        this.A06 = new Object();
        this.A02 = new C001200q();
        this.A00 = 0;
        this.A09 = A0A;
        this.A07 = new C449025f((Object) this, 4);
        this.A08 = obj;
        this.A01 = 0;
    }

    public static void A05(String str) {
        if (!C001600u.A00().A03()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
    }

    public void A0F(Object obj) {
        A05("setValue");
        this.A01++;
        this.A08 = obj;
        A0B((AnonymousClass1J6) null);
    }

    public AnonymousClass1DS() {
        this.A06 = new Object();
        this.A02 = new C001200q();
        this.A00 = 0;
        Object obj = A0A;
        this.A09 = obj;
        this.A07 = new C449025f((Object) this, 4);
        this.A08 = obj;
        this.A01 = -1;
    }
}
