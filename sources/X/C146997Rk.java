package X;

import android.util.Pair;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;
import com.whatsapp.updates.viewmodels.SearchUsecase;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;

/* renamed from: X.7Rk  reason: invalid class name and case insensitive filesystem */
public class C146997Rk implements Comparator {
    public final int A00;
    public final Object A01;

    public C146997Rk(Map map, int i) {
        this.A00 = i;
        if (4 - i != 0) {
            this.A01 = map;
        } else {
            this.A01 = map;
        }
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        Integer num;
        String str;
        int i2;
        int i3;
        switch (this.A00) {
            case 0:
                ParticipantsListViewModel participantsListViewModel = (ParticipantsListViewModel) this.A01;
                C135656sY r9 = (C135656sY) obj;
                C135656sY r10 = (C135656sY) obj2;
                int i4 = r9.A00;
                boolean z = false;
                if (i4 == 1 && r10.A00 == 1) {
                    return 0;
                }
                if (i4 == 1) {
                    return -1;
                }
                if (r10.A00 == 1) {
                    return 1;
                }
                AnonymousClass1M9 r1 = participantsListViewModel.A0A;
                AnonymousClass1E7 A0H = r1.A0H(r9.A01);
                AnonymousClass1E7 A0H2 = r1.A0H(r10.A01);
                C59042lf r2 = A0H.A0H;
                boolean A1W = AnonymousClass000.A1W(r2);
                if (A0H2.A0H != null) {
                    z = true;
                }
                if (A1W == z) {
                    C24921Me r0 = participantsListViewModel.A0B;
                    return r0.A0I(A0H).compareTo(r0.A0I(A0H2));
                } else if (r2 != null) {
                    return -1;
                } else {
                    return 1;
                }
            case 1:
                return (((AnonymousClass1E7) obj2).A0J() > ((AnonymousClass1E7) obj).A0J() ? 1 : (((AnonymousClass1E7) obj2).A0J() == ((AnonymousClass1E7) obj).A0J() ? 0 : -1));
            case 2:
                return AnonymousClass1XO.A00(((A18) obj2).A00, ((A18) obj).A00);
            case 3:
                return (((A18) obj).A01 > ((A18) obj2).A01 ? 1 : (((A18) obj).A01 == ((A18) obj2).A01 ? 0 : -1));
            case 4:
                Map map = (Map) this.A01;
                C28381a4 r92 = (C28381a4) obj;
                C28381a4 r102 = (C28381a4) obj2;
                if (r92 != r102) {
                    return -(C17880vN.A05(map.get(r92.A05)) > C17880vN.A05(map.get(r102.A05)) ? 1 : (C17880vN.A05(map.get(r92.A05)) == C17880vN.A05(map.get(r102.A05)) ? 0 : -1));
                }
                return 0;
            case 8:
                AnonymousClass708 r103 = (AnonymousClass708) obj2;
                AnonymousClass8AS r5 = (AnonymousClass8AS) this.A01;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(r103.A06);
                A10.append(':');
                int i5 = r103.A01;
                r5.Biz(C17880vN.A0t(A10, i5));
                Integer valueOf = Integer.valueOf(i5);
                AnonymousClass708 r93 = (AnonymousClass708) obj;
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append(r93.A06);
                A102.append(':');
                int i6 = r93.A01;
                r5.Biz(C17880vN.A0t(A102, i6));
                return C40151uF.A00(valueOf, Integer.valueOf(i6));
            case 9:
                AnonymousClass1OS r12 = (AnonymousClass1OS) this.A01;
                String[] strArr = C1409073n.A04;
                C18070vi.A0d(r12, 0);
                return AnonymousClass000.A0M(r12.invoke(obj, obj2));
            case 14:
                AbstractMap abstractMap = (AbstractMap) this.A01;
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                String A012 = C137416vQ.A01((String) pair.first, (String) pair.second);
                String A013 = C137416vQ.A01((String) pair2.first, (String) pair2.second);
                Object obj3 = abstractMap.get(A012);
                C17960vV.A07(obj3);
                int A0M = AnonymousClass000.A0M(obj3);
                Object obj4 = abstractMap.get(A013);
                C17960vV.A07(obj4);
                return AnonymousClass000.A0M(obj4) - A0M;
            case 15:
                Map map2 = (Map) this.A01;
                return C40151uF.A00((Integer) map2.get(((AnonymousClass725) obj).A0H), (Integer) map2.get(((AnonymousClass725) obj2).A0H));
            case 16:
                int compare = ((Comparator) this.A01).compare(obj, obj2);
                if (compare == 0) {
                    return C40151uF.A00(Long.valueOf(((C121346Jh) obj2).A08), Long.valueOf(((C121346Jh) obj).A08));
                }
                return compare;
            case 17:
                String str2 = ((C121346Jh) obj).A0A.A0T;
                i = 0;
                if (str2 != null) {
                    i2 = AnonymousClass1YF.A0F(str2, ((SearchUsecase) this.A01).A03(), 0, true);
                } else {
                    i2 = 0;
                }
                num = Integer.valueOf(i2);
                str = ((C121346Jh) obj2).A0A.A0T;
                break;
            case 18:
                String A0K = ((AnonymousClass6JB) obj).A00.A0K();
                i = 0;
                if (A0K != null) {
                    i3 = AnonymousClass1YF.A0F(A0K, ((SearchUsecase) this.A01).A03(), 0, true);
                } else {
                    i3 = 0;
                }
                num = Integer.valueOf(i3);
                str = ((AnonymousClass6JB) obj2).A00.A0K();
                break;
            case 19:
                AbstractCollection abstractCollection = (AbstractCollection) this.A01;
                return C40151uF.A00(Boolean.valueOf(abstractCollection.contains(((C21319Ai4) obj2).A0F)), Boolean.valueOf(abstractCollection.contains(((C21319Ai4) obj).A0F)));
            default:
                AnonymousClass1OS r13 = (AnonymousClass1OS) this.A01;
                C18070vi.A0d(r13, 0);
                return AnonymousClass000.A0M(r13.invoke(obj, obj2));
        }
        if (str != null) {
            i = AnonymousClass1YF.A0F(str, ((SearchUsecase) this.A01).A03(), i, true);
        }
        return C40151uF.A00(num, Integer.valueOf(i));
    }

    public C146997Rk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
