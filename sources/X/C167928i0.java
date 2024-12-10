package X;

import android.view.ViewGroup;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8i0  reason: invalid class name and case insensitive filesystem */
public abstract class C167928i0 extends C168758jd {
    public final int A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass1PM A03;
    public final C24921Me A04;
    public final C18000vb A05;

    public C167928i0(AnonymousClass1L9 r10, AnonymousClass1KB r11, AnonymousClass11S r12, CatalogManager catalogManager, C20005A2v a2v, AnonymousClass1M9 r15, AnonymousClass1PM r16, C24921Me r17, C18000vb r18, C18030ve r19, UserJid userJid) {
        super(r10, r12, catalogManager, a2v, r19, userJid);
        int i;
        this.A01 = r11;
        this.A02 = r15;
        this.A04 = r17;
        this.A05 = r18;
        this.A03 = r16;
        List list = this.A00;
        if (list.size() <= 0 || !(list.get(AnonymousClass3MX.A01(list)) instanceof C168688jW)) {
            i = -1;
        } else {
            i = AnonymousClass3MX.A01(list);
        }
        this.A00 = i;
    }

    public AnonymousClass8IO A0V(ViewGroup viewGroup, int i) {
        if (i != 2) {
            return super.A0V(viewGroup, i);
        }
        List list = C42011xT.A0I;
        UserJid userJid = this.A07;
        AnonymousClass11S r3 = this.A03;
        AnonymousClass1L9 r2 = this.A02;
        AnonymousClass1M9 r4 = this.A02;
        C24921Me r6 = this.A04;
        AnonymousClass1PM r5 = this.A03;
        C18070vi.A0d(r4, 4);
        C72473Md.A1J(r6, r5);
        return new C168828jk(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624376), r2, r3, r4, r5, r6, userJid);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8jW, X.9Wn, java.lang.Object] */
    public final void A0Z() {
        List list = this.A00;
        ? r1 = new C182999Wn(2);
        r1.A00 = 5;
        list.add(r1);
        A0H(AnonymousClass3MX.A01(list));
    }

    public final void A0a(int i) {
        int i2;
        int i3 = this.A00;
        if (i3 != -1) {
            C168688jW A022 = C168758jd.A02(this, i3);
            if (i == -1) {
                i2 = 4;
            } else {
                C17900vP.A0k("biz-collection-product-list-adapter/error: ", AnonymousClass000.A10(), i);
                i2 = 2;
            }
            A022.A00 = i2;
            A0G(i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = r7.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0b(X.C195129sq r7, java.util.List r8) {
        /*
            r6 = this;
            java.util.List r5 = r6.A00
            r5.clear()
            if (r7 == 0) goto L_0x0011
            X.9O2 r3 = r7.A00
            int r1 = r3.A00
            r0 = 1
            if (r1 == r0) goto L_0x0038
            r0 = 2
            if (r1 == r0) goto L_0x0038
        L_0x0011:
            if (r8 == 0) goto L_0x0045
            java.util.Iterator r4 = r8.iterator()
        L_0x0017:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0045
            X.AEv r3 = X.AnonymousClass8BS.A0B(r4)
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0017
            long r1 = r6.A0U(r3)
            X.8jb r0 = new X.8jb
            r0.<init>(r3, r1)
            r5.add(r0)
            goto L_0x0017
        L_0x0038:
            java.lang.String r2 = r7.A03
            java.lang.String r1 = r7.A02
            X.8ja r0 = new X.8ja
            r0.<init>(r3, r2, r1)
            r5.add(r0)
            goto L_0x0011
        L_0x0045:
            r6.A0Z()
            r6.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167928i0.A0b(X.9sq, java.util.List):void");
    }

    public final void A0c(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            A0W();
        } else {
            A0X();
        }
        int i = this.A00;
        if (i != -1) {
            C168758jd.A02(this, i).A00 = 5;
        }
    }
}
