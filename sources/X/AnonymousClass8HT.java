package X;

import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.8HT  reason: invalid class name */
public final class AnonymousClass8HT extends C41251w3 {
    public final AnonymousClass2YL A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final C18100vl A06 = AnonymousClass1DF.A01(new C21970AvY(this));

    public void A0T(RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        ((AnonymousClass4VT) this.A06.getValue()).A02.A04(false);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View inflate = C72463Mc.A0K(viewGroup, 0).inflate(2131624319, viewGroup, false);
        AnonymousClass2YL r1 = this.A00;
        C18070vi.A0b(inflate);
        List list = C42011xT.A0I;
        AnonymousClass10E r12 = r1.A00.A02;
        C32011gU r2 = (C32011gU) r12.A5k.get();
        return new C162098Iy(inflate, AnonymousClass3MZ.A0N(r12), r2, (AnonymousClass4VT) this.A06.getValue());
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r7, int i) {
        String A002;
        String str;
        C162098Iy r72 = (C162098Iy) r7;
        C18070vi.A0d(r72, 0);
        AnonymousClass4VK r4 = (AnonymousClass4VK) A0U(i);
        C18070vi.A0b(r4);
        C18070vi.A0d(r4, 0);
        Resources A0Y = AnonymousClass000.A0Y(r72.A00);
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = r4.A00();
        AnonymousClass210 r42 = r4.A00;
        String A0x = AnonymousClass3MW.A0x(A0Y, r42.A06, A1b, 1, 2131886623);
        C18070vi.A0X(A0x);
        r72.A05.setText(A0x);
        WaTextView waTextView = r72.A04;
        String str2 = r42.A07;
        C32011gU r0 = r72.A06;
        if (str2 == null) {
            A002 = null;
        } else {
            A002 = AnonymousClass2VB.A00(r0, str2);
        }
        waTextView.setText(A002);
        C692136i A003 = AnonymousClass2UX.A00(r42);
        if (!(A003 == null || (str = A003.A03) == null)) {
            r72.A07.A02(r72.A03, (C97994qO) r72.A08.getValue(), str);
        }
        Uri parse = Uri.parse(r42.A07);
        ViewGroup viewGroup = r72.A01;
        if (parse != null) {
            AFT.A00(viewGroup, r72, parse, 45);
        } else {
            viewGroup.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1uf, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8HT(AnonymousClass2YL r2, AnonymousClass118 r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        super((C40411uf) new Object());
        C18070vi.A0w(r2, r4, r5, r6, r7);
        C18070vi.A0d(r3, 6);
        this.A00 = r2;
        this.A02 = r4;
        this.A05 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A01 = r3;
    }

    public long A0M(int i) {
        Integer A002 = ((AnonymousClass4VK) A0U(i)).A00();
        if (A002 != null) {
            return (long) A002.intValue();
        }
        return -1;
    }
}
