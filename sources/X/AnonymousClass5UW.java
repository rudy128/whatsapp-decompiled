package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5UW  reason: invalid class name */
public final class AnonymousClass5UW extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ List $botMediaList;
    public final /* synthetic */ C88204Ys this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UW(C88204Ys r2, List list) {
        super(1);
        this.this$0 = r2;
        this.$botMediaList = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list;
        C106645Wq r1;
        List list2 = (List) obj;
        C18070vi.A0d(list2, 0);
        C88204Ys r3 = this.this$0;
        List<C89334cI> list3 = this.$botMediaList;
        AnonymousClass1BI r0 = r3.A01;
        if (r0 != null) {
            list = C18070vi.A0M(r0);
        } else {
            list = C18460wS.A00;
        }
        C134146q7 r4 = r3.A06;
        ArrayList A0D = C29351c6.A0D(list3);
        for (C89334cI r02 : list3) {
            A0D.add(r02.A00);
        }
        r4.A00(r3.A04, r3.A07.BGY(list, list), AnonymousClass00R.A0C, 0, A0D, C17880vN.A12(), 0, 7);
        C77873rd r42 = this.this$0.A00;
        if (r42 != null) {
            C73543Wj r32 = r42.A05;
            List list4 = r32.A04;
            int size = list4.size();
            list4.addAll(list2);
            r32.A01.A02(size, list2.size());
            r42.A06();
        }
        C88204Ys r2 = this.this$0;
        C77873rd r03 = r2.A00;
        if (!(r03 == null || (r1 = r03.A01) == null)) {
            AnonymousClass4aY.A1P(((C92984iF) r1).A01, C72453Mb.A07(r2.A05() ? 1 : 0));
        }
        return C27621Wu.A00;
    }
}
