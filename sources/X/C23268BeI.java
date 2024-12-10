package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.BeI  reason: case insensitive filesystem */
public final class C23268BeI extends C27290DbJ implements EE1, RandomAccess {
    @Deprecated
    public static final EE1 A01;
    public static final C23268BeI A02;
    public final List A00;

    static {
        C23268BeI beI = new C23268BeI(false);
        A02 = beI;
        A01 = beI;
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof DSN) {
            DSN dsn = (DSN) obj;
            Charset charset = CI7.A03;
            if (dsn.A01() == 0) {
                return "";
            }
            C23271BeL beL = (C23271BeL) dsn;
            return BE6.A0r(charset, beL.zza, 0, beL.A01());
        }
        return BE6.A0q(CI7.A03, (byte[]) obj);
    }

    /* renamed from: A02 */
    public final String get(int i) {
        String A0q;
        boolean A002;
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof DSN) {
            DSN dsn = (DSN) obj;
            Charset charset = CI7.A03;
            if (dsn.A01() == 0) {
                A0q = "";
            } else {
                C23271BeL beL = (C23271BeL) dsn;
                A0q = BE6.A0r(charset, beL.zza, 0, beL.A01());
            }
            C23271BeL beL2 = (C23271BeL) dsn;
            A002 = CF4.A00.A00(beL2.zza, 0, beL2.A01());
        } else {
            byte[] bArr = (byte[]) obj;
            A0q = BE6.A0q(CI7.A03, bArr);
            A002 = CF4.A00.A00(bArr, 0, bArr.length);
        }
        if (A002) {
            list.set(i, A0q);
        }
        return A0q;
    }

    public final EE1 CTZ() {
        if (this.A00) {
            return new C27291DbK(this);
        }
        return this;
    }

    public final List CTe() {
        return Collections.unmodifiableList(this.A00);
    }

    public final int size() {
        return this.A00.size();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23268BeI(int i) {
        super(true);
        ArrayList A0z = C17880vN.A0z(i);
        this.A00 = A0z;
    }

    public final /* bridge */ /* synthetic */ EE6 CTV(int i) {
        if (i >= size()) {
            ArrayList A0z = C17880vN.A0z(i);
            A0z.addAll(this.A00);
            return new C23268BeI(A0z);
        }
        throw BE6.A0j();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof EE1) {
            collection = ((EE1) collection).CTe();
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

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        Object remove = this.A00.remove(i);
        this.modCount++;
        return A00(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        A01();
        return A00(this.A00.set(i, obj));
    }

    public C23268BeI(boolean z) {
        super(false);
        this.A00 = Collections.emptyList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public C23268BeI() {
        this(10);
    }

    public C23268BeI(ArrayList arrayList) {
        super(true);
        this.A00 = arrayList;
    }
}
