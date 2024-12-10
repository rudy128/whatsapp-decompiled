package X;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.Comparator;

/* renamed from: X.0Zd  reason: invalid class name and case insensitive filesystem */
public class C06650Zd implements Comparator {
    public final int A00;
    public final Object A01;

    public C06650Zd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final int compare(Object obj, Object obj2) {
        C17080ti r2;
        Integer valueOf;
        Object obj3;
        int i;
        switch (this.A00) {
            case 0:
            case 1:
                r2 = (C17080ti) this.A01;
                valueOf = Integer.valueOf(r2.BSs(((AnonymousClass0V0) obj).A08));
                obj3 = ((AnonymousClass0V0) obj2).A08;
                break;
            case 4:
                return AndroidComposeViewAccessibilityDelegateCompat.A05(obj, obj2, (AnonymousClass1OS) this.A01);
            case 5:
                int compare = ((Comparator) this.A01).compare(obj, obj2);
                if (compare == 0) {
                    valueOf = Integer.valueOf(((C05060Qg) obj).A02);
                    i = ((C05060Qg) obj2).A02;
                    break;
                } else {
                    return compare;
                }
            default:
                r2 = (C17080ti) this.A01;
                valueOf = Integer.valueOf(r2.BSs(((AnonymousClass0V0) obj2).A08));
                obj3 = ((AnonymousClass0V0) obj).A08;
                break;
        }
        i = r2.BSs(obj3);
        return C40151uF.A00(valueOf, Integer.valueOf(i));
    }
}
