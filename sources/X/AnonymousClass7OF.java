package X;

import android.net.Uri;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.7OF  reason: invalid class name */
public class AnonymousClass7OF implements C1603288a {
    public final int A00;
    public final Object A01;

    public AnonymousClass7OF(AnonymousClass74M r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void BE2(Object obj) {
        C26551So r13;
        long j;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                AnonymousClass74M r2 = (AnonymousClass74M) this.A01;
                File file = (File) obj2;
                C32861hs r5 = r2.A0t;
                AnonymousClass1BI r7 = r2.A0C;
                Log.i("app/mediajobmanager/enqueuevoicenoteupload enqueuing file ");
                C62022qf r12 = new C62022qf(true, false, true);
                if (C22971Dz.A0V(r7)) {
                    r13 = C26551So.A0W;
                } else {
                    r13 = C26551So.A0M;
                }
                C63722ta A002 = C63722ta.A00(Uri.fromFile(file), (C61382pa) null, (AnonymousClass6nF) null, r12, r13, (AnonymousClass73B) null, (String) null, 1, false, false, true);
                AnonymousClass1T6 r4 = r5.A09;
                AnonymousClass34B A0C = r4.A0C(A002, true);
                C1408173e r1 = A0C.A0O;
                r1.A0A(2);
                r1.A09();
                A0C.A0Z = "mms";
                A0C.A0B.A04(new C54942ex(file, false));
                A0C.A01 = A8F.A01(r7, false);
                A0C.A07(new C145937Ne(A0C, r5, 10), r5.A0T);
                AnonymousClass68R r0 = new AnonymousClass68R(A0C, A0C.A01());
                r4.A0I(A0C, r0);
                r2.A0D = r0;
                return;
            case 1:
                AnonymousClass74M r72 = (AnonymousClass74M) this.A01;
                int A0M = AnonymousClass000.A0M(obj2);
                if (A0M != r72.A00) {
                    C130456jS r52 = r72.A1C;
                    boolean z = r72.A0w.A0B;
                    String A0D = C64052u8.A0D(r52.A06, (String) null, (long) A0M);
                    C18070vi.A0X(A0D);
                    r52.A03.setText(A0D);
                    TextView textView = r52.A02;
                    textView.setText(A0D);
                    if (z) {
                        textView.setVisibility(4);
                    }
                    r72.A00 = A0M;
                    return;
                }
                return;
            case 2:
                AnonymousClass74M r02 = (AnonymousClass74M) this.A01;
                boolean A1Y = AnonymousClass000.A1Y(obj2);
                AnonymousClass7OH r53 = r02.A15;
                AnonymousClass70T r03 = r02.A0I;
                if (r03 != null) {
                    int A02 = r03.A02();
                    boolean A0C2 = r03.A0C();
                    int A03 = r03.A03();
                    if (A1Y) {
                        A02 = 0;
                        A0C2 = false;
                    }
                    r53.A05.setProgress(A02);
                    r53.A03.setPlaybackPercentage(((float) A02) / ((float) A03));
                    if (A0C2) {
                        j = (long) A02;
                    } else {
                        j = (long) A03;
                    }
                    r53.A04(j);
                    return;
                }
                return;
            default:
                AnonymousClass74M r14 = (AnonymousClass74M) this.A01;
                if (AnonymousClass000.A1Y(obj2)) {
                    AnonymousClass74M.A08(r14);
                } else {
                    AnonymousClass74M.A09(r14);
                }
                AnonymousClass74M.A0A(r14);
                return;
        }
    }
}
