package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.3Ag  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70233Ag implements AnonymousClass1TI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ AnonymousClass1VQ A03;
    public final /* synthetic */ GroupJid A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public final void accept(Object obj) {
        AnonymousClass1VQ r4 = this.A03;
        Context context = this.A02;
        List list = this.A08;
        int i = this.A01;
        boolean z = this.A0B;
        GroupJid groupJid = this.A04;
        String str = this.A06;
        boolean z2 = this.A0C;
        String str2 = this.A07;
        boolean z3 = this.A0D;
        Integer num = this.A05;
        int i2 = this.A00;
        boolean z4 = this.A09;
        boolean z5 = this.A0A;
        if (!AnonymousClass000.A1Y(obj)) {
            Intent A1x = r4.A0K.A1x(context, ((AnonymousClass1E7) list.get(0)).A0J, 0);
            A1x.putExtra("ctc_deeplink_option", "CHAT");
            context.startActivity(A1x);
            return;
        }
        r4.A05.A0J(new C70693Cd(context, r4, groupJid, num, str, str2, list, i, i2, z, z2, z3, z4, z5));
    }

    public /* synthetic */ C70233Ag(Context context, AnonymousClass1VQ r2, GroupJid groupJid, Integer num, String str, String str2, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = r2;
        this.A02 = context;
        this.A08 = list;
        this.A01 = i;
        this.A0B = z;
        this.A04 = groupJid;
        this.A06 = str;
        this.A0C = z2;
        this.A07 = str2;
        this.A0D = z3;
        this.A05 = num;
        this.A00 = i2;
        this.A09 = z4;
        this.A0A = z5;
    }
}
