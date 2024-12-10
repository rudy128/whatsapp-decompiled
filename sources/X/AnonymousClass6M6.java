package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.6M6  reason: invalid class name */
public class AnonymousClass6M6 extends A34 {
    public final C58362kZ A00;
    public final AnonymousClass1M9 A01;
    public final C678831f A02;
    public final UserJid A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final WeakReference A08;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C62602rf r0;
        C19760yx A052;
        UserJid userJid = this.A03;
        if (userJid == null) {
            String str = this.A04;
            if (str != null) {
                return this.A02.A03(AnonymousClass2R1.A01, (Integer) null, str);
            }
            String str2 = this.A06;
            if (str2 != null && (A052 = this.A02.A05(str2, this.A07)) != null) {
                return Pair.create(C62602rf.A06, A052.A00);
            }
            r0 = C62602rf.A03;
        } else {
            AnonymousClass1E7 A0H = this.A01.A0H(userJid);
            String str3 = this.A05;
            if (str3 != null && !str3.isEmpty() && !str3.equals(A0H.A0c)) {
                A0H.A0c = str3;
                this.A00.A01(new C146517Pk(this, A0H, 24));
            }
            if (A0H.A0H != null) {
                r0 = C62602rf.A08;
            } else {
                r0 = this.A02.A06(AnonymousClass2R1.A01, userJid);
            }
        }
        return Pair.create(r0, (Object) null);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Pair pair = (Pair) obj;
        C145457Li r2 = (C145457Li) this.A08.get();
        if (r2 != null && !r2.A03) {
            r2.A01((C62602rf) pair.first, (C188829i3) pair.second);
        }
    }

    public AnonymousClass6M6(C58362kZ r2, AnonymousClass1M9 r3, C678831f r4, UserJid userJid, C145457Li r6, String str, String str2, AnonymousClass1D6 r9) {
        String str3;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A08 = AnonymousClass3MW.A0z(r6);
        this.A03 = userJid;
        this.A05 = str;
        this.A04 = str2;
        if (r9 != null) {
            this.A06 = (String) r9.first;
            str3 = (String) r9.second;
        } else {
            str3 = null;
        }
        this.A07 = str3;
    }
}
