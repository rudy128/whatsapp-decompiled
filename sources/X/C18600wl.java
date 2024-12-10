package X;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: X.0wl  reason: invalid class name and case insensitive filesystem */
public abstract class C18600wl extends C18580wj implements C18590wk {
    public static final C23821Ht A00 = new C23821Ht();

    public C18570wi get(C23801Hr r4) {
        C18570wi r0;
        C18070vi.A0d(r4, 1);
        if (r4 instanceof C23811Hs) {
            C23811Hs r42 = (C23811Hs) r4;
            C23801Hr key = getKey();
            C18070vi.A0d(key, 0);
            if ((key == r42 || r42.A00 == key) && (r0 = (C18570wi) r42.A01.invoke(this)) != null) {
                return r0;
            }
        } else if (C18590wk.A00 == r4) {
            return this;
        }
        return null;
    }

    public C18560wh minusKey(C23801Hr r4) {
        C18560wh r2 = this;
        C18070vi.A0d(r4, 1);
        if (r4 instanceof C23811Hs) {
            C23811Hs r42 = (C23811Hs) r4;
            C23801Hr key = getKey();
            C18070vi.A0d(key, 0);
            if ((key == r42 || r42.A00 == key) && r42.A01.invoke(this) != null) {
                r2 = AnonymousClass1OR.A00;
            }
            return r2;
        }
        if (C18590wk.A00 == r4) {
            r2 = AnonymousClass1OR.A00;
        }
        return r2;
    }

    public C18600wl() {
        super(C18590wk.A00);
    }

    public C18600wl A0A(int i) {
        if (this instanceof AnonymousClass1IF) {
            AnonymousClass1IG.A00(i);
            if (i >= AnonymousClass1I0.A02) {
                return this;
            }
            AnonymousClass1IG.A00(i);
            return new AnonymousClass1IH(this, i);
        } else if (this instanceof C23881Hz) {
            AnonymousClass1IG.A00(i);
            if (i >= AnonymousClass1I0.A01) {
                return this;
            }
            AnonymousClass1IG.A00(i);
            return new AnonymousClass1IH(this, i);
        } else if (this instanceof AnonymousClass1IE) {
            return AnonymousClass1IF.A00.A0A(i);
        } else {
            if (this instanceof AnonymousClass1IH) {
                AnonymousClass1IH r1 = (AnonymousClass1IH) this;
                AnonymousClass1IG.A00(i);
                if (i >= r1.A00) {
                    return r1;
                }
                AnonymousClass1IG.A00(i);
                return new AnonymousClass1IH(r1, i);
            } else if (this instanceof AnonymousClass1ID) {
                throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
            } else if ((this instanceof AnonymousClass1IR) || (this instanceof AnonymousClass1IJ)) {
                AnonymousClass1IG.A00(i);
                return this;
            } else {
                AnonymousClass1IG.A00(i);
                return new AnonymousClass1IH(this, i);
            }
        }
    }

    public void A0B(Runnable runnable, C18560wh r6) {
        Runnable A002;
        if (this instanceof AnonymousClass1IF) {
            C23881Hz r0 = C23881Hz.A01;
            r0.A00.A04(runnable, AnonymousClass1I0.A06, true);
        } else if (this instanceof C23881Hz) {
            AnonymousClass1I5 r2 = ((C23881Hz) this).A00;
            AtomicLongFieldUpdater atomicLongFieldUpdater = AnonymousClass1I5.A0A;
            r2.A04(runnable, AnonymousClass1I0.A07, true);
        } else if (this instanceof AnonymousClass1IE) {
            AnonymousClass1IE.A00.A0B(runnable, r6);
        } else if (this instanceof AnonymousClass1IH) {
            AnonymousClass1IH r3 = (AnonymousClass1IH) this;
            r3.A02.A02(runnable);
            if (AnonymousClass1IH.A05.get(r3) < r3.A00 && AnonymousClass1IH.A01(r3) && (A002 = AnonymousClass1IH.A00(r3)) != null) {
                r3.A01.A0B(new C21357Aim(r3, A002, 9), r3);
            }
        } else {
            A0D(runnable, r6);
        }
    }

    public boolean A0C(C18560wh r4) {
        if (this instanceof AnonymousClass1IT) {
            AnonymousClass1IT r2 = (AnonymousClass1IT) this;
            if (!r2.A02 || !C18070vi.A18(Looper.myLooper(), r2.A00.getLooper())) {
                return true;
            }
            return false;
        } else if (this instanceof AnonymousClass1ID) {
            return false;
        }
        return true;
    }

    public void A0D(Runnable runnable, C18560wh r6) {
        Runnable A002;
        if (this instanceof C23791Hq) {
            try {
                ((C23791Hq) this).A00.execute(runnable);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                C30551e8.A03(cancellationException, r6);
                C23871Hy.A01.A0D(runnable, r6);
            }
        } else if (this instanceof AnonymousClass1IT) {
            AnonymousClass1IT r1 = (AnonymousClass1IT) this;
            if (!r1.A00.post(runnable)) {
                AnonymousClass1IT.A00(runnable, r6, r1);
            }
        } else if (this instanceof AnonymousClass1IF) {
            C23881Hz r0 = C23881Hz.A01;
            r0.A00.A04(runnable, AnonymousClass1I0.A06, false);
        } else if (this instanceof AnonymousClass1IH) {
            AnonymousClass1IH r3 = (AnonymousClass1IH) this;
            r3.A02.A02(runnable);
            if (AnonymousClass1IH.A05.get(r3) < r3.A00 && AnonymousClass1IH.A01(r3) && (A002 = AnonymousClass1IH.A00(r3)) != null) {
                r3.A01.A0D(new C21357Aim(r3, A002, 9), r3);
            }
        } else if (this instanceof AnonymousClass1ID) {
            AnonymousClass3F4 r12 = (AnonymousClass3F4) r6.get(AnonymousClass3F4.A01);
            if (r12 != null) {
                r12.A00 = true;
                return;
            }
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        } else if (this instanceof C23881Hz) {
            AnonymousClass1I5 r2 = ((C23881Hz) this).A00;
            AtomicLongFieldUpdater atomicLongFieldUpdater = AnonymousClass1I5.A0A;
            r2.A04(runnable, AnonymousClass1I0.A07, false);
        } else if (this instanceof AnonymousClass1IE) {
            AnonymousClass1IE.A00.A0D(runnable, r6);
        } else {
            ((AnonymousClass1IL) this).A0L(runnable);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
}
