package X;

import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5lz  reason: invalid class name and case insensitive filesystem */
public abstract class C112755lz extends C39711tW {
    public int A00;
    public AnonymousClass6UU A01;
    public boolean A02;
    public final AnonymousClass11P A03;
    public final C111835kV A04;
    public final C18030ve A05;
    public final C18100vl A06 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C150537kq(this));
    public final C18100vl A07 = AnonymousClass1DF.A01(new C150547kr(this));
    public final Resources A08;
    public final GridLayoutManager A09;
    public final boolean A0A;

    public void A03(RecyclerView recyclerView, int i) {
        boolean z = false;
        C18070vi.A0d(recyclerView, 0);
        if (i != 0) {
            if (i == 2) {
                z = true;
            } else {
                return;
            }
        }
        this.A02 = z;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        int i5;
        C111835kV r0;
        AnonymousClass6UU A032;
        C111835kV r02;
        AnonymousClass6UU A033;
        RecyclerView recyclerView2 = recyclerView;
        C18070vi.A0d(recyclerView, 0);
        GridLayoutManager gridLayoutManager = this.A09;
        int i6 = 0;
        if (gridLayoutManager != null) {
            i3 = gridLayoutManager.A1O();
        } else {
            i3 = 0;
        }
        if (this.A02) {
            if (gridLayoutManager != null) {
                i4 = gridLayoutManager.A1Q();
                i5 = gridLayoutManager.A1N();
                i6 = gridLayoutManager.A1P();
            } else {
                i4 = 0;
                i5 = 0;
            }
            this.A00 = i6;
            if (!(i3 < 0 || (r0 = this.A04) == null || (A032 = ((C138756xd) r0.A0U(i3)).A03()) == null)) {
                this.A01 = A032;
            }
            if (C18020vd.A05(C18040vf.A02, this.A05, 8617)) {
                C18100vl r1 = this.A06;
                ((C132916nr) r1.getValue()).A00 = new AnonymousClass7wW(recyclerView2, this, i3, i4, i5);
                ((C132916nr) r1.getValue()).A00();
                return;
            }
            A00(recyclerView, this, i3, i4, i5);
        } else if (i3 >= 0 && (r02 = this.A04) != null && (A033 = ((C138756xd) r02.A0U(i3)).A03()) != null) {
            this.A01 = A033;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r7 <= r10.A00) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r7 < (r13 + r5)) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        if (r7 <= r12) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(androidx.recyclerview.widget.RecyclerView r9, X.C112755lz r10, int r11, int r12, int r13) {
        /*
            androidx.recyclerview.widget.GridLayoutManager r6 = r10.A09
            if (r6 == 0) goto L_0x0071
            int r5 = r6.A00
        L_0x0006:
            android.content.res.Resources r0 = r10.A08
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 1
            boolean r8 = X.AnonymousClass000.A1T(r1, r0)
            if (r6 == 0) goto L_0x0073
            int r4 = r6.A0J()
            r3 = 0
        L_0x001a:
            if (r3 >= r4) goto L_0x0073
            android.view.View r1 = r6.A0P(r3)
            if (r1 == 0) goto L_0x0073
            int r7 = X.C38251qy.A02(r1)
            X.1xT r0 = r9.A0Q(r1)
            boolean r0 = r0 instanceof X.AnonymousClass61I
            if (r0 == 0) goto L_0x0056
            X.1xT r2 = r9.A0Q(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.ui.stickergrid.viewholder.StickerViewHolder"
            X.C18070vi.A0z(r2, r0)
            X.61I r2 = (X.AnonymousClass61I) r2
            X.0vl r0 = r10.A07
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0063
            if (r8 == 0) goto L_0x0063
            int r1 = r10.A00
            boolean r0 = r10.A0A
            if (r12 != r1) goto L_0x0059
            r2.A0C(r0)
            if (r13 > r7) goto L_0x006f
            int r0 = r10.A00
            if (r7 > r0) goto L_0x006f
        L_0x0052:
            r0 = 1
        L_0x0053:
            r2.A0B(r0)
        L_0x0056:
            int r3 = r3 + 1
            goto L_0x001a
        L_0x0059:
            r2.A0C(r0)
            if (r7 < r13) goto L_0x006f
            int r0 = r13 + r5
            if (r7 >= r0) goto L_0x006f
            goto L_0x0052
        L_0x0063:
            boolean r0 = r10.A0A
            r2.A0C(r0)
            if (r11 < 0) goto L_0x0056
            if (r11 > r7) goto L_0x006f
            if (r7 > r12) goto L_0x006f
            goto L_0x0052
        L_0x006f:
            r0 = 0
            goto L_0x0053
        L_0x0071:
            r5 = 0
            goto L_0x0006
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112755lz.A00(androidx.recyclerview.widget.RecyclerView, X.5lz, int, int, int):void");
    }

    public C112755lz(Resources resources, GridLayoutManager gridLayoutManager, AnonymousClass11P r5, C111835kV r6, C18030ve r7, boolean z) {
        C18070vi.A0k(r7, resources);
        this.A03 = r5;
        this.A05 = r7;
        this.A08 = resources;
        this.A09 = gridLayoutManager;
        this.A0A = z;
        this.A04 = r6;
    }
}
