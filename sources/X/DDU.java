package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DDU implements C28592E9h, EA4 {
    public int A00 = 0;
    public final Context A01;
    public final Map A02 = C17880vN.A11();
    public final ConcurrentHashMap A03 = AnonymousClass8BR.A17();
    public final C25511Ch9 A04;
    public final C25132CZh A05 = new C25132CZh();

    public void A01(EDK edk, C22892BUd bUd) {
        this.A03.put(edk, edk);
        Map map = this.A02;
        synchronized (map) {
            Map map2 = (Map) map.get(bUd);
            if (map2 == null) {
                map2 = C17880vN.A11();
                map.put(bUd, map2);
            }
            C17880vN.A1O(edk, map2, 0);
        }
    }

    public EDK BP7(C22892BUd bUd) {
        EDK edk;
        synchronized (this) {
            A00();
            Map map = this.A02;
            synchronized (map) {
                try {
                    Map map2 = (Map) map.get(bUd);
                    if (map2 != null) {
                        edk = (EDK) AnonymousClass000.A0w(map2, 0);
                    } else {
                        edk = null;
                    }
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            if (edk == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Requested component is null for index: ");
                A10.append(0);
                th = BEA.A0c(bUd, " and componentClass: ", A10);
                throw th;
            }
        }
        return edk;
    }

    public synchronized void CG0() {
        EDJ edj;
        A00();
        BCe("LiteCameraController must be initialized before invoking resume()");
        if (this.A00 == 1) {
            C9Z c9z = EDJ.A00;
            if (BeM(c9z)) {
                edj = (EDJ) BP8(c9z);
                if (edj != null) {
                    edj.Bi9("connect_controllers_started", "ComponentManager", (Map) null, BE6.A0O(this));
                }
            } else {
                edj = null;
            }
            this.A00 = 2;
            ConcurrentHashMap concurrentHashMap = this.A03;
            Iterator A0j = C17890vO.A0j(concurrentHashMap);
            while (A0j.hasNext()) {
                ((EDK) A0j.next()).CCA();
            }
            Iterator A0j2 = C17890vO.A0j(concurrentHashMap);
            while (A0j2.hasNext()) {
                ((EDK) A0j2.next()).connect();
            }
            if (edj != null) {
                edj.Bi9("connect_controllers_finished", "ComponentManager", (Map) null, BE6.A0O(this));
            }
        }
    }

    public synchronized void destroy() {
        if (this.A00 != 0) {
            pause();
            Iterator A0j = C17890vO.A0j(this.A03);
            while (A0j.hasNext()) {
                ((EDK) A0j.next()).release();
            }
            this.A00 = 0;
        }
    }

    public synchronized void pause() {
        BCe("LiteCameraController must be initialized before invoking pause()");
        if (this.A00 == 2) {
            this.A00 = 1;
            Iterator A0j = C17890vO.A0j(this.A03);
            while (A0j.hasNext()) {
                ((EDK) A0j.next()).BIn();
            }
        }
    }

    public void A00() {
        EDJ edj;
        if (this.A00 == 0) {
            C9Z c9z = EDJ.A00;
            if (BeM(c9z)) {
                edj = (EDJ) BP8(c9z);
                if (edj != null) {
                    edj.Bi9("init_controllers_started", "ComponentManager", (Map) null, BE6.A0O(this));
                }
            } else {
                edj = null;
            }
            this.A00 = 1;
            List list = this.A05.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                DEE dee = (DEE) ((E4f) list.get(i));
                if (!dee.A01) {
                    dee.A01 = true;
                }
            }
            ConcurrentHashMap concurrentHashMap = this.A03;
            Iterator A0j = C17890vO.A0j(concurrentHashMap);
            while (A0j.hasNext()) {
                ((E9j) A0j.next()).Bd6();
            }
            Iterator A0j2 = C17890vO.A0j(concurrentHashMap);
            while (A0j2.hasNext()) {
                ((E9j) A0j2.next()).BdF();
            }
            if (edj != null) {
                edj.Bi9("init_controllers_finished", "ComponentManager", (Map) null, BE6.A0O(this));
            }
        }
    }

    public void A02(E4f e4f) {
        C25132CZh cZh = this.A05;
        if (!cZh.A00.contains(e4f)) {
            cZh.A01(e4f);
            DEE dee = (DEE) e4f;
            if (!dee.A01) {
                dee.A01 = true;
            }
        }
    }

    public void BCe(String str) {
        if (this.A00 == 0) {
            throw AnonymousClass000.A0n(str);
        }
    }

    public E4f BP8(C9Z c9z) {
        List list = this.A05.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            E4f e4f = (E4f) list.get(i);
            if (e4f.BTh() == c9z) {
                return e4f;
            }
        }
        throw AnonymousClass8BX.A0V(c9z, "Requested core component is null for key ", AnonymousClass000.A10());
    }

    public Object BPA(C25313CdJ cdJ) {
        return this.A04.A00.get(cdJ);
    }

    public boolean BeL(C22892BUd bUd) {
        boolean containsKey;
        Map map = this.A02;
        synchronized (map) {
            containsKey = map.containsKey(bUd);
        }
        return containsKey;
    }

    public boolean BeM(C9Z c9z) {
        List list = this.A05.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((E4f) list.get(i)).BTh() == c9z) {
                return true;
            }
        }
        return false;
    }

    public Context getContext() {
        return this.A01;
    }

    public DDU(Context context, C25511Ch9 ch9) {
        this.A01 = context.getApplicationContext();
        this.A04 = ch9;
    }
}
