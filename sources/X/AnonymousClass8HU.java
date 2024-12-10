package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.polls.creator.PollCreatorViewModel;
import java.util.List;

/* renamed from: X.8HU  reason: invalid class name */
public final class AnonymousClass8HU extends C41251w3 {
    public int A00 = -1;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass9V5 A03;
    public final AnonymousClass9V6 A04;
    public final PollCreatorViewModel A05;
    public final List A06 = AnonymousClass000.A13();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8HU(C40411uf r2, AnonymousClass9V5 r3, AnonymousClass9V6 r4, PollCreatorViewModel pollCreatorViewModel) {
        super(r2);
        C18070vi.A0d(pollCreatorViewModel, 4);
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = pollCreatorViewModel;
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r2) {
        C18070vi.A0d(r2, 0);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131626482, viewGroup, false);
            AnonymousClass9V6 r1 = this.A04;
            C18070vi.A0b(inflate);
            PollCreatorViewModel pollCreatorViewModel = this.A05;
            List list = C42011xT.A0I;
            AnonymousClass10E r0 = r1.A00.A01;
            C18030ve A8r = AnonymousClass10E.A8r(r0);
            AnonymousClass1KW A0f = AnonymousClass3Ma.A0f(r0);
            return new C1769196g(inflate, AnonymousClass3Ma.A0a(r0), (AnonymousClass1L2) r0.A00.A40.get(), A0f, A8r, pollCreatorViewModel, AnonymousClass3Ma.A0r(r0));
        } else if (i == 1) {
            View inflate2 = AnonymousClass3MZ.A0D(viewGroup).inflate(2131626481, viewGroup, false);
            List list2 = C42011xT.A0I;
            C72453Mb.A1S(inflate2);
            return new C42011xT(inflate2);
        } else if (i == 2) {
            View inflate3 = AnonymousClass3MZ.A0D(viewGroup).inflate(2131626480, viewGroup, false);
            AnonymousClass9V5 r12 = this.A03;
            C18070vi.A0b(inflate3);
            PollCreatorViewModel pollCreatorViewModel2 = this.A05;
            List list3 = C42011xT.A0I;
            AnonymousClass10E r02 = r12.A00.A01;
            C18030ve A8r2 = AnonymousClass10E.A8r(r02);
            AnonymousClass1KW A0f2 = AnonymousClass3Ma.A0f(r02);
            AnonymousClass11C A0a = AnonymousClass3Ma.A0a(r02);
            C18000vb A6Q = AnonymousClass10E.A6Q(r02);
            C18010vc A0r = AnonymousClass3Ma.A0r(r02);
            return new C1769296h(inflate3, C19890zB.A00, A0a, A6Q, (AnonymousClass1L2) r02.A00.A40.get(), A0f2, A8r2, pollCreatorViewModel2, A0r);
        } else {
            throw AnonymousClass8BX.A0W("Unrecognized view type = ", AnonymousClass000.A10(), i);
        }
    }

    public int getItemViewType(int i) {
        if (i != 0) {
            return i != 1 ? 2 : 1;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if ((X.AnonymousClass001.A0n(r3, X.AnonymousClass3MX.A02(r3, 1)) + 2) != r10) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r9, int r10) {
        /*
            r8 = this;
            X.8IL r9 = (X.AnonymousClass8IL) r9
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            boolean r0 = r9 instanceof X.C1769296h
            if (r0 == 0) goto L_0x00d8
            java.util.List r3 = r8.A06
            java.util.Iterator r1 = r3.iterator()
        L_0x0010:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d5
            int r0 = X.C72453Mb.A0H(r1)
            int r0 = r0 + 2
            if (r0 != r10) goto L_0x0010
            r7 = 1
        L_0x001f:
            r2 = 0
            r1 = 1
            if (r7 == 0) goto L_0x003a
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x003a
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x003a
            int r0 = X.AnonymousClass3MX.A02(r3, r1)
            int r0 = X.AnonymousClass001.A0n(r3, r0)
            int r0 = r0 + 2
            r6 = 1
            if (r0 == r10) goto L_0x003b
        L_0x003a:
            r6 = 0
        L_0x003b:
            java.lang.Object r1 = r8.A0U(r10)
            boolean r0 = r1 instanceof X.C1769596k
            if (r0 == 0) goto L_0x00c1
            X.96k r1 = (X.C1769596k) r1
            if (r1 == 0) goto L_0x00c1
            X.96h r9 = (X.C1769296h) r9
            int r0 = r8.A00
            if (r0 != r10) goto L_0x004e
            r2 = 1
        L_0x004e:
            int r0 = r1.A00
            r9.A00 = r0
            java.lang.String r5 = r1.A00
            com.whatsapp.WaEditText r4 = r9.A02
            android.text.Editable r0 = r4.getText()
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = X.AnonymousClass3MZ.A17(r4)
            boolean r0 = android.text.TextUtils.equals(r0, r5)
            if (r0 != 0) goto L_0x0069
            r4.setText(r5)
        L_0x0069:
            if (r2 == 0) goto L_0x00c6
            android.view.View r0 = r9.A0H
            android.content.Context r3 = r0.getContext()
            X.11C r2 = r9.A03
            android.content.Context r1 = r0.getContext()
            r0 = 2131894687(0x7f12219f, float:1.9424186E38)
            java.lang.String r0 = r1.getString(r0)
            X.AnonymousClass1Y5.A00(r3, r2, r0)
            X.1bI r1 = r9.A06
            r0 = 0
            r1.A04(r0)
        L_0x0087:
            if (r6 == 0) goto L_0x00c2
            r4.requestFocus()
            int r0 = r5.length()
            r4.setSelection(r0)
        L_0x0093:
            X.1bI r1 = r9.A05
            r0 = 8
            if (r7 == 0) goto L_0x009a
            r0 = 0
        L_0x009a:
            r1.A04(r0)
            android.text.Editable r0 = r4.getText()
            if (r0 == 0) goto L_0x00b5
            android.graphics.drawable.Drawable r2 = r9.A01
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            r0 = 255(0xff, float:3.57E-43)
            if (r1 != 0) goto L_0x00b2
            r0 = 0
        L_0x00b2:
            r2.setAlpha(r0)
        L_0x00b5:
            android.view.View r1 = r9.A0H
            r0 = 2131433928(0x7f0b19c8, float:1.8489656E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            X.C18070vi.A0X(r0)
        L_0x00c1:
            return
        L_0x00c2:
            r4.clearFocus()
            goto L_0x0093
        L_0x00c6:
            X.1bI r1 = r9.A06
            r0 = 8
            r1.A04(r0)
            int r0 = r5.length()
            r4.setSelection(r0)
            goto L_0x0087
        L_0x00d5:
            r7 = 0
            goto L_0x001f
        L_0x00d8:
            boolean r0 = r9 instanceof X.C1769196g
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r2 = r8.A0U(r10)
            boolean r0 = r2 instanceof X.C1769496j
            if (r0 == 0) goto L_0x00c1
            X.96j r2 = (X.C1769496j) r2
            if (r2 == 0) goto L_0x00c1
            X.96g r9 = (X.C1769196g) r9
            com.whatsapp.WaEditText r1 = r9.A00
            java.lang.String r0 = r2.A00
            r1.setText(r0)
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = r2.A00
            int r0 = r0.length()
            r1.setSelection(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8HU.Bmc(X.1xT, int):void");
    }
}
