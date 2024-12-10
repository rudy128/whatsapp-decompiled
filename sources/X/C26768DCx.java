package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.DCx  reason: case insensitive filesystem */
public final class C26768DCx implements C28659ECw {
    public final List A00;

    public void C1r(ECs eCs, String str) {
        C18070vi.A0d(eCs, 0);
        for (C28605E9w C1r : this.A00) {
            try {
                C1r.C1r(eCs, str);
            } catch (Exception e) {
                A01("onProducerStart", A00(), e);
            }
        }
    }

    public boolean CFc(ECs eCs, String str) {
        C18070vi.A0d(eCs, 0);
        List<C28605E9w> list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C28605E9w CFc : list) {
                if (CFc.CFc(eCs, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static StringBuilder A00() {
        StringBuilder sb = new StringBuilder();
        sb.append("InternalListener exception in ");
        return sb;
    }

    public void C1n(ECs eCs) {
        for (C28605E9w C1n : this.A00) {
            try {
                C1n.C1n(eCs);
            } catch (Exception e) {
                A01("onIntermediateChunkStart", A00(), e);
            }
        }
    }

    public void C1o(ECs eCs, String str) {
        for (C28605E9w C1o : this.A00) {
            try {
                C1o.C1o(eCs, str);
            } catch (Exception e) {
                A01("onProducerFinishWithCancellation", A00(), e);
            }
        }
    }

    public void C1p(ECs eCs, String str, Throwable th, Map map) {
        for (C28605E9w C1p : this.A00) {
            try {
                C1p.C1p(eCs, str, th, map);
            } catch (Exception e) {
                A01("onProducerFinishWithFailure", A00(), e);
            }
        }
    }

    public void C1q(ECs eCs, String str, Map map) {
        for (C28605E9w C1q : this.A00) {
            try {
                C1q.C1q(eCs, str, map);
            } catch (Exception e) {
                A01("onProducerFinishWithSuccess", A00(), e);
            }
        }
    }

    public void C3J(ECs eCs) {
        for (C28659ECw C3J : this.A00) {
            try {
                C3J.C3J(eCs);
            } catch (Exception e) {
                A01("onRequestCancellation", A00(), e);
            }
        }
    }

    public void C3M(ECs eCs, Throwable th) {
        for (C28659ECw C3M : this.A00) {
            try {
                C3M.C3M(eCs, th);
            } catch (Exception e) {
                A01("onRequestFailure", A00(), e);
            }
        }
    }

    public void C3R(ECs eCs) {
        for (C28659ECw C3R : this.A00) {
            try {
                C3R.C3R(eCs);
            } catch (Exception e) {
                A01("onRequestStart", A00(), e);
            }
        }
    }

    public void C3S(ECs eCs) {
        for (C28659ECw C3S : this.A00) {
            try {
                C3S.C3S(eCs);
            } catch (Exception e) {
                A01("onRequestSuccess", A00(), e);
            }
        }
    }

    public void C9Q(ECs eCs, String str, boolean z) {
        for (C28605E9w C9Q : this.A00) {
            try {
                C9Q.C9Q(eCs, str, z);
            } catch (Exception e) {
                A01("onProducerFinishWithSuccess", A00(), e);
            }
        }
    }

    public C26768DCx(Set set) {
        ArrayList A0z = C17880vN.A0z(set.size());
        this.A00 = A0z;
        for (Object next : set) {
            if (next != null) {
                A0z.add(next);
            }
        }
    }

    public static void A01(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        C26265CwA.A05("ForwardingRequestListener2", sb.toString(), th);
    }
}
