package X;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* renamed from: X.2kz  reason: invalid class name and case insensitive filesystem */
public final class C58622kz {
    public C002100z A00;
    public HashMap A01 = C17880vN.A11();
    public TreeSet A02 = new TreeSet();
    public final Bitmap.Config A03 = Bitmap.Config.ARGB_8888;

    public final void A01(int i, int i2, String str) {
        C18070vi.A0d(str, 2);
        synchronized (this.A00) {
            int A012 = AnonymousClass204.A01(this.A03, i, i2);
            HashMap hashMap = this.A01;
            Integer valueOf = Integer.valueOf(A012);
            LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(valueOf);
            if (linkedHashSet != null) {
                linkedHashSet.remove(str);
                if (linkedHashSet.isEmpty()) {
                    this.A02.remove(valueOf);
                }
            }
        }
    }

    public final void A00(int i, int i2, String str) {
        synchronized (this.A00) {
            int A012 = AnonymousClass204.A01(this.A03, i, i2);
            HashMap hashMap = this.A01;
            Integer valueOf = Integer.valueOf(A012);
            if (hashMap.get(valueOf) == null) {
                hashMap.put(valueOf, C17880vN.A14());
            }
            LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(valueOf);
            if (linkedHashSet != null) {
                linkedHashSet.add(str);
            }
            TreeSet treeSet = this.A02;
            if (!treeSet.contains(valueOf)) {
                treeSet.add(valueOf);
            }
        }
    }

    public C58622kz(C002100z r2) {
        this.A00 = r2;
    }
}
