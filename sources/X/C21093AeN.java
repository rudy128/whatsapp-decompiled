package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.AeN  reason: case insensitive filesystem */
public final /* synthetic */ class C21093AeN implements B9W {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ C170018ny A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ Map A09;

    public final void BtO(Object obj) {
        C170018ny r1 = this.A02;
        Activity activity = this.A01;
        String str = this.A04;
        String str2 = this.A05;
        UserJid userJid = this.A03;
        String str3 = this.A06;
        String str4 = this.A07;
        long j = this.A00;
        C170018ny.A00(activity, r1, userJid, str, str2, str3, str4, this.A08, this.A09, j);
    }

    public /* synthetic */ C21093AeN(Activity activity, C170018ny r2, UserJid userJid, String str, String str2, String str3, String str4, String str5, Map map, long j) {
        this.A02 = r2;
        this.A01 = activity;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = userJid;
        this.A06 = str3;
        this.A07 = str4;
        this.A00 = j;
        this.A09 = map;
        this.A08 = str5;
    }
}
