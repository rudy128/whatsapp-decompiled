package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4le  reason: invalid class name and case insensitive filesystem */
public final class C95074le implements C108445bi {
    public final AnonymousClass1KB A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1M9 A02;
    public final C24921Me A03;
    public final AnonymousClass11C A04;
    public final C18000vb A05;
    public final C32091gc A06;
    public final C18010vc A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;

    public Drawable BSc(Context context, C18000vb r3) {
        C18070vi.A0d(context, 0);
        return C24261Jm.A00(context, 2131231835);
    }

    public boolean CMC(Collection collection) {
        C18070vi.A0d(collection, 0);
        AnonymousClass1BI r1 = AnonymousClass3MX.A0s(collection).A0v.A00;
        if (C22971Dz.A0e(r1) && C72463Mc.A1T(r1, this.A0E)) {
            return false;
        }
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            C88174Yp r2 = (C88174Yp) this.A0D.get();
            C18070vi.A0d(A0Y, 0);
            Iterator A0h = C17890vO.A0h(r2.A00);
            while (A0h.hasNext()) {
                if (C18070vi.A19(((C108545bs) A0h.next()).BeO(A0Y), false)) {
                    return false;
                }
            }
            if (!C50112Te.A00(A0Y) && !C88174Yp.A00(r2, A0Y).BeP(A0Y)) {
                return false;
            }
        }
        return true;
    }

    public boolean BRj() {
        return true;
    }

    public int getId() {
        return 5;
    }

    public C95074le(AnonymousClass1KB r1, AnonymousClass11S r2, AnonymousClass1M9 r3, C24921Me r4, AnonymousClass11C r5, C18000vb r6, C32091gc r7, C18010vc r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0w(r1, r7, r2, r9, r3);
        C18070vi.A0x(r6, r5, r4, r10, r8);
        C18070vi.A0y(r11, r12, r13, r14, r15);
        this.A00 = r1;
        this.A06 = r7;
        this.A01 = r2;
        this.A08 = r9;
        this.A02 = r3;
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = r4;
        this.A0E = r10;
        this.A07 = r8;
        this.A0A = r11;
        this.A0C = r12;
        this.A0D = r13;
        this.A0B = r14;
        this.A09 = r15;
    }

    public String BaW(C108015az r3) {
        return C18070vi.A0F(C72463Mc.A0E(r3), 2131889050);
    }
}
