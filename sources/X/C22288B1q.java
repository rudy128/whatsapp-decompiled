package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.B1q  reason: case insensitive filesystem */
public final class C22288B1q extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C184189aY $businessDirectoryResultsPage;
    public final /* synthetic */ C19989A2b $directoryQplLogger;
    public final /* synthetic */ C190499l3 $filters;
    public final /* synthetic */ String $query;
    public final /* synthetic */ String $queryId;
    public final /* synthetic */ C20079A6f $searchLocation;
    public final /* synthetic */ int $searchQueryBusinessType;
    public final /* synthetic */ String $searchSessionId;
    public final /* synthetic */ C198529yU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22288B1q(C184189aY r2, C190499l3 r3, C20079A6f a6f, C198529yU r5, C19989A2b a2b, String str, String str2, String str3, int i) {
        super(1);
        this.$query = str;
        this.this$0 = r5;
        this.$searchLocation = a6f;
        this.$searchQueryBusinessType = i;
        this.$businessDirectoryResultsPage = r2;
        this.$filters = r3;
        this.$queryId = str2;
        this.$searchSessionId = str3;
        this.$directoryQplLogger = a2b;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C193609qN r5 = (C193609qN) obj;
        C18070vi.A0d(r5, 0);
        C195189sw r2 = new C195189sw(r5, this.$query, 22);
        C198529yU r11 = this.this$0;
        String str = this.$query;
        C199359zr r10 = (C199359zr) r11.A03.get();
        C18070vi.A0d(str, 0);
        ArrayList A0m = C29431cG.A0m(r10.A02);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (C181139Ph.A00(r10.A00, ((AEQ) next).A01, str)) {
                A13.add(next);
            }
        }
        ArrayList A0m2 = C29431cG.A0m(r10.A01);
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it2 = A0m2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            String str2 = ((AF0) next2).A0I;
            C18070vi.A0W(str2);
            if (C181139Ph.A00(r10.A00, str2, str)) {
                A132.add(next2);
            }
        }
        ArrayList A0m3 = C29431cG.A0m(r10.A03);
        ArrayList A133 = AnonymousClass000.A13();
        Iterator it3 = A0m3.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            String str3 = ((AF0) next3).A0I;
            C18070vi.A0W(str3);
            if (C181139Ph.A00(r10.A00, str3, str)) {
                A133.add(next3);
            }
        }
        ArrayList A134 = AnonymousClass000.A13();
        Iterator it4 = A132.iterator();
        while (it4.hasNext()) {
            Object next4 = it4.next();
            AnonymousClass3MZ.A1V(next4, A134, C196569vH.A01(r2.A01, (AF0) next4) ? 1 : 0);
        }
        C188619hi r9 = r2.A02;
        List list = r9.A09;
        AnonymousClass8BW.A1P(A134, list, A134.size(), 1 - list.size());
        ArrayList A135 = AnonymousClass000.A13();
        Iterator it5 = A133.iterator();
        while (it5.hasNext()) {
            Object next5 = it5.next();
            AnonymousClass3MZ.A1V(next5, A135, C196569vH.A01(r2.A01, (AF0) next5) ? 1 : 0);
        }
        List list2 = r9.A0C;
        AnonymousClass8BW.A1P(A135, list2, A135.size(), 3 - list2.size());
        ArrayList A136 = AnonymousClass000.A13();
        Iterator it6 = A13.iterator();
        while (it6.hasNext()) {
            Object next6 = it6.next();
            AnonymousClass3MZ.A1V(next6, A136, C196569vH.A00(r2.A01, (AEQ) next6) ? 1 : 0);
        }
        List list3 = r9.A0A;
        AnonymousClass8BW.A1P(A136, list3, A136.size(), 3 - list3.size());
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = r11.A00;
        if (businessDirectoryContextualSearchViewModel != null) {
            businessDirectoryContextualSearchViewModel.A0V(r2.A01, r9.A01, str, r9.A05, r9.A08, list3, list2, list, true);
        }
        C198529yU r6 = this.this$0;
        String str4 = this.$query;
        C20079A6f a6f = this.$searchLocation;
        int i = this.$searchQueryBusinessType;
        C184189aY r13 = this.$businessDirectoryResultsPage;
        C190499l3 r14 = this.$filters;
        String str5 = this.$queryId;
        String str6 = this.$searchSessionId;
        C19989A2b a2b = this.$directoryQplLogger;
        C184209aa r92 = (C184209aa) r6.A02.get();
        AnonymousClass00H r7 = r6.A01;
        r7.get();
        String A0f = C108985cd.A0f();
        B1G b1g = new B1G(r6, r2, a2b);
        C18070vi.A0d(str4, 0);
        C18070vi.A0d(a6f, 1);
        if (a2b != null) {
            a2b.A03("text_search_category_request_start");
        }
        C22421B7d b7d = r92.A00;
        C191659mx r93 = r92.A01.A00;
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        b7d.BGz(r13, r14, a6f, new C20649ATh(a2b, b1g, 1), r93, str9, str7, A0f, str8, 1, false).A0E();
        r7.get();
        C198529yU.A00(r13, r14, a6f, r6, r2, a2b, str9, str7, C108985cd.A0f(), str8, i, true);
        return C27621Wu.A00;
    }
}
