package X;

import com.whatsapp.data.repository.MetaAISearchRepository;
import com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$initSearch$1;

/* renamed from: X.6qB  reason: invalid class name and case insensitive filesystem */
public final class C134186qB {
    public Runnable A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass1DS A05;
    public final AnonymousClass1DS A06;
    public final AnonymousClass1DS A07;
    public final C22801Dg A08 = C108945cZ.A0R();
    public final AnonymousClass1DT A09;
    public final C22851Dl A0A;
    public final C22851Dl A0B;
    public final C22851Dl A0C;
    public final C131326ku A0D;
    public final AnonymousClass11E A0E;
    public final MetaAISearchRepository A0F;
    public final AnonymousClass10I A0G;
    public final Object A0H = C17880vN.A0p();
    public final C18600wl A0I;
    public final AnonymousClass1OX A0J;
    public final C18030ve A0K;

    public final void A00() {
        synchronized (this.A0H) {
            Runnable runnable = this.A00;
            if (runnable != null) {
                this.A0G.CEz(runnable);
            }
            this.A00 = null;
        }
    }

    public final void A01(String str) {
        if (str == null) {
            return;
        }
        if (str.length() == 0) {
            this.A08.A0E(C18460wS.A00);
            return;
        }
        C136896ua A002 = this.A0D.A00(6);
        A002.A02();
        AnonymousClass3MX.A1Q(new AISearchTypeAheadSuggestionsProvider$initSearch$1(this, A002, str, (C30391dr) null), this.A0J);
    }

    public C134186qB(AnonymousClass1DS r5, AnonymousClass1DS r6, AnonymousClass1DS r7, AnonymousClass1DT r8, C131326ku r9, AnonymousClass11E r10, MetaAISearchRepository metaAISearchRepository, C18030ve r12, AnonymousClass10I r13, C18600wl r14, AnonymousClass1OX r15) {
        C18070vi.A0w(r12, r13, metaAISearchRepository, r10, r9);
        C18070vi.A0l(r14, r15);
        this.A0K = r12;
        this.A0G = r13;
        this.A0F = metaAISearchRepository;
        this.A0E = r10;
        this.A0D = r9;
        this.A0I = r14;
        this.A0J = r15;
        this.A07 = r5;
        this.A05 = r6;
        this.A09 = r8;
        this.A06 = r7;
        C18040vf r1 = C18040vf.A02;
        this.A04 = C18020vd.A00(r1, r12, 8078);
        this.A03 = C18020vd.A00(r1, r12, 8076);
        AnonymousClass7AQ r3 = new AnonymousClass7AQ(this, 38);
        this.A0B = r3;
        AnonymousClass7AQ r2 = new AnonymousClass7AQ(this, 39);
        this.A0C = r2;
        AnonymousClass7AQ r0 = new AnonymousClass7AQ(this, 40);
        this.A0A = r0;
        r5.A0C(r3);
        r8.A0C(r2);
        r6.A0C(r0);
    }
}
