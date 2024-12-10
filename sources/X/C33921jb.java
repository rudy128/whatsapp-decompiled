package X;

import com.whatsapp.util.Log;

/* renamed from: X.1jb  reason: invalid class name and case insensitive filesystem */
public class C33921jb {
    public final AnonymousClass00H A00;

    public void A00(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendmethods/sendSafetyNetVerifyAppsResult appsListSize=");
        sb.append("null");
        sb.append(" errorCode=");
        sb.append(i);
        sb.append(" errorMessage=");
        sb.append(str);
        Log.i(sb.toString());
        C29621ca r2 = new C29621ca("error", str, new AnonymousClass1MD[]{new AnonymousClass1MD("code", Integer.toString(i))});
        C29591cX r0 = new C29591cX("verify_apps");
        r0.A05(r2);
        C29621ca A03 = r0.A03();
        C29591cX r02 = new C29591cX("ib");
        r02.A05(A03);
        ((AnonymousClass1OZ) this.A00.get()).A0O(r02.A03(), 273);
    }

    public C33921jb(AnonymousClass00H r1) {
        this.A00 = r1;
    }
}
