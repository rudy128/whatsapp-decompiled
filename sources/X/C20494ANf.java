package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.ANf  reason: case insensitive filesystem */
public final /* synthetic */ class C20494ANf implements B7H {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass1FU A03;
    public final /* synthetic */ A1M A04;
    public final /* synthetic */ C20287AEv A05;
    public final /* synthetic */ C20005A2v A06;
    public final /* synthetic */ AnonymousClass1BI A07;
    public final /* synthetic */ UserJid A08;
    public final /* synthetic */ List A09;

    public final void Bx5(Bitmap bitmap, C20467AMe aMe, boolean z) {
        A1M a1m = this.A04;
        int i = this.A00;
        List list = this.A09;
        AnonymousClass1FU r2 = this.A03;
        int i2 = this.A01;
        AnonymousClass1BI r7 = this.A07;
        C20287AEv aEv = this.A05;
        UserJid userJid = this.A08;
        long j = this.A02;
        C20005A2v a2v = this.A06;
        C21132Af0 af0 = new C21132Af0();
        af0.A0A(new C21131Aez(r2, af0, a1m, aEv, a2v, r7, userJid, list, i, i2, j, z), a1m.A01.A05);
        C21455AkM.A00(a1m.A06, a1m, af0, bitmap, 20);
    }

    public /* synthetic */ C20494ANf(AnonymousClass1FU r1, A1M a1m, C20287AEv aEv, C20005A2v a2v, AnonymousClass1BI r5, UserJid userJid, List list, int i, int i2, long j) {
        this.A04 = a1m;
        this.A00 = i;
        this.A09 = list;
        this.A03 = r1;
        this.A01 = i2;
        this.A07 = r5;
        this.A05 = aEv;
        this.A08 = userJid;
        this.A02 = j;
        this.A06 = a2v;
    }
}
