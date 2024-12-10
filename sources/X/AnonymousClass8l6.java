package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8l6  reason: invalid class name */
public final class AnonymousClass8l6 extends C167928i0 implements B7L {
    public final C56412hQ A00;
    public final C182919Wf A01;
    public final B7Q A02;
    public final C22369B4x A03;
    public final String A04;
    public final String A05;

    public AnonymousClass8IO A0V(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i != 5) {
            return super.A0V(viewGroup, i);
        }
        C56412hQ r1 = this.A00;
        List list = C42011xT.A0I;
        View A002 = AnonymousClass9PR.A00(viewGroup);
        UserJid userJid = this.A07;
        return r1.A00(A002, this.A01, this, this, this.A02, this.A03, userJid);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8l6(X.AnonymousClass1L9 r16, X.C56412hQ r17, X.AnonymousClass1KB r18, X.AnonymousClass11S r19, com.whatsapp.biz.catalog.manager.CatalogManager r20, X.C182919Wf r21, X.C20005A2v r22, X.B7Q r23, X.C22369B4x r24, X.AnonymousClass1M9 r25, X.AnonymousClass1PM r26, X.C24921Me r27, X.C18000vb r28, X.C18030ve r29, com.whatsapp.jid.UserJid r30, java.lang.String r31, java.lang.String r32) {
        /*
            r15 = this;
            r6 = r19
            r5 = r18
            r4 = r16
            r13 = r29
            r8 = r22
            X.C18070vi.A0w(r13, r5, r6, r4, r8)
            r12 = r28
            r11 = r27
            r10 = r26
            r7 = r20
            r9 = r25
            X.C18070vi.A0x(r7, r9, r12, r11, r10)
            r0 = 11
            r2 = r17
            X.C18070vi.A0d(r2, r0)
            r0 = 17
            r1 = r24
            X.C18070vi.A0d(r1, r0)
            r3 = r15
            r14 = r30
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A00 = r2
            r0 = r31
            r15.A04 = r0
            r0 = r32
            r15.A05 = r0
            r0 = r21
            r15.A01 = r0
            r0 = r23
            r15.A02 = r0
            r15.A03 = r1
            r15.A0Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8l6.<init>(X.1L9, X.2hQ, X.1KB, X.11S, com.whatsapp.biz.catalog.manager.CatalogManager, X.9Wf, X.A2v, X.B7Q, X.B4x, X.1M9, X.1PM, X.1Me, X.0vb, X.0ve, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String):void");
    }

    public C185599cq BOv(int i) {
        List list = this.A00;
        String str = null;
        if (list.isEmpty()) {
            return null;
        }
        if (C108955ca.A0p(list) instanceof C168728ja) {
            i--;
        }
        String valueOf = String.valueOf(i);
        String str2 = this.A05;
        if (str2 != null) {
            str = this.A04;
        }
        return new C185599cq(str2, valueOf, str);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return A0V(viewGroup, i);
    }
}
