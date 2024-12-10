package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;

/* renamed from: X.1bL  reason: invalid class name and case insensitive filesystem */
public class C28951bL implements C004001t {
    public int A00;
    public C28991bP A01;
    public boolean A02 = false;
    public C003301m A03;

    public boolean BFB(AnonymousClass03G r2) {
        return false;
    }

    public boolean BKu(AnonymousClass03G r2) {
        return false;
    }

    public boolean BLO() {
        return false;
    }

    public void Bp9(C003301m r1, boolean z) {
    }

    public boolean C7B(AnonymousClass068 r2) {
        return false;
    }

    public void CIA(C004301w r2) {
        throw AnonymousClass04E.createAndThrow();
    }

    public void BdO(Context context, C003301m r3) {
        this.A03 = r3;
        this.A01.A0G = r3;
    }

    public void C3a(Parcelable parcelable) {
        if (parcelable instanceof C64512ut) {
            C28991bP r5 = this.A01;
            C64512ut r8 = (C64512ut) parcelable;
            int i = r8.A00;
            int size = r5.A0G.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = r5.A0G.getItem(i2);
                if (i == item.getItemId()) {
                    r5.A0A = i;
                    r5.A0B = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.A01.getContext();
            C22638BGy bGy = r8.A01;
            SparseArray sparseArray = new SparseArray(bGy.size());
            int i3 = 0;
            while (i3 < bGy.size()) {
                int keyAt = bGy.keyAt(i3);
                C64542uw r1 = (C64542uw) bGy.valueAt(i3);
                if (r1 != null) {
                    sparseArray.put(keyAt, new C29341c3(context, r1));
                    i3++;
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            C28991bP r6 = this.A01;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int keyAt2 = sparseArray.keyAt(i4);
                SparseArray sparseArray2 = r6.A0N;
                if (sparseArray2.indexOfKey(keyAt2) < 0) {
                    sparseArray2.append(keyAt2, sparseArray.get(keyAt2));
                }
            }
            C29221bq[] r4 = r6.A0J;
            if (r4 != null) {
                for (C29221bq r2 : r4) {
                    r2.setBadge((C29341c3) r6.A0N.get(r2.getId()));
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.os.Parcelable, X.2ut, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.util.SparseArray, X.BGy] */
    public Parcelable C4J() {
        ? obj = new Object();
        C28991bP r1 = this.A01;
        obj.A00 = r1.A0A;
        SparseArray sparseArray = r1.A0N;
        ? sparseArray2 = new SparseArray();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            C29341c3 r0 = (C29341c3) sparseArray.valueAt(i);
            if (r0 != null) {
                sparseArray2.put(keyAt, r0.A08.A04);
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        obj.A01 = sparseArray2;
        return obj;
    }

    public void CQu(boolean z) {
        C29221bq[] r0;
        C29051bX r02;
        if (!this.A02) {
            C28991bP r5 = this.A01;
            if (!z) {
                C003301m r1 = r5.A0G;
                if (r1 != null && (r0 = r5.A0J) != null) {
                    int size = r1.size();
                    if (size == r0.length) {
                        int i = r5.A0A;
                        for (int i2 = 0; i2 < size; i2++) {
                            MenuItem item = r5.A0G.getItem(i2);
                            if (item.isChecked()) {
                                r5.A0A = item.getItemId();
                                r5.A0B = i2;
                            }
                        }
                        if (!(i == r5.A0A || (r02 = r5.A0O) == null)) {
                            C29191bl.A02(r5, r02);
                        }
                        int i3 = r5.A09;
                        int size2 = r5.A0G.A0D().size();
                        boolean z2 = true;
                        if (i3 != -1 ? i3 != 0 : size2 <= 3) {
                            z2 = false;
                        }
                        for (int i4 = 0; i4 < size; i4++) {
                            r5.A0H.A02 = true;
                            r5.A0J[i4].setLabelVisibilityMode(r5.A09);
                            r5.A0J[i4].setShifting(z2);
                            r5.A0J[i4].BdW((AnonymousClass03G) r5.A0G.getItem(i4));
                            r5.A0H.A02 = false;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            r5.A02();
        }
    }

    public int getId() {
        return this.A00;
    }
}
