package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8l7  reason: invalid class name */
public final class AnonymousClass8l7 extends C167928i0 implements B7L, AnonymousClass1GC {
    public final AnonymousClass1F9 A00;
    public final C56412hQ A01;
    public final B7Q A02;
    public final C22369B4x A03;

    public AnonymousClass8IO A0V(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i != 5) {
            return super.A0V(viewGroup, i);
        }
        C56412hQ r1 = this.A01;
        List list = C42011xT.A0I;
        View A002 = AnonymousClass9PR.A00(viewGroup);
        UserJid userJid = this.A07;
        return r1.A00(A002, new C182919Wf(897460087), this, this, this.A02, this.A03, userJid);
    }

    public void C6U(C27581Wq r3, AnonymousClass1F9 r4) {
        if (C108955ca.A04(r3, 1) == 5) {
            this.A00.getLifecycle().A06(this);
            this.A05.A02();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8l7(X.AnonymousClass1F9 r16, X.AnonymousClass1L9 r17, X.C56412hQ r18, X.AnonymousClass1KB r19, X.AnonymousClass11S r20, com.whatsapp.biz.catalog.manager.CatalogManager r21, X.C20005A2v r22, X.B7Q r23, X.C22369B4x r24, X.AnonymousClass1M9 r25, X.AnonymousClass1PM r26, X.C24921Me r27, X.C18000vb r28, X.C18030ve r29, com.whatsapp.jid.UserJid r30) {
        /*
            r15 = this;
            r4 = r17
            r5 = r19
            r6 = r20
            X.C18070vi.A0p(r5, r6, r4)
            r0 = 5
            r7 = r21
            X.C18070vi.A0d(r7, r0)
            r8 = r22
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            X.C18070vi.A0x(r9, r11, r12, r10, r8)
            r13 = r29
            r2 = r18
            X.C72473Md.A1L(r13, r2)
            r0 = 14
            r1 = r24
            X.C18070vi.A0d(r1, r0)
            r3 = r15
            r14 = r30
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A01 = r2
            r2 = r16
            r15.A00 = r2
            r15.A03 = r1
            r0 = r23
            r15.A02 = r0
            r15.A0Z()
            X.1Fv r0 = r2.getLifecycle()
            r0.A05(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8l7.<init>(X.1F9, X.1L9, X.2hQ, X.1KB, X.11S, com.whatsapp.biz.catalog.manager.CatalogManager, X.A2v, X.B7Q, X.B4x, X.1M9, X.1PM, X.1Me, X.0vb, X.0ve, com.whatsapp.jid.UserJid):void");
    }

    public C185599cq BOv(int i) {
        if (C108955ca.A0p(this.A00) instanceof C168738jb) {
            return new C185599cq((String) null, String.valueOf(i), (String) null);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return A0V(viewGroup, i);
    }
}
