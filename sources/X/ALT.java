package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class ALT implements C216816z {
    public final /* synthetic */ A58 A00;

    public ALT(A58 a58) {
        this.A00 = a58;
    }

    public void C4M() {
        ArrayList A0z;
        A58 a58 = this.A00;
        LinkedHashMap linkedHashMap = a58.A04;
        synchronized (linkedHashMap) {
            A0z = C17880vN.A0z(linkedHashMap.size());
            Iterator A0j = C17890vO.A0j(linkedHashMap);
            while (A0j.hasNext()) {
                Runnable runnable = (Runnable) A0j.next();
                if (runnable != null) {
                    A0z.add(runnable);
                }
            }
            linkedHashMap.clear();
        }
        Iterator it = A0z.iterator();
        while (it.hasNext()) {
            C108945cZ.A1P(it.next());
        }
        C216816z r0 = a58.A00;
        if (r0 != null) {
            r0.C4M();
        }
    }
}
