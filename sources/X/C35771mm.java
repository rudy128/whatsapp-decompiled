package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.1mm  reason: invalid class name and case insensitive filesystem */
public final class C35771mm {
    public final AnonymousClass1KB A00;
    public final C35761ml A01;
    public final C35751mk A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass121 A04;
    public final C18030ve A05;
    public final AnonymousClass1PQ A06;
    public final AnonymousClass10I A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    public C35771mm(AnonymousClass1KB r2, C35761ml r3, C35751mk r4, AnonymousClass11P r5, AnonymousClass121 r6, C18030ve r7, AnonymousClass1PQ r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0d(r8, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r10, 4);
        C18070vi.A0d(r11, 5);
        C18070vi.A0d(r2, 6);
        C18070vi.A0d(r12, 8);
        C18070vi.A0d(r13, 9);
        C18070vi.A0d(r9, 10);
        C18070vi.A0d(r7, 11);
        C18070vi.A0d(r3, 12);
        this.A06 = r8;
        this.A04 = r6;
        this.A03 = r5;
        this.A09 = r10;
        this.A0A = r11;
        this.A00 = r2;
        this.A02 = r4;
        this.A08 = r12;
        this.A0B = r13;
        this.A07 = r9;
        this.A05 = r7;
        this.A01 = r3;
    }

    public final void A05(AnonymousClass9NH r14, String str, String str2, List list) {
        String str3 = str;
        String str4 = str2;
        if (C18020vd.A05(C18040vf.A02, this.A05, 12758)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass9NH r0 = (AnonymousClass9NH) it.next();
                A01(r0.A02, this, str3, str4, r0.A01, r0.A00);
            }
        }
        AnonymousClass9NC r7 = r14.A02;
        UserJid userJid = r7.A00;
        if (userJid != null) {
            A01(r7, this, str, str4, r14.A01, r14.A00);
            this.A07.CGF(new C21455AkM(this, userJid, r14, 31));
        }
    }

    public final void A06(UserJid userJid, String str, String str2, int i) {
        String str3;
        UserJid userJid2 = userJid;
        C18070vi.A0d(userJid2, 2);
        String A022 = ((C35781mn) this.A0A.get()).A02();
        C189929k5 r2 = (C189929k5) this.A09.get();
        String str4 = str2;
        int i2 = i;
        AOF aof = new AOF(this, userJid2, A022, str4, i2);
        AnonymousClass00H r1 = r2.A01;
        String A0B2 = ((AnonymousClass1OZ) r1.get()).A0B();
        Log.i("bizOptOutHandler/sendSetOptOutListRequest");
        if (i2 == 1) {
            str3 = "unblock";
        } else {
            str3 = "block";
        }
        AnonymousClass9F3 r3 = new AnonymousClass9F3(userJid2, A0B2, A022, str3, str, str4);
        ((AnonymousClass1OZ) r1.get()).A0N(new C178899Ew(new C183979aD(aof, r2), r3), (C29621ca) r3.A04, A0B2, 427, 20000);
    }

    public final boolean A07(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("jids_receiving_marketing_message");
        sb.append(userJid.getRawString());
        String obj = sb.toString();
        C18070vi.A0X(obj);
        return ((C56712hu) this.A08.get()).A00(obj).optBoolean("marketing_msg_received");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.9NC, java.lang.Object] */
    public final boolean A08(UserJid userJid) {
        C18070vi.A0d(userJid, 1);
        ? obj = new Object();
        obj.A01 = null;
        obj.A00 = userJid;
        String string = C35781mn.A00((C35781mn) this.A0A.get()).getString(C35781mn.A01(obj), new JSONObject().toString());
        if (string == null) {
            string = new JSONObject().toString();
        }
        C18070vi.A0b(string);
        if (new JSONObject(string).optInt(String.valueOf(0), 1) == 0) {
            return true;
        }
        return false;
    }

    public static final String A00(AnonymousClass206 r2) {
        C20285AEt BPK;
        if (r2 instanceof C439421n) {
            C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageTemplate");
            return ((C439421n) r2).BaE().A04;
        } else if (!(r2 instanceof AnonymousClass21K) || (BPK = ((AnonymousClass21K) r2).BPK()) == null) {
            return null;
        } else {
            return BPK.A0D;
        }
    }

    public static final void A01(AnonymousClass9NC r4, C35771mm r5, String str, String str2, int i, int i2) {
        C35781mn r3 = (C35781mn) r5.A0A.get();
        String A012 = C35781mn.A01(r4);
        String string = C35781mn.A00(r3).getString(A012, new JSONObject().toString());
        if (string == null) {
            string = new JSONObject().toString();
        }
        C18070vi.A0b(string);
        JSONObject jSONObject = new JSONObject(string);
        jSONObject.put(String.valueOf(i), i2);
        String obj = jSONObject.toString();
        C18070vi.A0X(obj);
        C35781mn.A00(r3).edit().putString(A012, obj).apply();
        if (C18020vd.A05(C18040vf.A02, r5.A05, 12758)) {
            r5.A03(str, str2);
        } else {
            r5.A03((String) null, str2);
        }
    }

    public static final void A02(C35771mm r3, UserJid userJid, String str) {
        r3.A00.A0J(new C21459AkQ(r3, userJid, str, 37));
    }

    private final void A03(String str, String str2) {
        AnonymousClass00H r2 = this.A0A;
        C35781mn.A00((C35781mn) r2.get()).edit().putString("biz_opt_out_dhash", str).apply();
        if (str2 == null) {
            C35781mn.A00((C35781mn) r2.get()).edit().putLong("biz_opt_out_ts", AnonymousClass11P.A01(this.A03)).apply();
        }
    }

    public final void A04() {
        C178709Ed r0;
        if (C18020vd.A05(C18040vf.A02, this.A05, 12758)) {
            String A022 = ((C35781mn) this.A0A.get()).A02();
            C189929k5 r4 = (C189929k5) this.A09.get();
            C66312xy r3 = new C66312xy(this, A022);
            AnonymousClass00H r2 = r4.A01;
            String A0B2 = ((AnonymousClass1OZ) r2.get()).A0B();
            Log.i("bizOptOutHandler/sendSetOptOutListRequest");
            if (A022 != null) {
                r0 = new C178709Ed(A022, 1);
            } else {
                r0 = null;
            }
            AnonymousClass9F5 r1 = new AnonymousClass9F5(r0, A0B2);
            ((AnonymousClass1OZ) r2.get()).A0N(new C178889Ev(new C183969aC(r3, r4), r1), r1.BVP(), A0B2, 456, 20000);
        }
    }
}
