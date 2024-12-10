package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.9ys  reason: invalid class name and case insensitive filesystem */
public class C198769ys {
    public int A00;
    public int A01;
    public boolean A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C22565BDa A07;
    public final C62212r1 A08;
    public final AnonymousClass9N4 A09;
    public final C197899xS A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    /* JADX WARNING: type inference failed for: r0v27, types: [X.2r3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.9N4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v34, types: [X.2r3, java.lang.Object] */
    public C198769ys(String str) {
        JSONObject A16 = C17880vN.A16(str);
        this.A03 = A16.getInt("state");
        this.A04 = A16.getLong("end_ts");
        this.A0F = A16.getString("title");
        this.A0D = A16.getString("locale");
        this.A06 = A16.getLong("start_ts");
        this.A0E = A16.getString("terms_url");
        this.A05 = (long) A16.getInt("redeem_limit");
        this.A0B = A16.getString("description");
        this.A0C = A16.getString("fine_print_url");
        this.A02 = A16.getBoolean("interactive_sync_done");
        this.A00 = A16.getInt("kill_switch_info_viewed");
        this.A01 = A16.getInt("sender_maxed_info_viewed");
        this.A08 = new C62212r1(A16.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        ? obj = new Object();
        AnonymousClass1KJ r4 = AnonymousClass1KL.A0C;
        obj.A02 = r4;
        obj.A00();
        this.A07 = AnonymousClass8BU.A0I(C17880vN.A16(A16.getString("offer_amount")));
        String string = A16.getString("payment");
        ? obj2 = new Object();
        JSONObject A162 = C17880vN.A16(string);
        ? obj3 = new Object();
        obj3.A02 = r4;
        obj3.A00();
        obj2.A00 = AnonymousClass8BU.A0I(C17880vN.A16(A162.getString("min_amount")));
        this.A09 = obj2;
        this.A0A = new C197899xS(A16.getString("receiver"));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.2r3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.9N4, java.lang.Object] */
    public C198769ys(AnonymousClass1KI r7, C62212r1 r8, AnonymousClass9FN r9, String str) {
        int i;
        this.A08 = r8;
        this.A0D = str;
        this.A0F = r9.A0E;
        this.A04 = r9.A00;
        this.A0E = r9.A0D;
        this.A06 = r9.A02;
        this.A0B = r9.A09;
        this.A0C = r9.A0B;
        this.A05 = r9.A01;
        String str2 = r9.A0C;
        if (str2.equalsIgnoreCase("active")) {
            i = 0;
        } else if (str2.equalsIgnoreCase("inactive")) {
            i = 1;
        } else if (str2.equalsIgnoreCase("archived")) {
            i = 2;
        } else {
            throw AnonymousClass1UI.A01(AnonymousClass001.A1H("invalid state for offer: ", str2, AnonymousClass000.A10()));
        }
        this.A03 = i;
        AnonymousClass9DD r3 = r9.A07;
        ? obj = new Object();
        obj.A02 = r7.A01(r3.A02);
        obj.A01 = Long.parseLong(r3.A04);
        obj.A00 = Integer.parseInt(r3.A03);
        this.A07 = obj.A00();
        AnonymousClass9DN r0 = r9.A05;
        C17960vV.A07(r0);
        AnonymousClass9DD r5 = (AnonymousClass9DD) r0.A00;
        ? obj2 = new Object();
        AnonymousClass1KJ A012 = r7.A01(r5.A02);
        long parseLong = Long.parseLong(r5.A04);
        int parseInt = Integer.parseInt(r5.A03);
        parseInt = parseInt <= 0 ? 1 : parseInt;
        C17960vV.A07(A012);
        obj2.A00 = C196669vR.A00(A012, parseInt, parseLong);
        this.A09 = obj2;
        this.A0A = new C197899xS(r9.A0A, r9.A08);
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = false;
    }
}
