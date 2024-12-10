package X;

import com.facebook.wearable.datax.LocalChannel;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class DND implements C22356B4k, Cloneable {
    public void A0A(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr.length;
        C23624Bmt bmt = (C23624Bmt) this;
        C26105CsP A00 = C26105CsP.A00();
        bmt.A0E();
        try {
            C25661Cjr.A02.A00(bmt.A00.getClass()).Bjm(new C25573CiD(A00), bmt.A00, bArr2, 0, length);
        } catch (AnonymousClass1PN e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw BE7.A0M();
        } catch (IOException e2) {
            throw BE6.A0o("Reading from byte array should not throw IOException.", e2);
        }
    }

    public static void A09(Iterable iterable, List list) {
        Charset charset = CIC.A04;
        if (iterable == null) {
            throw BE6.A0m();
        } else if (iterable instanceof EE5) {
            List Bay = ((EE5) iterable).Bay();
            EE5 ee5 = (EE5) list;
            int size = list.size();
            for (Object next : Bay) {
                if (next == null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Element at index ");
                    A10.append(AnonymousClass3MX.A02(ee5, size));
                    String A0y = AnonymousClass000.A0y(" is null.", A10);
                    int size2 = ee5.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            ee5.remove(size2);
                        } else {
                            throw AnonymousClass000.A0s(A0y);
                        }
                    }
                } else if (next instanceof DSQ) {
                    ee5.BAo((DSQ) next);
                } else {
                    ee5.add(next);
                }
            }
        } else if (iterable instanceof C28460E2b) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("Element at index ");
                    A102.append(AnonymousClass3MX.A02(list, size3));
                    String A0y2 = AnonymousClass000.A0y(" is null.", A102);
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            list.remove(size4);
                        } else {
                            throw AnonymousClass000.A0s(A0y2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        }
    }

    public static void A08(LocalChannel localChannel, C23624Bmt bmt, int i) {
        byte[] A0M = bmt.A0C().A0M();
        localChannel.send(new C25527ChP(i, Arrays.copyOf(A0M, A0M.length)));
    }

    public /* bridge */ /* synthetic */ Object clone() {
        throw AnonymousClass04E.createAndThrow();
    }
}
