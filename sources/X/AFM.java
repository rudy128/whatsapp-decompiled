package X;

import android.view.View;
import com.whatsapp.bridge.wfs.ui.LinkedUsersActivity;

public final /* synthetic */ class AFM implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LinkedUsersActivity A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ AnonymousClass1D6 A08;

    public final void onClick(View view) {
        LinkedUsersActivity linkedUsersActivity = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A05;
        AnonymousClass1D6 r10 = this.A08;
        Integer num = this.A02;
        int i = this.A00;
        String str4 = this.A06;
        String str5 = this.A07;
        AnonymousClass00H r0 = linkedUsersActivity.A04;
        if (r0 != null) {
            C198779yt r4 = (C198779yt) r0.get();
            int A0B = C72463Mc.A0B(num);
            String str6 = "";
            if (str4 == null) {
                str4 = str6;
            }
            if (str5 != null) {
                str6 = str5;
            }
            r4.A08.CGN(new C21411Aje(linkedUsersActivity, r4, str4, str6, str2, str3, str, r10, A0B, i));
            return;
        }
        C18070vi.A11("wfsManager");
        throw null;
    }

    public /* synthetic */ AFM(LinkedUsersActivity linkedUsersActivity, Integer num, String str, String str2, String str3, String str4, String str5, AnonymousClass1D6 r8, int i) {
        this.A01 = linkedUsersActivity;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A08 = r8;
        this.A02 = num;
        this.A00 = i;
        this.A06 = str4;
        this.A07 = str5;
    }
}
