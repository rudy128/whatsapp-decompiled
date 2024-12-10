package X;

import com.whatsapp.bot.home.AiHomeSearchViewModel;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7Si  reason: invalid class name and case insensitive filesystem */
public final class C147237Si implements AnonymousClass1G2 {
    public final /* synthetic */ AiHomeSearchViewModel A00;
    public final /* synthetic */ String A01;

    public C147237Si(AiHomeSearchViewModel aiHomeSearchViewModel, String str) {
        this.A01 = str;
        this.A00 = aiHomeSearchViewModel;
    }

    public /* bridge */ /* synthetic */ Object BJt(Object obj, C30391dr r6) {
        List list;
        Object r2;
        C1594184l r5 = (C1594184l) obj;
        if (r5 instanceof AnonymousClass7D1) {
            AnonymousClass7D1 r52 = (AnonymousClass7D1) r5;
            r2 = new AnonymousClass7D1(AnonymousClass00R.A01, C123776Vu.A00(r52.A00), r52.A02);
        } else if (r5 instanceof C143337Cz) {
            boolean z = ((C143337Cz) r5).A01;
            List nCopies = Collections.nCopies(5, new C143327Cy("██████", "███████████████████"));
            C18070vi.A0X(nCopies);
            r2 = new C143337Cz(z, nCopies);
        } else if (r5 instanceof AnonymousClass7D0) {
            Object obj2 = ((AnonymousClass7D0) r5).A00.A00;
            if (!((List) obj2).isEmpty() || this.A01.length() <= 0) {
                Iterable<AiHomeBot> iterable = (Iterable) obj2;
                ArrayList A0D = C29351c6.A0D(iterable);
                for (AiHomeBot A002 : iterable) {
                    A0D.add(C123766Vt.A00(A002, (String) null, (String) null));
                }
                list = A0D;
            } else {
                list = C18070vi.A0M(C143297Cv.A00);
            }
            r2 = new AnonymousClass7D0(new C134506qh(list, (String) null), false);
        } else {
            throw AnonymousClass3MW.A14();
        }
        this.A00.A02.A0F(r2);
        return C27621Wu.A00;
    }
}
