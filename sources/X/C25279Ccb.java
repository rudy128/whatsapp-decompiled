package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ccb  reason: case insensitive filesystem */
public class C25279Ccb {
    public final List A00;

    public void A00(C25256Cbv cbv, Object obj, String str, boolean z) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C25279Ccb) list.get(i)).A00(cbv, obj, str, z);
            } catch (Exception e) {
                C26265CwA.A05("ForwardingRequestListener", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    public void A01(C25256Cbv cbv, String str, Throwable th, boolean z) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C25279Ccb) list.get(i)).A01(cbv, str, th, z);
            } catch (Exception e) {
                C26265CwA.A05("ForwardingRequestListener", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    public void A02(C25256Cbv cbv, String str, boolean z) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C25279Ccb) list.get(i)).A02(cbv, str, z);
            } catch (Exception e) {
                C26265CwA.A05("ForwardingRequestListener", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    public void A03(String str) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C25279Ccb) list.get(i)).A03(str);
            } catch (Exception e) {
                C26265CwA.A05("ForwardingRequestListener", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    public void A04(String str) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C25279Ccb) list.get(i)).A04(str);
            } catch (Exception e) {
                C26265CwA.A05("ForwardingRequestListener", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    public void A05(String str, String str2) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C25279Ccb) list.get(i)).A05(str, str2);
            } catch (Exception e) {
                C26265CwA.A05("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    public void A06(String str, String str2) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C25279Ccb) list.get(i)).A06(str, str2);
            } catch (Exception e) {
                C26265CwA.A05("ForwardingRequestListener", "InternalListener exception in onProducerStart", e);
            }
        }
    }

    public void A07(String str, String str2, Throwable th, Map map) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C25279Ccb) list.get(i)).A07(str, str2, th, map);
            } catch (Exception e) {
                C26265CwA.A05("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    public void A08(String str, String str2, Map map) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C25279Ccb) list.get(i)).A08(str, str2, map);
            } catch (Exception e) {
                C26265CwA.A05("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public void A09(String str, String str2, boolean z) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C25279Ccb) list.get(i)).A09(str, str2, z);
            } catch (Exception e) {
                C26265CwA.A05("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public boolean A0A(String str) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C25279Ccb) list.get(i)).A0A(str)) {
                return true;
            }
        }
        return false;
    }

    public C25279Ccb(Set set) {
        this.A00 = C17880vN.A0z(set.size());
        for (Object next : set) {
            if (next != null) {
                this.A00.add(next);
            }
        }
    }
}
