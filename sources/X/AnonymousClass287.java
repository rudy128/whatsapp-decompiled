package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.areffects.util.ArEffectsGatingUtil;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;

/* renamed from: X.287  reason: invalid class name */
public abstract class AnonymousClass287 extends C27631Wv implements C24051Ir {
    public C23381Fv A00;
    public AnonymousClass1GB A01;
    public Bundle A02;

    public AnonymousClass287(Bundle bundle, AnonymousClass1FE r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3.BYX();
        this.A00 = r3.getLifecycle();
        this.A02 = bundle;
    }

    public AnonymousClass1J2 BG9(Class cls) {
        C18070vi.A0d(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw AnonymousClass000.A0k("Local and anonymous classes can not be ViewModels");
        } else if (this.A00 != null) {
            return A00(canonicalName);
        } else {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    private final AnonymousClass1J2 A00(String str) {
        AnonymousClass1GB r4 = this.A01;
        C18070vi.A0b(r4);
        C23381Fv r3 = this.A00;
        C18070vi.A0b(r3);
        Bundle bundle = this.A02;
        C18070vi.A0h(r4, r3);
        C64992vf r2 = new C64992vf(C37371pQ.A00(r4.A00(str), bundle), str);
        r2.A00(r3, r4);
        C60272ng.A01(r3, r4);
        AnonymousClass1J2 A012 = A01(r2.A01);
        A012.A0Q(r2, "androidx.lifecycle.savedstate.vm.tag");
        return A012;
    }

    public AnonymousClass1J2 A01(C37361pP r74) {
        C37361pP r29 = r74;
        if (this instanceof AnonymousClass27t) {
            AnonymousClass27t r2 = (AnonymousClass27t) this;
            C27241Vh r1 = r2.A00;
            C37451pZ r33 = r2.A01;
            AnonymousClass1K2 r3 = r1.A00;
            AnonymousClass10E r0 = r3.A01;
            AnonymousClass118 r27 = (AnonymousClass118) r0.ABY.get();
            AnonymousClass11P A6O = AnonymousClass10E.A6O(r0);
            C18030ve A8r = AnonymousClass10E.A8r(r0);
            AnonymousClass1KB A12 = AnonymousClass10E.A12(r0);
            AnonymousClass190 r26 = (AnonymousClass190) r0.A31.get();
            AnonymousClass10I AL1 = AnonymousClass10E.AL1(r0);
            C32011gU r25 = (C32011gU) r0.A5k.get();
            AnonymousClass18K r24 = (AnonymousClass18K) r0.A9B.get();
            AnonymousClass10G r22 = r0.A00;
            C41461wR r23 = (C41461wR) r22.A2r.get();
            C18000vb A6Q = AnonymousClass10E.A6Q(r0);
            AnonymousClass00H A002 = C000200d.A00(r0.A25);
            AnonymousClass1QB r222 = (AnonymousClass1QB) r0.A4T.get();
            C32491hH A8L = AnonymousClass10E.A8L(r0);
            AnonymousClass00W.A02(A8L);
            C24681Lg r21 = (C24681Lg) r0.A6Y.get();
            C19890zB r30 = C19890zB.A00;
            C36331ni AKo = AnonymousClass10E.AKo(r0);
            C62112qo r20 = (C62112qo) r22.A4X.get();
            AnonymousClass1K1 r12 = r3.A00;
            C38581rX r19 = (C38581rX) r12.A4n.get();
            AnonymousClass1XN r18 = (AnonymousClass1XN) r22.A0d.get();
            C42221xp r17 = (C42221xp) r0.AA1.get();
            AnonymousClass1NP r16 = (AnonymousClass1NP) r0.A0j.get();
            AnonymousClass00H A003 = C000200d.A00(r0.A35);
            C138036wQ A1n = AnonymousClass1K1.A1n(r12);
            AnonymousClass00H A004 = C000200d.A00(r22.A4J);
            return new C111295jU(r29, r30, r30, r30, r26, (AnonymousClass6ZJ) r12.A3q.get(), (C51072Ww) r12.A18.get(), (C61842qN) r12.A1I.get(), (C51092Wy) r12.A1T.get(), (C51102Wz) r12.A1d.get(), (AnonymousClass2X2) r12.A1k.get(), (AnonymousClass2X3) r12.A1s.get(), (C51252Xo) r12.A3h.get(), (AnonymousClass2Y5) r12.A3i.get(), (AnonymousClass2Y8) r12.A3j.get(), A12, r16, r33, (C25161Nd) r0.A2v.get(), A6O, r27, A6Q, r222, r21, (C24751Ln) r0.ABe.get(), r17, (AnonymousClass6nA) r12.A4k.get(), A8L, A8r, r24, r25, r19, r18, r23, (C139976zk) r22.A4O.get(), (C139376yj) r12.A0a.get(), r20, A1n, (C30361do) r0.A74.get(), AKo, AL1, A002, A003, A004);
        } else if (this instanceof AnonymousClass27u) {
            AnonymousClass27u r28 = (AnonymousClass27u) this;
            AnonymousClass2XS r13 = r28.A01;
            C108645c3 r66 = r28.A05;
            AnonymousClass1BI r55 = r28.A04;
            AnonymousClass1E7 r51 = r28.A03;
            Intent intent = r28.A00;
            MessageSelectionViewModel messageSelectionViewModel = r28.A02;
            AnonymousClass1K2 r14 = r13.A00;
            AnonymousClass1K1 r69 = r14.A00;
            AnonymousClass10E r15 = r14.A01;
            C18030ve A8r2 = AnonymousClass10E.A8r(r15);
            AnonymousClass1NJ r282 = (AnonymousClass1NJ) r15.AA3.get();
            AnonymousClass122 r272 = (AnonymousClass122) r15.A2y.get();
            AnonymousClass1W6 r262 = (AnonymousClass1W6) r15.A3w.get();
            AnonymousClass10I AL12 = AnonymousClass10E.AL1(r15);
            AnonymousClass1CJ r252 = (AnonymousClass1CJ) r15.A2H.get();
            AnonymousClass1NK r242 = (AnonymousClass1NK) r15.A9b.get();
            C18000vb A6Q2 = AnonymousClass10E.A6Q(r15);
            AnonymousClass1QT r232 = (AnonymousClass1QT) r15.A29.get();
            AnonymousClass11S A17 = AnonymousClass10E.A17(r15);
            AW1 aw1 = (AW1) r15.A7B.get();
            AnonymousClass1WF r212 = (AnonymousClass1WF) r15.A6J.get();
            C51862Zx r202 = (C51862Zx) r15.A2w.get();
            AnonymousClass1PS r192 = (AnonymousClass1PS) r15.A3T.get();
            AnonymousClass10G r02 = r15.A00;
            C86034Px r182 = (C86034Px) r02.A58.get();
            C51852Zw r172 = (C51852Zw) r15.A2r.get();
            AnonymousClass11P A6O2 = AnonymousClass10E.A6O(r15);
            Object obj = r15.A12.get();
            C199610h.A04(obj);
            C23631Ha r210 = new C23631Ha(obj);
            AnonymousClass00H A005 = C000200d.A00(r15.A28);
            Intent intent2 = intent;
            AnonymousClass3VQ r273 = new AnonymousClass3VQ(intent2, r29, r210, A17, (A5M) r15.A0s.get(), (C35751mk) r15.A2F.get(), r172, r202, messageSelectionViewModel, (C108715cB) r02.A17.get(), (AnonymousClass4RF) r02.A3A.get(), A6O2, A6Q2, r232, r252, r272, (AnonymousClass1Q9) r15.A3j.get(), (AnonymousClass1WP) r15.A3k.get(), (C24681Lg) r15.A6Y.get(), (C26021Qn) r15.A7o.get(), (C54262dr) r15.A7p.get(), r242, r282, r51, r212, r192, A8r2, r55, (C42431yA) r02.A39.get(), (C26061Qr) r15.A6l.get(), aw1, (AnonymousClass1RU) r15.A6L.get(), (C26241Rj) r15.A8b.get(), (AnonymousClass1PP) r15.A3y.get(), AnonymousClass10E.AIT(r15), r262, (C26521Sl) r15.A69.get(), AL12, r66, r182, A005);
            r273.A0H = C000200d.A00(r69.AAQ.A7r);
            return r273;
        } else {
            C452227s r211 = (C452227s) this;
            AnonymousClass2Y7 r03 = r211.A00;
            AnonymousClass7DY r4 = r211.A01;
            AnonymousClass1K2 r04 = r03.A00;
            AnonymousClass10E r5 = r04.A01;
            C18030ve A8r3 = AnonymousClass10E.A8r(r5);
            AnonymousClass10G r110 = r5.A00;
            ArEffectsGatingUtil A1S = AnonymousClass10G.A1S(r110);
            C183829Zt A1Q = AnonymousClass10G.A1Q(r110);
            AnonymousClass00H A006 = C000200d.A00(r110.A0C);
            AnonymousClass00H A007 = C000200d.A00(r5.ABc);
            C23771Ho r40 = C23761Hn.A02;
            AnonymousClass00W.A02(r40);
            return new C75603ho(r29, A1Q, A1S, (C106565Wi) r04.A00.A3w.get(), r4, (AnonymousClass118) r5.ABY.get(), A8r3, A006, A007, C000200d.A00(r5.A9u), (C18600wl) r5.A9F.get(), r40);
        }
    }

    public AnonymousClass1J2 BGl(C24091Iv r3, Class cls) {
        C18070vi.A0h(cls, r3);
        String str = (String) r3.A00(C24121Iy.A01);
        if (str == null) {
            throw AnonymousClass000.A0n("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (this.A01 != null) {
            return A00(str);
        } else {
            return A01(AnonymousClass1GG.A00(r3));
        }
    }
}
