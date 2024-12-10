package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;

@Deprecated
/* renamed from: X.5nA  reason: invalid class name and case insensitive filesystem */
public class C113485nA extends C42011xT {
    public int A00 = 2131896786;
    public int A01;
    public View A02;
    public View A03;
    public UserJid A04;
    public final Context A05;
    public final Resources A06;
    public final FrameLayout A07;
    public final ImageView A08;
    public final ImageView A09;
    public final ImageView A0A;
    public final TextView A0B;
    public final C000100c A0C;
    public final AnonymousClass1KB A0D;
    public final C42141xh A0E;
    public final C37451pZ A0F;
    public final AnonymousClass7NF A0G;
    public final AnonymousClass10I A0H;
    public final C39241sk A0I = new C39251sl();
    public final boolean A0J;

    public C113485nA(Context context, View view, C000100c r9, C37451pZ r10) {
        super(view);
        this.A05 = context;
        this.A06 = context.getResources();
        this.A0C = r9;
        AnonymousClass10E r4 = (AnonymousClass10E) r9;
        this.A0D = AnonymousClass10E.A12(r4);
        this.A0H = r9.CRy();
        this.A0G = new AnonymousClass7NF(context);
        this.A0F = r10;
        boolean A052 = C18020vd.A05(C18040vf.A02, r9.BAL(), 2429);
        this.A0J = C18020vd.A05(C18040vf.A01, r9.BAL(), 1875);
        ImageView A0G2 = AnonymousClass3MW.A0G(view, 2131429433);
        ImageView A0G3 = AnonymousClass3MW.A0G(view, 2131437025);
        if (A052) {
            A0G2.setVisibility(8);
            A0G3.setVisibility(0);
        } else {
            A0G2.setVisibility(0);
            A0G3.setVisibility(8);
            A0G3 = A0G2;
        }
        this.A0A = A0G3;
        A0G3.setClickable(false);
        A0G3.setImportantForAccessibility(2);
        AnonymousClass1HF.A06(view, 2131429455).setClickable(false);
        C42141xh A012 = C42141xh.A01(view, AnonymousClass3MZ.A0T(r4.Ao8.A00), 2131429428);
        this.A0E = A012;
        this.A0B = AnonymousClass3MW.A0J(view, 2131429798);
        this.A07 = C108945cZ.A0P(view, 2131427466);
        this.A08 = AnonymousClass3MW.A0G(view, 2131427497);
        this.A09 = AnonymousClass3MW.A0G(view, 2131429425);
        C43421zm.A04(A012.A01);
    }
}
