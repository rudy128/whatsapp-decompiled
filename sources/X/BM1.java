package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class BM1 extends C40611uz {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final C24284Byh A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BM1) {
                BM1 bm1 = (BM1) obj;
                if (!(Float.compare(this.A01, bm1.A01) == 0 && Float.compare(this.A02, bm1.A02) == 0 && Float.compare(this.A00, bm1.A00) == 0 && this.A03 == bm1.A03 && this.A04 == bm1.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A04, (AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A01), this.A02), this.A00) + this.A03) * 31);
    }

    public BM1(C24284Byh byh, float f, float f2, float f3, int i) {
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A03 = i;
        this.A04 = byh;
    }

    public void A05(Rect rect, View view, C38021qZ r14, RecyclerView recyclerView) {
        C22707BLr bLr;
        int height;
        int A0A;
        boolean A16 = C18070vi.A16(rect, view);
        C18070vi.A0d(recyclerView, 2);
        C38391rD r9 = recyclerView.A0B;
        String str = null;
        if ((r9 instanceof C22707BLr) && (bLr = (C22707BLr) r9) != null) {
            int A002 = RecyclerView.A00(view);
            int size = bLr.A03.size();
            if (A002 != -1 && A002 < size) {
                C38251qy layoutManager = recyclerView.getLayoutManager();
                C18070vi.A0z(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int i = 0;
                boolean A1T = AnonymousClass000.A1T(layoutManager.A07.getLayoutDirection(), A16 ? 1 : 0);
                DFL dfl = ((DFE) bLr.A03.get(A002)).A01;
                C18070vi.A0z(dfl, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
                DFL A0P = BE7.A0P(dfl);
                if (A0P != null) {
                    str = BE7.A0i(A0P);
                }
                C24284Byh A003 = C24519C7n.A00(this.A04, str);
                int i2 = this.A03;
                if (i2 == A16) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                C04220Mi A022 = ((DFE) ((AnonymousClass0sP) bLr.A03.get(A002))).A00.A02();
                if (A022 != null) {
                    C04240Mk r0 = A022.A01;
                    if (i2 == A16) {
                        A0A = BE8.A0B(r0);
                    } else {
                        A0A = BE8.A0A(r0);
                    }
                    int i3 = height - A0A;
                    int ordinal = A003.ordinal();
                    if (ordinal == A16) {
                        i = C22339B3q.A00(((double) i3) / 2.0d);
                    } else if (ordinal == 2) {
                        i = i3;
                    }
                    if (i2 != A16) {
                        rect.top = i;
                    } else if (A1T) {
                        rect.right = i;
                    } else {
                        rect.left = i;
                    }
                }
                if (A002 == 0) {
                    int i4 = (int) this.A01;
                    if (i2 == A16) {
                        rect.top = i4;
                    } else if (A1T) {
                        rect.right = i4;
                    } else {
                        rect.left = i4;
                    }
                }
                if (A002 < size - 1) {
                    int i5 = (int) this.A02;
                    if (i2 == A16) {
                        rect.bottom = i5;
                    } else if (A1T) {
                        rect.left = i5;
                    } else {
                        rect.right = i5;
                    }
                }
                if (A002 == size - A16) {
                    int i6 = (int) this.A00;
                    if (i2 == A16) {
                        rect.bottom = i6;
                    } else if (A1T) {
                        rect.left = i6;
                    } else {
                        rect.right = i6;
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ItemDecoration(spacingBefore=");
        A10.append(this.A01);
        A10.append(", spacingBetween=");
        A10.append(this.A02);
        A10.append(", spacingAfter=");
        A10.append(this.A00);
        A10.append(", orientation=");
        A10.append(this.A03);
        A10.append(", alignItems=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
