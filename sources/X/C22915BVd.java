package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.BVd  reason: case insensitive filesystem */
public class C22915BVd extends C22916BVe {
    public final C52832bY A00;
    public final CRO A01;
    public final E52 A02;

    public /* synthetic */ C22915BVd(E52 e52) {
        C52832bY r1;
        C28515E4z e4z = (C28515E4z) e52;
        CRO cro = new CRO(e4z);
        this.A02 = e52;
        this.A01 = cro;
        synchronized (C52832bY.class) {
            r1 = C52832bY.A01;
            if (r1 == null) {
                r1 = new C52832bY();
                C52832bY.A01 = r1;
            }
        }
        this.A00 = r1;
        A01(e4z.BN5());
        C24785CKe cKe = new C24785CKe(this);
        HashMap hashMap = r1.A00;
        List list = (List) hashMap.get(0);
        list = list == null ? AnonymousClass000.A13() : list;
        list.add(cKe);
        hashMap.put(0, list);
    }
}
