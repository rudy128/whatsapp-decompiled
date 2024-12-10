package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.9yU  reason: invalid class name and case insensitive filesystem */
public final class C198529yU {
    public BusinessDirectoryContextualSearchViewModel A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.4rF] */
    public static final void A00(C184189aY r27, C190499l3 r28, C20079A6f a6f, C198529yU r30, C195189sw r31, C19989A2b a2b, String str, String str2, String str3, String str4, int i, boolean z) {
        C198529yU r1 = r30;
        C186549eN r3 = (C186549eN) r1.A05.get();
        C19989A2b a2b2 = a2b;
        String str5 = str;
        boolean z2 = z;
        C22281B1j b1j = new C22281B1j(r1, r31, a2b2, str5, z2);
        LinkedHashSet A14 = C17880vN.A14();
        ? obj = new Object();
        String str6 = str2;
        String str7 = str3;
        obj.element = new C188619hi(new A1Z((List) null, (List) null), (Double) null, (String) null, str6, str7, (String) null, (String) null, (String) null, AnonymousClass000.A13(), AnonymousClass000.A13(), AnonymousClass000.A13(), AnonymousClass000.A13(), 0);
        int i2 = i;
        C22282B1k b1k = new C22282B1k(r3, A14, b1j, obj, i2);
        if (a2b != null) {
            a2b2.A03("text_search_local_business_request_start");
        }
        C22421B7d b7d = r3.A00;
        C191659mx r8 = r3.A02.A00;
        int A012 = AnonymousClass8BU.A01(z2 ? 1 : 0);
        C20079A6f a6f2 = a6f;
        C20079A6f a6f3 = a6f2;
        C20651ATj aTj = new C20651ATj(a6f2, r3, a2b2, b1k);
        C191659mx r20 = r8;
        String str8 = str5;
        String str9 = str6;
        String str10 = str7;
        b7d.BGz(r27, r28, a6f3, aTj, r20, str8, str9, str10, str4, A012, !z).A0E();
        if (i == 0 || i2 == 2) {
            B1Z b1z = new B1Z(r3, A14, b1j, obj);
            if (a2b != null) {
                a2b2.A03("text_search_api_business_request_start");
            }
            r3.A03.BGw(new C20649ATh(a2b2, b1z, 0), r8, (C19989A2b) null, str5).A0E();
        }
    }

    public C198529yU(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A02 = r1;
        this.A05 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r5;
    }
}
