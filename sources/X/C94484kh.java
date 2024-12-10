package X;

import android.content.Context;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.4kh  reason: invalid class name and case insensitive filesystem */
public final class C94484kh implements AnonymousClass5ZD {
    public final Context A00;
    public final AnonymousClass5ZN A01;
    public final AnonymousClass5ZV A02;
    public final AnonymousClass1EC A03;
    public final AnonymousClass1EC A04;
    public final C436420i A05;

    public List getCTAViews() {
        WDSButton[] wDSButtonArr = new WDSButton[2];
        AnonymousClass5ZN r3 = this.A01;
        Context context = this.A00;
        C436420i r7 = this.A05;
        AnonymousClass1EC r5 = this.A03;
        AnonymousClass1EC r6 = this.A04;
        wDSButtonArr[0] = r3.BGo(context, r5, r6, r7, 6, false);
        return C18070vi.A0O(this.A02.BGq(context, new C81723zh(), r5, r6), wDSButtonArr, 1);
    }

    public C94484kh(Context context, AnonymousClass5ZN r2, AnonymousClass5ZV r3, AnonymousClass1EC r4, AnonymousClass1EC r5, C436420i r6) {
        C18070vi.A0j(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = context;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
    }
}
