package X;

import android.content.Context;
import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.3Cd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70693Cd implements Runnable {
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

    public final void run() {
        AnonymousClass1VQ r1 = this.A03;
        List list = this.A08;
        Context context = this.A02;
        int i = this.A01;
        boolean z = this.A0B;
        GroupJid groupJid = this.A04;
        String str = this.A06;
        boolean z2 = this.A0C;
        AnonymousClass1VQ.A01(context, r1, groupJid, this.A05, str, this.A07, list, i, this.A00, z, z2, this.A0D, this.A09, this.A0A);
    }

    public /* synthetic */ C70693Cd(Context context, AnonymousClass1VQ r2, GroupJid groupJid, Integer num, String str, String str2, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = r2;
        this.A08 = list;
        this.A02 = context;
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
