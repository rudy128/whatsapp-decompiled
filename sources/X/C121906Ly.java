package X;

import java.util.Collection;

/* renamed from: X.6Ly  reason: invalid class name and case insensitive filesystem */
public final class C121906Ly extends A34 {
    public final int A00 = 200;
    public final C122596Qz A01;
    public final AnonymousClass87H A02;
    public final AnonymousClass8AO A03;
    public final boolean A04;
    public final /* synthetic */ C139596z7 A05;

    public C121906Ly(C139596z7 r2, C122596Qz r3, AnonymousClass87H r4, AnonymousClass8AO r5, boolean z) {
        this.A05 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = z;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Collection BL6;
        String[] strArr = (String[]) objArr;
        C18070vi.A0d(strArr, 0);
        int length = strArr.length;
        AnonymousClass8AO r3 = this.A03;
        if (length == 1) {
            BL6 = r3.BL5(strArr[0], this.A00, this.A04);
        } else {
            BL6 = r3.BL6(strArr);
        }
        C18070vi.A0b(BL6);
        return BL6;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Collection collection = (Collection) obj;
        C18070vi.A0d(collection, 0);
        this.A05.A09.remove(this.A01);
        if (!C108945cZ.A1T(this)) {
            this.A02.C3o(collection);
        }
    }
}
