package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2Pp  reason: invalid class name and case insensitive filesystem */
public class C49212Pp extends A34 {
    public AnonymousClass1M6 A00;
    public final AnonymousClass11S A01;
    public final C39511tC A02;
    public final AnonymousClass12E A03;
    public final UserJid A04;
    public final WeakReference A05;
    public final CountDownLatch A06 = new CountDownLatch(1);

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        this.A02.unregisterObserver(this.A00);
        AnonymousClass1FU r2 = (AnonymousClass1FU) this.A05.get();
        if (r2 != null) {
            r2.CEx();
            r2.A3q(AnonymousClass1LU.A1D(r2, this.A04, (Integer) null, true, true), false);
        }
    }

    public void A0E() {
        this.A02.unregisterObserver(this.A00);
    }

    public void A0F() {
        AnonymousClass1FU r2 = (AnonymousClass1FU) this.A05.get();
        if (r2 != null) {
            r2.CNB(0, 2131891794);
        }
        this.A02.registerObserver(this.A00);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C63212sh A002;
        C62132qq r0;
        if (this.A01.A0N()) {
            A002 = C63212sh.A00(AnonymousClass2R1.A0E);
            r0 = C62132qq.A0D;
        } else {
            A002 = C63212sh.A00(AnonymousClass2R1.A0C);
            r0 = C62132qq.A0C;
        }
        A002.A00 = r0;
        A002.A03 = true;
        UserJid userJid = this.A04;
        if (userJid != null) {
            A002.A08.add(userJid);
        }
        if (!this.A03.A03(A002.A02()).A00()) {
            return null;
        }
        try {
            this.A06.await(C20113A7w.A0L, TimeUnit.MILLISECONDS);
            return null;
        } catch (InterruptedException unused) {
            Log.w("ConversationRowContact/OpenBusinessProfileNotInContactListTask was interrupted while waiting for biz identity response.");
            return null;
        }
    }

    public C49212Pp(AnonymousClass11S r3, AnonymousClass1FY r4, C39511tC r5, AnonymousClass12E r6, UserJid userJid) {
        this.A05 = new WeakReference(r4);
        this.A01 = r3;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = userJid;
        this.A00 = new C66272xu(this, userJid);
    }
}
