package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2T9  reason: invalid class name */
public abstract class AnonymousClass2T9 {
    public static final boolean A00(C19830z4 r8, C18030ve r9) {
        if (C87414Vm.A01(r9)) {
            C18040vf r1 = C18040vf.A02;
            int A00 = C18020vd.A00(r1, r9, 5419);
            int A002 = C18020vd.A00(r1, r9, 5483);
            if (A00 > 0 && A002 > 0) {
                AnonymousClass00H r3 = r8.A00;
                if (C17880vN.A0B(r3).getInt("push_to_video_sending_enabled", -1) == -1) {
                    String A0r = C17880vN.A0r(C17880vN.A0B(r3), "push_to_video_sending_enabled_default_info");
                    if (A0r != null) {
                        try {
                            List A0S = AnonymousClass1YF.A0S(A0r, new String[]{","}, 0);
                            ArrayList A0D = C29351c6.A0D(A0S);
                            Iterator it = A0S.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    int parseInt = Integer.parseInt(C17880vN.A0v(it));
                                    if (parseInt < 0) {
                                        break;
                                    }
                                    C17890vO.A1D(A0D, parseInt);
                                } else if (A0D.size() >= 3) {
                                    int A0n = AnonymousClass001.A0n(A0D, 0);
                                    int A0n2 = AnonymousClass001.A0n(A0D, 1);
                                    ((Number) A0D.get(2)).intValue();
                                    return (A00 == A0n && A002 == A0n2) ? false : true;
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        return false;
    }
}
