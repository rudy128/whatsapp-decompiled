package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.7wu  reason: invalid class name and case insensitive filesystem */
public final class C157427wu extends AnonymousClass11G implements C18090vk {
    public static final C157427wu A00 = new C157427wu();

    public C157427wu() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Set[] setArr = new Set[8];
        setArr[0] = C200410p.A0S(new C122636Rd[]{C122636Rd.A0H, C122636Rd.A04, C122636Rd.A0G, C122636Rd.A0I});
        setArr[1] = C200410p.A0S(new C122636Rd[]{C122636Rd.A0J, C122636Rd.A0K});
        setArr[2] = C18070vi.A0P(C122636Rd.A02);
        setArr[3] = C18070vi.A0P(C122636Rd.A0C);
        setArr[4] = C18070vi.A0P(C122636Rd.A07);
        setArr[5] = C18070vi.A0P(C122636Rd.A06);
        setArr[6] = C200410p.A0S(new C122636Rd[]{C122636Rd.A0D, C122636Rd.A0B});
        List<Set> A0O = C18070vi.A0O(C18070vi.A0P(C122636Rd.A0L), setArr, 7);
        ArrayList A13 = AnonymousClass000.A13();
        for (Set<Object> set : A0O) {
            ArrayList A0D = C29351c6.A0D(set);
            for (Object A02 : set) {
                AnonymousClass1D6.A02(A02, set, A0D);
            }
            C29401cD.A0J(A0D, A13);
        }
        return AnonymousClass1D7.A0D(A13);
    }
}
