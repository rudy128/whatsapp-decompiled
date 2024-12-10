package X;

import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9mL  reason: invalid class name and case insensitive filesystem */
public final class C191289mL {
    public C193669qT A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass118 A02;
    public final ReadWriteLock A03 = new ReentrantReadWriteLock();
    public final AnonymousClass11P A04;

    public final C193669qT A00() {
        String obj;
        C193669qT r0;
        C193669qT r6 = this.A00;
        if (r6 == null) {
            AnonymousClass118 r4 = this.A02;
            File A0e = C17880vN.A0e(AnonymousClass8BR.A0t(r4), "business_search");
            AnonymousClass8BV.A1H(A0e);
            if (!C17880vN.A0e(A0e, "business_search_popular_businesses").exists()) {
                obj = null;
            } else {
                ReadWriteLock readWriteLock = this.A03;
                readWriteLock.readLock().lock();
                File A0e2 = C17880vN.A0e(AnonymousClass8BR.A0t(r4), "business_search");
                AnonymousClass8BV.A1H(A0e2);
                BufferedReader A0V = AnonymousClass8BW.A0V(C17880vN.A0e(A0e2, "business_search_popular_businesses"));
                StringBuilder A10 = AnonymousClass000.A10();
                while (true) {
                    String readLine = A0V.readLine();
                    if (readLine == null) {
                        break;
                    }
                    A10.append(readLine);
                    A10.append("\n");
                }
                A0V.close();
                readWriteLock.readLock().unlock();
                obj = A10.toString();
            }
            r6 = null;
            if (obj != null) {
                try {
                    JSONObject A16 = C17880vN.A16(obj);
                    JSONArray optJSONArray = A16.optJSONArray("popular_businesses");
                    long optLong = A16.optLong("last_updated");
                    ArrayList A13 = AnonymousClass000.A13();
                    if (optJSONArray == null || optJSONArray.length() == 0 || optLong == 0) {
                        r0 = null;
                    } else {
                        int length = optJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = optJSONArray.getJSONObject(i);
                            String string = jSONObject.getString("jid");
                            String string2 = jSONObject.getString("verified_name");
                            C18070vi.A0b(string);
                            C18070vi.A0b(string2);
                            A13.add(new C193659qS(string, string2));
                        }
                        r0 = new C193669qT(A13, optLong);
                    }
                    r6 = r0;
                } catch (Exception e) {
                    Log.e("BusinessSearchPopularBusinessesManager/initialisePopularBizList/Failed!", e);
                    this.A01.A0G("BusinessSearchPopularBusinessesManager/initialisePopularBizList/Failed!", e.getMessage(), true);
                }
            }
            this.A00 = r6;
        }
        return r6;
    }

    public C191289mL(AnonymousClass190 r2, AnonymousClass11P r3, AnonymousClass118 r4) {
        C18070vi.A0o(r2, r4, r3);
        this.A01 = r2;
        this.A02 = r4;
        this.A04 = r3;
    }
}
