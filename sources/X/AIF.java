package X;

import java.util.LinkedList;
import java.util.List;

public final class AIF implements B4V {
    public long A00;
    public long A01 = -1;
    public AnonymousClass8Ka A02;
    public String A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C21473Ake A07;
    public final LinkedList A08 = AnonymousClass8BR.A14();
    public final List A09;
    public final Class[] A0A;
    public final Class[] A0B;

    public AIF(AnonymousClass9OU r6, C197769xE r7, List list) {
        Class<?> cls;
        Class<?> cls2;
        C18030ve r2 = r7.A01.A00;
        this.A04 = AnonymousClass8BR.A05(r2, 8341);
        this.A06 = AnonymousClass8BR.A05(r2, 8340);
        this.A05 = AnonymousClass8BR.A05(r2, 8339);
        List list2 = r7.A00;
        this.A09 = list2;
        C198209xy r4 = C198209xy.A03;
        Class[] clsArr = new Class[1];
        Class<?> cls3 = r4.A00;
        if (cls3 == null) {
            try {
                cls3 = Class.forName("android.app.ActivityThread$H");
            } catch (Throwable unused) {
                cls3 = null;
            }
            r4.A00 = cls3;
        }
        clsArr[0] = cls3;
        this.A0B = clsArr;
        Class[] clsArr2 = new Class[4];
        Class<?> cls4 = r4.A01;
        if (cls4 == null) {
            try {
                cls4 = Class.forName("android.view.View$PerformClick");
            } catch (Throwable unused2) {
                cls4 = null;
            }
            r4.A01 = cls4;
        }
        clsArr2[0] = cls4;
        Class<?> cls5 = r4.A02;
        if (cls5 == null) {
            try {
                cls5 = Class.forName("android.view.View$PerformLongClick");
            } catch (Throwable unused3) {
                cls5 = null;
            }
            r4.A02 = cls5;
        }
        clsArr2[1] = cls5;
        try {
            cls = Class.forName("android.view.View$CheckForLongPress");
        } catch (Throwable unused4) {
            cls = null;
        }
        clsArr2[2] = cls;
        try {
            cls2 = Class.forName("android.view.View$CheckForTap");
        } catch (Throwable unused5) {
            cls2 = null;
        }
        clsArr2[3] = cls2;
        this.A0A = clsArr2;
        this.A07 = new C21473Ake(this, r6, r7, list);
        list2.add(new AnonymousClass8KY());
    }
}
