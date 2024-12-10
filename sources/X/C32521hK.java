package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1hK  reason: invalid class name and case insensitive filesystem */
public class C32521hK {
    public final Handler A00 = new AnonymousClass26y(Looper.getMainLooper(), this);
    public final C23651Hc A01;
    public final AnonymousClass12M A02;
    public final C32511hJ A03;
    public final C18030ve A04;
    public final AnonymousClass00H A05;
    public final HashMap A06 = new HashMap();

    public static AnonymousClass1BI A00(C32521hK r3, AnonymousClass1BI r4) {
        if (C42701yb.A02(r4.user) && C22971Dz.A0X(r4)) {
            if (C18020vd.A05(C18040vf.A02, r3.A04, 11965)) {
                C22941Dw r0 = UserJid.Companion;
                r4 = C22971Dz.A04(C22941Dw.A01(r4));
            }
        }
        HashMap hashMap = r3.A06;
        AnonymousClass1BI r02 = (AnonymousClass1BI) hashMap.get(r4);
        if (r02 != null) {
            return r02;
        }
        hashMap.put(r4, r4);
        return r4;
    }

    public static void A01(C32521hK r8, AnonymousClass1BI r9) {
        C29591cX r2 = new C29591cX("chatstate");
        r2.A05(new C29591cX("paused").A03());
        C29621ca A032 = r2.A03();
        C18070vi.A0d(r9, 1);
        C29591cX r3 = new C29591cX("chatstate");
        List asList = Arrays.asList(new Class[]{AnonymousClass1EC.class, UserJid.class});
        C18070vi.A0X(asList);
        C29601cY.A01(r9, "to", asList);
        r3.A04(new AnonymousClass1MD((Jid) r9, "to"));
        Boolean bool = C17960vV.A01;
        r3.A06(A032);
        ((AnonymousClass1OZ) r8.A05.get()).A0O(r3.A03(), 5);
        StringBuilder sb = new StringBuilder();
        sb.append("HandleMeComposing/write/paused; toJid=");
        sb.append(r9);
        Log.i(sb.toString());
    }

    public static void A02(C32521hK r9, AnonymousClass1BI r10, int i) {
        String str;
        AnonymousClass1OZ r6 = (AnonymousClass1OZ) r9.A05.get();
        if (i == 1) {
            str = "audio";
        } else {
            str = null;
        }
        boolean equals = "audio".equals(str);
        C29591cX r4 = new C29591cX("chatstate");
        C29591cX r2 = new C29591cX("composing");
        if (equals) {
            r2.A04(new AnonymousClass1MD("media", "audio"));
        }
        r4.A05(r2.A03());
        C29621ca A032 = r4.A03();
        C18070vi.A0d(r10, 1);
        C29591cX r42 = new C29591cX("chatstate");
        List asList = Arrays.asList(new Class[]{AnonymousClass1EC.class, UserJid.class});
        C18070vi.A0X(asList);
        C29601cY.A01(r10, "to", asList);
        r42.A04(new AnonymousClass1MD((Jid) r10, "to"));
        Boolean bool = C17960vV.A01;
        r42.A06(A032);
        r6.A0O(r42.A03(), 4);
        StringBuilder sb = new StringBuilder();
        sb.append("HandleMeComposing/sendComposing; toJid=");
        sb.append(r10);
        sb.append("; media=");
        sb.append(i);
        Log.i(sb.toString());
    }

    public C32521hK(C23651Hc r3, C18030ve r4, AnonymousClass12M r5, C32511hJ r6, AnonymousClass00H r7) {
        this.A04 = r4;
        this.A03 = r6;
        this.A05 = r7;
        this.A02 = r5;
        this.A01 = r3;
    }
}
