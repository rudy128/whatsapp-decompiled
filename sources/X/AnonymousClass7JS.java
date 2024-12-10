package X;

import android.net.Uri;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7JS  reason: invalid class name */
public final class AnonymousClass7JS implements AnonymousClass89B {
    public C135306rz A00;
    public C131126kY A01;
    public final AnonymousClass1DS A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass1DT A04;
    public final AnonymousClass1DT A05;
    public final AnonymousClass1DT A06;
    public final C18030ve A07;
    public final AnonymousClass73D A08;
    public final C34501ka A09;
    public final C138086wV A0A;
    public final MediaViewOnceViewModel A0B;
    public final C24641Lc A0C;
    public final List A0D;
    public final C18100vl A0E = AnonymousClass1DF.A01(new C151537mS(this));
    public final C18100vl A0F = AnonymousClass1DF.A01(new C151547mT(this));
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final C002100z A0P = new C002100z(10);
    public final AnonymousClass1DT A0Q;
    public final C18100vl A0R = AnonymousClass1DF.A01(new C151557mU(this));
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r1 != 29) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean CMQ() {
        /*
            r4 = this;
            r3 = 0
            java.util.List r0 = r4.A0C()
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x002a
            java.util.List r0 = r4.A0C()
            java.lang.Object r2 = r0.get(r3)
            android.net.Uri r2 = (android.net.Uri) r2
            X.1ka r1 = r4.A09
            X.73D r0 = r4.A08
            X.72S r0 = r0.A02(r2)
            int r1 = r1.A01(r0)
            r0 = 13
            if (r1 == r0) goto L_0x0029
            r0 = 29
            if (r1 != r0) goto L_0x002a
        L_0x0029:
            return r3
        L_0x002a:
            X.1DT r0 = r4.A04
            java.util.List r0 = X.AnonymousClass3MW.A10(r0)
            if (r0 == 0) goto L_0x0029
            int r0 = r0.size()
            boolean r3 = X.C108975cc.A1B(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JS.CMQ():boolean");
    }

    public static int A01(MediaComposerActivity mediaComposerActivity) {
        return mediaComposerActivity.A0X.A0C().size();
    }

    public static ArrayList A02(MediaComposerActivity mediaComposerActivity) {
        List A0C2 = mediaComposerActivity.A0X.A0C();
        ArrayList arrayList = new ArrayList();
        C29431cG.A17(A0C2, arrayList);
        return arrayList;
    }

    public static List A03(MediaComposerActivity mediaComposerActivity) {
        return mediaComposerActivity.A0X.A0C();
    }

    public static final void A04(AnonymousClass7JS r3) {
        int A012;
        AnonymousClass1DT r1 = r3.A04;
        List list = r3.A0D;
        r1.A0E(Collections.unmodifiableList(list));
        if (list.isEmpty()) {
            A012 = -1;
        } else {
            if (r3.A07() >= list.size()) {
                A012 = AnonymousClass3MX.A01(list);
            }
            r3.A0B.A0V();
        }
        r3.A0D(A012);
        r3.A0B.A0V();
    }

    public static void A05(MediaComposerActivity mediaComposerActivity) {
        mediaComposerActivity.A1O = "default_share";
        mediaComposerActivity.A0s.A08(mediaComposerActivity.A0X.A0B());
        C32741hg r3 = mediaComposerActivity.A0s;
        C34501ka r0 = mediaComposerActivity.A0T;
        AnonymousClass72S A0c = MediaComposerActivity.A0c(mediaComposerActivity);
        Integer valueOf = Integer.valueOf(r0.A01(A0c));
        A0c.A0O(valueOf);
        r3.A0G(valueOf, mediaComposerActivity.A1O);
    }

    public final int A06() {
        if (C138766xe.A00(this.A0A)) {
            return 19;
        }
        if (A00(this) == 3) {
            return 11;
        }
        if (A00(this) == 1) {
            return 9;
        }
        return 12;
    }

    public final int A07() {
        Number A1C = C108945cZ.A1C(this.A0Q);
        if (A1C == null) {
            return -1;
        }
        return A1C.intValue();
    }

    public final int A08() {
        int i;
        if ((this.A0S && !C72453Mb.A1a(this.A01.A0C)) || !this.A0N || (i = this.A0A.A00) == 35 || i == 38 || i == 37 || i == 40) {
            return 1;
        }
        if (C18020vd.A05(C18040vf.A01, this.A0C.A01, 7436)) {
            return 2;
        }
        return 0;
    }

    public final int A09() {
        Number A1C = C108945cZ.A1C(this.A06);
        if (A1C == null) {
            return 0;
        }
        return A1C.intValue();
    }

    public final AnonymousClass77K A0B() {
        Object A062 = this.A05.A06();
        if (A062 != null) {
            return (AnonymousClass77K) A062;
        }
        throw C17880vN.A0g();
    }

    public final List A0C() {
        Iterable iterable = (Iterable) this.A04.A06();
        if (iterable == null) {
            iterable = C18460wS.A00;
        }
        return C29431cG.A0q(iterable);
    }

    public final void A0E(int i) {
        AnonymousClass1DT r1 = this.A06;
        Number A1C = C108945cZ.A1C(r1);
        if (A1C == null || i != A1C.intValue()) {
            AnonymousClass3MX.A1J(r1, i);
        }
    }

    public final boolean A0H() {
        int i = this.A0A.A00;
        if (i == 5 || i == 8 || i == 9 || i == 23 || i == 22 || i == 24 || i == 25 || i == 29 || i == 35 || i == 37 || i == 40) {
            return true;
        }
        return false;
    }

    public final boolean A0I() {
        if (!C18020vd.A05(C18040vf.A02, this.A07, 10024) || !C72453Mb.A1a(this.A01.A0B)) {
            return false;
        }
        return true;
    }

    public final boolean A0J() {
        if (!this.A0J || this.A0B.A0W() || !C72453Mb.A1a(this.A01.A0D) || this.A0A.A01 || !this.A0C.A02()) {
            return false;
        }
        return true;
    }

    public boolean CLu() {
        return !this.A08.A02((Uri) C108955ca.A0p(A0C())).A0W();
    }

    public static final int A00(AnonymousClass7JS r4) {
        Number number;
        Uri A0A2 = r4.A0A();
        if (A0A2 == null) {
            return -1;
        }
        if (!C18020vd.A05(C18040vf.A02, r4.A07, 8836) || (number = (Number) r4.A0P.A04(A0A2)) == null) {
            return r4.A09.A01(r4.A08.A02(A0A2));
        }
        return number.intValue();
    }

    public final Uri A0A() {
        int A072 = A07();
        if (A072 < 0) {
            return null;
        }
        List list = this.A0D;
        if (A072 < list.size()) {
            return (Uri) list.get(A072);
        }
        return null;
    }

    public final void A0D(int i) {
        if (A07() != i) {
            AnonymousClass3MX.A1J(this.A0Q, i);
            A0E(0);
        }
        AnonymousClass1DT r1 = this.A03;
        C18070vi.A0d(r1, 0);
        r1.A0F(r1.A06());
    }

    public final boolean A0F() {
        if (A00(this) != 1 || C138766xe.A00(this.A0A) || this.A0T || C72453Mb.A1a(this.A01.A0H)) {
            return false;
        }
        return true;
    }

    public final boolean A0G() {
        if (A0C().size() > 1 || (this.A0U && A0C().size() == 1)) {
            return true;
        }
        return false;
    }

    public AnonymousClass7JS(AnonymousClass77K r3, C18030ve r4, AnonymousClass73D r5, C34501ka r6, C138086wV r7, MediaViewOnceViewModel mediaViewOnceViewModel, C131126kY r9, C24641Lc r10, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        C18070vi.A0j(r6, r5);
        C18070vi.A0r(r7, r4, r10);
        C18070vi.A0d(r9, 20);
        C18070vi.A0d(mediaViewOnceViewModel, 21);
        this.A09 = r6;
        this.A08 = r5;
        this.A0S = z;
        this.A0N = z2;
        this.A0L = z3;
        this.A0M = z4;
        this.A0A = r7;
        this.A07 = r4;
        this.A0C = r10;
        this.A0U = z5;
        this.A0O = z6;
        this.A0K = z7;
        this.A0T = z8;
        this.A0I = z9;
        this.A0G = z10;
        this.A01 = r9;
        this.A0B = mediaViewOnceViewModel;
        this.A0J = z11;
        this.A0H = z12;
        ArrayList A13 = AnonymousClass000.A13();
        this.A0D = A13;
        AnonymousClass1DT A0S2 = C108945cZ.A0S();
        this.A03 = A0S2;
        this.A02 = A0S2;
        A13.addAll(list);
        this.A04 = AnonymousClass3MW.A0M(A13);
        this.A0Q = C108965cb.A0D(i);
        this.A06 = AnonymousClass3MW.A0M(AnonymousClass3MY.A0f());
        this.A05 = AnonymousClass3MW.A0M(r3);
        mediaViewOnceViewModel.A02 = this;
    }
}
