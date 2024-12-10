package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Rf  reason: invalid class name and case insensitive filesystem */
public class C26201Rf {
    public final AnonymousClass1MZ A00;
    public final AnonymousClass1PQ A01;

    public C48392Mh A00(AnonymousClass1EC r10, C29741cn r11, C29741cn r12, long j) {
        AnonymousClass1PQ r2;
        int i;
        if (r12 != null) {
            AnonymousClass1EC r4 = r10;
            if (this.A00.A0K(r10)) {
                if (r11 == null) {
                    r11 = new C29741cn(0, 0);
                }
                int i2 = r11.A00;
                if (i2 == 0) {
                    if (r12.A00 == 1) {
                        r2 = this.A01;
                        StringBuilder sb = new StringBuilder();
                        sb.append("SystemMessageFactory/newInviteViaLinkUnavailableSystemMessage/gjid=");
                        sb.append(r10);
                        Log.i(sb.toString());
                        i = 73;
                    }
                } else if (i2 == 1 && r12.A00 == 0) {
                    r2 = this.A01;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SystemMessageFactory/newInviteViaLinkAvailableAgainSystemMessage/gjid=");
                    sb2.append(r10);
                    Log.i(sb2.toString());
                    i = 74;
                }
                return r2.A06((C63872tp) null, r4, (C62502rV) null, i, j);
            }
        }
        return null;
    }

    public C26201Rf(AnonymousClass1MZ r1, AnonymousClass1PQ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
