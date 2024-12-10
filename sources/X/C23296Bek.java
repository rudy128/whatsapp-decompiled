package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.Bek  reason: case insensitive filesystem */
public final class C23296Bek extends C27292DbL<String> implements EE2, RandomAccess {
    public static final C23296Bek A01;
    public static final EE2 A02;
    public final List A00;

    public C23296Bek(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public final Object BXq(int i) {
        return this.A00.get(i);
    }

    public final List CTP() {
        return Collections.unmodifiableList(this.A00);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof EE2) {
            collection = ((EE2) collection).CTP();
        }
        boolean addAll = this.A00.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
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

    public final int size() {
        return this.A00.size();
    }

    static {
        C23296Bek bek = new C23296Bek();
        A01 = bek;
        bek.A00 = false;
        A02 = bek;
    }

    public C23296Bek() {
        this(C17880vN.A0z(10));
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof DSP) {
            DSP dsp = (DSP) obj;
            Charset charset = C25461CgE.A00;
            if (dsp.A02() == 0) {
                return "";
            }
            C23303Ber ber = (C23303Ber) dsp;
            return BE6.A0r(charset, ber.zzfp, ber.A04(), ber.A02());
        }
        return BE6.A0q(C25461CgE.A00, (byte[]) obj);
    }

    public final EE2 CTQ() {
        if (this.A00) {
            return new C27293DbM(this);
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
        if (obj instanceof DSP) {
            DSP dsp = (DSP) obj;
            Charset charset = C25461CgE.A00;
            if (dsp.A02() == 0) {
                A0q = "";
            } else {
                C23303Ber ber = (C23303Ber) dsp;
                A0q = BE6.A0r(charset, ber.zzfp, ber.A04(), ber.A02());
            }
            C23303Ber ber2 = (C23303Ber) dsp;
            int A04 = ber2.A04();
            A012 = C25908CoM.A00.A01(ber2.zzfp, A04, ber2.A02() + A04);
        } else {
            byte[] bArr = (byte[]) obj;
            A0q = BE6.A0q(C25461CgE.A00, bArr);
            A012 = C25908CoM.A00.A01(bArr, 0, bArr.length);
        }
        if (A012 == 0) {
            list.set(i, A0q);
        }
        return A0q;
    }

    public final /* synthetic */ EE7 CTh(int i) {
        if (i >= size()) {
            ArrayList A0z = C17880vN.A0z(i);
            A0z.addAll(this.A00);
            return new C23296Bek(A0z);
        }
        throw BE6.A0j();
    }
}
