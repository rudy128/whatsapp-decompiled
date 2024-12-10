package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.BhD  reason: case insensitive filesystem */
public final class C23448BhD extends C27294DbN<String> implements EE3, RandomAccess {
    public static final C23448BhD A01;
    public static final EE3 A02;
    public final List A00;

    static {
        C23448BhD bhD = new C23448BhD();
        A01 = bhD;
        bhD.A00 = false;
        A02 = bhD;
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof DSO) {
            DSO dso = (DSO) obj;
            Charset charset = C25462CgF.A00;
            if (dso.A01() == 0) {
                return "";
            }
            C23452BhH bhH = (C23452BhH) dso;
            return BE6.A0r(charset, bhH.zzb, bhH.A03(), bhH.A01());
        }
        return BE6.A0q(C25462CgF.A00, (byte[]) obj);
    }

    public final Object CTH(int i) {
        return this.A00.get(i);
    }

    public final List CTW() {
        return Collections.unmodifiableList(this.A00);
    }

    public final EE3 CTa() {
        if (this.A00) {
            return new C27295DbO(this);
        }
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        String A0q;
        int A012;
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof DSO) {
            DSO dso = (DSO) obj;
            Charset charset = C25462CgF.A00;
            if (dso.A01() == 0) {
                A0q = "";
            } else {
                C23452BhH bhH = (C23452BhH) dso;
                A0q = BE6.A0r(charset, bhH.zzb, bhH.A03(), bhH.A01());
            }
            C23452BhH bhH2 = (C23452BhH) dso;
            int A03 = bhH2.A03();
            A012 = C25406Cf8.A00.A01(bhH2.zzb, A03, bhH2.A01() + A03);
        } else {
            byte[] bArr = (byte[]) obj;
            A0q = BE6.A0q(C25462CgF.A00, bArr);
            A012 = C25406Cf8.A00.A01(bArr, 0, bArr.length);
        }
        if (A012 == 0) {
            list.set(i, A0q);
        }
        return A0q;
    }

    public final int size() {
        return this.A00.size();
    }

    public C23448BhD(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public final /* synthetic */ EE8 CSz(int i) {
        if (i >= size()) {
            ArrayList A0z = C17880vN.A0z(i);
            A0z.addAll(this.A00);
            return new C23448BhD(A0z);
        }
        throw BE6.A0j();
    }

    public final void CT3(DSO dso) {
        A01();
        this.A00.add(dso);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof EE3) {
            collection = ((EE3) collection).CTW();
        }
        boolean addAll = this.A00.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        A01();
        this.A00.clear();
        this.modCount++;
    }

    public final /* synthetic */ Object remove(int i) {
        A01();
        Object remove = this.A00.remove(i);
        this.modCount++;
        return A00(remove);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        A01();
        return A00(this.A00.set(i, obj));
    }

    public C23448BhD() {
        this(C17880vN.A0z(10));
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
