package X;

import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.4WC  reason: invalid class name */
public abstract class AnonymousClass4WC {
    public static HashMap A00 = C17880vN.A11();

    public static void A00(AnonymousClass1KB r9, C143887Fe r10, C18000vb r11, C18030ve r12, AnonymousClass18K r13, AnonymousClass5a2 r14, AnonymousClass10I r15, String str, boolean z) {
        C143887Fe r0;
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            r0 = C20016A3i.A00(str2);
            boolean z2 = z;
            if (r0 != null) {
                r0.A0F = z2;
                if (r14 == null) {
                    return;
                }
            } else {
                HashMap hashMap = A00;
                AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str2);
                if (abstractCollection != null) {
                    abstractCollection.add(r14);
                    return;
                }
                ArrayList A0z = C17880vN.A0z(1);
                A0z.add(r14);
                hashMap.put(str2, A0z);
                r10.A0F = z2;
                r15.CGF(new C21463AkU(r11, r12, r13, r10, r9, str2, 3));
                return;
            }
        } else if (r14 != null) {
            r0 = null;
        } else {
            return;
        }
        r14.Bzv(r0, true);
    }
}
