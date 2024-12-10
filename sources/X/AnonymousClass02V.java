package X;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: X.02V  reason: invalid class name */
public final class AnonymousClass02V {
    public AnonymousClass01T A00;
    public OnBackInvokedCallback A01;
    public OnBackInvokedDispatcher A02;
    public boolean A03;
    public boolean A04;
    public final Runnable A05;
    public final AnonymousClass1JD A06;

    public final void A08(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C18070vi.A0d(onBackInvokedDispatcher, 0);
        this.A02 = onBackInvokedDispatcher;
        A05(this.A04);
    }

    public final void A09(AnonymousClass01T r4, AnonymousClass1F9 r5) {
        C18070vi.A0d(r4, 1);
        C23381Fv lifecycle = r5.getLifecycle();
        if (lifecycle.A04() != C23401Fx.DESTROYED) {
            r4.A02.add(new AnonymousClass02f(r4, this, lifecycle));
            A04(this);
            r4.A05(new AnonymousClass04F(this, 0));
        }
    }

    public static final void A01(C005002d r3, AnonymousClass02V r4) {
        Object obj;
        AnonymousClass01T r1 = r4.A00;
        if (r1 == null) {
            AnonymousClass1JD r12 = r4.A06;
            ListIterator listIterator = r12.listIterator(r12.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((AnonymousClass01T) obj).A00) {
                    break;
                }
            }
            r1 = (AnonymousClass01T) obj;
            if (r1 == null) {
                return;
            }
        }
        r1.A04(r3);
    }

    public static final void A02(AnonymousClass02V r4) {
        Object obj;
        AnonymousClass01T r1 = r4.A00;
        if (r1 == null) {
            AnonymousClass1JD r12 = r4.A06;
            ListIterator listIterator = r12.listIterator(r12.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((AnonymousClass01T) obj).A00) {
                    break;
                }
            }
            r1 = (AnonymousClass01T) obj;
        }
        r4.A00 = null;
        if (r1 != null) {
            r1.A01();
        }
    }

    public static final void A03(AnonymousClass02V r3) {
        Object obj;
        AnonymousClass1JD r1 = r3.A06;
        ListIterator listIterator = r1.listIterator(r1.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((AnonymousClass01T) obj).A00) {
                break;
            }
        }
        AnonymousClass01T r12 = (AnonymousClass01T) obj;
        if (r3.A00 != null) {
            A02(r3);
        }
        r3.A00 = r12;
        if (r12 != null) {
            r12.A02();
        }
    }

    public static final void A04(AnonymousClass02V r4) {
        boolean z = r4.A04;
        AnonymousClass1JD r1 = r4.A06;
        boolean z2 = false;
        if (!r1.isEmpty()) {
            Iterator it = r1.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((AnonymousClass01T) it.next()).A00) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        r4.A04 = z2;
        if (z2 != z && Build.VERSION.SDK_INT >= 33) {
            r4.A05(z2);
        }
    }

    private final void A05(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.A02;
        OnBackInvokedCallback onBackInvokedCallback = this.A01;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            boolean z2 = this.A03;
            if (z) {
                if (!z2) {
                    C004902c.A01(onBackInvokedDispatcher, onBackInvokedCallback);
                    this.A03 = true;
                }
            } else if (z2) {
                C004902c.A02(onBackInvokedDispatcher, onBackInvokedCallback);
                this.A03 = false;
            }
        }
    }

    public final C005202g A06(AnonymousClass01T r4) {
        this.A06.add(r4);
        C005202g r2 = new C005202g(r4, this);
        r4.A02.add(r2);
        A04(this);
        r4.A05(new AnonymousClass04F(this, 1));
        return r2;
    }

    public final void A07() {
        Object obj;
        AnonymousClass01T r1 = this.A00;
        if (r1 == null) {
            AnonymousClass1JD r12 = this.A06;
            ListIterator listIterator = r12.listIterator(r12.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((AnonymousClass01T) obj).A00) {
                    break;
                }
            }
            r1 = (AnonymousClass01T) obj;
        }
        this.A00 = null;
        if (r1 != null) {
            r1.A03();
            return;
        }
        Runnable runnable = this.A05;
        if (runnable != null) {
            runnable.run();
        }
    }

    public AnonymousClass02V(AnonymousClass1GV r5, Runnable runnable) {
        OnBackInvokedCallback A002;
        this.A05 = runnable;
        this.A06 = new AnonymousClass1JD();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                A002 = C004702a.A00(new AnonymousClass02Y(this), new AnonymousClass02Z(this), new AnonymousClass02W(this), new AnonymousClass02X(this));
            } else {
                A002 = C004902c.A00(new C004802b(this));
            }
            this.A01 = A002;
        }
    }

    public AnonymousClass02V(Runnable runnable) {
        this((AnonymousClass1GV) null, runnable);
    }

    public AnonymousClass02V() {
        this((Runnable) null);
    }
}
