package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Akm  reason: case insensitive filesystem */
public class C21481Akm implements Comparator {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C21481Akm(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final int compare(Object obj, Object obj2) {
        Comparable comparable;
        int i;
        boolean z;
        switch (this.A00) {
            case 0:
                int compare = ((Comparator) this.A02).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                AbstractMap abstractMap = (AbstractMap) this.A01;
                return C40151uF.A00((Comparable) abstractMap.get(obj), (Comparable) abstractMap.get(obj2));
            case 1:
                int compare2 = ((Comparator) this.A02).compare(obj, obj2);
                if (compare2 == 0) {
                    Map map = (Map) this.A01;
                    int i2 = (Integer) map.get(obj2);
                    if (i2 == null) {
                        i2 = 0;
                    }
                    i = (Integer) map.get(obj);
                    if (i == null) {
                        i = 0;
                        break;
                    }
                } else {
                    return compare2;
                }
                break;
            case 2:
                int compare3 = ((Comparator) this.A02).compare(obj, obj2);
                if (compare3 == 0) {
                    Map map2 = (Map) this.A01;
                    int i3 = (Long) map2.get(obj2);
                    if (i3 == null) {
                        i3 = 0;
                    }
                    comparable = i3;
                    int i4 = (Long) map2.get(obj);
                    if (i4 == null) {
                        i4 = 0;
                    }
                    i = i4;
                    break;
                } else {
                    return compare3;
                }
            case 3:
                String str = (String) obj2;
                Context context = (Context) this.A01;
                List list = A8K.A03;
                C18070vi.A0d(str, 1);
                comparable = Boolean.valueOf(AnonymousClass000.A1W(C24211Jh.A02(context, str)));
                String str2 = (String) obj;
                C18070vi.A0d(str2, 1);
                z = AnonymousClass000.A1W(C24211Jh.A02(context, str2));
                break;
            case 4:
                Context context2 = (Context) this.A01;
                String str3 = ((C195739tp) obj2).A08;
                List list2 = A8K.A03;
                C18070vi.A0d(str3, 1);
                comparable = Boolean.valueOf(AnonymousClass000.A1W(C24211Jh.A02(context2, str3)));
                String str4 = ((C195739tp) obj).A08;
                C18070vi.A0d(str4, 1);
                z = AnonymousClass000.A1W(C24211Jh.A02(context2, str4));
                break;
            default:
                C98964s0 r7 = (C98964s0) this.A02;
                PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = ((C177759Al) this.A01).A00;
                AnonymousClass1QO r2 = paymentGroupParticipantPickerActivity.A0B;
                AnonymousClass1E7 r6 = ((C184879bf) obj).A00;
                Class<UserJid> cls = UserJid.class;
                int A002 = AnonymousClass1R2.A00(paymentGroupParticipantPickerActivity.A08, (UserJid) r6.A06(cls), r2);
                AnonymousClass1QO r3 = paymentGroupParticipantPickerActivity.A0B;
                AnonymousClass1E7 r22 = ((C184879bf) obj2).A00;
                int A003 = AnonymousClass1R2.A00(paymentGroupParticipantPickerActivity.A08, (UserJid) r22.A06(cls), r3);
                if (A002 == 2) {
                    if (A003 != 2) {
                        return -1;
                    }
                } else if (A003 == 2) {
                    return 1;
                }
                return r7.compare(r6, r22);
        }
        i = Boolean.valueOf(z);
        return C40151uF.A00(comparable, i);
    }
}
