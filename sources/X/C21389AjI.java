package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AjI  reason: case insensitive filesystem */
public final /* synthetic */ class C21389AjI implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C114465qs A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ C42691ya A04;
    public final /* synthetic */ C191919nP A05;
    public final /* synthetic */ byte[] A06;

    public final void run() {
        Object obj;
        C191919nP r3 = this.A05;
        UserJid userJid = this.A03;
        byte[] bArr = this.A06;
        int i = this.A00;
        C42691ya r5 = this.A04;
        long j = this.A01;
        C114465qs r2 = this.A02;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BizVNameXmppMethods/recvmessagelistener/on-get-biz-vname-cert jid=");
        A10.append(userJid);
        A10.append(" certBlob=[");
        if (bArr != null) {
            obj = Integer.valueOf(bArr.length);
        } else {
            obj = "null";
        }
        A10.append(obj);
        A10.append("] vlevel=");
        A10.append(i);
        A10.append(". privactMode=");
        C17890vO.A1A(A10, r5.toString());
        try {
            ((C36161nR) r3.A00.get()).A00(userJid, r5, bArr, i, j);
        } finally {
            r2.A03((Object) null);
        }
    }

    public /* synthetic */ C21389AjI(C114465qs r1, UserJid userJid, C42691ya r3, C191919nP r4, byte[] bArr, int i, long j) {
        this.A05 = r4;
        this.A03 = userJid;
        this.A06 = bArr;
        this.A00 = i;
        this.A04 = r3;
        this.A01 = j;
        this.A02 = r1;
    }
}
