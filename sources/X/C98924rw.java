package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.4rw  reason: invalid class name and case insensitive filesystem */
public class C98924rw implements Comparator {
    public final int A00;

    public C98924rw(int i) {
        this.A00 = i;
    }

    public static List A00(Iterable iterable, int i) {
        return C29431cG.A0y(iterable, new C98924rw(i));
    }

    public final int compare(Object obj, Object obj2) {
        Integer num;
        Comparable BWI;
        Comparable BWI2;
        switch (this.A00) {
            case 2:
                return C40151uF.A00(((AnonymousClass4UT) obj).A03, ((AnonymousClass4UT) obj2).A03);
            case 3:
                AnonymousClass1D6 r7 = (AnonymousClass1D6) obj2;
                AnonymousClass1E7 r1 = (AnonymousClass1E7) r7.second;
                boolean A1R = C17890vO.A1R(((C134216qE) r7.first).A04);
                boolean A0B = r1.A0B();
                boolean z = r1.A0g;
                int i = 0;
                if (A1R) {
                    i = 1000;
                }
                if (z) {
                    i++;
                }
                if (A0B) {
                    i += 100;
                }
                Integer valueOf = Integer.valueOf(i);
                AnonymousClass1D6 r6 = (AnonymousClass1D6) obj;
                AnonymousClass1E7 r12 = (AnonymousClass1E7) r6.second;
                boolean A1R2 = C17890vO.A1R(((C134216qE) r6.first).A04);
                boolean A0B2 = r12.A0B();
                boolean z2 = r12.A0g;
                int i2 = 0;
                if (A1R2) {
                    i2 = 1000;
                }
                if (z2) {
                    i2++;
                }
                if (A0B2) {
                    i2 += 100;
                }
                return C40151uF.A00(valueOf, Integer.valueOf(i2));
            case 4:
                AnonymousClass206 r62 = (AnonymousClass206) obj;
                AnonymousClass206 r72 = (AnonymousClass206) obj2;
                int A01 = C18070vi.A01(r72.A0y, r62.A0y);
                if (A01 == 0) {
                    return C18070vi.A00(r72.A0u, r62.A0u);
                }
                return A01;
            case 5:
                C692136i A002 = AnonymousClass2UX.A00((AnonymousClass206) obj);
                Integer num2 = null;
                if (A002 != null) {
                    num = A002.A02;
                } else {
                    num = null;
                }
                C692136i A003 = AnonymousClass2UX.A00((AnonymousClass206) obj2);
                if (A003 != null) {
                    num2 = A003.A02;
                }
                return C40151uF.A00(num, num2);
            case 6:
                BWI = Integer.valueOf(((C135966t3) obj).A03);
                BWI2 = Integer.valueOf(((C135966t3) obj2).A03);
                break;
            case 7:
                return (int) (((AnonymousClass206) obj).A0y - ((AnonymousClass206) obj2).A0y);
            case 8:
                return C40151uF.A00(Long.valueOf(((AnonymousClass206) obj2).A0I), Long.valueOf(((AnonymousClass206) obj).A0I));
            case 9:
                return C40151uF.A00(((C87104Uh) obj).A01, ((C87104Uh) obj2).A01);
            case 10:
                return 0;
            case 11:
                BWI = ((AnonymousClass4VK) obj).A00();
                BWI2 = ((AnonymousClass4VK) obj2).A00();
                break;
            case 12:
                BWI = Integer.valueOf((obj instanceof AnonymousClass454) ^ true ? 1 : 0);
                BWI2 = Integer.valueOf((obj2 instanceof AnonymousClass454) ^ true ? 1 : 0);
                break;
            case 13:
                BWI = ((AnonymousClass456) obj2).A00.A05();
                BWI2 = ((AnonymousClass456) obj).A00.A05();
                break;
            case 14:
                NewsletterReportAppealStateResponseImpl newsletterReportAppealStateResponseImpl = (NewsletterReportAppealStateResponseImpl) obj2;
                String A0F = newsletterReportAppealStateResponseImpl.A0H().A0F("creation_time");
                if (A0F == null) {
                    A0F = C72453Mb.A0z(newsletterReportAppealStateResponseImpl, "creation_time");
                }
                Long valueOf2 = Long.valueOf(Long.parseLong(A0F));
                NewsletterReportAppealStateResponseImpl newsletterReportAppealStateResponseImpl2 = (NewsletterReportAppealStateResponseImpl) obj;
                String A0F2 = newsletterReportAppealStateResponseImpl2.A0H().A0F("creation_time");
                if (A0F2 == null) {
                    A0F2 = C72453Mb.A0z(newsletterReportAppealStateResponseImpl2, "creation_time");
                }
                return C40151uF.A00(valueOf2, Long.valueOf(Long.parseLong(A0F2)));
            case 15:
                AnonymousClass206 r63 = (AnonymousClass206) obj;
                AnonymousClass206 r73 = (AnonymousClass206) obj2;
                int i3 = (r63.A0I > r73.A0I ? 1 : (r63.A0I == r73.A0I ? 0 : -1));
                if (i3 == 0) {
                    return (r63.A0y > r73.A0y ? 1 : (r63.A0y == r73.A0y ? 0 : -1));
                }
                return i3;
            case 16:
                return (((AnonymousClass206) obj).A0I > ((AnonymousClass206) obj2).A0I ? 1 : (((AnonymousClass206) obj).A0I == ((AnonymousClass206) obj2).A0I ? 0 : -1));
            case 17:
                BWI = ((C108635c2) obj).BWI();
                BWI2 = ((C108635c2) obj2).BWI();
                break;
            case 18:
                C108465bk r64 = (C108465bk) obj;
                C108465bk r74 = (C108465bk) obj2;
                if (r64 == null || r74 == null) {
                    return -1;
                }
                boolean BeK = r64.BeK();
                boolean BeK2 = r74.BeK();
                if (BeK == BeK2) {
                    return r64.BXa() - r74.BXa();
                }
                if (BeK2) {
                    return -1;
                }
                return 1;
            default:
                BWI = ((AnonymousClass1E7) obj).A0J;
                BWI2 = ((AnonymousClass1E7) obj2).A0J;
                break;
        }
        return C40151uF.A00(BWI, BWI2);
    }
}
