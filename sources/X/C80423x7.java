package X;

import android.content.Context;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.3x7  reason: invalid class name and case insensitive filesystem */
public class C80423x7 extends C42601yR {
    public final int A00;
    public final Context A01;
    public final TextView A02;
    public final C18000vb A03;
    public final C36391no A04;
    public final AnonymousClass1KW A05;
    public final C32011gU A06;
    public final AnonymousClass206 A07;
    public final List A08;

    public /* bridge */ /* synthetic */ Object A02() {
        CharSequence A032;
        Context context = this.A01;
        C87744Wu A002 = C87744Wu.A00(context, this.A04, this.A06, this.A07, this.A00);
        C42621yT r6 = this.A00;
        r6.A02();
        String str = A002.A02;
        if (str == null) {
            A032 = context.getString(2131897898);
        } else {
            A032 = C43351zf.A03(context, this.A03, C43251zV.A03(context, this.A02.getPaint(), this.A05, str), this.A08);
        }
        r6.A02();
        String str2 = A002.A04;
        List list = this.A08;
        C18000vb r1 = this.A03;
        CharSequence A033 = C43351zf.A03(context, r1, str2, list);
        CharSequence A034 = C43351zf.A03(context, r1, A002.A03, list);
        r6.A02();
        return new AnonymousClass4O5(A002, A033, A034, A032);
    }

    public C80423x7(Context context, TextView textView, C18000vb r3, C36391no r4, AnonymousClass1KW r5, C32011gU r6, AnonymousClass206 r7, List list, int i) {
        this.A01 = context;
        this.A06 = r6;
        this.A05 = r5;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = i;
        this.A07 = r7;
        this.A02 = textView;
        this.A08 = list;
    }
}
