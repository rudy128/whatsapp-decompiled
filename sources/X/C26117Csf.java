package X;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.security.MessageDigest;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.Csf  reason: case insensitive filesystem */
public class C26117Csf {
    public Integer A00;
    public List A01;
    public List A02;
    public ExecutorService A03;
    public final Context A04;
    public final C25325CdW A05;
    public final E7q A06;
    public final E9F A07 = new C26868DGz(this);
    public final E55 A08;
    public final CAM A09;
    public final C28564E7r A0A;
    public final CUT A0B;
    public final E56 A0C;
    public final File A0D;
    public final HashMap A0E;
    public final AtomicBoolean A0F;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Chb, java.lang.Object] */
    public static CUT A00(C25092CXd cXd, E9F e9f, C26052CrM crM, C26117Csf csf) {
        int i;
        int i2;
        CUT cut = csf.A0B;
        C25752ClM clM = cut.A04;
        if (clM != null) {
            i = Math.max(clM.A0A, clM.A08);
            i2 = clM.A00;
        } else {
            C25538Chb chb = C25538Chb.A02;
            i = chb.A01;
            i2 = chb.A00;
        }
        ? obj = new Object();
        obj.A01 = i;
        obj.A00 = i2;
        C25752ClM clM2 = new C25752ClM();
        int i3 = cXd.A05;
        int i4 = cXd.A03;
        clM2.A07 = i3;
        clM2.A05 = i4;
        int i5 = cXd.A04;
        clM2.A06 = i5;
        clM2.A01 = 30;
        clM2.A02 = 10;
        clM2.A0H = null;
        clM2.A0A = i3;
        clM2.A08 = i4;
        clM2.A09 = i5;
        int A062 = BE8.A06(i3, i4, i);
        CAJ.A00(clM2, ((float) i3) / ((float) i4), A062);
        if (A062 < i) {
            i2 = ((int) ((((double) ((((float) (clM2.A0A * clM2.A08)) * 30.0f) * 1.3f)) * 0.07d) / 1000.0d)) * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        }
        clM2.A00 = i2;
        C24801CKu cKu = new C24801CKu();
        cKu.A00 = true;
        clM2.A0D = new C24802CKv(cKu);
        C25965CpX cpX = new C25965CpX(cut);
        cpX.A04 = clM2;
        cpX.A05 = e9f;
        cpX.A06 = crM;
        cpX.A0G = false;
        return new CUT(cpX);
    }

    public static void A02(C24322BzJ bzJ, C25186Cac cac, C26052CrM crM, C26117Csf csf) {
        C25186Cac cac2;
        AbstractMap A11;
        C26117Csf csf2;
        C24322BzJ bzJ2 = bzJ;
        C26052CrM crM2 = crM;
        HashMap A062 = crM2.A06(bzJ2);
        if (A062 != null) {
            int size = A062.size();
            int i = 0;
            while (true) {
                cac2 = cac;
                if (i >= size) {
                    break;
                }
                C25833Cmm cmm = (C25833Cmm) AnonymousClass8BT.A0r(A062, i);
                if (cmm != null) {
                    C26010CqR cqR = new C26010CqR(cmm.A01, cmm.A02, cmm.A00);
                    Iterator A0y = AnonymousClass8BV.A0y(cmm.A04);
                    while (true) {
                        csf2 = csf;
                        if (!A0y.hasNext()) {
                            break;
                        }
                        C25271CcJ ccJ = (C25271CcJ) A0y.next();
                        File file = ccJ.A05;
                        A5W a5w = ccJ.A03;
                        HashMap hashMap = csf2.A0E;
                        if (hashMap.containsKey(cmm)) {
                            file = (File) hashMap.get(cmm);
                            if (csf2.A0B.A0K) {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                long max = Math.max(0, a5w.A03(timeUnit));
                                long A022 = a5w.A02(timeUnit);
                                long j = ccJ.A01;
                                if (A022 < 0) {
                                    A022 = j;
                                }
                                long j2 = j - A022;
                                long j3 = j - max;
                                if (j2 == 0) {
                                    j2 = -1;
                                }
                                if (j3 == j) {
                                    j3 = -1;
                                }
                                a5w = new A5W(TimeUnit.MILLISECONDS, j2, j3);
                            } else {
                                a5w = new A5W(TimeUnit.SECONDS, -1, -1);
                            }
                        }
                        CXD A002 = ccJ.A00();
                        A002.A03 = a5w;
                        A002.A05 = file;
                        cqR.A04.add(A002.A00());
                    }
                    Iterator A0y2 = AnonymousClass8BV.A0y(cmm.A07);
                    while (A0y2.hasNext()) {
                        C25774Cll cll = (C25774Cll) A0y2.next();
                        float f = cll.A00;
                        if (f >= 0.0f || csf2.A0B.A0K) {
                            cqR.A01(cll.A01, Math.abs(f));
                        }
                    }
                    Iterator A0y3 = AnonymousClass8BV.A0y(cmm.A06);
                    while (A0y3.hasNext()) {
                        A0y3.next();
                        cqR.A06.add((Object) null);
                    }
                    cqR.A03.putAll(cmm.A03);
                    for (Object add : cmm.A05) {
                        cqR.A05.add(add);
                    }
                    cac2.A02(new C25833Cmm(cqR));
                }
                i++;
            }
            HashMap hashMap2 = crM2.A01;
            if (hashMap2.containsKey(bzJ2)) {
                HashMap hashMap3 = cac2.A01;
                if (hashMap3.containsKey(bzJ2)) {
                    A11 = (AbstractMap) hashMap3.get(bzJ2);
                } else {
                    A11 = C17880vN.A11();
                }
                A11.getClass();
                HashMap hashMap4 = (HashMap) hashMap2.get(bzJ2);
                hashMap4.getClass();
                A11.putAll(hashMap4);
                hashMap3.put(bzJ2, A11);
            }
            List<C6M> list = (List) crM2.A00.get(bzJ2);
            if (list != null) {
                for (C6M c6m : list) {
                    cac2.A00(c6m.A00, bzJ2, c6m.A01);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r5.A02.isEmpty() == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r5 = this;
            java.util.List r4 = r5.A01
            boolean r0 = r4.isEmpty()
            r3 = 1
            if (r0 == 0) goto L_0x0012
            java.util.List r0 = r5.A02
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.A0F
            boolean r0 = r1.get()
            if (r0 != 0) goto L_0x0050
            if (r2 != 0) goto L_0x0050
            r1.set(r3)
            java.util.Iterator r1 = r4.iterator()
        L_0x0024:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r1.next()
            X.E7p r0 = (X.C28563E7p) r0
            r0.cancel()
            goto L_0x0024
        L_0x0034:
            java.util.List r2 = r5.A02
            java.util.Iterator r1 = r2.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r1.next()
            X.E7p r0 = (X.C28563E7p) r0
            r0.cancel()
            goto L_0x003a
        L_0x004a:
            r4.clear()
            r2.clear()
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26117Csf.A03():void");
    }

    public C26117Csf(Context context, C25325CdW cdW, E7q e7q, E55 e55, CAM cam, C28564E7r e7r, DHX dhx, CUT cut, File file, Integer num) {
        this.A04 = context;
        this.A06 = e7q;
        this.A0B = cut;
        this.A0A = e7r;
        this.A08 = e55;
        this.A09 = cam;
        this.A05 = cdW;
        this.A0C = dhx;
        this.A0E = C17880vN.A11();
        this.A0F = new AtomicBoolean();
        this.A01 = AnonymousClass000.A13();
        this.A02 = AnonymousClass000.A13();
        this.A0D = file;
        this.A00 = num;
    }

    public static File A01(C25833Cmm cmm, File file) {
        JSONObject A012 = cmm.A01();
        StringBuilder A10 = AnonymousClass000.A10();
        String obj = A012.toString();
        C18070vi.A0d(obj, 0);
        byte[] digest = MessageDigest.getInstance("MD5").digest(C108975cc.A1O(obj));
        C18070vi.A0b(digest);
        StringBuilder A19 = AnonymousClass3MZ.A19(digest, 0);
        for (byte A1S : digest) {
            Locale locale = Locale.ROOT;
            Object[] A1a = AnonymousClass3MW.A1a();
            BE6.A1S(A1a, A1S, 0);
            A19.append(C108955ca.A12(locale, "%02X", Arrays.copyOf(A1a, 1)));
        }
        A10.append(C18070vi.A0H(A19));
        return AnonymousClass8BW.A0X(file, ".mp4", A10);
    }
}
