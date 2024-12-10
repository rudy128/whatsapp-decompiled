package X;

import android.os.Build;
import java.util.HashSet;

/* renamed from: X.Dbx  reason: case insensitive filesystem */
public class C27326Dbx extends HashSet {
    public final int A00;

    public C27326Dbx(int i) {
        Object A0T;
        this.A00 = i;
        switch (i) {
            case 0:
                add(C24260ByJ.RGBA);
                A0T = C24260ByJ.LUM;
                break;
            case 1:
                if (Build.VERSION.SDK_INT == 23) {
                    add(new C26008CqP("volantis"));
                }
                BE8.A1B("alps", "M4_Note", this);
                BE8.A1B("HTC", "HTC One M9", this);
                BE8.A1B("HTC", "0PJA10", this);
                BE8.A1B("HTC", "HTC 0PJA10", this);
                BE8.A1B("HTC", "HTC_0PJA10", this);
                BE8.A1B("HTC", "HTC_M9u", this);
                BE8.A1B("HTC", "0PJA2", this);
                BE8.A1B("HTC", "HTC6535LRA", this);
                BE8.A1B("HTC", "HTC6535LVW", this);
                BE8.A1B("Huawei", "ALP-L09", this);
                BE8.A1B("Huawei", "ALP-L29", this);
                BE8.A1B("Huawei", "ALP-AL00", this);
                BE8.A1B("Huawei", "ALP-TL00", this);
                BE8.A1B("Huawei", "BLP-L09", this);
                BE8.A1B("Huawei", "BLP-L29", this);
                BE8.A1B("Huawei", "BLP-AL00", this);
                BE8.A1B("Huawei", "BLP-TL00", this);
                BE8.A1B("Google", "Pixel", this);
                BE8.A1B("Google", "Pixel XL", this);
                BE8.A1B("Google", "Pixel 2", this);
                BE8.A1B("Google", "Pixel 2 XL", this);
                A0T = BE6.A0T("Huawei", "Nexus 6P");
                break;
            default:
                if (!C25870Cne.A01('U', 'K', '5')) {
                    BE8.A1B("samsung", "SM-G991B", this);
                    BE8.A1B("samsung", "SM-G991N", this);
                    BE8.A1B("samsung", "SM-G996B", this);
                    BE8.A1B("samsung", "SM-G996N", this);
                    BE8.A1B("samsung", "SM-G998B", this);
                    A0T = BE6.A0T("samsung", "SM-G998N");
                    break;
                } else {
                    return;
                }
        }
        add(A0T);
    }
}
