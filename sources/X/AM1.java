package X;

import android.content.Intent;
import android.net.Uri;
import java.io.File;

public class AM1 implements C107045Ye {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AM1(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj;
        this.A02 = obj2;
    }

    public boolean Bky(Intent intent, int i, int i2) {
        Integer num;
        Integer num2;
        int i3 = this.A00;
        AnonymousClass1FY r0 = (AnonymousClass1FY) this.A03;
        if (i3 != 0) {
            r0.A4Q(this);
            if (i != 1) {
                return false;
            }
            C184059aL r1 = (C184059aL) this.A02;
            if (i2 == -1) {
                num = AnonymousClass00R.A00;
            } else if (i2 != 0) {
                num = AnonymousClass00R.A0C;
            } else {
                num = AnonymousClass00R.A01;
            }
            int intValue = num.intValue();
            if (intValue != 0) {
                C190959ln r2 = r1.A00;
                File file = r1.A01;
                if (intValue != 1) {
                    num2 = AnonymousClass00R.A0N;
                } else {
                    num2 = AnonymousClass00R.A0C;
                }
                r2.A00(num2);
                file.delete();
            } else {
                C190959ln r6 = r1.A00;
                Uri fromFile = Uri.fromFile(r1.A01);
                C18070vi.A0X(fromFile);
                String A002 = C20030A3z.A00(new AI4(fromFile), C20030A3z.A01);
                if (A002 != null) {
                    fromFile = C26215Cuu.A01(A002);
                    C18070vi.A0X(fromFile);
                }
                E8A e8a = r6.A03;
                if (e8a != null) {
                    AnonymousClass8BT.A19(r6.A01, e8a, C18070vi.A0N(r6.A00, fromFile, AnonymousClass3MW.A1b(), 0, 1));
                }
            }
        } else {
            r0.A4Q(this);
            boolean z = false;
            if (i != 30) {
                return false;
            }
            B7Y b7y = (B7Y) this.A02;
            if (i2 == -1) {
                z = true;
            }
            b7y.C3p(z);
        }
        return true;
    }
}
