package X;

public class DNJ implements E6A {
    public final int A00;

    public DNJ(int i) {
        this.A00 = i;
    }

    public Object BkI(DOZ doz, DFL dfl) {
        if (this.A00 != 0) {
            return new Object();
        }
        if (C26272CwJ.A08(doz)) {
            DWZ dwz = new DWZ(doz, dfl, this, 0);
            ThreadLocal threadLocal = C24724CHl.A02;
            Object obj = threadLocal.get();
            threadLocal.set(1);
            try {
                return dwz.invoke();
            } finally {
                threadLocal.set(obj);
            }
        } else {
            Object A0D = C25995CqB.A00().A08.A0D(doz, dfl);
            if (A0D == null) {
                return C25995CqB.A00().A05.A02(doz, dfl);
            }
            return A0D;
        }
    }
}
