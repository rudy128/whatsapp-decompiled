package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DDI implements ECs {
    public static final Object A0C = C17880vN.A0p();
    public static final Set A0D;
    public C24271ByU A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final CUW A04;
    public final C28605E9w A05;
    public final C24330BzR A06;
    public final C25256Cbv A07;
    public final Object A08;
    public final String A09;
    public final List A0A;
    public final Map A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r1.hasNext() == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        ((X.C25027CUe) r1.next()).A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r1 = r0.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r2 = this;
            r1 = r2
            monitor-enter(r1)
            boolean r0 = r2.A01     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0007
            goto L_0x0025
        L_0x0007:
            r0 = 1
            r2.A01 = r0     // Catch:{ all -> 0x0027 }
            java.util.List r0 = r2.A0A     // Catch:{ all -> 0x0027 }
            java.util.ArrayList r0 = X.C17880vN.A10(r0)     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x0015:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.next()
            X.CUe r0 = (X.C25027CUe) r0
            r0.A01()
            goto L_0x0015
        L_0x0025:
            monitor-exit(r1)
        L_0x0026:
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DDI.A03():void");
    }

    public void BB2(C25027CUe cUe) {
        boolean z;
        synchronized (this) {
            this.A0A.add(cUe);
            z = this.A01;
        }
        if (z) {
            cUe.A01();
        }
    }

    public synchronized boolean BfB() {
        return this.A02;
    }

    public synchronized boolean Bfu() {
        return this.A03;
    }

    public static void A00(List list) {
        C26024Cqi cqi;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C25027CUe cUe = (C25027CUe) it.next();
                if (cUe instanceof C22853BSf) {
                    C22853BSf bSf = (C22853BSf) cUe;
                    if (1 - bSf.A00 == 0) {
                        BSY bsy = (BSY) bSf.A01;
                        if (bsy.A02.BfB()) {
                            cqi = bsy.A01;
                        }
                    }
                } else if (cUe instanceof C22852BSe) {
                    C22852BSe bSe = (C22852BSe) cUe;
                    if (5 - bSe.A00 == 0) {
                        A00(C26269CwE.A01((C26269CwE) bSe.A01));
                    }
                } else {
                    BSZ bsz = ((C22851BSd) cUe).A00;
                    if (bsz.A04.BfB()) {
                        cqi = bsz.A03;
                    }
                }
                cqi.A03();
            }
        }
    }

    public static void A01(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C25027CUe cUe = (C25027CUe) it.next();
                if (cUe instanceof C22852BSe) {
                    C22852BSe bSe = (C22852BSe) cUe;
                    if (5 - bSe.A00 == 0) {
                        A01(C26269CwE.A02((C26269CwE) bSe.A01));
                    }
                }
            }
        }
    }

    public static void A02(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C25027CUe cUe = (C25027CUe) it.next();
                if (cUe instanceof C22852BSe) {
                    C22852BSe bSe = (C22852BSe) cUe;
                    if (5 - bSe.A00 == 0) {
                        A02(C26269CwE.A03((C26269CwE) bSe.A01));
                    }
                }
            }
        }
    }

    public Object BRU(String str) {
        return this.A0B.get(str);
    }

    public Map BRV() {
        return this.A0B;
    }

    public void CD2(String str, Object obj) {
        if (!A0D.contains(str)) {
            this.A0B.put(str, obj);
        }
    }

    public void CD4(String str, String str2) {
        Map map = this.A0B;
        map.put("origin", str);
        map.put("origin_sub", str2);
    }

    static {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        A1Z[1] = "uri_source";
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, A1Z);
        A0D = new HashSet(hashSet);
    }

    public DDI(C24271ByU byU, CUW cuw, C28605E9w e9w, C24330BzR bzR, C25256Cbv cbv, Object obj, String str, boolean z, boolean z2) {
        Object obj2;
        this.A07 = cbv;
        this.A09 = str;
        HashMap A11 = C17880vN.A11();
        this.A0B = A11;
        A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        if (cbv == null) {
            obj2 = "null-request";
        } else {
            obj2 = cbv.A03;
        }
        A11.put("uri_source", obj2);
        this.A05 = e9w;
        this.A08 = obj == null ? A0C : obj;
        this.A06 = bzR;
        this.A03 = z;
        this.A00 = byU;
        this.A02 = z2;
        this.A01 = false;
        this.A0A = AnonymousClass000.A13();
        this.A04 = cuw;
    }

    public void CD3(Map map) {
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            CD2(C17880vN.A0x(A16), A16.getValue());
        }
    }
}
