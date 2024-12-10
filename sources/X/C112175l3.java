package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.biz.catalog.view.AvailabilityStateImageView;
import com.whatsapp.biz.catalog.view.AvailabilityStateTextView;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5l3  reason: invalid class name and case insensitive filesystem */
public final class C112175l3 extends C38391rD {
    public int A00;
    public C20245ADd A01;
    public AnonymousClass86T A02 = new AnonymousClass7CY(0);
    public AnonymousClass77B A03 = C123716Vo.A00();
    public boolean A04;
    public final C124976aI A05;
    public final UserJid A06;

    public C112175l3(C124976aI r3, UserJid userJid) {
        C18070vi.A0d(r3, 2);
        this.A06 = userJid;
        this.A05 = r3;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        int i2;
        C18070vi.A0d(viewGroup, 0);
        if (i != 1) {
            if (i == 2) {
                i2 = 2131627316;
            } else if (i != 3) {
                C17900vP.A0k("Unsupported ViewType=", AnonymousClass000.A10(), i);
            } else {
                i2 = 2131627315;
            }
            View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(i2, viewGroup, false);
            C124976aI r1 = this.A05;
            C18070vi.A0b(inflate);
            C147977gh A1K = C108945cZ.A1K(this, 4);
            UserJid userJid = this.A06;
            List list = C42011xT.A0I;
            return new C161998Io(inflate, (C20005A2v) r1.A00.A00.A0X.get(), userJid, A1K);
        }
        i2 = 2131627314;
        View inflate2 = AnonymousClass3MZ.A0D(viewGroup).inflate(i2, viewGroup, false);
        C124976aI r12 = this.A05;
        C18070vi.A0b(inflate2);
        C147977gh A1K2 = C108945cZ.A1K(this, 4);
        UserJid userJid2 = this.A06;
        List list2 = C42011xT.A0I;
        return new C161998Io(inflate2, (C20005A2v) r12.A00.A00.A0X.get(), userJid2, A1K2);
    }

    public int A0Q() {
        if (this.A04) {
            return 5;
        }
        return this.A03.A01.size();
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r4) {
        C161998Io r42 = (C161998Io) r4;
        C18070vi.A0d(r42, 0);
        AnonymousClass83Q r2 = AnonymousClass83Q.A00;
        View view = r42.A0H;
        if ((view instanceof AvailabilityStateImageView) && view != null) {
            r2.invoke(view);
        }
        r42.A00.A02();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        C22821Di r1;
        boolean z;
        C161998Io r82 = (C161998Io) r8;
        C18070vi.A0d(r82, 0);
        if (!this.A04) {
            C20245ADd A012 = C196499vA.A01(this.A03, i);
            AnonymousClass77B r0 = this.A03;
            String str = r0.A00;
            AD8 ad8 = (AD8) r0.A01.get(i);
            boolean z2 = false;
            boolean A1T = AnonymousClass000.A1T(this.A00, i);
            C20256ADo A002 = C196499vA.A00(A012, this.A01, this.A03.A02);
            if (A002 != null) {
                z2 = A002.A02;
            }
            C18070vi.A0d(ad8, 1);
            View view = r82.A0H;
            view.setSelected(A1T);
            StringBuilder A11 = AnonymousClass000.A11(str);
            A11.append(' ');
            view.setContentDescription(AnonymousClass000.A0y(ad8.A00(), A11));
            if (ad8 instanceof C168178iR) {
                r1 = new B1E((C168178iR) ad8, r82, z2);
                z = view instanceof AvailabilityStateImageView;
            } else if (ad8 instanceof C168168iQ) {
                r1 = new AnonymousClass825((C168168iQ) ad8, z2);
                z = view instanceof AvailabilityStateTextView;
            } else {
                return;
            }
            if (z) {
                r1.invoke(view);
            }
        }
    }

    public int getItemViewType(int i) {
        if (this.A04) {
            return 1;
        }
        if (this.A03.A01.get(i) instanceof C168178iR) {
            return 2;
        }
        return 3;
    }
}
