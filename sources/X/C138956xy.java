package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6xy  reason: invalid class name and case insensitive filesystem */
public final class C138956xy {
    public static final List A02;
    public final C18030ve A00;
    public final C126846dO A01;

    static {
        String[] strArr = new String[3];
        strArr[0] = "com.instagram.";
        strArr[1] = "com.oculus.";
        A02 = C18070vi.A0O("com.facebook.", strArr, 2);
    }

    public final void A00(Integer num, String str) {
        String str2;
        if (C18020vd.A05(C18040vf.A02, this.A00, 3777) && str != null && str.length() != 0) {
            List list = A02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (C108975cc.A1N(C17880vN.A0v(it), str)) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Cross-app communication detected for operation '");
                        switch (num.intValue()) {
                            case 0:
                                str2 = "ACQUIRE_CONTENT_PROVIDER_CLIENT";
                                break;
                            case 1:
                                str2 = "FILE";
                                break;
                            case 2:
                                str2 = "QUERY";
                                break;
                            default:
                                str2 = "STREAM";
                                break;
                        }
                        A10.append(str2);
                        A10.append("' and authority '");
                        A10.append(str);
                        Log.i(C17890vO.A0c(A10, '\''));
                        C126846dO r3 = this.A01;
                        String A002 = C22781De.A00(new Throwable(""));
                        AnonymousClass63P r2 = new AnonymousClass63P();
                        r2.A03 = "CONTENT_RESOLVER";
                        r2.A02 = str2;
                        r2.A04 = A002;
                        r2.A00 = 670735092L;
                        r2.A01 = str;
                        r3.A00.CC7(r2);
                        return;
                    }
                }
            }
        }
    }

    public C138956xy(C18030ve r1, C126846dO r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
