package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.8HW  reason: invalid class name */
public class AnonymousClass8HW extends C41251w3 {
    public C19880zA A00;
    public AnonymousClass2Y3 A01;
    public AnonymousClass2Y4 A02;

    public AnonymousClass8HW(C19880zA r3, AnonymousClass2Y3 r4, AnonymousClass2Y4 r5) {
        super(new C40471ul(new AnonymousClass8HK(3)).A00());
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
    }

    public static AnonymousClass8Dq A00(View view) {
        List list = C42011xT.A0I;
        Context context = view.getContext();
        C18070vi.A0d(context, 0);
        AnonymousClass8Dq r3 = new AnonymousClass8Dq(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168345);
        r3.setPadding(dimensionPixelSize, context.getResources().getDimensionPixelSize(2131166485), dimensionPixelSize, dimensionPixelSize);
        AnonymousClass1HF.A0W(r3, C28891bE.A00(context));
        return r3;
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r1) {
        ((AnonymousClass8IT) r1).A0B();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.8xj, X.1xT] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.8xj, X.1xT] */
    /* renamed from: A0X */
    public C175028xj BqY(ViewGroup viewGroup, int i) {
        C19880zA r1 = this.A00;
        if (r1.A07()) {
            r1.A03();
            throw AnonymousClass000.A0s("onCreateViewHolder");
        } else if (i == 55) {
            List list = C42011xT.A0I;
            return new C42011xT(AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131624633, false));
        } else if (i == 58) {
            return new C174638x6(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625860), viewGroup);
        } else {
            if (i == 65) {
                List list2 = C42011xT.A0I;
                return new C42011xT(AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131626844, false));
            } else if (i == 70) {
                AnonymousClass2Y4 r3 = this.A02;
                List list3 = C42011xT.A0I;
                View A0B = AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131626757, false);
                AnonymousClass10E r32 = r3.A00.A01;
                return new C175018xi(A0B, AnonymousClass10E.A6Q(r32), AnonymousClass10E.A8r(r32), (C183269Xp) r32.A00.A2d.get());
            } else if (i == 72) {
                AnonymousClass2Y3 r12 = this.A01;
                List list4 = C42011xT.A0I;
                return new C174978xe(viewGroup, AnonymousClass1K1.A1J(r12.A00.A00), 1);
            } else {
                throw AnonymousClass8BX.A0W("DirectoryListAdapter/onCreateViewHolder type not handled: ", AnonymousClass000.A10(), i);
            }
        }
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r3, int i) {
        AnonymousClass8IT r32 = (AnonymousClass8IT) r3;
        r32.A0B();
        Object A0U = A0U(i);
        C18070vi.A0d(A0U, 0);
        r32.A0C(A0U);
    }

    public int getItemViewType(int i) {
        C19880zA r1 = this.A00;
        if (!r1.A07()) {
            return ((C174358we) A0U(i)).A00;
        }
        A0U(i);
        r1.A03();
        throw AnonymousClass000.A0s("getItemViewType");
    }
}
