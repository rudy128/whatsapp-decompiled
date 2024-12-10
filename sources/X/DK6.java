package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class DK6 implements C28663EDa {
    public int zza = 0;

    public static int A06(EAD ead, Object obj) {
        DK6 dk6 = (DK6) obj;
        C23484Bho bho = (C23484Bho) dk6;
        int i = bho.zzc;
        if (i != -1) {
            return i;
        }
        int zzb = ead.zzb(dk6);
        bho.zzc = zzb;
        return zzb;
    }

    public static void A07(Iterable iterable, List list) {
        Charset charset = C25462CgF.A00;
        if (iterable == null) {
            throw BE6.A0m();
        } else if (iterable instanceof EE3) {
            List CTW = ((EE3) iterable).CTW();
            EE3 ee3 = (EE3) list;
            int size = list.size();
            for (Object next : CTW) {
                if (next == null) {
                    int A02 = AnonymousClass3MX.A02(ee3, size);
                    StringBuilder A0t = BE6.A0t(37);
                    AnonymousClass000.A1E("Element at index ", " is null.", A0t, A02);
                    String obj = A0t.toString();
                    int size2 = ee3.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            ee3.remove(size2);
                        } else {
                            throw AnonymousClass000.A0s(obj);
                        }
                    }
                } else if (next instanceof DSO) {
                    ee3.CT3((DSO) next);
                } else {
                    ee3.add(next);
                }
            }
        } else if (iterable instanceof E2B) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int A022 = AnonymousClass3MX.A02(list, size3);
                    StringBuilder A0t2 = BE6.A0t(37);
                    AnonymousClass000.A1E("Element at index ", " is null.", A0t2, A022);
                    String obj2 = A0t2.toString();
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            list.remove(size4);
                        } else {
                            throw AnonymousClass000.A0s(obj2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        }
    }

    public static void A08(Object obj, Object obj2) {
        C23484Bho.zzd.put(obj, obj2);
    }
}
