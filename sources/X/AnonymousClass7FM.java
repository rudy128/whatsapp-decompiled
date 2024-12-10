package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7FM  reason: invalid class name */
public final class AnonymousClass7FM implements AnonymousClass1WR {
    public final AnonymousClass00H A00;
    public final LinkedHashMap A01 = C17880vN.A13();

    public AnonymousClass7FM(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public void ByH(AnonymousClass206 r4, int i) {
        C18070vi.A0d(r4, 0);
        if (C1402870s.A00(r4)) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass206.A06(r4, "CrosspostingRecentStatusManager/onMessageAdded crosspostable message ", A10);
            C31081ez.A02(A10.toString());
            LinkedHashMap linkedHashMap = this.A01;
            if (C1402870s.A02(C108955ca.A17(linkedHashMap))) {
                C31081ez.A02("CrosspostingRecentStatusManager/onMessageAdded all previous messaged delivered. cache cleared");
                A02();
            }
            linkedHashMap.put(Long.valueOf(r4.A0x), r4);
        }
    }

    public void ByK(AnonymousClass206 r6, int i) {
        C18070vi.A0d(r6, 0);
        if (i == 24 && r6.A0H > 0 && C1402870s.A00(r6)) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass206.A06(r6, "CrosspostingRecentStatusManager/onMessageChanged crosspostable message ", A10);
            C31081ez.A02(A10.toString());
            long j = r6.A0x;
            LinkedHashMap linkedHashMap = this.A01;
            Long valueOf = Long.valueOf(j);
            if (linkedHashMap.containsKey(valueOf)) {
                linkedHashMap.put(valueOf, r6);
            }
            if (C1402870s.A02(C108955ca.A17(linkedHashMap))) {
                AnonymousClass7KY.A00(C17880vN.A0V(this.A00), A01(), 29);
            }
        }
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public void Bya(Collection collection, Map map) {
        C18070vi.A0d(collection, 0);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (C1402870s.A00(A0Y)) {
                StringBuilder A10 = AnonymousClass000.A10();
                AnonymousClass206.A06(A0Y, "CrosspostingRecentStatusManager/onMessagesDeleted message ", A10);
                C31081ez.A02(A10.toString());
                if (this.A01.containsKey(Long.valueOf(A0Y.A0x))) {
                    A02();
                }
            }
        }
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public final ArrayList A01() {
        return C17880vN.A10(this.A01.values());
    }

    public final void A02() {
        C31081ez.A02("CrosspostingRecentStatusManager/clearStatusBatch");
        LinkedHashMap linkedHashMap = this.A01;
        if (!linkedHashMap.isEmpty()) {
            linkedHashMap.clear();
            AnonymousClass7KX.A00(C17880vN.A0V(this.A00), 42);
        }
    }

    public static ArrayList A00(AnonymousClass00H r0) {
        return ((AnonymousClass7FM) r0.get()).A01();
    }
}
