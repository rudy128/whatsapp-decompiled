package X;

import android.os.SystemClock;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.49k  reason: invalid class name and case insensitive filesystem */
public class C827049k extends A34 {
    public int A00;
    public AnonymousClass4PG A01;
    public final AnonymousClass1M9 A02;
    public final C24921Me A03;
    public final AnonymousClass1CJ A04;
    public final AnonymousClass1MZ A05;
    public final AnonymousClass12M A06;
    public final AnonymousClass1OZ A07;
    public final C55082fB A08;
    public final AnonymousClass23S A09;
    public final WeakReference A0A;
    public final AnonymousClass11S A0B;
    public final AnonymousClass11P A0C;
    public final AnonymousClass118 A0D;
    public final C18030ve A0E;

    public static void A00(C827049k r14, AnonymousClass1EC r15, UserJid userJid, C42661yX r17, String str, String str2, Collection collection, int i, int i2, int i3, long j) {
        C827049k r5;
        String str3 = str;
        ArrayList A0z = C17880vN.A0z(collection.size());
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = collection.iterator();
        while (true) {
            r5 = r14;
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass1E7 A0E2 = r14.A02.A0E(C17880vN.A0Q(it));
            if (!(A0E2 == null || A0E2.A0H == null)) {
                A0z.add(A0E2);
                A13.add(A0E2.A0K());
            }
        }
        Collections.sort(A0z, new AnonymousClass40d(r14.A0B, r14.A03, r14, 1));
        if (str == null || str3.length() == 0) {
            str3 = C88374Zl.A02(r14.A0D, A13, collection.size());
        }
        r5.A01 = new AnonymousClass4PG(r15, userJid, r17, str3, str2, A0z, i, i2, i3, j, false);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        AnonymousClass1E7 A0E2;
        if (this.A09.A0v.A02) {
            AnonymousClass1EC A0b = AnonymousClass3MY.A0b(this.A08.A01);
            AnonymousClass1M9 r0 = this.A02;
            AnonymousClass1E7 A0H = r0.A0H(A0b);
            UserJid userJid = null;
            if (!(A0b == null || (A0E2 = r0.A0E(A0b)) == null)) {
                userJid = A0E2.A0K;
            }
            C199410f A0O = C72483Me.A0O(this.A05.A08.A0C(A0b));
            HashSet hashSet = new HashSet(A0O.size());
            AnonymousClass1IZ it = A0O.iterator();
            while (it.hasNext()) {
                hashSet.add(((C63312sr) it.next()).A04);
            }
            long A042 = C20099A7c.A04(A0H.A0X, Long.MIN_VALUE);
            A00(this, A0b, userJid, A0H.A0M, this.A03.A0I(A0H), (String) null, hashSet, hashSet.size(), this.A04.A06(A0b), 0, A042);
            return null;
        }
        try {
            this.A07.A0E(32000);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.A06.A05(new C96414no(this, 3), this.A08).get(32000, TimeUnit.MILLISECONDS);
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (elapsedRealtime2 < 500) {
                    SystemClock.sleep(500 - elapsedRealtime2);
                }
                return null;
            } catch (Exception e) {
                Log.w("ViewGroupInviteActivity/failed/timeout", e);
                return null;
            }
        } catch (C36811oV unused) {
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass1E7 A0E2;
        ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A0A.get();
        if (viewGroupInviteActivity != null) {
            AnonymousClass4PG r6 = this.A01;
            int i = this.A00;
            if (r6 != null) {
                viewGroupInviteActivity.A01.setVisibility(0);
                AnonymousClass4SZ r2 = viewGroupInviteActivity.A0F;
                C55082fB r0 = viewGroupInviteActivity.A0H;
                C17960vV.A07(r0);
                r2.A01(r6, r0.A00 * 1000);
                viewGroupInviteActivity.A02.setVisibility(8);
                C55082fB r22 = viewGroupInviteActivity.A0H;
                if (r22 == null) {
                    return;
                }
                if (!viewGroupInviteActivity.A0N || (A0E2 = viewGroupInviteActivity.A05.A0E(r22.A01)) == null) {
                    viewGroupInviteActivity.A0E.A0G(new C96424np(viewGroupInviteActivity), viewGroupInviteActivity.A0H);
                    return;
                }
                viewGroupInviteActivity.A07.A07(viewGroupInviteActivity.A03, A0E2);
                return;
            }
            viewGroupInviteActivity.A01.setVisibility(4);
            viewGroupInviteActivity.A02.setVisibility(4);
            int i2 = 2131891008;
            if (i != 403) {
                if (i == 404 || i == 406) {
                    i2 = 2131891007;
                    if (viewGroupInviteActivity.A00 == 1) {
                        i2 = 2131891009;
                    }
                } else {
                    i2 = 2131891006;
                    if (viewGroupInviteActivity.A00 == 1) {
                        i2 = 2131893509;
                    }
                }
            }
            ViewGroupInviteActivity.A03(viewGroupInviteActivity, i2);
        }
    }

    public C827049k(AnonymousClass11S r2, AnonymousClass1M9 r3, C24921Me r4, AnonymousClass11P r5, AnonymousClass118 r6, AnonymousClass1CJ r7, AnonymousClass1MZ r8, C18030ve r9, AnonymousClass12M r10, ViewGroupInviteActivity viewGroupInviteActivity, AnonymousClass1OZ r12, C55082fB r13, AnonymousClass23S r14) {
        this.A0C = r5;
        this.A0E = r9;
        this.A0B = r2;
        this.A0D = r6;
        this.A04 = r7;
        this.A07 = r12;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r10;
        this.A05 = r8;
        this.A0A = AnonymousClass3MW.A0z(viewGroupInviteActivity);
        this.A09 = r14;
        this.A08 = r13;
    }
}
