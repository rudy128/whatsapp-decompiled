package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1jf  reason: invalid class name and case insensitive filesystem */
public final class C33961jf extends C31911gK implements C26181Rd {
    public final C23651Hc A00;
    public final AnonymousClass1M9 A01;
    public final C19830z4 A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass11S A04;
    public final C26191Re A05;
    public final C18030ve A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C33961jf(X.AnonymousClass190 r9, X.AnonymousClass11S r10, X.C23651Hc r11, X.AnonymousClass1M9 r12, X.C26191Re r13, X.C19830z4 r14, X.C18030ve r15, X.AnonymousClass1OZ r16, X.AnonymousClass1N7 r17, X.AnonymousClass10I r18) {
        /*
            r8 = this;
            r7 = 1
            X.C18070vi.A0d(r15, r7)
            r0 = 2
            r2 = r9
            X.C18070vi.A0d(r9, r0)
            r0 = 3
            X.C18070vi.A0d(r10, r0)
            r0 = 4
            r5 = r18
            X.C18070vi.A0d(r5, r0)
            r0 = 5
            r3 = r16
            X.C18070vi.A0d(r3, r0)
            r0 = 6
            X.C18070vi.A0d(r12, r0)
            r0 = 7
            X.C18070vi.A0d(r11, r0)
            r0 = 8
            X.C18070vi.A0d(r13, r0)
            r0 = 9
            r4 = r17
            X.C18070vi.A0d(r4, r0)
            r0 = 10
            X.C18070vi.A0d(r14, r0)
            int[] r6 = new int[r7]
            r1 = 0
            r0 = 261(0x105, float:3.66E-43)
            r6[r1] = r0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.A06 = r15
            r8.A04 = r10
            r8.A03 = r5
            r8.A01 = r12
            r8.A00 = r11
            r8.A05 = r13
            r8.A02 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33961jf.<init>(X.190, X.11S, X.1Hc, X.1M9, X.1Re, X.0z4, X.0ve, X.1OZ, X.1N7, X.10I):void");
    }

    public /* synthetic */ void BvR() {
    }

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvT() {
    }

    public /* synthetic */ void BvV() {
    }

    public static final void A01(C33961jf r9, Set set) {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(C26571Sq.A05);
            C18070vi.A0X(bytes);
            byte[] decode = Base64.decode(bytes, 0);
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                C18070vi.A0b(instance);
                linkedHashSet = new LinkedHashSet();
                List singletonList = Collections.singletonList(decode);
                C18070vi.A0X(singletonList);
                List A0t = C29431cG.A0t(AnonymousClass1M2.A08(r9.A01.A04, true));
                ArrayList A13 = AnonymousClass000.A13();
                Iterator it2 = A0t.iterator();
                while (it2.hasNext()) {
                    AnonymousClass1BI A0Q = C17880vN.A0Q(it2);
                    if (!C63412t2.A03(A0Q) && C63412t2.A02(A0Q, instance, singletonList)) {
                        A13.add(A0Q);
                    }
                }
                Iterator it3 = A13.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    C18070vi.A0z(next, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                    linkedHashSet.add(next);
                }
                linkedHashSet.size();
            } catch (NoSuchAlgorithmException e) {
                r9.A03.A0G("DeviceUpdateSideContactNotificationHandler/getSidelistContactsMatchingHash NoSuchAlgorithmException", e.toString(), true);
                Log.e("DeviceUpdateSideContactNotificationHandler/onRun/NoSuchAlgorithmException.");
                linkedHashSet = new LinkedHashSet();
            }
            linkedHashSet2.addAll(linkedHashSet);
        }
        if (!linkedHashSet2.isEmpty()) {
            linkedHashSet2.size();
            r9.A05.A01((UserJid[]) linkedHashSet2.toArray(new UserJid[0]), 2);
        }
    }

    public void BvU() {
        this.A03.CGF(new C21425Ajs((Object) this, 9));
    }
}
