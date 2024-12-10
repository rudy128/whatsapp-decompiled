package X;

import com.whatsapp.areffects.viewmodel.session.ArEffectSession;
import com.whatsapp.areffects.viewmodel.viewstate.ArEffectsBannerViewState$persistentBannerContent$2$1;
import com.whatsapp.areffects.viewmodel.viewstate.ArEffectsTrayViewState$shouldShowTabEnabledIndicator$2$1;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.4sI  reason: invalid class name and case insensitive filesystem */
public class C99114sI implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C99114sI(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj4;
        this.A03 = obj2;
        this.A04 = obj;
    }

    public final Object invoke() {
        AnonymousClass1OX r6;
        C99474ss r3;
        C99654tF r1;
        Object obj;
        boolean z;
        switch (this.A00) {
            case 0:
                Collection<AnonymousClass4S8> collection = (Collection) this.A01;
                C86214Qt r7 = (C86214Qt) this.A02;
                AnonymousClass1OX r5 = (AnonymousClass1OX) this.A03;
                C18090vk r62 = (C18090vk) this.A04;
                C18070vi.A0o(r7, r5, r62);
                ArrayList A0D = C29351c6.A0D(collection);
                for (AnonymousClass4S8 r0 : collection) {
                    A0D.add(r0.A03);
                }
                C99454sq r4 = new C99454sq(C72463Mc.A1b(A0D, 0), 0);
                return AnonymousClass4Z7.A01((Object) null, r5, AnonymousClass4Z8.A01(new ArEffectsBannerViewState$persistentBannerContent$2$1((C30391dr) null, r62), r7.A04, AnonymousClass3MX.A18(r7.A01), r4), C99654tF.A00());
            case 1:
                r6 = (AnonymousClass1OX) this.A02;
                Object obj2 = this.A03;
                Object obj3 = this.A04;
                z = C72453Mb.A1Z(r6);
                r3 = new C99474ss(obj3, obj2, ((ArEffectSession) this.A01).A08, z ? 1 : 0);
                break;
            case 2:
                AnonymousClass4S8 r02 = (AnonymousClass4S8) this.A02;
                r6 = (AnonymousClass1OX) this.A03;
                z = false;
                C18070vi.A0j(r02, r6);
                r3 = AnonymousClass4Z8.A00(new ArEffectsTrayViewState$shouldShowTabEnabledIndicator$2$1((AnonymousClass4DE) this.A04, (C30391dr) null), ((ArEffectSession) this.A01).A08, r02.A04);
                break;
            default:
                Collection<ArEffectSession> collection2 = (Collection) this.A01;
                r6 = (AnonymousClass1OX) this.A02;
                Object obj4 = this.A03;
                Object obj5 = this.A04;
                boolean A1Z = C72453Mb.A1Z(r6);
                ArrayList A0D2 = C29351c6.A0D(collection2);
                for (ArEffectSession arEffectSession : collection2) {
                    A0D2.add(arEffectSession.A08);
                }
                r3 = new C99474ss(obj5, C72463Mc.A1b(A0D2, A1Z ? 1 : 0), obj4, 1);
                r1 = C99654tF.A00();
                obj = C92724hn.A00;
                break;
        }
        r1 = C99654tF.A00();
        obj = Boolean.valueOf(z);
        return AnonymousClass4Z7.A01(obj, r6, r3, r1);
    }
}
