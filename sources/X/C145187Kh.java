package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Kh  reason: invalid class name and case insensitive filesystem */
public class C145187Kh implements C1601387g {
    public final /* synthetic */ C114665ra A00;

    public C145187Kh(C114665ra r1) {
        this.A00 = r1;
    }

    public void Blb(AEX aex, File file) {
        C114665ra r7 = this.A00;
        List list = r7.A0J;
        synchronized (list) {
            ArrayList A10 = C17880vN.A10(list);
            Iterator it = A10.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AEX aex2 = ((AnonymousClass6nH) it.next()).A03;
                if (aex2 != null) {
                    String str = aex2.A0F;
                    String str2 = aex.A0F;
                    if (str.equals(str2)) {
                        AnonymousClass6nH r1 = new AnonymousClass6nH(aex2);
                        if (file != null) {
                            r1.A00 = true;
                        } else {
                            r1.A00 = false;
                            r1.A01 = true;
                        }
                        AEX aex3 = r7.A07;
                        if (aex3 != null && str2.equals(aex3.A0F)) {
                            z = true;
                        }
                        r1.A02 = z;
                        A10.set(i, r1);
                        r7.A08.A0U(A10);
                        list.set(i, r1);
                    }
                }
                i++;
            }
        }
    }
}
