package X;

import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.80L  reason: invalid class name */
public final class AnonymousClass80L extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass6BJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80L(AnonymousClass6BJ r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        ArrayList<List> arrayList;
        List<C135386s7> list;
        List<C135346s3> list2;
        ConcurrentMap concurrentMap = (ConcurrentMap) obj;
        AnonymousClass6BJ r1 = this.this$0;
        C18070vi.A0b(concurrentMap);
        if (r1 instanceof NewsletterDirectoryCategoriesActivity) {
            NewsletterDirectoryCategoriesActivity newsletterDirectoryCategoriesActivity = (NewsletterDirectoryCategoriesActivity) r1;
            C18070vi.A0d(concurrentMap, 0);
            C112405lQ r3 = newsletterDirectoryCategoriesActivity.A03;
            if (r3 == null) {
                str = "newsletterDirectoryCategoriesAdapter";
            } else if (newsletterDirectoryCategoriesActivity.A4p() || newsletterDirectoryCategoriesActivity.A09 != null) {
                List list3 = r3.A02;
                ArrayList<AnonymousClass6B5> A13 = AnonymousClass000.A13();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    C108985cd.A1O(A13, it);
                }
                ArrayList<C46162Dk> A0D = C29351c6.A0D(A13);
                for (AnonymousClass6B5 r0 : A13) {
                    A0D.add(r0.A06);
                }
                for (C46162Dk A0v : A0D) {
                    AnonymousClass6BJ.A0v(A0v, r3, concurrentMap);
                }
                return C27621Wu.A00;
            } else {
                C135366s5 r02 = r3.A00;
                AnonymousClass6B2 r5 = null;
                if (r02 == null || (list2 = r02.A02) == null) {
                    arrayList = null;
                } else {
                    arrayList = C29351c6.A0E(list2);
                    for (C135346s3 r03 : list2) {
                        arrayList.add(r03.A02);
                    }
                }
                C135366s5 r04 = r3.A00;
                if (r04 != null) {
                    r5 = r04.A01;
                }
                List<AnonymousClass6B5> list4 = r3.A03;
                C18070vi.A0z(list4, "null cannot be cast to non-null type kotlin.collections.List<com.whatsapp.newsletter.directory.NewsletterDataItem>");
                if (arrayList != null) {
                    for (List<AnonymousClass6B5> it2 : arrayList) {
                        for (AnonymousClass6B5 r05 : it2) {
                            AnonymousClass6BJ.A0v(r05.A06, r3, concurrentMap);
                        }
                    }
                }
                if (!(r5 == null || (list = r5.A00) == null)) {
                    ArrayList<C46162Dk> A0E = C29351c6.A0E(list);
                    for (C135386s7 r06 : list) {
                        A0E.add(r06.A02);
                    }
                    for (C46162Dk A0v2 : A0E) {
                        AnonymousClass6BJ.A0v(A0v2, r3, concurrentMap);
                    }
                }
                ArrayList<C46162Dk> A0E2 = C29351c6.A0E(list4);
                for (AnonymousClass6B5 r07 : list4) {
                    A0E2.add(r07.A06);
                }
                for (C46162Dk A0v3 : A0E2) {
                    AnonymousClass6BJ.A0v(A0v3, r3, concurrentMap);
                }
                return C27621Wu.A00;
            }
        } else {
            C18070vi.A0d(concurrentMap, 0);
            C112415lR r4 = ((NewsletterDirectoryActivity) r1).A06;
            if (r4 == null) {
                str = "newsletterDirectoryAdapter";
            } else {
                List A00 = C112415lR.A00(r4);
                ArrayList A132 = AnonymousClass000.A13();
                Iterator it3 = A00.iterator();
                while (it3.hasNext()) {
                    C108985cd.A1O(A132, it3);
                }
                AnonymousClass1IX copyOf = AnonymousClass1IX.copyOf((Collection) A132);
                Iterator A15 = AnonymousClass000.A15(concurrentMap);
                boolean z = false;
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    Iterator it4 = A132.iterator();
                    int i = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        int i2 = i + 1;
                        if (C18070vi.A18(((AnonymousClass6B5) it4.next()).A06.A08(), A16.getKey())) {
                            if (((AnonymousClass6B5) copyOf.get(i)).A06.A02 != ((C86924Tp) A16.getValue()).A00.A02) {
                                ((AnonymousClass6B5) copyOf.get(i)).A05 = false;
                                ((AnonymousClass6B5) copyOf.get(i)).A06.A02 = ((C86924Tp) A16.getValue()).A00.A02;
                                z = true;
                                break;
                            }
                        }
                        i = i2;
                    }
                }
                if (z) {
                    C18070vi.A0b(copyOf);
                    C112415lR.A01(r4, copyOf);
                }
                return C27621Wu.A00;
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
