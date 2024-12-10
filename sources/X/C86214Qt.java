package X;

import com.whatsapp.areffects.viewmodel.session.ArEffectSession;
import com.whatsapp.areffects.viewmodel.viewstate.ArEffectsBannerViewState$1$1;
import com.whatsapp.areffects.viewmodel.viewstate.ArEffectsBannerViewState$2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Qt  reason: invalid class name and case insensitive filesystem */
public final class C86214Qt {
    public final AnonymousClass4D9 A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final AnonymousClass1G4 A03 = AnonymousClass3MW.A18(AnonymousClass4IV.A01);
    public final AnonymousClass1G1 A04;

    public C86214Qt(AnonymousClass4D9 r16, C86554Sc r17, Integer num, Collection collection, Map map, C18090vk r21, AnonymousClass20G r22, AnonymousClass1OX r23, AnonymousClass1G1 r24) {
        C86554Sc r10 = r17;
        Collection collection2 = collection;
        Map map2 = map;
        AnonymousClass1OX r6 = r23;
        Integer num2 = num;
        C18070vi.A0w(map2, r10, collection2, num2, r6);
        AnonymousClass4D9 r4 = r16;
        C18070vi.A0d(r4, 8);
        AnonymousClass1G1 r1 = r24;
        C18070vi.A0d(r1, 9);
        this.A00 = r4;
        this.A04 = r1;
        this.A01 = AnonymousClass1DF.A00(num2, new C99064sD(3));
        this.A02 = AnonymousClass1DF.A00(num2, new C99114sI(r21, r6, collection2, this, 0));
        Collection<ArEffectSession> values = map2.values();
        ArrayList<AnonymousClass1G1> A0D = C29351c6.A0D(values);
        for (ArEffectSession arEffectSession : values) {
            A0D.add(arEffectSession.A08);
        }
        for (AnonymousClass1G1 arEffectsBannerViewState$1$1 : A0D) {
            AnonymousClass3MX.A1Q(new ArEffectsBannerViewState$1$1(r10, this, (C30391dr) null, r22, arEffectsBannerViewState$1$1), r6);
        }
        AnonymousClass3MX.A1Q(new ArEffectsBannerViewState$2(this, (C30391dr) null), r6);
    }

    public final void A00(AnonymousClass4DE r8) {
        Object value;
        ArrayList A13;
        AnonymousClass1G4 A17 = AnonymousClass3MW.A17(this.A01);
        do {
            value = A17.getValue();
            int A012 = AnonymousClass4ZO.A00.A01(r8, this.A00);
            A13 = AnonymousClass000.A13();
            for (Object next : (List) value) {
                if (((C86744Sw) next).A00 != A012) {
                    A13.add(next);
                }
            }
        } while (!A17.BFK(value, A13));
    }
}
