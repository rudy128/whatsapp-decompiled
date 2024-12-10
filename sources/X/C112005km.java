package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.5km  reason: invalid class name and case insensitive filesystem */
public final class C112005km extends C38391rD {
    public List A00 = AnonymousClass000.A13();
    public final AnonymousClass6ZY A01;
    public final C37451pZ A02;
    public final C1595785b A03;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        AnonymousClass6ZY r2 = this.A01;
        View A0B = AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626247, false);
        C37451pZ r5 = this.A02;
        List list = C42011xT.A0I;
        AnonymousClass10G r1 = r2.A00.A01.A00;
        return new C113345mw(A0B, AnonymousClass3MZ.A0T(r1), r5, (AnonymousClass4XM) r1.A3O.get(), this);
    }

    public int A0Q() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r9, int i) {
        C113345mw r92 = (C113345mw) r9;
        C18070vi.A0d(r92, 0);
        AnonymousClass6B5 r7 = (AnonymousClass6B5) this.A00.get(i);
        C18070vi.A0d(r7, 0);
        C42141xh r3 = r92.A00;
        C46162Dk r2 = r7.A06;
        r3.A01.setText(r2.A0T);
        r3.A03(AnonymousClass000.A1Z(r2.A05, AnonymousClass9IW.VERIFIED) ? 1 : 0);
        long j = r2.A0G;
        AnonymousClass4XM r1 = r92.A04;
        int A002 = AnonymousClass4XM.A00(r1, (int) j);
        String A012 = r1.A01(A002);
        C18070vi.A0d(A012, 1);
        WaTextView waTextView = r92.A01;
        AnonymousClass3MX.A1E(AnonymousClass000.A0Y(waTextView), waTextView, new Object[]{A012}, 2131755092, A002);
        AnonymousClass1E7 r22 = r7.A01;
        if (r22 != null) {
            r92.A03.A07(r92.A02, r22);
        }
    }

    public C112005km(AnonymousClass6ZY r3, C27201Vd r4, AnonymousClass118 r5, C1595785b r6) {
        C18070vi.A0o(r4, r5, r3);
        this.A01 = r3;
        this.A03 = r6;
        this.A02 = r4.A06(r5.A00, "channel-upgrade-adapter");
    }
}
