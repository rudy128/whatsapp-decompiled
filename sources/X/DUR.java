package X;

import android.hardware.Camera;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

public class DUR implements Comparator {
    public final int A00;

    public DUR(int i) {
        this.A00 = i;
    }

    public static void A00(int i, List list) {
        Collections.sort(list, new DUR(i));
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                DUR dur = this;
                return C40151uF.A00(Integer.valueOf(((C26047CrE) obj).A01), Integer.valueOf(((C26047CrE) obj2).A01));
            case 1:
                DUR dur2 = this;
                AnonymousClass1D6 r6 = (AnonymousClass1D6) obj;
                AnonymousClass1D6 r7 = (AnonymousClass1D6) obj2;
                return (((Number) r6.second).intValue() - ((Number) r6.first).intValue()) - (((Number) r7.second).intValue() - ((Number) r7.first).intValue());
            case 2:
                DUR dur3 = this;
                CXU cxu = (CXU) obj;
                CXU cxu2 = (CXU) obj2;
                return ((((cxu2.A03 - cxu2.A06) + 1) * ((cxu2.A02 - cxu2.A05) + 1)) * ((cxu2.A01 - cxu2.A04) + 1)) - ((((cxu.A03 - cxu.A06) + 1) * ((cxu.A02 - cxu.A05) + 1)) * ((cxu.A01 - cxu.A04) + 1));
            case 3:
                DUR dur4 = this;
                CS6 cs6 = (CS6) obj;
                CS6 cs62 = (CS6) obj2;
                int i = cs6.A01 - cs62.A01;
                if (i == 0) {
                    return cs6.A02 - cs62.A02;
                }
                return i;
            case 4:
                DUR dur5 = this;
                return ((D48) obj2).A04 - ((D48) obj).A04;
            case 5:
                DUR dur6 = this;
                return ((CPG) obj).A01 - ((CPG) obj2).A01;
            case 6:
                DUR dur7 = this;
                return Float.compare(((CPG) obj).A00, ((CPG) obj2).A00);
            case 7:
                DUR dur8 = this;
                DA3 da3 = (DA3) obj;
                DA3 da32 = (DA3) obj2;
                int i2 = da3.A03;
                int i3 = da32.A03;
                float f = da3.A02;
                float f2 = da32.A02;
                if (i2 == i3) {
                    if (f != f2) {
                        return (int) Math.signum(f - f2);
                    }
                    i2 = da3.A05;
                    i3 = da32.A05;
                }
                return i2 - i3;
            case 8:
                DUR dur9 = this;
                return ((C24914CPh) obj).A00.compareTo(((C24914CPh) obj2).A00);
            case 9:
                DUR dur10 = this;
                C24914CPh cPh = (C24914CPh) obj;
                C24914CPh cPh2 = (C24914CPh) obj2;
                Long l = cPh.A01;
                Long l2 = cPh2.A01;
                if (l.equals(l2)) {
                    l2 = cPh2.A00;
                    l = cPh.A00;
                }
                return l2.compareTo(l);
            case 10:
                DUR dur11 = this;
                throw new NullPointerException("renderingOrder");
            case 11:
                DUR dur12 = this;
                long j = ((C25833Cmm) obj).A00;
                long j2 = ((C25833Cmm) obj2).A00;
                if (j < j2) {
                    return -1;
                }
                if (j > j2) {
                    return 1;
                }
                return 0;
            case 12:
                DUR dur13 = this;
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                return (((A5W) obj).A03(timeUnit) > ((A5W) obj2).A03(timeUnit) ? 1 : (((A5W) obj).A03(timeUnit) == ((A5W) obj2).A03(timeUnit) ? 0 : -1));
            case 13:
                DUR dur14 = this;
                Camera.Size size = (Camera.Size) obj;
                Camera.Size size2 = (Camera.Size) obj2;
                return AnonymousClass1XO.A00(size.width * size.height, size2.width * size2.height);
            case 14:
                DUR dur15 = this;
                Camera.Size size3 = (Camera.Size) obj;
                Camera.Size size4 = (Camera.Size) obj2;
                return AnonymousClass1XO.A00(size4.width * size4.height, size3.width * size3.height);
            case 15:
                DUR dur16 = this;
                return ((COU) obj).A01.getName().compareTo(((COU) obj2).A01.getName());
            case 16:
                DUR dur17 = this;
                return ((File) ((COV) obj).A01.get(0)).getName().compareTo(((File) ((COV) obj2).A01.get(0)).getName());
            case 17:
                DUR dur18 = this;
                return C40151uF.A00((Integer) ((AnonymousClass1D6) obj2).second, (Integer) ((AnonymousClass1D6) obj).second);
            case 18:
                return A01((CronetProvider) obj, (CronetProvider) obj2);
            default:
                return 0;
        }
    }

    public int A01(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider.getName())) {
            return 1;
        }
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider2.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(cronetProvider.getVersion(), cronetProvider2.getVersion());
    }
}
