package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.Signature;
import java.util.Map;

/* renamed from: X.9uk  reason: invalid class name and case insensitive filesystem */
public abstract class C196279uk {
    public int A00;
    public int A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass10I A03;
    public final Integer A04;
    public final AnonymousClass181 A05;
    public final AnonymousClass1D9 A06;
    public final C220418j A07;
    public volatile boolean A08 = true;
    public volatile boolean A09 = false;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.io.File A02(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            X.118 r0 = r3.A02     // Catch:{ all -> 0x002a }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x002a }
            java.io.File r2 = X.AnonymousClass8BU.A0f(r0, r4)     // Catch:{ all -> 0x002a }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0028
            boolean r0 = r2.mkdirs()     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0028
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x002a }
            java.lang.String r0 = "SimpleAssetDownloader/getAssetDir/Could not make directory "
            r1.append(r0)     // Catch:{ all -> 0x002a }
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ all -> 0x002a }
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x002a }
            monitor-exit(r3)
            r0 = 0
            return r0
        L_0x0028:
            monitor-exit(r3)
            return r2
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196279uk.A02(java.lang.String):java.io.File");
    }

    public void A04(BCV bcv, Object obj, String str, Map map) {
        BCV bcv2 = bcv;
        if (!this.A09) {
            this.A09 = true;
            this.A08 = false;
            AnonymousClass3MW.A1T(new AnonymousClass9BO(this.A05, bcv2, this, this.A06, this.A07, this.A04, obj, str, map), this.A03, 0);
        } else if (bcv != null) {
            bcv.Bki();
        }
    }

    public void A03() {
        if (this instanceof C170648qR) {
            C170648qR r2 = (C170648qR) this;
            C19830z4 r3 = r2.A08;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("2.24.24.78");
            A10.append(C63572tK.A01(r2.A05.A02.A0l()).A03);
            A10.append(" ");
            C17880vN.A1E(C19830z4.A00(r3), "bloks_version", AnonymousClass000.A0y(r2.A09.A05(), A10));
        }
    }

    public boolean A05(File file) {
        int length;
        if (this instanceof C170628qP) {
            if (file != null) {
                length = (file.length() > 0 ? 1 : (file.length() == 0 ? 0 : -1));
            }
            return true;
        }
        if (!(file == null || file.list() == null)) {
            length = file.list().length;
        }
        return true;
        if (length == 0) {
            return true;
        }
        return false;
    }

    public String A06() {
        if (this instanceof C170628qP) {
            return C17880vN.A0r(((C170628qP) this).A02.A03(), "payments_error_map_tag");
        }
        if (this instanceof C170638qQ) {
            return C17900vP.A02(((C170638qQ) this).A04).getString("extensions_psl_cache_etag", (String) null);
        }
        return C17880vN.A0r(C17890vO.A0B(((C170648qR) this).A08), "bloks_local_tag");
    }

    public void A07(String str) {
        SharedPreferences.Editor putString;
        if (this instanceof C170628qP) {
            C17880vN.A1E(AnonymousClass8BU.A07(((C170628qP) this).A02), "payments_error_map_tag", str);
        } else if (this instanceof C170638qQ) {
            SharedPreferences.Editor A002 = C19830z4.A00(C17880vN.A0K(((C170638qQ) this).A04));
            if (str == null) {
                putString = A002.remove("extensions_psl_cache_etag");
            } else {
                putString = A002.putString("extensions_psl_cache_etag", str);
            }
            putString.apply();
        } else {
            C17880vN.A1E(C19830z4.A00(((C170648qR) this).A08), "bloks_local_tag", str);
        }
    }

    public boolean A08() {
        if (this instanceof C170628qP) {
            return !A05(A02("payments_error_map.json"));
        }
        if (this instanceof C170638qQ) {
            return AnonymousClass000.A1W(C17900vP.A02(((C170638qQ) this).A04).getString("extensions_psl_cache_etag", (String) null));
        }
        return ((C170648qR) this).A0C();
    }

    public boolean A09(InputStream inputStream, Object obj) {
        if (!(this instanceof C170638qQ)) {
            return ((C170648qR) this).A0E(inputStream);
        }
        C170638qQ r7 = (C170638qQ) this;
        String str = (String) obj;
        if (str == null) {
            return false;
        }
        byte[] A012 = C196989vy.A01(inputStream);
        Charset charset = C26571Sq.A05;
        String str2 = new String(A012, charset);
        AnonymousClass8BR.A0V(r7.A03).A05(r7.A00, "psl_payload_size", (long) str2.length());
        C20443ALg aLg = (C20443ALg) ((C192239o2) r7.A02.get()).A00.get();
        byte[] A1A = C18070vi.A1A(str2, charset);
        synchronized (aLg) {
            if (aLg.A06) {
                aLg.A00.put(str, A1A);
                ((C200710s) aLg.A04.getValue()).execute(new C146887Qz(aLg, A1A, str, 8));
            } else {
                C20443ALg.A00(aLg, new C21526AlZ(A1A, aLg, str, 1));
            }
        }
        return true;
    }

    public boolean A0A(String str, Map map, byte[] bArr) {
        if (this instanceof C170628qP) {
            return true;
        }
        if (this instanceof C170638qQ) {
            return ((C170638qQ) this).A0E(map, bArr, true);
        }
        C170648qR r4 = (C170648qR) this;
        try {
            if (!TextUtils.isEmpty(str)) {
                byte[] decode = Base64.decode(str, 0);
                Signature instance = Signature.getInstance("SHA256withRSA");
                instance.initVerify(AnonymousClass8BX.A0h(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxj0ym0SqSduZYfRk73qv\nj3WfGfzt76TUqcSDwDURn4Qlw4mMIgmI+WOGASQw8A97Q9SeohkZzL29HPuOPceV\n+pkmBl7LQ+BnyxvifXkohvzITpWFEwkDLlrf4lVSm7mizW8tYq1M+b65TRXFQZPO\nhdowDrdrAwR1K/T+1yppCL1zrE8YOBQf3/gFGrdKRWmGiaq+/5Zf9NKT0b5+FFBu\nP+rKp/t9aMITn9JBOI9OxP6lALyibqgf8Lbe91dT0NZOZKF1Ps5foLBsURVr40v+\nG08E8ovPO7k64OPSW8CUsmlPU0yesEiU99YLMac8oWJAwbjlV/g9SmqmkHLRcq7w\nrwIDAQAB\n", 0)));
                instance.update(bArr);
                if (instance.verify(decode)) {
                    return true;
                }
            }
        } catch (Exception e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("BloksAssetManager/verifySignature: ");
            A10.append(C170648qR.A01(r4));
            C17900vP.A0X(e, "Exception:", A10);
        }
        return false;
    }

    public C196279uk(AnonymousClass181 r2, AnonymousClass118 r3, AnonymousClass1D9 r4, C220418j r5, AnonymousClass10I r6, Integer num) {
        this.A02 = r3;
        this.A03 = r6;
        this.A05 = r2;
        this.A07 = r5;
        this.A06 = r4;
        this.A04 = num;
        this.A00 = 1;
        this.A01 = 1;
    }
}
