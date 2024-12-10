package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9zq  reason: invalid class name and case insensitive filesystem */
public class C199349zq {
    public final C19880zA A00;
    public final AnonymousClass1L7 A01;
    public final AnonymousClass1ST A02;
    public final C18030ve A03;

    public C19760yx A01(C22535BBs bBs, B75 b75, List list, List list2, Map map) {
        List list3;
        AnonymousClass1Ez r8 = new AnonymousClass1Ez();
        r8.A05("gdrive/backup/quota/getMostRecentMediaList");
        Map map2 = map;
        HashSet A12 = AnonymousClass8BR.A12(map2.keySet());
        int A002 = C18020vd.A00(C18040vf.A02, this.A03, 5251);
        C22535BBs bBs2 = bBs;
        Set BUb = bBs2.BUb();
        long j = -1;
        Long l = null;
        while (true) {
            LinkedHashSet A14 = C17880vN.A14();
            C21487Akw akw = new C21487Akw(new AnonymousClass8CF(this.A02.A08(l, (Long) null, BUb, (long) A002)), new C20602ARm());
            Long l2 = l;
            while (true) {
                try {
                    list3 = list;
                    if (!akw.hasNext()) {
                        break;
                    }
                    C193779qe r3 = (C193779qe) akw.next();
                    if (r3 != null) {
                        String str = r3.A01;
                        if (str != null) {
                            AnonymousClass1L7 r2 = this.A01;
                            File A08 = r2.A08(str);
                            if (!A08.isDirectory()) {
                                String A06 = C41361wE.A06(r2, A08);
                                if (!TextUtils.isEmpty(A06)) {
                                    C17960vV.A07(A06);
                                    if (!A14.contains(A08)) {
                                        Iterator it = list3.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (((C20002A2r) it.next()).A05.equals(A06)) {
                                                    break;
                                                }
                                            } else if (A12.contains(A06) || !map2.containsKey(A06)) {
                                                A14.add(A08);
                                                A12.remove(A06);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        long j2 = r3.A00;
                        l2 = Long.valueOf(j2);
                        j = Math.max(j, j2);
                    }
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                    throw th;
                }
            }
            akw.close();
            List list4 = list2;
            if (!b75.CCi(A14, list3, list4)) {
                Log.e("gdrive/backup/quota/getMostRecentMediaList processing media files failed");
                r8.A02();
                throw new C167558ga();
            } else if (C42171xk.A00(l2, l)) {
                C19880zA r4 = this.A00;
                if (r4.A07()) {
                    new AnonymousClass1Ez().A05("gdrive/backup/quota/getMostRecentPremiumMessageMediaList");
                    new LinkedHashSet();
                    r4.A03();
                    throw AnonymousClass000.A0s("getReferencedMediaPaths");
                }
                Iterator it2 = A12.iterator();
                while (it2.hasNext()) {
                    String A0v = C17880vN.A0v(it2);
                    if (map2.containsKey(A0v)) {
                        AnonymousClass1L7 r7 = this.A01;
                        String str2 = null;
                        if (!A0v.startsWith("_INTERNAL_FILES_") && !A0v.startsWith("_INTERNAL_DATABASES_")) {
                            try {
                                str2 = r7.A08(A0v).getCanonicalPath();
                            } catch (IOException unused) {
                            }
                        }
                        if (bBs2.Bf0(str2)) {
                            list4.add(map2.get(A0v));
                            map2.remove(A0v);
                        }
                    }
                }
                r8.A02();
                return AnonymousClass8BR.A0B(Long.valueOf(j), -1L);
            } else {
                l = l2;
            }
        }
    }

    public C199349zq(C19880zA r1, AnonymousClass1L7 r2, AnonymousClass1ST r3, C18030ve r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public static C19760yx A00(B70 b70, C22535BBs bBs, C199349zq r15, long j) {
        Long l;
        long j2;
        HashSet A12 = C17880vN.A12();
        long j3 = 0;
        long j4 = -1;
        Long l2 = null;
        do {
            l = l2;
            C21487Akw akw = (C21487Akw) b70.apply(l2);
            if (akw != null) {
                while (akw.hasNext()) {
                    try {
                        C193779qe r7 = (C193779qe) akw.next();
                        if (r7 != null) {
                            String str = r7.A01;
                            long j5 = 0;
                            if (A12.add(str) && str != null) {
                                File A08 = r15.A01.A08(str);
                                if (!A08.isDirectory() && A08.exists()) {
                                    String A022 = C20127A8m.A02(A08);
                                    if (!bBs.Bf0(A022)) {
                                        j2 = A08.length();
                                    } else if (bBs.CLj(A08, A022)) {
                                        j2 = A08.length() + j;
                                    }
                                    j5 = 0 + j2;
                                }
                            }
                            j3 += j5;
                            long j6 = r7.A00;
                            l2 = Long.valueOf(j6);
                            j4 = Math.max(j4, j6);
                        }
                    } catch (Throwable th) {
                        AnonymousClass0DT.A00(th, th);
                        throw th;
                    }
                }
                akw.close();
            }
        } while (!C42171xk.A00(l2, l));
        return AnonymousClass8BR.A0B(Long.valueOf(j3), Long.valueOf(j4));
    }
}
